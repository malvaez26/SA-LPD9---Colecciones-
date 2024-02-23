import java.util.HashMap;
import java.util.Scanner;

public class Diccionario {
    public static void main(String[] args) {
        HashMap<String, String> diccionario = new HashMap<>();
        diccionario.put("casa", "house");
        diccionario.put("perro", "dog");
        diccionario.put("gato", "cat");
        diccionario.put("libro", "book");
        diccionario.put("mesa", "table");
        diccionario.put("carro", "car");
        diccionario.put("manzana", "apple");
        diccionario.put("naranja", "orange");
        diccionario.put("rojo", "red");
        diccionario.put("azul", "blue");
        diccionario.put("sol", "sun");
        diccionario.put("luna", "moon");
        diccionario.put("agua", "water");
        diccionario.put("playa", "beach");
        diccionario.put("montaña", "mountain");
        diccionario.put("te amo", "love");
        diccionario.put("bailar", "dance");
        diccionario.put("comer", "eat");
        diccionario.put("dormir", "sleep");
        diccionario.put("correr", "run");

        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingrese una palabra en español:");
        String palabraEspañol = scanner.nextLine().toLowerCase();

        String traduccion = diccionario.get(palabraEspañol);

        if (traduccion != null) {
            System.out.println("La traducción de \"" + palabraEspañol + "\" es: " + traduccion);
        } else {
            System.out.println("La palabra \"" + palabraEspañol + "\" no se encuentra en el diccionario.");
        }

        scanner.close();
    }
}