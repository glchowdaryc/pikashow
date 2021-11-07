package Cccc;

import com.google.android.exoplayer2.util.C4949Wwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwww;
import com.google.android.exoplayer2.util.C4950Wwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwww;

/* renamed from: Cccc.Wwwwwwwwwwwwwwwwww */
public final class C0912Wwwwwwwwwwwwwwwwww {

    /* renamed from: Wwwwwwwwwwwwwwwwwwwwwwwwwwwwwwww  reason: collision with root package name */
    public int f13376Wwwwwwwwwwwwwwwwwwwwwwwwwwwwwwww;

    /* renamed from: Wwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwww  reason: collision with root package name */
    public int f13377Wwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwww;

    /* renamed from: Wwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwww  reason: collision with root package name */
    public int f13378Wwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwww;

    /* renamed from: Wwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwww  reason: collision with other field name */
    public byte[] f973Wwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwww;

    public C0912Wwwwwwwwwwwwwwwwww() {
        this.f973Wwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwww = C4949Wwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwww.f7452Wwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwww;
    }

    public void Wwwwwwwwwwwwwwwwww(int i) {
        C4950Wwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwww.Wwwwwwwwwwwwwwwwwwwwwwwwwwww(this.f13377Wwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwww == 0);
        this.f13378Wwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwww += i;
        Wwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwww();
    }

    public void Wwwwwwwwwwwwwwwwwww(int i) {
        int i2 = i / 8;
        int i3 = this.f13378Wwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwww + i2;
        this.f13378Wwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwww = i3;
        int i4 = this.f13377Wwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwww + (i - (i2 * 8));
        this.f13377Wwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwww = i4;
        if (i4 > 7) {
            this.f13378Wwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwww = i3 + 1;
            this.f13377Wwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwww = i4 - 8;
        }
        Wwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwww();
    }

    public void Wwwwwwwwwwwwwwwwwwww() {
        int i = this.f13377Wwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwww + 1;
        this.f13377Wwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwww = i;
        if (i == 8) {
            this.f13377Wwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwww = 0;
            this.f13378Wwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwww++;
        }
        Wwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwww();
    }

    public void Wwwwwwwwwwwwwwwwwwwww(int i) {
        int i2 = i / 8;
        this.f13378Wwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwww = i2;
        this.f13377Wwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwww = i - (i2 * 8);
        Wwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwww();
    }

    public void Wwwwwwwwwwwwwwwwwwwwww(byte[] bArr, int i) {
        this.f973Wwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwww = bArr;
        this.f13378Wwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwww = 0;
        this.f13377Wwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwww = 0;
        this.f13376Wwwwwwwwwwwwwwwwwwwwwwwwwwwwwwww = i;
    }

    public void Wwwwwwwwwwwwwwwwwwwwwww(byte[] bArr) {
        Wwwwwwwwwwwwwwwwwwwwww(bArr, bArr.length);
    }

    public void Wwwwwwwwwwwwwwwwwwwwwwww(C0911Wwwwwwwwwwwwwwwww wwwwwwwwwwwwwwwww) {
        Wwwwwwwwwwwwwwwwwwwwww(wwwwwwwwwwwwwwwww.f972Wwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwww, wwwwwwwwwwwwwwwww.Wwwwwwwwwwwwwwwwwwwwwwwwwwwwwww());
        Wwwwwwwwwwwwwwwwwwwww(wwwwwwwwwwwwwwwww.Wwwwwwwwwwwwwwwwwwwwwwwwwwwwwwww() * 8);
    }

    public void Wwwwwwwwwwwwwwwwwwwwwwwww(byte[] bArr, int i, int i2) {
        C4950Wwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwww.Wwwwwwwwwwwwwwwwwwwwwwwwwwww(this.f13377Wwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwww == 0);
        System.arraycopy(this.f973Wwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwww, this.f13378Wwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwww, bArr, i, i2);
        this.f13378Wwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwww += i2;
        Wwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwww();
    }

    public void Wwwwwwwwwwwwwwwwwwwwwwwwww(byte[] bArr, int i, int i2) {
        int i3 = (i2 >> 3) + i;
        while (i < i3) {
            byte[] bArr2 = this.f973Wwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwww;
            int i4 = this.f13378Wwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwww;
            int i5 = i4 + 1;
            this.f13378Wwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwww = i5;
            byte b = bArr2[i4];
            int i6 = this.f13377Wwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwww;
            bArr[i] = (byte) (b << i6);
            bArr[i] = (byte) (((255 & bArr2[i5]) >> (8 - i6)) | bArr[i]);
            i++;
        }
        int i7 = i2 & 7;
        if (i7 != 0) {
            bArr[i3] = (byte) (bArr[i3] & (255 >> i7));
            int i8 = this.f13377Wwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwww;
            if (i8 + i7 > 8) {
                byte b2 = bArr[i3];
                byte[] bArr3 = this.f973Wwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwww;
                int i9 = this.f13378Wwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwww;
                this.f13378Wwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwww = i9 + 1;
                bArr[i3] = (byte) (b2 | ((bArr3[i9] & 255) << i8));
                this.f13377Wwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwww = i8 - 8;
            }
            int i10 = this.f13377Wwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwww + i7;
            this.f13377Wwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwww = i10;
            byte[] bArr4 = this.f973Wwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwww;
            int i11 = this.f13378Wwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwww;
            bArr[i3] = (byte) (((byte) (((255 & bArr4[i11]) >> (8 - i10)) << (8 - i7))) | bArr[i3]);
            if (i10 == 8) {
                this.f13377Wwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwww = 0;
                this.f13378Wwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwww = i11 + 1;
            }
            Wwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwww();
        }
    }

