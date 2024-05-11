package org.example.miniprojetwebservicerest.CadreAdmin;


import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/cadres")
public class CadreController {
    private final CadreService  cadreService ;

    public CadreController(CadreService cadreService) {
        this.cadreService = cadreService;
    }

    @PostMapping("/add")
    public void addCadre(@RequestBody Cadre cadre) {
        cadreService.addCadre(cadre);
    }

    @GetMapping("/{id}")
    public Cadre getCadreById(@PathVariable int id) {
        return cadreService.getCadreById(id);
    }

    @DeleteMapping("/delete/{id}")
    public void deleteCadre(@PathVariable int id) {
        cadreService.deleteCadre(id);
    }

    @PutMapping("/update/{id}")
    public void updateCadre(@PathVariable int id, @RequestBody Cadre cadre) {
        cadreService.updateCadre(cadre);
    }

    @GetMapping("/all")
    public List<Cadre> getAllCadres() {
        return cadreService.getAllCadre();
    }
}
