package cat.itacademy.s04.t02.n01.S04T02N01.services;

import cat.itacademy.s04.t02.n01.S04T02N01.exception.ResourceNotFoundException;
import cat.itacademy.s04.t02.n01.S04T02N01.model.Fruit;
import cat.itacademy.s04.t02.n01.S04T02N01.repository.FruitRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class FruitServiceImpl implements FruitService {
    @Autowired
    private FruitRepository repository;

    @Override
    public Fruit addFruit(Fruit fruit) {
        return repository.save(fruit);
    }

    @Override
    public Fruit updateFruit(Fruit fruit) {
        if (!repository.existsById(fruit.getId())) {
            throw new ResourceNotFoundException("Fruta no encontrada con id: " + fruit.getId());
        }
        return repository.save(fruit);
    }

    @Override
    public void deleteFruit(int id) {
        if (!repository.existsById(id)) {
            throw new ResourceNotFoundException("Fruta no encontrada con id: " + id);
        }
        repository.deleteById(id);
    }

    @Override
    public Fruit getFruitById(int id) {
        return repository.findById(id)
                .orElseThrow(() -> new ResourceNotFoundException("Fruta no encontrada con id: " + id));

    }

    @Override
    public List<Fruit> getAllFruits() {
        return repository.findAll();
    }
}
