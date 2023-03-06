package packageComparator;

public class Student implements Comparable<Student> {
    float marks;
    int rollNo;

    public Student(float marks, int rollNo) {
        this.marks = marks;
        this.rollNo = rollNo;
    }

    @Override
    public int compareTo(Student o) {
        int diff=(int)(this.marks-o.marks);
        return diff;
        // if diff==0;  both are equal
        // if diff<0;   o is bigger
        // if diff>0;   o is smaller
    }
}
