import java.sql.*;

class Main {
    public static void main(String args[]) {
        String url="jdbc:mysql://sql12.freesqldatabase.com:3306/sql12579100", 
        password="xyScnZuvUQ", username="sql12579100";
        try {
            Class.forName("com.mysql.jdbc.Driver");
           
            Connection con = DriverManager.getConnection(url, username, password);

            Statement stmt = con.createStatement();
            ResultSet rs = stmt.executeQuery("select * from test");//test-table name
            while (rs.next())
                System.out.println(rs.getInt(1) + "  " + rs.getString(2) + "  " + rs.getString(3));
            con.close();
        } catch (Exception e) {
            System.out.println(e);
        }
    }
}