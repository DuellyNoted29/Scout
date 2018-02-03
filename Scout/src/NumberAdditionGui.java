import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import javax.swing.JButton;
import javax.swing.JFileChooser;
import javax.swing.JSlider;
import static jdk.nashorn.internal.objects.NativeRegExp.source;

public class NumberAdditionGui extends javax.swing.JFrame {

    private int robotSelection = 0; // a number between 0 and 5

   
    private RobotData[] dataArray = new RobotData[] {
    
        new RobotData(), new RobotData(), new RobotData(),
        new RobotData(), new RobotData(), new RobotData()
    };
    private void Dtatatatata (){
        dataArray = new RobotData[] {
            new RobotData(), new RobotData(), new RobotData(),
            new RobotData(), new RobotData(), new RobotData()
        };
    }
        
    
  
    public NumberAdditionGui() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        TeamList = new javax.swing.JPanel();
        NewTeamName = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        NewTeamNumber = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        AddTeamButton = new javax.swing.JButton();
        jTextField1 = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jButton5 = new javax.swing.JButton();
        jButton6 = new javax.swing.JButton();
        PointPanel = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTextArea2 = new javax.swing.JTextArea();
        ScaleControl = new javax.swing.JCheckBox();
        AutoRp = new javax.swing.JCheckBox();
        AutoCross = new javax.swing.JCheckBox();
        AutoSwitch = new javax.swing.JCheckBox();
        AutoLabelName = new javax.swing.JLabel();
        PCubeAmount = new javax.swing.JSlider();
        CubeAmountLabel = new javax.swing.JLabel();
        BlocksDelivered = new javax.swing.JSlider();
        PCubeAmountLabel = new javax.swing.JLabel();
        AddTeam = new javax.swing.JButton();
        DeleteTeam = new javax.swing.JButton();
        jButton7 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMaximizedBounds(new java.awt.Rectangle(4000, 2400, 4000, 2400));
        setMinimumSize(new java.awt.Dimension(1000, 600));
        setName("Start Menu\n"); // NOI18N

        jLabel1.setText("Team Name");

        jLabel2.setText("Team Number");

