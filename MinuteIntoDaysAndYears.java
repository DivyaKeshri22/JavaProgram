package minute_into_no_of_days_and_years;

import java.util.Scanner;

/**
 *
 * @author Divyendu
 */
public class Minute_into_no_of_days_and_years {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
         double minutesInYear = 60 * 24 * 365;
        Scanner input = new Scanner(System.in);

        System.out.print("Input the number of minutes: ");

        double min = input.nextDouble();

        long years = (long) (min / minutesInYear);
        int days = (int) (min / 60 / 24) % 365;

        System.out.println((int) min + " minutes is approximately " + years + " years and " + days + " days");
    }
    
}
