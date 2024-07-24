import java.util.HashMap;
public class hasmap {
    public static void main(String[] args) {

        HashMap<Integer, String> map = new HashMap<>();
        map.put(1, "Manisha");
        map.put(2, "lovely");
        map.put(3, "Kajal");
        System.out.println("name : " + map);
        for (Integer key : map.keySet()) {
            System.out.println(key + " " + map.get(key));
        }   
    }
}
