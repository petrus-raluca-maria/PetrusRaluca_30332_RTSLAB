package Lab3.ex1;

import Lab3.ex1.JoinTestThread;

public class Main {
    static int final_sum = 0;
    public static void main(String[] args) {


        JoinTestThread w1 = new JoinTestThread("1", null, 5);
        JoinTestThread w2 = new JoinTestThread("2", w1, 6);

        w1.start();
        w2.start();
        System.out.println(final_sum);
    }
}