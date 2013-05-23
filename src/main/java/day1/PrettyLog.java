package day1;

import org.springframework.stereotype.*;
import org.springframework.stereotype.Component;

import java.awt.*;

/**
 * Created with IntelliJ IDEA.
 * User: skplanet
 * Date: 13. 4. 22.
 * Time: 오후 5:41
 * To change this template use File | Settings | File Templates.
 */

@Component
public class PrettyLog implements Log {

    @Override
    public void write(String data) {
        System.out.println("******************");
        System.out.println(data);
        System.out.println("******************");
    }
}
