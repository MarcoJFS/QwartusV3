package pt.ipleira.estg.qwartus;

import android.database.DataSetObserver;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;

import java.util.List;

import pt.ipleira.estg.qwartus.adapter.ListAdapter;
import pt.ipleira.estg.qwartus.models.Anuncio;
import pt.ipleira.estg.qwartus.models.QwartusDataTest;

public class ResultadoPesquisa extends AppCompatActivity {

    private ListView listViewResultados ;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_resultado_pesquisa);

        listViewResultados = (ListView) findViewById(R.id.listView);
        listViewResultados.setAdapter(new ListAdapter(QwartusDataTest.getAnuncios(),this));

    }
}
