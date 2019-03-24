/*
Listing 10.6 Course.java
 */

public class Course
{
    private String courseName;
    private String[] students = new String[100]; // an array to store students for the course
    private int numberOfStudents;

    public Course(String courseName)
    {
        this.courseName = courseName; // 初始化数据
    }

    public void addStudent(String student)
    {
        students[numberOfStudents] = student;
        numberOfStudents ++;
    }

    public String[] getStudents()
    {
        return students;
    }

    public int getNumberOfStudents()
    {
        return numberOfStudents;
    }

    public String getCourseName()
    {
        return courseName;
    }
}