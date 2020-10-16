package guigu.bean;

import org.junit.jupiter.api.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class IOCTest {

    ApplicationContext ioc = new ClassPathXmlApplicationContext("conf/ioc.xml");
    ApplicationContext ioc2 = new ClassPathXmlApplicationContext("conf/ioc2.xml");
    ApplicationContext ioc3 = new ClassPathXmlApplicationContext("conf/ioc3.xml");

    @Test
    public void test10(){
        Object bean = ioc3.getBean("myFactoryBean");
        System.out.println(bean);
    }

    @Test
    public void test09(){
        AirPlane airPlane = (AirPlane) ioc3.getBean("airPlane01");
        System.out.println(airPlane.getJzName());

        AirPlane airPlane02 = (AirPlane) ioc3.getBean("airPlane02");
        System.out.println(airPlane02.getJzName());
    }

    @Test
    public void test08(){
        Car car = (Car) ioc2.getBean("car02");
        System.out.println(car.getCarName());
    }

    @Test
    public void test06(){
        Car car = (Car) ioc2.getBean("car02");
        System.out.println(car.getCarName());
    }

    @Test
    public void test04(){
//        Person bean = (Person) ioc2.getBean("person03");
//        System.out.println(bean.getBooks());
//        Map<String,Object> maps = bean.getMaps();
//        System.out.println(maps);
//        System.out.println("===========");
//        System.out.println(bean.getProperties());
//        System.out.println("===========");
//        Person bean2 = (Person) ioc2.getBean("person04");
//        System.out.println(bean2.getMaps());
//        System.out.println("===========");
        Person bean5 = (Person) ioc2.getBean("person05");
        Object car = ioc2.getBean("car01");
        System.out.println("ioc car" + car);
        System.out.println("person car" + bean5.getCar());
    }


    /*
     * 实验3：通过构造器为 bean 的属性赋值（index，type）
     * 通过 p 名称空间为 bean 赋值
     */

    @Test
    public void test03(){
        Person bean = ioc.getBean("person06",Person.class);
        System.out.println(bean);

    }


    /*
     * 实验2：根据 bean 的类型从 IOC 容器中获取 bean 的实例
     * 如果 IOC 容器中 bean 的类型有多个就不可以用 class 找
     */
    @Test
    public void test02(){
        Person bean = ioc.getBean("person02",Person.class);
        System.out.println(bean);

    }

    /*
    *     实验1：
      1.ApplicationContext 代表Ioc容器
      2.给容器一个组件 通过id拿到组件的对象
          组件的创建工作是容器完成
          Person对象是在创建容器创建完成时就已经创建好了
      3.同一个组件在ioc容器也是单实例，容器启动完成前已经创建好了
      4.容器中如果没有这个组件 获取组件就会发生错误
      5.ioc 容器在创建这个组件的时候，(property)会利用 setter and getter 进行赋值
      6.属性名由 setter 方法决定
    */

    @Test
    public void test01(){
        //代表IOC容器
        //ClassPathXmlApplicationContext 当前应用的xml配置文件在ClassPath
        //根据Spring 的配置文件 得到ioc容器对象
        Person bean = (Person) ioc.getBean("person01");
        System.out.println(bean);
    }
}
