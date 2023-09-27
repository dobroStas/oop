package oop_new;

import java.util.List;

public class BottleOfWaterVendingMashine implements interfaceVendingMashine {
    List<BottleOfWater> productsList;

    public BottleOfWaterVendingMashine(List<BottleOfWater> productsList) {
        this.productsList = productsList;
    }

    public List <BottleOfWater> getProductList() {
        return productsList;
    }
    public void setProductsList(List<BottleOfWater>productsList){
        this.productsList = productsList;

    }
 
    public BottleOfWater getProduct (String name, int volume) {
        for (BottleOfWater bottleOfWater : productsList) {
            if (bottleOfWater.getName().equals(name) && bottleOfWater.getVolume() == volume) {
                return bottleOfWater;
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

    public void addBottleOfWater (BottleOfWater bottleOfWater){
        this.productsList.add(bottleOfWater);
    }


}
