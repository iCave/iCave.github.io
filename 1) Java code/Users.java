import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.io.Writer;
import static java.lang.System.out;
import java.net.URL;
import java.util.*;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

public class Users {
    int id;
    String name;
    int access_lvl;
    
    ArrayList<String> users= new ArrayList<String>();
    ArrayList<String> passwords= new ArrayList<String>();
    
    
    public ArrayList<String> getUsers(){
        return users;
    }
    
    public void loadUsers() throws FileNotFoundException, IOException{
      URL path = Users.class.getResource("users.txt");
      File file = new File(path.getFile()); 
      BufferedReader br = new BufferedReader(new FileReader(file)); 
      String st; 
        while ((st = br.readLine()) != null) 
            users.add(st); 
    } 

    
    
    
    public void loadPasswords() throws FileNotFoundException, IOException{
      URL path = Users.class.getResource("passwords.txt");
      File file = new File(path.getFile()); 
      BufferedReader br = new BufferedReader(new FileReader(file)); 
      String st; 
        while ((st = br.readLine()) != null) 
            passwords.add(st); 
    }
    
        public ArrayList<String> getPasswords(){
        return passwords;
    }
        
    public void addUser(String newUser, String password) throws FileNotFoundException, IOException {
        

    for (String temp : users){
        if(temp.equals(newUser))
           JOptionPane.showInputDialog("Username already in use, try again.");
    }
   
           users.add(newUser);
           passwords.add(password);
           //Save new user to users file
           File users = new File("src/users.txt");
           PrintWriter pwUsr = new PrintWriter(new FileOutputStream(users,true));
           pwUsr.println(newUser);
           pwUsr.close();
           //Save new password
           PrintWriter pwPass = new PrintWriter(new FileOutputStream("src/passwords.txt",true));
           pwPass.println(password);
           pwPass.close();

           
       }
    

        public void createAnnouncement(){
            String anc = JOptionPane.showInputDialog("Please compose your announcement");
            
       try {
           PrintWriter anak = new PrintWriter(new FileOutputStream("src/Announcements.txt",true));
           anak.println(anc);
           anak.close();
       } catch (FileNotFoundException ex) {
           Logger.getLogger(Users.class.getName()).log(Level.SEVERE, null, ex);
       }
        JOptionPane.showMessageDialog(null, anc + " Successfully saved to 'Announcements'");
        }

        public void createMessage(){
            String receiver = JOptionPane.showInputDialog("Select a contact: ");
            String msg = JOptionPane.showInputDialog("Message:");
        }
}
