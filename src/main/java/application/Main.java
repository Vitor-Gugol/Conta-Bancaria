package application;

import entities.Client;

import java.sql.SQLOutput;
import java.util.Locale;
import java.util.Scanner;


public class Main {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        Client client;


        System.out.println("Enter Account number: ");
        int number = sc.nextInt();

        System.out.println("Enter Account Holder: ");
        sc.nextLine();
        String holder = sc.nextLine();

        System.out.println("Is there na initial deposit (y/n)? ");
        char response = sc.next().charAt(0);

        if(response == 'y'){
            System.out.println("Enter initial deposit value:" );
            double initialDeposit = sc.nextDouble();
            client = new Client(number,holder,initialDeposit);
        }
        else{
            client = new Client(number,holder);
        }

        System.out.println("\nAccount data: ");
        System.out.println(client);
        System.out.print("\nEnter a deposit value:");
        client.depositar(sc.nextDouble());

        System.out.println("Update account data: ");
        System.out.println(client);


        System.out.print("\nEnter a witdraw value:");

        client.sacar(sc.nextDouble());
        System.out.println("Update account data:");
        System.out.println(client);
        sc.close();

    /*    client.setAccount(sc.nextInt());
        sc.nextLine();

        System.out.println("Enter Account Holder: ");
        client.setName(sc.nextLine());

        System.out.println("Is there na initial deposit (y/n)? ");
        String confirm = sc.nextLine();

      if (confirm.equalsIgnoreCase("y")){
                System.out.println("Enter initial deposit value: ");
                client.depositar(sc.nextDouble());
        }
        System.out.println("\nAccount data: ");
        System.out.printf("Account: %d, Holder: %s, Balance:$ %.2f \n", client.getAccount(),client.getName(),client.getBalance());

        System.out.print("\nEnter a deposit value:");
        client.depositar(sc.nextDouble());

        System.out.println("Update account data: ");
        System.out.printf("Account: %d, Holder: %s, Balance:$ %.2f \n", client.getAccount(),client.getName(),client.getBalance());


        System.out.print("\nEnter a witdraw value:");
        client.sacar(sc.nextDouble());
        System.out.println("Update account data:");
        System.out.printf("Account: %d, Holder: %s, Balance:$ %.2f \n", client.getAccount(),client.getName(),client.getBalance());
        sc.close();*/




    }
}