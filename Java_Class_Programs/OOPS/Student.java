public class Student{
     int id;
     String name;
     float m1, m2,m3;
     String collegeName;

     public int getId(){
        return id;
     }


     public void buildStudent(int id, String name, float m1, float m2, float m3, String collegeName){
        this.id = id;

        this.name = name;
        this.m1 = m1;
        this.m2 = m2;
        this.m3 = m3;

        this.collegeName = collegeName;

     }
}
class Execute{

   public static void main(String [] args){
       Student s = new Student();

       s.buildStudent(1, "Hari", 90.00f, 92.00f,93.00f, "Sinhgad");
       System.out.println("Student Id: = "+s.getId());


        //Student Id: = 1
        // 

   }
}
