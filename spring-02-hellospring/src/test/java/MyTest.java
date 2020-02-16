import com.hemukeji.pojo.Hello;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MyTest {

    public static void main(String[] args) {

        
        //获取Spring的上下文对象
        ApplicationContext ctx = new ClassPathXmlApplicationContext("beans.xml");

        Hello hello = (Hello) ctx.getBean("hello");

        System.out.println(hello.toString());



    }
}
