package net.chuka011.thymeleafwithh2.controller;

import lombok.RequiredArgsConstructor;
import net.chuka011.thymeleafwithh2.repository.TournamentRepository;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@RequiredArgsConstructor
@Controller
public class TournamentController {

    private final TournamentRepository tournamentRepository;

    @GetMapping("/tournament")
    String tournament(Model model) {
        model.addAttribute("tournaments", tournamentRepository.findAll());
        return "tournament";
    }
}
