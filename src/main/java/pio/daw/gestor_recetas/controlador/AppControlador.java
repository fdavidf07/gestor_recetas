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

    @GetMapping("/")
    public String index() {
        return "redirect:/inicio";
    }

    @GetMapping("/inicio")
    public String inicio(Model model) {
        model.addAttribute("nombre", "Davicito"); 
        return "inicio"; 
    }

    @GetMapping("/listadoReceta")
    public String listarRecetas(Model model) {
        model.addAttribute("lista", recetaRepo.findAll());
        return "listadoRecetas";
    }

    @GetMapping("/listadoIngrediente")
    public String listarIngredientes(Model model) {
        model.addAttribute("lista", ingRepo.findAll());
        return "listadoIngredientes"; // Busca listadoIngredientes.html
    }

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

    @GetMapping("/altaIngrediente")
    public String formularioIngrediente(Model model) {
        model.addAttribute("ingrediente", new Ingrediente());
        return "altaIngrediente"; // Busca altaIngrediente.html
    }

    @PostMapping("/altaIngrediente")
    public String guardarIngrediente(@ModelAttribute Ingrediente ingrediente) {
        ingRepo.save(ingrediente);
        return "redirect:/listadoIngrediente";
    }
}