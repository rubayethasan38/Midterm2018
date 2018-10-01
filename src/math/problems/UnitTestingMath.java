package math.problems;

public class UnitTestingMath {
    public static void main(String[] args) {
        //Apply Unit testing into each classes and methods in this package.
        Assert.assertEquals(120,Factorial.fact(5));
        int[] fiboArrayTest = {0,1,1,2,3,5,8,13};
        Assert.assertEquals(fiboArrayTest,Fibonacci.fibonacci(8));
        int[] array = {10, 2, 1, 4, 5, 3, 7, 8, 6};
        Assert.assertEquals(9,FindMissingNumber.findMissingNumber(array));
        array = new int[]{23, 65, 88, 12, 6, 90, 22, 12};
        Assert.assertEquals(6,LowestNumber.findLowest(array));

    }
}