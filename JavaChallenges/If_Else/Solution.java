package JavaChallenges.If_Else;

import java.util.*;

public class Solution {



    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int N = 0;
        String keepGoing = "y";
        Boolean first = true;
        while(true){
            if (first == false){
                System.out.print("Would you like to continue (y or n): ");
                keepGoing = scanner.nextLine();
                first = false;
            }
            if (keepGoing == "y"){
                N = scanner.nextInt();
                scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

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
            } else {
                scanner.close();
            }
        }
    }

}

