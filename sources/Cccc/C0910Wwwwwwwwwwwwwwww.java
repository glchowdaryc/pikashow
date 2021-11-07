package Cccc;

/* renamed from: Cccc.Wwwwwwwwwwwwwwww */
public final class C0910Wwwwwwwwwwwwwwww {

    /* renamed from: Wwwwwwwwwwwwwwwwwwwwwwwwwwwwwwww  reason: collision with root package name */
    public int f13371Wwwwwwwwwwwwwwwwwwwwwwwwwwwwwwww;

    /* renamed from: Wwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwww  reason: collision with root package name */
    public int f13372Wwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwww;

    /* renamed from: Wwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwww  reason: collision with root package name */
    public int f13373Wwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwww;

    /* renamed from: Wwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwww  reason: collision with other field name */
    public byte[] f971Wwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwww;

    public C0910Wwwwwwwwwwwwwwww(byte[] bArr, int i, int i2) {
        Wwwwwwwwwwwwwwwwwwwwwwwwww(bArr, i, i2);
    }

    public void Wwwwwwwwwwwwwwwwwwwwwww(int i) {
        int i2 = this.f13372Wwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwww;
        int i3 = i / 8;
        int i4 = i2 + i3;
        this.f13372Wwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwww = i4;
        int i5 = this.f13371Wwwwwwwwwwwwwwwwwwwwwwwwwwwwwwww + (i - (i3 * 8));
        this.f13371Wwwwwwwwwwwwwwwwwwwwwwwwwwwwwwww = i5;
        if (i5 > 7) {
            this.f13372Wwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwww = i4 + 1;
            this.f13371Wwwwwwwwwwwwwwwwwwwwwwwwwwwwwwww = i5 - 8;
        }
        while (true) {
            i2++;
            if (i2 > this.f13372Wwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwww) {
                Wwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwww();
                return;
            } else if (Wwwwwwwwwwwwwwwwwwwwwwwww(i2)) {
                this.f13372Wwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwww++;
                i2 += 2;
            }
        }
    }

    public void Wwwwwwwwwwwwwwwwwwwwwwww() {
        int i = 1;
        int i2 = this.f13371Wwwwwwwwwwwwwwwwwwwwwwwwwwwwwwww + 1;
        this.f13371Wwwwwwwwwwwwwwwwwwwwwwwwwwwwwwww = i2;
        if (i2 == 8) {
            this.f13371Wwwwwwwwwwwwwwwwwwwwwwwwwwwwwwww = 0;
            int i3 = this.f13372Wwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwww;
            if (Wwwwwwwwwwwwwwwwwwwwwwwww(i3 + 1)) {
                i = 2;
            }
            this.f13372Wwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwww = i3 + i;
        }
        Wwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwww();
    }

    public final boolean Wwwwwwwwwwwwwwwwwwwwwwwww(int i) {
        if (2 <= i && i < this.f13373Wwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwww) {
            byte[] bArr = this.f971Wwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwww;
            return bArr[i] == 3 && bArr[i + -2] == 0 && bArr[i - 1] == 0;
        }
    }

    public void Wwwwwwwwwwwwwwwwwwwwwwwwww(byte[] bArr, int i, int i2) {
        this.f971Wwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwww = bArr;
        this.f13372Wwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwww = i;
        this.f13373Wwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwww = i2;
        this.f13371Wwwwwwwwwwwwwwwwwwwwwwwwwwwwwwww = 0;
        Wwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwww();
    }

    public int Wwwwwwwwwwwwwwwwwwwwwwwwwww() {
        return Wwwwwwwwwwwwwwwwwwwwwwwwwwwww();
    }

    public int Wwwwwwwwwwwwwwwwwwwwwwwwwwww() {
        int Wwwwwwwwwwwwwwwwwwwwwwwwwwwww2 = Wwwwwwwwwwwwwwwwwwwwwwwwwwwww();
        return (Wwwwwwwwwwwwwwwwwwwwwwwwwwwww2 % 2 == 0 ? -1 : 1) * ((Wwwwwwwwwwwwwwwwwwwwwwwwwwwww2 + 1) / 2);
    }

    public final int Wwwwwwwwwwwwwwwwwwwwwwwwwwwww() {
        int i = 0;
        int i2 = 0;
        while (!Wwwwwwwwwwwwwwwwwwwwwwwwwwwwwww()) {
            i2++;
        }
        int i3 = (1 << i2) - 1;
        if (i2 > 0) {
            i = Wwwwwwwwwwwwwwwwwwwwwwwwwwwwww(i2);
        }
        return i3 + i;
    }

