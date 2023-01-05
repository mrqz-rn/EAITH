
package hangman2;
import java.io.File;
import java.io.InputStream;
import java.nio.file.Files;
import java.nio.file.StandardCopyOption;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;
public class main1 {
    public static void main(String[] args) {
      try{
            String DBdir = "c:/Hangman DATABASE/";
            File f1 = new File(DBdir);
            if(!f1.exists()){
                f1.mkdir();
            }
            String DB_name = "GameDatabase.accdb";
            String DB_path = DBdir + "/" + DB_name;
            File f2 = new File(DB_path);
            if(!f2.exists()){
                InputStream iStream = main1.class.getResourceAsStream("database/"+DB_name);
                Files.copy(iStream, f2.toPath(), StandardCopyOption.REPLACE_EXISTING);
            }
            Connection con1=DriverManager.getConnection("jdbc:ucanaccess://" + DB_path);
            Statement st1 = con1.createStatement();
            System.out.println("DATABASE CONNECTED!");
            new loginFrame().setVisible(true);
        }catch(Exception e){
            System.out.println(e);
        }
    }
}
