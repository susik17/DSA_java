class plane{
    //these varaiables and methods inside parent class can be used by the child classes
    String str1 = "CargoPlane" ;
    String str2 = "PassangerPlane";
     void fly(){
         System.out.println("plane is flying");
     }
     void takeOff(){
         System.out.println("plane is ready to takeoff");
     }
}
class CargoPlane extends plane{
    void Cargofly(){
        System.out.println(str1+" is flying");
   }
    void CargotakeOff(){
        System.out.println(str1+" is ready to takeoff");
   }
}
class passangerPlane extends plane{
    void passangerfly(){
        System.out.println(str2+" is flying");
   }
    void passangertakeOff(){
        System.out.println(str2+" is ready to takeoff");
   }
}
class Main {
    public static void main(String[] args) {
        //give parent as reference type for both
        CargoPlane cp = new CargoPlane();
        passangerPlane pp = new passangerPlane();
        cp.CargotakeOff();
        cp.Cargofly();
        pp.passangertakeOff();
        pp.passangerfly();
        
    }
}
