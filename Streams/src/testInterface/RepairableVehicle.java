package testInterface;

public class RepairableVehicle extends Vehicle implements IRepairable{

    @Override
    public void doing() {
        System.out.println("Say doing Repair");
    }

    public static void main(String[] args) {
        RepairableVehicle rv = (RepairableVehicle) new Vehicle();

        rv.doo();
    }
}
