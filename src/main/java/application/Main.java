package application;

import entities.Client;

import java.util.Locale;
import java.util.Scanner;
//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        Client client = new Client();


        System.out.println("Enter Account number: ");
        client.setAccount(sc.nextInt());

        System.out.println("Enter Account Holder: ");
        client.setName(sc.nextLine()) ;

        System.out.println("Is there na initial deposit (y/n)? ");
        String confirm = sc.nextLine();

      if (confirm == "y"){
                System.out.println("Enter initial deposit value: ");
                double deposit = sc.nextDouble();
                System.out.println("Account data: ");
               
        }







        sc.close();
    }
}