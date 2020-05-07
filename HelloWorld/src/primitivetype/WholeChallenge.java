package primitivetype;

public class WholeChallenge {
    public static void main(String[] args) {
        byte myByteNum = 1;
        short myShortNum = 50;
        int myIntNum = 100;
        long myLongNum = 50000L+10L*(myByteNum+myIntNum+myShortNum);
        System.out.println(myLongNum);

        short total = (short)(1000+10*(myByteNum+myShortNum+myIntNum));
    }
}
