package kavitama.ExpressionEvaluator;

 public class Operations{
    public  double add(double num1 ,double num2){
        return (num1 + num2);
    }
    public  double substract(double num1 ,double num2){
        return (num1 - num2);
    }
    public  double multiply(double num1 ,double num2){
        return (num1 * num2);
    }
    public  double divide(double num1 ,double num2){
        return (num1 / num2);
    }
    public double power(double num1, double num2){
        return Math.pow(num1 ,num2);
    }
}
