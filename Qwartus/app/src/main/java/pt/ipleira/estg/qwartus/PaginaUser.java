package pt.ipleira.estg.qwartus;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import com.google.gson.JsonArray;
import com.google.gson.JsonObject;
import com.koushikdutta.async.future.FutureCallback;
import com.koushikdutta.ion.Ion;
import com.koushikdutta.ion.Response;

public class PaginaUser extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pagina_user);

        final TextView tvNome = (TextView) findViewById(R.id.tvNome);
        final TextView tvApelido = (TextView) findViewById(R.id.tvApelido);
        final TextView tvContato = (TextView) findViewById(R.id.tvContato);
        final TextView tvEmail = (TextView) findViewById(R.id.tvEmail);
        final TextView tvNumAnun = (TextView) findViewById(R.id.tvNumAnun);

        Ion.with(getApplicationContext())
                .load("GET", DataBaseManager.URL_Dominio + "/anuncio")
                .setTimeout(10000)
                .addHeader("Accept", "application/json")
                .addHeader("Content-type", "application/json")
                .asJsonArray()
                .setCallback(new FutureCallback<JsonArray>() {
                    @Override
                    public void onCompleted(Exception e, JsonArray result) {
                        int resultCount = result.size();
                        //JsonObject jObj = result.get(9).getAsJsonObject();
                        //String jStr = jObj.get("ce_id_user").toString();

                        for (int i=0; i< resultCount; i++){
                            //tvNome.setText(result.get(i).getAsJsonObject().get("ce_id_user").getAsString());
                            //int numToView = result.get(i).getAsJsonObject().get("ce_id_user").getAsInt();
                            //JsonObject jObj = result.get(1).getAsJsonObject();


                            JsonObject jObj = result.get(i).getAsJsonObject();
                            String jStr = jObj.get("ce_id_user").toString();
                            if (jStr != null){
                                int jInt = Integer.parseInt(jStr);

                                if(jInt == LoginClassSave.Account.id){
                                    LoginClassSave.numAnun = LoginClassSave.numAnun + 1;
                                }
                            }
                            //long jLon = Long.parseLong(jStr);

                        }
                    }
                });
                /*.withResponse()
                .setCallback(new FutureCallback<Response<JsonArray>>() {
                    @Override
                    public void onCompleted(Exception e, Response<JsonArray> result) {
                        int resultCount = result.size();
                        for(int i=0; i<= resultCount; i++) {

                            if(result.getResult().get("ce_id_user") = LoginClassSave.Account.id){

                            }
                        }
                    }
                });*/
                /*.withResponse()
                .setCallback(new FutureCallback<Response<JsonObject>>() {
                    @Override
                    public void onCompleted(Exception e, Response<JsonObject> result) {

                    }
                });*/

        Ion.with(getApplicationContext())
                .load("GET", DataBaseManager.URL_Dominio + "/user/" + LoginClassSave.Account.id)
                .setTimeout(10000)
                .addHeader("Accept", "application/json")
                .addHeader("Content-type", "application/json")
                .addHeader("ACCESS-TOKEN", LoginClassSave.token)
                .asJsonObject()
                .withResponse()
                .setCallback(new FutureCallback<Response<JsonObject>>() {
                    @Override
                    public void onCompleted(Exception e, Response<JsonObject> result) {
                        //tvNome = result.getResult().get("primeiro_nome").getAsString();
                        tvNome.setText(result.getResult().get("primeiro_nome").toString());
                        tvApelido.setText(result.getResult().get("ultimo_nome").toString());
                        tvContato.setText(result.getResult().get("contacto").toString());
                        tvEmail.setText(result.getResult().get("email").toString());
                        //tvNumAnun.setText(LoginClassSave.numAnun);
                        String strI = Integer.toString(LoginClassSave.numAnun);
                        tvNumAnun.setText(strI.toString());

                    }
                });

        Button btnAnuncios = (Button) findViewById(R.id.btnAnuncios);
        btnAnuncios.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent("android.intent.qwartus.ANUNCIOSUSER");
                startActivity(i);
            }
        });

        Button btnNovoAnuncio = (Button) findViewById(R.id.btnNovoAnuncio);
        btnNovoAnuncio.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent("android.intent.qwartus.NOVOANUNCIO");
                startActivity(i);
            }
        });


    }
}
