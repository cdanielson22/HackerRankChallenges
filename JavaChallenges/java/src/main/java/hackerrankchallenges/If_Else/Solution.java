package JavaChallenges.java.src.main.java.hackerrankchallenges.If_Else;

import java.util.*;

public class Solution {



    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int N = 0;
        String keepGoing = "y";
        Boolean first = true;
        while(true){
            if (first == false){
                keepGoing = scanner.nextLine();
                System.out.print("Would you like to continue (y or n): ");
            }
            if (keepGoing == "y"){
                System.out.print("Enter a number: ");
                N = scanner.nextInt();

                if (N % 2 == 1) {
                    System.out.println("weird");
                } else {
                    if (N >= 2 && N <= 5){
                        System.out.println("Not weird");
                    } else if (N >= 6 && N <= 20){
                        System.out.println("weird");
                    } else {
                        System.out.println("Not weird");
                    }
                }
                first = false;
            } else {
                scanner.close();
            }
        }
    }

}

