package doublecolonoperator;

public class Demo {

    public static void main(String[] args) {

        //Reference to static method
        Calculate s1 = (x, y) -> Calculator.findSum(x, y);
        s1.calculate(10, 20);

        Calculate s2 = Calculator::findSum;
        s2.calculate(100,200);

        // Instance method
        Calculate m1 = (x,y) ->  new Calculator().findMultiple(x,y);
        m1.calculate(5,6);

        Calculator obj = new Calculator();
        Calculate m2 = obj::findMultiple;
        m2.calculate(3,8);

        Calculate m3 = new Calculator()::findMultiple;
        m3.calculate(6,6);

    }
}
