package FinalReview;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class Comparing {
    public static void printSongs(List<Song> songs) {
        for (int i = 0; i < songs.size(); i++) System.out.printf("%d: %s\n", i, songs.get(i));
        IO.println();
    }

    public static void main(String[] args) {
        List<Song> playlist = new ArrayList<>(List.of(
                new Song(
                        "Let It Be",
                        "The Beatles",
                        243
                ),
                new Song("Here Comes the Sun",
                        "The Beatles",
                        185
                ),
                new Song(
                        "Overworld Theme",
                        "Koji Kondo",
                        180
                )
        ));
        printSongs(playlist);

        playlist.sort(Comparator.comparing(Song::getArtist));
        printSongs(playlist);

        playlist.sort(
                Comparator.comparing(Song::getArtist)
                        .thenComparing(Song::getTitle)
        );
        printSongs(playlist);

        playlist.sort(
                Comparator.comparing(Song::getArtist)
                        .thenComparing(
                                Comparator.comparingInt(Song::getDuration)
                                        .reversed()
                        )
        );
        printSongs(playlist);
    }
}
