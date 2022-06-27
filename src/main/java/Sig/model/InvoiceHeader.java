
package Sig.model;

import java.util.ArrayList;
import java.util.Date;

/**
 *
 * @author maoza
 */
public class InvoiceHeader {
private int invoiceNum;
private String CusName;
private Date date;

private ArrayList<InvoiceLine> lines;

    public InvoiceHeader(int invoiceNum, String CusName, Date date) {
        this.invoiceNum = invoiceNum;
        this.CusName = CusName;
        this.date = date;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public int getInvoiceNum() {
        return invoiceNum;
    }

    public void setInvoiceNum(int invoiceNum) {
        this.invoiceNum = invoiceNum;
    }

    public String getCusName() {
        return CusName;
    }

    public void setCusName(String CusName) {
        this.CusName = CusName;
    }

    public ArrayList<InvoiceLine> getLines() {
       if (lines == null){
          lines = new ArrayList<>();
       } 
       return lines;
    }

    

    public double getInvoiceTotal() {
        double total = 0;
        for (InvoiceLine line : getLines()){
            total  += line.getLineTotal();
        }
        return total;
    }

    @Override
    public String toString(){
           return "InvoiceHeader{"+"invoiceNumber = "+invoiceNum+"CustomerName="+CusName+", date="+date+"}";
    }
    
}
