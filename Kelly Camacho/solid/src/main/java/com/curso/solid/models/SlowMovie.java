package com.curso.solid.models;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class SlowMovie extends Movie {
    private static final String playSpeed = "0.9x";
}
