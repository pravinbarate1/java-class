class C1{
    C1(int i){   // (3)
        System.out.println("value of i = "+ i);
        System.out.println("C1 - Base Constructor"); 
    }
}

class C2 extends C1{
    C2(){   // (2)
        super(10); // control goes to (3) 
        System.out.println("C1 - Intermediate Base Constructor");
    }
}

class C3 extends C2{
    C3(){   // (1)
        super();  // controle goes to  (2)
        System.out.println("C2 - Bottom most Derived class constructor");
    }
}

class SuperAtConstructorLevel{
    public static void main(String [] args){
        C3 c3 = new C3();  // control goes to (1)
    }
}