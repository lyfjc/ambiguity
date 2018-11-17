import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration//("/DessertXmlTest-context.xml")
public class DessertXmlTest {
    @Autowired
    Child child;


    @Test
    public void eat(){
        child.eat();
    }
}
