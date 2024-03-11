import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class LoginSystem {
    private List<Login> logins = new ArrayList<>();

    public void fillLogins() {
        while (true) {
            System.out.println("Введите логин: ");
            Scanner scanner = new Scanner(System.in);
            String loginStr = scanner.nextLine();
            if (loginStr.equals("")) {
                logins.stream().filter(l -> l.getLogin().startsWith("f")).forEach(System.out::println);
                break;
            }
            logins.add(new Login(loginStr));
        }
    }

    public static class Login {
        private String login;

        public Login(String login) {
            this.login = login;
        }

        public String getLogin() {
            return login;
        }

        public String toString() {
            return "[ " + login + " ]";
        }
    }
}
