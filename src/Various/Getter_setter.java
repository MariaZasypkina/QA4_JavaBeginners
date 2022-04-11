package Various;
public class Getter_setter {
    public static void main(String[] args) {
        Movie movie1 = new Movie("Doctor Strange II", "B.Camberbatch", "PG-13");
        Movie movie2 = new Movie("Dune", "T.Chalamet", "R");

            System.out.println(movie1.getRating());
            System.out.println(movie1.getActor());
            System.out.println(movie1.getTitle());

    }
}
