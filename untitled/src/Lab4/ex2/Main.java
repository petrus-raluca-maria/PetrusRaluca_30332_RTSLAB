package Lab4.ex2;

import Lab4.ex1.ExecutionThread;

public class Main {
    public static void main(String[] args) {
        Integer monitor = new Integer(1);
        Integer monitor1 = new Integer(1);
        new ExecutionThread(monitor, 4, 4, 2, 4).start();
        new ExecutionThread(monitor1, 3, 3, 3, 6).start();
        new ExecutionThread(monitor, 5, 5, 2, 5).start();
    }
}