abstract class plane{
    abstract void fly();
    abstract void takeOff();
}
class CargoPlane extends plane{
    void fly(){
        System.out.println("Cargoplane is flying");
   }
    void takeOff(){
        System.out.println("Cargoplane is ready to takeoff");
   }
}
class passangerPlane extends plane{
    void fly(){
        System.out.println("passangerplane is flying");
   }
    void takeOff(){
        System.out.println("passangerplane is ready to takeoff");
   }
}
class Main {
    public static void main(String[] args) {
        //give parent as reference type for both
        plane cp = new CargoPlane();
        plane pp = new passangerPlane();
        cp.takeOff();
        cp.fly();
        pp.takeOff();
        pp.fly();
        
    }
}
