package com.jhae44.spring.data.jpa.course.repository;

import com.jhae44.spring.data.jpa.course.entity.Course;
import com.jhae44.spring.data.jpa.course.entity.CourseMaterial;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

@SpringBootTest
class CourseMaterialRepositoryTest {

    @Autowired
    private CourseMaterialRepository repository;

    @Test
    public void SaveCourseMaterial(){

        Course course = Course.builder()
                .title("DSA")
                .credits(6)
                .build();

        CourseMaterial courseMaterial = CourseMaterial.builder()
                .url("www.google.com")
                .course(course)
                .build();
        repository.save(courseMaterial);
    }
    @Test
    public void printAllCourseMaterials() {
           List<CourseMaterial> courseMaterials = repository.findAll();

            System.out.println("courseMaterials " + courseMaterials );
    }


}