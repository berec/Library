package Library.app;

import Library.data.Book;

public class Library
{
    public static void main(String[] args)
    {
        final String appName ="Biblioteka v0.5";

        Book book1 = new Book("W pustyni i w puszczy", "Henryk SIenkiewicz",
                2010, 296, "Greg", "97898774647848");
        Book book2 = new Book("Java", "Jushua Beck", 2009, 352,
                "Helion", "998849847398745");
        Book book3 = new Book("SCJP Java", "Bert Bates", 2008, 851,
                "Osborne Media", "98374837646374");

        System.out.println(appName);
        System.out.println("Książki dostępne w bibliotece");
        book1.printInfo();
        book2.printInfo();
        book3.printInfo();

    }
}
