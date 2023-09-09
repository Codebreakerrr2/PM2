package Collectionss;

 class Pruefungsleistung {
    private String name;
    private int note;

    protected String getName() {
        return name;
    }

    protected int getNote() {
        return note;
    }

    protected Pruefungsleistung(String name, int note) {
        this.name = name;
        this.note = note;

    }
}
