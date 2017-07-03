package atividade.turma_android.com.br.selecaoestado;

import android.app.SearchManager;
import android.content.ComponentName;
import android.content.Intent;
import android.net.Uri;
import android.provider.Settings;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    public static final String ESTADO_SELECIONADO = "estado_selecionado";
    private final int REQUISICAO_ESTADO = 1;
    private Button buttonEstado;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main_layout);

        buttonEstado = (Button) findViewById(R.id.button1);
    }

    public void invocarAtividadeEstados(View view) {
        Intent it = new Intent(this, EstadoActivity.class);
        it.putExtra("tituloButton", buttonEstado.getText());

        startActivityForResult(it, REQUISICAO_ESTADO);
    }

    @Override
    protected void onActivityResult(int requestCode, int resultCode, Intent data) {
        super.onActivityResult(requestCode, resultCode, data);

        if(REQUISICAO_ESTADO == requestCode && resultCode == RESULT_OK) {

            String estado = data.getStringExtra(ESTADO_SELECIONADO);

            Toast.makeText(this, estado, Toast.LENGTH_SHORT).show();

            buttonEstado.setText(estado);
        }
    }

    public void invocarAtividadeAlunos(View view) {
        Intent it = new Intent(this, AlunoActivity.class);
        startActivity(it);
    }

    public void invocarAtividadeMensagem(View v) {
        Intent it = new Intent("MOSTRAR_ATIVIDADE_MENSAGEM");
        startActivity(Intent.createChooser(it, "Selecione"));
    }

    //---------------------------------
    public void navegarInternet(View v) {
        Uri uri = Uri.parse("http://www.google.com");
        Intent it = new Intent(Intent.ACTION_VIEW, uri);
        enviar(it);
    }

    public void apenasDiscar(View v) {
        Uri uri = Uri.parse("tel:123456789");
        Intent it = new Intent(Intent.ACTION_DIAL, uri);
        enviar(it);
    }

    public void localizacao(View v) {
        Uri uri = Uri.parse("geo:-15.7752496,-48.3581231");
        Intent it = new Intent(Intent.ACTION_VIEW, uri);
        enviar(it);
    }

    public void enviarSMS(View v) {
        Uri uri = Uri.parse("sms:123456789");
        Intent it = new Intent(Intent.ACTION_VIEW, uri);
        it.putExtra("sms_body", "Mensagem");
        enviar(it);
    }

    public void buscarNaInternet(View v) {
        Intent it = new Intent(Intent.ACTION_SEARCH);
        it.putExtra(SearchManager.QUERY, "Android");
        enviar(it);
    }

    public void abrirConfiguracoes(View v) {
        Intent it = new Intent(Settings.ACTION_SETTINGS);
        enviar(it);
    }

    private void enviar(Intent i) {
        ComponentName componentName = i.resolveActivity(getPackageManager());

        if(componentName != null) {
            startActivity(i);
        } else {
            Toast.makeText(this, R.string.erro_enviar_intent, Toast.LENGTH_SHORT);
        }
    }
}
