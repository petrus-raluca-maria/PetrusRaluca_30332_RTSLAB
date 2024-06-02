package Lab4.ex2;


public class Main {
    public static void main(String[] args) {
        int monitorP9 = 1;
        int monitorP10 = 1;
        new ExecutionThread(monitorP9,monitorP10, 0, 4, 2, 4,4,6).start();
        new ExecutionThread(monitorP10,monitorP9, 0, 5, 3,5,5, 7).start();
    }
}