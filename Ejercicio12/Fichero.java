package es.Ejercicios.Ejercicio12;



import java.io.*;
import java.util.ArrayList;
import java.util.StringTokenizer;
import java.net.URL;

public class Fichero {

    String path;

    public Fichero(String path){
        this.path = path;
    }

    public String getPath() {
        return path;
    }

    public void setPath(String path) {
        this.path = path;
    }

    public ArrayList<String[]> readFile(){
        ArrayList<String[]> datosFichero = new ArrayList();
        String fileLine;
        URL url = Fichero.class.getResource(this.path);
        File Equipos = new File(url.getPath());

        BufferedReader br = null;
        try{
            br = new BufferedReader(new FileReader(Equipos));

            //leemos la primera linea
            fileLine = br.readLine();

            while(fileLine != null){
                String [] datos = new String [10];
                byte index = 0;

                //por cada linea extraemos los datos del equipo
                StringTokenizer st = new StringTokenizer(fileLine,"*");

                //guardamos cada parte del string en un elemento del array
                while (st.hasMoreTokens()){datos[index++] = st.nextToken();}

                //Guardamos el array de datos en el arrayList
                datosFichero.add(datos);

                //ponemos el index a 0
                index = 0;

                //Saltamos de linea
                fileLine = br.readLine();


            }
        }
        catch (Exception e){
            System.out.println(e.getMessage());
        }
        finally{

        }

        return datosFichero;

    }
}
