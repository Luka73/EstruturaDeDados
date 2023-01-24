package CamachoClass.Aula04.Programa2;

import java.util.List;
import java.util.stream.Collectors;

public class Programa2 {
    public static void main(String[] args) {
        Account ac1 = new Account("1");
        Account ac2 = new Account("2");
        Account ac3 = new Account("3");
        Account ac4 = new Account("4");
        Account ac5 = new Account("5");
        Account ac6 = new Account("6");

        List<Account> accountsLuana = List.of(ac1, ac2);
        List<Account> accountsFernando = List.of(ac2, ac3);
        List<Account> accountsGabriel = List.of(ac4, ac5, ac6);


        User u1 = new User("Luana", accountsLuana);
        User u2 = new User("Fernando", accountsFernando);
        User u3 = new User("Gabriel", accountsGabriel);

        List<User> users = List.of(u1, u2, u3);

        System.out.println("Names : " + allNames(users));
        System.out.println("Account Ids : " + allAccountsIds(users));
        System.out.println("Total accounts " + totalAccounts(users));
    }

    private static List<String> allNames(List<User> users) {
        return users.stream()
                .map(User::getName)
                .collect(Collectors.toList());
    }

    private static List<String> allAccountsIds(List<User> users) {
        return users.stream()
                .flatMap(u -> u.getAccounts().stream())
                .map(Account::getId).collect(Collectors.toList());
    }

    private static long totalAccounts(List<User> users) {
        return users.stream()
                .mapToLong(u -> u.getAccounts().size())
                .sum();
    }
}
