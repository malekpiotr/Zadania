package zadaniaZKlasami;


public class UserValidator {

    public void sprawdzenieCzyPuste(User user) {
        boolean sprawdzenie = true;
        if (user.getPassword().length() > 0 &&
                user.getSurname().length() > 0 &&
                user.getLogin().length() > 0 &&
                user.getName().length() > 0) {
            sprawdzenie = true;
        }else sprawdzenie = false;
    }
}