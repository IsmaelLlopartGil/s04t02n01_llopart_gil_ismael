package cat.itacademy.barcelonactiva.llopart_gil_ismael.s04.t02.n01.model.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import cat.itacademy.barcelonactiva.llopart_gil_ismael.s04.t02.n01.model.domain.Fruit;

public interface FruitRepository extends JpaRepository<Fruit, Integer> {

}
