import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

// This class allows the user to search for the games in stock
// This allows the user to search by title, console, genre, studio


public class viewGame {

   Scanner scanner = new Scanner(System.in);
   gameDatabase db;


   public viewGame(gameDatabase db) {
       this.db = db;
   }
   //This is to start the search method for the user.
   // The user can select an option, and it will call
   // the selected method
    public void startView() {
        System.out.println("Welcome to View Video Games");
        System.out.println("Choose a Search Option");

        System.out.println("1. Title ");
        System.out.println("2. Genre ");
        System.out.println("3. Console ");
        System.out.println("4. Studio ");
        System.out.println("0. Exit");

        String choice = scanner.nextLine();


        switch (choice) {
            case "1":
                System.out.println("Title: ");
                String title = scanner.nextLine();
                System.out.println("Title: ");
                //db.gameDatabase2();
                filterByTitle(title, db.getGameStored());
                break;

            case "2":
                System.out.println("genre: ");
                String genre = scanner.nextLine();
                //db.gameDatabase2();
                filterByGenre(genre, db.getGameStored());
                break;

            case "3":
                System.out.println("Console: ");
                String console = scanner.nextLine();
                //db.gameDatabase2();
                filterByConsole(console, db.getGameStored());
                break;
            case "4":
                System.out.println("Studio: ");
                String studio = scanner.nextLine();
                //db.gameDatabase2();
                filterByStudio(studio, db.getGameStored());
                break;

            case "0":
                System.out.println("Exit");
                returnToMainMenu();
                break;

            default:
                System.out.println("Invalid Choice");
                startView();
                break;

        }

    }
            // This is to filter the games by title
            // The filterByTitle method has two arguments
            public List<gameAttributes> filterByTitle(String title, List<gameAttributes> gamesStored) {

                // a string for the user to type in the game they are
                //System.out.println("Filtering by Title: " + title);

                // Stores games that match in this list
                List<gameAttributes> viewListByTitle = new ArrayList<>();

                //the for is used to check the gamesStored and it is case-sensitive
                for(gameAttributes theGame : gamesStored) {

                    //Once game is found you can add it to the viewListByTitle and continue
                    if (theGame.getTitle().toLowerCase().contains(title.toLowerCase())) {
                        viewListByTitle.add(theGame);
                       //gamesStored.add(theGame);
                    }
                }
                //If game is empty this will show up
                if(viewListByTitle.isEmpty()) {
                    System.out.println("Title not found" + title);

                    //If input is incorrect this will show up and show all games in stock
                } else {
                    System.out.println("Title not found " + title + " Here are all the games in stock");
                    for(gameAttributes theGame : viewListByTitle) {
                        System.out.println(theGame);
                    }
                    //showTheFilter(viewListByTitle);

                }
                // prompt the user if they want to return to the main menu or to stay in this class
                returnToMainMenu();
                return viewListByTitle;
            }

            // This is to filter the games by Genre
            // The filterByGenre method has two arguments
            public void filterByGenre(String genre,  List<gameAttributes> gamesStored) {
                // a string for the user to type in the Genre they are looking for
                System.out.println("Filtering by Genre: " + genre);

                // Stores games that match in this list
                List<gameAttributes> viewGenreList = new ArrayList<>();
                //the for is used to check the gamesStored and it is case-sensitive
                for(gameAttributes theGame : gamesStored ) {

                    //Once game is found you can add it to the viewGenreList and continue
                    if(theGame.getGenre().toLowerCase().contains(genre.toLowerCase())) {
                        viewGenreList.add(theGame);
                    }
                }
                //If game is empty this will show up
                if(viewGenreList.isEmpty()) {
                    System.out.println("Genre not found" + genre);
                    //If input is incorrect this will show up and show all games in stock
                } else {
                    System.out.println("Genre not found " + genre + " Here are all the games in stock");
                    showTheFilter(viewGenreList);
                }
                // prompt the user if they want to return to the main menu or to stay in this class
                returnToMainMenu();

            }

                // This is to filter the games by console
                // The filterByConsole method has two arguments
            public void filterByConsole(String console, List<gameAttributes> gamesStored) {

                // a string for the user to type in the console they are looking for
                System.out.println("Filtering by Genre: " + console);

                // Stores games that match in this list
                List<gameAttributes> viewByConsole = new ArrayList<>();

                //the for is used to check the gamesStored and it is case-sensitive
                for(gameAttributes theGame3: gamesStored) {
                    if(theGame3.getConsole().toLowerCase().contains(console.toLowerCase())) {
                        //Once game is found you can add it to the viewByConsole and continue
                        viewByConsole.add(theGame3);

                    }
                }
                //If game is empty this will show up
                if(viewByConsole.isEmpty()){
                    System.out.println("Console not found" + console);

                    //If input is incorrect this will show up and show all games in stock
                } else{
                    System.out.println("Console not found " + console + " Here are all the games in stock");
                    showTheFilter(viewByConsole);

                }
                // prompt the user if they want to return to the main menu or to stay in this class
                returnToMainMenu();
            }

                // This is to filter the games by studio
                // The filterByStudio method has two arguments
           public void filterByStudio(String studio, List<gameAttributes> gamesStored) {
               // a string for the user to type in the console they are looking for
               System.out.println("Filtering by studio: " + studio);

               // Stores games that match in this list
                List<gameAttributes> viewByStudio = new ArrayList<>();

               //the for is used to check the gamesStored and it is case-sensitive
                for(gameAttributes theGame4: gamesStored) {
                    if(theGame4.getStudio().toLowerCase().contains(studio.toLowerCase())) {

                //Once game is found you can add it to the viewByConsole and continue
                        viewByStudio.add(theGame4);

                    }
                }
               //If game is empty this will show up
                if(viewByStudio.isEmpty()){
                    System.out.println("Studio not found" + studio);

                } else {
                    //If input is incorrect this will show up and show all games in stock
                    System.out.println("Genre not found " + studio + " Here are all the games in stock");
                    showTheFilter(viewByStudio);

                }
               // prompts the user if they want to return to the main menu or to stay in this class
                 returnToMainMenu();
           }
                // This prints out the search results for the user.
            public void showTheFilter(List<gameAttributes> gamesStored) {
                List<gameAttributes> allGames = db.getGameStored();

                for (gameAttributes allThegames : allGames) {
                    System.out.println("-----------------------");
                    System.out.println("Title: " + allThegames.getTitle());
                    System.out.println("Genre: " + allThegames.getGenre());
                    System.out.println("Console: " + allThegames.getConsole());
                    System.out.println("Studio: " + allThegames.getStudio());
                    System.out.println("-----------------------");

                }
            }


        // When the user is done they will be prompted to return to the
        // Main Menu or if they would like to view another game
        public void returnToMainMenu(){
            int answer = -1;

            while(true) {
                try {
                    System.out.println("Return To Main Menu. Press 1 ?");
                    System.out.println("View Another Game. Press 2 ?");

                    answer = Integer.parseInt(scanner.nextLine());
                    //scanner.nextLine();


                    switch(answer) {
                        case 1:
                            MainMenu returnToMainMenu = new MainMenu();
                            returnToMainMenu.menuOptions();
                           return;

                        case 2:
                            startView();
                            return;

                        default:
                            System.out.println("Invalid Choice. Returning To Main Menu");
                            MainMenu returnToMainMenu2 = new MainMenu();
                            returnToMainMenu2.menuOptions();
                            return;
                    }
                    //break;

                }catch(Exception e) {
                    System.out.println("Invalid Choice. Returning To Main Menu");
                    returnToMainMenu();
                }
            }
        }
}








