package ru.mail.polis.open.task6;

public class LibraryImpl extends Person implements Librarian {
    public LibraryImpl(long id, String name, short age) {
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

    public String getName() { return name; }

    public void setName(String nameB) {
        this.name = nameB;
    }

    public short getAge() { return age; }

    public void setAge(short age) {
        this.age = age;
    }

    public Books giveBooks(long idB, String name) {
        Books necessary = null;
        if (Library.getOpen()== true) {
            if (idB == 0 || idB <= 100005) {
                throw new IllegalArgumentException("Error. Book must not be null");
            }
            for (Books bookbook : Library.getBooks()
            ) {
                if (bookbook.getIdB() == idB) {
                    necessary = bookbook;
                }
            }
            if (necessary != null) {
                necessary.setWhoTake(name);
                Library.getUsedB().add(necessary);
                Library.getBooks().remove(necessary);
                return necessary;
            } else {
                throw new IllegalArgumentException("Error. Book do not found");
            }
        } else {
            throw new IllegalArgumentException("Library is not open yet");
        }
    }

    public Books giveBooks(String nameB, String name) {
        Books necessary = null;
        if (Library.getOpen() == true) {
            if (nameB == null) {
                throw new IllegalArgumentException("Error. Book must not be null");
            }
            for (Books bookbook : Library.getBooks()
            ) {
                if (bookbook.getNameB() == nameB) {
                    necessary = bookbook;
                }
            }
            if (necessary != null) {
                necessary.setWhoTake(name);
                Library.getUsedB().add(necessary);
                Library.getBooks().remove(necessary);
                return necessary;
            } else {
                throw new IllegalArgumentException("Error. Book do not found");
            }
        } else {
            throw new IllegalArgumentException("Library is not open yet");
        }
    }

    public void putBook(Books bookbook) {
        if (bookbook == null) {
            throw new IllegalArgumentException("Error. Book must not be null");
        } else {
            if (Library.getOpen()== true) {
                bookbook.setWhoTake(null);
                Library.getUsedB().remove(bookbook);
                Library.getBooks().add(bookbook);
            } else {
                throw new IllegalArgumentException("Library is not open yet");
            }
        }
    }
}
