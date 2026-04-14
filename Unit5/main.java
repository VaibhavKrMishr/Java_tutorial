import java.util.*;

public class main{
    
    // public static void printList(List<?> li) {
    //     for(Object obj : li){
    //         System.out.println(obj);
    //     }
    // }
    public static void printList(List<? extends Number> li) {
        for(Object obj : li){
            System.out.println(obj);
        }
    }
    
    public static void lmain(String[] args) {
        List<Integer> num = Arrays.asList(1,2,3,5,4);
        // List<String> word = Arrays.asList("Come","Gp");
        
        printList(num);
        // printList(word);
    }
	
}