/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package common;

import java.io.File;
import javax.swing.JOptionPane;
import jdk.nashorn.internal.scripts.JO;
import dao.PharmacyUtils;


/**
 *
 * @author Shipra
 */
public class OpenPdf {
    public static void openById(String id){
        try{
          if((new File(PharmacyUtils.billPath+id+".pdf")).exists()){
          Process p = Runtime
                  .getRuntime()
                  .exec("rundll32 url.dll, FileProtocolHandler "+PharmacyUtils.billPath+""+id+".pdf");
          }
          else{
              JOptionPane.showMessageDialog(null, "File does not exist.");
          }
        }
        catch(Exception e){
            JOptionPane.showMessageDialog(null, e);
        }
    }

    private static void exec(String string) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
