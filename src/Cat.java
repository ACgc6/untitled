public class Cat extends Pet {
    public Cat(String name, int health, int love) {
        super(name, health, love);
    }

    @Override
    public void eat() {
        System.out.printf("喵星人");
    }

}
