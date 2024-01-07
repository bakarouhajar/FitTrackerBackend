package ma.emsi.fittracker.controllers;

import ma.emsi.fittracker.entities.Recorde;
import ma.emsi.fittracker.repositories.RecordRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/records")
public class RecordController {

    @Autowired
    private RecordRepository recordRepository;

    @GetMapping
    public List<Recorde> getAllRecords() {
        return recordRepository.findAll();
    }

    @GetMapping("/{id}")
    public Recorde getRecordById(@PathVariable Long id) {
        return recordRepository.findById(id).orElse(null);
    }

    @PostMapping
    public Recorde createRecord(@RequestBody Recorde record) {
        return recordRepository.save(record);
    }



    @DeleteMapping("/{id}")
    public void deleteRecord(@PathVariable Long id) {
        recordRepository.deleteById(id);
    }
}

