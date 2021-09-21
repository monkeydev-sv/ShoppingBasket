import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;

import static org.junit.Assert.assertEquals;

public class ShoppingBasketTest {

    @Test
    public void  totalOfEmptyBasket(){

ShoppingBasket basket = new ShoppingBasket(new ArrayList<>());
assertEquals(0.0, basket.getTotal(),0.0);
    }
   @Test
    public void totalOfSingleItem(){
     ShoppingBasket basket = new ShoppingBasket(Arrays.asList(new Item(100.0,1)));
    assertEquals(100.0, basket.getTotal(),0.0);
    }

}
