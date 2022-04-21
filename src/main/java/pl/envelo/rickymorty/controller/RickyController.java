package pl.envelo.rickymorty.controller;

import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import pl.envelo.rickymorty.model.byid.Episode;
import pl.envelo.rickymorty.model.episode.Ricky;
import pl.envelo.rickymorty.service.RickyService;

@RestController
@RequiredArgsConstructor
@RequestMapping("/api/ricky")
public class RickyController {

    private final RickyService rickyService;

    @GetMapping("/{id}")
    public Episode getEpisodeById(@PathVariable long id) {
        return rickyService.getEpisode(id);
    }

    @GetMapping
    public Ricky getRicky() {
        return rickyService.getEpisode();
    }
}
