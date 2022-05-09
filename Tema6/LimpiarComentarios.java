/**
 * 5. Escribe un programa capaz de quitar los comentarios de un programa de
 *    Java. Se utilizaría de la siguiente manera:
 *    <p>
 *    <code>quita_commentarios PROGRAMA_ORIGINAL PROGRAMA_LIMPIO</code>
 *    <p>
 *    Por ejemplo:
 *    <p>
 *    <code>quita_comentarios hola.java holav2.java</code>
 *    <p>
 *    crea un fichero con nombre <code>holav2.java</code> que contiene el código
 *    de <code>hola.java</code> pero sin los comentarios.
 *
 * @author Original de Luis José Sánchez
 */
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

class LimpiarComentarios {
  public static void main(String[] args) {
   /* 
    if (args.length != 2) {
      System.out.println("Uso del programa: LimpiarComentarios PROGRAMA_ORIGINAL PROGRAMA_LIMPIO");
      System.exit(-1);
    }*/
        
    try {
      BufferedReader lector = new BufferedReader(new FileReader("Ejercicio1.java"));
      BufferedWriter escritor = new BufferedWriter(new FileWriter("kk.java"));

      String lineaOrigen = "";
      String lineaDestino = "";
      boolean comentarioDeBloque = false;
      int i = 0;
      
      while ((lineaOrigen = lector.readLine()) != null) {
        
        int longitud = lineaOrigen.length();

        if(!comentarioDeBloque)
            lineaDestino = lineaOrigen;
        else
            lineaDestino = "";

        // Detecta inicio de comentario de bloque 
        if ((i = lineaOrigen.indexOf("/*")) != -1) {
          comentarioDeBloque = true;
          lineaDestino = lineaOrigen.substring(0, i);
          lineaOrigen = lineaOrigen.substring(i+2,longitud);
        }
        
        // Detecta fin de comentario de bloque 
        if (((i = lineaOrigen.indexOf("*/")) != -1) && comentarioDeBloque){
          comentarioDeBloque = false;
          lineaDestino += lineaOrigen.substring(i + 2, longitud);
        }
        // Detecta comentario de línea
        if (((i = lineaOrigen.indexOf("//")) != -1) && !comentarioDeBloque) {
          lineaDestino = lineaOrigen.substring(0, i);
        }

        escritor.write(lineaDestino + "\n");
      }
      
      lector.close();
      escritor.close();

    } catch (IOException ioe) {
      System.err.println(ioe.getMessage());
    }
  }
}
