class Vehicle {
    void speedUp(){ System.out.println("Halo1");}
}
class Car extends Vehicle{
    @Override
    void speedUp(){ System.out.println("Halo2");}

    void drift(){ System.out.println("Drift");}
}

//no 2
class OverloadScenario{
    void test(int a,double b){ System.out.println("Fase A: int, double");}
    void test(double a,int b){ System.out.println("Fase B: double, int");}
}


public class App {
    public static void main(String[] args) throws Exception {
        Vehicle myVehicle = new Car();
        myVehicle.speedUp();
        // myVehicle.drift();

        OverloadScenario example = new OverloadScenario();
        // example.test(10,5);
    }
}
