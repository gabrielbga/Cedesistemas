package Genres;
import Genre;

class ComedyMovie extends Genre {

    String playMode = "1.2X";

    @Override
    public String playMode(){
        return this.playMode;
    }

}
