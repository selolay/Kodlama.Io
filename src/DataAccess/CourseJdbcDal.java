package DataAccess;

import Entities.Category;
import Entities.Course;

import java.util.ArrayList;

public class CourseJdbcDal implements  ICourseDal {
    ArrayList<Course> courses = new ArrayList<Course>();
    @Override
    public void Add(Course course) {
        System.out.println("jdbc ile veri tabanına eklendi: ");
        courses.add(course);

    }

    @Override
    public boolean Check(String title) {
        for (Course course: courses){
            if(course.getTitle().equalsIgnoreCase(title)){
                return true;
            }
        }
        return false;
    }


}
