import java.util.ArrayList;

/**
 * Created by Sam on 4/10/2016.
 */
public class Reviewer {
    String name;
    String username;
    int age;

    public Reviewer(String username, String password) {
        this.username = username;
        this.password = password;
    }

    String gender;
    String profile;
    String password;
    ArrayList<String> favorites = new ArrayList<String>();

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
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

    public String getProfile() {
        return profile;
    }

    public void setProfile(String profile) {
        this.profile = profile;
    }

    public void addFav(String fav){
        favorites.add(fav);
    }

    public void seeFav(){
        for(int i = 0; i < favorites.size(); i++){
            System.out.println(favorites.get(i));
        }
    }
}
