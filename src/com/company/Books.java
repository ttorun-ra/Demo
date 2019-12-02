package com.company;

public class Books {

    private String bookname;
    public String getBookname() {
        return bookname;
    }

    public String setBookname(String bookname) {
        this.bookname = bookname;
        return bookname;
    }

    public int getPageNumber() {
        return pageNumber;
    }

    public int setPageNumber(int pageNumber) {
        this.pageNumber = pageNumber;
        return pageNumber;
    }

    private int pageNumber;

    public int price() {

        return 40;
    }


}

class ChildrenBook extends Books{

    public int price() {
        return super.price()-10;
    }


}

class Comics extends Books{

    public int price() {
        return super.price()-20;
    }
}


