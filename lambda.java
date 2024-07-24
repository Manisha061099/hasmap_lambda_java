interface plus {
    int operate(int a, int b);
}
public class lambda {
    public static void main(String[] args) {
        plus addition = (a, b) -> a + b;
        plus substract = (a, b) -> a - b;
        plus multiply = (a, b) -> a * b;
        plus divide = (a, b) -> a / b;
        plus mod = (a, b) -> a % b;

        int sub = substract.operate(50, 20);
        System.out.println(sub);
        int result = addition.operate(10, 20);
        System.out.println(result);
        int mul = multiply.operate(10, 20);
        System.out.println(mul);
        int div = divide.operate(40, 20);
        System.out.println(div);
        int modulus = mod.operate(40, 4);
        System.out.println(modulus);
        //    System.out.println(addition.add(10,20));
    }
}
