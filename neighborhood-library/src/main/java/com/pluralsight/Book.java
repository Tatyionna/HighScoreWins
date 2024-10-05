package com.pluralsight;

public class Book {
    public int idNumber;
    public String isbn;
    public String title;
    public boolean isCheckedOut;
    public String checkedOutTo;

    public Book () {
        this.idNumber = 00000;
        this.isbn = "";
        this.title = "";
        this.isCheckedOut =
        this.checkedOutTo = "";
    }

}
