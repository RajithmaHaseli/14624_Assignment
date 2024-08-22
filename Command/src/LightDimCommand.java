public class LightDimCommand implements Command{
    private Light light;
    private int previousLevel;
    private int newLevel;

    public LightDimCommand(Light light,int newBrightness){
        this.light=light;
        this.newLevel=newBrightness;
    }
    @Override
    public void execute() {
        previousLevel=light.getBrightness(); // save current brightness level
        light.dim(newLevel); // after dimming,light go to new level

    }

    @Override
    public void undo() {
        light.dim(previousLevel); // restore the previous level of brightness
    }


}
