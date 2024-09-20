import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
 /*    Movie theMovie = Movie.getMove("Science","Star Wars");
     theMovie.watchMovie();*/

        Scanner s = new Scanner( System.in);
        while (true){
            System.out.println("Enter Type (A for Adventure, C for Comody, "
            + "S for Science Fiction, or Q for quit): ");
            String type = s.nextLine();

            if ("Qq".contains(type)){
                break;
            }
            System.out.println("Enter Movie title");
            String title = s.nextLine();
            Movie movie = Movie.getMove(type,title);
            movie.watchMovie();
        }

    }
}
