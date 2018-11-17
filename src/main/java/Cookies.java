import org.springframework.stereotype.Component;

@Component
public class Cookies implements Dessert {
    @Override
    public String toString() {
        return "Cookies";
    }
}
