package Cccc;

import java.util.Arrays;

/* renamed from: Cccc.Wwwwww */
public final class C0898Wwwwww<V> {

    /* renamed from: Wwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwww  reason: collision with root package name */
    public int f13356Wwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwww;

    /* renamed from: Wwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwww  reason: collision with root package name */
    public int f13357Wwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwww;

    /* renamed from: Wwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwww  reason: collision with other field name */
    public long[] f959Wwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwww;

    /* renamed from: Wwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwww  reason: collision with other field name */
    public V[] f960Wwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwww;

    public C0898Wwwwww() {
        this(10);
    }

    public static <V> V[] Wwwwwwwwwwwwwwwwwwwwwwwwwwwww(int i) {
        return new Object[i];
    }

    public synchronized V Wwwwwwwwwwwwwwwwwwwwwwwwww(long j) {
        return Wwwwwwwwwwwwwwwwwwwwwwwwwww(j, true);
    }

    public final V Wwwwwwwwwwwwwwwwwwwwwwwwwww(long j, boolean z) {
        long j2 = Long.MAX_VALUE;
        V v = null;
        while (true) {
            int i = this.f13356Wwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwww;
            if (i <= 0) {
                break;
            }
            long[] jArr = this.f959Wwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwww;
            int i2 = this.f13357Wwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwww;
            long j3 = j - jArr[i2];
            if (j3 < 0 && (z || (-j3) >= j2)) {
                break;
            }
            V[] vArr = this.f960Wwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwww;
            v = vArr[i2];
            vArr[i2] = null;
            this.f13357Wwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwww = (i2 + 1) % vArr.length;
            this.f13356Wwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwww = i - 1;
            j2 = j3;
        }
        return v;
    }

    public synchronized V Wwwwwwwwwwwwwwwwwwwwwwwwwwww(long j) {
        return Wwwwwwwwwwwwwwwwwwwwwwwwwww(j, false);
    }

    public final void Wwwwwwwwwwwwwwwwwwwwwwwwwwwwww() {
        int length = this.f960Wwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwww.length;
        if (this.f13356Wwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwww >= length) {
            int i = length * 2;
            long[] jArr = new long[i];
            V[] Wwwwwwwwwwwwwwwwwwwwwwwwwwwww2 = Wwwwwwwwwwwwwwwwwwwwwwwwwwwww(i);
            int i2 = this.f13357Wwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwww;
            int i3 = length - i2;
            System.arraycopy(this.f959Wwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwww, i2, jArr, 0, i3);
            System.arraycopy(this.f960Wwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwww, this.f13357Wwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwww, Wwwwwwwwwwwwwwwwwwwwwwwwwwwww2, 0, i3);
            int i4 = this.f13357Wwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwww;
            if (i4 > 0) {
                System.arraycopy(this.f959Wwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwww, 0, jArr, i3, i4);
                System.arraycopy(this.f960Wwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwww, 0, Wwwwwwwwwwwwwwwwwwwwwwwwwwwww2, i3, this.f13357Wwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwww);
            }
            this.f959Wwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwww = jArr;
            this.f960Wwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwww = Wwwwwwwwwwwwwwwwwwwwwwwwwwwww2;
            this.f13357Wwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwww = 0;
        }
    }

    public final void Wwwwwwwwwwwwwwwwwwwwwwwwwwwwwww(long j) {
        int i = this.f13356Wwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwww;
        if (i > 0) {
            if (j <= this.f959Wwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwww[((this.f13357Wwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwww + i) - 1) % this.f960Wwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwww.length]) {
                Wwwwwwwwwwwwwwwwwwwwwwwwwwwwwwww();
            }
        }
    }

    public synchronized void Wwwwwwwwwwwwwwwwwwwwwwwwwwwwwwww() {
        this.f13357Wwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwww = 0;
        this.f13356Wwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwww = 0;
        Arrays.fill(this.f960Wwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwww, (Object) null);
    }

    public final void Wwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwww(long j, V v) {
        int i = this.f13357Wwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwww;
        int i2 = this.f13356Wwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwww;
        V[] vArr = this.f960Wwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwww;
        int length = (i + i2) % vArr.length;
        this.f959Wwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwww[length] = j;
        vArr[length] = v;
        this.f13356Wwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwww = i2 + 1;
    }

    public synchronized void Wwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwww(long j, V v) {
        Wwwwwwwwwwwwwwwwwwwwwwwwwwwwwww(j);
        Wwwwwwwwwwwwwwwwwwwwwwwwwwwwww();
        Wwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwww(j, v);
    }

    public C0898Wwwwww(int i) {
        this.f959Wwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwww = new long[i];
        this.f960Wwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwww = Wwwwwwwwwwwwwwwwwwwwwwwwwwwww(i);
    }
}
