package Ccc;

import Cccc.C0911Wwwwwwwwwwwwwwwww;

/* renamed from: Ccc.Wwwwwwwwwwwwwwwwwwwwwwwwwwwwwwww */
public final class C0889Wwwwwwwwwwwwwwwwwwwwwwwwwwwwwwww {

    /* renamed from: Wwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwww  reason: collision with root package name */
    public final int f13344Wwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwww;

    /* renamed from: Wwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwww  reason: collision with other field name */
    public final String f955Wwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwww;

    public C0889Wwwwwwwwwwwwwwwwwwwwwwwwwwwwwwww(int i, int i2, String str) {
        this.f13344Wwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwww = i;
        this.f955Wwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwww = str;
    }

    public static C0889Wwwwwwwwwwwwwwwwwwwwwwwwwwwwwwww Wwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwww(C0911Wwwwwwwwwwwwwwwww wwwwwwwwwwwwwwwww) {
        String str;
        wwwwwwwwwwwwwwwww.Kkkkkkkkkkkkkkkkkk(2);
        int Wwwwwwww2 = wwwwwwwwwwwwwwwww.Wwwwwwww();
        int i = Wwwwwwww2 >> 1;
        int Wwwwwwww3 = ((wwwwwwwwwwwwwwwww.Wwwwwwww() >> 3) & 31) | ((Wwwwwwww2 & 1) << 5);
        if (i == 4 || i == 5 || i == 7) {
            str = "dvhe";
        } else if (i == 8) {
            str = "hev1";
        } else if (i != 9) {
            return null;
        } else {
            str = "avc3";
        }
        return new C0889Wwwwwwwwwwwwwwwwwwwwwwwwwwwwwwww(i, Wwwwwwww3, str + ".0" + i + ".0" + Wwwwwwww3);
    }
}
