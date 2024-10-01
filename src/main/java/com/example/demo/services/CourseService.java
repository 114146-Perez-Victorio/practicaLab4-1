package com.example.demo.services;


import com.example.demo.models.Course;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import java.util.Arrays;
import java.util.List;

@Service
@RequiredArgsConstructor
public class CourseService {

    private final RestTemplate restTemplate;
    private String url = "https://my-json-server.typicode.com/114146-Perez-Victorio/practicaLab4-1/cursos";


    //UTILIZANDO GET FOR OBJECT
    public List<Course> getCourses(){
        Course[] response = restTemplate.getForObject(url,Course[].class);

        return Arrays.asList(response);
    }
    public Course getByID(String ID){
        Course response = restTemplate.getForObject(url + "/{ID}",Course.class,ID);
        return response;
    }

    //UTILIZANDO GET FOR ENTITY

    public Course[] getCoursesEntity(){
        ResponseEntity<Course[]> response = restTemplate.getForEntity(url,Course[].class);
        if (response.getStatusCode().is2xxSuccessful()){
            return response.getBody();
        } else {
            return new Course[0];
        }
    }

}
