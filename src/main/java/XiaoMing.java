import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.stereotype.Component;

@Component
public class XiaoMing implements Child {
    private Dessert dessert;

    //@Qualifier会覆盖@Primary属性
    //@Qualifier("cake")//限定符，默认bean名称
    //@Qualifier("good")//自定义限定符

    //使用自定义注解，可以使用多个
    @Cold
    @Autowired
    public void setDessert(Dessert dessert) {
        this.dessert = dessert;
    }

    @Override
    public void eat() {
        System.out.println("I'm eating "+dessert.toString());
    }
}
