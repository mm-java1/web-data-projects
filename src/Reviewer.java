import java.util.ArrayList;
import java.util.List;

/**
 * Created by Administrator on 4/5/16.
 */
public class Reviewer {
    private String reviewerName;
    private int age;
    private char gender = ' ';
    private String comments;
    private String password = " ";
    private ArrayList favoriteGames = new ArrayList<String>();

    public Reviewer(String reviewerName, int age, char gender, String comments, String password, String favoriteGame) {
        this.reviewerName = reviewerName;
        try {
            this.setAge(age);
        } catch (InvalidDataTypeException e){
            e.printStackTrace();
        }
        try {
            this.setGender(gender);
        } catch (InvalidDataTypeException e){
            e.printStackTrace();
        }
        this.comments = comments;
        try {
            this.setPassword(password);
        } catch (InvalidDataTypeException e){
            e.printStackTrace();
        }
        this.favoriteGames.add(favoriteGame);
    }

    public Reviewer( int age, char gender, String password) {
        try {
            this.setAge(age);
        } catch (InvalidDataTypeException e){
            e.printStackTrace();
        }
        try {
            this.setGender(gender);
        } catch (InvalidDataTypeException e){
            e.printStackTrace();
        }
        try {
            this.setPassword(password);
        } catch (InvalidDataTypeException e){
            e.printStackTrace();
        }
    }
    public Reviewer(){

    }

    @Override
    public String toString() {
        return "Reviewer{" +
                "reviewerName='" + reviewerName + '\'' +
                ", age=" + age +
                ", gender=" + gender +
                ", comments='" + comments + '\'' +
                ", password='" + password + '\'' +
                ", favoriteGames=" + favoriteGames +
                '}';
    }

    public String getReviewerName() {
        return reviewerName;
    }

    public void setReviewerName(String reviewerName) {
        this.reviewerName = reviewerName;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) throws InvalidDataTypeException {
        if (age <= 0)
            throw new InvalidDataTypeException("Age must be over 0");
        else
            this.age = age;
    }

    public char getGender() {
        return gender;
    }

    public void setGender(char gender) throws InvalidDataTypeException {
        gender = Character.toUpperCase(gender);
        if (gender != 'M' && gender != 'F')
            throw new InvalidDataTypeException("gender must be Male or Female (M/F)");
        else
            this.gender = gender;
    }

    public String getComments() {
        return comments;
    }

    public void setComments(String comments) {
        this.comments = comments;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) throws InvalidDataTypeException {
        if (password.equals(" ") || password.isEmpty())
            throw new InvalidDataTypeException("Password is blank or null");
        else
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

    public void addFavoriteGame(String favoriteGame){
        favoriteGames.add(favoriteGame); //add favorite game
    }

    public boolean validateRecord(){
        boolean answer =  true;
        if (this.getAge() == 0 || this.gender == ' ' || this.getPassword().isEmpty() || this.getPassword().equals(" ")){
            answer = false;
        }

        return answer;
    }
}

