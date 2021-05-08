class FinalClass{
    public static void main(String [] args){

        int a;
        System.out.println("Hello from Final Class");

        FinalClassChild fcc = new FinalClassChild();

        fcc.print();  

    }
}

final class FinalClassChild{
    
    public void print(){
        System.out.println("Say Hello..");

    } 
    
}