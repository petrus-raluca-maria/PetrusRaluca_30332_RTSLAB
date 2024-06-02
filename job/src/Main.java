import javax.swing.*;
import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        /*Scanner scanner = new Scanner(System.in);
        System.out.println("Enter your name ");
        String name =  scanner.nextLine();
        System.out.println("How old are you?");
        int age = scanner.nextInt();
        scanner.nextLine();
        System.out.println("What is your favourite food?");
        String food = scanner.nextLine();*/

/*
        String name = JOptionPane.showInputDialog("Enter your name");
        JOptionPane.showMessageDialog(null, "Hello " + name);

        int age =  Integer.parseInt(JOptionPane.showInputDialog("Enter your age"));
        JOptionPane.showMessageDialog(null, "You are " + age + " years old");*/

        /*String cars[][] = new String[2][2];
        cars[0][0] = "Dacia";
        cars[0][1] = "Miata";
        cars[1][0] = "BMW";
        cars[1][1] = "Audi";
        for(int i = 0; i < cars.length; i++) {
            for (int j = 0; j < cars.length; j++) {
                System.out.print(cars[i][j] + " ");
            }
            System.out.print('\n');
        }*/

        /*String name = "Auca   ";
        int length = name.length();
        char carac = name.charAt(0);
        int index = name.indexOf("u");
        String faraSpatii = name.trim();
        String schimba = name.replace('c', 'k');
        System.out.println(length);
        System.out.println(carac);
        System.out.println(index);
        System.out.println(faraSpatii);
        System.out.println(schimba);*/

        /*ArrayList<String> food = new ArrayList<String>();
        food.add("pizza");
        food.add("burger");
        food.add("pasta");

        food.set(0, "sushi");
        food.remove(2);
        food.clear();
        for(int i = 0; i < food.size(); i++){
            System.out.println(food.get(i));
        }*/

        ArrayList<String> bakeryList = new ArrayList();
        bakeryList.add("cupcakes");
        bakeryList.add("donuts");
        bakeryList.add("cake");

        ArrayList<String> produceList = new ArrayList();
        produceList.add("tomatoes");
        produceList.add("carrots");
        produceList.add("peppers");

        ArrayList<String> drinks = new ArrayList();
        drinks.add("coffee");
        drinks.add("juice");

        ArrayList<ArrayList<String>> groceryList = new ArrayList<>();
        groceryList.add(bakeryList);
        groceryList.add(produceList);
        groceryList.add(drinks);
        System.out.println(groceryList.get(0));
        System.out.println(groceryList.get(0).get(0));
    }
}