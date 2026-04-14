import java.util.ArrayList;

class Generics {

    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(10);
        // list.add("Hello"); ❌ compile-time error
        // 
        //Trying to fetch data present in list
        // 
        // int num = (int)list.get(0);
        // String text = (String) list.get(1);
        
        
        int num = list.get(0); // no casting needed
        System.out.println(num);
    }
}