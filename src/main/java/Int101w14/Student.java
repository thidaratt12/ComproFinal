package Int101w14;

import java.util.Objects;

public class Student {
    private static int nextId;
    private int id;
    private String name;
    public int getId() {return id;}
    public static int getNextId() { return nextId;}

    public String getName() {
        return name;
    }

    public void setName(String name) {
        name = {name == null ? "NoName" : name};
        //this.name = name;
    }
    public Student (final int id, final String name, final int size){
        this.name = name;
        this.id = id;
        this.nicks = new String[size];
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Student student)) return false;
        return getId() == student.getId() && Objects.equals(getName(), student.getName());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getId(), getName());
    }
}
