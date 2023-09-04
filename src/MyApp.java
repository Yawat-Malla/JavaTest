import java.util.Random;
import java.util.Scanner;

public class MyApp {
    public static void main(String[] args) {

        String username = "yawat";
        String password = "ktm123";
        String lamo_butta = "***********************";
        Scanner obj = new Scanner(System.in);
        System.out.println("Username:");
        String in_username = obj.next();
        System.out.println("Password: ");
        String in_password = obj.next();
        if (username.equals(in_username)) {
            while (true) {
                if (password.equals(in_password)) {
                    System.out.print(lamo_butta + "\t\n\tApplications:\n" + lamo_butta);
                    System.out.println("\n\t1. Calculator");
                    System.out.println("\t2. Guessing Game");
                    System.out.println("\t3. SI Calculator");
                    System.out.println("\t4. Vowel Checker");

                } else {
                    System.out.println("Entered password is incorrect. ");

                }
                int choice = obj.nextInt();

                switch (choice) {
                    case 1:
                        System.out.println("Enter first number: ");
                        int num1 = obj.nextInt();
                        System.out.println("Enter second number");
                        int num2 = obj.nextInt();
                        System.out.println("Operation to perform: + , - , * , / ");
                        String opt = obj.next();
                        switch (opt) {
                            case "+":
                                System.out.println(num1 + num2);
                                break;
                            case "-":
                                System.out.println(num1 - num2);
                                break;
                            case "*":
                                System.out.println(num1 * num2);
                                break;
                            case "/":
                                System.out.println(num1 / num2);
                                break;
                            default:
                                System.out.println("Invalid input");
                                break;
                        }
                        break;

                    case 2:
                        int max = 100;
                        int min = 0;
                        Random random = new Random();
                        int random_number = random.nextInt(max - min + 1) + min;
                        System.out.println("Guess a number: ");
                        int user_number = obj.nextInt();
                        System.out.println("The number was " + random_number);
                        if (user_number == random_number) {
                            System.out.println("You guessed the correct number!");
                        } else {
                            System.out.println("Your guess is incorrect.");
                        }
                        break;
                    case 3:
                        System.out.println("Enter principal amount: ");
                        double principal = obj.nextFloat();
                        System.out.println("Enter rate per year: ");
                        double rate = obj.nextFloat();
                        System.out.println("Enter time(in years): ");
                        double time = obj.nextFloat();
                        double interest = (principal * rate * time) / 100;
                        System.out.println("The simple interest is: " + interest);
                        break;

                    case 4:
                        System.out.println("Enter a character");
                        String letter = obj.next();
                        if (letter.length() == 1) {
                            if (letter.equals("a") || letter.equals("e") || letter.equals("i") || letter.equals("o") || letter.equals("u")) {
                                System.out.println("The entered character is a vowel.");
                            } else {
                                System.out.println("Entered character is consonant.");
                            }
                        } else {
                            System.out.println("Invalid input.");
                        }
                        break;
                }
                System.out.println("Exit program?(y/n)");
                String exit = obj.next();
                if (exit.equals("y")) {
                    break;
                }
            }
        } else {
            System.out.println("Entered username is incorrect.");
        }
    }
}

