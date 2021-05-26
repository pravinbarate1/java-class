class Factorial{

    int n;

    void set(int x){
        n = x;
    }

    void disp(){
      int res = factCal();

      System.out.println("Factorial = "+res);
    }

    int factCal(){
        int f = 1;

        while(n >  0){
            f = f*n;
            n = n-1;
        }
        return f;
    }
}

class FactExec{

    public static void main(String [] args){
        if(args.length != 1){
            System.out.println("Please enter one value");
        }else{
            int x = Integer.parseInt(args[0]);

            if(x<0){
                System.out.println(x + " is invalid");
            }else{

                Factorial factorial = new Factorial();

                factorial.set(x);
                factorial.disp();
            }
        }
    }
}