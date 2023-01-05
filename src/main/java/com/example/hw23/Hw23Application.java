package com.example.hw23;

import com.example.hw23.models.Product;
import com.example.hw23.services.Cart;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.event.ApplicationReadyEvent;
import org.springframework.context.event.EventListener;

import java.util.Scanner;


@SpringBootApplication
public class Hw23Application {

    @Autowired
    private Cart cart;

    public static void main(String[] args) {
        SpringApplication.run(Hw23Application.class, args);

    }

    @EventListener(ApplicationReadyEvent.class)
    public void started() {
        Scanner sc = new Scanner(System.in);
        int commandID = 1;

        while (commandID != 0) {
            System.out.println("1 - add to repo");
            System.out.println("2 - delete from repo");
            System.out.println("3 - show all");
            System.out.println("4 - show by id");
            System.out.println("0 - exit");
            commandID = sc.nextInt();
            switch (commandID) {
                case 1:
                    addToRepo(cart);
                    break;
                case 2:
                    deleteFromRepo(cart);
                    break;
                case 3:
                    cart.showAll();
                    break;
                case 4:
                    showByID(cart);
                    break;
                default:
                    System.out.println("Unknow command");
                    break;
            }
        }

    }

    public static void addToRepo(Cart cart) {
        Scanner sc = new Scanner(System.in);
        int id;
        String name;
        double price;
        System.out.println("Enter product ID: ");
        id = sc.nextInt();
        System.out.println("Enter product price: ");
        price = sc.nextDouble();
        System.out.println("Enter product name: ");
        sc = new Scanner(System.in);
        name = sc.nextLine();


        cart.add(new Product(id, name, price));
    }

    public static void deleteFromRepo(Cart cart) {
        Scanner sc = new Scanner(System.in);
        int id;

        System.out.println("Enter product ID: ");
        id = sc.nextInt();

        cart.delete(id);
    }

    public static void showByID(Cart cart) {
        Scanner sc = new Scanner(System.in);
        int id;

        System.out.println("Enter product ID: ");
        id = sc.nextInt();
        cart.showByID(id);
    }
}
