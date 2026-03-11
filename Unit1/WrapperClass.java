import java.util.ArrayList;
import java.util.List;


public class WrapperClass {
    public static void main(String[] args) {
        Integer a=  Integer.valueOf(100);
        System.out.println(a);
        Integer b=100;
        System.out.println(b);
        System.out.println("Long : "+Long.BYTES);
        System.out.println("Integer : "+Integer.BYTES);
        System.out.println("Char : "+Character.BYTES);
        String n="45";
        Integer m= Integer.parseInt(n);
        System.out.println(m);

        System.out.println("Integer : "+Integer.MAX_VALUE);
        System.out.println("Integer : "+Integer.MIN_VALUE);

        System.out.println("Long : "+Long.MAX_VALUE);
        System.out.println("Long : "+Long.MIN_VALUE);


        List<Integer>list=new ArrayList<>();
        list.add(10);
        list.add(20);
        list.add(30);
        for(int x: list){
            System.out.println(x);
        }
    }
}
