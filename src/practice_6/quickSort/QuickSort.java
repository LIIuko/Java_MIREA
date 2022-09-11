package practice_6.quickSort;

import practice_6.quickSort.Student;

public class QuickSort {

    public static void main(String[] args) {
        SortingStudentsByGPA sortingStudentsByGPA = new SortingStudentsByGPA();
        Student[] students = {
                new Student(11, "Max"),
                new Student(25, "Ann"),
                new Student(54, "Katty"),
                new Student(65, "Elena"),
                new Student(1, "Jack"),
                new Student(34, "Bob"),
                new Student(43, "Alex"),
                new Student(80, "Frank"),
        };
        for(Student s : students){
            System.out.println(s.toString());
        }
        System.out.println("---------------------------------");
        sortingStudentsByGPA.quickSort(students, 0, students.length - 1);
        for(Student s : students){
            System.out.println(s.toString());
        }
    }
}
