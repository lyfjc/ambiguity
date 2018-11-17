import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
//@Qualifier("good")
//使用自定义注解
@Cold
public class Cake implements Dessert {
    @Override
    public String toString() {
        return "A cake";
    }
}
