abstract class Beverages {
    private boolean wantsExtras;

    public final void finalTemplateMethod(){  //define the sequence
        boilWater();
        brew();
        pourInCup();
        addCondiments();
        if (wantsExtras()){
            addExtras();
        }
    }



    public void boilWater(){   //common method
    System.out.println("Boiling water");

}
public void pourInCup(){    //common method
    System.out.println("Pouring into cup");
}

public void setWantsExtras(boolean wantsExtras){
        this.wantsExtras=wantsExtras;
}
public boolean wantsExtras(){
        return wantsExtras;
}

//abstract methods
abstract void brew();
abstract void addCondiments();
abstract void addExtras();

}




