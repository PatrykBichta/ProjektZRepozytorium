package com.example.aplikacjadwieaktywnosci;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.GridView;
import android.widget.ImageView;

public class ImageAdapter extends BaseAdapter {

    private Context mContext;

    private int Zdj[] = {R.drawable.pic1,R.drawable.pic2,R.drawable.pic3,R.drawable.pic4,
            R.drawable.pic5,R.drawable.pic6,R.drawable.pic7,R.drawable.pic8};


    ImageAdapter (Context c){
        mContext = c;
    }




    @Override
    public int getCount() {
        return Zdj.length;
    }

    @Override
    public Object getItem(int i) {
        return null;
    }

    @Override
    public long getItemId(int i) {
        return 0;
    }

    @Override
    public View getView(int i, View view, ViewGroup viewGroup) {

        ImageView foto;
        if (view== null){          //inicjalizacja
            foto = new ImageView(mContext);
            foto.setLayoutParams(new ViewGroup.LayoutParams(100,100));
            foto.setScaleType(ImageView.ScaleType.CENTER_CROP);
            foto.setPadding(8,8,8,8);

        }
        else
            foto = (ImageView)view;

        foto.setImageResource(Zdj[i]);
        return foto;












    }
}