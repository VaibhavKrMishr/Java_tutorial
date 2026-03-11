import java.util.*;
class Array2d{
    public static void main(String arg[]){
        Scanner sc= new Scanner(System.in);
        int matrix[][]={
            {1,2,3},
            {4,5,6},
            {7,8,9}
        };
        System.out.println("Matrix 2");
        for (int i=0;i<matrix[0].length;i++){
            for(int j=0;j<matrix[0].length;j++){
            System.out.println(i+" "+j+" -> "+matrix[i][j]);
            }                       
        }

        System.out.println();

        int [][]matrix2=new int[3][3];
        System.out.println("Enter Matrix 2 Elements:");
        for (int i=0;i<matrix2[0].length;i++){
            for(int j=0;j<matrix2[0].length;j++){
            matrix2[i][j]=sc.nextInt();
            }
        }
        System.out.println("Matrix 2");
        for (int i=0;i<matrix2[0].length;i++){
            for(int j=0;j<matrix2[0].length;j++){
            System.out.println(i+" "+j+" -> "+matrix2[i][j]);
            }
        }
        sc.close();
    }
}                           