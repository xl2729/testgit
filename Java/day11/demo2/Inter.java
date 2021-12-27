package Java.day11.demo2;

interface Inter {
    void show();
}
class Outer {
    //补齐代码 需求１
    // public static Inter method() {
    //     return new Inter() {
    //         @Override
    //         public void show() {
    //             System.out.println("HelloWorld");
    //         }
    //     };
    // }
    //补齐代码　需求２
    public static Inter method = new Inter() {
        @Override
        public void show(){
            System.out.println("HelloWorld");
        }
    };
}

