# IQ_Test
import java.util.Random;
import java.util.Scanner;
public class Main{
    public static void main(String[] args) {
        // IQ Testing
        do {
            Scanner sc = new Scanner(System.in);
            System.out.println("PRESS :: 1(LOW) , 2(NORMAL) , 3(HIGH) ::");
            int level = sc.nextInt();
            double result = 0;
            // Low Level..
            if (level == 1) {
                Random rand = new Random();
                int num1 = rand.nextInt(10);
                int num2 = rand.nextInt(10);
                char operators[] = {'+', '-', '*', '/'};
                char op = operators[rand.nextInt(operators.length)];
                System.out.println("First Number :" + num1);
                System.out.println("Second Number :" + num2);
                System.out.println("The Operator is :" + op);
                switch (op) {
                    case '+':
                        result = num1 + num2;
                        break;
                    case '-':
                        result = num1 - num2;
                        break;
                    case '*':
                        result = num1 * num2;
                        break;
                    case '/':
                        result = num1 / num2;
                        break;
                }
                // user input...
                System.out.println("Enter Your Answer :");
                double user = sc.nextInt();
                if (result == user) {
                    System.out.println("YOU WON.......");
                } else {
                    System.out.println("YOU LOSS.......");
                }
            }
            // Normal Level
            if (level == 2) {
                Random rand = new Random();
                int num1 = rand.nextInt(50);
                int num2 = rand.nextInt(50);
                char operators[] = {'+', '-', '*', '/'};
                char op = operators[rand.nextInt(operators.length)];
                System.out.println("First Number :" + num1);
                System.out.println("Second Number :" + num2);
                System.out.println("The Operator is :" + op);
                switch (op) {
                    case '+':
                        result = num1 + num2;
                        break;
                    case '-':
                        result = num1 - num2;
                        break;
                    case '*':
                        result = num1 * num2;
                        break;
                    case '/':
                        result = num1 / num2;
                        break;
                }
                // User input
                System.out.println("Enter Your Answer :");
                double user = sc.nextInt();
                if (result == user) {
                    System.out.println("YOU WON.......");
                } else {
                    System.out.println("YOU LOSS.......");
                }
            }
            // Advanced Level
            if (level == 3) {
                Random rand = new Random();
                int num1 = rand.nextInt(100);
                int num2 = rand.nextInt(100);
                char operators[] = {'+', '-', '*', '/'};
                char op = operators[rand.nextInt(operators.length)];
                System.out.println("First Number :" + num1);
                System.out.println("Second Number :" + num2);
                System.out.println("The Operator is :" + op);
                switch (op) {
                    case '+':
                        result = num1 + num2;
                        break;
                    case '-':
                        result = num1 - num2;
                        break;
                    case '*':
                        result = num1 * num2;
                        break;
                    case '/':
                        result = num1 / num2;
                        break;
                }
                // User input
                System.out.println("Enter Your Answer :");
                double user = sc.nextInt();
                if (result == user) {
                    System.out.println("YOU WON.......");
                } else {
                    System.out.println("YOU LOSS.......");
                }
            }
        }while(true);
    }
}
