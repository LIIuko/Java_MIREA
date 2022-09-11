package practice_6.insertSort;


class Student implements Comparable<Student>{
    private int IDNumber;
    private String name;

    public Student(int IDNumber, String name) {
        this.IDNumber = IDNumber;
        this.name = name;
    }

    public int getIDNumber() {
        return IDNumber;
    }

    @Override
    public String toString() {
        return name + ", id = " + IDNumber;
    }

    @Override
    public int compareTo(Student o) {
        return this.IDNumber - o.getIDNumber();
    }
}


public class InsertSort {
    public static void main(String[] args) {
        Student[] students = {
                new Student(1123, "Alex"),
                new Student(132, "Bob"),
                new Student(123, "Frank"),
                new Student(561243, "Jack"),
                new Student(1, "Max"),
                new Student(7653, "Ann"),
                new Student(5643, "Katty"),
                new Student(1523, "Elena"),
        };
        for(Student s : students){
            System.out.println(s.toString());
        }
        System.out.println("---------------------------------");
        for(int i = 0; i < students.length; i++){
            Student student = students[i];
            int j = i - 1;
            for(; j >= 0; j-=1) {
                if (student.compareTo(students[j]) < 0) {
                    students[j + 1] = students[j];
                }
                else{
                    break;
                }
            }
            students[j + 1] = student;
        }
        for(Student s : students){
            System.out.println(s.toString());
        }
    }
}
