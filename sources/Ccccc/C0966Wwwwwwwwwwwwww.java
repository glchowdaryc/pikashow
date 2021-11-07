package Ccccc;

import Ccccc.C0947Wwwwwwwwww;
import Ccccc.C0957Wwwwwwwwwwww;
import Llllllllll.C2042Kkkkkkkkkkkkkkkkkkkkkkk;
import java.io.FileNotFoundException;
import java.io.IOException;

/* renamed from: Ccccc.Wwwwwwwwwwwwww */
public class C0966Wwwwwwwwwwwwww implements C0956Wwwwwwwwwww {

    /* renamed from: Wwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwww  reason: collision with root package name */
    public final int f13430Wwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwww;

    public C0966Wwwwwwwwwwwwww() {
        this(-1);
    }

    public long Wwwwwwwwwwwwwwwwwwwwwwwwwwwwwwww(int i, long j, IOException iOException, int i2) {
        if ((iOException instanceof C2042Kkkkkkkkkkkkkkkkkkkkkkk) || (iOException instanceof FileNotFoundException) || (iOException instanceof C0947Wwwwwwwwww.C0948Wwwwwwwwwwwwwwwwwwwwwwwwwww)) {
            return -9223372036854775807L;
        }
        return (long) Math.min((i2 - 1) * 1000, 5000);
    }

    public long Wwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwww(int i, long j, IOException iOException, int i2) {
        if (!(iOException instanceof C0957Wwwwwwwwwwww.C0959Wwwwwwwwwwwwwwwwwwwwwwwwwwwwww)) {
            return -9223372036854775807L;
        }
        int i3 = ((C0957Wwwwwwwwwwww.C0959Wwwwwwwwwwwwwwwwwwwwwwwwwwwwww) iOException).f13426Wwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwww;
        if (i3 == 404 || i3 == 410) {
            return 60000;
        }
        return -9223372036854775807L;
    }

    public int Wwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwww(int i) {
        int i2 = this.f13430Wwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwww;
        if (i2 == -1) {
            return i == 7 ? 6 : 3;
        }
        return i2;
    }

    public C0966Wwwwwwwwwwwwww(int i) {
        this.f13430Wwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwww = i;
    }
}
