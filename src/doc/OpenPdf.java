/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package doc;

import javax.swing.JOptionPane;
import DbConnection.ProductUtils;
import java.io.File;
import java.lang.Runtime;
/**
 *
 * @author ksama
 */
public class OpenPdf {
    public static void openById(String id){
        try{
            if((new File(ProductUtils.billPath+id+".pdf")).exists()){
                Process p = Runtime
                        .getRuntime()
                        .exec("rundll32 url.dll, FileProtocolHandler "+ProductUtils.billPath+" "+id+".pdf");
            }else{
                JOptionPane.showMessageDialog( null, "File is not Exists.");
            }
            
        }catch(Exception e){
            JOptionPane.showMessageDialog( null, e);
        }
    }
}
