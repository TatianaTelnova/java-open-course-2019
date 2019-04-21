package ru.mail.polis.open.task6;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

class LibraryTest {
    private static LibraryImpl library1;
    private static ManagerImpl manager1;
    private static VisitorImpl visitor1;

    @AfterAll
    static void end() {
        Library.setOpen(false);
        Library.getVisitor().clear();
        Library.getUsedB().clear();
        Library.getBooks().clear();
    }

    @BeforeAll
    static void BeforeStart() {
        library1 = new LibraryImpl(1, "Mrs Jill", (short) 39);
        Library.LibraryWork();
    }

    @Test
    void OpenTheLibrary(){
        Library.manager.openTheLibrary();
        assertTrue(Library.getOpen());
    }

    @Test
    void VisitorCome() {
        Library.VisitorCome(new VisitorImpl(1, "Shon", (short)40));
        assertEquals(6, Library.getVisitor().size());
        Library.VisitorCome(new VisitorImpl(2, "Alex", (short)54));
        assertEquals(7, Library.getVisitor().size());
    }
}