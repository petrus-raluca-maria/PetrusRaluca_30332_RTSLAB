package Lab1;

import java.util.Scanner;
public class Lab1_ex1 {
    public static void main(String[] args) {
        System.out.println("Menu\n Enter the number in front of the operation you want to select");
        System.out.println(" 1. Sum \n 2. Subtraction \n 3. Multiplication\n");
        Scanner input = new Scanner(System.in);
        int op = Integer.parseInt(input.nextLine());
        String symbol;
        int r1; int i1; int r2; int i2;
        int real_res; int imag_res;
        switch (op){
            case 1:
                symbol = " + "; System.out.println("Please enter the numbers you want to sum, separating the real part from the imaginary part with enters");
                r1 = Integer.parseInt(input.nextLine());  i1 = Integer.parseInt(input.nextLine());
                r2 = Integer.parseInt(input.nextLine());  i2 = Integer.parseInt(input.nextLine());
                real_res = r1 + r2; imag_res = i1+i2;
                System.out.println("The result is " + real_res + " + " + imag_res + "i");

                break;
            case 2:
                symbol = " - "; System.out.println("Please enter the numbers you want to subtract");
                r1 = Integer.parseInt(input.nextLine());  i1 = Integer.parseInt(input.nextLine());
                r2 = Integer.parseInt(input.nextLine());  i2 = Integer.parseInt(input.nextLine());
                real_res = r1 - r2; imag_res = i1-i2;
                System.out.println("The result is " + real_res + " + " + imag_res + "i");
                break;
            case 3:
                symbol = " * "; System.out.println("Please enter the numbers you want to multiply");
                r1 = Integer.parseInt(input.nextLine());  i1 = Integer.parseInt(input.nextLine());
                r2 = Integer.parseInt(input.nextLine());  i2 = Integer.parseInt(input.nextLine());
                real_res = r1 * r2 - i1 * i2 ; imag_res = r1*i2 + i1 * r2;
                System.out.println("The result is " + real_res + " + " + imag_res + "i");
                break;
            default : System.out.println("You entered a wrong number");
        }
    }
}