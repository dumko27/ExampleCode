package chap6;

/**
 *
 * @author Novikov Dmitry
 */
public class Synch {

    public static void main(String args[]) {
        Callme target = new Callme();
        new Caller(target, "Hello.");
        new Caller(target, "Synchronized.");
        new Caller(target, "World.");
    }
}

class Callme {

    private static Object synch = new Object();

    void call(String msg) {
        synchronized (synch) {
            System.out.println("[" + msg);
            try {
                Thread.sleep(1000);
            } catch (Exception e) {
                System.out.println("]");
            }
        }
    }
}

class Caller implements Runnable {

    String msg;
    Callme target;

    public Caller(Callme t, String s) {
        target = t;
        msg = s;
        new Thread(this).start();
    }

    public void run() {
        target.call(msg);
    }
}
