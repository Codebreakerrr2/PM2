package Graph;

import com.google.common.base.Preconditions;
import org.checkerframework.checker.units.qual.K;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Set;

public class GGraphOperationen {

    public static int kurzesterWeg(GerichteterGraph graph,Knoten start ,Knoten ziel){
        Preconditions.checkNotNull(graph);
        Preconditions.checkNotNull(start);
        IntegerKennung<Knoten> startKnoten= new IntegerKennung<>(start,0);
        Queue<IntegerKennung> knotenQueue= new LinkedList<>();
        knotenQueue.offer(startKnoten);
        int laenge=0;
        while(!knotenQueue.isEmpty()){

            IntegerKennung<Knoten> aktuellerKnoten= knotenQueue.poll();
            if(aktuellerKnoten.element==ziel) return aktuellerKnoten.kennung;
            else{
              Set<Knoten> nachbarn=  graph.getNachbarn(aktuellerKnoten.element);
                if(nachbarn.isEmpty()) return -1;
              nachbarn.forEach((nachbar)->{

                   knotenQueue.offer(new IntegerKennung<Knoten>(nachbar,laenge+1)) ;
                });


            }

        }
        return -1;
    }


}
