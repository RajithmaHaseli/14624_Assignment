public class Coffee extends Beverages{
    @Override
     void brew(){
        System.out.println("Dripping coffee through filter");

    }
    @Override
     void addCondiments(){
        System.out.println("Adding sugar and milk");
        System.out.println("Adding vanilla syrup");
    }
    @Override
    void addExtras(){
        return;
    }
}
