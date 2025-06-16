class Patient{
    private String name;
    private int age;

    Patient(String name,int age){
        this.name = name;
        this.age = age;
    }

        //getters
    public int getAge() {
        return age;
    }
    public String getName() {
        return name;
    }
        //setters
    public void setAge(int age) {
        this.age = age;
    }
    public void setName(String name) {
        this.name = name;
    }
    void getTreatmentPlan(){
        System.out.println("Treatment Plan of "+ getName() + ", of age: "+ getAge());
    }
}
class InPatient extends Patient{
    private int roomNumber;
    InPatient(String name,int age,int roomNumber){
        super(name, age);
        this.roomNumber = roomNumber;
    }

    public int getRoomNumber() {
        return roomNumber;
    }
    public void setRoomNumber(int roomNumber) {
        this.roomNumber = roomNumber;
    }

    @Override
    void getTreatmentPlan(){
    System.out.println("Treatment Plan of "+ getName() + ", of age: "+ getAge());
    System.out.println("Room no. of patient: " + roomNumber);
    }
}

class OutPatient extends Patient{
    private String appointmentDate;

    OutPatient(String name,int age,String appointmentDate){
        super(name, age);
        this.appointmentDate = appointmentDate;
    }

    public void setAppointmentDate(String appointmentDate) {
        this.appointmentDate = appointmentDate;
    }
    public String getAppointmentDate() {
        return appointmentDate;
    }

    @Override
    void getTreatmentPlan(){
    System.out.println("Treatment Plan of "+ getName() + ", of age: "+ getAge());
    System.out.println("Appoint date: " + appointmentDate);
    }
}
public class HospitalRecords {
    public static void main(String[] args) {
        Patient[] vet = new Patient[2];

        vet[0] = new InPatient("Mahesh Thapa", 45, 101);
        vet[1] = new OutPatient("John The Don", 32, "2025-06-20");

        vet[0].getTreatmentPlan();
        vet[1].getTreatmentPlan();
    }
}
