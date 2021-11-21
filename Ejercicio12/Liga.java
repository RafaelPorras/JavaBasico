package es.Ejercicios.Ejercicio12;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;

public class Liga {
    HashMap<Integer,Equipo> liga = new HashMap<Integer,Equipo>();

    public Liga(){}

    public Liga(ArrayList<String[]> datos){
        int index = 1;
        for (String[] equipo : datos) {
            Equipo eq = new Equipo(Integer.parseInt(equipo[0]),equipo[1],equipo[2],equipo[3],equipo[4],equipo[5],equipo[6],equipo[7]);
            this.liga.put(index++,eq);

        }
    }

    public HashMap<Integer,Equipo> getLiga() {
        return liga;
    }

    public void setLiga(HashMap<Integer,Equipo> liga) {
        this.liga = liga;
    }

    public void addEquipo(Equipo equipo){
        int found = this.equals(equipo);

        if(found == -1){
            int index = this.lastIndex();
            if(index > -1){
                index++;
                this.liga.put(index,equipo);
            }
        }
    }

    public void deleteEquipo(Equipo equipo){
        int found = this.equals(equipo);

        if(found != -1){
            for(Iterator<Integer> iterator = liga.keySet().iterator(); iterator.hasNext(); ) {
                Integer key = iterator.next();
                if(key == found) {
                    iterator.remove();
                }
            }
        }
    }


    public int equals(Equipo equipo){
       for(HashMap.Entry<Integer,Equipo> entry : liga.entrySet()){
           Equipo eq = entry.getValue();
           if(eq.getNombre().equals(equipo.getNombre())){
               return entry.getKey();
           }
       }

        return -1;

    }

    private int lastIndex(){
       int lastKey = -1;
        for (HashMap.Entry<Integer, Equipo> entry :liga.entrySet()) {
            lastKey= entry.getKey();
        }
        return lastKey;
    }

    @Override
    public String toString() {
        return "Liga{" +
                "liga=" + liga +
                '}';
    }
}
