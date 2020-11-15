import java.util.Objects;

public class DummyObj {

    String value;

    void setValue(String value){
        this.value = value;
    }

    public String getValue() {
        return value;
    }

    @Override
    public boolean equals(Object o) {
        DummyObj d = (DummyObj) o;
        return this.value.equals(d.getValue());
    }

    @Override
    public int hashCode() {
        return Objects.hash(value);
    }
}
