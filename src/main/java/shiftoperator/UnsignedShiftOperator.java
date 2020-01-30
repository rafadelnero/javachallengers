package shiftoperator;

public class UnsignedShiftOperator {

    static final Integer NEGATIVE_DECIMAL_NUMBER = -1;
    static final String NEGATIVE_BIT_NUMBER = Integer.toBinaryString(NEGATIVE_DECIMAL_NUMBER);

    public static void main(String... doYourBest) {
        int unsignedRightShiftOperator =  NEGATIVE_DECIMAL_NUMBER >>> 1;

        System.out.printf("Decimal number: %s and binary number: %s \n", NEGATIVE_DECIMAL_NUMBER, NEGATIVE_BIT_NUMBER);

        printDecimalAndBinary("Unsigned Right Shift:", unsignedRightShiftOperator);
    }

    static void printDecimalAndBinary(String operator, int decimal) {
        System.out.printf("%s Decimal: %s - Binary: %s \n", operator, decimal, Integer.toBinaryString(decimal));
    }

}
