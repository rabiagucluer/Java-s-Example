package SecondDay;

import java.util.Scanner;


public class FirstExamp {
        public static void main(String[] args){
        
        Scanner input= new Scanner(System.in);
        double tax;
        System.out.println("Enter your income: ");
        int income =input.nextInt();
        
        if(income<=10000){
             tax = income * (0.1);
             System.out.println("Your tax is " +tax);
        }
        /*else if(income>10000 && income<=20000){
            tax=10000+(income-10000) * 0.15;
            System.out.println("Your tax is "+ tax);*/
        else if(income<=20000){
            tax=10000+(income-10000)*0.15;
            System.out.println(tax+ "Your tax is ");
        }
        
        else
            System.out.println("You don't have tax");
        
    }
    //yukarıda yazılan else if deki durumlar aynı sonucu verir...
    
}
