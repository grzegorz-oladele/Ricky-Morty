package pl.envelo.rickymorty.model;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Info {

    private int count;
    private int pages;
    private String next;
    private String prev;
}