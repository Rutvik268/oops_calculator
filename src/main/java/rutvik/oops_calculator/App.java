package rutvik.oops_calculator;

import java.util.Scanner;

public class App {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.print("Number 1:");
    int num1 = sc.nextInt();
    System.out.print("Enter the Number 2:");
    int num2 = sc.nextInt();
    System.out.print("Enter the operation");
    String operation = sc.next();
    
    Calculator obj = new Calculator(num1,num2);
    int result =0;
    switch(operation) {
    case "+" : result=obj.add(); break;
    case "-" : result=obj.sub(); break;
    case "*" : result=obj.mul(); break;
    case "/" : result=obj.div(); break;
    default : System.out.print("Invalid Operator");
    
    }
    System.out.print(result);
  }
}
