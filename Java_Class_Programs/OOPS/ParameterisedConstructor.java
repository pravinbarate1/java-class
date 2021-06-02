class ParameterisedConstructor{

    int a, b;

    ParameterisedConstructor(int x, int y){
        System.out.println("Test Parameterised constructor...");

        a = x;
        b = y;

        System.out.println("Val of a = "+a);
        System.out.println("Val of b = "+b);
    }
}

class ParamConstructorExec{

    public static void main(String [] args){
        ParameterisedConstructor pc1 = new ParameterisedConstructor(1,2);
        ParameterisedConstructor pc2 = new ParameterisedConstructor(10,20);
        ParameterisedConstructor pc3 = new ParameterisedConstructor(100,200);
    }
}