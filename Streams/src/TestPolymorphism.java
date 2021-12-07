import java.io.FileNotFoundException;
import java.util.List;

public class TestPolymorphism {
    private void take(Object o){
        System.out.println("This is object");
    }

    private void take(Integer i){
        System.out.println("This is Integer");
    }

    /*private int take(Integer i){
        System.out.println("This is Integer returning");
        return i;
    }*/



    String method1(List<String> str){}
    String method1(List<Integer> str){}

    private void take(String s) throws FileNotFoundException{
        System.out.println("This is String");
        String s1  = "yodlee";
        String s2 = new String("yodlee");//.intern();
        System.out.println(s1 == s2);
        System.out.println(s1.equals(s2));


        throw new FileNotFoundException();
    }

    public static void main(String[] args){
        TestPolymorphism t = new TestPolymorphism();
        try{
            t.take("1");
            //t.take(1);
        }catch (Exception e){
            System.out.println("This exception catched");
            throw new ArithmeticException();
        }

    }
}
