/**
 * Created by cheey on 4/22/2016.
 */
public class ValidationMethod {
    boolean validGame = false;
    boolean validDate = false;
    boolean validRating = false;
    boolean validInfo = false;

    public void validationMethod(){
        if (validGame == true && validDate == true && validRating == true){
            validInfo = true;
        }
    }
}
