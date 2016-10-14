
import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author Yogesh
 */
public class ShoppingBasket {

    private Map<String, Purchase> basket;

    public ShoppingBasket() {
        this.basket = new HashMap<String, Purchase>();
    }

    public void add(String product, int price) {
        for (Purchase p : this.basket.values()) {
            if (p.getProduct().equals(product)) {
                p.increaseAmount();
                this.basket.put(product, p);
            }
        }
        Purchase purchase;

        if (!this.basket.containsKey(product)) {
            purchase = new Purchase(product, 1, price);
            this.basket.put(product, purchase);
        }

    }

    public int price() {
        int totalPrice = 0;
        for (Purchase purchase : this.basket.values()) {
            totalPrice += purchase.price();
        }

        return totalPrice;
    }

    public void print() {
        for (Purchase purchase : this.basket.values()) {
            System.out.println(purchase);
        }
    }

}
