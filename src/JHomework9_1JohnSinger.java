//
//  @incept:        Created on Mon, Nov 5 12:15:14 2018
//
//  @file:          JHomework9_1JohnSinger.java
//
//  @author:        John Singer
//
//  @description:   This file demonstrates dual-forloops (of different types, courtesy of Java 8),
//                  in calculating Compound-interest calculations (this 'ends up' being a for-loop around
//                  another for-loop).
//
//                  NOTICE:
//                      1) Using the java.util.List, .Arrays, and .ArrayList, I was able to create a 'one-liner'
//                         to both declare the rate variable, and initialize it. This makes 'looping through' the
//                         the collection MUCH easier.  The 'new' Java 8 syntax for collections is much simpler,
//                         just 'for (<datatype><loop-iterator-variable>: <collection-name>) {...}'
//

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static java.util.Arrays.asList;

public class JHomework9_1JohnSinger {
    public static void main(String[] args) {
        double principal = 1000.0; // initial amount before interest

        // Notice that we store the rates as a List of Doubles, initialized in one line.
        List<Double> rateList = new ArrayList<Double>(Arrays.asList(0.05, 0.06, 0.07, 0.08, 0.09, 0.1)); // interest rate

        for (Double r: rateList ) {
            // display headers
            System.out.printf("%nYear @%5.2f percent %20s%n", r, "Amount on deposit");
            System.out.printf("-------------------%20s%n", "    -----------------");

            // calculate & output the amount on deposit for each of ten years
            for (int year = 1; year <= 10; ++year) {

                // calculate new amount on deposit for the specified year
                double amount = principal * Math.pow(1.0 + r, year);

                // display the year and the amount
                System.out.printf("%4d%,29.2f%n", year, amount);
            }
        }
    }
}
