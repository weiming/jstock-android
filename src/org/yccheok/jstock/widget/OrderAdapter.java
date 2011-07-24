package org.yccheok.jstock.widget;

import java.util.ArrayList;

import org.yccheok.jstock.activity.R;
import org.yccheok.jstock.portfolio.Order;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.BaseAdapter;
import android.widget.TextView;

public class OrderAdapter extends ArrayAdapter<Order> {

    private ArrayList<Order> items;

    public OrderAdapter(Context context, int textViewResourceId, ArrayList<Order> items) {
        super(context, textViewResourceId, R.id.A, items);
        this.items = items;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        View v = super.getView(position, convertView, parent);
        //View v = convertView;
        //if (v == null) {
        //    LayoutInflater vi = (LayoutInflater)getContext().getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        //    v = vi.inflate(R.layout.custom_row_view, null);
        //}
        Order o = items.get(position);
        if (o != null) {
            //TextView tt = (TextView) v.findViewById(R.id.toptext);
            //TextView bt = (TextView) v.findViewById(R.id.bottomtext);
            
           
            //if (tt != null) {
            //      tt.setText(o.getOrderName());                            
            //}
            //if (bt != null) {
            //      bt.setText(o.getOrderStatus());
            //}

        }

        
        return v;
    }   
}
