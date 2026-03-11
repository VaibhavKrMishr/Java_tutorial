class Student{
    private String Name;
    private int RollNo;
    private float[] Marks;
    private float total;
    private boolean result;
    private float avg;

    public Student(String Name, int RollNo, float[] Marks){
        this.Name = Name;
        this.RollNo = RollNo;
        this.Marks= Marks;
        calculateTotal();
        calculateResult();
        calculateAvg();
        
    }
    private void calculateTotal() {
        total = 0;
        for (float m : Marks) {
            total += m;
        }
    }

    private void calculateAvg(){
        int i=0;
        for (float f : Marks) {
            i+=1;
        }
        avg = (total/i);
    }

    private void calculateResult(){
        for (float m : Marks) {
            if (m < 33) {
                result = false; // Fail
                return;
            }
        }
        result = true; 
    }

    public void display(){
        System.err.println("Name: "+Name);
        System.err.println("Roll No: "+ RollNo);
        for (float f : Marks) {
            System.err.println("Marks: "+f);
        }
        System.out.println("Total: "+total);
        System.err.println("Average: "+avg);

        if(result == true){
            System.out.println("Result: Pass");
        }else {
            System.out.println("Result: Fail");
        }

    }
}

class Task {

    //Have to create a class student
    //class having data memeber: Name; RollNo; Marks of array(float); total; result (bool)
    //class having methord: calculateAvg (private); display; result(private)(if student getting lesser than 33 means fail otherwise pass)
public static void main(String[] args) {
    float[] mark ={44,55,66,88,99};
    Student S1 = new Student("Vaibhav", 44, mark);
    S1.display();
}
    
}