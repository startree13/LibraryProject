
public class Librarian {
    private String name;
    private int age;
    private char gender;
    private double salary;
    private int shift;
    private int daysOff;

    public Librarian(String name, int age, char gender, double salary, int shift, int daysOff) {
        this.name = name;
        this.age = age;
        this.gender = gender;
        this.salary = salary;
        this.shift = shift;
        this.daysOff = daysOff;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public char getGender() {
        return gender;
    }

    public void setGender(char gender) {
        this.gender = gender;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public int getShift() {
        return shift;
    }

    public void setShift(int shift) {
        this.shift = shift;
    }

    public int getDaysOff() {
        return daysOff;
    }

    public void setDaysOff(int daysOff) {
        this.daysOff = daysOff;
    }
}