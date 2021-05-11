class StaticDataMembers{
    static int a = 10;    // static data member
    static float b=10.10f; // static data member

    int c; // non static data member

    StaticDataMembers(int c){
        this.c = c;
    }

    public static void main(String [] args){

        System.out.println("a = "+StaticDataMembers.a);
        System.out.println("b = "+StaticDataMembers.b);
        
        StaticDataMembers sdm = new StaticDataMembers(10);
        StaticDataMembers sdm1 = new StaticDataMembers(11);

        System.out.println("c = "+sdm.c);
        System.out.println("c = "+sdm1.c);
        
        
        System.out.println("a = "+sdm.a);
        System.out.println("a = "+sdm1.a);

    }

    static{
        System.out.println("printed from static block..");
    }
}