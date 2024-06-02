package Lab4.ex4;

public class ExecutionThread extends Thread {
    Thread t;
    Integer monitorP6, monitorP10;
    int sleep_min, sleep_max, activity_min, activity_max;

    public ExecutionThread(Integer monitorP6, Integer monitorP10, int sleep_min, int
            sleep_max, int activity_min, int activity_max) {
        this.monitorP6 = monitorP6;
        this.monitorP10 = monitorP10;
        this.sleep_min = sleep_min;
        this.sleep_max = sleep_max;
        this.activity_min = activity_min;
        this.activity_max = activity_max;
    }
    public ExecutionThread(Integer monitor, int activity_min, int activity_max, Thread t) {
        this.monitorP6 = monitor;
        this.monitorP10 = monitor;
        this.activity_min = activity_min;
        this.activity_max = activity_max;
        this.t = t;
    }

    public void run() {
        switch (this.getName()) {
            case "Thread-0":
                //state1!!!!
                try {
                    Thread.sleep(Math.round(Math.random() * (sleep_max - sleep_min) + sleep_min) * 500);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }

                System.out.println(this.getName() + " - STATE 2");
                int k1 = (int) Math.round(Math.random() * (activity_max - activity_min) + activity_min);
                for (int i = 0; i < k1 * 100000; i++) {
                    i++;
                    i--;
                }
                synchronized (monitorP6) {
                    synchronized (monitorP10) {
                        monitorP6.notify();
                        monitorP10.notify();
                    }
                }
                System.out.println(this.getName() + " - STATE 3");
                break;
            case "Thread-1":
                //state1
                synchronized (monitorP6) {
                    try {
                        monitorP6.wait();
                    } catch (InterruptedException e) {
                        throw new RuntimeException(e);
                    }
                }
                System.out.println(this.getName() + " - STATE 2");
                int k2 = (int) Math.round(Math.random() * (activity_max - activity_min) + activity_min);
                for (int i = 0; i < k2 * 100000; i++) {
                    i++;
                    i--;
                }
                System.out.println(this.getName() + " - STATE 3");
                try {
                    t.join();
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
                break;
            case "Thread-2":
                //state1
                synchronized (monitorP10) {
                    try {
                        monitorP10.wait();
                    } catch (InterruptedException e) {
                        throw new RuntimeException(e);
                    }
                }
                System.out.println(this.getName() + " - STATE 1");
                int k3 = (int) Math.round(Math.random() * (activity_max - activity_min) + activity_min);
                for (int i = 0; i < k3 * 100000; i++) {
                    i++;
                    i--;
                }
                System.out.println(this.getName() + " - STATE 2");
                try {
                    t.join();
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
                break;
        }
    }
}