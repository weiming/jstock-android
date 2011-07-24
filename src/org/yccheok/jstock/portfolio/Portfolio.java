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
public class Portfolio extends AbstractSummary<TransactionSummary> implements Commentable {

    public double getNetTotal() {
        double result = 0.0;
        
        final int size = this.size();
        
        for (int i = 0; i < size; i++) {
            final TransactionSummary transactionSummary = this.get(i);
            result += transactionSummary.getNetTotal();
        }
        
        return result;                
    }
    
    public double getTotal() {
        double result = 0.0;
     
        final int size = this.size();
        
        for (int i = 0; i < size; i++) {
            final TransactionSummary transactionSummary = this.get(i);
            result += transactionSummary.getTotal();
        }
        
        return result;        
    }

    public double getReferenceTotal() {
        double result = 0.0;
     
        final int size = this.size();
        
        for (int i = 0; i < size; i++) {
            final TransactionSummary transactionSummary = this.get(i);
            result += transactionSummary.getReferenceTotal();
        }
        
        return result;        
    }
    
    public double getCalculatedBroker() {
        double result = 0.0;
     
        final int size = this.size();
        
        for (int i = 0; i < size; i++) {
            final TransactionSummary transactionSummary = this.get(i);
            result += transactionSummary.getCalculatedBroker();
        }
        
        return result;                
    }

    public double getCalculatedClearingFee() {
        double result = 0.0;
     
        final int size = this.size();
        
        for (int i = 0; i < size; i++) {
            final TransactionSummary transactionSummary = this.get(i);
            result += transactionSummary.getCalculatdClearingFee();
        }
        
        return result;                
    }
    
    public double getCalculatedStampDuty() {
        double result = 0.0;
     
        final int size = this.size();
        
        for (int i = 0; i < size; i++) {
            final TransactionSummary transactionSummary = this.get(i);
            result += transactionSummary.getCalculatedStampDuty();
        }
        
        return result;                
    }
    
    @Override
    public String toString() {
        return "Portfolio";
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
        if(comment == null) {
            comment = "";
        }

        return this;
    }

    private String comment = "";
}
