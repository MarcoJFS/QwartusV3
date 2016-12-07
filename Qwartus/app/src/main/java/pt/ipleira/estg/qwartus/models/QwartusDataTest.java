package pt.ipleira.estg.qwartus.models;

import java.util.ArrayList;
import java.util.List;

import pt.ipleira.estg.qwartus.R;

/**
 * Created by roudr on 06/12/2016.
 */

public class QwartusDataTest {
    private static List<Anuncio> anuncios;

    public static List<Anuncio> getAnuncios(){

        if (anuncios == null){
            anuncios = new ArrayList<>();

            anuncios.add(new Anuncio("Titulo 1","Descricao 1","150€", R.drawable.qwartus2));
            anuncios.add(new Anuncio("Titulo 1","Descricao 1","190€", R.drawable.qwartus2));
            anuncios.add(new Anuncio("Titulo 1","Descricao 1","155€", R.drawable.qwartus2));
            anuncios.add(new Anuncio("Titulo 1","Descricao 1","160€", R.drawable.qwartus2));
            anuncios.add(new Anuncio("Titulo 1","Descricao 1","180€", R.drawable.qwartus2));
        }
        return anuncios;
    }

    public  static Integer [] getAllImg(){
        Integer imgs[] = new Integer[getAnuncios().size()];

        int i=0;
        for (Anuncio anuncio : getAnuncios()){
            imgs[i++] = anuncio.getImagem();
        }
        return imgs;
    }
}
