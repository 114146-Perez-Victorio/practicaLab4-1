package com.example.demo.models;

import lombok.*;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class Course {
    private String id;
    private String title;
    private int q_alumnos;
}
