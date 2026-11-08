package Light_Yagami_Project.OOP_Practice.oppTest;

public class Students {
    String StudentNames;
    int Id;

    public Students(String student,int StudentId){
        StudentNames = student;
        Id = StudentId;
    }
    public  void showInfo(){
    System.out.println("=================================");
    System.out.println("STUDENT NAME: " + StudentNames );
    System.out.println("STUDENT ID-NUMBER: " + Id );
    }
}

