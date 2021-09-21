
package non_linear_equation;

import java.util.Scanner;

public class MullersMethod {
     
     static double a,b,c,d,x,x3,x1,x2,h0,h1,h2,d0,d1,d2,a0,a1,a2,y;

    public static double f(double x0){
        return a*x0*x0*x0+b*x0*x0+c*x0+d;
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
        System.out.print("x1= ");
        x1=sc.nextDouble();
        System.out.print("x2= ");
        x2=sc.nextDouble();
        System.out.print("x3= ");
        x3=sc.nextDouble();
       
        h1=x1-x3; d1=f(x1)-f(x3);
        h2=x2-x3; d2=f(x2)-f(x3);
        a0=f(x3);
        a1=(d2*h1*h1-d1*h2*h2)/h1*h2*(h1-h2);
        a2=(d1*h2-d2*h1)/h1*h2*(h1-h2);
        y=a1*a1-4*a2*a0;
        h0=(a0>0)? -2*a0/(a1+Math.sqrt(y)) : -2*a0/(a1-Math.sqrt(y));
        x=x3+h0;
        
        int i=0;
        while(f(x) <=0.00001 ){
                  
              if(f(x) !=0.00001){
                  h1=x1-x3; d1=f(x1)-f(x3);
        h2=x2-x3; d2=f(x2)-f(x3);
        a0=f(x3);
        a1=(d2*h1*h1-d1*h2*h2)/h1*h2*(h1-h2);
        a2=(d1*h2-d2*h1)/h1*h2*(h1-h2);
        h0=(a0>=0)? -2*a0/(a1+Math.sqrt(a1*a1-4*a2*a0)) : -2*a0/(a1-Math.sqrt(a1*a1-4*a2*a0));
        x=x3+h0;
                  x1=x2; x2=x3; x3=x;
              }
              
              System.out.println("x"+(i+1)+"= "+x+"  f(x"+(i+1)+")= "+f(x));
            i++;
          }
          System.out.println("Root is "+x);
        
    }
}
