package pio.daw.gestor_recetas.repositorio;

import org.springframework.data.jpa.repository.JpaRepository;
import pio.daw.gestor_recetas.modelo.Receta;

public interface RecetaRepository extends JpaRepository<Receta, Long> {
}