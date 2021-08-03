package academy.learnprogramming;

public class Main {

    public static void main(String[] args) {
        Student student=new Student(12,'F',"Stephen","Curry");
        student.setResidentialStatus("Hostel");
        System.out.println(student.getResidentialStatus());
        System.out.println("FeePerMonth for a hostler per month including semesterFee : "+student.calculateFees(80000,70000));
        System.out.println("studentId : "+student.getStudentId());
        System.out.println("studentName: "+student.getStudentName());
        System.out.println("=========================");
        Student student1=new Student(13,'F',"Klay","Thomas");
        student.setResidentialStatus("DayScholar");
        System.out.println("FeePerMonth for a DayScholar : "+student1.calculateFees(80000));
        System.out.println("StudentId : "+student1.getStudentId());
        System.out.println("StsudeTName : "+student1.getStudentName());


    }
}
