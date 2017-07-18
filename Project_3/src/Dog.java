/**
 * Created by XuChen on 2017/7/18.
 */
public class Dog {
    private String name;
    private String says;

    public void CreateDog(String name, String says) {
        this.name = name;
        this.says = says;
    }

    public void DisPlay() {
        System.out.println("name : " + this.name + " says : " + this.says);
    }
    public boolean euqals(Dog dog){
        if (dog.name==this.name&&dog.says==this.says){
            return true;
        }
        else return false;
    }
}
