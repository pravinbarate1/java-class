abstract class C1{
    abstract void f1();
    abstract void f2();
}

abstract class C2 extends C1{
    void f1(){
        System.out.println("f1 defined in C1");
    }
}

class C3 extends C2{

    void f2(){
        System.out.println("f2 defined in C3");
    }

    void f1(){
        super.f1();
        System.out.println("f1 defined in C3");
    }

    void f3(){
        System.out.println("f3 is specialized method in C3");
    }
}

class AbstractClassDemo{
    public static void main(String [] args){
        System.out.println("W.R.T C3 inheritance");

        C3 o3 = new C3();

        o3.f1();
        o3.f2();
        o3.f3();

        System.out.println("w.r.t c2 dynamic binding.");

        C2 o2 = new C3();

        o2.f1();
        o2.f2();
        //o2.f3().  Invalid since f3() doesn't exist in C2

        System.out.println("w.r.t C1 dynamic binding.");

        C1 o1 = new C3();

        o1.f1();
        o1.f2();
        //o1.f3(); // Invalid since f3 doesn't exist in C1.
    }
}