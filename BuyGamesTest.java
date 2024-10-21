import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.io.ByteArrayInputStream;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import static org.junit.jupiter.api.Assertions.*;

// This test show examples of checking items in the cart are empty and
// test the checkout method

public class BuyGamesTest {

    private List<cartSetup> userCart;
    private BuyGames buyGames;
    private double theTotal;

    // These need to run to create a new instance of a cart and zero dollar balance
    @BeforeEach
    public void setUp() {
        userCart = new ArrayList<>();
        theTotal = 0.0;
    }

    // This test if the cart is empty
    @Test
    public void testCheckoutWithEmptyCart() {
        // Creating an empty cart and
        // user selects one to check out with an empty cart


        String input = "1\n";
        InputStream in = new ByteArrayInputStream(input.getBytes());
        Scanner scanner = new Scanner(in);


        buyGames = new BuyGames();


        buyGames.checkoutFinal();

        // Use assert to check if it prints "No Games In Stock"
        // if so then the cart is empty
        assertTrue(userCart.isEmpty(), "The cart should be empty.");
    }

}