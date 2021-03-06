class PrimeNumber{
    int n;

    void set(int x){
        n=x;
    }

    PrimeNumber(){
        n = 10;
        
    }
    String decide(){
        int i;             // n = 3, i=0; i = 2, 
        for(i=2;i<n;i++){    //i<n -> 2<3
            int r = n%i;   // r = n%i -> 4%2    8/2 = 0 
            if(r==0){
                break;
            }
        }

        if(i == n)
            return "PRIME";
        else
            return "NOT A PRIME";
    }
}

class PrimeExec{

    public static void main(String [] args){
        if(args.length != 1){
            System.out.println("Enter atleast one value");
        }else{
            int x = Integer.parseInt(args[0]);

            if(x<=1){
                System.out.println(x+" is invalid");
            }else{
                PrimeNumber primeNumber = new PrimeNumber();

                primeNumber.set(x);
                String res = primeNumber.decide();

                System.out.println(res);
            }
        }
    }
}