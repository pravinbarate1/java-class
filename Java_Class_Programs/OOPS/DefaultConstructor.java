class DefaultConstructor{

    static int a,b;

    DefaultConstructor(){  // default constructor
        System.out.println("Default-Constructor");

        a = 10;
        b = 20;

        System.out.println("Value of a = "+ a);
        System.out.println("Value of b = "+ b);
    }
}

class DefaultConstructorExecutor{

    public static void main(String [] args){
        DefaultConstructor defaultConstructor = new DefaultConstructor();
    }
}