package com.jhae44.spring.data.jpa.course.repository;

import com.jhae44.spring.data.jpa.course.entity.CourseMaterial;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CourseMaterialRepository extends JpaRepository<CourseMaterial, Long> {

}
