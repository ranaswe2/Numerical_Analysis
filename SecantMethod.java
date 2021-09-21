
package non_linear_equation;

import java.util.Scanner;

public class SecantMethod {
     
     static double a,b,c,d,x,x0,x1,x2,y;

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
        
        System.out.println("Initial Points :");
        System.out.print("x1= ");
        x1=sc.nextDouble();
        System.out.print("x2= ");
        x2=sc.nextDouble();
        
        x0=(f(x2)*x1-f(x1)*x2)/(f(x2)-f(x1));
        
        System.out.println("Iterations:");
        int i=0;
        
        while(f(x0) !=0 && (f(x2)-f(x1)) !=0){
                  
              if(f(x0) !=0){
                  x0=(f(x2)*x1-f(x1)*x2)/(f(x2)-f(x1));
                  x1=x2;
                  x2=x0;
              }
              
              System.out.println("x"+(i+1)+"= "+x0+"  f(x"+(i+1)+")= "+f(x0));
            i++;
          }
          String s=(f(x0)==0)? "Root is "+x0:"Root not found!";  
        System.out.println(s);
   
    }
}

