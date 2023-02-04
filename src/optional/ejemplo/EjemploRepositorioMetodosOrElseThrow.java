package optional.ejemplo;

import optional.ejemplo.modelos.Computador;
import optional.ejemplo.repositorio.ComputadorRepositorio;
import optional.ejemplo.repositorio.Repositorio;

import java.util.Optional;


public class EjemploRepositorioMetodosOrElseThrow {

public static void main (String[] args) {
    Repositorio<Computador> repo = new ComputadorRepositorio();


    Computador pc = repo.filtrar("asus").orElseThrow(IllegalStateException::new);
    System.out.println(pc);

    String archivo = "documento.pdf";
    String extension = Optional.ofNullable(archivo)
                               .filter(a -> a.contains("."))
                               .map(s -> s.substring(archivo.lastIndexOf(".") + 1))
                               .orElseThrow();


    System.out.println(extension);


}

public static Computador valorPorDefecto () {
    System.out.println("Obteniendo el valor por defecto");
    return new Computador("HP Omen", "LA001");
}
}
