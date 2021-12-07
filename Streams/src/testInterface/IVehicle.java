package testInterface;

public interface IVehicle extends IDrivable, IRepairable {
    @Override
    void doing();
    default void doo(){}
    static void poo(){
        System.out.println("I'm static");
    }
}