    public int Wwwwwwwwwwwwwwwwwwwwwwwwwwwwww(int i) {
        int i2;
        int i3;
        this.f13371Wwwwwwwwwwwwwwwwwwwwwwwwwwwwwwww += i;
        int i4 = 0;
        while (true) {
            i2 = this.f13371Wwwwwwwwwwwwwwwwwwwwwwwwwwwwwwww;
            i3 = 2;
            if (i2 <= 8) {
                break;
            }
            int i5 = i2 - 8;
            this.f13371Wwwwwwwwwwwwwwwwwwwwwwwwwwwwwwww = i5;
            byte[] bArr = this.f971Wwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwww;
            int i6 = this.f13372Wwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwww;
            i4 |= (bArr[i6] & 255) << i5;
            if (!Wwwwwwwwwwwwwwwwwwwwwwwww(i6 + 1)) {
                i3 = 1;
            }
            this.f13372Wwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwww = i6 + i3;
        }
        byte[] bArr2 = this.f971Wwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwww;
        int i7 = this.f13372Wwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwww;
        int i8 = (-1 >>> (32 - i)) & (i4 | ((bArr2[i7] & 255) >> (8 - i2)));
        if (i2 == 8) {
            this.f13371Wwwwwwwwwwwwwwwwwwwwwwwwwwwwwwww = 0;
            if (!Wwwwwwwwwwwwwwwwwwwwwwwww(i7 + 1)) {
                i3 = 1;
            }
            this.f13372Wwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwww = i7 + i3;
        }
        Wwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwww();
        return i8;
    }

    public boolean Wwwwwwwwwwwwwwwwwwwwwwwwwwwwwww() {
        boolean z = (this.f971Wwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwww[this.f13372Wwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwww] & (128 >> this.f13371Wwwwwwwwwwwwwwwwwwwwwwwwwwwwwwww)) != 0;
        Wwwwwwwwwwwwwwwwwwwwwwww();
        return z;
    }

    public boolean Wwwwwwwwwwwwwwwwwwwwwwwwwwwwwwww() {
        int i = this.f13372Wwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwww;
        int i2 = this.f13371Wwwwwwwwwwwwwwwwwwwwwwwwwwwwwwww;
        int i3 = 0;
        while (this.f13372Wwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwww < this.f13373Wwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwww && !Wwwwwwwwwwwwwwwwwwwwwwwwwwwwwww()) {
            i3++;
        }
        boolean z = this.f13372Wwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwww == this.f13373Wwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwww;
        this.f13372Wwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwww = i;
        this.f13371Wwwwwwwwwwwwwwwwwwwwwwwwwwwwwwww = i2;
        if (z || !Wwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwww((i3 * 2) + 1)) {
            return false;
        }
        return true;
    }

    public boolean Wwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwww(int i) {
        int i2 = this.f13372Wwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwww;
        int i3 = i / 8;
        int i4 = i2 + i3;
        int i5 = (this.f13371Wwwwwwwwwwwwwwwwwwwwwwwwwwwwwwww + i) - (i3 * 8);
        if (i5 > 7) {
            i4++;
            i5 -= 8;
        }
        while (true) {
            i2++;
            if (i2 > i4 || i4 >= this.f13373Wwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwww) {
                int i6 = this.f13373Wwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwww;
            } else if (Wwwwwwwwwwwwwwwwwwwwwwwww(i2)) {
                i4++;
                i2 += 2;
            }
        }
        int i62 = this.f13373Wwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwww;
        if (i4 < i62) {
            return true;
        }
        if (i4 == i62 && i5 == 0) {
            return true;
        }
        return false;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:2:0x0004, code lost:
        r1 = r2.f13373Wwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwww;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void Wwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwww() {
        /*
            r2 = this;
            int r0 = r2.f13372Wwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwww
            if (r0 < 0) goto L_0x0010
            int r1 = r2.f13373Wwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwww
            if (r0 < r1) goto L_0x000e
            if (r0 != r1) goto L_0x0010
            int r0 = r2.f13371Wwwwwwwwwwwwwwwwwwwwwwwwwwwwwwww
            if (r0 != 0) goto L_0x0010
        L_0x000e:
            r0 = 1
            goto L_0x0011
        L_0x0010:
            r0 = 0
        L_0x0011:
            com.google.android.exoplayer2.util.C4950Wwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwww.Wwwwwwwwwwwwwwwwwwwwwwwwwwww(r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: Cccc.C0910Wwwwwwwwwwwwwwww.Wwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwww():void");
    }
}
