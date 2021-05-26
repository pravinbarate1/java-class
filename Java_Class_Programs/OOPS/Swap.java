class Swap{

    int a, b;

    void set(int x, int y){
        a = x;
        b = y;
    }

    void interchange(){
        int t = a;
        a = b;
        b = t;
    }

    void disp(){
        System.out.println("Val of a  = "+a);
        System.out.println("Val of b = "+b);

    }
}

class SwapDemo{

    public static void main(String [] args){
        int x = Integer.parseInt(args[0]);
        int y = Integer.parseInt(args[1]);

        Swap so = new Swap();

        so.set(x,y);
        
        System.out.println("Original Value");
        so.interchange();
        so.disp();
    }
}