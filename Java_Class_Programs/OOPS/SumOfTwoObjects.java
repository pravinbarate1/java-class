class SumOfTwoObjects{
    int a,b;

    
    SumOfTwoObjects(){
        a=b=0;
    }

    SumOfTwoObjects(int a, int b){
        this.a = a ;
        this.b = b;
    }

    SumOfTwoObjects  sum(SumOfTwoObjects soto){
        SumOfTwoObjects soto1 = new SumOfTwoObjects(); //local object

        soto1.a = this.a + soto.a;  //here this keyword is optional
        soto1.b = this.b + soto.b;

        return soto1;
    }

    void disp(){
        System.out.println("Val of a = "+a);
        System.out.println("Val of b = "+b);
    }
}

class SumOfTwoObjectsExec{

    public static void main(String [] args){
        int x1 = Integer.parseInt(args[0]);
        int x2 = Integer.parseInt(args[1]);
        
        int x3 = Integer.parseInt(args[2]);
        int x4 = Integer.parseInt(args[3]);

        SumOfTwoObjects soto1 = new SumOfTwoObjects(x1,x2);
        SumOfTwoObjects soto2 = new SumOfTwoObjects(x3,x4);
        SumOfTwoObjects soto3 = new SumOfTwoObjects();

        System.out.println("soto1 values");
        soto1.disp();

        System.out.println("soto2 values");
        soto2.disp();

        System.out.println("object sum");
        soto3.disp();
    }
}