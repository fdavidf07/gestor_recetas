package pio.daw.gestor_recetas.repositorio;

import org.springframework.data.jpa.repository.JpaRepository;
import pio.daw.gestor_recetas.modelo.Ingrediente;

public interface IngredienteRepository extends JpaRepository<Ingrediente, Long> {
}
