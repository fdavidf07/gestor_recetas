package pio.daw.gestor_recetas;

import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import pio.daw.gestor_recetas.modelo.Ingrediente;
import pio.daw.gestor_recetas.modelo.Receta;
import pio.daw.gestor_recetas.repositorio.IngredienteRepository;
import pio.daw.gestor_recetas.repositorio.RecetaRepository;

@Configuration
public class DataLoader {

    @Bean
    CommandLineRunner initDatabase(RecetaRepository recetaRepo, IngredienteRepository ingRepo) {
        return args -> {
            // Crear 10 recetas de ejemplo
            for (int i = 1; i <= 10; i++) {
                Receta r = new Receta();
                r.setNombre("Receta " + i);
                r.setCategoria(i % 2 == 0 ? "Postre" : "Principal");
                r.setTiempoPreparacion(20 + i);
                r.setDificultad(i > 5 ? "Difícil" : "Fácil");
                recetaRepo.save(r);
            }

            // Crear 10 ingredientes de ejemplo
            for (int i = 1; i <= 10; i++) {
                Ingrediente ing = new Ingrediente();
                ing.setNombre("Ingrediente " + i);
                ing.setCantidad(i + " kg");
                ing.setTipo("Tipo " + i);
                ing.setEsAlergeno(i % 3 == 0);
                ingRepo.save(ing);
            }
            
            System.out.println("--- DATOS INICIALES CARGADOS CORRECTAMENTE ---");
        };
    }
}