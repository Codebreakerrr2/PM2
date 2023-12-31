package Collectionss;

import java.util.Objects;

 class Studierender {
     public int getAlter() {
         return alter;
     }

     private String name;
    private String nachname;
    private int alter;
    private int martikelNummer;
     protected Studierender(String name, String nachname, int martikelNummer,int alter) {
         this.name = name;
         this.nachname = nachname;
         this.martikelNummer = martikelNummer;
         this.alter=alter;
     }

    protected Studierender(String name, String nachname, int martikelNummer) {
      this(name,nachname,martikelNummer,0);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Studierender that = (Studierender) o;
        return martikelNummer == that.martikelNummer;
    }

    @Override
    public int hashCode() {
        return Objects.hash(martikelNummer);
    }

    protected int getMartikelNummer() {
        return martikelNummer;
    }

    protected String getName() {
        return name;
    }

    protected String getNachname() {
        return nachname;
    }
}
