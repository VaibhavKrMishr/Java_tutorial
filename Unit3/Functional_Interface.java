// interface MyInterface{
//     void display();
//     void show();
// }

//For one interface only 
@FunctionalInterface 
interface MyInterface2{
    void dekha();
    default void show1(){
        System.out.println("Hello Default");
    }
   
}

class Myclass implements MyInterface2{
    public void display(){
        System.out.println("Hello");
    }
    public void show(){
        System.out.println("Hello Adarsh");
    }
    public void dekha(){
        System.out.println("Dekh le ");
    }
    
}

class Functional_Interface {

    public static void main(String[] args) {
        Myclass obj = new Myclass();
        obj.display();
        obj.show();
        obj.dekha();
        obj.show1();
    }
}