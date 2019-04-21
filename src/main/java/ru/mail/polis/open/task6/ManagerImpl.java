package ru.mail.polis.open.task6;

public class ManagerImpl extends Person implements Manager {
    public ManagerImpl(long id, String name, short age) {
        this.id = id;
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

    public void add(Books bookbook) {
        if (bookbook == null) {
            throw new IllegalArgumentException("Error. Book must not be null");
        } else {
            Library.getBooks().add(bookbook);
        }
    }

    public void remove(Books necessary) {
        if (necessary == null) {
            throw new IllegalArgumentException("Error. Book must not be null");
        }
        if (necessary.getWhoTake() != null) {
            throw new IllegalArgumentException("This book is not in the library");
        } else {
            for (Books book : Library.getBooks()
            ) {
                if (book == necessary) {
                    Library.getBooks().remove(necessary);
                }
            }
        }
    }

    public void openTheLibrary() {
        Library.setOpen(true);
        Library.LibraryWork();
    }

    public void closeTheLibrary() {
        Library.setOpen(false);
    }
}

