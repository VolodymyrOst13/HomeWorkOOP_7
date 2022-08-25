package task2;

public class Worker implements Comparable <Worker>{
    String name;
    String position;
    String year;

    public Worker(String name, String position, String year) {
        this.name = name;
        this.position = position;
        this.year = year;
    }

    @Override
    public String toString() {
        return "Worker{" +
                "fio='" + name + '\'' +
                ", post='" + position + '\'' +
                ", year='" + year + '\'' +
                '}';
    }

    @Override
    public int compareTo(Worker o) {
        return this.name.compareTo(o.position);
    }
}


