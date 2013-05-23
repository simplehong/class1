package day1;


import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * Created with IntelliJ IDEA.
 * User: skplanet
 * Date: 13. 5. 2.
 * Time: 오후 5:30
 * To change this template use File | Settings | File Templates.
 */
public class SpringAnnotationMain {

    public static void main(String[] args) {
        ApplicationContext factory = new AnnotationConfigApplicationContext(SpringConfig.class);

        Client client  = (Client) factory.getBean("client");

        client.biz();

    }
}
