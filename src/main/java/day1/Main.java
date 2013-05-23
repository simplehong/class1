package day1;

/**
 * Created with IntelliJ IDEA.
 * User: skplanet
 * Date: 13. 4. 22.
 * Time: 오후 5:24
 * To change this template use File | Settings | File Templates.
 */
class Main {

    public static void main(String[] args) {
        Client cli = new Client();
        Log log = new PrettyLog();

        cli.setLog(log);
        cli.biz();
    }

}
