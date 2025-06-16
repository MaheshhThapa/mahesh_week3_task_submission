class Song{
    String title;
    String artist;

    Song(String title, String artist) {
        this.title = title;
        this.artist = artist;
    }

    void play(){
        System.out.println("Playing song: " +title + " by "+ artist);
    }
}

class PopSong extends Song{
    PopSong(String title, String artist) {
        super(title, artist);
    }

    @Override
    void play(){
        System.out.println("Playing pop song : " +title + " by "+ artist);
    }
}
class RockSong extends Song{
    RockSong(String title, String artist) {
        super(title, artist);
    }

    @Override
    void play(){
        System.out.println("Playing rock song : " +title + " by "+ artist);
    }
}

class JazzSong extends Song{
    JazzSong(String title, String artist) {
        super(title, artist);
    }

    @Override
    void play(){
        System.out.println("Playing jazz song : " +title + " by "+ artist);
    }
}
public class MusicApp {
    public static void main(String[] args) {
        Song[] playlist = new Song[3];

        playlist[0] = new PopSong("After Hours", "The Weeknd") ;
        playlist[1] = new RockSong("I want to break free", "Queen") ;
        playlist[2] = new JazzSong("Can I call you rose?", "Three Sacred Souls") ;

        playlist[0].play();
        playlist[1].play();
        playlist[2].play();


    }
}
