package pt.ipleira.estg.qwartus;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
<<<<<<< HEAD
import android.widget.EditText;
import android.widget.Toast;

import com.google.gson.JsonArray;
import com.google.gson.JsonObject;
import com.koushikdutta.async.future.FutureCallback;
import com.koushikdutta.ion.Ion;

import org.json.JSONException;
import org.json.JSONObject;
=======
>>>>>>> origin/master


public class LoginPage extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login_page);

        Button btnNotMember = (Button) findViewById(R.id.btnNotMenber);
        btnNotMember.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent("android.intent.qwartus.REGISTERPAGE");
                startActivity(i);
            }
        });

<<<<<<< HEAD
        /*FloatingActionButton FloatingButtonPlus = (FloatingActionButton) findViewById(R.id.FloatingButtonPlus);
        FloatingButtonPlus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent("android.intent.qwartus.REGISTERPAGE");
                startActivity(i);
            }
        });*/

        final Context ctxToast = getApplicationContext();
        final CharSequence txtToast = "Log in com Sucesso";
        final int dToast = Toast.LENGTH_SHORT;

        final EditText Username = (EditText) findViewById(R.id.etUserName);
        EditText Password = (EditText) findViewById(R.id.etPassword);
=======
        Button btnLogin = (Button) findViewById(R.id.btnLogin);
        btnLogin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

            }
        });
>>>>>>> origin/master
    }
}


