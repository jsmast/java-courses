package Calculator;
public class Calculate {

	public static void main(String[] arg){
		System.out.println("Calculate...");
		int first = Integer.valueOf(arg[0]);
		int second = Integer.valueOf(arg[1]);
		int sum = first + second;
		int minus = first - second;
		System.out.println("Sum " + sum);
		System.out.println("Minus1111 " + minus);
	}
}