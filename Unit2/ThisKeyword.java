class Employee{
    private String name;
    private int id;
    public Employee(String name, int id){
        this.name=name;
        this.id=id;
        this.display();
    }
    private void display(){
        System.out.println("Name: "+name);
        System.out.println("ID: "+id);
    }
}

class ThisKeyword {
 public static void main(String[] args) {
    //this:  to call curent instance of class 
    // by this we can target class's members like variable and methord.

    //to differenciate btw local and global variable

    Employee  em1 = new Employee("Vaibhav", 1240);
    // em1.display();
 }
    
}