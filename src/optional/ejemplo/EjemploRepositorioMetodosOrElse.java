package optional.ejemplo;

import optional.ejemplo.modelos.Computador;
import optional.ejemplo.repositorio.ComputadorRepositorio;
import optional.ejemplo.repositorio.Repositorio;


public class EjemploRepositorioMetodosOrElse {

public static void main (String[] args) {
    Repositorio<Computador> repo = new ComputadorRepositorio();

    /*    Computador porDefecto = new Computador("HP Omen", "LA0001");*/

    /*si no encuentra el objeto devuelve un objeto por defecto de tipo Computador*/
    /*    el metodo orElse ejecuta valorPorDefecto() independientemente de si  encuenta o no el
    objeto*/
    /*    cuidado*/
    Computador pc = repo.filtrar("asus").orElse(valorPorDefecto());
    System.out.println(pc);

    /*    el metodo orElseGet solo ejecuta valorPorDefecto() si no encuentra el objeto*/
    pc = repo.filtrar("macBook").orElseGet(EjemploRepositorioMetodosOrElse::valorPorDefecto);

    System.out.println(pc);

}

public static Computador valorPorDefecto () {
    System.out.println("Obteniendo el valor por defecto");
    return new Computador("HP Omen", "LA001");
}
}
