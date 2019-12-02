package com.company;

import org.junit.Assert;
import org.junit.Test;





import static org.junit.jupiter.api.Assertions.*;

    class BooksTest {

        @Test
        void getBookname() {
        }

        @Test
        void setBookname() {
            Books b=new Comics();
            String expected="Tomix";
            String actual=b.setBookname("Tomix");
            Assert.assertEquals(expected,actual);

            Books b2= new ChildrenBook();
            String expected1="Harry Potter";
            String actual1=b2.setBookname("Harry Potter");
            Assert.assertEquals(expected,actual);
        }

        @Test
        void getPageNumber() {
        }

        @Test
        void setPageNumber() {
            Books page= new ChildrenBook();
            Books page1=new Comics();
            int expected=100;
            int actual=page.setPageNumber(100);

            int expected1=600;
            int actual1=page1.setPageNumber(600);
            Assert.assertEquals(expected,actual);
            Assert.assertEquals(expected1,actual1);
        }

        @Test
        void price() {
            Books price= new ChildrenBook();
            Books price1=new Comics();
            int expected=30;
            int actual=price.setPageNumber(30);

            int expected1=20;
            int actual1=price1.setPageNumber(20);
            Assert.assertEquals(expected,actual);
            Assert.assertEquals(expected1,actual1);
        }
    }

