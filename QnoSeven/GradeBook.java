class Student {
    private String name;
    private int rollNumber;
    private double marks[];

    Student(String name, int rollNumber, double marks[]){
        this.name = name;
        this.rollNumber = rollNumber;
        this.marks = marks;
    }

    void setName(String name) {
        this.name = name;
    }
    void setRollNumber(int rollNumber) {
        this.rollNumber = rollNumber;
    }
    void setMarks(double marks[]){
        this.marks = marks;
    }

    String getName() {
        return name;
    }

    int getRollNumber() {
        return rollNumber;
    }

    double[] getMarks() {
        return marks;
    }

    double calculateAverage() {
        double sum = 0;
        for (double mark : marks) {
            sum += mark;
        }
        return sum / marks.length;
    }
}


class GraduateStudent extends Student {
    String thesisTopic;
    GraduateStudent(String name, int rollNumber, double marks[], String thesisTopic){
        super(name,rollNumber,marks);
        this.thesisTopic = thesisTopic;
    }
    void printThesisTitle() {
        System.out.println("The thesis topic is " + thesisTopic);
    }
}

public class GradeBook {
    public static void main(String[] args){
    Student A = new Student("Mahesh Thapa", 1,new double[]{100,95,60,37,23});
    GraduateStudent B = new GraduateStudent("Satyam", 2, new double[]{90,90,90,90,89.5},"AI");

    System.out.println("Student: " + A.getName());
    System.out.println("Average Marks: " + A.calculateAverage());

    System.out.println("\nGraduate Student: " + B.getName());
    System.out.println("Average Marks: " + B.calculateAverage());
    B.printThesisTitle();


    }
}
