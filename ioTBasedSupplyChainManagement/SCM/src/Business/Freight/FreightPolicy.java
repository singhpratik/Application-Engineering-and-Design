/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Freight;

import java.io.File;

/**
 *
 * @author Pratik Singh <pratiksingh>
 */
public class FreightPolicy extends javax.swing.filechooser.FileFilter{

    @Override
    public boolean accept(File file) {
        
        return file.isDirectory() || file.getAbsolutePath().endsWith(".txt");
            }

    @Override
    public String getDescription() {
    return "Text documents (*.txt)";  
    }
    
    
    
}
