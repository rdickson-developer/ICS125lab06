/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package selectcontract;

/**
 *
 * @author ryandickson
 */
public class SelectContract {

    /**
     * @param args the command line arguments
     */
    
    public static void main(String[] args) {
        
        String a = "abc";
        String b = new String ("abc");
        System.out.println(a==b);
        
        
        
        ContractView theView = new ContractView();
        ContractModel theModel = new ContractModel();
        ContractController theController;
        theController = new ContractController(theView, theModel);
        theView.setVisible(true);
    }
    
}
