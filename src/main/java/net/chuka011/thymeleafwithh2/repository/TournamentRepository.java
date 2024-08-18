package net.chuka011.thymeleafwithh2.repository;

import net.chuka011.thymeleafwithh2.model.Tournament;
import org.springframework.data.repository.CrudRepository;

public interface TournamentRepository extends CrudRepository<Tournament, Integer> {
}
