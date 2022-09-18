package Main;

import java.util.Enumeration;

public class HtmlStatement extends Statement{
    private String[] s = new String[8];
    
    public HtmlStatement(){
        s[0] = "<H1>Rentals for <EM>";
        s[1] = "</EM></H1><P>\n";
        s[2] = ": ";
        s[3] = "<BR>\n";
        s[4] = "<P>You owe <EM>";
        s[5] = "</EM><P>\n";
        s[6] = "On this rental you earned <EM>";
        s[7] = "</EM> frequent renter points<P>";
    }
            
    public String value(Customer aCustomer) {
      return super.value(aCustomer, s);
   }
}
