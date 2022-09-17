package Main;

import java.util.Enumeration;

public class TextStatement extends Statement{
    String string1 = "Rental Record for ";
    String string2 = "\n";
    String string3 = "\t";
    String string4 = "\n";
    String string5 = "Amount owed is ";
    String string6 = "\n";
    String string7 = "You earned ";
    String string8 = " frequent renter points";

    public String value(Customer aCustomer) {
      Enumeration rentals = aCustomer.getRentals();
      
      String result = string1 + aCustomer.getName() + string2;
      while (rentals.hasMoreElements()) {
         Rental each = (Rental) rentals.nextElement();
         //show figures for this rental
         result += each.getMovie().getTitle()+  string3 +
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
