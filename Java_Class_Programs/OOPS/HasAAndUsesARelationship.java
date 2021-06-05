class Student{
    int id;
    String name;

    Student(int id, String name){
         this.id = id;
         this.name = name;
    }

    void display(){
        System.out.println("Id = "+id);
        System.out.println("Name = "+name);
    }
}

class Teacher{
    int id;
    String teacherName;
    Student s = new Student(1,"Aarti");  // has-a relationship

    Teacher(int id, String teacherName){
        this.id = id;
        this.teacherName = teacherName;
    }

    void show(){
        System.out.println("Teacher Id = "+id);
        System.out.println("Teacher Name = "+teacherName);
        s.display();
    }
}

class College{
    String collegeName;

    College(String collegeName){
        this.collegeName = collegeName;
    }

    void print(){
        System.out.println("Colleage Name = "+ collegeName);
        Teacher t = new Teacher(1,"Hari");   // uses-a relationship
        t.show();        
    }
}

class HasAAndUsesARelationship{
    public static void main(String [] args){
        College c = new College("Sinhgad");

        c.print();
    }
}