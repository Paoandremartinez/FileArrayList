import java.io.BufferedReader;
import java.io.FileReader;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {

        String ruta = "D:\\PMARTINEZ\\Data\\";
        String nombreArchivo = "test.txt";
        //Valida si existe, si se puede escribir
        try (FileReader fr = new FileReader(ruta + nombreArchivo)) {
            //Leer el contenido de los datos (manipula el contenido)
            BufferedReader br = new BufferedReader(fr);

            String line;
            //leer cada una de las lineas del archivo while hace la instrucción hasta que la cumple
            while ((line = br.readLine()) != null) {

                try {
                    int numero = Integer.parseInt(line); // Si es un número entero

                    ArrayList<Integer> listado = new ArrayList<>();
                    listado.add(numero);

                    System.out.println("Listado " + listado);
 

                } catch (NumberFormatException e) {
                    e.getMessage();

                }


            }

        } catch (Exception e) {
            throw new RuntimeException(e);
        }

    }
}