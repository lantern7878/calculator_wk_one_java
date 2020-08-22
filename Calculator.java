import java.util.*;
public class Calculator {
    public static void main(String[] args) {
        int num, num2;
        String one, two;
        Scanner sc= new Scanner(System.in);
        System.out.print("Please enter math question:");
        String str= sc.nextLine();  
        str = str.replaceAll("\\s+","");
        int result;
        for (int i = 0; (i < str.length()); i++) {
            if (str.charAt(i) == '+') {
                String[] parts = str.split("\\+");
                one = parts[0];
                two = parts[1];
                num = Integer.parseInt(one);
                num2 = Integer.parseInt(two);
                result = num + num2;
                System.out.println(one + " + " + two + " = " + result);
            }
           else if (str.charAt(i) == '-') {
                String[] parts = str.split("\\-");
                one = parts[0];
                two = parts[1];
                num = Integer.parseInt(one);
                num2 = Integer.parseInt(two);
                result = num - num2;
                System.out.println(one + " - " + two + " = " + result);
            }
           else if (str.charAt(i) == '/') {
                String[] parts = str.split("\\/");
                one = parts[0];
                two = parts[1];
                num = Integer.parseInt(one);
                num2 = Integer.parseInt(two);
                result = num / num2;
                System.out.println(one + " / " + two + " = " + result);
            }
            else if (str.charAt(i) == '*') {
                String[] parts = str.split("\\*");
                one = parts[0];
                two = parts[1];
                num = Integer.parseInt(one);
                num2 = Integer.parseInt(two);
                result = num * num2;
                System.out.println(one + " * " + two + " = " + result);
            }
        }
    }
}
