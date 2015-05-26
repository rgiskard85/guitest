/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tabbedpane;

import java.awt.GridLayout;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTabbedPane;
import javax.swing.JTextField;

/**
 *
 * @author Dionysios-Charalampos Vythoulkas <dcvythoulkas@gmail.com>
 */
public class Tabbedpane {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        JTabbedPane tabbedJPane = new JTabbedPane();
        
        
        
        // Create a user-friendly form
        JLabel jlbl_name_gr = new JLabel("Όνομα:");
        JTextField jtxt_name_gr = new JTextField(10);

        JLabel jlbl_lname_gr = new JLabel("Επώνυμο:");
        JTextField jtxt_lname_gr = new JTextField();

        JLabel jlbl_name = new JLabel("Όνομα (για αναζήτηση):");
        JTextField jtxt_name = new JTextField();

        JLabel jlbl_lname = new JLabel("Επώνυμο (για αναζήτηση):");
        JTextField jtxt_lname = new JTextField();

        JLabel jlbl_email = new JLabel("Διεύθυνση Ηλ. Ταχυδρομείου:");
        JTextField jtxt_email = new JTextField();
        
        
        
        //JPanel jPanel1 = new JPanel();
        NewEntryForm jPanel1 = new NewEntryForm();
        //GridLayout gridLayout = new GridLayout(5, 2);        
        //jPanel1.setLayout(gridLayout);
        jPanel1.add(jlbl_name_gr);
        jPanel1.add(jtxt_name_gr);
        jPanel1.add(jlbl_lname_gr);
        jPanel1.add(jtxt_lname_gr);
        jPanel1.add(jlbl_name);
        jPanel1.add(jtxt_name);
        jPanel1.add(jlbl_lname);
        jPanel1.add(jtxt_lname);
        jPanel1.add(jlbl_email);
        jPanel1.add(jtxt_email);
        //jPanel1.add(new JLabel("Panel1"));
        tabbedJPane.addTab("Εισαγωγή", jPanel1);
                
        JPanel jPanel2 = new JPanel();
        jPanel2.add(new JLabel("Panel2"));
        tabbedJPane.addTab("Ενημέρωση", jPanel2);
        
        tabbedJPane.setTabPlacement(JTabbedPane.LEFT);
        
        JFrame jFrame = new JFrame();
        jFrame.add(tabbedJPane);
        
        jFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        jFrame.setSize(500, 300);
        jFrame.setVisible(true);
    }
    
}
