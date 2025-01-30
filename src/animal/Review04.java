package animal;

public class Review04 {
    public static void main(String[] args) {
        Human human1 = new Human("田中太郎" , 25,"電車");
        Human human2 = new Human("鈴木次郎" , 30,"野球");
        Human human3 = new Human("佐藤花子" , 20,"映画");
        human1.say();
        human1.think();
        human2.say();
        human2.think();
        human3.say();
        human3.think();

    }
}
