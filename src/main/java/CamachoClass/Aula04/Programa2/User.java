package CamachoClass.Aula04.Programa2;

import java.util.List;

public class User {
    private String name;
    private List<Account> accounts;

    public User(String name, List<Account> accounts) {
        this.name = name;
        this.accounts = accounts;
    }

    public String getName() {
        return name;
    }

    public List<Account> getAccounts() {
        return accounts;
    }
}
