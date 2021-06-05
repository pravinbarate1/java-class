class Base{
    int a;
    
    void display(){
        System.out.println("Base: display()");
    }
}

class Derived extends Base{    // Is-a relationship
    int b;

    void show(){
        display();

        System.out.println("Derived: display()");

        a = 100;
        b = 200;

        System.out.println("Val of a = "+a);
        System.out.println("Val of b = "+b);
    }
}

class InheritanceDemo{
    public static void main(String [] args){
        Derived d = new Derived();

        d.display();
        d.show();
    }
}

