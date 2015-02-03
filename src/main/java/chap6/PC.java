package chap6;

/**
 *
 * @author Novikov Dmitry
 */
public class PC {

    public static void main(String args[]) {
        Q q = new Q();
        new Producer(q);
        new Costumer(q);
    }
}

class Q {

    int n;
    boolean valueSet = false;

    synchronized int get() {
        if (!valueSet) {
            try {
                wait();
            } catch(InterruptedException e) {
                
            }
        }
        System.out.println("Got: " + n);
        valueSet = false;
        notify();
        return n;
    }

    synchronized void put(int n) {
        if (valueSet) {
            try {
                wait();
            } catch (InterruptedException e) {
            }
        }
        this.n = n;
        valueSet = true;
        System.out.println("Put: " + n);
        notify();
    }
}

class Producer implements Runnable {

    Q q;

    Producer(Q q) {
        this.q = q;
        new Thread(this, "Producer").start();
    }

    @Override
    public void run() {
        int i = 0;
        while (true) {
            q.put(i++);
        }
    }
}

class Costumer implements Runnable {

    Q q;

    public Costumer(Q q) {
        this.q = q;
        new Thread(this, "Costumer").start();
    }

    @Override
    public void run() {
        while (true) {
            q.get();
        }
    }

}
