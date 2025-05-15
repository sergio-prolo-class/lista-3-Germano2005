package ifsc.poo;

import ifsc.poo.login.User;

public class AppLogin {
    public static void main(String[] args) {
        //Instanciando User
        User user = new User();
        System.out.println("Bem vindo ao Sistema de Login!");

        user.setLogin("Abel");
        user.setPassword("1234");
        user.setLogin("Beatriz");
        user.setPassword("1234");
        user.setLogin("Carlos");
        user.setPassword("1234");

    }

}
