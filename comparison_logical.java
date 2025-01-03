public class comparison_logical {
    public static void main(String[] args) {
        int a= 5 , b=6 , c=6;
        boolean d = a<b;
        boolean e = a>b;
        boolean f = b>=c;
        System.out.println(d);
        System.out.println(e);
        System.out.println(f);


        int x=20, y=15, z=35;
        boolean p = (x>y&&x>z);
        boolean q = (x>y||x>z);
        boolean r = !(x>y);
        System.out.println(p);
        System.out.println(q);
        System.out.println(r);
    }
}
