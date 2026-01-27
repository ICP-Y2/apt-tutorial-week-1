import java.util.ArrayList;
import java.util.List;

public class Topic {

    private String name;
    private List<String> entries;

    public Topic(String name) {
        this.name = name;
        this.entries = new ArrayList<>();
    }

    public String getName() {
        return name;
    }

    // TODO: Add a method to add an entry

    // TODO: Add a method to return all entries
}
