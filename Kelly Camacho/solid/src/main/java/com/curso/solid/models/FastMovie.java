package com.curso.solid.models;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class FastMovie extends Movie {
    private static final String playSpeed = "1.2x";
}
