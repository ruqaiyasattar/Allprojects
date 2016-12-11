package com.example.android.reportcard;

import java.util.ArrayList;

/**
 * Created by abc on 10/30/2016.
 */
public class ReportCard {
   protected ArrayList<Integer> obtaindmaeks =new ArrayList<Integer>();
   // int obtaindmaeks;
    String StudentName;
    String subjects;
    String year;
    /*public ReportCard() {
    }*/
    public ReportCard(ArrayList obtaindmaeks, String studentName, String subjects, String year) {
        this.obtaindmaeks = obtaindmaeks;
        StudentName = studentName;
        this.subjects = subjects;
        this.year = year;
    }
    public  String getStudentName(){
        return StudentName;
    }
    public void addgrade(int obtaindmaeks){

        this.obtaindmaeks.add(obtaindmaeks);
      //  Log.d("Addgrads",addgrade(obtaindmaeks)," here is students grade");
    }
    public int percentage(){
        int percent=0;
        for(int p: obtaindmaeks){
            percent +=p;
        }
        percent=(percent/obtaindmaeks.size()*100);
        System.out.println(Addsubject(subjects)+" got "+percent);
        return percent;
    }
    public String Addsubject(String subjects){
        return subjects;
    }
    @Override
    public String toString() {
        return "ReportCard{" +
                "grade=" + obtaindmaeks +
                " percentage "+percentage()+
                ", StudentName='" + StudentName + '\'' +
                ", subjects='" + subjects + '\'' +
                ", year=" + year + '}';
    }
}
