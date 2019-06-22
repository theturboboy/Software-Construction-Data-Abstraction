package model;

import java.util.ArrayList;

/**
 * INVARIANT: course list and grade list are the same size
 * each course has a grade associated, and vice versa, at matching indices
 */

public class Transcript {
    String name;
    int id;
    ArrayList<String> courses;
    ArrayList<Double> grades;

    public Transcript(String name, int id) {
        this.name = name;
        this.id = id;
        this.courses = new ArrayList<String>();
        this.grades = new ArrayList<Double>();
    }

    //REQUIRES: grade is between 0.0 and 4.0; course is not null
    //MODIFIES: this
    //EFFECTS: add course with grade to the list
    //
    public void addGrade(String course, double grade){
        this.courses.add(course);
        this.grades.add(grade);
    }

    //REQUIRES: a course the student has already taken
    //EFFECTS: returns course name and grade in format CourseName: Grade
    //
    public String getCourseAndGrade(String course){
        int length = courses.size();
        for (int i = 0; i < length; i++) {
            if (courses.get(i).equals(course)) {
                return courses.get(i) + ": " + grades.get(i);
            }
        }
        return null;
    }

    //EFFECTS: prints course names with grades earned
    //
    public void printTranscript(){
        for (String course : courses) {
            System.out.println(getCourseAndGrade(course));
        }
    }

    //EFFECTS: calculate and returns GPA
    //
    public double getGPA(){
        double sumGrades = 0;
        for (Double grade : grades) {
            sumGrades = sumGrades + grade;
        }
        return sumGrades / grades.size();
    }

    //EFFECTS: returns student name
    //
    public String getStudentName() {
        return this.name;
    }
}
