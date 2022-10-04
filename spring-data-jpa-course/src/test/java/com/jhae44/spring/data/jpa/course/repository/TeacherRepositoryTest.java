package com.jhae44.spring.data.jpa.course.repository;

import com.jhae44.spring.data.jpa.course.entity.Course;
import com.jhae44.spring.data.jpa.course.entity.Teacher;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class TeacherRepositoryTest {

    @Autowired
    private TeacherRepository teacherRepository;

    @Test
    public void saveTeacher() {
        Course course = Course.builder()
                .title("DBA")
                .credits(4)
                .build();

        Course courseJVM = Course.builder()
                .title("JAVA")
                .credits(3)
                .build();


       Teacher teacher = Teacher.builder()
               .lastName("Teresa")
               .firstName("Marylyn")
               //.courses(List.of(course, courseJVM))
               .build();

       teacherRepository.save(teacher);
    }
}