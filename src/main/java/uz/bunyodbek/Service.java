package uz.bunyodbek;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Service {

    Scanner scannerInt = new Scanner(System.in);
    Scanner scannerString = new Scanner(System.in);

    List<User> userList = new ArrayList<>();

    int javoblar=0;

    public void mainMethod() {

        System.out.println("""
                1.User
                2.Admin
                """);
        int tanlash = scannerInt.nextInt();
        switch (tanlash) {
            case 1 -> {
                usermenu();
            }
            case 2 ->{
                adminmenu();
            }
        }


    }

    private void adminmenu() {
        System.out.println("""
                1.Java IT
                2.Matematika
                3.English
                """);

        int admintanlash=scannerInt.nextInt();
        switch (admintanlash){
            case 1 ->{
                System.out.println(" 1. Savol \n" +
                         "OOP nechta qismdan iborat?  A) 4 ta B) 2 ta C) 6 ta D) 1 ta");
                String javob1=scannerString.nextLine();
                if (javob1.equals("A")){
                    System.out.println(" Javob to'g'ri");
                    javoblar+=20;
                } else {
                    System.out.println(" Noto'g'ri");
                }
                System.out.println(" 2. Savol \n "
                + " Abstract class  ichida nechta usulda method yoziladi A) 1 ta B) 2 ta C) 3 ta D) 0 ta");
                String javob2=scannerString.nextLine();
                if (javob2.equals("B")){
                    System.out.println(" Javob to'g'ri");
                    javoblar+=20;
                }else {
                    System.out.println(" Noto'g'ri");
                }
                System.out.println(" Umumiy natija = " + javoblar);
            }
        }
    }

    private void usermenu() {

        System.out.println("""
                                
                1.SignUp
                2.SignIn
                """);

        int kirit = scannerInt.nextInt();

        switch (kirit) {
            case 1 -> {
                System.out.println(" Enter id");
                int userId = scannerInt.nextInt();

                System.out.println(" Enter name");
                String name = scannerString.nextLine();

                System.out.println(" Enter username");
                String username = scannerString.nextLine();

                System.out.println("Enter email");
                String useremail = scannerString.nextLine();

                System.out.println(" Enter password ");
                String userpassword = scannerString.nextLine();

                User user = new User(userId, name, username, useremail, userpassword);
                userList.add(user);
                System.out.println(" User saqlandi");
            }

            case 2 -> {

                System.out.println(" Enter email");
                String emailSignIn = scannerString.nextLine();

                System.out.println(" Enter password ");
                String passwordsignIn = scannerString.nextLine();

                for (User use : userList) {
                    if (use.getEmail().equals(emailSignIn) && use.getPassword().equals(passwordsignIn)) {
                        kirish();
                    }
                }
            }
        }
    }

    private void kirish() {


    }


}
