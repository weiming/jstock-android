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

package org.yccheok.jstock.portfolio;

/**
 *
 * @author Owner
 */
public class TransactionSummary extends AbstractSummary<Transaction> implements Commentable {

    public double getQuantity() {
        double result = 0;
        
        final int size = this.size();
        
        for (int i = 0; i < size; i++) {
            final Transaction transaction = this.get(i);
            
            double quantity = transaction.getQuantity();
            
            result += quantity;
        }
        
        return result;        
    }
    
    public double getCalculatedBroker() {
        double result = 0.0;
        
        final int size = this.size();
        
        for (int i = 0; i < size; i++) {
            final Transaction transaction = this.get(i);
            
            double calculatedBroker = transaction.getCalculatedBroker();
            
            result += calculatedBroker;
        }

        return result;        
    }

    public double getCalculatedStampDuty() {
        double result = 0.0;
        
        final int size = this.size();
        
        for (int i = 0; i < size; i++) {
            final Transaction transaction = this.get(i);
            
            double calculatedStampDuty = transaction.getCalculatedStampDuty();
            
            result += calculatedStampDuty;
        }
        
        return result;        
    }

    public double getCalculatdClearingFee() {
        double result = 0.0;
        
        final int size = this.size();
        
        for (int i = 0; i < size; i++) {
            final Transaction transaction = this.get(i);
            
            double calculatedClearingFee = transaction.getCalculatdClearingFee();
            
            result += calculatedClearingFee;
        }
        
        return result;        
    }
    
    public double getTotal() {
        double result = 0.0;
        
        final int size = this.size();
        
        for (int i = 0; i < size; i++) {
            final Transaction transaction = this.get(i);
            
            double total = transaction.getTotal();
            
            result += total;
        }
        
        return result;
    }
    
    public double getReferenceTotal() {
        double result = 0.0;
        
        final int size = this.size();
        
        for (int i = 0; i < size; i++) {
            final Transaction transaction = this.get(i);
            
            double total = transaction.getReferenceTotal();
            
            result += total;
        }
        
        return result;
    }
    
    public double getNetTotal() {
        double result = 0.0;
        
        final int size = this.size();
        
        for (int i = 0; i < size; i++) {
            final Transaction transaction = this.get(i);
            
            double netTotal = transaction.getNetTotal();
            
            result += netTotal;
        }
        
        return result;        
    }
       
    @Override
    public String toString() {
        if (this.size() > 0) {
            return this.get(0).toString();
        }
        
        return "";
    }


    @Override
    public void setComment(String comment) {
        this.comment = comment;
    }

    @Override
    public String getComment() {
        return this.comment;
    }

    protected Object readResolve() {
        /* For backward compatible */
        if (comment == null) {
            comment = "";
        }

        return this;
    }

    private String comment = "";
}
