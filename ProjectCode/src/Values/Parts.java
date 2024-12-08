package Values;



public class Parts implements Structure {

    double weight;
    double grade;
    String name;

    public Parts(String name, double weight, double grade) {
        this.name = name;
        this.weight = weight;
        this.grade = grade;
    }
    @Override
    public String printInfo(){return null;}

    public double finalGrade(){return 0;}
}
