package Lab4.ex4;

public class Main {
    public static void main(String[] args) {
        Integer monitorP6 = 0;
        Integer monitorP10 = 0;
        ExecutionThread t1 = new ExecutionThread(monitorP6, monitorP10,0, 7, 2, 3);
        ExecutionThread t2 = new ExecutionThread(monitorP6, 3, 5,t1);
        ExecutionThread t3 = new ExecutionThread(monitorP10,4, 6,t1);
        t1.start();
        t2.start();
        t3.start();
    }
}