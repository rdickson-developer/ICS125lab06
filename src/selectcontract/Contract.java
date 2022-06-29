/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package selectcontract;

/**
 *
 * @author ryandickson
 */
public class Contract {
    
    private String contractID;
    private String originCity;
    private String destCity;
    private String orderItem;
    
    // Constructor
    Contract(String contractID, String originCity, String destCity, String orderItem){
        
    }
    
    // Getters
    public String getContractID(){
        return contractID;
    }
    
    public String getOriginCity(){
        return originCity;
    }
    
    public String getDestCity(){
        return destCity;
    }
    public String getOrderItem(){
        return orderItem;
    }
}
