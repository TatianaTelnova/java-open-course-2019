package ru.mail.polis.open.task6;

public class VisitorImpl extends Person implements Visitor {
    VisitorImpl(long id, String name, short age) {
        this.id = id + age + name.length();
        this.name = name;
        this.age = age;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String nameB) {
        this.name = nameB;
    }

    public short getAge() {
        return age;
    }

    public void setAge(short age) {
        this.age = age;
    }

    public void take(long idB) {
        Library.librarian.giveBooks(idB, name);

    }

    public void take(String nameB) {
        Library.librarian.giveBooks(nameB, name);
    }

    public void returnB(Books bookbook) {
        Library.librarian.putBook(bookbook);
    }
}
