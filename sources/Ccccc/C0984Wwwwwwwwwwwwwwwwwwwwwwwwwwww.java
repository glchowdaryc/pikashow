package Ccccc;

import Llllllllll.C2042Kkkkkkkkkkkkkkkkkkkkkkk;
import android.net.Uri;
import android.util.Base64;
import com.google.android.exoplayer2.util.C4949Wwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwww;
import java.net.URLDecoder;

/* renamed from: Ccccc.Wwwwwwwwwwwwwwwwwwwwwwwwwwww */
public final class C0984Wwwwwwwwwwwwwwwwwwwwwwwwwwww extends C0987Wwwwwwwwwwwwwwwwwwwwwwwwwwwwww {

    /* renamed from: Wwwwwwwwwwwwwwwwwwwwwwwwwwwwwwww  reason: collision with root package name */
    public int f13468Wwwwwwwwwwwwwwwwwwwwwwwwwwwwwwww;

    /* renamed from: Wwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwww  reason: collision with root package name */
    public int f13469Wwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwww;

    /* renamed from: Wwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwww  reason: collision with other field name */
    public C0978Wwwwwwwwwwwwwwwwwwwwwww f1084Wwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwww;

    /* renamed from: Wwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwww  reason: collision with root package name */
    public byte[] f13470Wwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwww;

    public C0984Wwwwwwwwwwwwwwwwwwwwwwwwwwww() {
        super(false);
    }

    public long Wwwwwwwwwwwwwwwwwwwwwwwwwwwwww(C0978Wwwwwwwwwwwwwwwwwwwwwww wwwwwwwwwwwwwwwwwwwwwww) {
        Wwwwwwwwwwwwwwwwwwwwwwwwww(wwwwwwwwwwwwwwwwwwwwwww);
        this.f1084Wwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwww = wwwwwwwwwwwwwwwwwwwwwww;
        this.f13468Wwwwwwwwwwwwwwwwwwwwwwwwwwwwwwww = (int) wwwwwwwwwwwwwwwwwwwwwww.f1076Wwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwww;
        Uri uri = wwwwwwwwwwwwwwwwwwwwwww.f1078Wwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwww;
        String scheme = uri.getScheme();
        if ("data".equals(scheme)) {
            String[] Illlllllllllllllllll2 = C4949Wwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwww.Illlllllllllllllllll(uri.getSchemeSpecificPart(), ",");
            if (Illlllllllllllllllll2.length == 2) {
                String str = Illlllllllllllllllll2[1];
                if (Illlllllllllllllllll2[0].contains(";base64")) {
                    try {
                        this.f13470Wwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwww = Base64.decode(str, 0);
                    } catch (IllegalArgumentException e) {
                        throw new C2042Kkkkkkkkkkkkkkkkkkkkkkk("Error while parsing Base64 encoded string: " + str, e);
                    }
                } else {
                    this.f13470Wwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwww = C4949Wwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwww.Kkkkkkkkkkkkk(URLDecoder.decode(str, "US-ASCII"));
                }
                long j = wwwwwwwwwwwwwwwwwwwwwww.f13462Wwwwwwwwwwwwwwwwwwwwwwwwwwwwwwww;
                int length = j != -1 ? ((int) j) + this.f13468Wwwwwwwwwwwwwwwwwwwwwwwwwwwwwwww : this.f13470Wwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwww.length;
                this.f13469Wwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwww = length;
                if (length > this.f13470Wwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwww.length || this.f13468Wwwwwwwwwwwwwwwwwwwwwwwwwwwwwwww > length) {
                    this.f13470Wwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwww = null;
                    throw new C0980Wwwwwwwwwwwwwwwwwwwwwwwww(0);
                }
                Wwwwwwwwwwwwwwwwwwwwwwwww(wwwwwwwwwwwwwwwwwwwwwww);
                return ((long) this.f13469Wwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwww) - ((long) this.f13468Wwwwwwwwwwwwwwwwwwwwwwwwwwwwwwww);
            }
            throw new C2042Kkkkkkkkkkkkkkkkkkkkkkk("Unexpected URI format: " + uri);
        }
        throw new C2042Kkkkkkkkkkkkkkkkkkkkkkk("Unsupported scheme: " + scheme);
    }

    public Uri Wwwwwwwwwwwwwwwwwwwwwwwwwwwwwww() {
        C0978Wwwwwwwwwwwwwwwwwwwwwww wwwwwwwwwwwwwwwwwwwwwww = this.f1084Wwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwww;
        if (wwwwwwwwwwwwwwwwwwwwwww != null) {
            return wwwwwwwwwwwwwwwwwwwwwww.f1078Wwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwww;
        }
        return null;
    }

    public int Wwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwww(byte[] bArr, int i, int i2) {
        if (i2 == 0) {
            return 0;
        }
        int i3 = this.f13469Wwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwww - this.f13468Wwwwwwwwwwwwwwwwwwwwwwwwwwwwwwww;
        if (i3 == 0) {
            return -1;
        }
        int min = Math.min(i2, i3);
        System.arraycopy(C4949Wwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwww.Wwwwwwwwwwwwwwwwwwwwwwwwwwww(this.f13470Wwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwww), this.f13468Wwwwwwwwwwwwwwwwwwwwwwwwwwwwwwww, bArr, i, min);
        this.f13468Wwwwwwwwwwwwwwwwwwwwwwwwwwwwwwww += min;
        Wwwwwwwwwwwwwwwwwwwwwwwwwwww(min);
        return min;
    }

    public void close() {
        if (this.f13470Wwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwww != null) {
            this.f13470Wwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwww = null;
            Wwwwwwwwwwwwwwwwwwwwwwwwwww();
        }
        this.f1084Wwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwww = null;
    }
}
