package Cccc;

import java.util.Arrays;

/* renamed from: Cccc.Wwwwwwwwwwwwwwwwwwwwww */
public final class C0919Wwwwwwwwwwwwwwwwwwwwww {

    /* renamed from: Wwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwww  reason: collision with root package name */
    public int f13394Wwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwww;

    /* renamed from: Wwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwww  reason: collision with other field name */
    public long[] f983Wwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwww;

    public C0919Wwwwwwwwwwwwwwwwwwwwww() {
        this(32);
    }

    public long[] Wwwwwwwwwwwwwwwwwwwwwwwwwwwwwww() {
        return Arrays.copyOf(this.f983Wwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwww, this.f13394Wwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwww);
    }

    public int Wwwwwwwwwwwwwwwwwwwwwwwwwwwwwwww() {
        return this.f13394Wwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwww;
    }

    public long Wwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwww(int i) {
        if (i >= 0 && i < this.f13394Wwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwww) {
            return this.f983Wwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwww[i];
        }
        throw new IndexOutOfBoundsException("Invalid index " + i + ", size is " + this.f13394Wwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwww);
    }

    public void Wwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwww(long j) {
        int i = this.f13394Wwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwww;
        long[] jArr = this.f983Wwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwww;
        if (i == jArr.length) {
            this.f983Wwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwww = Arrays.copyOf(jArr, i * 2);
        }
        long[] jArr2 = this.f983Wwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwww;
        int i2 = this.f13394Wwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwww;
        this.f13394Wwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwww = i2 + 1;
        jArr2[i2] = j;
    }

    public C0919Wwwwwwwwwwwwwwwwwwwwww(int i) {
        this.f983Wwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwww = new long[i];
    }
}
