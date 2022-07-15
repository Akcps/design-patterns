package io.github.akcps.solid.dip.good;

public class IOC {
    public static void main(String[] args) {
        IOC container = new IOC();
        MySQL mySQL = container.new MySQL();
        Oracle oracle = container.new Oracle();
        User user = container.new User(oracle);
        user.add("This is some data.");
    }

    public class User {
        Database database;

        public User(Database database) {
            this.database = database;
        }

        public void add(String data) {
            this.database.persist(data);
        }
    }

    public interface Database {
        void persist(String data);
    }

    public class Oracle implements Database {
        public void persist(String data) {
            System.out.println("Data has been persisted to Oracle: " + data);
        }

    }

    public class MySQL implements Database {
        public void persist(String data) {
            System.out.println("Data has been persisted to MySQl: " + data);
        }

    }

}
