import java.util.Scanner;

public class sample3 {

    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the First Value 1 :");
        int val1= sc.nextInt();
        System.out.println("Enter the Value 2 :");
        int val2 = sc.nextInt();
        boolean result = (val1>val2);

        System.out.println("true or false; value 1 is greater than value 2?"+result);
        String output;
        output = (val1<val2) ? "value 1 is less than value 2 so the result is 10" : "value 1 is more than value 2 so the result is 5";
        System.out.println(output);



    }
}

