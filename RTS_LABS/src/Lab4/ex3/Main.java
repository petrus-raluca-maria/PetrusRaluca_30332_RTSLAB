package Lab4.ex3;

public class Main {
    public static void main(String[] args) {
        int monitor = 1;
        new ExecThread(monitor,0, 3, 4, 7).start();
        new ExecThread(monitor, 0, 5, 3, 6).start();
        new ExecThread(monitor, 0, 6, 5, 7).start();
    }
}