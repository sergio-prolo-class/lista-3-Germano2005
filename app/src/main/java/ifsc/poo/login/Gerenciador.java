package ifsc.poo.login;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Gerenciador {
    private static Set<User> users = new HashSet<>();

    public static Set<User> getUsers() {
        return users;
    }

    public static void setUsers(Set<User> users1) {
        users = users1;
    }

    //Adiciona usuário
    public void add(User user, Scanner scanner){
        System.out.print("Informe o login: ");
        user.setLogin(scanner.next());
        System.out.print("Informe a password: ");
        user.setPassword(scanner.next());
        users.add(user);
    }

    //Remove usuário
    public void remove(String login){
        for(User user : users){
            if (user.getLogin().equals(login)){
                users.remove(user);
                return;
            }
        }
    }

    //Listar usuários
    public void listar(){
        for (User user : users){
            System.out.println("Login: " + user.getLogin());
        }
    }

    //Autenticação
    public String auteticacao(Scanner scanner){
        System.out.print("Login: ");
        String loginAuth = scanner.next();
        System.out.print("Password: ");
        String passwordAuth = scanner.next();

        for(User u : users){
            if (u.getLogin().equals(loginAuth) && u.getPassword().equals(passwordAuth)){
                return u.toString();
            }
        }
        return "Login ou senha errados!";
    }

}
