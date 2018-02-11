
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
    private int cubes = 0;
    private int pCubes = 0; // Amount of power cubes delivered for power ups
    private String teamNam = "";
    private int teamNamber = 0;
    private String info = "";
    private int matchId = 0;
    
    public void setMatchId (int matchId){
        this.matchId = matchId;
    }
    
    public int getMatchId (){
        return matchId;
    }
    
    public void setInfo (String info){
        this.info = info;
    }
    public String getinfo ()
    {
        return info;
    }
    
    public void setTeamNamber (int teamNamber){
        this.teamNamber = teamNamber;
    }
    public int getTeamNamber(){
        return teamNamber;
    }
    
    
    public void setTeamNam (String teamNam)
    {
        this.teamNam = teamNam;
    }
    public String getTeamNam()
    {
        return teamNam;
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
        return cubes;
    }
    public void setCubes(int Cubes) {
        this.cubes = Cubes;
    }

    public int getPCubes() {
        return pCubes;
    }
    public void setPCubes(int PCubes) {
        this.pCubes = PCubes;
    }
    
    
    public void save(File file){
        try {
            file.getParentFile().mkdirs();
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
