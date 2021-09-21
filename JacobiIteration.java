
package linear_equation;

import java.util.Scanner;

public class JacobiIteration {
    public static void main(String[] args) {
        int n;
        Scanner sc= new Scanner(System.in);
        
        System.out.print("Enter Number of equation: ");
        n= sc.nextInt();
        
        System.out.println("Enter Coefficients of Equations:");
        int a[][]= new int[n][n];
        
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                System.out.print("a"+i+j+"= ");
                a[i][j]=sc.nextInt();
            }
        }
        
        System.out.println("Enter Right Side Vector:");
        int b[]= new int[n];
        
       for(int i=0;i<n;i++){
           System.out.print("b"+i+"= ");
           b[i]= sc.nextInt();
           }
       
        System.out.println("Given Equations:");
       for(int i=0;i<n;i++){
           System.out.println("");
            for(int j=0;j<n;j++){
                System.out.print(a[i][j]+"x"+(j+1)+" ");
            }
            
           System.out.print(" ="+b[i]);
        }
        System.out.println("\n\n");
        
       
       int c;
       double sum;
       double x[]=new double[n];
       double x0[]=new double[n];
       
           for(int i=0;i<n;i++)
                    x0[i]= b[i]/a[i][i];
           
          int count=1;
          
           int key=0;
           int status=0;
           
           while(count<100){
       
           for(int i=0;i<n;i++){
               sum= b[i];
            for(int j=0;j<n;j++){
                
                    x[i]=x0[i];
                    
               System.out.println("x"+(i+1)+"= "+x[i]);
                if(i==j)
                    continue;
                sum=sum-a[i][j]*x0[j];
                
         //   x[i]= sum/a[i][i];
            }
            x[i]=sum/a[i][i];
            
            if(key==0){
                if(Math.abs(x[i]-x0[i]/x[i])>0.001){
                    key=1;
                }
            }
        }
           
           if(key==1){
               if(count== 100){ //Max Iteration
                   status=2;
               }
               else{
                   status=1;
                   for(int i=0;i<n;i++){
                       x0[i]=x[i];
                   }
               }
           }
           
                    count++;      
    }
           
        
                   System.out.println("\nSolutions After "+count+" Itration: "); 
      
          
                   for(int i=0;i<n;i++){
                       System.out.println("x"+(i+1)+"= "+x[i]);
                       
                   }  
           
           
           
           
           
           
                    }
        
    }

