public class Test {
    public static void main(String[] args) {
//        Dog dog=new Dog("汪星人",100,0,"雪纳瑞");
//        Penguin penguin=new Penguin("白白",100,0,"Q妹");
//        Cat cat=new Cat("喵星人",100,0,);
//
//        Pets dog=new Dog("汪星人",100,0,"雪纳瑞");
//        dog.eat();
//        Pets pets=new Dog("汪星人",100,0,"雪纳瑞");
//       Pets pets=new Penguin("白白",100,0,"Q妹");
//        Pets pets=new Cat("喵星人",100,0);
//        Master master=new Master("张三",1000);
//        master.feed(pets);
//        /**
//         * 基本数据类型转换
//         * 1.从低到高
//         * int--->
//         */
//        int num=5;
//        double num1 = num;
//        System.out.println(num1);
//        /**
//         * 基本数据类型转换
//         * 2.从高到低
//         * double--->int,需要一个强制类型转换。
//         */
//        double num2=5.3;
//        int num3=(int) num2;
//        System.out.println(num3);

//        System.out.println("欢迎来到宠物商店");
//        System.out.println("请选择领养的宠物类型（1.狗，2.企鹅）");
//        Scanner vc=new Scanner(System.in);
//        int typeId= Integer.parseInt(vc.nextLine());
//        Master master=new Master("张三",1000);
//        Pets pets=master.getPet(typeId);
//        if (pets!=null){
//            System.out.println("领养成功");
//            master.feed(pets);
//        }else {
//            System.out.println("对不起啊，没有这种宠物");
//        }


//        Pet pet=new Dog("汪星人",100,0,"雪纳瑞");
//        //调用子类重写的父类eat();
//        pet.eat();
        //调用狗的接飞盘游戏方法。父类不可以直接调用子类特有的方法,用idea工具调试错误，自动做了强制类型转换
//        ((Dog) pet).catchingFlyDisc();
//        将宠物类向下做个强制类型转换
        /*instanceof:判断某个实例是否属于某个类，判断结果是个布尔值
        *
         */
//        if (pet instanceof Dog) {
//            Dog dog = (Dog) pet;
//            dog.catchingFlyDisc();
//        }else if (pet instanceof Penguin){
//            Penguin penguin=(Penguin)pet;
//            penguin.swimming();
//        }
        Pet pet=new Penguin("白白",100,0,"Q妹");
    }
}
