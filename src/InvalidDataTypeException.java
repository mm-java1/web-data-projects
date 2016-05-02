/**
 * Created by Administrator on 4/19/16.
 */
public class InvalidDataTypeException extends Exception {

    public InvalidDataTypeException(String message) {
        super(message);
        System.out.println(message);
    }
}
