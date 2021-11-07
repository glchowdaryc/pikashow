package Cccc;

import com.google.android.exoplayer2.util.C4949Wwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwww;
import com.google.android.exoplayer2.util.C4950Wwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwww;
import java.nio.charset.Charset;

/* renamed from: Cccc.Wwwwwwwwwwwwwwwww */
public final class C0911Wwwwwwwwwwwwwwwww {

    /* renamed from: Wwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwww  reason: collision with root package name */
    public int f13374Wwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwww;

    /* renamed from: Wwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwww  reason: collision with root package name */
    public int f13375Wwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwww;

    /* renamed from: Wwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwww  reason: collision with other field name */
    public byte[] f972Wwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwww;

    public C0911Wwwwwwwwwwwwwwwww() {
        this.f972Wwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwww = C4949Wwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwww.f7452Wwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwww;
    }

    public void Kkkkkkkkkkkkkkkkkk(int i) {
        Kkkkkkkkkkkkkkkkkkk(this.f13375Wwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwww + i);
    }

    public void Kkkkkkkkkkkkkkkkkkk(int i) {
        C4950Wwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwww.Wwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwww(i >= 0 && i <= this.f13374Wwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwww);
        this.f13375Wwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwww = i;
    }

    public void Kkkkkkkkkkkkkkkkkkkk(int i) {
        C4950Wwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwww.Wwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwww(i >= 0 && i <= this.f972Wwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwww.length);
        this.f13374Wwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwww = i;
    }

    public void Kkkkkkkkkkkkkkkkkkkkk(byte[] bArr, int i) {
        this.f972Wwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwww = bArr;
        this.f13374Wwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwww = i;
        this.f13375Wwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwww = 0;
    }

    public void Kkkkkkkkkkkkkkkkkkkkkk(byte[] bArr) {
        Kkkkkkkkkkkkkkkkkkkkk(bArr, bArr.length);
    }

    public void Kkkkkkkkkkkkkkkkkkkkkkk(int i) {
        Kkkkkkkkkkkkkkkkkkkkk(Wwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwww() < i ? new byte[i] : this.f972Wwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwww, i);
    }

    public void Kkkkkkkkkkkkkkkkkkkkkkkk() {
        this.f13375Wwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwww = 0;
        this.f13374Wwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwww = 0;
    }

    public long Kkkkkkkkkkkkkkkkkkkkkkkkk() {
        int i;
        int i2;
        long j = (long) this.f972Wwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwww[this.f13375Wwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwww];
        int i3 = 7;
        while (true) {
            i = 1;
            if (i3 < 0) {
                break;
            }
            int i4 = 1 << i3;
            if ((((long) i4) & j) != 0) {
                i3--;
            } else if (i3 < 6) {
                j &= (long) (i4 - 1);
                i2 = 7 - i3;
            } else if (i3 == 7) {
                i2 = 1;
            }
        }
        i2 = 0;
        if (i2 != 0) {
            while (i < i2) {
                byte b = this.f972Wwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwww[this.f13375Wwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwww + i];
                if ((b & 192) == 128) {
                    j = (j << 6) | ((long) (b & 63));
                    i++;
                } else {
                    throw new NumberFormatException("Invalid UTF-8 sequence continuation byte: " + j);
                }
            }
            this.f13375Wwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwww += i2;
            return j;
        }
        throw new NumberFormatException("Invalid UTF-8 sequence first byte: " + j);
    }

    public int Kkkkkkkkkkkkkkkkkkkkkkkkkk() {
        byte[] bArr = this.f972Wwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwww;
        int i = this.f13375Wwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwww;
        int i2 = i + 1;
        this.f13375Wwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwww = i2;
        this.f13375Wwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwww = i2 + 1;
        return (bArr[i2] & 255) | ((bArr[i] & 255) << 8);
    }

    public long Www() {
        long Wwwwwwwwwwwwwww2 = Wwwwwwwwwwwwwww();
        if (Wwwwwwwwwwwwwww2 >= 0) {
            return Wwwwwwwwwwwwwww2;
        }
        throw new IllegalStateException("Top bit not zero: " + Wwwwwwwwwwwwwww2);
    }

    public int Wwww() {
        int Wwwwwwwwwwwwwwwwwwwwwwww2 = Wwwwwwwwwwwwwwwwwwwwwwww();
        if (Wwwwwwwwwwwwwwwwwwwwwwww2 >= 0) {
            return Wwwwwwwwwwwwwwwwwwwwwwww2;
        }
        throw new IllegalStateException("Top bit not zero: " + Wwwwwwwwwwwwwwwwwwwwwwww2);
    }

