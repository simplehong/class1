package day1;

import org.springframework.beans.BeansException;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;
import org.springframework.context.support.GenericXmlApplicationContext;

/**
 * Created with IntelliJ IDEA.
 * User: skplanet
 * Date: 13. 5. 2.
 * Time: 오후 5:30
 * To change this template use File | Settings | File Templates.
 */
public class SpringXmlMain implements ApplicationContextAware {

    public static void main(String[] args) {
        ApplicationContext factory = new GenericXmlApplicationContext("day1/applicationContext.xml");
        Client client  = (Client)factory.getBean("client");

        client.biz();

    }

    @Override
    public void setApplicationContext(ApplicationContext applicationContext) throws BeansException {
        //To change body of implemented methods use File | Settings | File Templates.
    }
}
