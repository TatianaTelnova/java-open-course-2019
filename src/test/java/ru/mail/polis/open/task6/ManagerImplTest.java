package ru.mail.polis.open.task6;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;
import static ru.mail.polis.open.task6.Library.manager;

class ManagerImplTest {
    private static ManagerImpl manager1;
    private static Books book1;

    @BeforeEach
    void BeforeStart() {
        manager1 = new ManagerImpl(2, "Mrs Kitty", (short) 24);
        manager1.openTheLibrary();
    }

    @Test
    void getId() {
        ManagerImpl manager1 = new ManagerImpl(1, "Mr Arthur", (short) 41);
        assertEquals(1, manager1.getId());
    }

    @Test
    void getName() {
        ManagerImpl manager1 = new ManagerImpl(1, "Mr Arthur", (short) 41);
        assertEquals("Mr Arthur", manager1.getName());
    }

    @Test
    void getAge() {
        ManagerImpl manager1 = new ManagerImpl(1, "Mr Arthur", (short) 41);
        assertEquals(41, manager1.getAge());
    }

    @Test
    void add() {
        assertThrows(IllegalArgumentException.class, () -> manager.add(null));
    }

    @Test
    void remove() {
        assertThrows(IllegalArgumentException.class, () -> manager.remove(null));
    }

    @Test
    void closeTheLibrary() {
        manager1.closeTheLibrary();
    }

}