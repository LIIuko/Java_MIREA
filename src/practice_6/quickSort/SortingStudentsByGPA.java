package practice_6.quickSort;

import java.util.Comparator;

public class SortingStudentsByGPA implements Comparator<Student> {
    @Override
    public int compare(Student o1, Student o2) {
        return o1.getGPA() - o2.getGPA();
    }

    public void quickSort(Student[] students, int leftBorder, int rightBorder){
        int leftMarker = leftBorder;
        int rightMarker = rightBorder;
        Student element = students[(leftBorder + rightBorder) / 2];
        while(leftMarker <= rightMarker){
            while(compare(students[leftMarker], element) > 0){
                leftMarker++;
            }
            while(compare(students[rightMarker], element) < 0){
                rightMarker--;
            }
            if(leftMarker <= rightMarker){
                if(leftMarker < rightMarker){
                    Student tmp = students[leftMarker];
                    students[leftMarker] = students[rightMarker];
                    students[rightMarker] = tmp;
                }
                leftMarker++;
                rightMarker--;
            }
        }
        if(leftMarker < rightBorder){
            quickSort(students, leftMarker, rightBorder);
        }
        if(leftBorder < rightMarker){
            quickSort(students, leftBorder, rightMarker);
        }
    }
}
