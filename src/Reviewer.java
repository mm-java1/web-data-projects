import java.util.ArrayList;

/**
 * Created by cheey on 4/17/2016.
 */
public class Reviewer {
    private String userName;
    private int age;
    private String gender;
    private String userProfile;
    ArrayList<Game> favoriteGames = new ArrayList<>();
    private String passWord;

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) throws InvalidDataTypeException {
        try {
            if (userName.length() > 4)
            this.userName = userName;

        else {
            throw new InvalidDataTypeException("UserNames should be longer than 4 characters.");
        }

        }
        catch (NullPointerException e){
            throw new InvalidDataTypeException(e.getMessage());
        }

    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) throws InvalidDataTypeException{
        try {
            if (age > 15)
            this.age = age;

            else {
                throw new InvalidDataTypeException("Users should be 16 years of age or older. Please get a parent's consent.");
            }

        }
        catch (NullPointerException e){
            throw new InvalidDataTypeException(e.getMessage());
        }
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) throws InvalidDataTypeException {
        try {
            if (gender.equalsIgnoreCase("male") || gender.equalsIgnoreCase("female"))
                this.gender = gender;

            else {
                throw new InvalidDataTypeException("Please select \"Male\" or \"Female\".");
            }

        }
        catch (NullPointerException e){
            throw new InvalidDataTypeException(e.getMessage());
        }
    }

    public String getUserProfile() {
        return userProfile;
    }

    public void setUserProfile(String userProfile) {
        this.userProfile = userProfile;
    }

    public ArrayList<Game> getFavoriteGames() {
        return favoriteGames;
    }

    public void setFavoriteGames(ArrayList<Game> favoriteGames) {
        this.favoriteGames = favoriteGames;
    }

    public void addFavoriteGame(Game game){
        this.favoriteGames.add(game);
    }

    public String getPassWord() {
        return passWord;
    }

    public void setPassWord(String passWord) throws InvalidDataTypeException {
        try {
            if (passWord.length() > 5){
                this.passWord = passWord;}

            else {
                throw new InvalidDataTypeException("Passwords should be 6 characters or longer.");
            }

        }
        catch (NullPointerException e){
            throw new InvalidDataTypeException(e.getMessage());
        }
    }
}
