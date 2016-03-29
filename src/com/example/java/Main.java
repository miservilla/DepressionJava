package com.example.java;

import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println("Hello, this program will help you complete the PHQ-9 depression questionnaire.\n\n"
                + "Use the following responses to answer ALL 9 questions:\n"
                + "0 = Not at all, 1 = Several days, 2 = More than half the days, 3 = Nearly every day.\n\n"
                + "Over the past 2 weeks, how often have you been bothered by the following problems:\n");

        System.out.println("Little interest or pleasure in doing things? ");
        int Item1 = in.nextInt();
        System.out.println("Feeling down, depressed, or hopeless? ");
        int Item2 = in.nextInt();
        System.out.println("Trouble falling or staying asleep, or sleeping too much? ");
        int Item3 = in.nextInt();
        System.out.println("Feeling tired or having little energy? ");
        int Item4 = in.nextInt();
        System.out.println("Poor appetite or overeating? ");
        int Item5 = in.nextInt();
        System.out.println("Feeling bad about yourself — or that you are a failure or\n"
                + "have let yourself or your family down? ");
        int Item6 = in.nextInt();
        System.out.println("Trouble concentrating on things, such as reading the\n"
                + "newspaper or watching television? ");
        int Item7 = in.nextInt();
        System.out.println("Moving or speaking so slowly that other people could have\n"
                + "noticed? Or the opposite — being so fidgety or restless\n"
                + "that you have been moving around a lot more than usual? ");
        int Item8 = in.nextInt();
        System.out.println("Thoughts that you would be better off dead or of hurting\n"
                + "yourself in some way? ");
        int Item9 = in.nextInt();

        int mddCount = 0;

        if (Item1 + Item2 > 3) {
            int[] mddArray = {Item1, Item2, Item3, Item4, Item5, Item6, Item7, Item8};

            for (int var : mddArray) {
                if (var >= 2) {
                    mddCount++;
                }
            }
            if (Item9 > 0) {
                mddCount++;
            }


        }

        if (mddCount >= 5){
            System.out.println("\nMajor Depressive Syndrome criteria is met!\n"
                    + "\nIf there is no history of a manic episode; no evidence that a physical\n"
                    + "disorder, medication, or other drug caused the depression; and no indication\n"
                    + "that the depressive symptoms were normal bereavement, then Major Depressive\n"
                    + "Disorder diagnosis is present.\n");
        }

        int totalScore = (Item1 + Item2 + Item3 + Item4 + Item5 + Item6 + Item7 + Item8 + Item9);

        switch (totalScore)
        {

            case 0:
            case 1:
            case 2:
            case 3:
            case 4:
            {
                System.out.println("\nThe PHQ-9 severity score was " + totalScore + ".");
                System.out.println("\nNone to minimal depression. No further action recommended.");
                break;
            }
            case 5:
            case 6:
            case 7:
            case 8:
            case 9:
            {
                System.out.println("\nThe PHQ-9 severity score was " + totalScore + ".");
                System.out.println("\nMild depression. Watchful waiting; repeat PHQ-9 at follow-up is recommended.");
                break;
            }
            case 10:
            case 11:
            case 12:
            case 13:
            case 14:
            {
                System.out.println("\nThe PHQ-9 severity score was " + totalScore + ".");
                System.out.println("\nModerate depression. Treatment plan, considering counseling, follow-up and/or\n"
                        + "pharmacotherapy is recommended.");
                break;
            }
            case 15:
            case 16:
            case 17:
            case 18:
            case 19:
            {
                System.out.println("\nThe PHQ-9 severity score was " + totalScore + ".");
                System.out.println("\nModerately severe depression. Active treatment with pharmacotherapy and/or\n"
                        + "psychotherapy is recommended.");
                break;
            }
            default:
            {
                System.out.println("\nThe PHQ-9 severity score was " + totalScore + ".");
                System.out.println("\nSevere depression. Immediate initiation of pharmacotherapy and, if severe\n"
                        + "impairment or poor response to therapy, expedited referral to a mental health specialist\n"
                        + " for psychotherapy and/or collaborative management.");
                break;

            }
        }

        if (Item9 > 0){
            System.out.println("\nSuicide ideation is present, please assess the potential threat!\n");
        }

    }
}
