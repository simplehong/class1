package day1;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;

/**
 * Created with IntelliJ IDEA.
 * User: skplanet
 * Date: 13. 4. 22.
 * Time: 오후 5:25
 * To change this template use File | Settings | File Templates.
 */

@Component
public class Client {

    @Autowired
    private Log log;

//    @PostConstruct
//    public void init() {
//        System.out.println("log = " + log);
//    }

    public void setLog (Log log) {
        this.log = log;
    }

    public void biz () {
        log.write("print gogo");
    }
}
