/*
 * JStock - Free Stock Market Software
 * Copyright (C) 2011 Yan Cheng CHEOK <yccheok@yahoo.com>
 *
 * This program is free software; you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as published by
 * the Free Software Foundation; either version 2 of the License, or
 * (at your option) any later version.
 *
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.
 *
 * You should have received a copy of the GNU General Public License along
 * with this program; if not, write to the Free Software Foundation, Inc.,
 * 51 Franklin Street, Fifth Floor, Boston, MA 02110-1301 USA.
 */

package org.yccheok.jstock.activity;

import java.util.ArrayList;

import org.yccheok.jstock.portfolio.TransactionSummary;
import org.yccheok.jstock.widget.BuyTransactionSummaryAdapter;

import android.app.ListActivity;
import android.os.Bundle;

public class BuyActivity extends ListActivity {
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.buy_activity_view);
        
        BuyTransactionSummaryAdapter buyTransactionSummaryAdapter = new BuyTransactionSummaryAdapter(this, R.layout.buy_activity_row_view, getTransactionSummary());
        setListAdapter(buyTransactionSummaryAdapter);
    }
    
    private ArrayList<TransactionSummary> getTransactionSummary() {
        ArrayList<TransactionSummary> transactionSummaries = new ArrayList<TransactionSummary>();
        TransactionSummary transactionSummary = new TransactionSummary(); 
        transactionSummaries.add(transactionSummary);
        return transactionSummaries;
    }
}
