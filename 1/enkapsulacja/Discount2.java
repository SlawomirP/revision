package enkapsulacja;

import enkapsulacja.Printer.Print;

public class Discount2 {
    public static void main(String[] args) {
        Client c1 = new Client(null, "Cat", true);
        double price = 1100.00;
        Print print = new Print();
        System.out.println(print.infoForClient(c1,price));






//        DiscountService discountService = new DiscountService();
//        double discountPrice = discountService.countDiscountPrice(c1, price);
//        System.out.println("witaj " + c1.getFirstName() + " " + c1.getLastName());
//        System.out.println("kwota przed rabatem: " + price);
//        System.out.println("kwota po rabacie: " + discountPrice);
    }
}
