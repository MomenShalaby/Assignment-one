package com.pioneers.assignment1;

import java.util.HashSet;
import java.util.Set;

public class Library {

    private final Set<Integer> loanedBooks;

    public Library() {
        loanedBooks = new HashSet<>();
    }

    public void loanBook(int bookId) {
        loanedBooks.add(bookId);
    }

    public void returnBook(int bookId) {
        loanedBooks.remove(bookId);
        printLoanedBooks();
    }

    public void printLoanedBooks() {
        System.out.println("Current loaned books:");
        loanedBooks.forEach(System.out::println);
    }

    public static void main(String[] args) {
        Library library = new Library();

        library.loanBook(101);
        library.loanBook(205);
        library.loanBook(309);

        library.returnBook(205);
        library.loanBook(412);
        library.returnBook(101);
    }


}
