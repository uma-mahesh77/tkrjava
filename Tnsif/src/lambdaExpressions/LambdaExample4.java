package lambdaExpressions;

public class LambdaExample4 {
	 public static void main(String[] args) {
	        Square square = (n) -> {
	            return n * n;
	        };
	        System.out.println("Square of 6: " + square.calculate(6));
	    }
}
