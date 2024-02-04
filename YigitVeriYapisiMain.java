public class YigitVeriYapisiMain {
    public static void main(String[] args) {
        YigitVeriYapisi yigitVeriYapisi=new YigitVeriYapisi(5);
        yigitVeriYapisi.push(5);
        yigitVeriYapisi.push(7);
        yigitVeriYapisi.push(8);
        yigitVeriYapisi.push(9);
        yigitVeriYapisi.pop();
        yigitVeriYapisi.pop();
        yigitVeriYapisi.yazdir();
    }
}
