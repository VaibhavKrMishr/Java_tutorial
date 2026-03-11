import java.util.Scanner;
class Array{
    public static void main(String arg[]){
            // //Static 
            // int arr []={10,20,30,40,50,60,70,80,90};
            // System.out.println("Array 1 size: "+arr.length);
            // for(int i:arr){
            //     System.out.print(i+" ");
            // }
            // System.out.println();

            // int[] arr2 ={0,10,20,30,40,50,60,70,80,90};//Modern
            // System.out.println("Array 2 size: "+arr2.length);
            // for(int i:arr2){
            //     System.out.print(i+" ");
            // }
            // System.out.println();
            
            // //Dynamic
            // int [] arr3=new int[4];
            // arr3[0]=10; 
            // arr3[1]=20;
            // arr3[2]=30;
            // arr3[3]=40;
            // System.out.println("Array 3 size: "+arr3.length);

            // for(int i:arr3){
            //     System.out.print(i+" ");
            // }
            // System.out.println();

            // Ques) Write a program in to take user input from array and array element
            //       - sum of all array element
            //       - find smallest and largest element

            Scanner sc = new Scanner(System.in);
            System.out.print("Enter Size of Array: ");
            int size= sc.nextInt();

            int[] arr = new int[size];

            for(int i =0;i<size;i++){
                arr[i]=sc.nextInt();            
            }

            // System.out.println(arr.length);
            for(int i:arr){
                System.out.print(i+" ");
            }
            System.out.println();

            int sum=0;
            for(int i:arr){
                sum=sum+i;
                // for each loop i is arr[i]
            }
            System.out.println("Sum of all element of array: "+sum);

            int max=0,min=arr[0];
            for(int i:arr){
                if(min>i){
                    min =i;
                }
                if(max<i){
                    max=i;
                }
            }
            System.out.println("Max: "+max+ " Min: "+min);
            


            sc.close();
    }
}