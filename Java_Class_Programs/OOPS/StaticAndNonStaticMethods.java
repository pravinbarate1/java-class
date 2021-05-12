import java.util.*;

class StaticAndNonStaticMethods{

    String name;

    StaticAndNonStaticMethods(String name){
         this.name = name;
    }

    StaticAndNonStaticMethods(){
     
    }

    public static void addStudent(){    // static method

       System.out.println("Student Added Succesfully...");
    }

    public String getStudent(){        //non-static method
        return this.name;
    }

}

class Executor{

    public static void main(String [] args){

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter Student Name...");
        String name = sc.nextLine();

        StaticAndNonStaticMethods.addStudent();

        StaticAndNonStaticMethods sm = new StaticAndNonStaticMethods(name);

        System.out.println(sm.getStudent());


    }
}