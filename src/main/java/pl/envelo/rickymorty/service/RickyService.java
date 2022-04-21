package pl.envelo.rickymorty.service;

import com.fasterxml.jackson.databind.ObjectMapper;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;
import pl.envelo.rickymorty.model.byid.Episode;
import pl.envelo.rickymorty.model.episode.Ricky;

import java.util.List;

@Service
@RequiredArgsConstructor
public class RickyService {

    private final ObjectMapper objectMapper;
    private final RestTemplate restTemplate;

    public Episode getEpisode(long id) {
        Episode response = restTemplate.getForObject("https://rickandmortyapi.com/api/episode/" + id, Episode.class);
        return objectMapper.convertValue(response, Episode.class);
    }

    public Ricky getEpisode() {
        Ricky response = restTemplate.getForObject("https://rickandmortyapi.com/api/episode", Ricky.class);
        return objectMapper.convertValue(response, Ricky.class);
    }
}
