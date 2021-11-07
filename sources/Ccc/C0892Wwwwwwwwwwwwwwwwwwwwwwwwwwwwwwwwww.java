package Ccc;

import Cccc.C0911Wwwwwwwwwwwwwwwww;
import Cccc.C0913Wwwwwwwwwwwwwwwwwww;
import Cccc.C0935Wwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwww;
import Llllllllll.C2042Kkkkkkkkkkkkkkkkkkkkkkk;
import java.util.ArrayList;
import java.util.List;

/* renamed from: Ccc.Wwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwww */
public final class C0892Wwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwww {

    /* renamed from: Wwwwwwwwwwwwwwwwwwwwwwwwwwwwwwww  reason: collision with root package name */
    public final int f13349Wwwwwwwwwwwwwwwwwwwwwwwwwwwwwwww;

    /* renamed from: Wwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwww  reason: collision with root package name */
    public final int f13350Wwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwww;

    /* renamed from: Wwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwww  reason: collision with root package name */
    public final float f13351Wwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwww;

    /* renamed from: Wwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwww  reason: collision with other field name */
    public final int f957Wwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwww;

    /* renamed from: Wwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwww  reason: collision with other field name */
    public final List<byte[]> f958Wwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwww;

    public C0892Wwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwww(List<byte[]> list, int i, int i2, int i3, float f) {
        this.f958Wwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwww = list;
        this.f957Wwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwww = i;
        this.f13350Wwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwww = i2;
        this.f13349Wwwwwwwwwwwwwwwwwwwwwwwwwwwwwwww = i3;
        this.f13351Wwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwww = f;
    }

    public static C0892Wwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwww Wwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwww(C0911Wwwwwwwwwwwwwwwww wwwwwwwwwwwwwwwww) {
        float f;
        int i;
        int i2;
        try {
            wwwwwwwwwwwwwwwww.Kkkkkkkkkkkkkkkkkk(4);
            int Wwwwwwww2 = (wwwwwwwwwwwwwwwww.Wwwwwwww() & 3) + 1;
            if (Wwwwwwww2 != 3) {
                ArrayList arrayList = new ArrayList();
                int Wwwwwwww3 = wwwwwwwwwwwwwwwww.Wwwwwwww() & 31;
                for (int i3 = 0; i3 < Wwwwwwww3; i3++) {
                    arrayList.add(Wwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwww(wwwwwwwwwwwwwwwww));
                }
                int Wwwwwwww4 = wwwwwwwwwwwwwwwww.Wwwwwwww();
                for (int i4 = 0; i4 < Wwwwwwww4; i4++) {
                    arrayList.add(Wwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwww(wwwwwwwwwwwwwwwww));
                }
                if (Wwwwwwww3 > 0) {
                    C0913Wwwwwwwwwwwwwwwwwww.C0914Wwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwww Wwwwwwwwwwwwwwwwwwwwwwwwww2 = C0913Wwwwwwwwwwwwwwwwwww.Wwwwwwwwwwwwwwwwwwwwwwwwww((byte[]) arrayList.get(0), Wwwwwwww2, ((byte[]) arrayList.get(0)).length);
                    int i5 = Wwwwwwwwwwwwwwwwwwwwwwwwww2.f13384Wwwwwwwwwwwwwwwwwwwwwwwwwwwwww;
                    int i6 = Wwwwwwwwwwwwwwwwwwwwwwwwww2.f13383Wwwwwwwwwwwwwwwwwwwwwwwwwwwww;
                    f = Wwwwwwwwwwwwwwwwwwwwwwwwww2.f13388Wwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwww;
                    i2 = i5;
                    i = i6;
                } else {
                    i2 = -1;
                    i = -1;
                    f = 1.0f;
                }
                return new C0892Wwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwww(arrayList, Wwwwwwww2, i2, i, f);
            }
            throw new IllegalStateException();
        } catch (ArrayIndexOutOfBoundsException e) {
            throw new C2042Kkkkkkkkkkkkkkkkkkkkkkk("Error parsing AVC config", e);
        }
    }

    public static byte[] Wwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwww(C0911Wwwwwwwwwwwwwwwww wwwwwwwwwwwwwwwww) {
        int Kkkkkkkkkkkkkkkkkkkkkkkkkk2 = wwwwwwwwwwwwwwwww.Kkkkkkkkkkkkkkkkkkkkkkkkkk();
        int Wwwwwwwwwwwwwwwwwwwwwwwwwwwwwwww2 = wwwwwwwwwwwwwwwww.Wwwwwwwwwwwwwwwwwwwwwwwwwwwwwwww();
        wwwwwwwwwwwwwwwww.Kkkkkkkkkkkkkkkkkk(Kkkkkkkkkkkkkkkkkkkkkkkkkk2);
        return C0935Wwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwww.Wwwwwwwwwwwwwwwwwwwwwwwwwwwwwww(wwwwwwwwwwwwwwwww.f972Wwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwww, Wwwwwwwwwwwwwwwwwwwwwwwwwwwwwwww2, Kkkkkkkkkkkkkkkkkkkkkkkkkk2);
    }
}
