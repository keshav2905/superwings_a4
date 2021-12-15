package lang_java;

import java.util.*;

class TaxiCharges {

    static int calculateCharges(int distance) {

        int charges = 0;

        while(distance > 15) {
            charges+=15;
            distance--;
        }

        while(distance > 5) {
            charges+=18;
            distance--;
        }

        while(distance > 2) {
            charges+=20;
            distance--;
        }

        charges+=50;

        return charges;
    }
    
    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);

        System.out.println("Enter distance in KM.:");
        int distance = s.nextInt();
        s.close();

        System.out.println(calculateCharges(distance));
    }
}