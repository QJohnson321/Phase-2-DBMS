import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

public class updateGamesTest {

    private List<gameAttributes> gamesStored;
    private updateGames gameUpdate;
    private gameDatabase db;


    @BeforeEach
    public void setUp() {
        db = new gameDatabase();
        gameUpdate = new updateGames(db);
        gamesStored = new ArrayList<>();

    }
}