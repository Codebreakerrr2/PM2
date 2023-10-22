package Graph;

import com.google.common.base.Preconditions;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class GerichteterGraph implements Graph{

    Map<Knoten, Knoten> graphStruktur= new HashMap<>();

    public void verbinde(Knoten start, Knoten ziel){
        Preconditions.checkNotNull(start);
        Preconditions.checkNotNull(ziel);
        graphStruktur.put(ziel,start);
    }
    public Set<Knoten> getNachbarn(Knoten diesenKnoten){
        return graphStruktur.keySet().stream()
                .filter((nachbar)->graphStruktur.get(nachbar)==diesenKnoten).collect(Collectors.toSet());
    }




}
