package Ccccc;

import android.net.Uri;
import com.google.android.exoplayer2.util.C4950Wwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwww;
import java.util.Arrays;

/* renamed from: Ccccc.Wwwwwwwwwwwwwwwwwwwwwww */
public final class C0978Wwwwwwwwwwwwwwwwwwwwwww {

    /* renamed from: Wwwwwwwwwwwwwwwwwwwwwwwwwwwwwwww  reason: collision with root package name */
    public final long f13462Wwwwwwwwwwwwwwwwwwwwwwwwwwwwwwww;

    /* renamed from: Wwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwww  reason: collision with root package name */
    public final int f13463Wwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwww;

    /* renamed from: Wwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwww  reason: collision with other field name */
    public final long f1076Wwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwww;

    /* renamed from: Wwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwww  reason: collision with root package name */
    public final int f13464Wwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwww;

    /* renamed from: Wwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwww  reason: collision with other field name */
    public final long f1077Wwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwww;

    /* renamed from: Wwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwww  reason: collision with other field name */
    public final Uri f1078Wwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwww;

    /* renamed from: Wwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwww  reason: collision with other field name */
    public final String f1079Wwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwww;

    /* renamed from: Wwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwww  reason: collision with other field name */
    public final byte[] f1080Wwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwww;

    public C0978Wwwwwwwwwwwwwwwwwwwwwww(Uri uri, int i) {
        this(uri, 0, -1, (String) null, i);
    }

    public static String Wwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwww(int i) {
        if (i == 1) {
            return "GET";
        }
        if (i == 2) {
            return "POST";
        }
        if (i == 3) {
            return "HEAD";
        }
        throw new AssertionError(i);
    }

    public C0978Wwwwwwwwwwwwwwwwwwwwwww Wwwwwwwwwwwwwwwwwwwwwwwwwwwwww(long j, long j2) {
        if (j == 0 && this.f13462Wwwwwwwwwwwwwwwwwwwwwwwwwwwwwwww == j2) {
            return this;
        }
        return new C0978Wwwwwwwwwwwwwwwwwwwwwww(this.f1078Wwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwww, this.f13464Wwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwww, this.f1080Wwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwww, this.f1077Wwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwww + j, this.f1076Wwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwww + j, j2, this.f1079Wwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwww, this.f13463Wwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwww);
    }

    public C0978Wwwwwwwwwwwwwwwwwwwwwww Wwwwwwwwwwwwwwwwwwwwwwwwwwwwwww(long j) {
        long j2 = this.f13462Wwwwwwwwwwwwwwwwwwwwwwwwwwwwwwww;
        long j3 = -1;
        if (j2 != -1) {
            j3 = j2 - j;
        }
        return Wwwwwwwwwwwwwwwwwwwwwwwwwwwwww(j, j3);
    }

    public boolean Wwwwwwwwwwwwwwwwwwwwwwwwwwwwwwww(int i) {
        return (this.f13463Wwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwww & i) == i;
    }

    public final String Wwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwww() {
        return Wwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwww(this.f13464Wwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwww);
    }

    public String toString() {
        return "DataSpec[" + Wwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwww() + " " + this.f1078Wwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwww + ", " + Arrays.toString(this.f1080Wwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwww) + ", " + this.f1077Wwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwww + ", " + this.f1076Wwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwww + ", " + this.f13462Wwwwwwwwwwwwwwwwwwwwwwwwwwwwwwww + ", " + this.f1079Wwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwww + ", " + this.f13463Wwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwww + "]";
    }

    public C0978Wwwwwwwwwwwwwwwwwwwwwww(Uri uri, long j, long j2, String str) {
        this(uri, j, j, j2, str, 0);
    }

    public C0978Wwwwwwwwwwwwwwwwwwwwwww(Uri uri, long j, long j2, String str, int i) {
        this(uri, j, j, j2, str, i);
    }

    public C0978Wwwwwwwwwwwwwwwwwwwwwww(Uri uri, long j, long j2, long j3, String str, int i) {
        this(uri, (byte[]) null, j, j2, j3, str, i);
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public C0978Wwwwwwwwwwwwwwwwwwwwwww(Uri uri, byte[] bArr, long j, long j2, long j3, String str, int i) {
        this(uri, bArr != null ? 2 : 1, bArr, j, j2, j3, str, i);
    }

    public C0978Wwwwwwwwwwwwwwwwwwwwwww(Uri uri, int i, byte[] bArr, long j, long j2, long j3, String str, int i2) {
        byte[] bArr2 = bArr;
        long j4 = j;
        long j5 = j2;
        long j6 = j3;
        boolean z = true;
        C4950Wwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwww.Wwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwww(j4 >= 0);
        C4950Wwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwww.Wwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwww(j5 >= 0);
        if (j6 <= 0 && j6 != -1) {
            z = false;
        }
        C4950Wwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwww.Wwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwww(z);
        this.f1078Wwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwww = uri;
        this.f13464Wwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwww = i;
        this.f1080Wwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwww = (bArr2 == null || bArr2.length == 0) ? null : bArr2;
        this.f1077Wwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwww = j4;
        this.f1076Wwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwww = j5;
        this.f13462Wwwwwwwwwwwwwwwwwwwwwwwwwwwwwwww = j6;
        this.f1079Wwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwww = str;
        this.f13463Wwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwww = i2;
    }
}
