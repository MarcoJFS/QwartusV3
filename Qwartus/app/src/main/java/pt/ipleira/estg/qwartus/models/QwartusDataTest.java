package pt.ipleira.estg.qwartus.models;

import android.content.Context;

import java.util.ArrayList;
import java.util.List;


/**
 * Created by roudr on 06/12/2016.
 */

public class QwartusDataTest {
    private static List<Anuncio> anuncios;
    private static Context context;

    //private Context context;

    public QwartusDataTest(Context context) {
        // getAnuncios() = context;
        this.context = context;
    }

    public static List<Anuncio> getAnuncios(){

        anuncios = new ArrayList<>();

            /*Ion.with(context)
                .load("GET", DataBaseManager.URL_Dominio + "/anuncio")
                .setTimeout(10000)
                .addHeader("Accept", "application/json")
                .addHeader("Content-type", "application/json")
                .asJsonArray()
                .setCallback(new FutureCallback<JsonArray>() {
                    @Override
                    public void onCompleted(Exception e, JsonArray result) {*/
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
                        /*anuncios.add(new Anuncio("Titulo 1","Descricao 1","150€", R.drawable.qwartus2));
                    }
                });*/


        /*anuncios = new ArrayList<>();
        String jStrAssunto = "Titulo 1";
        String jStrdescricao = "Descricao 1";
        String jStrpreco = "150€";
        anuncios.add(new Anuncio(jStrAssunto,jStrdescricao,jStrpreco, R.drawable.qwartus2));*/
        //anuncios.add(new Anuncio("Titulo 1","Descricao 1","150€", R.drawable.qwartus2));
        /*if (anuncios == null){
            anuncios = new ArrayList<>();

            anuncios.add(new Anuncio("Titulo 1","Descricao 1","150€", R.drawable.qwartus2));
            anuncios.add(new Anuncio("Titulo 1","Descricao 1","190€", R.drawable.qwartus2));
            anuncios.add(new Anuncio("Titulo 1","Descricao 1","155€", R.drawable.qwartus2));
            anuncios.add(new Anuncio("Titulo 1","Descricao 1","160€", R.drawable.qwartus2));
            anuncios.add(new Anuncio("Titulo 1","Descricao 1","180€", R.drawable.qwartus2));
        }*/
        return anuncios;
    }

    /*public static Integer [] getAllImg(){
        Integer imgs[] = new Integer[getAnuncios().size()];

        int i=0;
        for (Anuncio anuncio : getAnuncios()){
            imgs[i++] = anuncio.getImagem();
        }
        return imgs;
    }*/




}
