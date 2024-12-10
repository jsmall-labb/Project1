package Values;

import java.util.ArrayList;

public class Course extends ImpleStructure{//TODO
    ArrayList<Parts> parts = new ArrayList<>();

    public Course() {
        super();
    }
    @Override
    public String toString(){return "\n " + super.getName() +  parts.toString();}

    @Override
    public double finalGrade(){
        return 0;//TODO
    }

    public void addPart(Parts part){
        parts.add(part);
    }



}
