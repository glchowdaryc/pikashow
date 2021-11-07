package Ccccc;

import android.content.Context;
import android.content.res.AssetFileDescriptor;
import android.content.res.Resources;
import android.net.Uri;
import android.text.TextUtils;
import java.io.EOFException;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;

/* renamed from: Ccccc.Wwwwwww */
public final class C0941Wwwwwww extends C0987Wwwwwwwwwwwwwwwwwwwwwwwwwwwwww {

    /* renamed from: Wwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwww  reason: collision with root package name */
    public boolean f13414Wwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwww;

    /* renamed from: Wwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwww  reason: collision with root package name */
    public long f13415Wwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwww;

    /* renamed from: Wwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwww  reason: collision with other field name */
    public AssetFileDescriptor f1007Wwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwww;

    /* renamed from: Wwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwww  reason: collision with other field name */
    public final Resources f1008Wwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwww;

    /* renamed from: Wwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwww  reason: collision with other field name */
    public Uri f1009Wwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwww;

    /* renamed from: Wwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwww  reason: collision with other field name */
    public InputStream f1010Wwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwww;

    /* renamed from: Ccccc.Wwwwwww$Wwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwww */
    public static class C0942Wwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwww extends IOException {
        public C0942Wwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwww(String str) {
            super(str);
        }

        public C0942Wwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwww(IOException iOException) {
            super(iOException);
        }
    }

    public C0941Wwwwwww(Context context) {
        super(false);
        this.f1008Wwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwww = context.getResources();
    }

    public long Wwwwwwwwwwwwwwwwwwwwwwwwwwwwww(C0978Wwwwwwwwwwwwwwwwwwwwwww wwwwwwwwwwwwwwwwwwwwwww) {
        try {
            Uri uri = wwwwwwwwwwwwwwwwwwwwwww.f1078Wwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwww;
            this.f1009Wwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwww = uri;
            if (TextUtils.equals("rawresource", uri.getScheme())) {
                int parseInt = Integer.parseInt(this.f1009Wwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwww.getLastPathSegment());
                Wwwwwwwwwwwwwwwwwwwwwwwwww(wwwwwwwwwwwwwwwwwwwwwww);
                this.f1007Wwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwww = this.f1008Wwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwww.openRawResourceFd(parseInt);
                FileInputStream fileInputStream = new FileInputStream(this.f1007Wwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwww.getFileDescriptor());
                this.f1010Wwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwww = fileInputStream;
                fileInputStream.skip(this.f1007Wwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwww.getStartOffset());
                if (this.f1010Wwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwww.skip(wwwwwwwwwwwwwwwwwwwwwww.f1076Wwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwww) >= wwwwwwwwwwwwwwwwwwwwwww.f1076Wwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwww) {
                    long j = wwwwwwwwwwwwwwwwwwwwwww.f13462Wwwwwwwwwwwwwwwwwwwwwwwwwwwwwwww;
                    long j2 = -1;
                    if (j != -1) {
                        this.f13415Wwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwww = j;
                    } else {
                        long length = this.f1007Wwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwww.getLength();
                        if (length != -1) {
                            j2 = length - wwwwwwwwwwwwwwwwwwwwwww.f1076Wwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwww;
                        }
                        this.f13415Wwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwww = j2;
                    }
                    this.f13414Wwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwww = true;
                    Wwwwwwwwwwwwwwwwwwwwwwwww(wwwwwwwwwwwwwwwwwwwwwww);
                    return this.f13415Wwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwww;
                }
                throw new EOFException();
            }
            throw new C0942Wwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwww("URI must use scheme rawresource");
        } catch (NumberFormatException unused) {
            throw new C0942Wwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwww("Resource identifier must be an integer.");
        } catch (IOException e) {
            throw new C0942Wwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwww(e);
        }
    }

    public Uri Wwwwwwwwwwwwwwwwwwwwwwwwwwwwwww() {
        return this.f1009Wwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwww;
    }

    public int Wwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwww(byte[] bArr, int i, int i2) {
        if (i2 == 0) {
            return 0;
        }
        long j = this.f13415Wwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwww;
        if (j == 0) {
            return -1;
        }
        if (j != -1) {
            try {
                i2 = (int) Math.min(j, (long) i2);
            } catch (IOException e) {
                throw new C0942Wwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwww(e);
            }
        }
        int read = this.f1010Wwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwww.read(bArr, i, i2);
        if (read != -1) {
            long j2 = this.f13415Wwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwww;
            if (j2 != -1) {
                this.f13415Wwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwww = j2 - ((long) read);
            }
            Wwwwwwwwwwwwwwwwwwwwwwwwwwww(read);
            return read;
        } else if (this.f13415Wwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwww == -1) {
            return -1;
        } else {
            throw new C0942Wwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwww((IOException) new EOFException());
        }
    }

    public void close() {
        this.f1009Wwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwww = null;
        try {
            InputStream inputStream = this.f1010Wwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwww;
            if (inputStream != null) {
                inputStream.close();
            }
            this.f1010Wwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwww = null;
            try {
                AssetFileDescriptor assetFileDescriptor = this.f1007Wwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwww;
                if (assetFileDescriptor != null) {
                    assetFileDescriptor.close();
                }
                this.f1007Wwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwww = null;
                if (this.f13414Wwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwww) {
                    this.f13414Wwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwww = false;
                    Wwwwwwwwwwwwwwwwwwwwwwwwwww();
                }
            } catch (IOException e) {
                throw new C0942Wwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwww(e);
            } catch (Throwable th) {
                this.f1007Wwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwww = null;
                if (this.f13414Wwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwww) {
                    this.f13414Wwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwww = false;
                    Wwwwwwwwwwwwwwwwwwwwwwwwwww();
                }
                throw th;
            }
        } catch (IOException e2) {
            throw new C0942Wwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwww(e2);
        } catch (Throwable th2) {
            this.f1010Wwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwww = null;
            try {
                AssetFileDescriptor assetFileDescriptor2 = this.f1007Wwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwww;
                if (assetFileDescriptor2 != null) {
                    assetFileDescriptor2.close();
                }
                this.f1007Wwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwww = null;
                if (this.f13414Wwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwww) {
                    this.f13414Wwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwww = false;
                    Wwwwwwwwwwwwwwwwwwwwwwwwwww();
                }
                throw th2;
            } catch (IOException e3) {
                throw new C0942Wwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwww(e3);
            } catch (Throwable th3) {
                this.f1007Wwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwww = null;
                if (this.f13414Wwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwww) {
                    this.f13414Wwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwww = false;
                    Wwwwwwwwwwwwwwwwwwwwwwwwwww();
                }
                throw th3;
            }
        }
    }
}
