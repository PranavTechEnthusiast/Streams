package outputSnippets;

public class Test1 {
    public static void main(String[] args) {
        System.out.println("Main O/P:"+testTryCatch());
    }

    private static int testTryCatch() {
        try{
            System.out.println("Try");
            //System.exit(0);
            return 0;
        }
        catch(Exception e){
            System.out.println("Catch");
        }
        finally{
            System.out.println("Finally");
            return 1;
        }
    }

}
