package OOPS2;

//public class VehicleUse {
//    public static void main(String[] args) {
//////        Vehicle v = new Vehicle();
//////        v.color = "Black";
//////        v.setMaxSpeed(100);
//////        v.print();
////        Car c = new Car();
//////        c.numGears = 10;
//////        c.setMaxSpeed(100);
////        c.color = "Black";
//////        c.print();
//        Vehicle a = new Vehicle(5,7);
//        a.Vehicle();
////
//    }
//public static void main(String[] args){
//    Vehicle obj1 = new Car();
//    obj1.print();
//
//    Vehicle obj2 = new Vehicle();
//    obj2.print();
//}
//}
public class VehicleUse {
    public static void A() {
        System.out.print("Good ");
        throw new RuntimeException();
    }

    public static void B() {
        A();
        System.out.print("This ");
    }

    public static void main(String[] args) {
        try {
            B();
        } catch (Exception e) {
            System.out.print("Time ");
        } finally {
            System.out.print("at CodingNinjas");
        }
    }
}




//public class VehicleUse {
//    public static void main(String[] args){
//        Car obj1 = new Car();
//        obj1.print_C();
//        obj1.print_V();
//    }
//}
//