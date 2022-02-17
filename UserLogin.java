import java.util.Scanner;

public class UserLogin {
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);
        String name = "Enes";
        String pass = "1327";
        String userName, password;

        System.out.print("Enter your username: ");
        userName = scanner.nextLine();

        System.out.print("Enter your password: ");
        password = scanner.nextLine();

        if(userName.equals(name) && password.equals(pass)){

                System.out.println("You are logged in");
        }else{
                System.out.println("Username or password is wrong");
                    if(!password.equals("1327")){

                        System.out.println("Forgot my password? ");
                        System.out.println("1-)Reset my password\n2-)Do not");
                        int newSelect = scanner.nextInt();


                        switch (newSelect) {
                            case 1:
                                     System.out.print("New password : ");
                                     scanner.next();
                                     String newPassword = scanner.nextLine();

                                if ((newPassword.equals(pass))) {
                                    System.out.println("Your new password cannot be the same as the old one");
                                    break;
                                }else {
                                    System.out.println("Your password has been created");
                                }
                                    break;

                            case 2:
                                    System.out.println("Have a nice day :)");
                                    break;
            }
                     }

        }
    }
}
