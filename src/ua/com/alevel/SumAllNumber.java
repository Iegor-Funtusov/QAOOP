package ua.com.alevel;

/**
 * @author Iehor Funtusov, created 16/12/2020 - 8:46 PM
 */

public class SumAllNumber {

    private static final int DISHARGE = 10;
    private static final int ZERO = 0;

    public int getSum(int number) {

        Test test = new Test();
//        test.a;

        int sum = ZERO;
        while (number != ZERO) {
            int last = number % DISHARGE;
            sum += last;
            number = number / DISHARGE;
        }
        return sum;
    }
}
