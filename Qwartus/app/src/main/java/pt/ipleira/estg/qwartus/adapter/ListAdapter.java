package pt.ipleira.estg.qwartus.adapter;

import android.content.Context;
import android.content.res.Resources;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.List;

import pt.ipleira.estg.qwartus.R;
import pt.ipleira.estg.qwartus.models.Anuncio;
import pt.ipleira.estg.qwartus.models.QwartusDataTest;

public class ListAdapter extends BaseAdapter {

    private List<Anuncio> anuncios;
    private Context context;


    public ListAdapter(List<Anuncio> anuncios, Context context) {
        this.anuncios = anuncios;
        this.context = context;
    }

    @Override
    public int getCount() {
        return (anuncios != null ? anuncios.size() : 0);
    }

    @Override
    public Object getItem(int position) {
        return anuncios.get(position);
    }

    @Override
    public long getItemId(int position) {
        return position;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {

        Anuncio anu = anuncios.get(position);

        LayoutInflater inflater = (LayoutInflater) context.getSystemService(context.LAYOUT_INFLATER_SERVICE);

        ((TextView) convertView.findViewById(R.id.txtvTituloLV)).setText(anu.getTitulo());
        ((TextView) convertView.findViewById(R.id.txtvDescricaoLV)).setText(anu.getDescricao());
        ((TextView) convertView.findViewById(R.id.txtPreçoLV)).setText(anu.getPreco());
        ((ImageView) convertView.findViewById(R.id.imgv_ImgAnuncioLV)).setImageResource(QwartusDataTest.getAllImg()[position]);

        return convertView;
    }

}





