import java.sql.*;

class Main {
    public static void main(String args[]) {
        try {
            Class.forName("com.mysql.jdbc.Driver");
            // ------------------STEPS-------------------------
            // start apache and mysql in xampp
            // "localhost/phpmyadmin" in browser to add, modify database
            // create a database, replace "databaseName" with database name in the url
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/databaseName", "root", "");

            Statement stmt = con.createStatement();
            ResultSet rs = stmt.executeQuery("select * from emp");
            while (rs.next())
                System.out.println(rs.getInt(1) + "  " + rs.getString(2) + "  " + rs.getString(3));
            con.close();
        } catch (Exception e) {
            System.out.println(e);
        }
    }
}