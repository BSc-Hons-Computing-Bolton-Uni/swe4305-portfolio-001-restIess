package ProjectA;
import java.util.ArrayList;
import java.util.Scanner;

public class MusicApp {
    // this list will store all the songs like a mini library
    private static ArrayList<Song> songs = new ArrayList<>();
    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        initialiseSongs();
        int choice;

        // main menu loop
        do {
            System.out.println("\n=== Music Streaming App ===");
            System.out.println("1. Add new song");
            System.out.println("2. Remove song");
            System.out.println("3. Print all songs");
            System.out.println("4. Print songs with plays over a certain number");
            System.out.println("5. Exit");
            System.out.print("Enter choice: ");

            choice = scanner.nextInt();
            scanner.nextLine(); // consume newline

            switch (choice) {
                case 1:
                    addSong();
                    break;
                case 2:
                    removeSong();
                    break;
                case 3:
                    printAllSongs();
                    break;
                case 4:
                    printSongsOverPlayCount();
                    break;
                case 5:
                    System.out.println("Goodbye!");
                    break;
                default:
                    System.out.println("Invalid option. Try again.");
            }

        } while (choice != 5);
    }

    // pre-loaded songs
    private static void initialiseSongs() {
        songs.add(new Song("grapes", "glaive", 10));
        songs.add(new Song("Chum", "Earl Sweatshirt", 17));
        songs.add(new Song("pardon me", "ovine hall", 12));
        songs.add(new Song("lace up", "tsubi club", 9));
        songs.add(new Song("In My Room", "Julia Wolf", 32));
        songs.add(new Song("NOTHING", "N33T", 14));
        songs.add(new Song("Again", "Fetty Wap", 16));
        songs.add(new Song("E30", "Midwest", 3));
        songs.add(new Song("Dark Thoughts", "Lil Tecca", 3));
        songs.add(new Song("LA TRADITO", "$NOT", 2));
    }

    // add a brand new track to the playlist
    private static void addSong() {
        System.out.print("Enter song title: ");
        String title = scanner.nextLine();
        System.out.print("Enter artist name: ");
        String artist = scanner.nextLine();
        System.out.print("Enter play count: ");
        int playCount = scanner.nextInt();
        scanner.nextLine();

        songs.add(new Song(title, artist, playCount));
        System.out.println("Song added!");
    }

    // remove songs
    private static void removeSong() {
        System.out.print("Enter song title to remove: ");
        String title = scanner.nextLine();
        boolean removed = songs.removeIf(song -> song.getTitle().equalsIgnoreCase(title));
        if (removed) {
            System.out.println("Song removed.");
        } else {
            System.out.println("Song not found.");
        }
    }

    // shows all songs in the current library
    private static void printAllSongs() {
        if (songs.isEmpty()) {
            System.out.println("No songs in the library.");
        } else {
            System.out.println("\n--- All Songs ---");
            for (Song song : songs) {
                System.out.println(song);
            }
        }
    }

    // shows only the popular songs based on what you input (above the play count)
    private static void printSongsOverPlayCount() {
        System.out.print("Enter minimum play count: ");
        int minPlays = scanner.nextInt();
        scanner.nextLine();

        boolean found = false;
        for (Song song : songs) {
            if (song.getPlayCount() > minPlays) {
                System.out.println(song);
                found = true;
            }
        }

        if (!found) {
            System.out.println("No songs found with more than " + minPlays + " plays.");
        }
    }
}