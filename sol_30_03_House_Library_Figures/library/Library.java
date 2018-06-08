package sol_30_03_HLF.library;

//import java.awt.print.Book;
//import java.util.Scanner;

public class Library {
/*  //  Сделать библиотеку, которая ведет учет книг. Должно быть как минимум два класса: Book и Library.
   // Library имеет два метода: void put(Book book, int quantity) и int get(Book book, int quantity).
   // Каждой книге в библиотеке соответствует счетчик, показывающий количество хранящихся книг,
   // при добавлении книги - счетчик увеличивается, при извлечении - уменьшается на число quantity.
   // Поля класса Book: author, title, pagesNum.
  //  Библиотека хранит ограниченное число книг, сколько - на ваше усмотрение.
//*/
    public static int quantity ;
    Book book;


    public void put(Book book, int quantity) {
        this.book = book;
        if (quantity > 20) {
            System.out.println("К сожалению сможем принять только 20 ");
            book.copies = 20;
        } else {
            book.copies = book.copies + quantity;
            System.out.println("теперь " + book.title + " " + book.copies);
        }
    }

    public void get(Book book, int quantity){
        this.book=book;
        if (book.copies<quantity) {
            System.out.println("К сожалению есть только: "+book.copies);
            book.copies=0;
        } else {
            book.copies = book.copies - quantity;
            System.out.println("Осталось:" + book.title + " " + book.copies);
        }
    }


    public static void main(String[] args) {


        Library Libr1 = new Library();

        Book buk1 = new Book("st.King","Song2",15);
        Book buk2 = new Book("reMarkII","ravik",117);

        Libr1.put(buk1,3);
        Libr1.put(buk1,4);

        Libr1.get(buk1,8);

    }
}


