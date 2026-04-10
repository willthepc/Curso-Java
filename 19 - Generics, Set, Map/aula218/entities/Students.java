public class Students {
    int ID;

    public Students(int ID) {
        this.ID = ID;
    }

    public int getID() {
        return ID;
    }

    public void setID(int ID) {
        this.ID = ID;
    }

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

