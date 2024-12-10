package Values;

public abstract class ImpleStructure implements Structure{//TODO
    private double weight;
    private double grade;
    private String  name;

    public ImpleStructure() {}

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public void setGrade(double grade) {
        this.grade = grade;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
    public double getWeight() {
        return weight;
    }
    public double getGrade() {
        return grade;
    }

    @Override
    public String toString() {
        return  "\n name= " + name + "\n grade= " + grade ;
    }


}
