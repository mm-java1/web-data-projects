import java.util.ArrayList;

/**
 * Created by cheey on 4/17/2016.
 */
public class Reviewer {
    private String userName;
    private int age;
    private String gender;
    private String userProfile;
    ArrayList<String> favoriteGames = new ArrayList<>();
    private String passWord;

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getUserProfile() {
        return userProfile;
    }

    public void setUserProfile(String userProfile) {
        this.userProfile = userProfile;
    }

    public ArrayList<String> getFavoriteGames() {
        return favoriteGames;
    }

    public void setFavoriteGames(ArrayList<String> favoriteGames) {
        this.favoriteGames = favoriteGames;
    }

    public void addFavoriteGame(String game){
        this.favoriteGames.add(game);
    }

    public String getPassWord() {
        return passWord;
    }

    public void setPassWord(String passWord) {
        this.passWord = passWord;
    }
}
