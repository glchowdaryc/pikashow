package Ccccc;

import android.content.Context;
import android.content.res.AssetManager;
import android.net.Uri;
import java.io.EOFException;
import java.io.IOException;
import java.io.InputStream;

/* renamed from: Ccccc.Wwwwwwwwwwwwwwwwwwwwwwwwwwwwwwww */
public final class C0990Wwwwwwwwwwwwwwwwwwwwwwwwwwwwwwww extends C0987Wwwwwwwwwwwwwwwwwwwwwwwwwwwwww {

    /* renamed from: Wwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwww  reason: collision with root package name */
    public boolean f13474Wwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwww;

    /* renamed from: Wwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwww  reason: collision with root package name */
    public long f13475Wwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwww;

    /* renamed from: Wwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwww  reason: collision with other field name */
    public final AssetManager f1092Wwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwww;

    /* renamed from: Wwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwww  reason: collision with other field name */
    public Uri f1093Wwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwww;

    /* renamed from: Wwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwww  reason: collision with other field name */
    public InputStream f1094Wwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwww;

    /* renamed from: Ccccc.Wwwwwwwwwwwwwwwwwwwwwwwwwwwwwwww$Wwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwww */
    public static final class C0991Wwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwww extends IOException {
        public C0991Wwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwww(IOException iOException) {
            super(iOException);
        }
    }

    public C0990Wwwwwwwwwwwwwwwwwwwwwwwwwwwwwwww(Context context) {
        super(false);
        this.f1092Wwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwww = context.getAssets();
    }

    public long Wwwwwwwwwwwwwwwwwwwwwwwwwwwwww(C0978Wwwwwwwwwwwwwwwwwwwwwww wwwwwwwwwwwwwwwwwwwwwww) {
        try {
            Uri uri = wwwwwwwwwwwwwwwwwwwwwww.f1078Wwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwww;
            this.f1093Wwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwww = uri;
            String path = uri.getPath();
            if (path.startsWith("/android_asset/")) {
                path = path.substring(15);
            } else if (path.startsWith("/")) {
                path = path.substring(1);
            }
            Wwwwwwwwwwwwwwwwwwwwwwwwww(wwwwwwwwwwwwwwwwwwwwwww);
            InputStream open = this.f1092Wwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwww.open(path, 1);
            this.f1094Wwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwww = open;
            if (open.skip(wwwwwwwwwwwwwwwwwwwwwww.f1076Wwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwww) >= wwwwwwwwwwwwwwwwwwwwwww.f1076Wwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwww) {
                long j = wwwwwwwwwwwwwwwwwwwwwww.f13462Wwwwwwwwwwwwwwwwwwwwwwwwwwwwwwww;
                if (j != -1) {
                    this.f13475Wwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwww = j;
                } else {
                    long available = (long) this.f1094Wwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwww.available();
                    this.f13475Wwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwww = available;
                    if (available == 2147483647L) {
                        this.f13475Wwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwww = -1;
                    }
                }
                this.f13474Wwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwww = true;
                Wwwwwwwwwwwwwwwwwwwwwwwww(wwwwwwwwwwwwwwwwwwwwwww);
                return this.f13475Wwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwww;
            }
            throw new EOFException();
        } catch (IOException e) {
            throw new C0991Wwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwww(e);
        }
    }

    public Uri Wwwwwwwwwwwwwwwwwwwwwwwwwwwwwww() {
        return this.f1093Wwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwww;
    }

    public int Wwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwww(byte[] bArr, int i, int i2) {
        if (i2 == 0) {
            return 0;
        }
        long j = this.f13475Wwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwww;
        if (j == 0) {
            return -1;
        }
        if (j != -1) {
            try {
                i2 = (int) Math.min(j, (long) i2);
            } catch (IOException e) {
                throw new C0991Wwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwww(e);
            }
        }
        int read = this.f1094Wwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwww.read(bArr, i, i2);
        if (read != -1) {
            long j2 = this.f13475Wwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwww;
            if (j2 != -1) {
                this.f13475Wwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwww = j2 - ((long) read);
            }
            Wwwwwwwwwwwwwwwwwwwwwwwwwwww(read);
            return read;
        } else if (this.f13475Wwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwww == -1) {
            return -1;
        } else {
            throw new C0991Wwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwww(new EOFException());
        }
    }

    public void close() {
        this.f1093Wwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwww = null;
        try {
            InputStream inputStream = this.f1094Wwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwww;
            if (inputStream != null) {
                inputStream.close();
            }
            this.f1094Wwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwww = null;
            if (this.f13474Wwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwww) {
                this.f13474Wwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwww = false;
                Wwwwwwwwwwwwwwwwwwwwwwwwwww();
            }
        } catch (IOException e) {
            throw new C0991Wwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwww(e);
        } catch (Throwable th) {
            this.f1094Wwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwww = null;
            if (this.f13474Wwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwww) {
                this.f13474Wwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwww = false;
                Wwwwwwwwwwwwwwwwwwwwwwwwwww();
            }
            throw th;
        }
    }
}
