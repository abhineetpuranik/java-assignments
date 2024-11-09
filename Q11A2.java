class Num {
    protected int number;
    public Num(int number) {
        this.number = number;
    }
    public void showNum() {
        System.out.println("Decimal Value: " + number);
    }
}

class HexNum extends Num {
    public HexNum(int number) {
        super(number);
    }
    public void showNum() {
        super.showNum(); 
        System.out.println("Hexadecimal Value: " + Integer.toHexString(number).toUpperCase());
        System.out.println("Octal Value: " + Integer.toOctalString(number));
    }
}

public class Q11A2 {
    public static void main(String[] args) {
        Num num = new Num(255);
        System.out.println("Base Class Output:");
        num.showNum();

        HexNum hexNum = new HexNum(255);
        System.out.println("\nDerived Class Output:");
        hexNum.showNum();
    }
}
