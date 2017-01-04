package pt.ipleira.estg.qwartus.models;

import com.google.gson.JsonObject;

import java.util.ArrayList;
import java.util.List;

import static pt.ipleira.estg.qwartus.ac_Qwartus.nuncisrecebido;


/**
 * Created by roudr on 06/12/2016.
 */

public class QwartusDataTest {
    private static List<Anuncio> anuncios;

    public static List<Anuncio> getAnuncios() {

        anuncios = new ArrayList<>();

        if (anuncios == null) {
            //JsonArray[] res = new JsonArray[0];
            //for (JsonArray nuncisrecebido : res) {

            int asd = nuncisrecebido.size();
            for (int i=0;i<asd;i++){
                JsonObject jObj = nuncisrecebido.get(i).getAsJsonObject();
                Long jid_anuncio = jObj.get("id_anuncio").getAsLong();
                int jce_id_user = jObj.get("ce_id_user").getAsInt();
                String jtitulo = jObj.get("asunto").toString();
                int jnpessoas = jObj.get("n_pessoas").getAsInt();
                Float jPeco = jObj.get("preco").getAsFloat();
                String jDescricao = jObj.get("descricao").toString();
                String jcoordenadas = jObj.get("coordenadas").toString();
                String jimagem0 = jObj.get("imagem0").toString();
                String jimagem1 = jObj.get("imagem1").toString();
                String jimagem2 = jObj.get("imagem2").toString();
                String jimagem3 = jObj.get("imagem3").toString();
                String jstatus = jObj.get("status").toString();
                int jid_distrito = jObj.get("id_distrito").getAsInt();
                int jid_concelho = jObj.get("id_concelho").getAsInt();

                anuncios.add(new Anuncio(jid_anuncio, jce_id_user, jtitulo, jnpessoas, jPeco, jDescricao, jcoordenadas, jimagem0, jimagem1, jimagem2,jimagem3, jstatus, jid_distrito, jid_concelho));
            }


        }
        //float f = (float) 12;
        //anuncios.add(new Anuncio(1, 1, "asd", 2, f, "asd", "adsadsada", "asd", "ads", "asd","asd", "asd", 1, 1));

        return anuncios;
    /*public static Integer [] getAllImg(){
        Integer imgs[] = new Integer[getAnuncios().size()];

        int i=0;
        for (Anuncio anuncio : getAnuncios()){
            imgs[i++] = anuncio.getImagem();
        }
        return imgs;
    }*/


    }
}
