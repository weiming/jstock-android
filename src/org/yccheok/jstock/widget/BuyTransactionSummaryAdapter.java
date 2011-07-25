package org.yccheok.jstock.widget;

import java.util.List;

import org.yccheok.jstock.activity.R;
import org.yccheok.jstock.portfolio.TransactionSummary;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;

public class BuyTransactionSummaryAdapter extends ArrayAdapter<TransactionSummary> {
    
    public BuyTransactionSummaryAdapter(Context context, int textViewResourceId,
            List<TransactionSummary> objects) {
        super(context, textViewResourceId, objects);
    }
    
    public View getView(int position, View convertView, ViewGroup parent) {
        View v = convertView;
        if (v == null) {
            LayoutInflater vi = (LayoutInflater)getContext().getSystemService(Context.LAYOUT_INFLATER_SERVICE);
            v = vi.inflate(R.layout.buy_activity_row_view, null);
        }
        return v;       
    }
}
