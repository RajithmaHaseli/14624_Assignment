public class LivingRoomLight implements Light{
    private int brightness=0;
    String name1="Living Room light";
    @Override
    public void on() {
        brightness=100; // when turned on,get full brightness
        System.out.println(name1+ " is ON at full brightness.");

    }

    @Override
    public void off() {
        brightness=0; // when turned off,set brightness to 0
        System.out.println(name1+ " is OFF.");

    }

    @Override
    public void dim(int level) {
        brightness=level;
        System.out.println(name1+ " dimmed to "+ level +"%.");

    }




    @Override
    public int getBrightness() {
        return brightness;
    }


}

