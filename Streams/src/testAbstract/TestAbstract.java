package testAbstract;

abstract class KnowAbstract {

    int dummyInt;

    KnowAbstract(){}
    KnowAbstract(int val){
        System.out.println("Dummy initializing....");
        dummyInt=val;
    }
}

public class TestAbstract extends KnowAbstract{
    TestAbstract(int pass){
        super(pass);
        System.out.println("Constructor  call to abstract class's constructor");
    }

    public static void main(String[] args) {
        System.out.println(new TestAbstract(5));
        //new KnowAbstract(4);/*uncomment to test if abstract class can be instantiated.*/
    }
}




