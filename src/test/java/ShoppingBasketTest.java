import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class ShoppingBasketTest {

    @Test
    public void  totalOfEmptyBasket(){

ShoppingBasket basket = new ShoppingBasket();
assertEquals(0.0, basket.getTotal(),0.0);
    }
}
