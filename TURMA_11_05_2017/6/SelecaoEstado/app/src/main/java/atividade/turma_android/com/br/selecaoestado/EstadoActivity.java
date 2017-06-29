package atividade.turma_android.com.br.selecaoestado;

import android.content.Intent;
import android.support.annotation.MainThread;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;

public class EstadoActivity extends AppCompatActivity implements AdapterView.OnItemClickListener {
    private ListView listagem;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.estado_layout);

        listagem = (ListView) findViewById(R.id.listaEstados);

        listagem.setOnItemClickListener(this);
    }

    @Override
    public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
        Object item = listagem.getAdapter().getItem(i);

        Intent it = new Intent();
        it.putExtra(MainActivity.ESTADO_SELECIONADO, item.toString());

        setResult(RESULT_OK, it);

        finish();
    }
}
