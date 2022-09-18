package Main;

import java.util.Enumeration;

public class Statement {
    private String[] s = new String[8];
    
    public String value(Customer aCustomer, String[] s) {
      Enumeration rentals = aCustomer.getRentals();
      
      String result = s[0] + aCustomer.getName() + s[1];
      while (rentals.hasMoreElements()) {
         Rental each = (Rental) rentals.nextElement();
         //show figures for this rental
         result += each.getMovie().getTitle()+  s[2] +
         String.valueOf(each.getCharge()) + s[3];
      }
      //add footer lines
      result +=  s[4] +
      String.valueOf(aCustomer.getTotalCharge()) + s[5];
      result +=  s[6] +
      String.valueOf(aCustomer.getTotalFrequentRenterPoints()) +
      s[7];
      return result;
    }
}
