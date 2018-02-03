
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.io.Serializable;

public class RobotData implements Serializable{
    
    private int teamNumber;
    private String teamName;
    
    
    
    
    
    private boolean didSomething;
    private boolean autoCross = false;
    private boolean autoScaleControl = false;
    private boolean autoRP = false;
    private boolean autoSwitch = false;
    private int Cubes = 0;
    private int PCubes = 0;

    
    
    
    
    public void setTeamNumber(int teamNumber){
        this.teamNumber = teamNumber;
    }
    public int getTeamNumber(){
        return teamNumber;
    }
    
    
    public void setTeamName(String teamName){
        this.teamName = teamName;
    }
    public String getTeamName(){
        return teamName;
    }
    
    public boolean isDidSomething() {
        return didSomething;
    }
    public void setDidSomething(boolean didSomething) {
        this.didSomething = didSomething;
    }

    public boolean isAutoCross() {
        return autoCross;
    }
    public void setAutoCross(boolean autoCross) {
        this.autoCross = autoCross;
    }

    public boolean isAutoScaleControl() {
        return autoScaleControl;
    }
    public void setAutoScaleControl(boolean autoScaleControl) {
        this.autoScaleControl = autoScaleControl;
    }

    public boolean isAutoRP() {
        return autoRP;
    }
    public void setAutoRP(boolean autoRP) {
        this.autoRP = autoRP;
    }
    
    public boolean isAutoSwitch() {
        return autoSwitch;
    }
    public void setAutoSwitch(boolean autoSwitch) {
        this.autoSwitch = autoSwitch;
    }
   
    public int getCubes() {
        return Cubes;
    }
    public void setCubes(int Cubes) {
        this.Cubes = Cubes;
    }

    public int getPCubes() {
        return PCubes;
    }
    public void setPCubes(int PCubes) {
        this.PCubes = PCubes;
    }
    
    
    public void save(File file){
        try {
         FileOutputStream fileOut = new FileOutputStream(file);
         ObjectOutputStream out = new ObjectOutputStream(fileOut);
         out.writeObject(this);
         out.close();
         fileOut.close();
//         System.out.printf("Serialized data is saved in /tmp/employee.ser");
      } catch (IOException i) {
         i.printStackTrace();
      }

    }
    
    
}
