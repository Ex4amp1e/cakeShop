package aop;

import org.springframework.stereotype.Component;

@Component("uniLibraryBean")
public class UniLibrary extends AbstractLibrary {
    public void getBook() {
        System.out.println("We took a book from a UniLibrary");
        System.out.println("-------------------------------------------------------------");
    }

    public String returnBook() {
        int a = 1/0;
        System.out.println("We return book to UniLibrary");
        System.out.println("-------------------------------------------------------------");
        return "Voina i mir";
    }

    public void getMagazine() {
        System.out.println("We took a magazine from UniLibrary");
        System.out.println("-------------------------------------------------------------");
    }

    public void returnMagazine() {
        System.out.println("We return a magazine from UniLibrary");
        System.out.println("-------------------------------------------------------------");
    }

    public void addBook(String personName, Book book) {
        System.out.println("We add a book to UniLibrary " + book.getName());
        System.out.println("-------------------------------------------------------------");
    }

    public void addMagazine() {
        System.out.println("We add a magazine to UniLibrary");
        System.out.println("-------------------------------------------------------------");
    }

}
