package enkapsulacja;
public class DiscountService {
    // obliczanie ceny po obniżce
//    double countDiscountPrice (Client client, double price ){
//        double discountPrice = price;
//        if (client.isPremiumClient() && price>1000){
//            discountPrice *= 0.85;
//        } else if (price>1000){
//            discountPrice *= 0.90;
//        } else if (client.isPremiumClient()){
//            discountPrice *= 0.95;
//        }
//        return discountPrice;
//    }
    // mamy tutaj powtorzone 2 przypadki z warunkiem ze klient jest premium
    public double countDiscountPrice(Client client, double price) {
        if (client.isPremiumClient()) {
            return calculatePremiumDiscount(price);
        } else
            return calculateStandartDiscount(price);
    }
    private double calculateStandartDiscount(double price) {
        if (price > 1000) {
            //   return price*=0.9; // to mozna jeszcze wyciagnac
            return applyDiscount(price, 0.1);
        } else {
            return price;
        }
    }
    private double calculatePremiumDiscount(double price) {
        if (price > 1000) {
            //return price*=0.85;
            return applyDiscount(price, 0.15);
        } else {
            //return price*=0.95;
            return applyDiscount(price, 0.05);
        }
    }
    private double applyDiscount(double price, double discount) {
        return price * (1 - discount);
    }
}
