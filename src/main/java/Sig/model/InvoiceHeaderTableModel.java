/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Sig.model;

import java.util.ArrayList;
import javax.swing.table.AbstractTableModel;

/**
 *
 * @author maoza
 */
public class InvoiceHeaderTableModel extends AbstractTableModel{
        private ArrayList<InvoiceHeader> data;
        private String[] cols = {"Id", "Customer Name", "Invoice Date"};

    public InvoiceHeaderTableModel(ArrayList<InvoiceHeader> data) {
        this.data = data;
    }



        @Override
        public int getRowCount(){
        return data.size();
    
        }
        @Override
        public int getColumnCount(){
        return cols.length;
    
        }
        @Override
        public Object getValueAt(int rowIndex, int columnIndex){
        InvoiceHeader header = data.get(rowIndex);
        switch (columnIndex){
               case 0:
                     return header.getInvoiceNum();
               case 1:
                     return header.getCusName();
               case 2:
                     return header.getDate();
        }
        return "";    
         
       
        }

        
        public String getColumnNameCount(int column){
        return cols[column];
        }

}
    

