import java.util.HashMap;
public class hasmap1 {
    public static void main(String[] args) {

        HashMap<String, String> map = new HashMap<>();
        map.put("singh", "Manisha");
        map.put("love", "lovely");
        map.put("kumari", "Kajal");
        map.put("jain", "Kajal");

        System.out.println("name : " + map);
        for (String key : map.keySet()) {
            System.out.println(key + " " + map.get(key));
        }   
    }
}
