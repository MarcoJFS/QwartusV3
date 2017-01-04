package pt.ipleira.estg.qwartus;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import com.google.gson.JsonObject;
import com.koushikdutta.async.future.FutureCallback;
import com.koushikdutta.ion.Ion;
import com.koushikdutta.ion.Response;

public class UserMudar extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_user_mudar);

        final int duration = Toast.LENGTH_SHORT;
        final Context context = getApplicationContext();

        final EditText etprimeiro_nome = ((EditText) findViewById(R.id.etprimeiro_nome));
        final EditText etultimo_nome = ((EditText) findViewById(R.id.etultimo_nome));
        final EditText etcontacto = ((EditText) findViewById(R.id.etcontacto));

        Button btnAlterar = (Button) findViewById(R.id.btnAlterar);
        btnAlterar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                JsonObject json = new JsonObject();
                json.addProperty("primeiro_nome", etprimeiro_nome.getText().toString());
                json.addProperty("ultimo_nome", etultimo_nome.getText().toString());
                json.addProperty("contacto", etcontacto.getText().toString());


                Ion.with(getApplicationContext())
                        .load("PUT", DataBaseManager.URL_Dominio + "/user/" + LoginClassSave.Account.id)
                        .setTimeout(10000)
                        .addHeader("Accept", "application/json")
                        .addHeader("Content-type", "application/json")
                        .addHeader("ACCESS-TOKEN", LoginClassSave.token)
                        //.setBodyParameter("asunto", "testeteste")
                        //.setBodyParameter("preco", "12")
                        //.setBodyParameter("descricao", "testeteste")
                        .setJsonObjectBody(json)
                        .asJsonObject()
                        .withResponse()
                        .setCallback(new FutureCallback<Response<JsonObject>>() {
                            @Override
                            public void onCompleted(Exception e, Response<JsonObject> result) {
                                Toast toast = Toast.makeText(context, "Edição mudada com sucesso", duration);
                                toast.show();

                                Intent i = new Intent("android.intent.qwartus.PAGINAUSER");
                                startActivity(i);
                            }
                        });
            }
        });
    }
}
