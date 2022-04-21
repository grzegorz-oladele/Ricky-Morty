package pl.envelo.rickymorty.service;

import com.fasterxml.jackson.databind.ObjectMapper;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;
import pl.envelo.rickymorty.model.EpisodeDto;
import pl.envelo.rickymorty.model.EpisodesDto;

@Service
@RequiredArgsConstructor
public class RickyService {

    private final ObjectMapper objectMapper;
    private final RestTemplate restTemplate;

    public EpisodeDto getEpisode(long id) {
        EpisodeDto response = restTemplate.getForObject("https://rickandmortyapi.com/api/episode/" + id, EpisodeDto.class);
        return objectMapper.convertValue(response, EpisodeDto.class);
    }

    public EpisodesDto getAllEpisodes() {
        EpisodesDto response = restTemplate.getForObject("https://rickandmortyapi.com/api/episode", EpisodesDto.class);
        return objectMapper.convertValue(response, EpisodesDto.class);
    }
}
