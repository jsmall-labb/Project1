package Values;

public interface Structure {
    public String printInfo();
    public default double finalGrade(){
        throw new IllegalArgumentException("Default finalGrade method cannot be called");
    }
}

