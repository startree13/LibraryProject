import java.util.ArrayList;

public class LibrarySystem {
    private ArrayList<Librarian> listOfLibrarians;
    private ArrayList<Books> listOfBooks;
    private ArrayList<Customer> listOfCustomers;
    private int booksNumber;
    private int employeesNumber;
    private int borrowedBooks;



    public LibrarySystem(ArrayList<Librarian> listOfLibrarians, ArrayList<Books> listOfBooks, ArrayList<Customer> listOfCustomers, int booksNumber, int employeesNumber, int borrowedBooks) {
        this.listOfLibrarians = listOfLibrarians;
        this.listOfBooks = listOfBooks;
        this.listOfCustomers = listOfCustomers;
        this.booksNumber = booksNumber;
        this.employeesNumber = employeesNumber;
        this.borrowedBooks = borrowedBooks;
    }
    public LibrarySystem(Librarian librarian) {
        this.listOfLibrarians.add(librarian);
    }

    public ArrayList<Librarian> getListOfLibrarians() {
        return listOfLibrarians;
    }

    public void setListOfLibrarians(ArrayList<Librarian> listOfLibrarians) {
        this.listOfLibrarians = listOfLibrarians;
    }

    public ArrayList<Books> getListOfBooks() {
        return listOfBooks;
    }

    public void setListOfBooks(ArrayList<Books> listOfBooks) {
        this.listOfBooks = listOfBooks;
    }

    public ArrayList<Customer> getListOfCustomers() {
        return listOfCustomers;
    }

    public void setListOfCustomers(ArrayList<Customer> listOfCustomers) {
        this.listOfCustomers = listOfCustomers;
    }

    public int getBooksNumber() {
        return booksNumber;
    }

    public void setBooksNumber(int booksNumber) {
        this.booksNumber = booksNumber;
    }

    public int getEmployeesNumber() {
        return employeesNumber;
    }

    public void setEmployeesNumber(int employeesNumber) {
        this.employeesNumber = employeesNumber;
    }

    public int getBorrowedBooks() {
        return borrowedBooks;
    }

    public void setBorrowedBooks(int borrowedBooks) {
        this.borrowedBooks = borrowedBooks;
    }
}