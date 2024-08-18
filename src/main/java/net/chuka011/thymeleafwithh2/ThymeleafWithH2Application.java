package net.chuka011.thymeleafwithh2;

import net.chuka011.thymeleafwithh2.model.Tournament;
import net.chuka011.thymeleafwithh2.repository.TournamentRepository;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.event.ApplicationReadyEvent;
import org.springframework.context.event.EventListener;
import org.springframework.stereotype.Component;

import java.util.List;

@SpringBootApplication
public class ThymeleafWithH2Application {

    public static void main(String[] args) {
        SpringApplication.run(ThymeleafWithH2Application.class, args);
    }

}

@Component
class Initializer {
    private final TournamentRepository tournamentRepository;

    Initializer(TournamentRepository tournamentRepository) {
        this.tournamentRepository = tournamentRepository;
    }

    @EventListener(ApplicationReadyEvent.class)
    void reset(){
        this.tournamentRepository.deleteAll();
        tournamentRepository.saveAll(List.of(
                new Tournament(null, "AO", 2024),
                new Tournament(null, "RG", 2024),
                new Tournament(null, "Wim", 2024)
        ));
    }
}