package operators;

public class OperatorChallenge {
    public static void main(String[] args) {
        double myDouble1 = 20.00;
        double myDouble2 = 80.00;
        double result = (myDouble1 + myDouble2) * 100;
        double remainder = result % 40.00;
        System.out.println(remainder);
        boolean myBoolean;
        if (remainder==0){
            myBoolean=true;
        }else{
            myBoolean=false;
        }
        System.out.println(myBoolean);
        if (!myBoolean){
            System.out.println("Got some remainder");
        }
    }
}
