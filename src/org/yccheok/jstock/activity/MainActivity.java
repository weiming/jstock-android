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

import org.yccheok.jstock.activity.R;
import android.app.TabActivity;
import android.content.Intent;
import android.content.res.Resources;
import android.os.Bundle;
import android.widget.TabHost;

public class MainActivity extends TabActivity  {
    
    /** Called when the activity is first created. */
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main);

        Resources res = getResources();     // Resource object to get Drawables
        TabHost tabHost = getTabHost();     // The activity TabHost
        TabHost.TabSpec spec;               // Resusable TabSpec for each tab
        Intent intent;                      // Reusable Intent for each tab

        // Create an Intent to launch an Activity for the tab (to be reused)
        intent = new Intent().setClass(this, BuyActivity.class);

        // Initialize a TabSpec for each tab and add it to the TabHost
        spec = tabHost.newTabSpec("buy").setIndicator(getString(R.string.buy),
                          res.getDrawable(R.drawable.ic_tab_buy))
                      .setContent(intent);
        tabHost.addTab(spec);

        // Do the same for the other tabs
        intent = new Intent().setClass(this, SellActivity.class);
        spec = tabHost.newTabSpec("sell").setIndicator(getString(R.string.sell),
                          res.getDrawable(R.drawable.ic_tab_sell))
                      .setContent(intent);
        tabHost.addTab(spec);

        intent = new Intent().setClass(this, DividendActivity.class);
        spec = tabHost.newTabSpec("dividend").setIndicator(getString(R.string.dividend),
                          res.getDrawable(R.drawable.ic_tab_dividend))
                      .setContent(intent);
        tabHost.addTab(spec);
    }
}