package atividade.turma_android.com.br.selecaoestado;

import android.content.Intent;
import android.support.annotation.MainThread;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class EstadoActivity extends AppCompatActivity
                                implements AdapterView.OnItemClickListener {
    private ListView listagem;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.estado_layout);

        listagem = (ListView) findViewById(R.id.listaEstados);

        listagem.setChoiceMode(ListView.CHOICE_MODE_SINGLE);

        String[] estados = getResources().getStringArray(R.array.estado);

        ArrayAdapter adaptador = new ArrayAdapter(this, android.R.layout.simple_list_item_checked, estados);

        listagem.setAdapter(adaptador);

        listagem.setOnItemClickListener(this);

        Intent it = getIntent();

        String titulo = it.getStringExtra("tituloButton");

        int posicao = getPosicao(titulo, estados);

        if(posicao != -1) {
            listagem.setItemChecked(posicao, true);
        }
    }

    private int getPosicao(String string, String[] array) {
        for(int i=0; i<array.length; i++) {
            if(array[i].equals(string)) {
                return i;
            }
        }

        return -1;
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
