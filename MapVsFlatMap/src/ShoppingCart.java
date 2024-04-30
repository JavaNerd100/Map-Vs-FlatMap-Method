import java.util.Arrays;
import java.util.List;

public class ShoppingCart {

    private String name;
    private List<String> items;

    public ShoppingCart(String name, String... items) {
        this.name = name;
        this.items = Arrays.asList(items);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<String> getItems() {
        return items;
    }

    public void setItems(List<String> items) {
        this.items = items;
    }

    @Override
    public String toString() {
        return "ShoppingCart{" +
                "name='" + name + '\'' +
                ", items=" + items +
                '}';
    }
}
