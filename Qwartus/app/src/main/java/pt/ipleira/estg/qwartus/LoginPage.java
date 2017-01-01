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

import org.json.JSONException;
import org.json.JSONObject;


public class LoginPage extends AppCompatActivity {

    LoginClassSave LoginClassSave;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login_page);

        Button btnNotMember = (Button) findViewById(R.id.btnNotMember);
        btnNotMember.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent("android.intent.qwartus.REGISTERPAGE");
                startActivity(i);
            }
        });

        //final Context ctxToast = getApplicationContext();
        //final CharSequence txtToast = "Log in com Sucesso";
        final int duration = Toast.LENGTH_SHORT;
        final Context context = getApplicationContext();

        /*FloatingActionButton FloatingButtonPlus = (FloatingActionButton) findViewById(R.id.FloatingButtonPlus);
        FloatingButtonPlus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent("android.intent.qwartus.REGISTERPAGE");
                startActivity(i);
            }
        });*/

        final String Username = ((EditText) findViewById(R.id.etUserName)).getText().toString();
        final String Password = ((EditText) findViewById(R.id.etPassword)).getText().toString();

        //final String Username = "teste";
        //final String Password = "testeteste";

        final JsonObject json = new JsonObject();
        json.addProperty("username", Username);
        json.addProperty("password", Password);

        //final EditText Username = (EditText) findViewById(R.id.etUserName);
       // EditText Password = (EditText) findViewById(R.id.etPassword);

        Button btnLogin = (Button) findViewById(R.id.btnLogin);
        btnLogin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {


                final EditText Username = ((EditText) findViewById(R.id.etUserName));
                final EditText Password = ((EditText) findViewById(R.id.etPassword));

                //final String Username = "teste";
                //final String Password = "testeteste";

                final JsonObject json = new JsonObject();
                json.addProperty("username", Username.getText().toString());
                json.addProperty("password", Password.getText().toString());

                Ion.with(getApplicationContext())
                //Ion.with(LoginPage.this)
                        //.load("POST", "http://localhost/ProjWeb/api/web/v1/user/authenticate")
                        .load("POST", DataBaseManager.URL_Dominio + "/user/authenticate")

                        .setTimeout(10000)
                        .addHeader("Accept", "application/json")
                        .addHeader("Content-type", "application/json")
                        //.addHeader("WWW-Authenticate", "Basic realm=\"myRealm\"")
                        //.addHeader("dispositivo", "Android")
                        //.addHeader("username", Username.getText().toString())
                        //.addHeader("password", Password.getText().toString())
                        //.addHeader("username", "teste")
                        //.addHeader("password", "testeteste")
                        //.load("http://localhost/ProjWeb/api/web/v1/user/authenticate")
                        //.setBodyParameter("username", "teste")
                        //.setBodyParameter("password", "testeteste")
                        .setJsonObjectBody(json)
                        .asJsonObject()
                        .withResponse()
                        .setCallback(new FutureCallback<Response<JsonObject>>() {
                            @Override
                            public void onCompleted(Exception e, Response<JsonObject> result) {
                                //Username.setText(result.getHeaders().code());
                                //Username.setText(e.getMessage());

                                //System.out.println(e.getMessage());
                                //System.out.println(result.getResult());
                                //System.out.println(result.getHeaders().code());

                                if (e != null){
                                    Toast toast = Toast.makeText(context, "ERRO: Falha na Ligação com o servidor", duration);
                                    toast.show();
                                } else {
                                    if (result.getHeaders().code() != 200) {
                                        Toast toast = Toast.makeText(context, "ERRO: Falha na autentificação", duration);
                                        toast.show();
                                    } else{

                                        Toast toast = Toast.makeText(context, "Login efectuado com sucesso", duration);
                                        toast.show();

                                        //classSave = JsonDeserializationContext.
                                        LoginClassSave.token = result.getResult().get("token").getAsString();
                                        LoginClassSave.account.id = result.getResult().getAsJsonObject("account").get("id").getAsLong();
                                        LoginClassSave.account.username = result.getResult().getAsJsonObject("account").get("username").getAsString();
                                        LoginClassSave.account.email = result.getResult().getAsJsonObject("account").get("email").getAsString();
                                        LoginClassSave.login = true;

                                        Intent i = new Intent("android.intent.qwartus.NOVOANUNCIO");
                                        startActivity(i);

                                        finish();
                                    }
                                }
                            }
                        });
                        /*.setCallback(new FutureCallback<JsonObject>() {
                            @Override
                            public void onCompleted(Exception e, JsonObject result) {
                                //if (e != null){
                                    //Intent i = new Intent("android.intent.qwartus.REGISTERPAGE");
                                    //startActivity(i);
                                //} else {
                                    //Intent i = new Intent("android.intent.qwartus.RESULTADOPESQUISA");
                                    //startActivity(i);
                                //}
                                //Log.d("TagE", String.valueOf(Float.parseFloat(e.toString())));
                                //Log.d("TagResult", String.valueOf(Float.parseFloat(result.toString())));

                                //Username.setText(Username.getText().toString()+e.toString());
                                //Password.setText(Password.getText().toString()+result.toString());
                                //Username.setText(result.getAsInt());
                                Username.setText(String.valueOf(result));

                                //Intent i = new Intent("android.intent.qwartus.REGISTERPAGE");
                                //startActivity(i);
                            }
                        });*/
                        /*.setCallback(new FutureCallback<JsonObject>() {
                            @Override
                            public void onCompleted(Exception e, JsonObject result) {

                                try {
                                    JsonObject json = result;    // Converts the string "result" to a JSONObject
                                    JsonObject json_result = json.getAsJsonObject("result"); // Get the string "result" inside the Json-object
                                    if (json_result.equals("ok")){ // Checks if the "result"-string is equals to "ok"
                                        // Result is "OK"
                                        Intent i = new Intent("android.intent.qwartus.REGISTERPAGE");
                                        startActivity(i);
                                        //int customer_id = json.getInt("customer_id"); // Get the int customer_id
                                        //String customer_email = json.getString("customer_email"); // I don't need to explain this one, right?
                                    } else {
                                        // Result is NOT "OK"
                                        Intent i = new Intent("android.intent.qwartus.REGISTERPAGE");
                                        startActivity(i);
                                        //String error = json.getString("error");
                                        //Toast.makeText(getApplicationContect(), error, Toast.LENGTH_LONG).show(); // This will show the user what went wrong with a toast
                                        //Intent to_main = new Intent(getApplicationContext(), MainActivity.class); // New intent to MainActivity
                                        //startActivity(to_main); // Starts MainActivity
                                        finish(); // Add this to prevent the user to go back to this activity when pressing the back button after we've opened MainActivity
                                    }
                                } catch (Exception e9){
                                    // This method will run if something goes wrong with the json, like a typo to the json-key or a broken JSON.
                                    e9.printStackTrace();
                                    Intent ia = new Intent("android.intent.qwartus.RESULTADOPESQUISA");
                                    startActivity(ia);

                                }
                            }
                        });*/

            }
        });
    }
}


