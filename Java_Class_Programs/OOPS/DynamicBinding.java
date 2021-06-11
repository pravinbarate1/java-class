class Parent{
    void show(){
        System.out.println("Parent:: show()");
    }
}

class Child extends Parent{
    void show(){
        System.out.println("Child:: show()");
    }

}


class DynamicBinding{
    public static void main(String [] args){
        Parent p = new Parent();
        p.show();

        Child c = new Child();
        c.show();

        Parent p1 = new Child();
        p1.show();
    }
}