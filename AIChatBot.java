import java.util.*;

public class AIChatBot {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String input;

        System.out.println("AI ChatBot Started! Type 'exit' to quit.");

        while(true) {
            System.out.print("You: ");
            input = sc.nextLine().toLowerCase();

            if(input.equals("exit")) {
                System.out.println("Bot: Goodbye!");
                break;
            }
            else if(input.contains("hello") || input.contains("hi")) {
                System.out.println("Bot: Hello! How can I help you?");
            }
            else if(input.contains("internship")) {
                System.out.println("Bot: This internship provides hands-on Java experience.");
            }
            else if(input.contains("java")) {
                System.out.println("Bot: Java is an object-oriented programming language.");
            }
            else if(input.contains("bye")) {
                System.out.println("Bot: Have a great day!");
            }
            else {
                System.out.println("Bot: Sorry, I don't understand that.");
            }
        }
    }
}
