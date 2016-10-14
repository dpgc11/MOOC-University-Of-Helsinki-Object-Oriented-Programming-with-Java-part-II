
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author Yogesh
 */
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;
 
public class Storehouse {
 
    private Map<String, Integer> price;
    private Map<String, Integer> stocks;
 
    public Storehouse() {
        this.price = new HashMap<String, Integer>();
        this.stocks = new HashMap<String, Integer>();
    }
 
    public void addProduct(String product, int price, int stock) {
        this.price.put(product, price);
        this.stocks.put(product, stock);
    }
 
    public int price(String product) {
        if (this.price.containsKey(product)) {
            return this.price.get(product);
        } else {
            return -99;
        }
 
    }
 
    public int stock(String product) {
        if (this.stocks.containsKey(product)) {
            return this.stocks.get(product);
        } else {
            return 0;
        }
    }
     
    public boolean take(String product) {
        if (this.stocks.containsKey(product)) {
            if (this.stocks.get(product) == 0) {
                return false;
            } else {
                this.stocks.put(product, this.stocks.get(product)-1);
                return true;
            }
        } else {
            return false;
        }
         
    }
     
    public Set<String> products() {
        Set<String> set = new HashSet<String>();
        for (String key : this.price.keySet()) {
            set.add(key);
        }
        return set;
    }
 
     
}