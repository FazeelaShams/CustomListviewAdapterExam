package com.gnirt69.customlistviewadapterexam;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.provider.ContactsContract;
import android.support.v4.content.res.ResourcesCompat;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

import java.util.List;


public class listAdapter extends BaseAdapter {

    private Context mContext;
    private List<contact> myList;
    int id ;

    //Constructor

    public listAdapter(Context mContext, List<contact> myList) {
        this.mContext = mContext;
        this.myList = myList;
        id = R.id.shape;
    }

    @Override
    public int getCount() {
        return myList.size();
    }

    @Override
    public Object getItem(int position) {
        return myList.get(position);
    }

    @Override
    public long getItemId(int position) {
        return position;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        View v = View.inflate(mContext, R.layout.list, null);
        TextView tvName = (TextView) v.findViewById(R.id.Name);
        TextView tvShape = (TextView) v.findViewById(R.id.shape);

        //Set text for TextView
        tvName.setText(myList.get(position).getName());
        if((myList.get(position).getName().charAt(0)=='A')){
            tvShape.setBackgroundResource(R.drawable.shape);
        }
        else if((myList.get(position).getName().charAt(0)=='B')){
            tvShape.setBackgroundResource(R.drawable.shape2);
        }
        else if((myList.get(position).getName().charAt(0)=='C')){
            tvShape.setBackgroundResource(R.drawable.shape3);
        }
        else if((myList.get(position).getName().charAt(0)=='D')){
            tvShape.setBackgroundResource(R.drawable.shape4);
        }
        else if((myList.get(position).getName().charAt(0)=='E')){
            tvShape.setBackgroundResource(R.drawable.shape5);
        }
        else if((myList.get(position).getName().charAt(0)=='F')){
            tvShape.setBackgroundResource(R.drawable.shape6);
        }
        else if((myList.get(position).getName().charAt(0)=='G')){
            tvShape.setBackgroundResource(R.drawable.shape7);
        }
        else if((myList.get(position).getName().charAt(0)=='H')){
            tvShape.setBackgroundResource(R.drawable.shape8);
        }
        else if((myList.get(position).getName().charAt(0)=='I')){
            tvShape.setBackgroundResource(R.drawable.shape9);
        }
        else if((myList.get(position).getName().charAt(0)=='J')){
            tvShape.setBackgroundResource(R.drawable.shape10);
        }
        else if((myList.get(position).getName().charAt(0)=='K')){
            tvShape.setBackgroundResource(R.drawable.shape11);
        }
        else if((myList.get(position).getName().charAt(0)=='L')){
            tvShape.setBackgroundResource(R.drawable.shape12);
        }
        else if((myList.get(position).getName().charAt(0)=='M')){
            tvShape.setBackgroundResource(R.drawable.shape13);
        }
        else if((myList.get(position).getName().charAt(0)=='N')){
            tvShape.setBackgroundResource(R.drawable.shape14);
        }
        else if((myList.get(position).getName().charAt(0)=='O')){
            tvShape.setBackgroundResource(R.drawable.shape15);
        }
        else if((myList.get(position).getName().charAt(0)=='P')){
            tvShape.setBackgroundResource(R.drawable.shape16);
        }
        else if((myList.get(position).getName().charAt(0)=='Q')){
            tvShape.setBackgroundResource(R.drawable.shape17);
        }
        else if((myList.get(position).getName().charAt(0)=='R')){
            tvShape.setBackgroundResource(R.drawable.shape18);
        }
        else if((myList.get(position).getName().charAt(0)=='S')){
            tvShape.setBackgroundResource(R.drawable.shape19);
        }
        else if((myList.get(position).getName().charAt(0)=='T')){
            tvShape.setBackgroundResource(R.drawable.shape20);
        }
        else if((myList.get(position).getName().charAt(0)=='U')){
            tvShape.setBackgroundResource(R.drawable.shape21);
        }
        else if((myList.get(position).getName().charAt(0)=='V')){
            tvShape.setBackgroundResource(R.drawable.shape22);
        }
        else if((myList.get(position).getName().charAt(0)=='W')){
            tvShape.setBackgroundResource(R.drawable.shape23);
        }
        else if((myList.get(position).getName().charAt(0)=='X')){
            tvShape.setBackgroundResource(R.drawable.shape24);
        }
        else if((myList.get(position).getName().charAt(0)=='Y')){
            tvShape.setBackgroundResource(R.drawable.shape25);
        }
        else if((myList.get(position).getName().charAt(0)=='Z')){
            tvShape.setBackgroundResource(R.drawable.shape26);
        }

        tvShape.setText(myList.get(position).getNickname());
        v.setTag(myList.get(position).getPhone());

        return v;



    }
}
