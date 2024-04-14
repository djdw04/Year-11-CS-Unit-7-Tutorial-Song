import java.util.ArrayList;

public class Song {
    private String title;
    private String artist;
    private ArrayList<String> listen = new ArrayList<>();

    public Song(String title, String artist) {
        this.title = title;
        this.artist = artist;
    }

    public String getTitle() {
        return title;
    }

    public String getArtist() {
        return artist;
    }

    public int howMany(ArrayList<String> names){
        int cnt = 0;
        for(String name:names){
            name = name.toLowerCase();
            int num = 0;
            for(String newName:listen){
                if(name.equals(newName)){
                    num = 1;
                    break;
                }
            }
            if(num == 0){
                cnt++;
                listen.add(name);
            }
        }
        return cnt;
    }
}

