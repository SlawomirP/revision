package enkapsulacja.Printer;

import enkapsulacja.Client;
import enkapsulacja.DiscountService;

public class Print {
    DiscountService discountService = new DiscountService();

    public String infoForClient(Client c, double price) {
        return clientData(c) + "\n" + infoPrice(price) + "\n" + infoDiscount(c, price);
    }

    private String clientData(Client c) {
        return completenessData(c);
    }

    private String infoPrice(double price) {
        return "kwota przed rabatem: " + price;
    }

    private String infoDiscount(Client c, double price) {
        return "kwota po rabacie: " + discountService.countDiscountPrice(c, price);
    }

    private String completenessData(Client c) {
        if (c.getFirstName() != null && c.getLastName() != null) {
            return "Witaj " + c.getFirstName() + " " + c.getLastName() + ".";
        } else if (c.getFirstName() == null && c.getLastName() == null) {
            return "Witaj nieznajomy";
        } else if (c.getLastName() == null) {
            return "Witaj " + c.getFirstName() + ".";
        }  else if (c.getFirstName() == null) {
            return "Dzien dobry panie/pani " + c.getLastName() + ".";
        }
        else return "Unknown";
    }
}
