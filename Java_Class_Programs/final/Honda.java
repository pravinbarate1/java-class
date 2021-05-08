class Bike{
 /*final*/ void run(){   // method signature (access modifier + keyword + return type + methodName)
    System.out.println("Bike is running...");
 }
}

class Honda extends Bike{
    void run(){
        System.out.println("Bike is running fast"); 

    }

    public static void main(String [] args){
        Honda honda = new Honda();
        Bike bike = new Honda();  // -> CTTI (Compile Time Type Identificatin) RTTI (Runtime Type Identification)
        Bike bike1 = new Bike();
        honda.run();

        bike.run();

        bike1.run();
    }

}