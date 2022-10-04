package com.jhae44.spring.data.jpa.course.repository;

import com.jhae44.spring.data.jpa.course.entity.Guardian;
import com.jhae44.spring.data.jpa.course.entity.Student;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

@SpringBootTest
class StudentRepositoryTest {
    @Autowired
   private StudentRepository studentRepository;


   @Test
   public void saveStudent() {
       Student student = Student.builder()
               .emailId("shabbir@gmail.com")
               .firstName("John")
               .lastName("Anabel")
               .build();
       studentRepository.save(student);
   }
   @Test
   public void saveStudentWithGuardian() {
       Guardian guardian = Guardian.builder()
               .email("Brownperter@gmail.com")
               .name("Perter")
               .mobile("08012348432")
               .build();
       Student student = Student.builder()
               .firstName("Perter")
               .lastName("Berg")
               .emailId("PerterB@gmail.com")
               .guardian(guardian)
               .build();

       studentRepository.save(student);
   }

   @Test
   public void printAllStudent() {
       List<Student> studentList =
               studentRepository.findAll();

       System.out.println("studentList = " + studentList);
   }

   @Test
   public void printStudentByFirstName(){
        List<Student> students =
                studentRepository.findByFirstName("John");

       System.out.println("students = " + students);
   }

    @Test
    public void printStudentByFirstNameContaining(){
        List<Student> students =
                studentRepository.findByFirstNameContaining("Jn");

        System.out.println("students = " + students);
    }
    @Test
    public void printStudentBasedOnGuardianName() {
       List<Student> students =
               studentRepository.findByGuardianName("Perter");
       System.out.println("students " + students);
    }

    @Test
    public void printgetStudentByEmailAddress() {
       Student student =
               studentRepository.getStudentByEmailAddress(
                       "shabbir@gmail.com"
               );
        System.out.println("student " + student);
    }

    @Test
    public void printgetStudentFirstNameByEmailAddress() {
        String firstName =
                studentRepository.getStudentFirstNameByEmailAddress(
                        "shabbir@gmail.com"
                );
        System.out.println("firstName " + firstName);
    }

    @Test
    public void printgetStudentByEmailAddressNative() {
        Student student =
                studentRepository.getStudentByEmailAddressNative(
                        "shabbir@gmail.com"
                );
        System.out.println("student " + student);
    }

    @Test
    public void printgetStudentByEmailAddressNativeNamedParam() {
        Student student =
                studentRepository.getStudentByEmailAddressNativeNamedParam(
                        "shabbir@gmail.com"
                );
        System.out.println("student " + student);
    }

    @Test
    public void updateStudentNameByEmailIdTest() {
       studentRepository.updateStudentNameByEmailId(
               "Jonny","shabbir@gmail.com"
       );
    }


}