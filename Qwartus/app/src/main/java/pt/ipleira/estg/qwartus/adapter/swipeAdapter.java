package pt.ipleira.estg.qwartus.adapter;

import android.content.Context;
import android.support.v4.view.PagerAdapter;
import android.support.v4.view.ViewPager;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;

import pt.ipleira.estg.qwartus.R;

/**
 * Created by roudr on 09/12/2016.
 */

public class swipeAdapter extends PagerAdapter {


    /*Recusos de imagem a substituir*/
    private  int[] imagens = {R.drawable.suite0,R.drawable.suite1,R.drawable.suite2,R.drawable.suite3};

    private Context context;
    private LayoutInflater layoutInflater;

    public  swipeAdapter (Context context)
    {
        this.context=context;
    }


    @Override
    public int getCount() {
        return imagens.length;
    }

    @Override
    public boolean isViewFromObject(View view, Object object) {


        return view==((ImageView)object);
    }

    @Override
    public Object instantiateItem(ViewGroup container, int position) {

        if (layoutInflater == null) {

            layoutInflater = (LayoutInflater) context.getSystemService(context.LAYOUT_INFLATER_SERVICE);
        }

        ImageView imgVItem = new ImageView(context);
        imgVItem.setScaleType(ImageView.ScaleType.CENTER_CROP);
        imgVItem.setImageResource(imagens[position]);
        ((ViewPager)container).addView(imgVItem,0);

        return imgVItem;
    }

    @Override
    public void destroyItem(ViewGroup container, int position, Object object) {

        ((ViewPager)container).removeView((ImageView)object);
    }
}
