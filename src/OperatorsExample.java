import java.util.Scanner;

public class OperatorsExample {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter initial bill amount");
        float bill_amt = sc.nextFloat();
        float gst = bill_amt * 18/100;
        float total = bill_amt + gst;
        System.out.println("total bill:" + total);
    }
}
