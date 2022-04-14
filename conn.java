
import java.sql.*;  

public class conn{
    Connection c;
    Statement s;
    public conn(){  
        try{  
              
        	Class.forName("com.mysql.cj.jdbc.Driver");
               
            c =DriverManager.getConnection("jdbc:mysql://127.0.0.1:3306/library_management_system","root","arpm129AC");  
            s =c.createStatement();  
            
           
        }catch(Exception e){ 
            System.out.println(e);
        }  
    }  
}  