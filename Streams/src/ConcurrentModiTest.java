import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedList;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

public class ConcurrentModiTest {
    /*public String dogo(String s, String i){return "";}
    public void dogo (String i, String s) {} method overloading return type support*/
    public static void main(String[] args) {
        String s = new String();
        HashMap map = new HashMap();
        ConcurrentHashMap m1 = new ConcurrentHashMap();
        Map map1 = Collections.synchronizedMap(map);
        LinkedHashMap mapp = new LinkedHashMap();
        ArrayList list = new ArrayList();
        LinkedList ll = new LinkedList();

        try{
            Map<String, Integer> oneMap = new ConcurrentHashMap<>();//HashMap<>();
            //System.exit(0);

        oneMap.put("One",1);
        oneMap.put("Two",1);
        oneMap.put("Three",1);
        oneMap.entrySet().stream().forEach(System.out::println);
        Iterator<String> iterator = oneMap.keySet().iterator();
        while(iterator.hasNext()){
            iterator.next();
            oneMap.remove("Three");
            /*iterator.remove();
            break;*/
        }
        oneMap.entrySet().stream().forEach(System.out::println);
        }
        finally {
            System.out.println("Finally.............");
        }


        Thread t = new Thread(()-> System.out.println("I am runnable"));
        t.setName("THREAD TEST123");
        t.run();
        System.out.println(t.getName());
        System.out.println(Thread.currentThread().getName());
    }
}
