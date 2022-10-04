package com.jhae44.spring.data.jpa.course.repository;

import com.jhae44.spring.data.jpa.course.entity.Course;
import com.jhae44.spring.data.jpa.course.entity.Student;
import com.jhae44.spring.data.jpa.course.entity.Teacher;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;

import java.util.List;

@SpringBootTest
class CourseRepositoryTest {

    @Autowired
    private CourseRepository courseRepository;

    @Test
    public void printCourses(){
        List<Course> courses = courseRepository.findAll();

        System.out.println("courses = " + courses);
    }

    @Test
    public void saveCourseWithTeacher() {

        Teacher teacher = Teacher.builder()
                .firstName("Turner")
                .lastName("Merge")
                .build();

        Course course = Course.builder()
                .credits(6)
                .teacher(teacher)
                .title("python")
                .build();

        courseRepository.save(course);
    }

    @Test
    public void findAllPagination(){
        Pageable firstPagewithThreeRecords =
                PageRequest.of(0,3);
        Pageable secondPageWithTwoRecords =
                PageRequest.of(1,2);

        List<Course> courses = courseRepository
                .findAll(firstPagewithThreeRecords).getContent();

        long totalElements = courseRepository
                .findAll(firstPagewithThreeRecords)
                        .getTotalElements();

        long totalPages = courseRepository
                .findAll(firstPagewithThreeRecords)
                        .getTotalPages();

        System.out.println("totalPages = " + totalPages);

        System.out.println("totalElements = " + totalElements);

        System.out.println("courses = " + courses);
    }

    @Test
    public void findAllSorting() {
        Pageable sortByTitle = PageRequest.of(
                0,2, Sort.by("title")
        );
        Pageable sortByCreditDesc =
                PageRequest.of(
                        0,
                        2,
                        Sort.by("credits").descending()
                );
        Pageable sortByTitleAndCreditDesc =
                PageRequest.of(0,2,Sort.by("title")
                        .descending().and(Sort.by("credits")));

        List<Course> courses = courseRepository.findAll(sortByTitle).getContent();

        System.out.println("courses = " + courses);
    }

    @Test
      public void printFindByTitleContaining() {
        Pageable firstPageTenRecords =
                PageRequest.of(0,10);

        List<Course> courses =
                courseRepository.findByTitleContaining(
                        "D",
                        firstPageTenRecords).getContent();

        System.out.println("course "+ courses);
    }

    @Test
    public void saveCourseWithStudentAndTeacher() {
        Teacher teacher = Teacher.builder()
                .lastName("Perez")
                .firstName("Mike")
                .build();

        Student student = Student.builder()
                .firstName("Anii").lastName("Bria")
                .emailId("Anii@gmail.com").build();

        Course course = Course.builder()
                .title("AI")
                .credits(3)
                .teacher(teacher)
                .build();

        course.addStudents(student);

        courseRepository.save(course);
    }

}