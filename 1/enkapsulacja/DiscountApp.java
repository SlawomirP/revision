package enkapsulacja;

public class DiscountApp {
    public static void main(String[] args) {
        String firstName = "Bob";
        String lastName = "Cat";
        boolean premiumClient = true;
        double price = 1100.00;
        double discountPrice = price;

        if (premiumClient && price>1000){
            discountPrice *= 0.85;
        } else if (price>1000){
            discountPrice *= 0.90;
        } else if (premiumClient){
            discountPrice *= 0.95;
        }
        System.out.println("witaj " + firstName + " " + lastName);
        System.out.println("kwota przed rabatem: " + price);
        System.out.println("kwota po rabacie: " + discountPrice);
    }
}
