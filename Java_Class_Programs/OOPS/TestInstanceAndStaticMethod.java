class TestInstanceAndStaticMethod{
    void m1(){
        System.out.println("m1-instance method");
    }
    void m2(){
        m1(); //rule-2
        TestInstanceAndStaticMethod.m3(); //rule-4
        System.out.println("m2-instance method");
    }
    static void m3(){
        System.out.println("m3-static method");
    }
    public static void main(String [] args){
        System.out.println("I am from main method.");

        TestInstanceAndStaticMethod tiam = new TestInstanceAndStaticMethod();
        tiam.m2();  //rule-3
        m3(); //or //rule1
        //TestInstanceAndStaticMethod.m3();

        System.out.println("I am from main end."); 
    }
}