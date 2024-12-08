package Values;

import java.util.ArrayList;

public class Course implements Structure{
    ArrayList<Parts> Parts;
    String name;
    double weight;
    public Course(String name, double weight) {
        this.name = name;
        this.weight = weight;
    }

    @Override
    public String printInfo(){return null;}

    public double finalGrade(){return 0;}
}
