package testInterface;

import java.io.FileNotFoundException;
import java.util.Objects;

public class Vehicle implements IDrivable,IRepairable {
    @Override
    public void doing() {
        System.out.println("say ayeee");
    }
    public void doo(){
       //must be commented to see diamond problem in interfaces
    }
    public static void main(String[] args)  {
        Vehicle iv = new Vehicle();
        iv.doing();
        iv.doo();

        IDrivable id = new Vehicle();
        id.doing();
        id.doo();


        IVehicle.poo();

        IRepairable ir = new RepairableVehicle();
        ir.doing();
    }
}
