package genericss;

import java.util.Objects;

public class Person {
    private String name;
    private String vorname;

    public Person(String vorname, String name) {
        this.name = name;
        this.vorname = vorname;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Person person = (Person) o;
        return Objects.equals(vorname, person.vorname);
    }

    @Override
    public int hashCode() {
        return Objects.hash(vorname);
    }
    @Override
    public String toString(){
        return vorname;
    }
}
