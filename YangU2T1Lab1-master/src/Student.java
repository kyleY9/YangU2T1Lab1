public class Student {

    // instance variables
    private String name;
    private int age;
    private int grade;

    // constructor
    public Student(String studentName, int studentAge, int studentGrade) {
        name = studentName;
        age = studentAge;
        grade = studentGrade;
    }

    // method that introduces the student
    public void introduce() {
        if (grade > 8) {
            System.out.println("I am " + name + ", a " + age + " year old high school student in the " + grade + "th grade.");
        } else if (grade > 5) {
            System.out.println("I am " + name + ", a " + age + " year old middle school student in the " + grade + "th grade.");
        } else {
            System.out.println("I am " + name + ", a " + age + " year old elementary school student in the " + grade + "th grade.");
        }
    }

    // method that prints student info
    public void printStudentInfo() {
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("Grade: " + grade);
    }
}



