import java.util.ArrayList;

public class Customer {
    private int age;
    private ArrayList<Books> listOfBooks;
    private String name;
    private String email;
    private String phone;
    private String address;
    private boolean penalty;


    public Customer(int age, ArrayList<Books> listOfBooks, String name, String email, String phone, String address, boolean penalty) {
        this.age = age;
        this.listOfBooks = listOfBooks;
        this.name = name;
        this.email = email;
        this.phone = phone;
        this.address = address;
        this.penalty = penalty;

    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public ArrayList<Books> getListOfBooks() {
        return listOfBooks;
    }

    public void setListOfBooks(ArrayList<Books> listOfBooks) {
        this.listOfBooks = listOfBooks;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public boolean isPenalty() {
        return penalty;
    }

    public void setPenalty(boolean penalty) {
        this.penalty = penalty;
    }
}