/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.book_lending;

/**
 *
 * @author HOME
 */
public class Book_lending {
    
    private int no_of_issued_books;
    private String Issue_Date;
    private String book_return_date;
    
 
    /**
     *
     * @param no_of_issued_books
     * @param Issue_Date
     * @param book_return_date
     */
    public Book_lending(int no_of_issued_books, String Issue_Date, String book_return_date) {
        this.no_of_issued_books = no_of_issued_books;
        this.Issue_Date = Issue_Date;
        this.book_return_date = book_return_date;
    }

    /**
     *
     * @param user_ID
     * @param Issue_Date
     * @param Book_title
     * @param Author
     */
    public Book_lending(String user_ID, String Issue_Date,String Book_title,String Author){
               this.Author = Author ;
               this.Book_title = Book_title;
               this.Issue_Date = Issue_Date;
               this.user_id = user_ID;
               
    }

    /**
     *
     * @return
     */
    public int getNo_of_issued_books() {
        return no_of_issued_books;
    }

    /**
     *
     * @param no_of_issued_books
     */
    public void setNo_of_issued_books(int no_of_issued_books) {
        this.no_of_issued_books = no_of_issued_books;
    }

    /**
     *
     * @return
     */
    public String getBook_issue_date() {
        return Issue_Date;
    }

    /**
     *
     * @param book_issue_date
     */
    public void setBook_issue_date(String book_issue_date) {
        this.Issue_Date = book_issue_date;
    }

    /**
     *
     * @return
     */
    public String getBook_return_date() {
        return book_return_date;
    }

    /**
     *
     * @param book_return_date
     */
    public void setBook_return_date(String book_return_date) {
        this.book_return_date = book_return_date;
    }

    /**
     *
     * @return
     */
   
   
    
   
    }

