class Employee {
    private String name;
    private int id;
    private double salary;

    public Employee(String name, int id, double salary){
        this.name = name;
        this.id = id;
        this.salary = salary;
    }

    double getSalary() {
        return salary;
    }

    void setSalary(double salary) {
        this.salary = salary;
    }

    String getName() {
        return name;
    }

    int getId() {
        return id;
    }
    double calcSalary(){
        return salary;
    }
}

class Manager extends Employee{
    private double bonus;

    public Manager(String name,int id, double salary,double bonus){
        super(name, id, salary);
        this.bonus = bonus;
    }

void setBonus(double bonus) {
    this.bonus = bonus;
}
double getBonus() {
    return bonus;
}

@Override 
double calcSalary() {
    return getSalary() + bonus;
}
}

class Developer extends Employee {
    private int overtimeHours;
    private double ratePerHour;

    public Developer(String name,int id, double salary, int overtimeHours, double ratePerHour){
        super(name, id, salary);
        this.overtimeHours = overtimeHours;
        this.ratePerHour = ratePerHour;
    }

    void setOverTimeHours(int hours) {
        this.overtimeHours = hours;
    }

    void setRatePerHours(double rate) {
        this.ratePerHour = rate;
    }

    int getOverTimeHours() {
        return overtimeHours;
    }

    double getRatePerHour() {
        return ratePerHour;
    }

    @Override
    double calcSalary() {
        return getSalary() + (overtimeHours * ratePerHour);
    }
}


public class EmployeeSystem {
    public static void main(String[] args) {
        Manager me = new Manager("Mahesh", 122, 10000, 2000);
        Developer you = new Developer("John", 123, 200000, 10, 100);

        System.out.println("Manager " + me.getName() + " Salary: " + me.calcSalary());
        System.out.println("Developer " + you.getName() + " Salary: " + you.calcSalary());
    }
    }

