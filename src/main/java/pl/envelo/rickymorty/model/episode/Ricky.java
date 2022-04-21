package pl.envelo.rickymorty.model.episode;

import lombok.Getter;
import lombok.Setter;
import pl.envelo.rickymorty.model.byid.Episode;

import java.util.List;

@Getter
@Setter
public class Ricky {

    private Info info;
    private List<Episode> results;
}
