package com.stackroute.pe3;

public class StudentMarks {

    public String averageCal(int numOfStudents,int data[]){
        int sum=0,avg;
        for(int i=0;i<numOfStudents;i++){
            sum=sum+data[i];
        }
        avg=sum/numOfStudents;
        if(avg>0 && avg<=100){

            return "Condition Satisfied";
        }
        else{
            return  "Error";
        }

    }
}
