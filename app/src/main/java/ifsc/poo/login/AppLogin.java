package ifsc.poo.login;

import java.util.Scanner;

public class AppLogin {
    public static void main(String[] args) {
        //Scanner
        Scanner scanner = new Scanner(System.in);

        //Instanciando User
        User user1 = new User();
        User user2 = new User();
        User user3 = new User();

        System.out.println("Bem vindo ao sistema de cadastro de usuários");

        Gerenciador cadastro = new Gerenciador();

        cadastro.add(user1, scanner);
        System.out.println();
        cadastro.add(user2, scanner);
        System.out.println();
        cadastro.add(user3, scanner);

        cadastro.remove(user1.getLogin());

        System.out.println("###### LISTANDO USUÁRIOS ##########");
        cadastro.listar();
        System.out.println();

        System.out.println(cadastro.auteticacao(scanner));

        scanner.close();


    }

}
