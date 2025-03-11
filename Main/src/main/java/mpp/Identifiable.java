package mpp;

public interface Identifiable<ID> {
    void setId(ID id);
    ID getId();
}
