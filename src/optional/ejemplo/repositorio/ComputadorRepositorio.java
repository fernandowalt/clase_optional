package optional.ejemplo.repositorio;

import optional.ejemplo.modelos.Computador;
import optional.ejemplo.modelos.Fabricante;
import optional.ejemplo.modelos.Procesador;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class ComputadorRepositorio implements Repositorio<Computador> {
private List<Computador> dataSource;


public ComputadorRepositorio () {
    dataSource = new ArrayList<>();

    Procesador proc = new Procesador("I9-9880H", new Fabricante("intel"));
    Computador asus = new Computador("Asus ROG", "Strix 6512");

    asus.setProcesador(proc);
    dataSource.add(asus);
    dataSource.add(new Computador("MacBook Pro", "MVVK2CI"));


}

@Override
public Optional<Computador> filtrar (String nombre) {

    /*    busqueda exacta */
    /* return dataSource.stream().filter(c -> c.getNombre().equalsIgnoreCase(nombre)).findFirst();*/

    /*    busqueda parcial*/
    return dataSource.stream()
                     .filter(c -> c.getNombre().toUpperCase().contains(nombre.toUpperCase()))
                     .findFirst();
}
}
