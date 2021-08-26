import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Application {
    public static void main(String[] args) {
        ApplicationContext context = new AnnotationConfigApplicationContext(CartConfiguraqtion.class);
        Cart cart = context.getBean(Cart.class);
        System.out.println(cart);
       }
}
