/**
 * Created with IntelliJ IDEA.
 * User: skplanet
 * Date: 13. 4. 22.
 * Time: 오후 5:25
 * To change this template use File | Settings | File Templates.
 */
public class Client {
    private Log log;

    public void setLog (Log log) {
        this.log = log;
    }

    public void biz () {
        log.write("print gogo");
    }
}
