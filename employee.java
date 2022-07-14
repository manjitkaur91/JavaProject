import java.util.Objects;

public class employee {

    String name;
    int id;

    public employee(String name,int id)
    {
        this.name=name;
        this.id=id;


    }

    @Override
    public String toString() {
        return "employee{" +
                "name='" + name + '\'' +
                ", id=" + id +
                '}';
    }

    // generte  hash code of employee id


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        employee employee = (employee) o;
        return id == employee.id;
    }

    @Override
    public int hashCode() {
        return Objects.hash(id);
    }
}
