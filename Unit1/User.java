import java.util.Scanner;

class User{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);

        System.out.println("Enter Name: ");
        String name=sc.nextLine();


        System.out.println("Enter age ");
        int age=sc.nextInt();



        System.out.println("Name: "+name+" Age: "+age);



        sc.close();
    }
}
