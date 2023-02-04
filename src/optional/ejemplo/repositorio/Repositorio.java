package optional.ejemplo.repositorio;

import optional.ejemplo.modelos.Computador;

import java.util.Optional;

public interface Repositorio<T> {
Optional<Computador> filtrar (String nombre);
}
