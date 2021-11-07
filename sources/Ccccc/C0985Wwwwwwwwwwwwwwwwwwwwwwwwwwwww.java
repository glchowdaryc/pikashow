package Ccccc;

import android.content.ContentResolver;
import android.content.Context;
import android.content.res.AssetFileDescriptor;
import android.net.Uri;
import java.io.EOFException;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.nio.channels.FileChannel;

/* renamed from: Ccccc.Wwwwwwwwwwwwwwwwwwwwwwwwwwwww */
public final class C0985Wwwwwwwwwwwwwwwwwwwwwwwwwwwww extends C0987Wwwwwwwwwwwwwwwwwwwwwwwwwwwwww {

    /* renamed from: Wwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwww  reason: collision with root package name */
    public boolean f13471Wwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwww;

    /* renamed from: Wwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwww  reason: collision with root package name */
    public long f13472Wwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwww;

    /* renamed from: Wwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwww  reason: collision with other field name */
    public final ContentResolver f1085Wwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwww;

    /* renamed from: Wwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwww  reason: collision with other field name */
    public AssetFileDescriptor f1086Wwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwww;

    /* renamed from: Wwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwww  reason: collision with other field name */
    public Uri f1087Wwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwww;

    /* renamed from: Wwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwww  reason: collision with other field name */
    public FileInputStream f1088Wwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwww;

    /* renamed from: Ccccc.Wwwwwwwwwwwwwwwwwwwwwwwwwwwww$Wwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwww */
    public static class C0986Wwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwww extends IOException {
        public C0986Wwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwww(IOException iOException) {
            super(iOException);
        }
    }

    public C0985Wwwwwwwwwwwwwwwwwwwwwwwwwwwww(Context context) {
        super(false);
        this.f1085Wwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwww = context.getContentResolver();
    }

    public long Wwwwwwwwwwwwwwwwwwwwwwwwwwwwww(C0978Wwwwwwwwwwwwwwwwwwwwwww wwwwwwwwwwwwwwwwwwwwwww) {
        try {
            this.f1087Wwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwww = wwwwwwwwwwwwwwwwwwwwwww.f1078Wwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwww;
            Wwwwwwwwwwwwwwwwwwwwwwwwww(wwwwwwwwwwwwwwwwwwwwwww);
            AssetFileDescriptor openAssetFileDescriptor = this.f1085Wwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwww.openAssetFileDescriptor(this.f1087Wwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwww, "r");
            this.f1086Wwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwww = openAssetFileDescriptor;
            if (openAssetFileDescriptor != null) {
                this.f1088Wwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwww = new FileInputStream(this.f1086Wwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwww.getFileDescriptor());
                long startOffset = this.f1086Wwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwww.getStartOffset();
                long skip = this.f1088Wwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwww.skip(wwwwwwwwwwwwwwwwwwwwwww.f1076Wwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwww + startOffset) - startOffset;
                if (skip == wwwwwwwwwwwwwwwwwwwwwww.f1076Wwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwww) {
                    long j = wwwwwwwwwwwwwwwwwwwwwww.f13462Wwwwwwwwwwwwwwwwwwwwwwwwwwwwwwww;
                    long j2 = -1;
                    if (j != -1) {
                        this.f13472Wwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwww = j;
                    } else {
                        long length = this.f1086Wwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwww.getLength();
                        if (length == -1) {
                            FileChannel channel = this.f1088Wwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwww.getChannel();
                            long size = channel.size();
                            if (size != 0) {
                                j2 = size - channel.position();
                            }
                            this.f13472Wwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwww = j2;
                        } else {
                            this.f13472Wwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwww = length - skip;
                        }
                    }
                    this.f13471Wwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwww = true;
                    Wwwwwwwwwwwwwwwwwwwwwwwww(wwwwwwwwwwwwwwwwwwwwwww);
                    return this.f13472Wwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwww;
                }
                throw new EOFException();
            }
            throw new FileNotFoundException("Could not open file descriptor for: " + this.f1087Wwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwww);
        } catch (IOException e) {
            throw new C0986Wwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwww(e);
        }
    }

    public Uri Wwwwwwwwwwwwwwwwwwwwwwwwwwwwwww() {
        return this.f1087Wwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwww;
    }

    public int Wwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwww(byte[] bArr, int i, int i2) {
        if (i2 == 0) {
            return 0;
        }
        long j = this.f13472Wwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwww;
        if (j == 0) {
            return -1;
        }
        if (j != -1) {
            try {
                i2 = (int) Math.min(j, (long) i2);
            } catch (IOException e) {
                throw new C0986Wwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwww(e);
            }
        }
        int read = this.f1088Wwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwww.read(bArr, i, i2);
        if (read != -1) {
            long j2 = this.f13472Wwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwww;
            if (j2 != -1) {
                this.f13472Wwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwww = j2 - ((long) read);
            }
            Wwwwwwwwwwwwwwwwwwwwwwwwwwww(read);
            return read;
        } else if (this.f13472Wwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwww == -1) {
            return -1;
        } else {
            throw new C0986Wwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwww(new EOFException());
        }
    }

    public void close() {
        this.f1087Wwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwww = null;
        try {
            FileInputStream fileInputStream = this.f1088Wwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwww;
            if (fileInputStream != null) {
                fileInputStream.close();
            }
            this.f1088Wwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwww = null;
            try {
                AssetFileDescriptor assetFileDescriptor = this.f1086Wwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwww;
                if (assetFileDescriptor != null) {
                    assetFileDescriptor.close();
                }
                this.f1086Wwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwww = null;
                if (this.f13471Wwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwww) {
                    this.f13471Wwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwww = false;
                    Wwwwwwwwwwwwwwwwwwwwwwwwwww();
                }
            } catch (IOException e) {
                throw new C0986Wwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwww(e);
            } catch (Throwable th) {
                this.f1086Wwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwww = null;
                if (this.f13471Wwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwww) {
                    this.f13471Wwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwww = false;
                    Wwwwwwwwwwwwwwwwwwwwwwwwwww();
                }
                throw th;
            }
        } catch (IOException e2) {
            throw new C0986Wwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwww(e2);
        } catch (Throwable th2) {
            this.f1088Wwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwww = null;
            try {
                AssetFileDescriptor assetFileDescriptor2 = this.f1086Wwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwww;
                if (assetFileDescriptor2 != null) {
                    assetFileDescriptor2.close();
                }
                this.f1086Wwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwww = null;
                if (this.f13471Wwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwww) {
                    this.f13471Wwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwww = false;
                    Wwwwwwwwwwwwwwwwwwwwwwwwwww();
                }
                throw th2;
            } catch (IOException e3) {
                throw new C0986Wwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwww(e3);
            } catch (Throwable th3) {
                this.f1086Wwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwww = null;
                if (this.f13471Wwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwww) {
                    this.f13471Wwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwww = false;
                    Wwwwwwwwwwwwwwwwwwwwwwwwwww();
                }
                throw th3;
            }
        }
    }
}
