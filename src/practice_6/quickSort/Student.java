package practice_6.quickSort;

public class Student{
    private int GPA;
    private String name;

    public Student(int GPA, String name) {
        this.name = name;
        this.GPA = GPA;
    }

    public int getGPA() {
        return GPA;
    }

    @Override
    public String toString() {
        return name + ", GPA - " + GPA;
    }
}
