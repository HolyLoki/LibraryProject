package com.company.Questions;

import com.company.Classes.Book;
import com.company.Classes.Student;

import java.util.List;

public interface GiveBook {
    Book giveBook(String n, List<Student> students,List<Book> books);
}
