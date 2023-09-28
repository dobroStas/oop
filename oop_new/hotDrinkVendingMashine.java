package oop_new;

import java.util.List;

public class hotDrinkVendingMashine implements interfaceVendingMashine{
    List<hotDrink> productsList;

    public hotDrinkVendingMashine(List<hotDrink> productsList) {
        this.productsList = productsList;
    }

    public List <hotDrink> getProductList() {
        return productsList;
    }
    public void setProductsList(List<hotDrink>productsList){
        this.productsList = productsList;

    }
 
    public hotDrink getProduct (String name, int volume, int temperature) {
        for (hotDrink hotDrink : productsList) {
            if (hotDrink.getName().equals(name) && hotDrink.getVolume() == volume && hotDrink.getTemperature() == temperature) {
                return hotDrink;
            }
        }
        return null;
    }

    public hotDrink getProduct (String name, int temperature) {
        for (hotDrink hotDrink : productsList) {
            if (hotDrink.getName().equals(name) && hotDrink.getTemperature() == temperature) {
                return hotDrink;
            }
        }
        return null;
    }

    @Override
    public Product getProduct(String name) {
        for (Product product : productsList) {
            if (product.getName().equals(name)) {
                return product;
            }
        }
        return null;
    }

    public void addHotDrink (hotDrink hotDrink){
        this.productsList.add(hotDrink);
    }


}

