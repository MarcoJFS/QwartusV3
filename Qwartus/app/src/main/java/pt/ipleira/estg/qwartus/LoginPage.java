package pt.ipleira.estg.qwartus;

import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.v7.app.AppCompatActivity;
import android.view.View;


public class LoginPage extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login_page);

        FloatingActionButton FloatingButtonPlus = (FloatingActionButton) findViewById(R.id.FloatingButtonPlus);
        FloatingButtonPlus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent("android.intent.qwartus.REGISTERPAGE");
                startActivity(i);
            }
        });

    }
}
