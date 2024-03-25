import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Random rnd = new Random();
        Scanner in = new Scanner(System.in);
        final int SIZE = 100;
        int[] dataPoints = new int[SIZE];
        int val1 = rnd.nextInt(100); // gives a value from 0 to 99
        int val2 = rnd.nextInt(100) + 1; // gives a value from 1 to 100
        int sumOfPoints = 0;
        double aveOfPoints = 0;
        int input = 0;
        int recCnt = 0;
        int i = 0;
        int dataMax = 0;
        int dataMin = 0;
        boolean done = false;
//        int index = rnd.nextInt(dataPoints.length);

        for (i = 0; i < dataPoints.length; i++) {
            dataPoints[i] = rnd.nextInt(100) + 1;
        }


//        for ( i = 0; i < dataPoints.length; i++) {
//            System.out.printf("%3d | " , dataPoints[i]);
//        }
//
//        for ( i=0; i < dataPoints.length; i++) {
//           sumOfPoints += dataPoints[i];
//        }
//        System.out.println();
//
//        aveOfPoints = (double) sumOfPoints/ dataPoints.length;
//
//         System.out.println("The sum of the random array is " + sumOfPoints);
//         System.out.println("The average of the random array is " + aveOfPoints);

//        input = SafeInput.getRangedInt(in, "Give an input value(1-100) ", 1, 100);
//        for ( i = 0; i < dataPoints.length; i++)
//           {
//               if (dataPoints[i] == input)
//               recCnt++;
//               else
//                      ;
//                 }
//                      System.out.println("The number of times the loop found your input is " + recCnt);

//       input = SafeInput.getRangedInt(in, "Give an input value(1-100) ", 1, 100);
//            for ( i = 0; i < dataPoints.length; i++)
//            {
//                if (dataPoints[i] == input)
//                {
//                    System.out.println( "The value "  + input + " was found at array index " + i);
//                    break;
//                }
//                else if (i == SIZE)
//                {
//                    System.out.println( "The value "  + input + " was not found ");
//                    break;
//                }
//                else
//                {
//                    ;
//                }
//
//
//
//            }

//        for (i = 0; i < dataPoints.length; i++) {
//
//            if (dataPoints[i] > dataMax)
//               dataMax = dataPoints[i];
//
//            if (dataPoints[i] < dataMin)
//               dataMin = dataPoints[i];
//          }
//        System.out.println("The maximum value in the array is " + dataMax);
//        System.out.println("The minimum value in the array is " + dataMin);
//        System.out.println("\tThe average of dataPoints is: " + getAverage(dataPoints));

    }


        public static double getAverage(int values[])
        {
           int sumOfPoints = 0;
           double aveOfPoints = 0;
            int i = 0;

         for ( i=0; i < values.length; i++) {
               sumOfPoints += values[i];
        }
        aveOfPoints = (double) sumOfPoints/values.length;
        return aveOfPoints;
        }
}