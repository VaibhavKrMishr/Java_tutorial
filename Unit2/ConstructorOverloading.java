public class ConstructorOverloading {

    private String name;

        //Default
    public ConstructorOverloading(){
        System.out.println("Default Constructor");
    }

    //Parameterized
    public ConstructorOverloading(String name){
        this.name=name;
        System.out.println("Name: "+this.name);
    }

    public ConstructorOverloading(String... n){
        for (String i : n) {
            System.out.println(i);
        }
    }

    public static void main(String[] args) {
        ConstructorOverloading c= new ConstructorOverloading();
        ConstructorOverloading c2 = new ConstructorOverloading("Vaibhav");
        ConstructorOverloading c3= new ConstructorOverloading("Vaibhav","Kumar","Mishra");


        
    }
}