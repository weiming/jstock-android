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

import org.yccheok.jstock.portfolio.Order;
import org.yccheok.jstock.widget.OrderAdapter;

import android.app.ListActivity;
import android.os.Bundle;

public class BuyActivity extends ListActivity {
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.transaction_list_view);
        
        OrderAdapter orderAdapter = new OrderAdapter(this, R.layout.custom_row_view, new ArrayList<Order>());
        setListAdapter(orderAdapter);
        
        Order o1 = new Order();
        o1.setOrderName("SF services");
        o1.setOrderStatus("Pending");
        orderAdapter.add(o1);
        
        Order o2 = new Order();
        o2.setOrderName("SF Advertisement");
        o2.setOrderStatus("Completed");
        orderAdapter.add(o2);
    }
}
