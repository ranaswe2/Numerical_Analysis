
package non_linear_equation;

import java.util.Scanner;

public class NewtonRaphsonMethod {
    
       
     static double a,b,c,d,x,x0,x1,x2,y;

    public static double f(double x0){
        return a*x0*x0*x0+b*x0*x0+c*x0+d;
    }
    public static double fd(double x0){
        return a*3*x0*x0+b*2*x0+c;
    }
    
    public static void main(String[] args) {
        System.out.println("Enter Coeft for Equation: ax^3+bx^2+cx+d = 0");
        
        Scanner sc= new Scanner(System.in);
        System.out.print("a= ");
        a=sc.nextDouble();
        System.out.print("b= ");
        b=sc.nextDouble();
        System.out.print("c= ");
        c=sc.nextDouble();
        System.out.print("d= ");
        d=sc.nextDouble();
        
        System.out.println("Initial Point :");
        System.out.print("x0= ");
        x0=sc.nextDouble();
        
        
        
        int i=0;
          
   
        while(f(x0) !=0){
                  
              if(f(x0) !=0){
                  x1=x0-f(x0)/fd(x0);
                  x0=x1;
              }
              
              System.out.println("x"+(i+1)+"= "+x0+"  f(x"+(i+1)+")= "+f(x0));
            i++;
          }
          System.out.println("Root is "+x0);
   
    }
    
}
