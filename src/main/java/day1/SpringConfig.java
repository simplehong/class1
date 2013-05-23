package day1;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * Created with IntelliJ IDEA.
 * User: skplanet
 * Date: 13. 5. 20.
 * Time: 오후 5:20
 * To change this template use File | Settings | File Templates.
 */

@Configuration
public class SpringConfig {


    @Bean
    public Client client() {
        Client client = new Client();
        client.setLog(log());

        return client;
    }

    @Bean
    public Log log() {
        Log log = new LogProxy("DefaultLog");
        return log;
    }

    @Bean
    public Log defaultlog() {
        return new DefaultLog();
    }

}
