
package curve_fitting.interpolation;

import java.util.Scanner;

public class LagrangeInterpolation {
    
    public static void main(String[] args) {
        
        int n;
        double fi=0;
        Scanner sc= new Scanner(System.in);
        
        System.out.print("Column of Table: ");
        n=sc.nextInt();
        
        double x[]= new double[n];
        double f[]= new double[n];
        double l[]= new double[n];
        
        System.out.println("Enter x and f(x) as Tabular Data:");
        
        for(int i=0;i<n;i++){
            System.out.print("x"+i+"= ");
            x[i]=sc.nextDouble();
            System.out.print("f"+i+"= ");
            f[i]=sc.nextDouble();
        }
        
        System.out.print("Enter A Point x to Get f(x): ");
        double xi= sc.nextDouble();
        
        for(int i=0;i<n;i++){
            l[i]=1;
            if(xi<x[0] || xi>x[n-1]){
                System.out.println("Your table don't bind the given value!");
                break;
            }
            else {
                if(xi>x[0] && xi<x[n-1] && xi != x[i]){
                      
                for(int j=0;j<n;j++){
                if(j!=i){
                    l[i]=l[i]*(xi-x[j])/(x[i]-x[j]);
                }
                
             }
                fi=fi+f[i]*l[i];
            }
            else{
                fi=f[i];                      // xi==x[i]
            }
            
        
        }
        }
        System.out.println(" f("+xi+") = "+fi);
        
    }
}
