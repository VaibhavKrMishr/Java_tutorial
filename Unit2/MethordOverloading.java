class MethordOverloading {

    static void addition(int a, int b){
        System.out.println("Sum: "+(a+b));
    }

    static void addition(int a, int b,int c){
        System.out.println("Sum: "+(a+b+c));
    }

    static void addition(int...n){
        int total=0;
        for(int i:n){
            total+=i;
        }
        System.out.println("Sum: "+total);
    }


    public static void main(String[] args) {
        
        // MethordOverloading mo = new MethordOverloading();
        //mo.addition(a,b);
        addition(5, 6);
        addition(5, 9, 7);
        addition(1,32,5,8,8,66,895,6666);

    }
}