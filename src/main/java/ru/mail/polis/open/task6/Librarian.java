package ru.mail.polis.open.task6;

public interface Librarian {
    Books giveBooks(long idB, String name);

    Books giveBooks(String nameB, String name);

    void putBook(Books bookbook);
}

