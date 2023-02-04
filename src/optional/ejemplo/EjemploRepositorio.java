package optional.ejemplo;
import optional.ejemplo.modelos.Computador;
import optional.ejemplo.repositorio.ComputadorRepositorio;
import optional.ejemplo.repositorio.Repositorio;


public class EjemploRepositorio {

public static void main (String[] args) {
    Repositorio<Computador> repo = new ComputadorRepositorio();

    repo.filtrar("asus")
        .ifPresentOrElse(System.out::println, () -> System.out.println("No se encontró"));
}

}
