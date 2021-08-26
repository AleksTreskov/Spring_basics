
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class ProductRepository {
    private List<Product> productList;

    public ProductRepository() {
        this.productList = new ArrayList();
        productList.add(new Product(1, "Beer", 100));
        productList.add(new Product(1, "Beer", 10));
        productList.add(new Product(2, "Clothes", 40));
        productList.add(new Product(3, "Games", 20));
        productList.add(new Product(4, "Meat", 15));
        productList.add(new Product(5, "Toys", 70));
    }

    public Optional<Product> findById(int id) {
        return productList.stream().filter(p -> p.getId() == id).findFirst();
    }

    public List<Product> findAll() {
        return productList;
    }

}
