
package linear_equation;

public class GaussJordan {
    
    //static int m=10;
    static void printMatrix(double a[][], int n){
        for(int i=0;i<n;i++){
                System.out.println("");
            for(int j=0;j<=n;j++){
                System.out.print(a[i][j]+ " ");
            }
        }
    }
    
    static int operation(double a[][], int n){
        int i,j,k=0,c=0,flag=0,m=0;
      //  double pro=0;
        for(i=0;i<n;i++){
            
            if(a[i][i]==0){
                c=1;
                while((i+c)<n && a[i+c][k]==0)
                    c++;
                if((i+c)==n){
                        flag=1;
                        break;
                    }
                
                for(j=i,k=0;k<=n;k++){
                double temp= a[j][k];
                a[j][k]=a[j+c][k];
                a[j+c][k]=temp;
                }
        }
        
        
        for(j=0;j<n;j++){
            if(i !=j){
                
                double p=a[j][i]/a[i][i];
                
                for(k=0;k<=n;k++)
                    a[j][k]=a[j][k]-(a[i][k]*p);
                
                
            }
          }
        }
        return flag;
    }
    
    static void printResult(double a[][], int n,int flag){
        System.out.println("\nResult is: ");
        if(flag==2){
            System.out.println("Infinite solution exists!!!");
        }
        else{
            for(int i=0;i<n;i++){
                System.out.println("x"+(i+1)+" = "+a[i][n]/a[i][i]+" ");
            }
        }
    }
    
    static int checkFlag(double a[][], int n,int flag){
        flag=3;
        for(int i=0;i<n;i++){
            double sum=0;
            for(int j=0;j<n;j++){
            sum= sum+a[i][j];
            
               if(sum==a[i][j]){
                flag=2;
               }
            }
        }
        
        return flag;
    }
    public static void main(String[] args) {
       // double a[][]={{0,2,1,4},{1,1,2,6},{2,1,1,7}};
       // double a[][]={{2,1,3,1},{4,4,7,1},{2,5,9,3}};
        double a[][]={{3,1,5},{1,-3,5}};
        int n=2, flag=0;
        
        flag= operation(a,n);
        if(flag==1)
            flag= checkFlag(a,n,flag);
            
            System.out.println("Augmented Matrix :");
            printMatrix(a,n);
            System.out.println("");
            printResult(a,n,flag);
        
        
    }
    
}
