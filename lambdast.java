
interface st {

    String operate(String a, String b);
}

public class lambdast {

    public static void main(String[] args) {
        st concat = (a, b) -> a + b;
        st compare = (a, b) -> a.compareTo(b) < 0 ? a : b;

        String result = concat.operate("hello ", "Manisha");
        System.out.println(result);
        String result1 = compare.operate("mani ", "lovely");
        System.out.println(result1);
    }

}
