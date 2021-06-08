class Base{
    int a;  // a = 10
}

class Derived extends Base{
    int a, c;

    void set(int x, int y){  // x = 10 y = 20  
        super.a = x;   // super at variable level
        a = y;        // a = 20
    }

    void sum(){
        c = super.a + this.a;     // c = 30    
    }

    void display(){
        System.out.println("Value of Base from a = "+super.a);

        System.out.println("Value of Derived from a = "+a);

        System.out.println("Sum = "+c);
    }
}


class SuperAtVariableLevel{
    public static void main(String [] args){
        int x = Integer.parseInt(args[0]);  // cmd args 10
        int y = Integer.parseInt(args[1]);  // cmd args 20

        Derived d = new Derived();

        d.set(x,y);
        d.sum();
        d.display();
    }
}