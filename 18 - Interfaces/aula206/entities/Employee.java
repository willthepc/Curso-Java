public class Employee implements Comparable<Employee> {
    private String name;
    private Double sala;

    public Employee(String name, Double sala) {
        this.name = name;
        this.sala = sala;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Double getSala() {
        return sala;
    }

    public void setSala(Double sala) {
        this.sala = sala;
    }

    @Override
    public int compareTo(Employee other) {
        return -sala.compareTo(other.getSala());
    }
}
