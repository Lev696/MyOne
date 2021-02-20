package by.brest.mts.MyOne;

public class MtsSaler {
    int id;
    String section;

    public MtsSaler() {
        this.id = 1;
        this.section = "nothing";
    }

    @Override
    public String toString() {
        return "MtsSaler{" +
                "id=" + id +
                ", section='" + section + '\'' +
                '}';
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getSection() {
        return section;
    }

    public void setSection(String section) {
        this.section = section;
    }
}
