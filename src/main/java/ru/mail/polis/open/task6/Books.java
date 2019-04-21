package ru.mail.polis.open.task6;

public class Books {
    private long idB;
    private String nameB;
    private String authorB;
    private BookTypes typeB;
    private String whoTake;


    public Books(long idB, String nameB, String authorB, BookTypes typeB, String whoTake) {
        this.idB = idB + nameB.length() * authorB.length() + 100005;
        this.nameB = nameB;
        this.authorB = authorB;
        this.typeB = typeB;
        this.whoTake = whoTake;
    }

    public long getIdB() {
        return idB;
    }

    public void setIdB(long idB) {
        this.idB = idB;
    }

    public String getNameB() {
        return nameB;
    }

    public void setNameB(String nameB) {
        this.nameB = nameB;
    }

    public String getAutorB() {
        return authorB;
    }

    public void setAutorB(String authorB) {
        this.authorB = authorB;
    }

    public BookTypes getTypeB() {
        return typeB;
    }

    public void setTypeB(BookTypes typeB) {
        this.typeB = typeB;
    }

    public String getWhoTake() {
        return whoTake;
    }

    public void setWhoTake(String whoTake) {
        this.whoTake = whoTake;
    }

}

