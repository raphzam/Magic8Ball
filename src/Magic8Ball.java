import java.util.Random;
import java.util.Scanner;

public class Magic8Ball {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        Random  random = new Random();
        String userQuestion;
        String userContinue;

        //store the answers
        String [] magicResponses = {"It is certain", "It is decidedly so", "Without a doubt", "Yes definitely",
                "You may rely on it", "As I see it, yes", "Most likely",
                "Outlook good", "Yes", "Signs point to yes", "Reply hazy try again",
                "Ask again later", "Better not tell you now", "Cannot predict now", "Concentrate and ask again",
                "Don't count on it", "My reply is no", "My sources say no", "Outlook not so good", "Very doubtful"};


        int numOfResponses = magicResponses.length;
        int responseNum = 0;// random.nextInt(numOfResponses);

        //Prompt user until they quit
        do {
            responseNum = random.nextInt(numOfResponses);
            System.out.println("Ask me a question: ");
            userQuestion = input.nextLine();
            System.out.println("YOU ASKED: " + userQuestion);
            System.out.println("MAGIC 8 BALL SAYS: " + magicResponses[responseNum]);
            System.out.println("Do you have another question for the Magic 8-Ball? (y/n)");
            userContinue = input.nextLine();
        } while (!userContinue.equalsIgnoreCase("n"));

        System.out.println("Thank you for playing");

    }

}




