package pt.ipleira.estg.qwartus;

/**
 * Created by USER on 29/12/2016.
 */

public class LoginClassSave {
    public static Boolean login = false;
    public static String token;
    public static Account account;
    public static int numAnun;

    /*@JsonCreator
    public ClassSave(@JsonProperty("token") String token, @JsonProperty("account") Account account){
        this.token = token;
        this.account = account;
    }*/

    public LoginClassSave(Boolean login, String token, Account account, int numAnun) {
        this.login = login;
        this.token = token;
        this.account = account;
        this.numAnun = numAnun;
    }

    public static final class Account {
        public static long id;
        public static String username;
        public static String email;

        /*@JsonCreator
        public Account(@JsonProperty("id") long id, @JsonProperty("username") String username, @JsonProperty("email") String email){
            this.id = id;
            this.username = username;
            this.email = email;
        }*/

        public Account(long id, String username, String email) {
            this.id = id;
            this.username = username;
            this.email = email;
        }
    }
}
