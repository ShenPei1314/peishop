import com.mchange.v2.c3p0.ComboPooledDataSource;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class ShopTest {
    public static void main(String[] args) {

        ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
        ComboPooledDataSource dataSource=context.getBean("dataSources",ComboPooledDataSource.class);
        try {
            System.out.println("========"+dataSource.getConnection());
        }catch (Exception ex){
            ex.printStackTrace();
        }
    }
}
