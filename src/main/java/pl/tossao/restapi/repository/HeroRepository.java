package pl.tossao.restapi.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import pl.tossao.restapi.model.Hero;

public interface HeroRepository extends JpaRepository<Hero, Long> {
}
