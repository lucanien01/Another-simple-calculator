public class Calculate {

    double result;

    public void plus(double num1, double num2){
        result = num1 + num2;
    }

    public void minus(double num1, double num2){
        result = num1 - num2;
    }

    public void multiply(double num1, double num2){
        result = num1 * num2;
    }

    public void divide(double num1, double num2){
        result = num1 / num2;
    }

    public void power(double a, double b) {
        result = Math.pow(a, b);
    }

    public void sqrt(double a) {
        result = Math.sqrt(a);
    }

    public void modulus(double a, double b) {
        result = a % b;
    }

    public double getResult(){
        return result;
    }

    public void printResult() {
        double result = getResult();

        if (result % 1 == 0) {
            System.out.println("Result: " + (int) result + "\n");
        } else {
            System.out.println("Result: " + result + "\n");
        }
    }
}
