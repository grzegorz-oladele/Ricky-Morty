package pl.envelo.rickymorty.service;

import com.fasterxml.jackson.databind.ObjectMapper;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;
import pl.envelo.rickymorty.model.Episode;

@Service
@RequiredArgsConstructor
public class RickyService {

    private final ObjectMapper objectMapper = new ObjectMapper();
    private final RestTemplate restTemplate = new RestTemplate();

    public Episode getEpisode(long id) {
        Episode response = restTemplate.getForObject("https://rickandmortyapi.com/api/episode/" + id, Episode.class);
        return objectMapper.convertValue(response, Episode.class);
    }
}
