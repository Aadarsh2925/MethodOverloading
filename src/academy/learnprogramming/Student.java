package academy.learnprogramming;

import com.sun.jdi.event.StepEvent;

public class Student {
    private int studentId;
    private char studentType;
    private  String studentName;
    private String residentialStatus;
    private double FeePerMonth;

    public Student(int studentId, char studentType, String FirstName, String LastName) {
        this.studentId = studentId;
        this.studentType = studentType;
        this.studentName=FirstName+LastName;
    }
    public void setResidentialStatus(String residentialStatus){
        this.residentialStatus=residentialStatus;
    }
    public String getResidentialStatus(){
        return residentialStatus;
    }
    public double calculateFees(double semesterFee){
        double feesPerMonth=semesterFee/6.0;
        return feesPerMonth;
    }
    public double calculateFees(double semesterFee,double hostelFee){
        double feePerMonth=(semesterFee+hostelFee)/6.0;
        return feePerMonth;
    }
    

    public int getStudentId() {
        return studentId;
    }

    public void setStudentId(int studentId) {
        this.studentId = studentId;
    }

    public char getStudentType() {
        return studentType;
    }

    public void setStudentType(char studentType) {
        this.studentType = studentType;
    }

    public String getStudentName() {
        return studentName;
    }

    public void setStudentName(String studentName) {
        this.studentName = studentName;
    }
}
