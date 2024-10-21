import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;


// This test if the view game methods are working

public class viewGameTest1 {

    private gameDatabase db;
    private viewGame view;

    @BeforeEach
    public void setUp() {
        db = new gameDatabase();
        view = new viewGame(db);
    }

    @Test
    public void testFilterByTitle_Found() {
        String title = "Call Of Duty";

        // Call the method once and store the result
        List<gameAttributes> filteredGames = view.filterByTitle(title, db.getGameStored());

        view.showTheFilter(filteredGames);

        // Debugging: Ensure the games are filtered correctly
        assertFalse(filteredGames.isEmpty(), "Filtered games list should not be empty.");
        assertEquals(1, filteredGames.size(), "Filtered games list should have one game.");



        // Assert that the title of the first game matches
        assertEquals("Call Of Duty", filteredGames.get(0).getTitle(), "The title of the first game should match.");
    }
}