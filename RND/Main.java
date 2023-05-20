package RND;

import java.util.Scanner;

public class Main  {
    public static void main(String[] args) {
        Table table = new Table();
        Choices Choice = new Choices();

        Scanner userInput = new Scanner(System.in);
        System.out.println("What calculations do you want to do? Here are the options");
        table.Calculations();
        System.out.println("");
        
        String choice = userInput.nextLine();
        Choice.choice(choice);

        userInput.close();
    }
}