package seminar1;

import java.util.ArrayList;
import java.util.List;

public class vendingAvtomat_copy {
    // Реализуйте класс Товар, содержащий данные о товаре, и ТорговыйАвтомат, содержащий в себе методы
    // initProducts (List <Product>) сохраняющий в себе список исходных продуктов и getProduct(String name)


    List <product_copy> listProducts_copu = new ArrayList<>();

    public void initProducts(List <product_copy> myList){
        listProducts_copu = myList;

    }


    public product_copy getProducts(String name){
        for (product_copy elProduct : listProducts_copu) {
            if (elProduct.getName().equals(name)){          //equals сравнение не ссылочное
                return elProduct;
            }

        }
        return null;
    }

}
