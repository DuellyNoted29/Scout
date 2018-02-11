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
    
    private File directory = new File("./Team Data");
    
    private void Datatatatata (){
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
        jLabel1 = new javax.swing.JLabel();
        NewTeamNamber = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        NewTeamNam = new javax.swing.JTextField();
        DeleteTeam1 = new javax.swing.JButton();
        matchId = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jButton5 = new javax.swing.JButton();
        jButton6 = new javax.swing.JButton();
        PointPanel = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        robotInfo = new javax.swing.JTextArea();
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
        jButton4 = new javax.swing.JButton();
        jButton8 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMaximizedBounds(new java.awt.Rectangle(4000, 2400, 4000, 2400));
        setMinimumSize(new java.awt.Dimension(1000, 600));
        setName("Start Menu\n"); // NOI18N

        jLabel1.setText("Team Name");

        jLabel2.setText("Team Number");

        DeleteTeam1.setText("Choose Directory");
        DeleteTeam1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                chooseDirectory(evt);
            }
        });

        jLabel3.setText("Match Id");

        javax.swing.GroupLayout TeamListLayout = new javax.swing.GroupLayout(TeamList);
        TeamList.setLayout(TeamListLayout);
        TeamListLayout.setHorizontalGroup(
            TeamListLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(TeamListLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(TeamListLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(TeamListLayout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(NewTeamNamber, javax.swing.GroupLayout.PREFERRED_SIZE, 139, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(TeamListLayout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(NewTeamNam, javax.swing.GroupLayout.PREFERRED_SIZE, 139, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(439, 439, 439))
            .addGroup(TeamListLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(TeamListLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(DeleteTeam1)
                    .addGroup(TeamListLayout.createSequentialGroup()
                        .addComponent(jLabel3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(matchId)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        TeamListLayout.setVerticalGroup(
            TeamListLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, TeamListLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(TeamListLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(NewTeamNam, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(TeamListLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(NewTeamNamber, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(DeleteTeam1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(TeamListLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(matchId, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3))
                .addGap(130, 130, 130))
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

        robotInfo.setColumns(20);
        robotInfo.setRows(5);
        jScrollPane2.setViewportView(robotInfo);

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
            .addGap(0, 423, Short.MAX_VALUE)
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
                    .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
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

        jButton4.setText("jButton1");
        jButton4.setMaximumSize(new java.awt.Dimension(100, 50));
        jButton4.setMinimumSize(new java.awt.Dimension(100, 50));
        jButton4.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                buttonFourClicked(evt);
            }
        });

        jButton8.setText("Save New Team");

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
                                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 17, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jButton4, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jButton6, javax.swing.GroupLayout.PREFERRED_SIZE, 17, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jButton5, javax.swing.GroupLayout.PREFERRED_SIZE, 17, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addComponent(DeleteTeam, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(AddTeam, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 69, Short.MAX_VALUE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(TeamList, javax.swing.GroupLayout.PREFERRED_SIZE, 245, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jButton8)
                        .addGap(4, 4, 4)
                        .addComponent(jButton7)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(PointPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(547, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(PointPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(TeamList, javax.swing.GroupLayout.PREFERRED_SIZE, 157, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jButton4, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jButton6, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jButton5, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(35, 35, 35)
                                .addComponent(AddTeam)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(DeleteTeam)))
                        .addGap(133, 133, 133)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jButton7)
                            .addComponent(jButton8))))
                .addContainerGap(411, Short.MAX_VALUE))
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
        
        RobotData currentData = dataArray[robotSelection];
        File file = getCurrentSaveSpot(currentData);
        currentData.save(file);
        System.out.println("Hello");
        
    }//GEN-LAST:event_savePressEvent

    private void saveData(){ // todo rename to update
        
        RobotData data = dataArray[robotSelection];
        
        data.setTeamNam(NewTeamNam.getText());
        data.setTeamNamber(Integer.parseInt(NewTeamNamber.getText()));
        data.setInfo(robotInfo.getText());
        data.setMatchId(Integer.parseInt(matchId.getText()));       
        data.setAutoCross(AutoCross.isSelected());
        data.setAutoScaleControl(ScaleControl.isSelected());
        data.setAutoRP(AutoRp.isSelected());
        data.setAutoSwitch(AutoSwitch.isSelected());
        data.setCubes(BlocksDelivered.getValue());
        data.setPCubes(PCubeAmount.getValue());
        
    }
    private File getCurrentSaveSpot(RobotData currentData){
        return new File(this.directory, "" + currentData.getTeamNamber() + "/" + currentData.getMatchId() + ".dat");
    }
    
    private void loadPressEvent(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_loadPressEvent
        // TODO add your handling code here:
        saveData();
        
        RobotData data = null;
      
        try {
            RobotData currentData = dataArray[robotSelection];
         FileInputStream fileIn = new FileInputStream(getCurrentSaveSpot(currentData));
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

    private void buttonOneClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_buttonOneClicked
        // TODO add your handling code here:
        saveData(); // save data for the current one
        robotSelection = 0;
        loadData();

    }//GEN-LAST:event_buttonOneClicked

    private void chooseDirectory(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_chooseDirectory
         
        JFileChooser chooser = new JFileChooser(this.directory.getParentFile());
        chooser.showOpenDialog(this);
        this.directory = chooser.getSelectedFile();
        if(!this.directory.isDirectory()){
            throw new RuntimeException("Why would you do othis? Please choose a directory next time. I'm crashing your program");
        }
        
        
    }//GEN-LAST:event_chooseDirectory

    public void loadData(){
        
        RobotData data = dataArray[robotSelection];
        
      AutoCross.setSelected(data.isAutoCross());
      ScaleControl.setSelected(data.isAutoScaleControl());
      AutoRp.setSelected(data.isAutoRP());
      AutoSwitch.setSelected(data.isAutoSwitch());
      BlocksDelivered.setValue(data.getCubes());
      PCubeAmount.setValue(data.getPCubes());
      NewTeamNam.setText(data.getTeamNam());
      NewTeamNamber.setText("" + data.getTeamNamber());
      robotInfo.setText(data.getinfo());
      matchId.setText("" + data.getMatchId());
     
      
      
    }

    public static void main(String args[]) {

        java.awt.EventQueue.invokeLater(new Runnable() {
            
            public void run() {new NumberAdditionGui().setVisible(true); }});
        
    }
            
            
            
   
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton AddTeam;
    private javax.swing.JCheckBox AutoCross;
    private javax.swing.JLabel AutoLabelName;
    private javax.swing.JCheckBox AutoRp;
    private javax.swing.JCheckBox AutoSwitch;
    private javax.swing.JSlider BlocksDelivered;
    private javax.swing.JLabel CubeAmountLabel;
    private javax.swing.JButton DeleteTeam;
    private javax.swing.JButton DeleteTeam1;
    private javax.swing.JTextField NewTeamNam;
    private javax.swing.JTextField NewTeamNamber;
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
    private javax.swing.JButton jButton8;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTextField matchId;
    private javax.swing.JTextArea robotInfo;
    // End of variables declaration//GEN-END:variables

}
