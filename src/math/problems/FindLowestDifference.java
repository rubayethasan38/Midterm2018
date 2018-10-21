package math.problems;
import static java.lang.Math.abs;
public class FindLowestDifference {
    public static void main(String[] args) {
        /*
         Implement in java.
         Read this below two array. Find the lowest difference between the two array cell.
        */
        int [] array1 = {25,15,7,11,22,25,39,9};
        int [] array2 = {3,23,24,8,45,95,13,21};
        int low = -1;
        int diff;
        for(int i : array1)
        {
            for(int j : array2)
            {
                diff = abs((i-j));
                if(low == -1)
                {
                    low = diff;
                }

                if(diff < low)
                {
                    low = diff;
                }
            }
        }
        System.out.print(low);
    }
}