package testInterface;

public interface IDrivable {
     void doing();
     default void doo(){
          System.out.println("Drivable hi");
     }
}
