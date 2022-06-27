
package Sig.view;

import Sig.controller.ActionHandler;
import Sig.model.InvoiceHeader;
import java.util.ArrayList;
import javax.swing.JTable;


public class InvoiceFrame extends javax.swing.JFrame {

    public InvoiceFrame() {
       
        initComponents();
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        InvHeaderTable = new javax.swing.JTable();
        jScrollPane2 = new javax.swing.JScrollPane();
        InvLineTable = new javax.swing.JTable();
        newInvBtn = new javax.swing.JButton();
        newInvBtn.addActionListener(handler);
        delInvBtn = new javax.swing.JButton();
        delInvBtn.addActionListener(handler);
        addLineBtn = new javax.swing.JButton();
        addLineBtn.addActionListener(handler);
        delLineBtn = new javax.swing.JButton();
        delLineBtn.addActionListener(handler);
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        invNumLabel = new javax.swing.JLabel();
        customerLabel = new javax.swing.JLabel();
        dateLabel = new javax.swing.JLabel();
        totalLabel = new javax.swing.JLabel();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        loadMenu = new javax.swing.JMenuItem();
        loadMenu.addActionListener(handler);
        saveMenu = new javax.swing.JMenuItem();
        saveMenu.addActionListener(handler);

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        InvHeaderTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "No.", "Customer", "Date", "Total"
            }
        ));
        jScrollPane1.setViewportView(InvHeaderTable);

        InvLineTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "No.", "Item Name", "Item Price", "Count", "Item Total"
            }
        ));
        jScrollPane2.setViewportView(InvLineTable);

        newInvBtn.setText("New Invoice");

        delInvBtn.setText("Delete Invoice");

        addLineBtn.setText("Add Item");
        addLineBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addLineBtnActionPerformed(evt);
            }
        });

        delLineBtn.setText("Delete Item");

        jLabel1.setText("Invoice Num");

        jLabel2.setText("Customer Name");

        jLabel3.setText("Date");

        jLabel4.setText("Total");

        jMenu1.setText("File");

        loadMenu.setText("Load File");
        jMenu1.add(loadMenu);

        saveMenu.setText("Save File");
        saveMenu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                saveMenuActionPerformed(evt);
            }
        });
        jMenu1.add(saveMenu);

        jMenuBar1.add(jMenu1);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 272, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1)
                            .addComponent(jLabel2)
                            .addComponent(jLabel3)
                            .addComponent(jLabel4))
                        .addGap(25, 25, 25)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(invNumLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(customerLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(dateLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(totalLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(12, 12, 12))))
            .addGroup(layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addComponent(newInvBtn)
                .addGap(32, 32, 32)
                .addComponent(delInvBtn)
                .addGap(82, 82, 82)
                .addComponent(addLineBtn)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 103, Short.MAX_VALUE)
                .addComponent(delLineBtn)
                .addGap(47, 47, 47))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 217, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel1)
                            .addComponent(invNumLabel))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel2)
                            .addComponent(customerLabel))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel3)
                            .addComponent(dateLabel))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel4)
                            .addComponent(totalLabel))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 136, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(newInvBtn)
                    .addComponent(delInvBtn)
                    .addComponent(addLineBtn)
                    .addComponent(delLineBtn))
                .addContainerGap(39, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void addLineBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addLineBtnActionPerformed
       
 
    }//GEN-LAST:event_addLineBtnActionPerformed

    private void saveMenuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_saveMenuActionPerformed
        
    }//GEN-LAST:event_saveMenuActionPerformed

    
    public static void main(String args[]) {
        
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new InvoiceFrame().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTable InvHeaderTable;
    private javax.swing.JTable InvLineTable;
    private javax.swing.JButton addLineBtn;
    private javax.swing.JLabel customerLabel;
    private javax.swing.JLabel dateLabel;
    private javax.swing.JButton delInvBtn;
    private javax.swing.JButton delLineBtn;
    private javax.swing.JLabel invNumLabel;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JMenuItem loadMenu;
    private javax.swing.JButton newInvBtn;
    private javax.swing.JMenuItem saveMenu;
    private javax.swing.JLabel totalLabel;
    // End of variables declaration//GEN-END:variables
    private ActionHandler handler;
    private ArrayList<InvoiceHeader> invoiceHeadersList;

    public ActionHandler getHandler() {
        return handler;
    }

    

    public ArrayList<InvoiceHeader> getInvoiceHeadersList() {
        return invoiceHeadersList;
    }

    public void setInvoiceHeadersList(ArrayList<InvoiceHeader> invoiceHeadersList) {
        this.invoiceHeadersList = invoiceHeadersList;
    }

    public JTable getInvHeaderTable() {
        return InvHeaderTable;
    }

    public JTable getInvLineTable() {
        return InvLineTable;
    }

    
}
