class Person{
    private String name;
    private int id;

    Person(String name,int id){
        this.name = name;
        this.id = id;
    }

    public int getId() {
        return id;
    }
    public String getName() {
        return name;
    }
    public void setId(int id) {
        this.id = id;
    }
    public void setName(String name) {
        this.name = name;
    }

    void getRoleDetails() {
        System.out.println("Name :" + getName());
        System.out.println("Id :" + getId());
    }
}

class Student extends Person {
    String program;

    Student(String name, int id, String program){
        super(name, id);
        this.program = program;
    }

    @Override
    void getRoleDetails() {
        System.out.println("Name :" + getName());
        System.out.println("Id :" + getId());
        System.out.println("Program :" + program);
    }
}

class Teacher extends Person {
    String subject;

    Teacher(String name, int id, String subject){
        super(name, id);
        this.subject = subject;
    }

    @Override
    void getRoleDetails() {
        System.out.println("Name :" + getName());
        System.out.println("Id :" + getId());
        System.out.println("Subject :" + subject);
    }
}

class Admin extends Person {
    String department;

    Admin(String name, int id, String department){
        super(name, id);
        this.department = department;
    }

    @Override
    void getRoleDetails() {
        System.out.println("Name :" + getName());
        System.out.println("Id :" + getId());
        System.out.println("Department :" + department);
    }
}

public class UniversitySystem {
    public static void main(String[] args) {
        Person[] human = new Person[3];
        human[0] = new Student("Mahesh Thapa", 21, "BCSIT");
        human[1] = new Teacher("Mahesh Thapa", 1, "English");
        human[2] = new Admin("Mahesh Thapa", 101, "Security");

        human[0].getRoleDetails();
        System.out.println();
        human[1].getRoleDetails();
        System.out.println();
        human[2].getRoleDetails();
    }
}
