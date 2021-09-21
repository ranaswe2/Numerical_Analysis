
package curve_fitting.interpolation;

import java.util.Scanner;

public class NewtonInterpolation {
    
    static double productTerm(int i,double xi,double x[]){
       double product=1.0;
                for(int j=0;j<i;j++){
                    product=product*(xi-x[j]);
                }
             return product;   
    }
    static void diffTable(double x[],double y[][],int n){
        for(int i=1;i<n;i++){
              for(int j=0;j<n-i;j++){
                    y[j][i]= (y[j][i-1]-y[j+1][i-1])/(x[j]-x[j+i]);
                        
                    }
           }
    }
    static double intpol(double xi, double x[],double y[][],int n){
        double sum= y[0][0];
        for(int i=1;i<n;i++){
            sum= sum+productTerm(i,xi,x)*y[0][i];
        }
        return sum;
    }
    static void table(double y[][],int n){
        for(int i=0;i<n;i++){
              for(int j=0;j<n-i;j++){
                  System.out.print(y[i][j]+"    ");      
              }
              System.out.println("");
           }
    }
    
    
    
    public static void main(String[] args) {
        
        double fi=0;
        int n;
        Scanner sc= new Scanner(System.in);
        
        System.out.print("Column of Table: ");
        n=sc.nextInt();
        
        double x[]= new double[n];
        double f[][]= new double[n][n];
        
        
        System.out.println("Enter x and f(x) as Tabular Data:");
        
        for(int i=0;i<n;i++){
            System.out.print("x"+i+"= ");
            x[i]=sc.nextDouble();
            System.out.print("f"+i+"= ");
            f[i][0]=sc.nextDouble();
        }
        
        System.out.print("Enter A Point x to Get f(x): ");
        double xi= sc.nextDouble();
        
        diffTable(x,f,n);
        table(f,n);
        
        
        System.out.println(" f("+xi+") = "+intpol(xi,x,f,n));
        
    }
}
