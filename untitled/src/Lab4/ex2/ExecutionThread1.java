package Lab4.ex2;

public class ExecutionThread1 extends Thread {
    Integer monitor;
    int sleep_min, sleep_max, activity_min1, activity_max1, activity_min2, activity_max2;
    public ExecutionThread1(Integer monitor, int sleep_min, int
            sleep_max, int activity_min1, int activity_max1, int activity_min2, int activity_max2) {
        this.monitor = monitor;
        this.sleep_min = sleep_min;
        this.sleep_max = sleep_max;
        this.activity_min1 = activity_min1;
        this.activity_max1 = activity_max1;
    }
    public void run() {
        System.out.println(this.getName() + " - STATE 1");
        try {
            Thread.sleep(Math.round(Math.random() * (sleep_max
                    - sleep_min)+ sleep_min) * 500);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println(this.getName() + " - STATE 2");
        synchronized (monitor) {
            System.out.println(this.getName() + " - STATE 3");
            int k = (int) Math.round(Math.random()*(activity_max1
                    - activity_min1) + activity_min1);
            int k2 = (int) Math.round(Math.random()*(activity_max2
                    - activity_min2) + activity_min2);
            for (int i = 0; i < k * 100000; i++) {
                i++; i--;
            }
            for (int i = 0; i < k2 * 100000; i++) {
                i++; i--;
            }
        }
        System.out.println(this.getName() + " - STATE 4");
    }
}
