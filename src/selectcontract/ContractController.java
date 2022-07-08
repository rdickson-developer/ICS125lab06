/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package selectcontract;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 *
 * @author ryandickson
 */
class ContractController {
    
    private ContractView theView;
    private ContractModel theModel;

    ContractController(ContractView theView, ContractModel theModel) {
        this.theView = theView;
        this.theModel = theModel;
        
        this.theView.addPrevListener(new PrevButtonListener());
        this.theView.addBidListener(new BidButtonListener());
        this.theView.addNextListener(new NextButtonListener());

        setUpDisplay();
    }
    
    private void setUpDisplay(){
        try {
            if(theModel.foundContracts()){

                Contract c = theModel.getTheContract();
                
                theView.setContractID(c.getContractID());
                theView.setDestCity(c.getDestCity());
                theView.setOriginCity(c.getOriginCity());
                theView.setOrderItem(c.getOrderItem());
                
            } else {
                theView.setContractID("???");
                theView.setDestCity("???");
                theView.setOriginCity("???");
                theView.setOrderItem("???");
            }
        } catch (Error ex){
            System.out.println(ex);
            theView.displayErrorMessage(
            "Error: There was a problem setting the contract.\n"
            + "             Contract number: " + theModel.getTheContract());
            
        }
        theView.updateContractViewPanel(theModel.getCurrentContractNum(),theModel.getContractCount());
    }
    
    class PrevButtonListener implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent e){
            // IF the currently dispaled contract is the first in the list
            // of contract, then you cannont view a non-existent contract 
            // behind it.
            if(theModel.getCurrentContractNum()== 0){
                return;
            }
            
            try {
                // Retrieve the contract behind the currently displayed contract.
                theModel.prevContract();
            } catch (Exception ex){
                System.out.println(ex);
                theView.displayErrorMessage(
                "Error: There is a problem setting a previous contract.");
            }
            setUpDisplay();
        }
    }
    
    class NextButtonListener implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent e){
            // IF the currently displayed contract is the last in the list
            // of contracts, then you cannont view a non-existent contract 
            // after it.
            if(theModel.getCurrentContractNum()== theModel.getContractCount()-1){
                return;
            }
            
            try {
                // Retrieve the contract ahead the currently displayed contract.
                theModel.nextContract();
            } catch (Exception ex){
                System.out.println(ex);
                theView.displayErrorMessage(
                "Error: There is a problem setting a next contract.");
            }
            setUpDisplay();
        }
    }
    
    class BidButtonListener implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent e){
            // IF the currently dispaled contract is the first in the list
            // of contract, then you cannont view a non-existent contract 
            // behind it.
            if(theModel.getCurrentContractNum()==0){
                return;
            }
            
            try {
                // Retrieve the contract behind the currently displayed contract.
                theModel.prevContract();
            } catch (Exception ex){
                System.out.println(ex);
                theView.displayErrorMessage(
                "Error: There is a problem setting a previous contract.");
            }
            setUpDisplay();
        }
    }
    
}
