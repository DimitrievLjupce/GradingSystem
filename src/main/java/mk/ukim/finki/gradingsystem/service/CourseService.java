package mk.ukim.finki.gradingsystem.service;

import mk.ukim.finki.gradingsystem.model.Activity;
import mk.ukim.finki.gradingsystem.model.Course;
import mk.ukim.finki.gradingsystem.model.Student;
import mk.ukim.finki.gradingsystem.model.StudentActivityPoints;

import java.util.List;

public interface CourseService {
    Course findById(Long id);

    List<Course> listAll();

    List<Course> filterCoursesByYear(String year);

    List<Course> filterCoursesBySearch(String searchText);

    Course create(String name, String year);

    Course edit(Long courseId, String name, String year);

    Course delete(Long courseId);

    Course addActivityToCourse(Long courseId, Long activityId);

    List<Student> filterStudentsInCourse(Long courseId, List<Student> studentList);

    Course addStudentsToCourseManual(Long courseId, List<Integer> studentsId);

    Course removeStudentFromCourse(Long courseId, Integer studentId);

    List<StudentActivityPoints> getPoints(Long activityid);

    List<Student> filterStudents(String searchText, List<Student> studentsInCourse);

    void importStudents(Long courseId, String path);
}
