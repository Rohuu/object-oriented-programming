package package1;


public class Operations {

    public static void main(String[] args) {

        Calculator calculator = new Calculator();
        int ans = calculator.calculatesResult(4, 5, new MultiplyOperator());
        System.out.println(ans);
    }
    // interface
    public interface Operator {
        int operate(int a, int b); // made an abstract function without body
        // which we have to implement in concrete classes

        // int anotherOperation(int a,int b,int c);
        // as we make another function, all the classes asking now that new function implementation
        // that's in oo programming it's hard to make new function coz it affects all the classes.
    }

    // concrete classes implementing interface
    // inside these concrete classes, we have to implement that without body function
    class AddOperator implements Operator {

        @Override
        public int operate(int a, int b) {
            return a + b;
        }
    }

    class SubtractOperator implements Operator {

        @Override
        public int operate(int a, int b) {
            return a - b;
        }
    }

    static class MultiplyOperator implements Operator {

        @Override
        public int operate(int a, int b) {
            return a * b;
        }
    }

    static class Calculator {
        int calculatesResult(int a, int b, Operator operator) {
            return operator.operate(a, b);
        }
    }
}
