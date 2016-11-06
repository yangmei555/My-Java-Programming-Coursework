package _06design.P12_8;

import java.util.ArrayList;

/**
 * Created by yangmei555 on 2016/11/5.
 */
public class VendingMachine {
    private ArrayList<Product> products;
    private double balance;
    private double yourInput;
    public VendingMachine(){
        products = new ArrayList<Product>();
        balance = 0;
        yourInput = 0;
    }
    public void add(Product aProduct){
        products.add(aProduct);
    }
    public double getBalance(){
        return balance;
    }
    public void setBalance(double mon){
        balance = mon;
    }
    public double getYourInput(){
        return yourInput;
    }
    public void print(){
        String str = String.format("%15s%10s%12s%10s", "Product", "Price", "Quantity", "Code");
        System.out.println(str);
        for (Product product : products) {
            System.out.println(product);
        }
    }
    public void restock(int n1, int n2){
        products.get(n1).add(n2);
    }
    public void addYourInput(Coin coin){
        yourInput += coin.getMoney();
    }
    public void setYourInput(double mon){
        yourInput = mon;
    }
    public void addBalance(){
        balance += yourInput;
    }
    public ArrayList<Product> getProducts(){
        return products;
    }
}
