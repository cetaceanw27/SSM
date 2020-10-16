package guigu.factory;

import com.guigu.bean.Book;
import org.springframework.beans.factory.FactoryBean;

import java.util.UUID;

public class MyFactoryBeanImpl implements FactoryBean<Book> {

    //返回创建的对象
    @Override
    public Book getObject() throws Exception {
        System.out.println("MyFactoryBeanImpl is building an object");
        Book book = new Book();
        book.setBookName(UUID.randomUUID().toString());
        return book;
    }

    //返回创建的对象类型
    @Override
    public Class<?> getObjectType() {
        return Book.class;
    }

    //是否是单例
    @Override
    public boolean isSingleton() {
        return false;
    }
}
