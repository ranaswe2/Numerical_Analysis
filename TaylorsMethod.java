
package calculus;

import java.util.Scanner;

public class TaylorsMethod {
    
        
       static double s=1;
    static double e(int x,int n){
        
        if(n==0)
            return s;
        else
            s=1+x*s/n; 
        
        return e(x,n-1);
    }
    static double d=0;

    
    public static void main(String[] args) {
        
        Scanner s= new Scanner(System.in);
        
        System.out.println("Enter the Power n of e [e^n] : ");
        int p= s.nextInt();
        
        for(int i=0;i<=p;i++){
        System.out.println("e^"+i+" = "+e(i,100));
        }
        
    }
    
}
