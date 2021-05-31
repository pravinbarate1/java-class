class Swap{

    int a, b;

    void set(int x, int y){ //a = 10 b =20        
        a = x;
        b = y;
    }

    void interchange(){
        int t = a;   // t = 10
        a = b;       //a = 20
        b = t;       // b = 10
    }

    void disp(){
        System.out.println("Val of a  = "+a);
        System.out.println("Val of b = "+b);

    }
}

class SwapDemo{

    public static void main(String [] args){
        int x = Integer.parseInt(args[0]);  // x = 10
        int y = Integer.parseInt(args[1]);  // y = 20

        Swap so = new Swap();

        so.set(x,y);
        
        System.out.println("Original Value");
        so.interchange();
        so.disp();
    }
}