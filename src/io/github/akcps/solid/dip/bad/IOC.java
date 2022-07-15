package io.github.akcps.solid.dip.bad;

public class IOC {
    public static void main(String[] args) {
        IOC container = new IOC();
        User user = container.new User();
        user.add("This is some data.");
    }

    public class User {
        MySQL database;

        public User() {
            this.database = new MySQL();
        }

        public void add(String data) {
            this.database.persist(data);
        }
    }

    public class MySQL {
        public void persist(String data) {
            System.out.println("Data has been persisted to MySQl: " + data);
        }

    }

}
