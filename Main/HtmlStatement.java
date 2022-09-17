package Main;

import java.util.Enumeration;

public class HtmlStatement extends Statement{
    String string1 = "<H1>Rentals for <EM>";
    String string2 = "</EM></H1><P>\n";
    String string3 = ": ";
    String string4 = "<BR>\n";
    String string5 = "<P>You owe <EM>";
    String string6 = "</EM><P>\n";
    String string7 = "On this rental you earned <EM>";
    String string8 = "</EM> frequent renter points<P>";

    public String value(Customer aCustomer) {
      Enumeration rentals = aCustomer.getRentals();
      String result = string1 + aCustomer.getName() + string2;
      while (rentals.hasMoreElements()) {
         Rental each = (Rental) rentals.nextElement();
         //show figures for each rental
         result += each.getMovie().getTitle()+ string3 +
         String.valueOf(each.getCharge()) + string4;
      }
      //add footer lines
      result +=  string5 +
      String.valueOf(aCustomer.getTotalCharge()) + string6;
      result +=  string7 + 
      String.valueOf(aCustomer.getTotalFrequentRenterPoints()) +
      string8;
      return result;
   }
}
