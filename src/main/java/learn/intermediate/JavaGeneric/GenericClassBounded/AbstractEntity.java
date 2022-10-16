package learn.intermediate.JavaGeneric.GenericClassBounded;

public abstract class AbstractEntity<ID>{

    private ID id;

    private String note;

    public String getNote() {
        return note;
    }

    public void setNote(String note) {
        this.note = note;
    }

    public ID getId() {
        return id;
    }

    public void setId(ID id) {
        this.id = id;
    }
}
