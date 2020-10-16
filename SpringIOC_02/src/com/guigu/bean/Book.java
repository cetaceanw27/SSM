package com.guigu.bean;

public class Book {
    private String bookName;
    private String author;

    public void myInit(){
        System.out.println("init book");
    }

    public  void myDestory(){
        System.out.println("destory book");
    }

    public Book() {
        System.out.println("book success");
    }

    @Override
    public String toString() {
        return "Book{" +
                "bookName='" + bookName + '\'' +
                ", author='" + author + '\'' +
                '}';
    }

    public String getBookName() {
        return bookName;
    }

    public void setBookName(String bookName) {
        this.bookName = bookName;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }
}
