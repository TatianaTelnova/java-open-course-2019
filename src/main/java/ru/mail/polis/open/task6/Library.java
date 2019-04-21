package ru.mail.polis.open.task6;

import java.util.ArrayList;
import java.util.List;

public class Library {
    public static LibraryImpl librarian = new LibraryImpl(11, "Mr Jone", (short) 45);
    public static ManagerImpl manager = new ManagerImpl(22, "Mr Tim", (short) 47);
    public static boolean open = false;
    public static List<Books> books = new ArrayList<>();
    public static List<VisitorImpl> person = new ArrayList<>();
    public static List<Books> usedB = new ArrayList<>();

    public Library() {
    }

    static List<Books> getBooks() {
        return books;
    }

    static List<Books> getUsedB() {
        return books;
    }

    static boolean getOpen() {
        return open;
    }

    static void setOpen(boolean statusOfOpening) {
        open = statusOfOpening;
    }

    public static List<VisitorImpl> getVisitor() {
        return person;
    }

    static void LibraryWork() {
        person.add(new VisitorImpl(1, "Tom", (short) 29));
        person.add(new VisitorImpl(2, "Ann", (short) 10));
        person.add(new VisitorImpl(3, "Din", (short) 34));
        person.add(new VisitorImpl(4, "Alice", (short) 19));
        person.add(new VisitorImpl(5, "Mary", (short) 19));
        books.add(new Books(1, "The Lord of the rings", "J. Tolkien", BookTypes.Roman, null));
        books.add(new Books(2, "The Great Gatsby", "F. Fitzgerald ", BookTypes.Roman, null));
        books.add(new Books(3, "Winnie-the-Pooh", "A. Miln", BookTypes.FairyTale, null));
        books.add(new Books(4, "The little prince", "A.De-Saint Exupery", BookTypes.FairyTale, null));
        books.add(new Books(5, "War and peace", "L.N. Tolstoy", BookTypes.Fiction, null));
        books.add(new Books(6, "Crime and Punishment", "F. Dostoyevsky", BookTypes.Fiction, null));
        books.add(new Books(7, "A Brief History of Time", "S. Hawking", BookTypes.ScienceFiction, null));
        books.add(new Books(8, "If", "R. Kipling", BookTypes.Poem, null));
        books.add(new Books(9, "Les Miserables", "V. Gugo", BookTypes.Roman, null));
        books.add(new Books(10, "Anna Karenina", "L.N. Tolstoy", BookTypes.Roman, null));
    }

    static void VisitorCome(VisitorImpl visitor1) {
        boolean marker = false;
        for (VisitorImpl visitvisit : person
        ) {
            if (visitor1 == visitvisit) {
                marker = true;
            }
        }
        if (marker == false) { // если его еще нет в списке
            person.add(visitor1);
        }
    }
}

