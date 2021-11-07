package Cccc;

/* renamed from: Cccc.Wwwwwwwwwwwww */
public final class C0907Wwwwwwwwwwwww {
    public static boolean Wwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwww(int i, int i2) {
        if (i != 0) {
            return i != 1 ? i == 2 && (i2 & 2) != 0 : (i2 & 1) != 0;
        }
        return true;
    }

    public static int Wwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwww(int i, int i2) {
        for (int i3 = 1; i3 <= 2; i3++) {
            int i4 = (i + i3) % 3;
            if (Wwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwww(i4, i2)) {
                return i4;
            }
        }
        return i;
    }
}
