class ConstructorOverloading{
   int a,b;
   float c;




   ConstructorOverloading(){
       System.out.println("Test - default constructor");

       a = 1;
       b = 2;

       System.out.println("Val of a = "+a);
       System.out.println("Val of b = "+b);
   }

   ConstructorOverloading(int x, int y){
    System.out.println("Test - 2 int param constructor");

    a = x;
    b = y;

    System.out.println("Val of a = "+a);
    System.out.println("Val of c = "+b);
  }
  ConstructorOverloading(float x){
    System.out.println("Test - 1 param float constructor");

    c = x;

    System.out.println("Val of c = "+c);
  } 

  ConstructorOverloading(float x, int y){
    System.out.println("Test - 2 param float n int constructor");

    c = x;
    a = y;

    System.out.println("Val of c = "+c);
    System.out.println("Val of a = "+a);
 } 

 ConstructorOverloading(int x, float y){
    System.out.println("Test - 2 param int n float constructor");

    a = x;
    c = y;

    System.out.println("Val of a = "+a);
    System.out.println("Val of c = "+c);
 } 
}
l of a = 1
Val of b = 2
Test - 2 int param constructor
Val of a = 10
Val of c = 20
Test - 1 param float constructor
Val of c = 10.0
Test - 2 param float n int constructor
Val of c = 10.0
Val of a = 20

class ParamConstructorExec{
    public static void main(String [] args){

        ConstructorOverloading co = new ConstructorOverloading();
        ConstructorOverloading co1 = new ConstructorOverloading(10 , 20);
        ConstructorOverloading co2 = new ConstructorOverloading(10.0f);
        ConstructorOverloading co3 = new ConstructorOverloading(10.0f , 20);
        ConstructorOverloading co4 = new ConstructorOverloading(10 , 20.0f);

    }
}