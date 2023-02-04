package optional.ejemplo;

import java.util.Arrays;
import java.util.Optional;

public class EjemploOptional {

public static void main (String[] args) {

    String nombre = "walter";

    Optional<String> valorOptional = Optional.of(nombre);

/*
    System.out.println(valorOptional);
    System.out.println(valorOptional.isPresent());
    System.out.println(valorOptional.isEmpty());
    System.out.println(valorOptional.isEmpty());*/

/*    valorOptional.ifPresent(valor -> System.out.println("hola, " + valor));
    nombre = null;

    valorOptional = Optional.ofNullable(nombre);*/
    valorOptional.ifPresentOrElse(valor -> System.out.println("Estoy Presente"),
            () -> System.out.println("no estoy presente"));






}
}