    public int Wwwww() {
        byte[] bArr = this.f972Wwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwww;
        int i = this.f13375Wwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwww;
        int i2 = i + 1;
        this.f13375Wwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwww = i2;
        int i3 = i2 + 1;
        this.f13375Wwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwww = i3;
        byte b = ((bArr[i] & 255) << 16) | ((bArr[i2] & 255) << 8);
        this.f13375Wwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwww = i3 + 1;
        return (bArr[i3] & 255) | b;
    }

    public long Wwwwww() {
        byte[] bArr = this.f972Wwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwww;
        int i = this.f13375Wwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwww;
        int i2 = i + 1;
        this.f13375Wwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwww = i2;
        int i3 = i2 + 1;
        this.f13375Wwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwww = i3;
        int i4 = i3 + 1;
        this.f13375Wwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwww = i4;
        this.f13375Wwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwww = i4 + 1;
        return ((((long) bArr[i]) & 255) << 24) | ((((long) bArr[i2]) & 255) << 16) | ((((long) bArr[i3]) & 255) << 8) | (((long) bArr[i4]) & 255);
    }

    public int Wwwwwww() {
        byte[] bArr = this.f972Wwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwww;
        int i = this.f13375Wwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwww;
        int i2 = i + 1;
        this.f13375Wwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwww = i2;
        int i3 = i2 + 1;
        this.f13375Wwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwww = i3;
        byte b = (bArr[i2] & 255) | ((bArr[i] & 255) << 8);
        this.f13375Wwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwww = i3 + 2;
        return b;
    }

    public int Wwwwwwww() {
        byte[] bArr = this.f972Wwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwww;
        int i = this.f13375Wwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwww;
        this.f13375Wwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwww = i + 1;
        return bArr[i] & 255;
    }

    public int Wwwwwwwww() {
        return (Wwwwwwww() << 21) | (Wwwwwwww() << 14) | (Wwwwwwww() << 7) | Wwwwwwww();
    }

    public String Wwwwwwwwww(int i, Charset charset) {
        String str = new String(this.f972Wwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwww, this.f13375Wwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwww, i, charset);
        this.f13375Wwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwww += i;
        return str;
    }

    public String Wwwwwwwwwww(int i) {
        return Wwwwwwwwww(i, Charset.forName("UTF-8"));
    }

    public short Wwwwwwwwwwww() {
        byte[] bArr = this.f972Wwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwww;
        int i = this.f13375Wwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwww;
        int i2 = i + 1;
        this.f13375Wwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwww = i2;
        this.f13375Wwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwww = i2 + 1;
        return (short) ((bArr[i2] & 255) | ((bArr[i] & 255) << 8));
    }

    public String Wwwwwwwwwwwww(int i) {
        if (i == 0) {
            return "";
        }
        int i2 = this.f13375Wwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwww;
        int i3 = (i2 + i) - 1;
        String Wwwwwwwwwww2 = C4949Wwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwww.Wwwwwwwwwww(this.f972Wwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwww, i2, (i3 >= this.f13374Wwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwww || this.f972Wwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwww[i3] != 0) ? i : i - 1);
        this.f13375Wwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwww += i;
        return Wwwwwwwwwww2;
    }

    public String Wwwwwwwwwwwwww() {
        if (Wwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwww() == 0) {
            return null;
        }
        int i = this.f13375Wwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwww;
        while (i < this.f13374Wwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwww && this.f972Wwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwww[i] != 0) {
            i++;
        }
        byte[] bArr = this.f972Wwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwww;
        int i2 = this.f13375Wwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwww;
        String Wwwwwwwwwww2 = C4949Wwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwww.Wwwwwwwwwww(bArr, i2, i - i2);
        this.f13375Wwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwww = i;
        if (i < this.f13374Wwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwww) {
            this.f13375Wwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwww = i + 1;
        }
        return Wwwwwwwwwww2;
    }

    public long Wwwwwwwwwwwwwww() {
        byte[] bArr = this.f972Wwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwww;
        int i = this.f13375Wwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwww;
        int i2 = i + 1;
        this.f13375Wwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwww = i2;
        int i3 = i2 + 1;
        this.f13375Wwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwww = i3;
        int i4 = i3 + 1;
        this.f13375Wwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwww = i4;
        int i5 = i4 + 1;
        this.f13375Wwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwww = i5;
        int i6 = i5 + 1;
        this.f13375Wwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwww = i6;
        int i7 = i6 + 1;
        this.f13375Wwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwww = i7;
        int i8 = i7 + 1;
        this.f13375Wwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwww = i8;
        this.f13375Wwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwww = i8 + 1;
        return ((((long) bArr[i]) & 255) << 56) | ((((long) bArr[i2]) & 255) << 48) | ((((long) bArr[i3]) & 255) << 40) | ((((long) bArr[i4]) & 255) << 32) | ((((long) bArr[i5]) & 255) << 24) | ((((long) bArr[i6]) & 255) << 16) | ((((long) bArr[i7]) & 255) << 8) | (((long) bArr[i8]) & 255);
    }

