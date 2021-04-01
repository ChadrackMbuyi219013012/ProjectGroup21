/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package za.ac.cput.projectgroup21;

/**
 *
 * @author Simphiwe Kahlana 220162891
 */
public class Student {
    private String name;
    private long studentNumber;
    private double loanAmount;
    
    public Student (){
        name = "Unknown";
        studentNumber = 0;
        loanAmount = 0;
    }
    
    public Student (String name, long studentAmount, double loanAmount){
        this.name = name;
        this.studentNumber = studentNumber;
        this.loanAmount = loanAmount;
    }

    public String getName() {
        return name;
    }

    public long getStudentNumber() {
        return studentNumber;
    }

    public double getLoanAmount() {
        return loanAmount;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setStudentNumber(long studentNumber) {
        this.studentNumber = studentNumber;
    }

    public void setLoanAmount(double loanAmount) {
        this.loanAmount = loanAmount;
    }
    
     public String toString ()
        {
            String str = String.format("Name: %S\nStudent Number: %d\nLoan Amount:  %.2f\n", this.name, this.studentNumber, this.loanAmount);
        
            return str ;
        }
    
    
}
