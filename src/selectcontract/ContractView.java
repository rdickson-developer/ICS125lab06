package selectcontract;

import java.awt.event.ActionListener;
import java.awt.event.ItemListener;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JOptionPane;

public class ContractView extends javax.swing.JFrame {

    /*
     * Creates new form ContractView
     */
    public ContractView() {
        initComponents();
    }

    /*
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        jComboOriginCity = new javax.swing.JComboBox<>();
        jPanel2 = new javax.swing.JPanel();
        jPrevButton = new javax.swing.JButton();
        jBidButton = new javax.swing.JButton();
        jNextButton = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabelOrderItem = new javax.swing.JLabel();
        jLabelDestCity = new javax.swing.JLabel();
        jLabelOriginCity = new javax.swing.JLabel();
        jLabelContractID = new javax.swing.JLabel();
        jLabelContractCount = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Bid on Contracts");
        setSize(new java.awt.Dimension(700, 500));

        jLabel5.setText("Filter by Origin:");

        jComboOriginCity.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(39, 39, 39)
                .addComponent(jLabel5)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jComboOriginCity, javax.swing.GroupLayout.PREFERRED_SIZE, 156, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(49, 49, 49))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(36, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(jComboOriginCity, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(23, 23, 23))
        );

        jPanel2.setBackground(java.awt.Color.cyan);

        jPrevButton.setText("Previous");

        jBidButton.setText("Bid");

        jNextButton.setText("Next");

        jLabel1.setForeground(java.awt.Color.black);
        jLabel1.setText("Contract ID:");

        jLabel2.setForeground(java.awt.Color.black);
        jLabel2.setText("Origin:");

        jLabel3.setForeground(java.awt.Color.black);
        jLabel3.setText("Destination:");

        jLabel4.setForeground(java.awt.Color.black);
        jLabel4.setText("Order:");

        jLabelOrderItem.setForeground(java.awt.Color.black);
        jLabelOrderItem.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabelOrderItem.setText("jLabel5");

        jLabelDestCity.setForeground(java.awt.Color.black);
        jLabelDestCity.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabelDestCity.setText("jLabel6");

        jLabelOriginCity.setForeground(java.awt.Color.black);
        jLabelOriginCity.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabelOriginCity.setText("jLabel7");

        jLabelContractID.setForeground(java.awt.Color.black);
        jLabelContractID.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabelContractID.setText("jLabel8");

        jLabelContractCount.setForeground(java.awt.Color.black);
        jLabelContractCount.setText("n out of x Contracts");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(38, 38, 38)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabelContractCount)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1)
                            .addComponent(jLabel2)
                            .addComponent(jLabel3)
                            .addComponent(jLabel4))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 81, Short.MAX_VALUE)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(jPrevButton)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jBidButton)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jNextButton))
                            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jLabelOriginCity, javax.swing.GroupLayout.PREFERRED_SIZE, 124, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jLabelDestCity, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 124, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jLabelOrderItem, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 124, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jLabelContractID, javax.swing.GroupLayout.PREFERRED_SIZE, 124, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(55, 55, 55))))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addGap(38, 38, 38)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(jLabelContractID))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 33, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(jLabelOriginCity))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(jLabelDestCity))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(jLabelOrderItem))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jPrevButton)
                    .addComponent(jBidButton)
                    .addComponent(jNextButton))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabelContractCount, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(34, 34, 34))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(34, 34, 34)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(19, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    void addPrevListener(ActionListener listenForPrevButton){
        jPrevButton.addActionListener(listenForPrevButton);
    }
    void addNextListener(ActionListener listenForNextButton){
        jNextButton.addActionListener(listenForNextButton);
    }
    void addBidListener(ActionListener listenForBidButton){
        jBidButton.addActionListener(listenForBidButton);
    }
    
    void addComboBoxListener(ItemListener listenForComboBox){
        jComboOriginCity.addItemListener(listenForComboBox);
    }
    
    void displayErrorMessage(String errorMessage){
        JOptionPane.showMessageDialog(this, errorMessage);
    }
    
    void setContractID(String contractID){
        jLabelContractID.setText(contractID);
    }
    void setOriginCity(String originCity){
        jLabelOriginCity.setText(originCity);
        
    }
    void setDestCity(String destCity){
        jLabelDestCity.setText(destCity);
    }
    void setOrderItem(String orderItem){
        jLabelOrderItem.setText(orderItem);
    }
    void setContractCount(String contractCount){
        jLabelContractCount.setText(contractCount);
    }
    void setOriginCityList(String[] cityList){
        final DefaultComboBoxModel model = new DefaultComboBoxModel(cityList);
        this.jComboOriginCity.setModel(model);
    }
    
    // Update number of contracts text on JPanel
    void updateContractViewPanel(int currentContractNum, int contractCount){
        setContractCount((1+currentContractNum) + " of " + contractCount + " contracts.");
        
        if(currentContractNum == 0){
            jPrevButton.setEnabled(false);
        } else {
            jPrevButton.setEnabled(true);
        }
        if(currentContractNum == contractCount - 1){
            jNextButton.setEnabled(false);
        }else {
            jNextButton.setEnabled(true);
        }
    
    
    }
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jBidButton;
    private javax.swing.JComboBox<String> jComboOriginCity;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabelContractCount;
    private javax.swing.JLabel jLabelContractID;
    private javax.swing.JLabel jLabelDestCity;
    private javax.swing.JLabel jLabelOrderItem;
    private javax.swing.JLabel jLabelOriginCity;
    private javax.swing.JButton jNextButton;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JButton jPrevButton;
    // End of variables declaration//GEN-END:variables
}
