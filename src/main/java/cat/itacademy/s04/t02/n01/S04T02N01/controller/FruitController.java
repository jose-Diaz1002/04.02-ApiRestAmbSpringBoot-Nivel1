package cat.itacademy.s04.t02.n01.S04T02N01.controller;

import cat.itacademy.s04.t02.n01.S04T02N01.model.Fruit;
import cat.itacademy.s04.t02.n01.S04T02N01.services.FruitService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/fruta")
public class FruitController {
    @Autowired
    private FruitService fruitService;

    @PostMapping("/add")
    public ResponseEntity<Fruit> addFruit(@RequestBody Fruit fruit){
        return ResponseEntity.ok(fruitService.addFruit(fruit));
    }

    @PutMapping("/update")
    public ResponseEntity<Fruit> updateFruita(@RequestBody Fruit fruit) {
        return ResponseEntity.ok(fruitService.updateFruit(fruit));
    }

    @DeleteMapping("/delete/{id}")
    public ResponseEntity<Void> deleteFruita(@PathVariable int id) {
        fruitService.deleteFruit(id);
        return ResponseEntity.noContent().build();
    }

    @GetMapping("/getOne/{id}")
    public ResponseEntity<Fruit> getFruitaById(@PathVariable int id) {
        return ResponseEntity.ok(fruitService.getFruitById(id));
    }

    @GetMapping("/getAll")
    public ResponseEntity<List<Fruit>> getAllFruites() {
        return ResponseEntity.ok(fruitService.getAllFruits());
    }

}
