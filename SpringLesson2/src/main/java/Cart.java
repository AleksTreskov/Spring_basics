import java.util.ArrayList;
import java.util.List;

public class Cart {
    private ProductRepository productRepository;
    private List<Product> productList;

    public Cart(ProductRepository productRepository) {
        this.productRepository = productRepository;
        this.productList = new ArrayList<>();
    }

    public void add(int id) {
        productRepository.findById(id).ifPresent(p -> productList.add(p));
    }

    public void remove(int id) {
        productList.stream().
                filter(product -> product.getId() == id).
                findFirst().
                ifPresent(product -> productList.remove(product));
    }

    @Override
    public String toString() {
        return "Cart: "+ productRepository.findAll();
    }
}
