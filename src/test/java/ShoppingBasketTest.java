import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;

import static org.junit.Assert.assertEquals;

public class ShoppingBasketTest {

    @Test
    public void  totalOfEmptyBasket(){

ShoppingBasket basket = BuildBasketWithItems() ;
assertEquals(0.0, basket.getTotal(),0.0);
    }
   @Test
    public void totalOfSingleItem(){
     ShoppingBasket basket = BuildBasketWithItems(new Item(100.0, 1));
    assertEquals(100.0, basket.getTotal(),0.0);
    }


    @Test
public void totalOfTwoItems(){
        ShoppingBasket basket = BuildBasketWithItems(new Item(100.0,1),new Item(200, 1));
    assertEquals(300.0, basket.getTotal(),0.0);
    }

    private ShoppingBasket BuildBasketWithItems(Item... items) {
        return new ShoppingBasket(Arrays.asList(items));
    }

}
