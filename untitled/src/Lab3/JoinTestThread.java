package Lab3;

import static java.lang.Math.sqrt;

class JoinTestThread extends Thread{
    long val;
    Thread t;
    static String n;
    JoinTestThread(String n, Thread t, long val){
        this.n=n;
        this.t=t;
        this.val = val;
    }
    public void run() {
        int sum = 2; //1 and its self

        System.out.println("Thread "+n+" has entered the run() method");
        try {
            if (t != null) t.join();
            for(int i = 2; i<= sqrt(val); i++) {
                if (val % i == 0)
                    sum = sum + i;
            }
            Main.final_sum += sum;
            System.out.println("Thread "+n+" has terminated operation.");
            System.out.println("Thread "+n+" executing operation.");
            Thread.sleep(3000);
            System.out.println(Main.final_sum);
        }
        catch(Exception e){e.printStackTrace();}
    }


}

