package Ccccc;

import com.google.android.exoplayer2.util.C4950Wwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwww;
import java.io.InputStream;

/* renamed from: Ccccc.Wwwwwwwwwwwwwwwwwwwwwwww */
public final class C0979Wwwwwwwwwwwwwwwwwwwwwwww extends InputStream {

    /* renamed from: Wwwwwwwwwwwwwwwwwwwwwwwwwwwwwwww  reason: collision with root package name */
    public boolean f13465Wwwwwwwwwwwwwwwwwwwwwwwwwwwwwwww = false;

    /* renamed from: Wwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwww  reason: collision with root package name */
    public boolean f13466Wwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwww = false;

    /* renamed from: Wwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwww  reason: collision with root package name */
    public long f13467Wwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwww;

    /* renamed from: Wwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwww  reason: collision with other field name */
    public final C0978Wwwwwwwwwwwwwwwwwwwwwww f1081Wwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwww;

    /* renamed from: Wwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwww  reason: collision with other field name */
    public final C0981Wwwwwwwwwwwwwwwwwwwwwwwwww f1082Wwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwww;

    /* renamed from: Wwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwww  reason: collision with other field name */
    public final byte[] f1083Wwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwww;

    public C0979Wwwwwwwwwwwwwwwwwwwwwwww(C0981Wwwwwwwwwwwwwwwwwwwwwwwwww wwwwwwwwwwwwwwwwwwwwwwwwww, C0978Wwwwwwwwwwwwwwwwwwwwwww wwwwwwwwwwwwwwwwwwwwwww) {
        this.f1082Wwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwww = wwwwwwwwwwwwwwwwwwwwwwwwww;
        this.f1081Wwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwww = wwwwwwwwwwwwwwwwwwwwwww;
        this.f1083Wwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwww = new byte[1];
    }

    public void Kkkkkkkkkkk() {
        Wwwwwwwwwww();
    }

    public final void Wwwwwwwwwww() {
        if (!this.f13466Wwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwww) {
            this.f1082Wwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwww.Wwwwwwwwwwwwwwwwwwwwwwwwwwwwww(this.f1081Wwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwww);
            this.f13466Wwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwww = true;
        }
    }

    public void close() {
        if (!this.f13465Wwwwwwwwwwwwwwwwwwwwwwwwwwwwwwww) {
            this.f1082Wwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwww.close();
            this.f13465Wwwwwwwwwwwwwwwwwwwwwwwwwwwwwwww = true;
        }
    }

    public int read() {
        if (read(this.f1083Wwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwww) == -1) {
            return -1;
        }
        return this.f1083Wwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwww[0] & 255;
    }

    public int read(byte[] bArr) {
        return read(bArr, 0, bArr.length);
    }

    public int read(byte[] bArr, int i, int i2) {
        C4950Wwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwww.Wwwwwwwwwwwwwwwwwwwwwwwwwwww(!this.f13465Wwwwwwwwwwwwwwwwwwwwwwwwwwwwwwww);
        Wwwwwwwwwww();
        int Wwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwww2 = this.f1082Wwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwww.Wwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwww(bArr, i, i2);
        if (Wwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwww2 == -1) {
            return -1;
        }
        this.f13467Wwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwww += (long) Wwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwww2;
        return Wwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwww2;
    }
}
