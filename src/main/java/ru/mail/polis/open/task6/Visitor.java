package ru.mail.polis.open.task6;

public interface Visitor {
    void take(long idB);

    void take(String nameB);

    void returnB(Books bookbook);

}
