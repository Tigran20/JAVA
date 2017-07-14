import java.util.ArrayList;
import java.util.List;

public class Album {
    private String name;
    private String artist;
    private List<Song> songs;

    public Album(String name, String artist) {
        this.name = name;
        this.artist = artist;
        this.songs = new ArrayList<>();
    }

    public boolean addSong(String title, double duration){
        if (findSong(title) == null) {
            this.songs.add(new Song(title,duration));
            return true;
        }
        return false;
    }

    private Song findSong (String title){
        for(Song chekedSong : this.songs){
            if(chekedSong.getTitle().equals(title)){
                return chekedSong;
            }
        }
        return null;
    }

    public boolean addToPlayList(int trackNumber, List<Song> playList){
        int index = trackNumber - 1;
        if((index > -1) && (index <= this.songs.size())){
            playList.add(this.songs.get(index));
            return true;
        }
        System.out.println("В этом альбоме нет песни с номером " + trackNumber);
        return false;
    }

    public boolean addToPlayList(String title, List<Song> playList){
        Song checkedSong = findSong(title);
        if(checkedSong != null){
            playList.add(checkedSong);
            return true;
        }
        System.out.println("Песня " + title + " не в этом альбоме");
        return false;
    }
}
