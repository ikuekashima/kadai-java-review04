package jp.co.kiramex.polymorphism;

public abstract class Animal {
    public abstract void barking();
//名前を格納するフィールドと年齢を格納するフィールドを定義
    //変数名は自由で、カプセル化を行う

    private  String name;//名前
    private  int  old;//年齢


        public Animal(String name , int old) {
            System.out.println();
            this.name = name;
            this.old = old;
        }

        public  void say() {
            System.out.println("私の名前は" + name + "です。年齢は" + old + "です。" );


        }





        }

