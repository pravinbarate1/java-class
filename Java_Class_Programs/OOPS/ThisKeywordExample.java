class ThisKeywordExample{

    int a, b; 

    ThisKeywordExample(int a, int b){
        this.a = a;  // assigning formal param values to the data member of the class  ; this.a = 0; -> this.a = a -> this.a = 10;
        this.b = b; // assigning formal param values to the data member of the class  ; this.b = 0; -> this.b = b -> this.a = 20;

        a = a + 1;  // modifying the values of the formal parameters. a = a +1; -> a = 10 + 1 = 11;
        b = b + 1;  // modifying the values of the formal parameters. b = b + 1; -> b = 20 + 1 = 21

        this.a = this.a+1;  // modifying the values of the data member of the class this.a = this.a + 1 -> this.a = 10 + 1 = 11
        this.b = this.b+1;  // modifying the values of the data member of the class this.b = this.b + 1 -> this.b = 20 + 1 = 21

        System.out.println("Val of formal Param a = "+ a);
        System.out.println("Val of formal Param b = "+ b);
    }

    void disp(){
        System.out.println("Val of a = "+this.a);  // writting this keyword is optional.
        System.out.println("Val of b = "+this.b);
    }
}

class ThisKeywordExec{
    public static void main(String [] args){
        ThisKeywordExample tke = new ThisKeywordExample(10,20);
        tke.disp();
    }
}