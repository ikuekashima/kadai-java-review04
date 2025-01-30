package animal;

//ヒューマンクラスはアニマルクラスを継承
public class Human extends Animal implements Thinkable {

    //趣味の情報を保管するフィールド

    private String favorite;

    //引数ありのコンストラクタ
    public Human(String name, int old, String favorite) {
        super(name, old);
        this.favorite = favorite;
    }
    @Override
    public void think() {
        // TODO 自動生成されたメソッド・スタブ
        System.out.println("私は" + favorite + "について考えています。" );
    }

    @Override
    public void Identifier() {
        // TODO 自動生成されたメソッド・スタブ






    }
}
