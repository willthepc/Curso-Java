import java.util.Objects;

public class Candidact {
    private String name;
    private int voto;

    public Candidact() {}

    public Candidact(String name, int voto) {
        this.name = name;
        this.voto = voto;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getVoto() {
        return voto;
    }

    public void setVoto (int voto) {
        this.voto = voto;
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;

        Candidact candidact = (Candidact) o;
        return Objects.equals(name, candidact.name) && Objects.equals(voto, candidact.voto);
    }

    @Override
    public int hashCode() {
        int result = Objects.hashCode(name);
        result = 31 * result + Objects.hashCode(voto);
        return result;
    }
}
