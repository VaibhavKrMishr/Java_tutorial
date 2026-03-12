interface MyInterface{
    void display();
}

class Myclass implements MyInterface{
    public void display(){
        System.out.println("Hello");
    }
}

class Functional_Interface {

    public static void main(String[] args) {
        Myclass obj = new Myclass();
        obj.display();
    }
}