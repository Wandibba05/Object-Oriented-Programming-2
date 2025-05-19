public class MainApplication {

    public static void main(String[] args) {

        Admin curAdmin = new Admin(189987, "Wandibba", "Wandibba@123");

        User curUser = new User(20231, "Emmanuel");

        curAdmin.performOperation(new Update()); // Admin Updates the data.

        curUser.performOperation(new View()); // User can view the data.


    }

}
