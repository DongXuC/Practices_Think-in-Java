import java.io.PrintWriter;
import java.io.StringWriter;
import java.util.logging.Logger;

/**
 * Created by XuChen on 2017/9/16.
 * Description:
 */
class Exception1 extends Exception {
    private static Logger logger = Logger.getLogger("Exception1");

    public Exception1() {
        StringWriter trace = new StringWriter();
        printStackTrace(new PrintWriter(trace));
        logger.severe(trace.toString());
    }
}
class Exception2 extends Exception {
    private static Logger logger = Logger.getLogger("Exception2");

    public Exception2() {
        StringWriter trace = new StringWriter();
        printStackTrace(new PrintWriter(trace));
        logger.severe(trace.toString());
    }
}

public class TestLogger {
    public static void main(String[] args) {
        try {
            throw new Exception1();
        } catch (Exception1 e1) {
            System.err.println(e1);
        }
        try {
            throw new Exception2();
        } catch (Exception2 e2) {
            System.err.println(e2);
        }
    }
}