        AddTeamButton.setText("Add");
        AddTeamButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                AddTTeam(evt);
            }
        });

        jLabel3.setText("Which Button");

        javax.swing.GroupLayout TeamListLayout = new javax.swing.GroupLayout(TeamList);
        TeamList.setLayout(TeamListLayout);
        TeamListLayout.setHorizontalGroup(
            TeamListLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(TeamListLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(TeamListLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(AddTeamButton, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(TeamListLayout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addGroup(TeamListLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(TeamListLayout.createSequentialGroup()
                                .addComponent(jLabel1)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(NewTeamName, javax.swing.GroupLayout.PREFERRED_SIZE, 139, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(TeamListLayout.createSequentialGroup()
                                .addGroup(TeamListLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel2)
                                    .addComponent(jLabel3))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(TeamListLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(jTextField1)
                                    .addComponent(NewTeamNumber, javax.swing.GroupLayout.DEFAULT_SIZE, 139, Short.MAX_VALUE))))))
                .addGap(439, 439, 439))
        );
        TeamListLayout.setVerticalGroup(
            TeamListLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, TeamListLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(TeamListLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(NewTeamName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1))
                .addGap(18, 18, 18)
                .addGroup(TeamListLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(NewTeamNumber, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2))
                .addGap(18, 18, 18)
                .addGroup(TeamListLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(AddTeamButton)
                .addGap(78, 78, 78))
        );

        jButton1.setText("jButton1");
        jButton1.setMaximumSize(new java.awt.Dimension(100, 50));
        jButton1.setMinimumSize(new java.awt.Dimension(100, 50));
        jButton1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                buttonOneClicked(evt);
            }
        });

        jButton2.setText("jButton1");
        jButton2.setMaximumSize(new java.awt.Dimension(100, 50));
        jButton2.setMinimumSize(new java.awt.Dimension(100, 50));
        jButton2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                buttonTwoClicked(evt);
            }
        });

        jButton3.setText("jButton1");
        jButton3.setMaximumSize(new java.awt.Dimension(100, 50));
        jButton3.setMinimumSize(new java.awt.Dimension(100, 50));
        jButton3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                buttonThreeClicked(evt);
            }
        });

        jButton4.setText("jButton1");
        jButton4.setMaximumSize(new java.awt.Dimension(100, 50));
        jButton4.setMinimumSize(new java.awt.Dimension(100, 50));
        jButton4.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                buttonFourClicked(evt);
            }
        });

        jButton5.setText("jButton1");
        jButton5.setMaximumSize(new java.awt.Dimension(100, 50));
        jButton5.setMinimumSize(new java.awt.Dimension(100, 50));
        jButton5.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                buttonFiveClicked(evt);
            }
        });

        jButton6.setText("jButton1");
        jButton6.setMaximumSize(new java.awt.Dimension(100, 50));
        jButton6.setMinimumSize(new java.awt.Dimension(100, 50));
        jButton6.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                buttonSixClicked(evt);
            }
        });

        jScrollPane2.setPreferredSize(new java.awt.Dimension(300, 300));

        jTextArea2.setColumns(20);
        jTextArea2.setRows(5);
        jScrollPane2.setViewportView(jTextArea2);

        ScaleControl.setText("Scale Control");

        AutoRp.setLabel("Auto RP");

        AutoCross.setLabel("Auto Cross");
        AutoCross.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AutoCrossActionPerformed(evt);
            }
        });

        AutoSwitch.setText("Auto Switch");

        AutoLabelName.setText("Auto Mode");

        PCubeAmount.setMaximum(9);
        PCubeAmount.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                sliderEventValueSeter(evt);
            }
        });

        BlocksDelivered.setMaximum(20);
        BlocksDelivered.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                sliderEventValueSeter(evt);
            }
        });

        javax.swing.GroupLayout PointPanelLayout = new javax.swing.GroupLayout(PointPanel);
        PointPanel.setLayout(PointPanelLayout);
        PointPanelLayout.setHorizontalGroup(
            PointPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 473, Short.MAX_VALUE)
            .addGroup(PointPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(PointPanelLayout.createSequentialGroup()
                    .addGap(64, 64, 64)
                    .addGroup(PointPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addGroup(PointPanelLayout.createSequentialGroup()
                            .addGap(26, 26, 26)
                            .addComponent(AutoLabelName))
                        .addGroup(PointPanelLayout.createSequentialGroup()
                            .addGroup(PointPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(ScaleControl)
                                .addComponent(AutoRp)
                                .addComponent(AutoSwitch)
                                .addComponent(AutoCross))
                            .addGap(18, 18, 18)
                            .addGroup(PointPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(CubeAmountLabel, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(PCubeAmountLabel, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addGroup(PointPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(BlocksDelivered, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(PCubeAmount, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 349, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addContainerGap(60, Short.MAX_VALUE)))
        );
        PointPanelLayout.setVerticalGroup(
            PointPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 470, Short.MAX_VALUE)
            .addGroup(PointPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(PointPanelLayout.createSequentialGroup()
                    .addGap(40, 40, 40)
                    .addComponent(AutoLabelName)
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                    .addGroup(PointPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(PointPanelLayout.createSequentialGroup()
                            .addComponent(ScaleControl)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(AutoRp)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(AutoCross)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(AutoSwitch))
                        .addGroup(PointPanelLayout.createSequentialGroup()
                            .addGroup(PointPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(BlocksDelivered, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(CubeAmountLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGap(18, 18, 18)
                            .addGroup(PointPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(PCubeAmountLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(PCubeAmount, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
        );

        AddTeam.setText("Save");
        AddTeam.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                savePressEvent(evt);
            }
        });

        DeleteTeam.setText("Load");
        DeleteTeam.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                loadPressEvent(evt);
            }
        });

        jButton7.setText("save all");
        jButton7.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                SaveAllTeams(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jButton5, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(TeamList, javax.swing.GroupLayout.PREFERRED_SIZE, 245, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                            .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                            .addComponent(jButton7))
                                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                            .addComponent(jButton4, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addGap(14, 14, 14)
                                            .addComponent(AddTeam, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(DeleteTeam, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(15, 15, 15)))
                        .addComponent(PointPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jButton6, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(472, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(40, 40, 40)
                                .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(TeamList, javax.swing.GroupLayout.PREFERRED_SIZE, 157, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(34, 34, 34)
                                .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jButton7)
                                .addGap(8, 8, 8)))
                        .addComponent(DeleteTeam)
                        .addGap(9, 9, 9)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jButton4, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(AddTeam))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jButton5, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(54, 54, 54))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(PointPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addComponent(jButton6, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(355, 355, 355))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void AutoCrossActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AutoCrossActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_AutoCrossActionPerformed

    private void sliderEventValueSeter(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_sliderEventValueSeter
        // TODO add your handling code here:
        JSlider slider = (JSlider) evt.getSource();
        int value = slider.getValue();
        
        if(BlocksDelivered != slider)
        {
            PCubeAmountLabel.setText("" + value);       
        }else{ 
            
            CubeAmountLabel.setText("" + value);           
        }
       
    }//GEN-LAST:event_sliderEventValueSeter

    private void savePressEvent(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_savePressEvent
        // TODO add your handling code here:
        saveData();
        
        JFileChooser chooser = new JFileChooser();
        chooser.showOpenDialog(this);
        File file = chooser.getSelectedFile();
        dataArray[robotSelection].save(file);
        System.out.println("Hello");
        
    }//GEN-LAST:event_savePressEvent

    private void saveData(){ // todo rename to update
        
        RobotData data = dataArray[robotSelection];
        
        
        data.setTeamNumber(Integer.parseInt(NewTeamNumber.getText()));
        
        data.setAutoCross(AutoCross.isSelected());
        data.setAutoScaleControl(ScaleControl.isSelected());
        data.setAutoRP(AutoRp.isSelected());
        data.setAutoSwitch(AutoSwitch.isSelected());
        data.setCubes(BlocksDelivered.getValue());
        data.setPCubes(PCubeAmount.getValue());
        
    }
    
    private void loadPressEvent(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_loadPressEvent
        // TODO add your handling code here:
        JFileChooser chooser = new JFileChooser();
        chooser.showOpenDialog(this);
        File file = chooser.getSelectedFile();
        RobotData data = null;
      
        try {
         FileInputStream fileIn = new FileInputStream(file);
         ObjectInputStream in = new ObjectInputStream(fileIn);
         data = (RobotData) in.readObject();
         in.close();
         fileIn.close();
      
        } catch (IOException i) {
         i.printStackTrace();
         return;
      
        } catch (ClassNotFoundException c) {
         System.out.println("Not found");
         c.printStackTrace();
         return;
      
        }
      
        dataArray[robotSelection] = data;
        loadData();
        System.out.println("Goodbye");
        
    }//GEN-LAST:event_loadPressEvent

    private void buttonOneClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_buttonOneClicked
        // TODO add your handling code here:
        saveData(); // save data for the current one
        robotSelection = 0;
        loadData();
        
    }//GEN-LAST:event_buttonOneClicked

    private void buttonTwoClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_buttonTwoClicked
        // TODO add your handling code here:
        saveData(); // save data for the current one
        robotSelection = 1;
        loadData();
        
    }//GEN-LAST:event_buttonTwoClicked

    private void buttonThreeClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_buttonThreeClicked
        // TODO add your handling code here:
        saveData(); // save data for the current one
        robotSelection = 2;
        loadData();
        
    }//GEN-LAST:event_buttonThreeClicked

    private void buttonFourClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_buttonFourClicked
        // TODO add your handling code here:
        saveData(); // save data for the current one
        robotSelection = 3;
        loadData();
        
    }//GEN-LAST:event_buttonFourClicked

    private void buttonFiveClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_buttonFiveClicked
        // TODO add your handling code here:
        saveData(); // save data for the current one
        robotSelection = 4;
        loadData();
        
    }//GEN-LAST:event_buttonFiveClicked

    private void buttonSixClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_buttonSixClicked
        // TODO add your handling code here:
        saveData(); // save data for the current one
        robotSelection = 5;
        loadData();
        
    }//GEN-LAST:event_buttonSixClicked

    private void AddTTeam(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_AddTTeam
        
        
        int number = dataArray[robotSelection].getTeamNumber();
        int BoxNumber = Integer.parseInt(jTextField1.getText());
        robotSelection = BoxNumber;
        
        
    }//GEN-LAST:event_AddTTeam

    private void SaveAllTeams(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_SaveAllTeams
        saveData();
    }//GEN-LAST:event_SaveAllTeams
    
    public void loadData(){
        
        RobotData data = dataArray[robotSelection];
        
      AutoCross.setSelected(data.isAutoCross());
      ScaleControl.setSelected(data.isAutoScaleControl());
      AutoRp.setSelected(data.isAutoRP());
      AutoSwitch.setSelected(data.isAutoSwitch());
      BlocksDelivered.setValue(data.getCubes());
      PCubeAmount.setValue(data.getPCubes());
        
    }

    public static void main(String args[]) {

        java.awt.EventQueue.invokeLater(new Runnable() {
            
            public void run() {new NumberAdditionGui().setVisible(true); }});
        
    }
            
            
            
   
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton AddTeam;
    private javax.swing.JButton AddTeamButton;
    private javax.swing.JCheckBox AutoCross;
    private javax.swing.JLabel AutoLabelName;
    private javax.swing.JCheckBox AutoRp;
    private javax.swing.JCheckBox AutoSwitch;
    private javax.swing.JSlider BlocksDelivered;
    private javax.swing.JLabel CubeAmountLabel;
    private javax.swing.JButton DeleteTeam;
    private javax.swing.JTextField NewTeamName;
    private javax.swing.JTextField NewTeamNumber;
    private javax.swing.JSlider PCubeAmount;
    private javax.swing.JLabel PCubeAmountLabel;
    private javax.swing.JPanel PointPanel;
    private javax.swing.JCheckBox ScaleControl;
    private javax.swing.JPanel TeamList;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButton6;
    private javax.swing.JButton jButton7;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTextArea jTextArea2;
    private javax.swing.JTextField jTextField1;
    // End of variables declaration//GEN-END:variables

}
