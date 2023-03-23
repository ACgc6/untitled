public class Dog extends Pet {
    private String strain;

    public Dog(String name, int health, int love, String strain) {
        super(name, health, love);
        this.strain = strain;
    }

    public String getStrain() {
        return strain;
    }

    public void setStrain(String strain) {
        this.strain = strain;
    }


    @Override
    public void eat() {
        System.out.println("狗狗汪星人吃东西啦，健康值增长了3");
    }
    void catchingFlyDisc(){
        super.setHealth(super.getHealth()-10);
        super.setLove(super.getLove()+5);
        System.out.printf("和狗狗玩接飞盘的游戏，狗狗健康值减少10，与主人的亲密度增加5");
    }
}
