package oop_new;

import java.util.List;

// ЭТО ПРИМЕР. В ПРОГРАММЕ ИСПОЛЬЗУЕТСЯ interfaceVendingMashine.java

public class vendingMashine {
    private List<Product> productList;

    public Product getProduct(String name) {
        for (Product product : productList) {
            if (product.getName().equals(name)) {
                return product;
            }
        }
        return null;
    }
    public void initProductsList(List <Product> productList){
        this.productList = productList;
    }
}