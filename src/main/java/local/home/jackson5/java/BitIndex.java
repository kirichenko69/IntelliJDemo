package local.home.jackson5.java;

public class BitIndex {
    private long data = 0;
    public boolean get(int index) {
        //todo
        throw new UnsupportedOperationException();
    }
    public void set(int index, boolean value) {
        if (value) {
            data = data | ( 1 << index ); // 00000001
        } else {
            data = data & ( 1 << index ); // 00000001 потом инвертируем
        }
    }
}

class BitIndexTest {
    public static void main(String[] args) {
        BitIndex index = new BitIndex();
        index.set(19, true);
        index.set(62, true);
        index.get(29);
        System.out.println(index.get(29));
        System.out.println(index.get(19));

    }
}