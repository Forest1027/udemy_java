package primitivetype;

public class WholeDemo {
    public static void main(String[] args) {
        int myValue = 10000;
        int myMinIntValue = Integer.MIN_VALUE;
        int myMaxIntValue = Integer.MAX_VALUE;
        System.out.println(myMinIntValue);
        System.out.println(myMaxIntValue);
        System.out.println(myMaxIntValue + 1);
        System.out.println(myMinIntValue - 1);
        int test = 2_147_483_647;

        byte myMinByte = Byte.MIN_VALUE;
        byte myMaxByte = Byte.MAX_VALUE;
        System.out.println(myMinByte);
        System.out.println(myMaxByte);

        short myMinShort = Short.MIN_VALUE;
        short myMaxShort = Short.MAX_VALUE;
        System.out.println(myMinShort);
        System.out.println(myMaxShort);

        long myLongValue = 100L;
        long myMinLong = Long.MIN_VALUE;
        long myMaxLong = Long.MAX_VALUE;
        System.out.println(myMinLong);
        System.out.println(myMaxLong);

        byte testByte = (byte)(myMaxByte/2);

    }
}
