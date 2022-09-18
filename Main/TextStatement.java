package Main;

import java.util.Enumeration;

public class TextStatement extends Statement{
    private String[] s = new String[8];
    
    public TextStatement(){
        s[0] = "Rental Record for ";
        s[1] = "\n";
        s[2] = "\t";
        s[3] = "\n";
        s[4] = "Amount owed is ";
        s[5] = "\n";
        s[6] = "You earned ";
        s[7] = " frequent renter points";
    }
    
    public String value(Customer aCustomer) {
      return super.value(aCustomer, s);
   }
}
