class Overloading{

     public int addition(int a, int b, int c){
        return a+b+c;
     }

     public int addition(int a, int b){
        int res = a+b;
        return res;
     }

     public float addition(int a, float b){
         return a+b;
     }

     public float addition(float a, int b){
         return a+b;
     }
    
     public static void main(String [] args){
        int a=10,b=20,c=30;
        float d = 10.10f;
   
        int res1;
        float res2;
        Overloading overloading = new Overloading();

        res1 = overloading.addition(a,b,c);
        System.out.println("addition = "+res1);

        res1 = overloading.addition(a,b);
        System.out.println("addition = "+res1);

        res2 = overloading.addition(a,d);
        System.out.println("addition = "+res2);

        res2 = overloading.addition(d,a);
        System.out.println("addition = "+res2);
    }

}