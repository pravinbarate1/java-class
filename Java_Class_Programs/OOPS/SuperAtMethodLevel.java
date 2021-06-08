class Base{
    void display(){
        System.out.println("Base:: display()");
    }
}

class Derived extends Base{
    void display(){
        super.display();

        System.out.println("Derived:: display()");
    }
}

class SuperAtMethodLevel{
    public static void main(String [] args){
        Derived d = new Derived();

        d.display();
    }
}