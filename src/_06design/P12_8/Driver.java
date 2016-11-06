package _06design.P12_8;

import java.util.ArrayList;
import java.util.Scanner;

/**
 * Created by yangmei555 on 2016/11/5.
 */
public class Driver {
    public static void main(String[] args) {
        VendingMachine vendingMachine = new VendingMachine();
        vendingMachine.add(new Product("Heath", 0.75, 5, "A1"));
        vendingMachine.add(new Product("PayDay", 0.75, 5, "A2"));
        vendingMachine.add(new Product("Reces", 0.75, 5, "A3"));
        vendingMachine.add(new Product("Pop Tart", 1.25, 5, "B1"));
        vendingMachine.add(new Product("Marathon", 0.75, 5, "B2"));
        vendingMachine.add(new Product("Almond Joy", 0.75, 5, "B3"));
        vendingMachine.add(new Product("Hersheys", 0.75, 5, "C1"));
        vendingMachine.add(new Product("Hersheys Dark", 0.75, 5, "C2"));
        vendingMachine.add(new Product("Twizzlers", 0.50, 5, "C3"));
        Scanner in = new Scanner(System.in);
        while (true){
            System.out.println("If you are a customer, please press 1, " +
                    "if you are a operator, please press 2: ");
            String str = in.next();
            while (!str.equals("1") && !str.equals("2")){
                System.out.println("Your input is wrong, please press 1 or 2: ");
                str = in.next();
            }
            if (str.equals("2")){
                System.out.println("\n\nThe information about this vending machine is: \n");
                vendingMachine.print();
                System.out.println("The balance is :$" + vendingMachine.getBalance());
                System.out.println("\nYou can restock the products and remove the money.\n" +
                        "If you want to restock the products, please press 1.\n" +
                        "If you want to remove the money, please press 2.\n");
                str = in.next();
                while (!str.equals("1") && !str.equals("2")){
                    System.out.println("Your input is wrong, please press 1 or 2: ");
                    str = in.next();
                }
                if (str.equals("2")){
                    System.out.println("You have removed $" + vendingMachine.getBalance() + "\n");
                    vendingMachine.setBalance(0);
                } else {
                    int n;
                    System.out.println("Please press the product code of the product that " +
                            "you want to restock, then press the quantity you want " +
                            "to restock: ");
                    String str1 = in.next();
                    String str2 = in.next();
                    while (true){
                        if (str1.length() != 2){
                            System.out.println("Your input is wrong, please press again." );
                            str1 = in.next();
                            str2 = in.next();
                        } else if (str1.charAt(0) != 'A' && str1.charAt(0) != 'B' && str1.charAt(0) != 'C' ||
                                str1.charAt(1) != '1' && str1.charAt(1) != '2' && str1.charAt(1) != '3'){
                            System.out.println("Your input is wrong, please press again." );
                            str1 = in.next();
                            str2 = in.next();
                        } else {
                            try {
                                n = Integer.parseInt(str2);
                                break;
                            } catch (Exception e){
                                System.out.println("Your input is wrong, please press again.");
                            }
                        }
                    }
                    int num = (str1.charAt(0) - 'A') * 3 + str1.charAt(1) - '1';
                    vendingMachine.restock(num, n);
                    System.out.println();
                    vendingMachine.print();
                    System.out.println("\nRestock complete.\n\n");
                }
            } else {
                ArrayList<Coin> coins = new ArrayList<Coin>();
                vendingMachine.print();
                System.out.println("Please select a product by pressing its product code: ");
                String str1 = in.next();
                while (str1.length() != 2 || str1.charAt(0) != 'A' && str1.charAt(0) != 'B' && str1.charAt(0) != 'C' ||
                        str1.charAt(1) != '1' && str1.charAt(1) != '2' && str1.charAt(1) != '3'){
                    System.out.println("Your input is wrong, please press again." );
                    str1 = in.next();
                }
                int num = (str1.charAt(0) - 'A') * 3 + str1.charAt(1) - '1';
                System.out.println("\nPlease insert your coins.\n" +
                        "If you want to inset $0.01, please press 1.\n" +
                        "If you want to inset $0.05, please press 2.\n" +
                        "If you want to inset $0.10, please press 3.\n" +
                        "If you want to inset $0.25, please press 4.\n" +
                        "If you want to inset $0.50, please press 5.\n" +
                        "If you want to inset $1.00, please press 6.\n");
                while (true) {
                    System.out.println("Now please insert coins, if you finish inserting, please" +
                            " press f: ");
                    str1 = in.next();
                    if (str1.equals("f") || str1.equals("F"))
                        break;
                    else {
                        while (!str1.equals("1") && !str1.equals("2") && !str1.equals("3") && !str1.equals("4") &&
                                !str1.equals("5") && !str1.equals("6") && !str1.equals("f") && !str1.equals("F")) {
                            System.out.println("Your input is wrong, please press again.");
                            str1 = in.next();
                        }
                        if (str1.equals("f") || str1.equals("F")){
                            break;
                        } else {
                            int n = Integer.parseInt(str1);
                            coins.add(new Coin(n));
                        }
                    }
                }
                for (Coin coin : coins) {
                    vendingMachine.addYourInput(coin);
                }
                if (vendingMachine.getProducts().get(num).getProductQuantity() != 0 &&
                        vendingMachine.getProducts().get(num).getProductPrice()<= vendingMachine.getYourInput()){
                    System.out.println("\nHere is " + vendingMachine.getProducts().get(num).getProductName() +
                    ".\nPlease enjoy it.\n");
                    vendingMachine.addBalance();
                    vendingMachine.setYourInput(0);
                    vendingMachine.getProducts().get(num).setProductQuantity();
                } else if (vendingMachine.getProducts().get(num).getProductQuantity() == 0){
                    System.out.println("\nSorry, that product is out of stock now. " +
                            "Here is your money back.\n");
                    for (Coin coin : coins) {
                        System.out.println("$" + coin.getMoney());
                    }
                    System.out.println();
                    vendingMachine.setYourInput(0);
                } else {
                    System.out.println("\nYour input is insufficient." +
                            "Here is your money back.\n");
                    for (Coin coin : coins) {
                        System.out.println("$" + coin.getMoney());
                    }
                    System.out.println();
                    vendingMachine.setYourInput(0);
                }
            }
        }
    }
}
