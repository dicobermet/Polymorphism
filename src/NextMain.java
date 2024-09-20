public class NextMain {
    public static void main(String[] args) {

//        Movie movie = Movie.getMove("A","Jaws");
//        movie.watchMovie();
//
//        Adventure jaws = (Adventure) Movie.getMove("A","Jaws");
//        jaws.watchMovie();

        Movie comedy = Movie.getMove("C", "Airplane");
        Comedy theComedy = (Comedy) comedy;
        theComedy.watchMovie();

        var airplane = Movie.getMove("C", "Airplane");
        airplane.watchMovie();

        var comedyFilm = new Comedy("Amazing Comedy movie");
        comedyFilm.watchComedy();

        Object unknowObject = Movie.getMove("S","Star Wars");
        if (unknowObject.getClass().getSimpleName() == "Comedy"){
            Comedy c = (Comedy) unknowObject;
            c.watchComedy();
            System.out.println("Comedy!!!");
        } else if (unknowObject instanceof Adventure) {
            ((Adventure)unknowObject).watchAdventure();
            System.out.println("Adventure!!!");
        } else if (unknowObject instanceof ScienceFiction syfy) {
            syfy.watchScienceFiction();
            System.out.println("SYFY!!!");
        }

    }
}
