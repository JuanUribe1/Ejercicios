package com.examplex.CRUDMongoSpringBoot.controller;

import com.examplex.CRUDMongoSpringBoot.model.Libro;
import com.examplex.CRUDMongoSpringBoot.service.api.LibroServiceAPI;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/libro/api/v1")
@CrossOrigin("*")
public class LibroController {
    @Autowired
    private LibroServiceAPI libroServiceAPI;

    @RequestMapping("/")
    public List<Libro> index(Model model) {
    return libroServiceAPI.getAll();

    }

    @GetMapping("/create")
    public String create(Model model) {
        model.addAttribute("persona", new Libro());
        return "save";
    }

    @GetMapping("/save/{id}")
    public String showSave(@PathVariable("id") String id, Model model) {
        if (id != null) {
            model.addAttribute("persona", libroServiceAPI.get(id));
        } else {
            model.addAttribute("persona", new Libro());
        }
        return "save";
    }

    @PostMapping("/save")
    public String save(@RequestBody Libro libro) {
        libroServiceAPI.save(libro);
        return "redirect:/home/";
    }

    @GetMapping("/delete/{id}")
    public String delete(@PathVariable String id, Model model) {
        libroServiceAPI.delete(id);

        return "redirect:/home/";
    }
}
