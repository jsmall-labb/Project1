package Values;

public abstract class ImpleStructure implements Structure{
    double weight;
    double grade;
    String name;

    public ImpleStructure(String name, double weight, double grade) {
        this.name = name;
        this.weight = weight;
        this.grade = grade;
    }

    public ImpleStructure(String name, double weight) {
        this(name, weight, 0);
    }
}
