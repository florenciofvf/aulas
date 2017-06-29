package atividade.turma_android.com.br.selecaoestado;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    public static final String ESTADO_SELECIONADO = "estado_selecionado";
    private final int REQUISICAO_ESTADO = 1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main_layout);
    }

    public void invocarAtividadeEstados(View view) {
        Intent it = new Intent(this, EstadoActivity.class);

        startActivityForResult(it, REQUISICAO_ESTADO);
    }

    public void invocarAtividadeAlunos(View view) {
        Intent it = new Intent(this, AlunoActivity.class);

        startActivity(it);
    }


    @Override
    protected void onActivityResult(int requestCode, int resultCode, Intent data) {
        super.onActivityResult(requestCode, resultCode, data);

        if(REQUISICAO_ESTADO == requestCode && resultCode == RESULT_OK) {
            String estado = data.getStringExtra(ESTADO_SELECIONADO);

            Toast.makeText(this, estado, Toast.LENGTH_SHORT).show();
        }
    }
}
