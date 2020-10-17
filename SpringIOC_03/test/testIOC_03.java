import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class testIOC_03 {

    ApplicationContext ioc1 = new ClassPathXmlApplicationContext("conf/ioc1.xml");

    @Test
    public void test01(){
        Object bean = ioc1.getBean("booktest");
        Object bean2 = ioc1.getBean("booktest");
        System.out.println(bean == bean2);
    }
}
