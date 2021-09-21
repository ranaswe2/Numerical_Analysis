
package calculus;

import java.util.Scanner;

public class EulersMethod {
    static double a,b,c,xi,yi,x,y,h;

    public static double eu(double xi){
        
        return h*(a*xi*xi+b*xi+c);
    }
    public static void main(String[] args) {
        
        Scanner sc= new Scanner(System.in);
        
        System.out.println("Enter Coeft for Equation: dy/dx = ax^2+bx+c");
        System.out.print("a= ");
        a=sc.nextDouble();
        System.out.print("b= ");
        b=sc.nextDouble();
        System.out.print("c= ");
        c=sc.nextDouble();
        
        System.out.println("Initial Values:");
        System.out.print("xi= ");
        xi=sc.nextDouble();
        System.out.print("yi= ");
        yi=sc.nextDouble();
        
        System.out.println("Input the Value at Which y is Needed:");
        System.out.print("x= ");
        x=sc.nextDouble();
        
        System.out.println("Input Step Size:");
        System.out.print("h= ");
        h=sc.nextDouble();
        
        while(xi<=x){
            
            System.out.println("y("+xi+") = "+yi);
            
            yi=yi+eu(xi);
            xi=h+xi;
        }
        
    }
    
}
