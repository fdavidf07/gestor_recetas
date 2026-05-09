package pio.daw.gestor_recetas.controlador;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import pio.daw.gestor_recetas.modelo.Ingrediente;
import pio.daw.gestor_recetas.modelo.Receta;
import pio.daw.gestor_recetas.repositorio.IngredienteRepository;
import pio.daw.gestor_recetas.repositorio.RecetaRepository;

@Controller
public class AppControlador {

    @Autowired
    private RecetaRepository recetaRepo;

    @Autowired
    private IngredienteRepository ingRepo;

    // 1. GET /inicio -> Página principal con tu nombre
    @GetMapping("/inicio")
    public String inicio() {
        return "inicio";
    }

    // 2. GET /listadoReceta -> Tabla con todas las recetas
    @GetMapping("/listadoReceta")
    public String listarRecetas(Model model) {
        model.addAttribute("lista", recetaRepo.findAll());
        return "listadoRecetas";
    }

    // 3. GET /listadoIngrediente -> Tabla con todos los ingredientes
    @GetMapping("/listadoIngrediente")
    public String listarIngredientes(Model model) {
        model.addAttribute("lista", ingRepo.findAll());
        return "listadoIngredientes";
    }

    // 4. GET y POST /altaReceta -> Formulario de alta
    @GetMapping("/altaReceta")
    public String formularioReceta(Model model) {
        model.addAttribute("receta", new Receta());
        return "altaReceta";
    }

    @PostMapping("/altaReceta")
    public String guardarReceta(@ModelAttribute Receta receta) {
        recetaRepo.save(receta);
        return "redirect:/listadoReceta";
    }

    // 5. GET y POST /altaIngrediente -> Formulario de alta
    @GetMapping("/altaIngrediente")
    public String formularioIngrediente(Model model) {
        model.addAttribute("ingrediente", new Ingrediente());
        return "altaIngrediente";
    }

    @PostMapping("/altaIngrediente")
    public String guardarIngrediente(@ModelAttribute Ingrediente ingrediente) {
        ingRepo.save(ingrediente);
        return "redirect:/listadoIngrediente";
    }
}