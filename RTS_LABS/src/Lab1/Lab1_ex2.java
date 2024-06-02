package Lab1;

import java.util.Vector;
import java.util.Scanner;

public class Lab1_ex2 {
        public static void main(String[] args) {
            System.out.println("Please enter the elements of the first matrix");
            Scanner input = new Scanner(System.in);
            int[][] m1 = new int[3][3];
            int[][] m2 = new int[3][3];
            int[][] m_sum = new int[3][3];
            int[][] m_prod = new int[3][3];
            for (int i = 0; i <= 2; i++) {
                for (int j = 0; j <= 2; j++) {
                    m1[i][j] = input.nextInt();
                }
            }
            System.out.println("Please enter the elements of the second matrix");
            for (int i = 0; i <= 2; i++) {
                for (int j = 0; j <= 2; j++) {
                    m2[i][j] = input.nextInt();
                }
            }

            // summing

            for (int i = 0; i <= 2; i++) {
                for (int j = 0; j <= 2; j++) {
                    m_sum[i][j] = m1[i][j] + m2[i][j];
                }
            }

            for (int i = 0; i <= 2; i++) {
                for (int j = 0; j <= 2; j++) {
                    System.out.print(m_sum[i][j] + " ");
                }
                System.out.println("\n");
            }
            System.out.println("\n");
            // product

            for (int i = 0; i <= 2; i++){
                for (int j = 0; j <= 2; j++) {
                    for(int k = 0; k <=2; k++)
                        m_prod[i][j] = m_prod[i][j] + m1[i][k] * m2[k][i];
                }
            }
            /*
            m_prod[0][1] = R1[0] * R4[1] + R1[1] * R5[1] + R1[2] * R6[1];
            */
            for(int i = 0; i <= 2; i++){
                for(int j = 0; j <= 2; j++){
                    System.out.print(m_prod[i][j] + " ");
                }
                System.out.println("\n");
            }
        }
}