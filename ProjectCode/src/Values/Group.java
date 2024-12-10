package Values;

import java.util.ArrayList;

public class Group extends ImpleStructure{

    private ArrayList<Course> courses = new ArrayList<>();

    public Group(){super();}

    @Override
    public double finalGrade(){return 0;}

    @Override
    public String toString() {
        return super.getName() + courses.toString();
    }

    public void addCourse(Course course){
        courses.add(course);
    }

    public void setName(String name){
        super.setName(name);
    }

    public void setWeight(double weight){
        super.setWeight(weight);
    }

    public void removeCourse(Course course){
        courses.remove(course);
    }
}
