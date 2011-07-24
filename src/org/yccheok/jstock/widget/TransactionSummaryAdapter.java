package org.yccheok.jstock.widget;

import java.util.ArrayList;
import java.util.List;

import org.yccheok.jstock.activity.R;
import org.yccheok.jstock.portfolio.Order;
import org.yccheok.jstock.portfolio.TransactionSummary;

import android.app.Activity;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;

public class TransactionSummaryAdapter extends ArrayAdapter<TransactionSummary> {
    
    public TransactionSummaryAdapter(Context context, int textViewResourceId,
            List<TransactionSummary> objects) {
        super(context, textViewResourceId, objects);
    }
    
    public View getView(int position, View convertView, ViewGroup parent) {
        View row = convertView;
        if (row == null) {
            LayoutInflater vi = (LayoutInflater)getContext().getSystemService(Context.LAYOUT_INFLATER_SERVICE);
            row = inflater.inflate(R.layout.custom_row_view, parent, false);
        }        
    }
}
