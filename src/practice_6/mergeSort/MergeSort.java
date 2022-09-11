package practice_6.mergeSort;

import java.util.Arrays;

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

public class MergeSort {
    public static void main(String[] args) {
        Student[] students1 = {
                new Student(1123, "Alex"),
                new Student(132, "Bob"),
                new Student(123, "Frank"),
                new Student(561243, "Jack"),
        };
        Student[] students2 = {
                new Student(1, "Max"),
                new Student(7653, "Ann"),
                new Student(5643, "Katty"),
                new Student(1523, "Elena"),
        };

        Student[] students = new Student[students1.length + students2.length];
        System.arraycopy(students1, 0 ,students, 0, students1.length);
        System.arraycopy(students2, 0 ,students, students1.length, students2.length);
        for (Student s : students) {
            System.out.println(s);
        }
        System.out.println("------------------------------------");
        mergeSort(students, 0, students.length - 1);
        for (Student s : students) {
            System.out.println(s);
        }
    }

    private static void mergeSort(Student[] students, int leftBorder, int rightBorder){
        int mid = leftBorder + (rightBorder - leftBorder) / 2;
        if(rightBorder - leftBorder > 1){
            mergeSort(students, leftBorder, mid);
            mergeSort(students, mid + 1, rightBorder);
        }
        Student[] buffer = Arrays.copyOfRange(students, leftBorder, rightBorder + 1);
        int left = 0;
        int right =  buffer.length % 2 == 0 ? buffer.length / 2 : buffer.length / 2 + 1;
        int endFirstArr = right;
        while(left < endFirstArr && right < buffer.length){
            if(buffer[left].compareTo(buffer[right]) < 0){
                students[leftBorder++] = buffer[left++];
            }else{
                students[leftBorder++] = buffer[right++];
            }
        }
        while(left < endFirstArr){
            students[leftBorder++] = buffer[left++];
        }
        while(right < buffer.length){
            students[leftBorder++] = buffer[right++];
        }
    }
}