    public int Wwwwwwwwwwwwwwwwwwwwwwwwwww(int i) {
        int i2;
        if (i == 0) {
            return 0;
        }
        this.f13377Wwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwww += i;
        int i3 = 0;
        while (true) {
            i2 = this.f13377Wwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwww;
            if (i2 <= 8) {
                break;
            }
            int i4 = i2 - 8;
            this.f13377Wwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwww = i4;
            byte[] bArr = this.f973Wwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwww;
            int i5 = this.f13378Wwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwww;
            this.f13378Wwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwww = i5 + 1;
            i3 |= (bArr[i5] & 255) << i4;
        }
        byte[] bArr2 = this.f973Wwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwww;
        int i6 = this.f13378Wwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwww;
        int i7 = (-1 >>> (32 - i)) & (i3 | ((bArr2[i6] & 255) >> (8 - i2)));
        if (i2 == 8) {
            this.f13377Wwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwww = 0;
            this.f13378Wwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwww = i6 + 1;
        }
        Wwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwww();
        return i7;
    }

    public boolean Wwwwwwwwwwwwwwwwwwwwwwwwwwww() {
        boolean z = (this.f973Wwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwww[this.f13378Wwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwww] & (128 >> this.f13377Wwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwww)) != 0;
        Wwwwwwwwwwwwwwwwwwww();
        return z;
    }

    public void Wwwwwwwwwwwwwwwwwwwwwwwwwwwww(int i, int i2) {
        if (i2 < 32) {
            i &= (1 << i2) - 1;
        }
        int min = Math.min(8 - this.f13377Wwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwww, i2);
        int i3 = this.f13377Wwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwww;
        int i4 = (8 - i3) - min;
        byte[] bArr = this.f973Wwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwww;
        int i5 = this.f13378Wwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwww;
        bArr[i5] = (byte) (((65280 >> i3) | ((1 << i4) - 1)) & bArr[i5]);
        int i6 = i2 - min;
        bArr[i5] = (byte) (((i >>> i6) << i4) | bArr[i5]);
        int i7 = i5 + 1;
        while (i6 > 8) {
            this.f973Wwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwww[i7] = (byte) (i >>> (i6 - 8));
            i6 -= 8;
            i7++;
        }
        int i8 = 8 - i6;
        byte[] bArr2 = this.f973Wwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwww;
        bArr2[i7] = (byte) (bArr2[i7] & ((1 << i8) - 1));
        bArr2[i7] = (byte) (((i & ((1 << i6) - 1)) << i8) | bArr2[i7]);
        Wwwwwwwwwwwwwwwwwww(i2);
        Wwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwww();
    }

    public int Wwwwwwwwwwwwwwwwwwwwwwwwwwwwww() {
        return (this.f13378Wwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwww * 8) + this.f13377Wwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwww;
    }

    public int Wwwwwwwwwwwwwwwwwwwwwwwwwwwwwww() {
        C4950Wwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwww.Wwwwwwwwwwwwwwwwwwwwwwwwwwww(this.f13377Wwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwww == 0);
        return this.f13378Wwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwww;
    }

    public void Wwwwwwwwwwwwwwwwwwwwwwwwwwwwwwww() {
        if (this.f13377Wwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwww != 0) {
            this.f13377Wwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwww = 0;
            this.f13378Wwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwww++;
            Wwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwww();
        }
    }

    public int Wwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwww() {
        return ((this.f13376Wwwwwwwwwwwwwwwwwwwwwwwwwwwwwwww - this.f13378Wwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwww) * 8) - this.f13377Wwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwww;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:2:0x0004, code lost:
        r1 = r2.f13376Wwwwwwwwwwwwwwwwwwwwwwwwwwwwwwww;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void Wwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwww() {
        /*
            r2 = this;
            int r0 = r2.f13378Wwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwww
            if (r0 < 0) goto L_0x0010
            int r1 = r2.f13376Wwwwwwwwwwwwwwwwwwwwwwwwwwwwwwww
            if (r0 < r1) goto L_0x000e
            if (r0 != r1) goto L_0x0010
            int r0 = r2.f13377Wwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwww
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
        throw new UnsupportedOperationException("Method not decompiled: Cccc.C0912Wwwwwwwwwwwwwwwwww.Wwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwww():void");
    }

    public C0912Wwwwwwwwwwwwwwwwww(byte[] bArr) {
        this(bArr, bArr.length);
    }

    public C0912Wwwwwwwwwwwwwwwwww(byte[] bArr, int i) {
        this.f973Wwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwww = bArr;
        this.f13376Wwwwwwwwwwwwwwwwwwwwwwwwwwwwwwww = i;
    }
}
