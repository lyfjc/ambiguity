import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Primary
@Component
public class IceCream implements Dessert {
    @Override
    public String toString() {
        return "an icecream";
    }
}
