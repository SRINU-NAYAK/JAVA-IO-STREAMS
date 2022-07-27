package ObjectOutputStream;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.io.Serializable;

public class ObjectOutputStreamExample {

    public static void main(String[] args) {
        final Employee employee = new Employee();
        employee.setId(100);
        employee.setName("ramesh");
        try (final FileOutputStream fout = new FileOutputStream("employees.txt");
             final ObjectOutputStream out = new ObjectOutputStream(fout)) {
            out.writeObject(employee);
            out.flush();
            System.out.println("success");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}

class Employee implements Serializable {
    private static final long serialVersionUID = 1L;
    private int id;
    private String name;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}