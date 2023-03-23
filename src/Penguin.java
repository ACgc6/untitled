public class Penguin extends Pet {
    private String sex;

    public Penguin(String name, int health, int love, String sex) {
        super(name, health, love);
        this.sex = sex;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }


    @Override
    public void eat() {
        System.out.println("");
    }
    void swimming(){
        //写健康值减少10的操作
        super.setHealth(super.getHealth()-10);
        //与主人亲密度增加5的操作
        super.setLove(super.getLove()+5);
        System.out.println("和企鹅玩游泳游戏，企鹅的健康值减少10，与主人亲密度增加5.");
    }
}
