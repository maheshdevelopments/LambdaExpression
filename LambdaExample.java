interface FuncInter {
    int operation(int a, int b);
}

public class LambdaExample {
    int operate(int a, int b, FuncInter fobj) {
        return fobj.operation(a, b);
    }

    public static void main(String args[]) {
        LambdaExample tobj = new LambdaExample();
        FuncInter add = (int x, int y) -> x + y;
        FuncInter subtraction = (int x, int y) -> x - y;
        FuncInter multiply = (int x, int y) -> x * y;
        FuncInter division = (int x, int y) -> x / y;
        System.out.println("Addition is " + tobj.operate(10, 5, add));
        System.out.println("Subtraction is " + tobj.operate(10, 5, subtraction));
        System.out.println("Multiplication is " + tobj.operate(10, 5, multiply));
        System.out.print("Division is " + tobj.operate(10, 5, division));
    }
}