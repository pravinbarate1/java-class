class Base{

    void show(){
        System.out.println("show() : Original");
    }
}

class IBase extends Base{
    void show(){
        super.show();
        System.out.println("show() : redefine first");
    }
}

class Derived extends IBase{
    void show(){
        super.show();
        System.out.println("show() : redefine second");
    }
}

class SuperAtMethodOverridingLevel{
    public static void main(String [] args){
        Derived d = new Derived();
        d.show();
        
        IBase ibase = new IBase();

        ibase.show();

        IBase ibase = new Derived();
        ibase.show()
        
    }
}