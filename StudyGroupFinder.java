
package ac.za.cput;

import javax.swing.*;

/**
 * Group 1
 * Project 2
 * 
 */
public class StudyGroupFinder {
    
    private JComboBox groups;
    private JFrame frame;
    public StudyGroupFinder(){
    
        frame = new JFrame("Select a Group");
        frame.setSize(400,500);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        groups = new JComboBox();
        groups.addItem("Group 1");
        frame.add(groups);
        
        
        frame.setVisible(true);
    
    
    
    
    }
}
