/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ski.rental.system;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
/**
 *
 * @author Kosty
 */
public class Loginverification {
private Scanner x;
    String username = "";
    String password = "";
    String filepath = "member.txt";
    private enum Userrole {admin, manager, incorrect};
    public Userrole userrole;

    
    public Userrole verifylogin(String username, String password)
    {
        String tempUser = "";
        String tempPass = "";
        String tempRole = "";
        String tempstatus = "";
        String temprealname = "";
        String tempemail = "";
        String tempcontact = "";
        String tempid = "";
        
            try
            {
            x = new Scanner(new File("member.txt"));
            x.useDelimiter("[,\n]");
            }
            catch(FileNotFoundException e)
            {
                System.out.println("can't find");
            }
            catch(Exception e2)
            {
                JLabel label = new JLabel("unexpected error");
                JOptionPane.showMessageDialog(null,label,"Error",JOptionPane.ERROR_MESSAGE);
            } 
            try{
                
            
            while (x.hasNext())
            {
                tempid = x.next();
                tempUser = x.next();
                tempPass = x.next();
                tempRole = x.next();
                tempstatus = x.next();
                temprealname = x.next();
                tempemail = x.next();
                tempcontact = x.next();
                
                if(tempUser.trim().equals(username.trim()) 
                        && tempPass.trim().equals(password.trim()) 
                        && tempRole.contains("admin"))
                {
                    userrole =  Userrole.admin;
                    break;
                    
                } else if (tempUser.trim().equals(username.trim()) 
                        && tempPass.trim().equals(password.trim()) 
                        && tempRole.contains("manager"))
                {
                    userrole = Userrole.manager;
                    break;
                   
                } else
                {
                     userrole = Userrole.incorrect;
                }
            }
            }
            catch(Exception e3)
            {
                JLabel label = new JLabel("Cannot read");
                JOptionPane.showMessageDialog(null,label,"Error",JOptionPane.ERROR_MESSAGE);
            }
            return userrole;
            
            
    }
    
}
