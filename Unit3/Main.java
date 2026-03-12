class Student {
    private int rollno;
    private String name;

    public int getValue(){
        return rollno;
    }
    public void setValue(int rollno){
        this.rollno=rollno;
    }

    public String getName(){
        return name;
    }
    public void setName(String name){
        this.name=name;
    }
}




class Main{
    public static void main(String[] args) {
        Student s1 = new Student();
        s1.setValue(101);
        s1.setName("xyz");

        System.out.println(s1.getValue());
        System.out.println(s1.getName());

    }
}




class Parent{
    int x = 10;
}
class Child extends Parent{
    int x = 20;
    void display(){
        System.out.println("I am in child class = "+x);
        System.out.println("I am in parent class = " +super.x);
    }
}










