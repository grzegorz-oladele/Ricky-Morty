package pl.envelo.rickymorty.model;

import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Getter
@Setter
public class EpisodesDto {

    private Info info;
    private List<EpisodeDto> results;
}