class ThisObjectMethod{
    int a,b;

    ThisObjectMethod(){  // ----- (2)   default constructor
        this(1000);  // control goes to (3)

        System.out.println("Default Constructor");

        a = 1;   
        b = 2;

        System.out.println("Val of a = "+ a);
        System.out.println("Val of b = "+ b);
    }

    ThisObjectMethod(int x){  // ----- (3)  single paramerterised constructor x =100

        System.out.println("Single param Constructor");

        a = x;  // a = 1000
        b = x;  // b = 1000

        System.out.println("Val of a = "+ a);
        System.out.println("Val of b = "+ b);
    }

    ThisObjectMethod(int x , int y){  // ----- (1) x = 100 y = 200
        this();      // control goes to (2)

        System.out.println("Two param Constructor");

        a = x;  //a = 100
        b = y;  //b = 200

        System.out.println("Val of a = "+ a);
        System.out.println("Val of b = "+ b);
    }
}

class ThisObjectMethodExec{

    public static void main(String [] args){
        ThisObjectMethod tom = new ThisObjectMethod(100, 200); // control goes to (1)
    }
}