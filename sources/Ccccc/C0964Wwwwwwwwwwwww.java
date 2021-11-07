package Ccccc;

import android.net.Uri;
import java.io.EOFException;
import java.io.IOException;
import java.io.RandomAccessFile;

/* renamed from: Ccccc.Wwwwwwwwwwwww */
public final class C0964Wwwwwwwwwwwww extends C0987Wwwwwwwwwwwwwwwwwwwwwwwwwwwwww {

    /* renamed from: Wwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwww  reason: collision with root package name */
    public boolean f13428Wwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwww;

    /* renamed from: Wwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwww  reason: collision with root package name */
    public long f13429Wwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwww;

    /* renamed from: Wwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwww  reason: collision with other field name */
    public Uri f1027Wwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwww;

    /* renamed from: Wwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwww  reason: collision with other field name */
    public RandomAccessFile f1028Wwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwww;

    /* renamed from: Ccccc.Wwwwwwwwwwwww$Wwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwww */
    public static class C0965Wwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwww extends IOException {
        public C0965Wwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwww(IOException iOException) {
            super(iOException);
        }
    }

    public C0964Wwwwwwwwwwwww() {
        super(false);
    }

    public long Wwwwwwwwwwwwwwwwwwwwwwwwwwwwww(C0978Wwwwwwwwwwwwwwwwwwwwwww wwwwwwwwwwwwwwwwwwwwwww) {
        try {
            this.f1027Wwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwww = wwwwwwwwwwwwwwwwwwwwwww.f1078Wwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwww;
            Wwwwwwwwwwwwwwwwwwwwwwwwww(wwwwwwwwwwwwwwwwwwwwwww);
            RandomAccessFile randomAccessFile = new RandomAccessFile(wwwwwwwwwwwwwwwwwwwwwww.f1078Wwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwww.getPath(), "r");
            this.f1028Wwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwww = randomAccessFile;
            randomAccessFile.seek(wwwwwwwwwwwwwwwwwwwwwww.f1076Wwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwww);
            long j = wwwwwwwwwwwwwwwwwwwwwww.f13462Wwwwwwwwwwwwwwwwwwwwwwwwwwwwwwww;
            if (j == -1) {
                j = this.f1028Wwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwww.length() - wwwwwwwwwwwwwwwwwwwwwww.f1076Wwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwww;
            }
            this.f13429Wwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwww = j;
            if (j >= 0) {
                this.f13428Wwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwww = true;
                Wwwwwwwwwwwwwwwwwwwwwwwww(wwwwwwwwwwwwwwwwwwwwwww);
                return this.f13429Wwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwww;
            }
            throw new EOFException();
        } catch (IOException e) {
            throw new C0965Wwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwww(e);
        }
    }

    public Uri Wwwwwwwwwwwwwwwwwwwwwwwwwwwwwww() {
        return this.f1027Wwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwww;
    }

    public int Wwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwww(byte[] bArr, int i, int i2) {
        if (i2 == 0) {
            return 0;
        }
        long j = this.f13429Wwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwww;
        if (j == 0) {
            return -1;
        }
        try {
            int read = this.f1028Wwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwww.read(bArr, i, (int) Math.min(j, (long) i2));
            if (read > 0) {
                this.f13429Wwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwww -= (long) read;
                Wwwwwwwwwwwwwwwwwwwwwwwwwwww(read);
            }
            return read;
        } catch (IOException e) {
            throw new C0965Wwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwww(e);
        }
    }

    public void close() {
        this.f1027Wwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwww = null;
        try {
            RandomAccessFile randomAccessFile = this.f1028Wwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwww;
            if (randomAccessFile != null) {
                randomAccessFile.close();
            }
            this.f1028Wwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwww = null;
            if (this.f13428Wwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwww) {
                this.f13428Wwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwww = false;
                Wwwwwwwwwwwwwwwwwwwwwwwwwww();
            }
        } catch (IOException e) {
            throw new C0965Wwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwww(e);
        } catch (Throwable th) {
            this.f1028Wwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwww = null;
            if (this.f13428Wwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwww) {
                this.f13428Wwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwww = false;
                Wwwwwwwwwwwwwwwwwwwwwwwwwww();
            }
            throw th;
        }
    }
}
