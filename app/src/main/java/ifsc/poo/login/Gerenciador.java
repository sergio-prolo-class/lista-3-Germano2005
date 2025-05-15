package ifsc.poo.login;

import java.util.HashSet;
import java.util.Set;

public class Gerenciador {
    private static Set<User> users = new HashSet<>();

    public static Set<User> getUsers() {
        return users;
    }

    public static void setUsers(Set<User> users1) {
        users = users1;
    }

}
