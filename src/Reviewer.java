import java.util.ArrayList;

/**
 * Created by Administrator on 4/5/16.
 */
public class Reviewer {
    private String userName; //this should be username
    private String name; // this should be name
    private int age;
    private String gender; //string
    private String comments;
    private String password;
    private ArrayList favoriteGames = new ArrayList<String>();


    public Reviewer(){
    }


    public String getName() {

        return name;
    }

    public void setName(String name) throws InvalidDataTypeException {
        if (name == null || name.trim().isEmpty())
            throw new InvalidDataTypeException("Comments must not be null or empty");
        else
         this.name = name;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String reviewerName) throws InvalidDataTypeException {
        if (reviewerName == null || reviewerName.trim().isEmpty())
            throw new InvalidDataTypeException("Username must not be null or empty");
        else
            this.userName = reviewerName;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) throws InvalidDataTypeException {
        if (age < 13 )
            throw new InvalidDataTypeException("Age must be 13 years or older to user this service");
        else
            this.age = age;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) throws InvalidDataTypeException {
        if (gender == null || gender.trim().isEmpty()){
            throw new InvalidDataTypeException("Gender must not be null or empty");
        } else if (!gender.equalsIgnoreCase("male") && !gender.equalsIgnoreCase("female") && !gender.equalsIgnoreCase("other")){
            throw new InvalidDataTypeException("gender must be Male or Female or Other");
        } else{
            this.gender = gender;
        }
    }

    public String getProfile() {
        return comments;
    }

    public void setProfile(String comments)  {
        this.comments = comments;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) throws InvalidDataTypeException {
        if (password == null || password.trim().isEmpty()) {
            throw new InvalidDataTypeException("Password is blank or null");
        } else if (password.length() < 8 ){
            throw new InvalidDataTypeException("Password must be 8 characters");
        } else
            this.password = password;
    }

    public ArrayList getFavoriteGames() {
        return favoriteGames;
    }

    public void setFavoriteGames(ArrayList favoriteGames) {
        this.favoriteGames = favoriteGames;
    }

    public void addFavorite(String favorite){
        favoriteGames.add(favorite);
    }

    public void addFavoriteGame(Game game) throws InvalidDataTypeException {
        if (this.favoriteGames == null){
            this.favoriteGames = new ArrayList<Game>();
        }
        if (game == null){
            throw new InvalidDataTypeException("Game must not be null");
        } else
            favoriteGames.add(game); //add favorite game
    }

    public boolean validateRecord(){

        if (this.userName == null || this.password == null){
            return false;
        }
        return true;
    }
}

