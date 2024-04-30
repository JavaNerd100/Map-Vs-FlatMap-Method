import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;
import java.util.stream.Collectors;

public class MapVsFlatMap {

    public static void main(String[] args) {

        ShoppingCart amazonCart = new ShoppingCart("Laptops","Macbook","Windows");
        ShoppingCart flipkartCart = new ShoppingCart("Smartphones","Apple","Google");

        List<ShoppingCart> shoppingCartList = Arrays.asList(amazonCart,flipkartCart);

        //withMap()
        List<List<String>> listWithMap = shoppingCartList
                .stream()
                .map(ShoppingCart::getItems)
                .collect(Collectors.toList());
        System.out.println("Output of  map() method --> \t" + listWithMap);



        //withMap()
        List<String> listWithFlatMap = shoppingCartList
                .stream()
                .map(ShoppingCart::getItems)
                .flatMap(Collection::stream)
                .collect(Collectors.toList());
        System.out.println("Output of  flatMap() method --> \t" +listWithFlatMap);


    }
}
