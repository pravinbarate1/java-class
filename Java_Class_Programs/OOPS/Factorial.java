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
        int f = 1; // last f = 24

        while(n >  0){ 0 > 0
            // 1st iter ->  n = 4 -> 4 > 0, 
            // 2nd iter -> n = 3 -> 3>0, 
            // 3rd iter -> n = 2 -> 2>0  
            // 4th iter -> n = 1 -> 1>0
            f = f*n;    
            //1st iter f = 1, f = f*n -> f = 1*4 f= 4 , 
            //2nd iter f = f * n -> f = 4 * 3 f=12,
            // 3rd iter f = f * n -> f = 12 * 2 f=24,
            //4th iter f = f * n -> f = 24 * 1 f=24,  
            n = n-1;    // n = 3, n=2, n=1, n = 0
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