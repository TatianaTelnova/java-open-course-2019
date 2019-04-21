package ru.mail.polis.open.task6;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;
import static ru.mail.polis.open.task6.Library.librarian;

class LibraryImplTest {
    private static LibraryImpl library1;
    private static ManagerImpl manager1;
    private static VisitorImpl visitor1;
    private static Books book1;
    private static Books book2;

    @BeforeEach
    void BeforeStart() {
        library1 = new LibraryImpl(1, "Mrs Jill", (short) 39);
        manager1 = new ManagerImpl(2, "Mrs Kitty", (short) 24);
        visitor1 = new VisitorImpl(3, "Den", (short) 12);
        manager1.openTheLibrary();
    }

    @Test
    void getId() {
        LibraryImpl library1 = new LibraryImpl(1, "Mr Arthur", (short) 41);
        assertEquals(1, library1.getId());
    }

    @Test
    void getName() {
        LibraryImpl library1 = new LibraryImpl(1, "Mr Arthur", (short) 41);
        assertEquals("Mr Arthur", library1.getName());
    }

    @Test
    void getAge() {
        LibraryImpl library1 = new LibraryImpl(1, "Mr Arthur", (short) 41);
        assertEquals(41, library1.getAge());
    }

    @Test
    void GiveName() {
        book1 = Library.getBooks().get(0); // книга, которая есть в библиотеке
        book2 = new Books(9, "aaa", "bbb", BookTypes.Roman, "null"); // книга, которой нет
        assertEquals(book1, librarian.giveBooks("The Lord of the rings", "Den"));
        assertThrows(IllegalArgumentException.class, () -> librarian.giveBooks("bbb", "Den"));
    }

}