package day1;

import org.springframework.util.StopWatch;

import javax.annotation.PostConstruct;

import static java.lang.Thread.sleep;

/**
 * Created with IntelliJ IDEA.
 * User: skplanet
 * Date: 13. 5. 21.
 * Time: 오후 2:49
 * To change this template use File | Settings | File Templates.
 */
public class LogProxy implements Log {
    private Log targetLog;

    public LogProxy (String type) {
        try {
            String typeString = "day1."+type;
            targetLog = (Log) Class.forName(typeString).newInstance();
        } catch (Exception e) {
            e.printStackTrace();  //To change body of catch statement use File | Settings | File Templates.
        }

    }

    public void write (String data) {
        StopWatch stopWatch = new StopWatch();
        stopWatch.start();
        targetLog.write(data);
        try {
            sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();  //To change body of catch statement use File | Settings | File Templates.
        }
        stopWatch.stop();
        long executionTime = stopWatch.getTotalTimeMillis();
        System.out.println("메서드 실행 시간 : "
                + stopWatch.prettyPrint());
    }

}
