package com.jhae44.spring.data.jpa.course.repository;

import com.jhae44.spring.data.jpa.course.entity.Course;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CourseRepository extends JpaRepository<Course, Long>{
    Page<Course> findByTitleContaining(
            String title,
            Pageable pageable
    );
}
