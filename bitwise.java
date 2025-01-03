public class bitwise {
    public static void main(String[] args) {
        int a=5, b=6;
        int c=a&b;
        int d=a|b;
        int e=a^b;
        int f=~a;

        System.out.println(c);
        System.out.println(d);
        System.out.println(e);
        System.out.println(f);

        int value=10;
        int x=value<<2;
        int y=value>>2;
        int z=value>>>2;

        int negValue=-123;
        int z1=negValue>>>1;

        System.out.println(x);
        System.out.println(y);
        System.out.println(z);
        System.out.println(z1);
    }
}
