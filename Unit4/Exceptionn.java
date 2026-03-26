class Exceptionn {

    public static void main(String[] args) {
	int a = 10;
	int b = 0;
	try {
	System.out.println(a/b);
	}
	catch( ArithmeticException e){
	System.out.println("Division by 0 not possible.");
	}
	System.out.println("Program Continue.....");
	
    }
}