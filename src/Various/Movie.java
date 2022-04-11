package Various;

public class Movie {
    private String title;
    private String actor;
    private String rating;

    public Movie(String title, String actor, String rating){

        this.setTitle(title);
        this.setActor(actor);
        this.setRating(rating);

    }
    public void setRating(String rating) {
        if(rating.equals("G") || rating.equals("PG") || rating.equals("PG-13") ||
                rating.equals("R") || rating.equals("NR")) {
            this.rating = rating;
        } else {
            this.rating = "Not Rated";
        }
        }
        public String getRating(){
        return this.rating;
        }
        public void setTitle(String title) {
        this.title = title;
        }
        public String getTitle(){
        return this.title;
        }
        public void setActor(String actor){
        this.actor = actor;
        }
        public String getActor(){
        return this.actor;
        }

    }
