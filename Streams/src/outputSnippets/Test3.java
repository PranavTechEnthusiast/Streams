package outputSnippets;

public class Test3 {
    private static void testBreak(){
            label: if(true){
                System.out.println("Static");
                //break label;
                //break;
            }
        }

    public static void main(String[] args) {
        testBreak();
    }
}
