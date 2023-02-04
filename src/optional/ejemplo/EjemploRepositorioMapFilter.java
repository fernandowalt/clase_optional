package optional.ejemplo;

import optional.ejemplo.modelos.Computador;
import optional.ejemplo.modelos.Fabricante;
import optional.ejemplo.modelos.Procesador;
import optional.ejemplo.repositorio.ComputadorRepositorio;
import optional.ejemplo.repositorio.Repositorio;


public class EjemploRepositorioMapFilter {

public static void main (String[] args) {

    Repositorio<Computador> repo = new ComputadorRepositorio();

    String f = repo.filtrar("asus")
                   .flatMap(Computador::getProcesador)
                   .flatMap(Procesador::getFabricante)
                   .filter(fabri -> "intel".equalsIgnoreCase(fabri.getNombre()))
                   .map(Fabricante::getNombre)
                   .orElse("Desconocido");
    System.out.println(f);


}


}
