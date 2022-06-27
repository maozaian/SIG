
package Sig.controller;

import Sig.model.InvoiceHeader;
import Sig.model.InvoiceLine;
import Sig.model.InvoiceLineTableModel;
import Sig.view.InvoiceFrame;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.stream.Collectors;
import javax.swing.JFileChooser;
import javax.swing.event.ListSelectionListener;
import javax.swing.table.TableModel;



/**
 *
 * @author maoza
 */

public abstract class ActionHandler implements ActionListener, ListSelectionListener{
    
    private InvoiceFrame frame;

    public ActionHandler(InvoiceFrame frame){
    this.frame = frame;
    
    }

   
    public void actionPerformed(ActionEvent e){
        System.out.println("Action Handling Called.");
        switch (e.getActionCommand()){
            case "Load File":
                System.out.println("Load File");
                loadFile();
                break;
            case "Save File":
                System.out.println("Save File");
                saveFile();
                break;
            case "New Invoice":
                System.out.println("New Invoice");
                newInv();
                break;
            case "Delete Invoice":
                System.out.println("Delete Invoice");
                delInv();
                break;
            case "Add Item":
                System.out.println("Add Item");
                addItem();
                break;
            case "Delete Item":
                System.out.println("Delete Item");
                delItem();
                break;



        }


    }
    public void valueChanged(ListSelectionListener e){
        System.out.println("Row Selected");
        int selectedRow = frame.getInvHeaderTable().getSelectedRow();
        System.out.println(selectedRow);
        ArrayList<InvoiceLine> lines = frame.getInvoiceHeadersList().get(selectedRow).getLines();
        frame.getInvLineTable().setModel((TableModel) new InvoiceLineTableModel(lines));
    }

    private void loadFile() {
        try{
        JFileChooser fc = new JFileChooser();
        int result = fc.showOpenDialog(  frame);
        if (result == JFileChooser.APPROVE_OPTION){
        File headerFile = fc.getSelectedFile();
        String headerStrPath = headerFile.getAbsolutePath();
        Path headerPath = Paths.get(headerStrPath);
        List<String>headerLines = Files.lines(headerPath).collect(Collectors.toList());
        ArrayList<InvoiceHeader> invoiceHeadersList = new ArrayList<>();
        for (String headerLine : headerLines){
            String[] parts = headerLine.split(",");
            int invoiceNum = Integer.parseInt(parts[0]);
            Date[] part = null;
            InvoiceHeader invHeader = new InvoiceHeader(invoiceNum, parts[2] , part[1]);
            invoiceHeadersList.add(invHeader);
        }
        result = fc.showOpenDialog(frame);
        if (result == JFileChooser.APPROVE_OPTION){
           String lineStrPath = fc.getSelectedFile().getAbsolutePath();   
           Path linePath = Paths.get(lineStrPath);
           List<String> lineLines = Files.lines(linePath).collect(Collectors.toList());
           for (String lineLine : lineLines){
           String[] parts = lineLine.split(",");
           int invId = Integer.parseInt(parts[0]);
           double price = Double.parseDouble(parts[2]);
           int count = Integer.parseInt(parts[3]);
           InvoiceHeader header = getInvoiceHeaderById(invoiceHeadersList, invId);
               InvoiceLine invLine = null;
           header.getLines().add(invLine);
           }
           frame.setInvoiceHeadersList(invoiceHeadersList);

}
        }
        }   catch (IOException ex){
                ex.printStackTrace();
        }
    }
    private InvoiceHeader getInvoiceHeaderById(ArrayList<InvoiceHeader> invoices, int id){
           for (InvoiceHeader invoice : invoices){
               if (invoice.getInvoiceNum()== id){
               return invoice;
               }
            }
             return null;

    }
    private void saveFile() {
        
    }

    private void newInv() {
    
        }
   
    private void delInv() {
        }

    private void addItem() {
        }

    private void delItem() {
        }
}






    

