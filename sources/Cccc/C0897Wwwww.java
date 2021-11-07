package Cccc;

import com.google.android.exoplayer2.util.C4950Wwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwww;

/* renamed from: Cccc.Wwwww */
public final class C0897Wwwww {

    /* renamed from: Wwwwwwwwwwwwwwwwwwwwwwwwwwwwwwww  reason: collision with root package name */
    public volatile long f13353Wwwwwwwwwwwwwwwwwwwwwwwwwwwwwwww = -9223372036854775807L;

    /* renamed from: Wwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwww  reason: collision with root package name */
    public long f13354Wwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwww;

    /* renamed from: Wwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwww  reason: collision with root package name */
    public long f13355Wwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwww;

    public C0897Wwwww(long j) {
        Wwwwwwwwwwwwwwwwwwwwwwwwwww(j);
    }

    public static long Wwwwwwwwwwwwwwwwwwwwwwwwww(long j) {
        return (j * 90000) / 1000000;
    }

    public static long Wwwwwwwwwwwwwwwwwwwwwwwwwwwww(long j) {
        return (j * 1000000) / 90000;
    }

    public synchronized void Wwwwwwwwwwwwwwwwwwwwwwwww() {
        while (this.f13353Wwwwwwwwwwwwwwwwwwwwwwwwwwwwwwww == -9223372036854775807L) {
            wait();
        }
    }

    public synchronized void Wwwwwwwwwwwwwwwwwwwwwwwwwww(long j) {
        C4950Wwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwww.Wwwwwwwwwwwwwwwwwwwwwwwwwwww(this.f13353Wwwwwwwwwwwwwwwwwwwwwwwwwwwwwwww == -9223372036854775807L);
        this.f13355Wwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwww = j;
    }

    public void Wwwwwwwwwwwwwwwwwwwwwwwwwwww() {
        this.f13353Wwwwwwwwwwwwwwwwwwwwwwwwwwwwwwww = -9223372036854775807L;
    }

    public long Wwwwwwwwwwwwwwwwwwwwwwwwwwwwww() {
        if (this.f13355Wwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwww == Long.MAX_VALUE) {
            return 0;
        }
        if (this.f13353Wwwwwwwwwwwwwwwwwwwwwwwwwwwwwwww == -9223372036854775807L) {
            return -9223372036854775807L;
        }
        return this.f13354Wwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwww;
    }

    public long Wwwwwwwwwwwwwwwwwwwwwwwwwwwwwww() {
        if (this.f13353Wwwwwwwwwwwwwwwwwwwwwwwwwwwwwwww != -9223372036854775807L) {
            return this.f13354Wwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwww + this.f13353Wwwwwwwwwwwwwwwwwwwwwwwwwwwwwwww;
        }
        long j = this.f13355Wwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwww;
        if (j != Long.MAX_VALUE) {
            return j;
        }
        return -9223372036854775807L;
    }

    public long Wwwwwwwwwwwwwwwwwwwwwwwwwwwwwwww() {
        return this.f13355Wwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwww;
    }

    public long Wwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwww(long j) {
        if (j == -9223372036854775807L) {
            return -9223372036854775807L;
        }
        if (this.f13353Wwwwwwwwwwwwwwwwwwwwwwwwwwwwwwww != -9223372036854775807L) {
            long Wwwwwwwwwwwwwwwwwwwwwwwwww2 = Wwwwwwwwwwwwwwwwwwwwwwwwww(this.f13353Wwwwwwwwwwwwwwwwwwwwwwwwwwwwwwww);
            long j2 = (4294967296L + Wwwwwwwwwwwwwwwwwwwwwwwwww2) / 8589934592L;
            long j3 = ((j2 - 1) * 8589934592L) + j;
            j += j2 * 8589934592L;
            if (Math.abs(j3 - Wwwwwwwwwwwwwwwwwwwwwwwwww2) < Math.abs(j - Wwwwwwwwwwwwwwwwwwwwwwwwww2)) {
                j = j3;
            }
        }
        return Wwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwww(Wwwwwwwwwwwwwwwwwwwwwwwwwwwww(j));
    }

    public long Wwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwww(long j) {
        if (j == -9223372036854775807L) {
            return -9223372036854775807L;
        }
        if (this.f13353Wwwwwwwwwwwwwwwwwwwwwwwwwwwwwwww != -9223372036854775807L) {
            this.f13353Wwwwwwwwwwwwwwwwwwwwwwwwwwwwwwww = j;
        } else {
            long j2 = this.f13355Wwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwww;
            if (j2 != Long.MAX_VALUE) {
                this.f13354Wwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwww = j2 - j;
            }
            synchronized (this) {
                this.f13353Wwwwwwwwwwwwwwwwwwwwwwwwwwwwwwww = j;
                notifyAll();
            }
        }
        return j + this.f13354Wwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwww;
    }
}
