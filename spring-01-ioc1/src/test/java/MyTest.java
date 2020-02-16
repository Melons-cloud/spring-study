import com.hemukeji.dao.UserDaoImpl;
import com.hemukeji.dao.UserDaoMysqlImpl;
import com.hemukeji.dao.UserDaoOracleImpl;
import com.hemukeji.dao.UserDaoSqlserverImpl;
import com.hemukeji.service.UserServiceImpl;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MyTest {

    public static void main(String[] args) {

        //获取ApplicationContext;拿到spring 的容器

        ApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");

        //需要什么直接get
        UserServiceImpl userServiceImpl = (UserServiceImpl) context.getBean("UserServiceImpl");
        userServiceImpl.getUser();

    }
}
