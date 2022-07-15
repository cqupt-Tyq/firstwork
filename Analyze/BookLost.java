package Analyze;

public class BookLost extends Lost{
    String name;
    public String getName() {
        return name;
    }

    public Lost setName(String name) {
        this.name = name;
        return null;
    }
    @Override
    public String toString() {
        return year +
                ","+month +
                "," + day +
                "," +name+
                ","+where
                ;
    }
}
