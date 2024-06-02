package Lab1;

import java.util.Random;

public class Lab1_ex3 {
    public static void main(String[] args) {
            int[] n = new int[10];
            Random r = new Random();
            System.out.println("Unsorted random array");
            for(int i = 0; i <=9; i++){
                n[i] = r.nextInt();
                System.out.print(n[i] + " ");
            }
            System.out.print("\n");

        int aux = 0;
        for(int i = 0; i < 10; i++) {
            for (int j = 0; j < 9 - i; j++) {
                if (n[j] > n[j + 1]) {
                    aux = n[j];
                    n[j] = n[j + 1];
                    n[j + 1] = aux;
                }
            }
        }
        System.out.println("Sorted random array");
        for(int i = 0; i <=9; i++){
            System.out.print(n[i] + " ");
        }
    }
}
