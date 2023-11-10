import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

public class Password implements Serializable {
    private String password;

    public Password(String password, int hashCode) {
        this.password = password;
    }

    private void writeObject(ObjectOutputStream s) throws IOException {
        s.defaultWriteObject();
    }

    private void readObject(ObjectInputStream s) throws IOException {
        try {
            String pwd = (String) s.readObject();
            if (!password.equals(pwd)) {
                password = "x";
            }
        } catch(Exception e) {
            System.out.println(e.getMessage());
            e.printStackTrace();
        }
    }

    public String toString() {
        return password;
    }
}