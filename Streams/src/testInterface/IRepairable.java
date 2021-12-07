package testInterface;

public interface IRepairable {
    void doing();
    default void doo(){
        System.out.println("Repair hi");
    }
}
