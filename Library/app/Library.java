package Library.app;

import Library.data.Book;

public class Library
{
    public static void main(String[] args)
    {
        final String appName ="Biblioteka v0.5";

        Book[] books = new Book[1000];

        books[0] = new Book("W pustyni i w puszczy", "Henryk SIenkiewicz",
                2010, 296, "Greg", "97898774647848");
        books[1] = new Book("Java", "Jushua Beck", 2009, 352,
                "Helion", "998849847398745");
        books[2] = new Book("SCJP Java", "Bert Bates", 2008, 851,
                "Osborne Media", "98374837646374");

        System.out.println(appName);
        System.out.println("Książki dostępne w bibliotece");
        books[0].printInfo();
        books[1].printInfo();
        books[2].printInfo();
        System.out.println("System może przechowywać do: " + books.length + " książek");

    }
}
