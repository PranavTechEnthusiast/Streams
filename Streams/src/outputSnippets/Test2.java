package outputSnippets;
class Test2 {
    @FunctionalInterface
    interface FunctionInterface1 {
        int operation(int a, int b);
    }
    private int operate(int a, int b, FunctionInterface1 inter) {
        return inter.operation(a,b);
    }
    public static void main(String args[]) {
        //implement different operations like add,sub, multiply using lambda
        //add
        Test2 test = new Test2();
        System.out.println("Addition" + test.operate(10, 20, (a, b) -> a + b));

        //substract
        System.out.println("Substaction o/p"+ test.operate(10, 20, (a, b) -> a - b));

        //division
        System.out.println("Division o/p"+ test.operate(20, 20, (a, b) -> a / b));

        //Multiplication
        System.out.println("Substaction o/p"+ test.operate(10, 20, (a, b) -> a * b));
    }
}
