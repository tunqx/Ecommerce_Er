
package hair;


import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.JOptionPane;


public class Hair {

    public static void main(String[] args) throws SQLException  {
        
        Connection connect =   null;
        Statement s =null;
        try {
            Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
            connect = DriverManager.getConnection("jdbc:sqlserver://localhost;databaseName=RumRuay_Beauty;user=sa;password=19082012");
	    s = connect.createStatement();
            String sql = "SELECT * FROM ProductType";
            ResultSet result = s.executeQuery(sql);
            if(connect != null){
              System.out.print("DataBase Connected.");
          }else{
                System.out.print("DataBase Connect Failed.");
//                Log.e("aaa","aaa"+connect);
           }   


	}catch(Exception e){
            e.printStackTrace();

        }
        try{
          connect.close();
        }catch (SQLException e){
           e.printStackTrace();
        }
    }

}