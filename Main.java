package aula.jdbc;

public class Main {

    public static void main(String[] args) {
        try {
            String driverName = "com.mysql.cj.jdbc.Driver"; // New driver class name

            Class.forName(driverName);

            System.out.println("Driver loaded successfully");
        } catch (Exception ex) {
            System.out.println(ex);
        }
    }
}

