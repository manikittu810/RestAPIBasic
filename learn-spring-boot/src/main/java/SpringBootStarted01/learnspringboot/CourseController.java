package SpringBootStarted01.learnspringboot;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Arrays;
import java.util.List;

@RestController
public class CourseController {
    @RequestMapping ("/courses")
    public List<Course> retrieveAllCourses(){
       return Arrays.asList(
                new Course(1,"AWS", "Main certification"),
                new Course(2,"SQL", "2nd Main certification"),
                new Course(3,"Java", " 3rdMain certification")
        );
    }
}
