package _06design.P12_8;

/**
 * Created by yangmei555 on 2016/11/5.
 */
public class Product {
    private String productName;
    private double productPrice;
    private int productQuantity;
    private String productCode;
    public Product(String productName, double productPrice, int productQuantity, String productCode){
        this.productName = productName;
        this.productPrice = productPrice;
        this.productQuantity = productQuantity;
        this.productCode = productCode;
    }
    public String getProductName(){
        return productName;
    }
    public double getProductPrice(){
        return productPrice;
    }
    public int getProductQuantity(){
        return productQuantity;
    }
    public void setProductQuantity(){
        productQuantity--;
    }
    public String getProductCode(){
        return productCode;
    }
    public String toString(){
        String str = String.format("%15s%10.2f%12d%10s", productName, productPrice,
                productQuantity, productCode);
        return str;
    }
    public void add(int n){
        productQuantity += n;
    }
}
