class ObjectParameterisedConstructor{

    int a = 1;
    int b = 2;

    ObjectParameterisedConstructor(int x, int y){
      System.out.println("Object Param Constructor...");

      a = x;
      b = y;

      System.out.println("Val of a = "+a);
      System.out.println("Val of b = "+b);
    }

    
    ObjectParameterisedConstructor(ObjectParameterisedConstructor opc){
        System.out.println("Object Param Constructor...");
        
        ObjectParameterisedConstructor opc1 = opc;

        System.out.println("Val of a = "+opc.a);
        System.out.println("Val of b = "+opc.b);

        System.out.println("Val of a = "+opc1.a);
        System.out.println("Val of b = "+opc1.b);      

     }
}

class ObjectParamConstructorExec{

    public static void main(String [] args){

        ObjectParameterisedConstructor opc = new ObjectParameterisedConstructor(10, 20);

        ObjectParameterisedConstructor opc1 = new ObjectParameterisedConstructor(opc);

        System.out.println("main(): Val of a = "+opc1.a);
        System.out.println("main(): Val of b = "+opc1.b);      
    }
}