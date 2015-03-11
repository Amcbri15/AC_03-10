package nyc.c4q.Amcbri15;
import java.util.Scanner;
/**
 * Created by c4q-anthony-mcbride on 3/10/15.
 */
public class CounterLoop {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);

        /* System.out.println("Please give me a number to count from: ");
        int iniNum = in.nextInt();

        System.out.println("Please give me a number to count to: ");
        int maxNum = in.nextInt();

        System.out.println("How much would you like to count by? ");
        int increment = in.nextInt();

        //takes user parameters and counts based upon them
        for (int i = iniNum; i <= maxNum; i+= increment){
            System.out.println(i);
        } */

         for (int i = 1; i <= 100; i++){

            if (i % 3 == 0 && i % 5 == 0) {
                System.out.println("FizzBuzz");
            }
            else if(i % 5 == 0) {
                System.out.println("Buzz");
            }
            else if(i % 3 == 0 ){
                System.out.println("Fizz");
            }else {
                System.out.println(i);
            }
        }
    }
}
