
//Calculator using class and method
public class Problem1 {
    public  double  operator(double x, double y, String operation){
        switch(operation){
            case "add":
            return x+y;
            case "subtract":
            return x-y;
            case "multiply":
            return x*y;
            case "divide":
            if(y !=0){
                return x/y;
            }else{

                System.out.println("Cannnot divide by zero!");
                return 0;

            }
            default:
            System.out.println("Invalid operation!");
            return 0;

        }


    }
    public static void main(String[] args) {
        Problem1 problem = new Problem1();
        double result1 = problem.operator(10, 5, "add");
        System.out.println("Result of addition: " + result1);
        
        double result2 = problem.operator(10, 5, "subtarct");
        System.out.println("Result of subtraction: " + result2);
        
        double result3 = problem.operator(10, 5, "multiply");
        System.out.println("Result of multiplication: " + result3);
        
        double result4 = problem.operator(10, 5, "divide");
        System.out.println("Result of division: " + result4);
        
        double result5 = problem.operator(10, 0, "divide");
        System.out.println("Result of division by zero: " + result5);
        
        double result6 = problem.operator(10, 5, "modulus");
        System.out.println("Result of invalid operation: " + result6);
    }
	
	
}
