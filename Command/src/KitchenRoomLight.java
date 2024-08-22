public class KitchenRoomLight implements Light {
    private int brightness=0;
    String name= "Kitchen Room light ";
    @Override
    public void on() {
        brightness=100; // when turned on,set full brightness
        System.out.println(name+ " is ON at full brightness.");


    }

    @Override
    public void off() {
        brightness=0; // when turned off,set brightness to 0
        System.out.println(name+ " is OFF.");

    }

    @Override
    public void dim(int level) {
        brightness=level; // dim levels
        System.out.println(name+ " dimmed to "+ level+"%.");

    }



    @Override
    public int getBrightness() {
        return brightness;
    }


}

