package com.example.movieapi.entities;

import jakarta.persistence.*;
import jakarta.validation.constraints.NotBlank;
import lombok.*;

import java.util.List;

@Entity
@NoArgsConstructor
@AllArgsConstructor
@Data
@Builder
public class Movie {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer movieId;

    @Column(nullable = false, length = 200)
    @NotBlank(message = "Please provide movie's title")
    private String title;

    @Column(nullable = false)
    @NotBlank(message = "Please provide movie's director")
    private String director;

    @Column(nullable = false)
    @NotBlank(message = "Please provide movie's studio")
    private String studio;

    @ElementCollection
    @CollectionTable(name = "movie_cast")
    private List<String> movieCast;

    @Column(nullable = false)
    @NotBlank(message = "Please provide movie's release year")
    private Integer releaseYear;

    @Column(nullable = false)
    @NotBlank(message = "Please provide movie's release poster")
    private String poster;
}
