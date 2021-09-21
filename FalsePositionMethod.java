
package non_linear_equation;

import java.util.Scanner;

public class FalsePositionMethod {
    static double a,b,c,x,x0,x1,x2,y;
    
    public static double f(double x0){
        return a*x0*x0+b*x0+c;
    }
    public static void main(String[] args) {
        System.out.println("Enter Coeft for Equation: ax^2+bx+c = 0");
        
        Scanner sc= new Scanner(System.in);
        System.out.print("a= ");
        a=sc.nextDouble();
        System.out.print("b= ");
        b=sc.nextDouble();
        System.out.print("c= ");
        c=sc.nextDouble();
        
        System.out.println("Initial Points( x1< x <x2 ) :");
        System.out.print("x1= ");
        x1=sc.nextDouble();
        System.out.print("x2= ");
        x2=sc.nextDouble();
        
        x0=x1-f(x1)*(x2-x1)/(f(x2)-f(x1));
        
        int i=0;
          
    if(x0>x1 && x0<x2){
        while((x2-x1)>=0 && f(x0) !=0){
                  
              x0=x1-f(x1)*(x2-x1)/(f(x2)-f(x1));
              
             if(f(x1)*f(x2)<0){
               
                x2=x0;
            }
            else {
                x1=x0;
            }
              
              System.out.println("Iteration "+(i+1)+": x1= "+x1 +" x2= "+x2+" x0= "+x0+" f(x0)= "+f(x0));
            i++;
          }
          System.out.println("Root is "+x0);
        System.out.println("Number of iteration: "+i);
        
    }else{
        System.out.println("Root not Lies between "+x1+" & "+x2);
    }
    }
    
    
}
