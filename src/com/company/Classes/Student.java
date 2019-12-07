package com.company.Classes;

import java.awt.*;
import java.util.ArrayList;
import java.util.List;

public class Student {
    private String firstName;
    private String lastName;
    private String phone;

    public List<Book> getBooksList() {
        for (Book book: booksList){
            System.out.println(book.getBookName()+" "+book.getAuthor());
        }
        return booksList;
    }

    public List<Book> booksList = new ArrayList<>();

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }
}
