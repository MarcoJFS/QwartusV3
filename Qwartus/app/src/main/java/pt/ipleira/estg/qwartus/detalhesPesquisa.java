package pt.ipleira.estg.qwartus;

import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import pt.ipleira.estg.qwartus.adapter.swipeAdapter;

public class detalhesPesquisa extends AppCompatActivity {

    ViewPager viewPager;
    swipeAdapter adapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detalhes_pesquisa);

        viewPager = (ViewPager) findViewById(R.id.view_pager);
        adapter = new swipeAdapter(this);
        viewPager.setAdapter(adapter);
    }
}
