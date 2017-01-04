package pt.ipleira.estg.qwartus;

import android.content.Context;

import com.google.gson.JsonArray;
import com.koushikdutta.async.future.FutureCallback;
import com.koushikdutta.ion.Ion;

import java.util.List;

import pt.ipleira.estg.qwartus.models.Anuncio;

/**
 * Created by USER on 29/12/2016.
 */

public class DataBaseManager {
    public static String URL_Dominio = "http://www.qwartus.tk/api/web/v1";
    private static Context context;
    private static List<Anuncio> anuncios;

    public static void setContext(Context context) {
        DataBaseManager.context = context;
    }

    public List<Anuncio> getQwartusDataTest(){
        Ion.with(context)
                .load("GET", DataBaseManager.URL_Dominio + "/anuncio")
                .setTimeout(10000)
                .addHeader("Accept", "application/json")
                .addHeader("Content-type", "application/json")
                .asJsonArray()
                .setCallback(new FutureCallback<JsonArray>() {
                    @Override
                    public void onCompleted(Exception e, JsonArray result) {
                        /*int resultCount = result.size();
                        anuncios = new ArrayList<>();
                        //JsonObject jObj = result.get(9).getAsJsonObject();
                        //String jStr = jObj.get("ce_id_user").toString();

                        for (int i=0; i< resultCount; i++){
                            JsonObject jObj = result.get(i).getAsJsonObject();
                            String jStr = jObj.get("ce_id_user").toString();

                            //String jStrAssunto = jObj.get("asunto").toString();
                            //String jStrdescricao = jObj.get("descricao").toString();
                            //String jStrpreco = jObj.get("preco").toString();

                            String jStrAssunto = "Titulo 1";
                            String jStrdescricao = "Descricao 1";
                            String jStrpreco = "150€";
                            int jInt = Integer.parseInt(jStr);
                            if(jInt == LoginClassSave.Account.id){
                                anuncios.add(new Anuncio(jStrAssunto,jStrdescricao,jStrpreco, R.drawable.qwartus2));
                            }
                        }*/
                        //anuncios.add(new Anuncio(1,"Titulo 1","Descricao 1","150€", R.drawable.qwartus2));
                    }
                });

        return anuncios;
    }
}
