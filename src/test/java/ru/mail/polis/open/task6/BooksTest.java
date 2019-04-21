package ru.mail.polis.open.task6;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class BooksTest {
    @Test
    void getIdB() {
        Books book1 = new Books(20, "The picture of Dorian Gray", "O. Wilde", BookTypes.Roman, null);
        assertEquals(100233, book1.getIdB());
    }

    @Test
    void getNameB() {
        Books book1 = new Books(20, "The picture of Dorian Gray", "O. Wilde", BookTypes.Roman, null);
        assertEquals("The picture of Dorian Gray", book1.getNameB());
    }

    @Test
    void getTypeB() {
        Books book1 = new Books(20, "The picture of Dorian Gray", "O. Wilde", BookTypes.Roman, null);
        assertEquals(BookTypes.Roman, book1.getTypeB());
    }

    @Test
    void getAuthorB() {
        Books book1 = new Books(20, "The picture of Dorian Gray", "O. Wilde", BookTypes.Roman, null);
        assertEquals("O. Wilde", book1.getAutorB());
    }

    @Test
    void getWhoTake() {
        Books book1 = new Books(20, "The picture of Dorian Gray", "O. Wilde", BookTypes.Roman, null);
        assertEquals(null, book1.getWhoTake());
    }
}