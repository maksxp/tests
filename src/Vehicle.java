import java.util.Objects;

public class Vehicle {

    private int id;

    private String name = "vehicle";

    public int getId() {
        return id;
    }

    public String getName (){return name;}

    public Vehicle () {

    }

    public Vehicle (int id){
        this.id=id;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Vehicle vehicle = (Vehicle) o;
        return id == vehicle.id;
    }

    @Override
    public int hashCode() {
        return Objects.hash(id);
    }

    @Override
    public String toString() {
        return "Vehicle{" +
                "id=" + id +
                '}';
    }
}
