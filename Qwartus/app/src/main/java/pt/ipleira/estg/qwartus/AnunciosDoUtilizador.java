package pt.ipleira.estg.qwartus;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;

import pt.ipleira.estg.qwartus.adapter.ListAdapter;
import pt.ipleira.estg.qwartus.models.QwartusDataTest;


public class AnunciosDoUtilizador extends AppCompatActivity {

    private ListView listViewResultados ;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_anuncios_do_utilizador);

        listViewResultados = (ListView) findViewById(R.id.lvAnunciosUser);
        listViewResultados.setAdapter(new ListAdapter(QwartusDataTest.getAnuncios(),this));

        listViewResultados.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {

                Intent i = new Intent("android.intent.qwartus.ANUNCIOSUSER");
                startActivity(i);
            }
        });
    }
}
