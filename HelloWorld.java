 import java.util.Scanner;  // Import the Scanner class
 import java.util.Random; //randomness
 public class HelloWorld {
    static int questionsanswered = 0;
    static int totalquestions = 12;
    static int correctanswers = 0;
    static int wronganswers = 0;
    public static void main(String[] args) {
        final String[] SocialMedia = {"Instagram", "Youtube", "TikTok", "Pintrest", "facebook", "Twitter/X", "Snapchat"};
        Scanner input = new Scanner(System.in);  // Create a Scanner object
        Random random = new Random();
        int index =  random.nextInt(SocialMedia.length);
        //clears console for cleanliness
        System.out.print("\033[H\033[2J");
        System.out.flush();
        //introduction and instructions
        System.out.println("Questions Answered: " + questionsanswered + "/" + totalquestions + "\n \n \n Welcome to the Health Class Quiz! \n \n \n Please answer the following questions to the best of your ability. \n \n \n Let's get started! \n ------------------------------------------------------\n \n");

        //question 1
        System.out.println("Q1: someone messages you on " + SocialMedia[index] + ", saying that they need $200 to pay for their car and they will pay you back, what do you do? \n \n \n 1. Send them the money \n 2. Block them\n 3. Play around with them by baiting them");
        
        int answer1 = input.nextInt();
        // prints the answer responses
        if (answer1 == 2) {
            questionsanswered++;
            correctanswers++;
            System.out.println("Good job! You blocked the scammer and protected yourself from potential harm.\n \n \n Press enter to continue.");
        }else if (answer1 == 1) {
            questionsanswered++;
            wronganswers++;
            System.out.println("You are a fool for sending money to a stranger.\n \n \n Press enter to continue.");
        }else if (answer1 == 3) {
            questionsanswered++;
            wronganswers++;
            System.out.println("They may be able to get your information or mislead you into actually giving them money.\n \n \n Press enter to continue.");
        };
        //clears the console
// after the feedback message that ends with "Press enter to continue."
input.nextLine();  // Consume the newline left-over
if (input.nextLine().isEmpty()) {
System.out.print("\033[H\033[2J\033[3J");   // added \033[3J to clear scrollback in many terminals
System.out.flush();
}
        System.out.println("Questions Answered: " + questionsanswered + "/" + totalquestions + "\n \n \n ");
        System.out.println("Q2: You click on a link from a friend that says you won a free iphone, what do you do? \n \n \n 1. Click the claim prize button\n 2. Close the website\n 3. Share the website with your friends \n 4. Close the website and tell your friend that their account may have been hacked");
        int answer2 = input.nextInt();
        //checks answer and prints responses
        if (answer2 == 4) {
            questionsanswered++;
            correctanswers++;
            System.out.println("Good job! You closed the website and informed your friend about the potential hack, which helps protect both you and your friend from potential scams or malware.\n \n \n Press enter to continue.");
        }else if (answer2 == 1) {
            questionsanswered++;
            wronganswers++;
            System.out.println("You may have just given scammers access to your personal information or installed malware on your device.\n \n \n Press enter to continue.");
        }else if (answer2 == 2) {
            questionsanswered++;
            wronganswers++;
            System.out.println("While you did close the website, it would have been better to also inform your friend about the potential hack to help protect them as well.\n \n \n Press enter to continue.");
        }else if (answer2 == 3) {
            questionsanswered++;
            wronganswers++;
            System.out.println("Sharing the website with your friends could potentially put them at risk of falling for the same scam or malware. \n \n \n Press enter to continue.");
        };

        //clears the console for cleanliness
        input.nextLine();
        if (input.nextLine().isEmpty()) {
            System.out.print("\033[H\033[2J");
            System.out.flush();
        };
        //question 3
        System.out.println("Questions Answered: " + questionsanswered + "/" + totalquestions + "\n \n \n ");
        System.out.println("Q3: You receive an email from your bank asking you to verify your account information, what do you do? \n \n \n 1. Click the link in the email and enter your information\n 2. Delete the email & block account just in case \n 3. Go to the legitimate bank website and log in to check for any issues with your account & block the account");
        int answer3 = input.nextInt();

        //checks answer and prints responses
        if (answer3 == 3) {
            questionsanswered++;
            correctanswers++;
            System.out.println("Good job! You went to the legitimate bank website to check for any issues with your account and blocked the account if necessary.\n \n \n Press enter to continue.");
        } else if (answer3 == 1) {
            questionsanswered++;
            wronganswers++;
            System.out.println("You may have just given scammers access to your personal information or installed malware on your device.\n \n \n Press enter to continue.");
        } else if (answer3 == 2) {
            questionsanswered++;
            wronganswers++;
            System.out.println("While you deleted the email and blocked the account, it would have been better to also verify the legitimacy of the email and check your account directly.\n \n \n Press enter to continue.");
        };

        input.nextLine();  // Consume the newline left-over
        if (input.nextLine().isEmpty()) {
            System.out.print("\033[H\033[2J\033[3J");   // added \033[3J to clear scrollback in many terminals
            System.out.flush();
        }

        //question 4
        System.out.println("Questions Answered: " + questionsanswered + "/" + totalquestions + "\n \n \n ");
        System.out.println("Q4: You receive a friend request from someone you don't know, what do you do? \n \n \n 1. Accept the friend request & act friendly with them \n 2. Ignore the friend request\n 3. Accept the friend request and ask more questions to see if they are a scammer");
        int answer4 = input.nextInt();
        //checks answer and prints responses
        if (answer4 == 2) {
            questionsanswered++;
            correctanswers++;
            System.out.println("Good job! You declined the friend request, which helps protect your privacy and security.\n \n \n Press enter to continue.");
        }else if (answer4 == 1) {
            questionsanswered++;
            wronganswers++;
            System.out.println("You may have just given scammers access to your personal information or installed malware on your device.");
        }else if (answer4 == 3) {
            questionsanswered++;
            wronganswers++;
            System.out.println("While asking for more information is a good idea, it's still better to decline the friend request if you don't know the person.\n \n \n Press enter to continue.");
        };

        input.nextLine();  // Consume the newline left-over
        if (input.nextLine().isEmpty()) {
        System.out.print("\033[H\033[2J\033[3J");   // added \033[3J to clear scrollback in many terminals
        System.out.flush();
        
    }
        //question 5
        System.out.println("Questions Answered: " + questionsanswered + "/" + totalquestions + "\n \n \n ");
        System.out.println("Q5: You and your friend go to a party, you get drunk, your friend starts taking pictures of you and posts them on " + SocialMedia[index] + ", what do you do? \n \n \n 1. Ask your friend to take down the pictures\n 2. Ignore the pictures\n 3. Post more pictures of yourself to distract from the ones your friend posted");
        int answer5 = input.nextInt();

        //checks answer and prints responses
        if (answer5 == 1) {
            questionsanswered++;
            correctanswers++;
            System.out.println("Good job! You asked your friend to take down the pictures, which helps protect your privacy and reputation.\n \n \n Press enter to continue.");
        }else if (answer5 == 2) {
            questionsanswered++;
            wronganswers++;
            System.out.println("Ignoring the pictures may allow them to continue to be shared and potentially harm your reputation or privacy.\n \n \n Press enter to continue.");
        }else if (answer5 == 3) {
            questionsanswered++;
            wronganswers++;
            System.out.println("Posting more pictures of yourself may not effectively distract from the ones your friend posted and could potentially draw more attention to them.\n \n \n Press enter to continue."); 
        };

        //clears the console for cleanliness
        input.nextLine();
        if (input.nextLine().isEmpty()) {
            System.out.print("\033[H\033[2J");
            System.out.flush();
        };

        System.out.println("Questions Answered: " + questionsanswered + "/" + totalquestions + "\n \n \n ");
        System.out.println("Q6: You and your friend are on a band trip and make a reel tagging the place you're at while still at the event, what do you do? \n \n \n 1. Post the reel and tag the location\n 2. Post the reel without tagging the location\n 3. Post the reel with location after you leave the event");
        int answer6 = input.nextInt();

        //checks answer and prints responses
        if (answer6 == 2) {
            questionsanswered++;
            correctanswers++;
            System.out.println("Good job! You posted the reel without tagging the location, which helps protect your privacy and security.\n \n \n Press enter to continue.");
        }else if (answer6 == 1) {
            questionsanswered++;
            wronganswers++;
            System.out.println("Posting the reel and tagging the location may allow others to know your whereabouts and potentially put you at risk.\n \n \n Press enter to continue.");
        }else if (answer6 == 3) {
            questionsanswered++;
            correctanswers++;
            System.out.println("Good job! You posted the reel with location after you leave the event, which helps protect your privacy and security.\n \n \n Press enter to continue.");
     };

     input.nextLine();
     if (input.nextLine().isEmpty()) {
        System.out.print("\033[H\033[2J");
        System.out.flush();
     };

        System.out.println("Questions Answered: " + questionsanswered + "/" + totalquestions + "\n \n \n ");
        System.out.println("Q7: You receive a message from a stranger on" + SocialMedia[index] + "asking for your phone number, what do you do? \n \n \n 1. Give them your phone number\n 2. Ignore the message\n 3. Respond to the message and ask why they want your phone number");
        int answer7 = input.nextInt();

        //checks answer and prints responses
        if (answer7 == 2) {
            questionsanswered++;
            correctanswers++;
            System.out.println("Good job! You ignored the message, which helps protect your privacy and security.\n \n \n Press enter to continue.");
        }else if (answer7 == 1) {
            questionsanswered++;
            wronganswers++;
            System.out.println("Giving a stranger your phone number may allow them to contact you and potentially put you at risk.\n \n \n Press enter to continue.");
        }else if (answer7 == 3) {
            questionsanswered++;
            wronganswers++;
            System.out.println("Responding to the message and asking why they want your phone number may still allow the stranger to contact you and potentially put you at risk.\n \n \n  Press enter to continue.");
        };

        input.nextLine();
        if (input.nextLine().isEmpty()) {
            System.out.print("\033[H\033[2J");
            System.out.flush();
         };

        System.out.println("Questions Answered: " + questionsanswered + "/" + totalquestions + "\n \n \n ");
        System.out.println("Q8: You receive a message from a stranger on " + SocialMedia[index] + " asking for your SSN (social Security number), what do you do? \n \n \n 1. Give them your SSN\n 2. Ignore the message\n 3. Respond to the message and ask why they want your SSN");
        int answer8 = input.nextInt();

        //checks answer and prints responses
        if (answer8 == 2) {
            questionsanswered++;
            correctanswers++;
            System.out.println("Good job! You ignored the message, which helps protect your privacy and security.\n \n \n Press enter to continue.");
        }else if (answer8 == 1) {
            questionsanswered++;
            wronganswers++;
            System.out.println("Giving a stranger your SSN may allow them to access your personal information and potentially put you at risk.\n \n \n Press enter to continue.");
        }else if (answer8 == 3) {
            questionsanswered++;
            wronganswers++;
            System.out.println("Responding to the message and asking why they want your SSN may still allow the stranger to contact you and potentially put you at risk.\n \n \n  Press enter to continue.");
        };

        input.nextLine();
        if (input.nextLine().isEmpty()) {
            System.out.print("\033[H\033[2J");
            System.out.flush();
         };

        System.out.println("Questions Answered: " + questionsanswered + "/" + totalquestions + "\n \n \n ");
        System.out.println("Q9: You're talking witht someone online and they say something that you dont like, what do you do? \n \n \n 1. Tell them to stop and block them if they dont\n 2. Ignore the comment\n 3. Respond with a mean comment");
        int answer9 = input.nextInt();

        //checks answer and prints responses
        if (answer9 == 1) {
            questionsanswered++;
            correctanswers++;
            System.out.println("Good job! You told them to stop and blocked them if they didn't, which helps protect your privacy and security.\n \n \n Press enter to continue.");
        }else if (answer9 == 2) {
            questionsanswered++;
            wronganswers++;
            System.out.println("Ignoring the comment is a good way to avoid conflict and protect your privacy.\n \n \n Press enter to continue.");
        }else if (answer9 == 3) {
            questionsanswered++;
            wronganswers++;
            System.out.println("Responding with a mean comment may escalate the situation and put you at risk.\n \n \n  Press enter to continue.");
        };

        input.nextLine();
        if (input.nextLine().isEmpty()) {
            System.out.print("\033[H\033[2J");
            System.out.flush();
         };

        System.out.println("Questions Answered: " + questionsanswered + "/" + totalquestions + "\n \n \n ");
        System.out.println("Q10: You receive a message from a stranger on " + SocialMedia[index] +" asking for pictures of yourself and it makes you uncomfortable, what do you do? \n \n \n 1. Give them your pictures\n 2. Ignore the message\n 3. Respond to the message and ask why they want your pictures");
        int answer10 = input.nextInt();

        //checks answer and prints responses
        if (answer10 == 2) {
            questionsanswered++;
            correctanswers++;
            System.out.println("Good job! You ignored the message, which helps protect your privacy and security.\n \n \n Press enter to continue.");
        }else if (answer10 == 1) {
            questionsanswered++;
            wronganswers++;
            System.out.println("Giving a stranger your pictures may allow them to access your personal information and potentially put you at risk.\n \n \n Press enter to continue.");
        }else if (answer10 == 3) {
            questionsanswered++;
            wronganswers++;
            System.out.println("Responding to the message and asking why they want your pictures may still allow the stranger to contact you and potentially put you at risk.\n \n \n  Press enter to continue.");
        };

        input.nextLine();
        if (input.nextLine().isEmpty()) {
            System.out.print("\033[H\033[2J");
            System.out.flush();
         };

        System.out.println("Questions Answered: " + questionsanswered + "/" + totalquestions + "\n \n \n ");
        System.out.println("Q11: You receive a message from a stranger on" + SocialMedia[index] + "asking for your address, what do you do? \n \n \n 1. Give them your address\n 2. Ignore the message\n 3. Respond to the message and ask why they want your address");
        int answer11 = input.nextInt();

        //checks answer and prints responses
        if (answer11 == 2) {
            questionsanswered++;
            correctanswers++;
            System.out.println("Good job! You ignored the message, which helps protect your privacy and security.\n \n \n Press enter to continue.");
        }else if (answer11 == 1) {
            questionsanswered++;
            wronganswers++;
            System.out.println("Giving a stranger your address may allow them to access your personal information and potentially put you at risk.\n \n \n Press enter to continue.");
        }else if (answer11 == 3) {
            questionsanswered++;
            wronganswers++;
            System.out.println("Responding to the message and asking why they want your address may still allow the stranger to contact you and potentially put you at risk.\n \n \n  Press enter to continue.");
        };

        input.nextLine();
        if (input.nextLine().isEmpty()) {
            System.out.print("\033[H\033[2J");
            System.out.flush();
         };
    System.out.println("Thanks For Playing !\n\n\n Score:" correctanswers "/" totalquestions "\n\nHope You Had Fun!");
        
 }
}