package Ccc;

import Cccc.C0911Wwwwwwwwwwwwwwwww;
import Cccc.C0913Wwwwwwwwwwwwwwwwwww;
import Llllllllll.C2042Kkkkkkkkkkkkkkkkkkkkkkk;
import java.util.Collections;
import java.util.List;

/* renamed from: Ccc.Wwwwwwwwwwwwwwwwwwwwwwwwwwwwww */
public final class C0885Wwwwwwwwwwwwwwwwwwwwwwwwwwwwww {

    /* renamed from: Wwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwww  reason: collision with root package name */
    public final int f13339Wwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwww;

    /* renamed from: Wwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwww  reason: collision with other field name */
    public final List<byte[]> f949Wwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwww;

    public C0885Wwwwwwwwwwwwwwwwwwwwwwwwwwwwww(List<byte[]> list, int i) {
        this.f949Wwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwww = list;
        this.f13339Wwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwww = i;
    }

    public static C0885Wwwwwwwwwwwwwwwwwwwwwwwwwwwwww Wwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwww(C0911Wwwwwwwwwwwwwwwww wwwwwwwwwwwwwwwww) {
        List list;
        try {
            wwwwwwwwwwwwwwwww.Kkkkkkkkkkkkkkkkkk(21);
            int Wwwwwwww2 = wwwwwwwwwwwwwwwww.Wwwwwwww() & 3;
            int Wwwwwwww3 = wwwwwwwwwwwwwwwww.Wwwwwwww();
            int Wwwwwwwwwwwwwwwwwwwwwwwwwwwwwwww2 = wwwwwwwwwwwwwwwww.Wwwwwwwwwwwwwwwwwwwwwwwwwwwwwwww();
            int i = 0;
            for (int i2 = 0; i2 < Wwwwwwww3; i2++) {
                wwwwwwwwwwwwwwwww.Kkkkkkkkkkkkkkkkkk(1);
                int Kkkkkkkkkkkkkkkkkkkkkkkkkk2 = wwwwwwwwwwwwwwwww.Kkkkkkkkkkkkkkkkkkkkkkkkkk();
                for (int i3 = 0; i3 < Kkkkkkkkkkkkkkkkkkkkkkkkkk2; i3++) {
                    int Kkkkkkkkkkkkkkkkkkkkkkkkkk3 = wwwwwwwwwwwwwwwww.Kkkkkkkkkkkkkkkkkkkkkkkkkk();
                    i += Kkkkkkkkkkkkkkkkkkkkkkkkkk3 + 4;
                    wwwwwwwwwwwwwwwww.Kkkkkkkkkkkkkkkkkk(Kkkkkkkkkkkkkkkkkkkkkkkkkk3);
                }
            }
            wwwwwwwwwwwwwwwww.Kkkkkkkkkkkkkkkkkkk(Wwwwwwwwwwwwwwwwwwwwwwwwwwwwwwww2);
            byte[] bArr = new byte[i];
            int i4 = 0;
            for (int i5 = 0; i5 < Wwwwwwww3; i5++) {
                wwwwwwwwwwwwwwwww.Kkkkkkkkkkkkkkkkkk(1);
                int Kkkkkkkkkkkkkkkkkkkkkkkkkk4 = wwwwwwwwwwwwwwwww.Kkkkkkkkkkkkkkkkkkkkkkkkkk();
                for (int i6 = 0; i6 < Kkkkkkkkkkkkkkkkkkkkkkkkkk4; i6++) {
                    int Kkkkkkkkkkkkkkkkkkkkkkkkkk5 = wwwwwwwwwwwwwwwww.Kkkkkkkkkkkkkkkkkkkkkkkkkk();
                    byte[] bArr2 = C0913Wwwwwwwwwwwwwwwwwww.f974Wwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwww;
                    System.arraycopy(bArr2, 0, bArr, i4, bArr2.length);
                    int length = i4 + bArr2.length;
                    System.arraycopy(wwwwwwwwwwwwwwwww.f972Wwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwww, wwwwwwwwwwwwwwwww.Wwwwwwwwwwwwwwwwwwwwwwwwwwwwwwww(), bArr, length, Kkkkkkkkkkkkkkkkkkkkkkkkkk5);
                    i4 = length + Kkkkkkkkkkkkkkkkkkkkkkkkkk5;
                    wwwwwwwwwwwwwwwww.Kkkkkkkkkkkkkkkkkk(Kkkkkkkkkkkkkkkkkkkkkkkkkk5);
                }
            }
            if (i == 0) {
                list = null;
            } else {
                list = Collections.singletonList(bArr);
            }
            return new C0885Wwwwwwwwwwwwwwwwwwwwwwwwwwwwww(list, Wwwwwwww2 + 1);
        } catch (ArrayIndexOutOfBoundsException e) {
            throw new C2042Kkkkkkkkkkkkkkkkkkkkkkk("Error parsing HEVC config", e);
        }
    }
}
