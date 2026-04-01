package core_java_practice.com.practice.practice.scenario_questions.advanced;

import java.util.Scanner;

public class GameScore {
	public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter score of level 1: ");
        int s1 = sc.nextInt();

        System.out.print("Enter score of level 2: ");
        int s2 = sc.nextInt();

        System.out.print("Enter score of level 3: ");
        int s3 = sc.nextInt();

        int total = s1 + s2 + s3;

        System.out.println("Total Score: " + total);
	}   

}