    public int Wwwwwwwwwwwwwwww() {
        byte[] bArr = this.f972Wwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwww;
        int i = this.f13375Wwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwww;
        int i2 = i + 1;
        this.f13375Wwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwww = i2;
        this.f13375Wwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwww = i2 + 1;
        return ((bArr[i2] & 255) << 8) | (bArr[i] & 255);
    }

    public int Wwwwwwwwwwwwwwwww() {
        int Wwwwwwwwwwwwwwwwwwwww2 = Wwwwwwwwwwwwwwwwwwwww();
        if (Wwwwwwwwwwwwwwwwwwwww2 >= 0) {
            return Wwwwwwwwwwwwwwwwwwwww2;
        }
        throw new IllegalStateException("Top bit not zero: " + Wwwwwwwwwwwwwwwwwwwww2);
    }

    public long Wwwwwwwwwwwwwwwwww() {
        byte[] bArr = this.f972Wwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwww;
        int i = this.f13375Wwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwww;
        int i2 = i + 1;
        this.f13375Wwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwww = i2;
        int i3 = i2 + 1;
        this.f13375Wwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwww = i3;
        int i4 = i3 + 1;
        this.f13375Wwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwww = i4;
        this.f13375Wwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwww = i4 + 1;
        return (((long) bArr[i]) & 255) | ((((long) bArr[i2]) & 255) << 8) | ((((long) bArr[i3]) & 255) << 16) | ((((long) bArr[i4]) & 255) << 24);
    }

    public short Wwwwwwwwwwwwwwwwwww() {
        byte[] bArr = this.f972Wwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwww;
        int i = this.f13375Wwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwww;
        int i2 = i + 1;
        this.f13375Wwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwww = i2;
        this.f13375Wwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwww = i2 + 1;
        return (short) (((bArr[i2] & 255) << 8) | (bArr[i] & 255));
    }

    public long Wwwwwwwwwwwwwwwwwwww() {
        byte[] bArr = this.f972Wwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwww;
        int i = this.f13375Wwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwww;
        int i2 = i + 1;
        this.f13375Wwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwww = i2;
        int i3 = i2 + 1;
        this.f13375Wwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwww = i3;
        int i4 = i3 + 1;
        this.f13375Wwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwww = i4;
        int i5 = i4 + 1;
        this.f13375Wwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwww = i5;
        int i6 = i5 + 1;
        this.f13375Wwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwww = i6;
        int i7 = i6 + 1;
        this.f13375Wwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwww = i7;
        int i8 = i7 + 1;
        this.f13375Wwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwww = i8;
        this.f13375Wwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwww = i8 + 1;
        return (((long) bArr[i]) & 255) | ((((long) bArr[i2]) & 255) << 8) | ((((long) bArr[i3]) & 255) << 16) | ((((long) bArr[i4]) & 255) << 24) | ((((long) bArr[i5]) & 255) << 32) | ((((long) bArr[i6]) & 255) << 40) | ((((long) bArr[i7]) & 255) << 48) | ((((long) bArr[i8]) & 255) << 56);
    }

    public int Wwwwwwwwwwwwwwwwwwwww() {
        byte[] bArr = this.f972Wwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwww;
        int i = this.f13375Wwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwww;
        int i2 = i + 1;
        this.f13375Wwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwww = i2;
        int i3 = i2 + 1;
        this.f13375Wwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwww = i3;
        byte b = (bArr[i] & 255) | ((bArr[i2] & 255) << 8);
        int i4 = i3 + 1;
        this.f13375Wwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwww = i4;
        byte b2 = b | ((bArr[i3] & 255) << 16);
        this.f13375Wwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwww = i4 + 1;
        return ((bArr[i4] & 255) << 24) | b2;
    }

