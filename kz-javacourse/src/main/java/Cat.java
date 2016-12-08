/**
 * Created by Asus on 08.12.2016.
 */
public class Cat extends Animal {
    @Override
    public void makeSound() {
        System.out.println(String.format("miyau %s" , this.getName()));
    }

    @Override
    public String getName() {
        return super.getName();
    }

    public Cat(String name) {
        super(name);
    }
}
