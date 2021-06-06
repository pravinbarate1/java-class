class Base{
    int a;
}

class Derived extends Base{
    int a, c;

    void set(int x, int y){
        super.a = x;
        a = y;        
    }

    void sum(){
        c = super.a + this.a;        
    }

    void display(){
        System.out.println("Value of Base from a = "+super.a);

        System.out.println("Value of Derived from a = "+a);

        System.out.println("Sum = "+c);
    }
}


class SuperAtVariableLevel{
    public static void main(String [] args){
        int x = Integer.parseInt(args[0]);
        int y = Integer.parseInt(args[1]);

        Derived d = new Derived();

        d.set(x,y);
        d.sum();
        d.display();
    }
}