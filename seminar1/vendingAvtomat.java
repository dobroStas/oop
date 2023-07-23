package seminar1;

import java.util.ArrayList;
import java.util.List;

public class vendingAvtomat {
    // Реализуйте класс Товар, содержащий данные о товаре, и ТорговыйАвтомат, содержащий в себе методы
    // initProducts (List <Product>) сохраняющий в себе список исходных продуктов и getProduct(String name)


    List <product> listProducts = new ArrayList<>();

    public void initProducts(List <product> myList){
        listProducts = myList;

    }


    public product getProduct(String name){
        for (product elProduct : listProducts) {
            if (elProduct.getName().equals(name)){          //equals сравнение не ссылочное
                return elProduct;
            }

        }
        return null;
    }

}
