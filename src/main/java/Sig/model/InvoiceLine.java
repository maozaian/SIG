
package Sig.model;

/**
 *
 * @author maoza
 */
public class InvoiceLine {
private InvoiceHeader invoice;
private String itemName;
private double itemPrice;
private int itemCount;



    public InvoiceLine(InvoiceHeader invoice, String itemName, double itemPrice, int itemCount) {
        this.invoice = invoice;
        this.itemName = itemName;
        this.itemPrice = itemPrice;
        this.itemCount = itemCount;
    }

    public int getItemCount() {
        return itemCount;
    }

    public void setItemCount(int itemCount) {
        this.itemCount = itemCount;
    }

    public InvoiceHeader getInvoice() {
        return invoice;
    }

    public void setInvoice(InvoiceHeader invoice) {
        this.invoice = invoice;
    }

    public String getItemName() {
        return itemName;
    }

    public void setItemName(String itemName) {
        this.itemName = itemName;
    }

    public double getItemPrice() {
        return itemPrice;
    }

    public void setItemPrice(double itemPrice) {
        this.itemPrice = itemPrice;
    }

    public double getLineTotal() {
        return itemCount * itemPrice;
    }

    
    public String toString(){
           return "InvoiceLine{"+"itemName = "+itemName+"itemPrice="+itemPrice+"itemCount="+itemCount+"lineTotal="+getLineTotal()+"}";
    }


    
}