    public String Wwwwwwwwwwwwwwwwwwwwww() {
        if (Wwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwww() == 0) {
            return null;
        }
        int i = this.f13375Wwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwww;
        while (i < this.f13374Wwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwww && !C4949Wwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwww.Kkkkkkkkk(this.f972Wwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwww[i])) {
            i++;
        }
        int i2 = this.f13375Wwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwww;
        if (i - i2 >= 3) {
            byte[] bArr = this.f972Wwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwww;
            if (bArr[i2] == -17 && bArr[i2 + 1] == -69 && bArr[i2 + 2] == -65) {
                this.f13375Wwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwww = i2 + 3;
            }
        }
        byte[] bArr2 = this.f972Wwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwww;
        int i3 = this.f13375Wwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwww;
        String Wwwwwwwwwww2 = C4949Wwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwww.Wwwwwwwwwww(bArr2, i3, i - i3);
        this.f13375Wwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwww = i;
        int i4 = this.f13374Wwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwww;
        if (i == i4) {
            return Wwwwwwwwwww2;
        }
        byte[] bArr3 = this.f972Wwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwww;
        if (bArr3[i] == 13) {
            int i5 = i + 1;
            this.f13375Wwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwww = i5;
            if (i5 == i4) {
                return Wwwwwwwwwww2;
            }
        }
        int i6 = this.f13375Wwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwww;
        if (bArr3[i6] == 10) {
            this.f13375Wwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwww = i6 + 1;
        }
        return Wwwwwwwwwww2;
    }

    public int Wwwwwwwwwwwwwwwwwwwwwww() {
        byte[] bArr = this.f972Wwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwww;
        int i = this.f13375Wwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwww;
        int i2 = i + 1;
        this.f13375Wwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwww = i2;
        int i3 = i2 + 1;
        this.f13375Wwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwww = i3;
        byte b = (((bArr[i] & 255) << 24) >> 8) | ((bArr[i2] & 255) << 8);
        this.f13375Wwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwww = i3 + 1;
        return (bArr[i3] & 255) | b;
    }

    public int Wwwwwwwwwwwwwwwwwwwwwwww() {
        byte[] bArr = this.f972Wwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwww;
        int i = this.f13375Wwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwww;
        int i2 = i + 1;
        this.f13375Wwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwww = i2;
        int i3 = i2 + 1;
        this.f13375Wwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwww = i3;
        byte b = ((bArr[i] & 255) << 24) | ((bArr[i2] & 255) << 16);
        int i4 = i3 + 1;
        this.f13375Wwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwww = i4;
        byte b2 = b | ((bArr[i3] & 255) << 8);
        this.f13375Wwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwww = i4 + 1;
        return (bArr[i4] & 255) | b2;
    }

    public float Wwwwwwwwwwwwwwwwwwwwwwwww() {
        return Float.intBitsToFloat(Wwwwwwwwwwwwwwwwwwwwwwww());
    }

    public double Wwwwwwwwwwwwwwwwwwwwwwwwww() {
        return Double.longBitsToDouble(Wwwwwwwwwwwwwww());
    }

    public void Wwwwwwwwwwwwwwwwwwwwwwwwwww(byte[] bArr, int i, int i2) {
        System.arraycopy(this.f972Wwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwww, this.f13375Wwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwww, bArr, i, i2);
        this.f13375Wwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwww += i2;
    }

    public void Wwwwwwwwwwwwwwwwwwwwwwwwwwww(C0912Wwwwwwwwwwwwwwwwww wwwwwwwwwwwwwwwwww, int i) {
        Wwwwwwwwwwwwwwwwwwwwwwwwwww(wwwwwwwwwwwwwwwwww.f973Wwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwww, 0, i);
        wwwwwwwwwwwwwwwwww.Wwwwwwwwwwwwwwwwwwwww(0);
    }

    public int Wwwwwwwwwwwwwwwwwwwwwwwwwwwww() {
        return this.f972Wwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwww[this.f13375Wwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwww] & 255;
    }

    public char Wwwwwwwwwwwwwwwwwwwwwwwwwwwwww() {
        byte[] bArr = this.f972Wwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwww;
        int i = this.f13375Wwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwww;
        return (char) ((bArr[i + 1] & 255) | ((bArr[i] & 255) << 8));
    }

    public int Wwwwwwwwwwwwwwwwwwwwwwwwwwwwwww() {
        return this.f13374Wwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwww;
    }

    public int Wwwwwwwwwwwwwwwwwwwwwwwwwwwwwwww() {
        return this.f13375Wwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwww;
    }

    public int Wwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwww() {
        return this.f972Wwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwww.length;
    }

    public int Wwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwww() {
        return this.f13374Wwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwww - this.f13375Wwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwww;
    }

    public C0911Wwwwwwwwwwwwwwwww(int i) {
        this.f972Wwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwww = new byte[i];
        this.f13374Wwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwww = i;
    }

    public C0911Wwwwwwwwwwwwwwwww(byte[] bArr) {
        this.f972Wwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwww = bArr;
        this.f13374Wwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwww = bArr.length;
    }

    public C0911Wwwwwwwwwwwwwwwww(byte[] bArr, int i) {
        this.f972Wwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwww = bArr;
        this.f13374Wwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwww = i;
    }
}
