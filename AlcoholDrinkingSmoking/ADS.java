import java.util.Scanner;  // Import the Scanner class
import java.io.File;
import java.io.IOException; 
import java.io.PrintWriter; //write the words to the file
import java.io.FileWriter;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.charset.StandardCharsets;

public class ADS{
    static int totalQuestions = 40;
    int currentQuestion = 1;
    int correctAnswers = 0;
    int incorrectAnswers = 0;
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in); // Creates Scanner
        Path path = Paths.get("Scores.txt"); //creates file

        try {
      FileWriter Writer = new FileWriter("Scores.txt");
      Writer.write("Files in Java might be tricky, but it is fun enough!");
      System.out.println("Successfully wrote to the file.");
        Writer.close();  // must close manually

    } catch (IOException e) {
      System.out.println("An error occurred.");
      e.printStackTrace();
    }
        //^ creates file

        // Introduction
        System.out.println("Welcome to the Alcohol, Drinking, and Smoking Quiz!");
        System.out.println("You will be asked " + totalQuestions + " questions. Good luck!");
        System.out.println("Press Enter to start...");
        String a = scanner.nextLine(); // Waits for user to press Enter
        if (a.isEmpty()) {
            System.out.println("Starting quiz...");
        System.out.print("\033[H\033[2J");//clears console for cleanliness
        System.out.flush();
        }
        // Q1
        System.out.println("Q1: What is a short-term effect of alcohol use?\n\n1. Improved memory\n2. Slurred speech\n3. Stronger lungs");
        int answer1 = scanner.nextInt();
        if (answer1 == 2) {
            questionsanswered++; correctanswers++;
            System.out.println("Correct! Alcohol can cause slurred speech.\n\nPress enter to continue.");
        } else {
            questionsanswered++; wronganswers++;
            System.out.println("Incorrect. Alcohol commonly causes slurred speech.\n\nPress enter to continue.");
        }

        // Q2
        System.out.println("Q2: Which of the following is a risk of smoking tobacco?\n\n1. Lung cancer\n2. Better eyesight\n3. Stronger heart");
        int answer2 = input.nextInt();
        if (answer2 == 1) {
            questionsanswered++; correctanswers++;
            System.out.println("Correct! Smoking increases lung cancer risk.\n\nPress enter to continue.");
        } else {
            questionsanswered++; wronganswers++;
            System.out.println("Incorrect. Smoking is linked to lung cancer.\n\nPress enter to continue.");
        }

        // Q3
        System.out.println("Q3: What should you do if pressured to try drugs?\n\n1. Say no and leave\n2. Try once\n3. Ignore risks");
        int answer3 = input.nextInt();
        if (answer3 == 1) {
            questionsanswered++; correctanswers++;
            System.out.println("Good choice! Saying no protects your health.\n\nPress enter to continue.");
        } else {
            questionsanswered++; wronganswers++;
            System.out.println("Not safe. Avoiding drugs is best.\n\nPress enter to continue.");
        }

        // Q4
        System.out.println("Q4: What is nicotine?\n\n1. Vitamin\n2. Addictive chemical\n3. Protein");
        int answer4 = input.nextInt();
        if (answer4 == 2) {
            questionsanswered++; correctanswers++;
            System.out.println("Correct! Nicotine is addictive.\n\nPress enter to continue.");
        } else {
            questionsanswered++; wronganswers++;
            System.out.println("Incorrect. Nicotine is addictive.\n\nPress enter to continue.");
        }

        // Q5
        System.out.println("Q5: Drinking too much quickly is called?\n\n1. Hydration\n2. Binge drinking\n3. Detox");
        int answer5 = input.nextInt();
        if (answer5 == 2) {
            questionsanswered++; correctanswers++;
            System.out.println("Correct! It's binge drinking.\n\nPress enter to continue.");
        } else {
            questionsanswered++; wronganswers++;
            System.out.println("Incorrect. It's called binge drinking.\n\nPress enter to continue.");
        }

        // Q6
        System.out.println("Q6: Which organ does alcohol mainly affect?\n\n1. Liver\n2. Skin\n3. Bones");
        int answer6 = input.nextInt();
        if (answer6 == 1) {
            questionsanswered++; correctanswers++;
            System.out.println("Correct! The liver processes alcohol.\n\nPress enter to continue.");
        } else {
            questionsanswered++; wronganswers++;
            System.out.println("Incorrect. The liver is most affected.\n\nPress enter to continue.");
        }

        // Q7
        System.out.println("Q7: Secondhand smoke is?\n\n1. Safe\n2. Smoke from others\n3. Clean air");
        int answer7 = input.nextInt();
        if (answer7 == 2) {
            questionsanswered++; correctanswers++;
            System.out.println("Correct! It harms others.\n\nPress enter to continue.");
        } else {
            questionsanswered++; wronganswers++;
            System.out.println("Incorrect. It is harmful smoke.\n\nPress enter to continue.");
        }

        // Q8
        System.out.println("Q8: Which is a stimulant?\n\n1. Cocaine\n2. Alcohol\n3. Heroin");
        int answer8 = input.nextInt();
        if (answer8 == 1) {
            questionsanswered++; correctanswers++;
            System.out.println("Correct! Cocaine is a stimulant.\n\nPress enter to continue.");
        } else {
            questionsanswered++; wronganswers++;
            System.out.println("Incorrect. Cocaine is the stimulant.\n\nPress enter to continue.");
        }

        // Q9
        System.out.println("Q9: What is addiction?\n\n1. Healthy habit\n2. Loss of control\n3. Mood");
        int answer9 = input.nextInt();
        if (answer9 == 2) {
            questionsanswered++; correctanswers++;
            System.out.println("Correct! Addiction is loss of control.\n\nPress enter to continue.");
        } else {
            questionsanswered++; wronganswers++;
            System.out.println("Incorrect. That's not correct.\n\nPress enter to continue.");
        }

        // Q10
        System.out.println("Q10: Alcohol is a?\n\n1. Depressant\n2. Stimulant\n3. Vitamin");
        int answer10 = input.nextInt();
        if (answer10 == 1) {
            questionsanswered++; correctanswers++;
            System.out.println("Correct! Alcohol is a depressant.\n\nPress enter to continue.");
        } else {
            questionsanswered++; wronganswers++;
            System.out.println("Incorrect. Alcohol slows the body.\n\nPress enter to continue.");
        }

        // Q11
        System.out.println("Q11: Long-term smoking can cause?\n\n1. Heart disease\n2. Better breathing\n3. Strong lungs");
        int answer11 = input.nextInt();
        if (answer11 == 1) { questionsanswered++; correctanswers++;
            System.out.println("Correct!\n\nPress enter to continue.");
        } else { questionsanswered++; wronganswers++;
            System.out.println("Incorrect.\n\nPress enter to continue.");
        }

        // Q12
        System.out.println("Q12: Legal drinking age in U.S.?\n\n1. 21\n2. 18\n3. 16");
        int answer12 = input.nextInt();
        if (answer12 == 1) { questionsanswered++; correctanswers++;
            System.out.println("Correct!\n\nPress enter to continue.");
        } else { questionsanswered++; wronganswers++;
            System.out.println("Incorrect.\n\nPress enter to continue.");
        }

        // Q13
        System.out.println("Q13: Overdose means?\n\n1. Safe use\n2. Too much drug\n3. Small dose");
        int answer13 = input.nextInt();
        if (answer13 == 2) { questionsanswered++; correctanswers++;
            System.out.println("Correct!\n\nPress enter to continue.");
        } else { questionsanswered++; wronganswers++;
            System.out.println("Incorrect.\n\nPress enter to continue.");
        }

        // Q14
        System.out.println("Q14: Vaping often contains?\n\n1. Nicotine\n2. Water\n3. Vitamins");
        int answer14 = input.nextInt();
        if (answer14 == 1) { questionsanswered++; correctanswers++;
            System.out.println("Correct!\n\nPress enter to continue.");
        } else { questionsanswered++; wronganswers++;
            System.out.println("Incorrect.\n\nPress enter to continue.");
        }

        // Q15
        System.out.println("Q15: Alcohol affects reaction time?\n\n1. Slows it\n2. Speeds it\n3. No effect");
        int answer15 = input.nextInt();
        if (answer15 == 1) { questionsanswered++; correctanswers++;
            System.out.println("Correct!\n\nPress enter to continue.");
        } else { questionsanswered++; wronganswers++;
            System.out.println("Incorrect.\n\nPress enter to continue.");
        }

        // Q16
        System.out.println("Q16: Which is considered a gateway drug?\n\n1. Alcohol\n2. Tobacco\n3. Both");
        int answer16 = input.nextInt();
        if (answer16 == 3) {
            questionsanswered++; correctanswers++;
            System.out.println("Correct! Both alcohol and tobacco are considered gateway drugs.\n\nPress enter to continue.");
        } else {
            questionsanswered++; wronganswers++;
            System.out.println("Incorrect. Both alcohol and tobacco can be gateway drugs.\n\nPress enter to continue.");
        }

        // Q17
        System.out.println("Q17: Mixing drugs and alcohol is?\n\n1. Safe\n2. Sometimes okay\n3. Dangerous");
        int answer17 = input.nextInt();
        if (answer17 == 3) {
            questionsanswered++; correctanswers++;
            System.out.println("Correct! Mixing substances is dangerous.\n\nPress enter to continue.");
        } else {
            questionsanswered++; wronganswers++;
            System.out.println("Incorrect. It is very dangerous.\n\nPress enter to continue.");
        }

        // Q18
        System.out.println("Q18: Withdrawal symptoms occur when?\n\n1. Stopping use\n2. Starting use\n3. Sleeping");
        int answer18 = input.nextInt();
        if (answer18 == 1) {
            questionsanswered++; correctanswers++;
            System.out.println("Correct! Withdrawal happens when stopping.\n\nPress enter to continue.");
        } else {
            questionsanswered++; wronganswers++;
            System.out.println("Incorrect. It happens when stopping use.\n\nPress enter to continue.");
        }

        // Q19
        System.out.println("Q19: THC is found in?\n\n1. Tobacco\n2. Marijuana\n3. Alcohol");
        int answer19 = input.nextInt();
        if (answer19 == 2) {
            questionsanswered++; correctanswers++;
            System.out.println("Correct! THC is in marijuana.\n\nPress enter to continue.");
        } else {
            questionsanswered++; wronganswers++;
            System.out.println("Incorrect. THC is found in marijuana.\n\nPress enter to continue.");
        }

        // Q20
        System.out.println("Q20: Smoking harms which system?\n\n1. Respiratory\n2. Digestive\n3. Skeletal");
        int answer20 = input.nextInt();
        if (answer20 == 1) {
            questionsanswered++; correctanswers++;
            System.out.println("Correct! Smoking damages the respiratory system.\n\nPress enter to continue.");
        } else {
            questionsanswered++; wronganswers++;
            System.out.println("Incorrect. It harms the respiratory system.\n\nPress enter to continue.");
        }

        // Q21
        System.out.println("Q21: Driving under the influence is?\n\n1. Safe\n2. Illegal and dangerous\n3. Recommended");
        int answer21 = input.nextInt();
        if (answer21 == 2) {
            questionsanswered++; correctanswers++;
            System.out.println("Correct! It is illegal and dangerous.\n\nPress enter to continue.");
        } else {
            questionsanswered++; wronganswers++;
            System.out.println("Incorrect. It is illegal and dangerous.\n\nPress enter to continue.");
        }

        // Q22
        System.out.println("Q22: Peer pressure can lead to?\n\n1. Good sleep\n2. Better grades\n3. Risky decisions");
        int answer22 = input.nextInt();
        if (answer22 == 3) {
            questionsanswered++; correctanswers++;
            System.out.println("Correct! Peer pressure can lead to risky decisions.\n\nPress enter to continue.");
        } else {
            questionsanswered++; wronganswers++;
            System.out.println("Incorrect. It often leads to risky choices.\n\nPress enter to continue.");
        }

        // Q23
        System.out.println("Q23: Prescription drug misuse means?\n\n1. Using incorrectly\n2. Following directions\n3. Avoiding use");
        int answer23 = input.nextInt();
        if (answer23 == 1) {
            questionsanswered++; correctanswers++;
            System.out.println("Correct! Misuse means using incorrectly.\n\nPress enter to continue.");
        } else {
            questionsanswered++; wronganswers++;
            System.out.println("Incorrect. Misuse means improper use.\n\nPress enter to continue.");
        }

        // Q24
        System.out.println("Q24: A sign of alcohol poisoning?\n\n1. Energy\n2. Unconsciousness\n3. Hunger");
        int answer24 = input.nextInt();
        if (answer24 == 2) {
            questionsanswered++; correctanswers++;
            System.out.println("Correct! Unconsciousness is a serious sign.\n\nPress enter to continue.");
        } else {
            questionsanswered++; wronganswers++;
            System.out.println("Incorrect. That is not correct.\n\nPress enter to continue.");
        }

        // Q25
        System.out.println("Q25: Tobacco smoke contains?\n\n1. Clean air\n2. Water vapor\n3. Thousands of chemicals");
        int answer25 = input.nextInt();
        if (answer25 == 3) {
            questionsanswered++; correctanswers++;
            System.out.println("Correct! It contains thousands of chemicals.\n\nPress enter to continue.");
        } else {
            questionsanswered++; wronganswers++;
            System.out.println("Incorrect. It contains many harmful chemicals.\n\nPress enter to continue.");
        }

        // Q26
        System.out.println("Q26: Addiction affects?\n\n1. Hair\n2. Nails\n3. Brain function");
        int answer26 = input.nextInt();
        if (answer26 == 3) {
            questionsanswered++; correctanswers++;
            System.out.println("Correct! It affects the brain.\n\nPress enter to continue.");
        } else {
            questionsanswered++; wronganswers++;
            System.out.println("Incorrect. Addiction affects the brain.\n\nPress enter to continue.");
        }

        // Q27
        System.out.println("Q27: A healthy alternative is?\n\n1. Exercise\n2. Smoking\n3. Drinking");
        int answer27 = input.nextInt();
        if (answer27 == 1) {
            questionsanswered++; correctanswers++;
            System.out.println("Correct! Exercise is a healthy choice.\n\nPress enter to continue.");
        } else {
            questionsanswered++; wronganswers++;
            System.out.println("Incorrect. Exercise is healthier.\n\nPress enter to continue.");
        }

        // Q28
        System.out.println("Q28: Energy drinks mixed with alcohol are?\n\n1. Safe\n2. Risky\n3. Healthy");
        int answer28 = input.nextInt();
        if (answer28 == 2) {
            questionsanswered++; correctanswers++;
            System.out.println("Correct! This combination is risky.\n\nPress enter to continue.");
        } else {
            questionsanswered++; wronganswers++;
            System.out.println("Incorrect. It is dangerous.\n\nPress enter to continue.");
        }

        // Q29
        System.out.println("Q29: Smoking during pregnancy is?\n\n1. Safe\n2. Helpful\n3. Harmful");
        int answer29 = input.nextInt();
        if (answer29 == 3) {
            questionsanswered++; correctanswers++;
            System.out.println("Correct! It harms the baby.\n\nPress enter to continue.");
        } else {
            questionsanswered++; wronganswers++;
            System.out.println("Incorrect. It is harmful.\n\nPress enter to continue.");
        }

        // Q30
        System.out.println("Q30: Most addictive substance listed?\n\n1. Nicotine\n2. Water\n3. Sugar");
        int answer30 = input.nextInt();
        if (answer30 == 1) {
            questionsanswered++; correctanswers++;
            System.out.println("Correct! Nicotine is highly addictive.\n\nPress enter to continue.");
        } else {
            questionsanswered++; wronganswers++;
            System.out.println("Incorrect. Nicotine is very addictive.\n\nPress enter to continue.");
        }

        // Q31
        System.out.println("Q31: Tolerance means?\n\n1. Less use needed\n2. More needed for same effect\n3. No effect");
        int answer31 = input.nextInt();
        if (answer31 == 2) {
            questionsanswered++; correctanswers++;
            System.out.println("Correct! Tolerance means needing more.\n\nPress enter to continue.");
        } else {
            questionsanswered++; wronganswers++;
            System.out.println("Incorrect. That's not tolerance.\n\nPress enter to continue.");
        }

        // Q32
        System.out.println("Q32: Inhalants are?\n\n1. Food\n2. Drinks\n3. Chemicals breathed in");
        int answer32 = input.nextInt();
        if (answer32 == 3) {
            questionsanswered++; correctanswers++;
            System.out.println("Correct! Inhalants are dangerous chemicals.\n\nPress enter to continue.");
        } else {
            questionsanswered++; wronganswers++;
            System.out.println("Incorrect. They are chemicals.\n\nPress enter to continue.");
        }

        // Q33
        System.out.println("Q33: Alcohol impairs?\n\n1. Judgment\n2. Vision clarity\n3. Strength");
        int answer33 = input.nextInt();
        if (answer33 == 1) {
            questionsanswered++; correctanswers++;
            System.out.println("Correct! It affects judgment.\n\nPress enter to continue.");
        } else {
            questionsanswered++; wronganswers++;
            System.out.println("Incorrect. It impairs judgment.\n\nPress enter to continue.");
        }

        // Q34
        System.out.println("Q34: Smoking can stain?\n\n1. Skin\n2. Teeth\n3. Hair");
        int answer34 = input.nextInt();
        if (answer34 == 2) {
            questionsanswered++; correctanswers++;
            System.out.println("Correct! Smoking stains teeth.\n\nPress enter to continue.");
        } else {
            questionsanswered++; wronganswers++;
            System.out.println("Incorrect. Teeth are affected.\n\nPress enter to continue.");
        }

        // Q35
        System.out.println("Q35: Refusal skill example?\n\n1. Say no clearly\n2. Ignore situation\n3. Give in");
        int answer35 = input.nextInt();
        if (answer35 == 1) {
            questionsanswered++; correctanswers++;
            System.out.println("Correct! Saying no is effective.\n\nPress enter to continue.");
        } else {
            questionsanswered++; wronganswers++;
            System.out.println("Incorrect. Saying no is best.\n\nPress enter to continue.");
        }

        // Q36
        System.out.println("Q36: Drug misuse affects?\n\n1. Sleep only\n2. Nothing\n3. School/work performance");
        int answer36 = input.nextInt();
        if (answer36 == 3) {
            questionsanswered++; correctanswers++;
            System.out.println("Correct! It affects performance.\n\nPress enter to continue.");
        } else {
            questionsanswered++; wronganswers++;
            System.out.println("Incorrect. It impacts life areas.\n\nPress enter to continue.");
        }

        // Q37
        System.out.println("Q37: E-cigarettes are?\n\n1. Harmless\n2. Not harmless\n3. Vitamins");
        int answer37 = input.nextInt();
        if (answer37 == 2) {
            questionsanswered++; correctanswers++;
            System.out.println("Correct! They are not harmless.\n\nPress enter to continue.");
        } else {
            questionsanswered++; wronganswers++;
            System.out.println("Incorrect. They still carry risks.\n\nPress enter to continue.");
        }

        // Q38
        System.out.println("Q38: Help for addiction includes?\n\n1. Counseling\n2. Ignoring it\n3. Hiding it");
        int answer38 = input.nextInt();
        if (answer38 == 1) {
            questionsanswered++; correctanswers++;
            System.out.println("Correct! Counseling helps.\n\nPress enter to continue.");
        } else {
            questionsanswered++; wronganswers++;
            System.out.println("Incorrect. Help is important.\n\nPress enter to continue.");
        }

        // Q39
        System.out.println("Q39: Alcohol is classified as?\n\n1. Depressant\n2. Vitamin\n3. Mineral");
        int answer39 = input.nextInt();
        if (answer39 == 1) {
            questionsanswered++; correctanswers++;
            System.out.println("Correct! Alcohol is a depressant.\n\nPress enter to continue.");
        } else {
            questionsanswered++; wronganswers++;
            System.out.println("Incorrect. It slows the body.\n\nPress enter to continue.");
        }

        // Q40
        System.out.println("Q40: Best way to avoid substance harm?\n\n1. Not using\n2. Using more\n3. Ignoring risks");
        int answer40 = input.nextInt();
        if (answer40 == 1) {
            questionsanswered++; correctanswers++;
            System.out.println("Correct! Avoiding use is safest.\n\nPress enter to continue.");
        } else {
            questionsanswered++; wronganswers++;
            System.out.println("Incorrect. Avoidance is best.\n\nPress enter to continue.");
        }

    }
}