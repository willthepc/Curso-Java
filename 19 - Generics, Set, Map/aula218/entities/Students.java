public class Students {
    int qtd;
    int ID;

    public Students(int qtd, int ID) {
        this.qtd = qtd;
        this.ID = ID;
    }

    public int getQtd() {
        return qtd;
    }

    public int getID() {
        return ID;
    }

    public void setID(int ID) {
        this.ID = ID;
    }

    public void contagem()

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;

        Students students = (Students) o;
        return ID == students.ID;
    }

    @Override
    public int hashCode() {
        return ID;
    }
}

