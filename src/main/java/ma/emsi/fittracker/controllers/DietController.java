package ma.emsi.fittracker.controllers;

import ma.emsi.fittracker.entities.Diet;
import ma.emsi.fittracker.repositories.DietRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/diets")
public class DietController {

    @Autowired
    private DietRepository dietRepository;

    @GetMapping
    public List<Diet> getAllDiets() {
        return dietRepository.findAll();
    }

    @GetMapping("/{id}")
    public Diet getDietById(@PathVariable Long id) {
        return dietRepository.findById(id).orElse(null);
    }

    @PostMapping
    public Diet createDiet(@RequestBody Diet diet) {
        return dietRepository.save(diet);
    }

    @PutMapping("/{id}")
    public Diet updateDiet(@PathVariable Long id, @RequestBody Diet diet) {
        diet.setId(id);
        return dietRepository.save(diet);
    }

    @DeleteMapping("/{id}")
    public void deleteDiet(@PathVariable Long id) {
        dietRepository.deleteById(id);
    }
}
