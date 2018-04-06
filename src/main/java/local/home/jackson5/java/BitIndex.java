package local.home.jackson5.java;

public class BitIndex {
    private long data;

    BitIndex(boolean allTrue){
        data = allTrue ? -1 : 0;
        //if (allTrue) {
        //    data = -1;
        //} else {
        //    data = 0;
        //}
    }

    public boolean get(int index) {
        return (data & ( 1 << index )) != 0;
    }
    public void set(int index, boolean value) {
        data = value ? data | ( 1 << index ) : data & ~( 1 << index );
        //if (value) {
        //    data = data | ( 1 << index ); // 00000001
        //} else {
        //    data = data & ~( 1 << index ); // 00000001 потом инвертируем
        //}
    }
}

class BitIndexTest {
    public static void main(String[] args) {
        BitIndex index = new BitIndex( false );
        index.set(19, true);
        index.set(62, true);
        index.get(29);
        System.out.println(index.get(29));
        System.out.println(index.get(19));
        System.out.println(index.get(62));
        System.out.println(index.get(0));
        System.out.println(index.get(1));


    }
}