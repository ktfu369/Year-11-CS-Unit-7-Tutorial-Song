import java.util.ArrayList;

public class Song {

    private String title,artist;
    private ArrayList<String> listen = new ArrayList<>();
    public Song(String a, String b){
        title = a;
        artist = b;
    }
    public String getTitle(){
        return title;
    }
    public String getArtist(){
        return artist;
    }
    public int howMany(ArrayList<String> names){
        int cnt=0;
        for(String name:names){
            name = name.toLowerCase();
            int f1=0;
            for(String lname:listen){
                if(name.equals(lname)){
                    f1=1;
                    break;
                }
            }
            if(f1==0){
                cnt++;
                listen.add(name);
            }
        }
        return cnt;
    }
}
