package ru.mail.polis.open.task6;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class VisitorImplTest {
    @Test
    void getId() {
        VisitorImpl visitor1 = new VisitorImpl(1, "Rebeca", (short) 15);
        VisitorImpl visitor2 = new VisitorImpl(1, "Jon", (short) 14);
        assertEquals(22, visitor1.getId());
        assertEquals(18, visitor2.getId());
    }

    @Test
    void getName() {
        VisitorImpl visitor1 = new VisitorImpl(1, "Rebeca", (short) 15);
        VisitorImpl visitor2 = new VisitorImpl(1, "Jon", (short) 14);
        assertEquals("Rebeca", visitor1.getName());
        assertEquals("Jon", visitor2.getName());
    }

    @Test
    void getAge() {
        VisitorImpl visitor1 = new VisitorImpl(1, "Rebeca", (short) 15);
        VisitorImpl visitor2 = new VisitorImpl(1, "Jon", (short) 14);
        assertEquals(15, visitor1.getAge());
        assertEquals(14, visitor2.getAge());
    }
}