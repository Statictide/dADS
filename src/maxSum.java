import java.util.Arrays;
import java.util.Scanner;

/**
 * Created by Mark on 27-01-2017.
 */
public class maxSum {
    /**
     * @Precondition: x must be a rectangular array
     * @param args
     */
    public static void main(String[] args) {
        final int n = 3;
        //Fill x
        int x[][] = new int[3][3];
        try{
            Scanner sc = new Scanner(System.in);
            for (int i = 0; i < n; i++) {
                for (int j = 0; j < n; j++) {
                    x[i][j] = sc.nextInt();
                }
            }
        } catch(Exception e){return;}

        System.out.println(Arrays.deepToString(x));

        int rowSum[];
        int maxSoFar = 0;        int maxEndingHere = 0;

        for (int L = 0; L < x.length; L++) {
            rowSum = new int[3];
            for (int R = L; R < x.length; R++) {
                maxEndingHere = 0;
                for (int i = 0; i < rowSum.length; i++) {
                    //Find max sumSequence in new rowSum
                    rowSum[i] += x[R][i];
                    maxEndingHere = Math.max(maxEndingHere + rowSum[i], 0);
                    maxSoFar = Math.max(maxSoFar, maxEndingHere);
                }
            }
        }

        System.out.println(maxSoFar);
    }
}
