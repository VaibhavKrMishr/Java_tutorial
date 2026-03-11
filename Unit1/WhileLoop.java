class WhileLoop{
    public static void main(String arg[]){
    // For loop
        for(int i=0;i<10;i++){
            if(i==5){
                continue;
            }
            System.out.print(i+" ");
        }
        System.out.println();
        int i=1;
        // while loop
        while(i<=10){


            System.out.print(i+" ");
            i++;
        }
        System.out.println();


//         for each loop
        int arr[]={10,20,30,40,50};
        int target = 40;
        for(int x:arr){

            System.out.print(x+" ");
        }
        System.out.println();



        // if else
        for(int j=0;j<arr.length;j++){
        if(arr[j]==target){
                System.out.println("Element Found");
            }
            else{
                System.out.println("Element Not Found");
            }
        }
    }
}
