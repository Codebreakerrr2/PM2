package Graph;

import java.util.ArrayList;
import java.util.List;

public class Knoten {

    private String name;


    public Knoten(String name) {
        this.name = name;
    }
    @Override
    public String toString(){
        return name;
    }

}
