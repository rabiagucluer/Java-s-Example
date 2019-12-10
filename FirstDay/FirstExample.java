
package FirstDay;

import java.util.Scanner;

public class FirstExample {
        
    //Java da değer alma
    
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);//kullanıcıdan alınacak inputu okumak için
        
        System.out.println("Enter x value: ");//kullanıcıdan x inputunu istedik
        int x = input.nextInt();//alınan inputu okuduk nextInt(for int)ile
        
       System.out.println("Enter y value: ");//kullanıcıdan y inputunu istedik
       int y = input.nextInt();//alınan inputu okuduk
       
       if(x>2){
           if(y>2){
               int z=x+y;
               System.out.println("z is " +z);
          }
           else
               System.out.println("no output");
       }
       else
           System.out.println("x is " +x);
       
        
        
    }
    
}
