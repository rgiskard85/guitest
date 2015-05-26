/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tabbedpane;

import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

/**
 *
 * @author Dionysios-Charalampos Vythoulkas <dcvythoulkas@gmail.com>
 */
public class NewEntryForm extends JPanel {
    // Variables to get Entries
    private String name_gr;
    private String lname_gr;
    private String name;
    private String lname;
    private String email;
    
    // Create a user-friendly form
    JLabel jlbl_name_gr = new JLabel("Όνομα:");
    JTextField jtxt_name_gr = new JTextField();
    
    JLabel jlbl_lname_gr = new JLabel("Επώνυμο:");
    JTextField jtxt_lname_gr = new JTextField();
    
    JLabel jlbl_name = new JLabel("Όνομα (για αναζήτηση):");
    JTextField jtxt_name = new JTextField();
    
    JLabel jlbl_lname = new JLabel("Επώνυμο (για αναζήτηση):");
    JTextField jtxt_lname = new JTextField();
    
    JLabel jlbl_email = new JLabel("Διεύθυνση Ηλ. Ταχυδρομείου:");
    JTextField jtxt_email = new JTextField();
    
    public void NewEntryForm() {
        
        add(jlbl_name_gr);
        add(jtxt_name_gr);
        add(jlbl_lname_gr);
        add(jtxt_lname_gr);
        add(jlbl_name);
        add(jtxt_name);
        add(jlbl_lname);
        add(jtxt_lname);
        add(jlbl_email);
        add(jtxt_email);
        
    }
}
