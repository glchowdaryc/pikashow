package Ccc;

import Ccc.C0866Wwwwwwwwwwwwwwwww;
import Cccc.C0896Wwww;
import Cccc.C0916Wwwwwwwwwwwwwwwwwwww;
import Cccc.C0920Wwwwwwwwwwwwwwwwwwwwwww;
import Llllll.C1930Wwwwwwwwwwwwwwwwwwwwwwww;
import Llllll.C1931Wwwwwwwwwwwwwwwwwwwwwwwww;
import Lllllll.C1944Wwwwwwwwwwwwwwwwwwwwwwwwwwwwww;
import Lllllll.C1945Wwwwwwwwwwwwwwwwwwwwwwwwwwwwwww;
import Llllllllll.C2049Wwwwww;
import Llllllllll.C2085Wwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwww;
import Uuuu.C2965Wwwwwwwwwwwwwwwwwwwwwwwwwwwwww;
import Uuuu.C2966Wwwwwwwwwwwwwwwwwwwwwwwwwwwwwww;
import Uuuu.C2975Wwwwwwwwwwwwwwwwwwwwwwwwwwwwwwww;
import Uuuu.C2977Wwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwww;
import Uuuu.C2979Wwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwww;
import android.annotation.SuppressLint;
import android.annotation.TargetApi;
import android.content.Context;
import android.graphics.Point;
import android.media.MediaCodec;
import android.media.MediaCrypto;
import android.media.MediaFormat;
import android.os.Handler;
import android.os.SystemClock;
import android.util.Pair;
import android.view.Surface;
import com.google.android.exoplayer2.drm.C4877Wwwwwwwwwwwwwwwwwwwwwwwwwwwwwwww;
import com.google.android.exoplayer2.util.C4949Wwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwww;
import com.google.android.exoplayer2.util.C4950Wwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwww;
import java.nio.ByteBuffer;
import java.util.Collections;
import java.util.List;

/* renamed from: Ccc.Wwwwwwwwwwwwwwwwwwwwwwwwwwwww */
public class C0881Wwwwwwwwwwwwwwwwwwwwwwwwwwwww extends C2977Wwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwww {

    /* renamed from: Wwwww  reason: collision with root package name */
    public static boolean f13307Wwwww;

    /* renamed from: Wwwwww  reason: collision with root package name */
    public static boolean f13308Wwwwww;

    /* renamed from: Wwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwww  reason: collision with root package name */
    public static final int[] f13309Wwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwww = {1920, 1600, 1440, 1280, 960, 854, 640, 540, 480};

    /* renamed from: Wwwwwww  reason: collision with root package name */
    public boolean f13310Wwwwwww;

    /* renamed from: Wwwwwwww  reason: collision with root package name */
    public boolean f13311Wwwwwwww;

    /* renamed from: Wwwwwwwww  reason: collision with root package name */
    public boolean f13312Wwwwwwwww;

    /* renamed from: Wwwwwwwwww  reason: collision with root package name */
    public final boolean f13313Wwwwwwwwww = OO000000000();

    /* renamed from: Wwwwwwwwwwww  reason: collision with root package name */
    public int f13314Wwwwwwwwwwww;

    /* renamed from: Wwwwwwwwwwwww  reason: collision with root package name */
    public int f13315Wwwwwwwwwwwww;

    /* renamed from: Wwwwwwwwwwwwww  reason: collision with root package name */
    public int f13316Wwwwwwwwwwwwww;

    /* renamed from: Wwwwwwwwwwwwwww  reason: collision with root package name */
    public int f13317Wwwwwwwwwwwwwww;

    /* renamed from: Wwwwwwwwwwwwwwww  reason: collision with root package name */
    public int f13318Wwwwwwwwwwwwwwww;

    /* renamed from: Wwwwwwwwwwwwwwwww  reason: collision with root package name */
    public int f13319Wwwwwwwwwwwwwwwww;

    /* renamed from: Wwwwwwwwwwwwwwwwww  reason: collision with root package name */
    public int f13320Wwwwwwwwwwwwwwwwww = -1;

    /* renamed from: Wwwwwwwwwwwwwwwwwww  reason: collision with root package name */
    public int f13321Wwwwwwwwwwwwwwwwwww = -1;

    /* renamed from: Wwwwwwwwwwwwwwwwwwww  reason: collision with root package name */
    public int f13322Wwwwwwwwwwwwwwwwwwww;

    /* renamed from: Wwwwwwwwwwwwwwwwwwwww  reason: collision with root package name */
    public int f13323Wwwwwwwwwwwwwwwwwwwww;

    /* renamed from: Wwwwwwwwwwwwwwwwwwwwww  reason: collision with root package name */
    public int f13324Wwwwwwwwwwwwwwwwwwwwww;

    /* renamed from: Wwwwwwwwwwwwwwwwwwwwww  reason: collision with other field name */
    public long f936Wwwwwwwwwwwwwwwwwwwwww = -9223372036854775807L;

    /* renamed from: Wwwwwwwwwwwwwwwwwwwwwww  reason: collision with root package name */
    public int f13325Wwwwwwwwwwwwwwwwwwwwwww;

    /* renamed from: Wwwwwwwwwwwwwwwwwwwwwww  reason: collision with other field name */
    public long f937Wwwwwwwwwwwwwwwwwwwwwww = -9223372036854775807L;

    /* renamed from: Wwwwwwwwwwwwwwwwwwwwwwww  reason: collision with root package name */
    public int f13326Wwwwwwwwwwwwwwwwwwwwwwww = 1;

    /* renamed from: Wwwwwwwwwwwwwwwwwwwwwwww  reason: collision with other field name */
    public long f938Wwwwwwwwwwwwwwwwwwwwwwww;

    /* renamed from: Wwwwwwwwwwwwwwwwwwwwwwwww  reason: collision with root package name */
    public final int f13327Wwwwwwwwwwwwwwwwwwwwwwwww;

    /* renamed from: Wwwwwwwwwwwwwwwwwwwwwwwww  reason: collision with other field name */
    public long f939Wwwwwwwwwwwwwwwwwwwwwwwww;

    /* renamed from: Wwwwwwwwwwwwwwwwwwwwwwwwww  reason: collision with root package name */
    public long f13328Wwwwwwwwwwwwwwwwwwwwwwwwww = -9223372036854775807L;

    /* renamed from: Wwwwwwwwwwwwwwwwwwwwwwwwwww  reason: collision with root package name */
    public long f13329Wwwwwwwwwwwwwwwwwwwwwwwwwww;

    /* renamed from: Wwwwwwwwwwwwwwwwwwwwwwwwwwww  reason: collision with root package name */
    public final long f13330Wwwwwwwwwwwwwwwwwwwwwwwwwwww;

    /* renamed from: Wwwwwwwwwwwwwwwwwwwwwwwwwwwww  reason: collision with root package name */
    public float f13331Wwwwwwwwwwwwwwwwwwwwwwwwwwwww;

    /* renamed from: Wwwwwwwwwwwwwwwwwwwwwwwwwwwwww  reason: collision with root package name */
    public float f13332Wwwwwwwwwwwwwwwwwwwwwwwwwwwwww = -1.0f;

    /* renamed from: Wwwwwwwwwwwwwwwwwwwwwwwwwwwwwww  reason: collision with root package name */
    public float f13333Wwwwwwwwwwwwwwwwwwwwwwwwwwwwwww = -1.0f;

    /* renamed from: Wwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwww  reason: collision with root package name */
    public Surface f13334Wwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwww;

    /* renamed from: Wwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwww  reason: collision with other field name */
    public final long[] f940Wwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwww = new long[10];

    /* renamed from: Wwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwww  reason: collision with other field name */
    public final C0866Wwwwwwwwwwwwwwwww.C0867Wwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwww f941Wwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwww;

    /* renamed from: Wwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwww  reason: collision with other field name */
    public final C0877Wwwwwwwwwwwwwwwwwwwwwwwwwww f942Wwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwww;

    /* renamed from: Wwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwww  reason: collision with other field name */
    public C0880Wwwwwwwwwwwwwwwwwwwwwwwwwwww f943Wwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwww;

    /* renamed from: Wwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwww  reason: collision with other field name */
    public C0882Wwwwwwwwwwwwwwwwwwwwwwwwwwwwwwww f944Wwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwww;

    /* renamed from: Wwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwww  reason: collision with other field name */
    public C0883Wwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwww f945Wwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwww;

    /* renamed from: Wwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwww  reason: collision with other field name */
    public final Context f946Wwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwww;

    /* renamed from: Wwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwww  reason: collision with other field name */
    public Surface f947Wwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwww;

    /* renamed from: Wwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwww  reason: collision with other field name */
    public final long[] f948Wwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwww = new long[10];

    @TargetApi(23)
    /* renamed from: Ccc.Wwwwwwwwwwwwwwwwwwwwwwwwwwwww$Wwwwwwwwwwwwwwwwwwwwwwwwwwwwwwww */
    public final class C0882Wwwwwwwwwwwwwwwwwwwwwwwwwwwwwwww implements MediaCodec.OnFrameRenderedListener {
        public void onFrameRendered(MediaCodec mediaCodec, long j, long j2) {
            C0881Wwwwwwwwwwwwwwwwwwwwwwwwwwwww wwwwwwwwwwwwwwwwwwwwwwwwwwwww = C0881Wwwwwwwwwwwwwwwwwwwwwwwwwwwww.this;
            if (this == wwwwwwwwwwwwwwwwwwwwwwwwwwwww.f944Wwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwww) {
                wwwwwwwwwwwwwwwwwwwwwwwwwwwww.QQOO(j);
            }
        }

        public C0882Wwwwwwwwwwwwwwwwwwwwwwwwwwwwwwww(MediaCodec mediaCodec) {
            mediaCodec.setOnFrameRenderedListener(this, new Handler());
        }
    }

    /* renamed from: Ccc.Wwwwwwwwwwwwwwwwwwwwwwwwwwwww$Wwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwww */
    public static final class C0883Wwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwww {

        /* renamed from: Wwwwwwwwwwwwwwwwwwwwwwwwwwwwwwww  reason: collision with root package name */
        public final int f13336Wwwwwwwwwwwwwwwwwwwwwwwwwwwwwwww;

        /* renamed from: Wwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwww  reason: collision with root package name */
        public final int f13337Wwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwww;

        /* renamed from: Wwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwww  reason: collision with root package name */
        public final int f13338Wwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwww;

        public C0883Wwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwww(int i, int i2, int i3) {
            this.f13338Wwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwww = i;
            this.f13337Wwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwww = i2;
            this.f13336Wwwwwwwwwwwwwwwwwwwwwwwwwwwwwwww = i3;
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C0881Wwwwwwwwwwwwwwwwwwwwwwwwwwwww(Context context, C2975Wwwwwwwwwwwwwwwwwwwwwwwwwwwwwwww wwwwwwwwwwwwwwwwwwwwwwwwwwwwwwww, long j, C1931Wwwwwwwwwwwwwwwwwwwwwwwww<C1930Wwwwwwwwwwwwwwwwwwwwwwww> wwwwwwwwwwwwwwwwwwwwwwwww, boolean z, boolean z2, Handler handler, C0866Wwwwwwwwwwwwwwwww wwwwwwwwwwwwwwwww, int i) {
        super(2, wwwwwwwwwwwwwwwwwwwwwwwwwwwwwwww, wwwwwwwwwwwwwwwwwwwwwwwww, z, z2, 30.0f);
        this.f13330Wwwwwwwwwwwwwwwwwwwwwwwwwwww = j;
        this.f13327Wwwwwwwwwwwwwwwwwwwwwwwww = i;
        Context applicationContext = context.getApplicationContext();
        this.f946Wwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwww = applicationContext;
        this.f942Wwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwww = new C0877Wwwwwwwwwwwwwwwwwwwwwwwwwww(applicationContext);
        this.f941Wwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwww = new C0866Wwwwwwwwwwwwwwwww.C0867Wwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwww(handler, wwwwwwwwwwwwwwwww);
        O000();
    }

    @TargetApi(21)
    /* renamed from: O0 */
    public static void m18O0(MediaFormat mediaFormat, int i) {
        mediaFormat.setFeatureEnabled("tunneled-playback", true);
        mediaFormat.setInteger("audio-session-id", i);
    }

    public static boolean OO0(long j) {
        return j < -500000;
    }

    public static boolean OO00(long j) {
        return j < -30000;
    }

    public static int OO0000(C2979Wwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwww wwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwww, C2049Wwwwww wwwwww) {
        if (wwwwww.f14927Wwwwwwwwwwwwwwwwwwwwwwwwwwwwwww == -1) {
            return OO0000000(wwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwww, wwwwww.f2591Wwwwwwwwwwwwwwwwwwwwwwwwwwwwww, wwwwww.f14926Wwwwwwwwwwwwwwwwwwwwwwwwwwwwww, wwwwww.f14925Wwwwwwwwwwwwwwwwwwwwwwwwwwwww);
        }
        int size = wwwwww.f2602Wwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwww.size();
        int i = 0;
        for (int i2 = 0; i2 < size; i2++) {
            i += wwwwww.f2602Wwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwww.get(i2).length;
        }
        return wwwwww.f14927Wwwwwwwwwwwwwwwwwwwwwwwwwwwwwww + i;
    }

    public static Point OO000000(C2979Wwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwww wwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwww, C2049Wwwwww wwwwww) {
        int i = wwwwww.f14925Wwwwwwwwwwwwwwwwwwwwwwwwwwwww;
        int i2 = wwwwww.f14926Wwwwwwwwwwwwwwwwwwwwwwwwwwwwww;
        boolean z = i > i2;
        int i3 = z ? i : i2;
        if (z) {
            i = i2;
        }
        float f = ((float) i) / ((float) i3);
        for (int i4 : f13309Wwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwww) {
            int i5 = (int) (((float) i4) * f);
            if (i4 <= i3 || i5 <= i) {
                break;
            }
            if (C4949Wwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwww.f19893Wwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwww >= 21) {
                int i6 = z ? i5 : i4;
                if (!z) {
                    i4 = i5;
                }
                Point Wwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwww2 = wwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwww.Wwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwww(i6, i4);
                if (wwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwww.Wwwwwwwwwwwwwwwww(Wwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwww2.x, Wwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwww2.y, (double) wwwwww.f14930Wwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwww)) {
                    return Wwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwww2;
                }
            } else {
                try {
                    int Wwwwwwwwwwwwwwwwwwwwwwwwww2 = C4949Wwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwww.Wwwwwwwwwwwwwwwwwwwwwwwwww(i4, 16) * 16;
                    int Wwwwwwwwwwwwwwwwwwwwwwwwww3 = C4949Wwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwww.Wwwwwwwwwwwwwwwwwwwwwwwwww(i5, 16) * 16;
                    if (Wwwwwwwwwwwwwwwwwwwwwwwwww2 * Wwwwwwwwwwwwwwwwwwwwwwwwww3 <= C2966Wwwwwwwwwwwwwwwwwwwwwwwwwwwwwww.Wwwwwwwwwwwwwwwwwwww()) {
                        int i7 = z ? Wwwwwwwwwwwwwwwwwwwwwwwwww3 : Wwwwwwwwwwwwwwwwwwwwwwwwww2;
                        if (!z) {
                            Wwwwwwwwwwwwwwwwwwwwwwwwww2 = Wwwwwwwwwwwwwwwwwwwwwwwwww3;
                        }
                        return new Point(i7, Wwwwwwwwwwwwwwwwwwwwwwwwww2);
                    }
                } catch (C2966Wwwwwwwwwwwwwwwwwwwwwwwwwwwwwww.C2972Wwwwwwwwwwwwwwwwwwwwwwwwwwwwwwww unused) {
                }
            }
        }
        return null;
    }

    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static int OO0000000(Uuuu.C2979Wwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwww r5, java.lang.String r6, int r7, int r8) {
        /*
            r0 = -1
            if (r7 == r0) goto L_0x00a2
            if (r8 != r0) goto L_0x0007
            goto L_0x00a2
        L_0x0007:
            r6.hashCode()
            int r1 = r6.hashCode()
            r2 = 4
            r3 = 3
            r4 = 2
            switch(r1) {
                case -1664118616: goto L_0x004d;
                case -1662541442: goto L_0x0042;
                case 1187890754: goto L_0x0037;
                case 1331836730: goto L_0x002c;
                case 1599127256: goto L_0x0021;
                case 1599127257: goto L_0x0016;
                default: goto L_0x0014;
            }
        L_0x0014:
            r6 = -1
            goto L_0x0057
        L_0x0016:
            java.lang.String r1 = "video/x-vnd.on2.vp9"
            boolean r6 = r6.equals(r1)
            if (r6 != 0) goto L_0x001f
            goto L_0x0014
        L_0x001f:
            r6 = 5
            goto L_0x0057
        L_0x0021:
            java.lang.String r1 = "video/x-vnd.on2.vp8"
            boolean r6 = r6.equals(r1)
            if (r6 != 0) goto L_0x002a
            goto L_0x0014
        L_0x002a:
            r6 = 4
            goto L_0x0057
        L_0x002c:
            java.lang.String r1 = "video/avc"
            boolean r6 = r6.equals(r1)
            if (r6 != 0) goto L_0x0035
            goto L_0x0014
        L_0x0035:
            r6 = 3
            goto L_0x0057
        L_0x0037:
            java.lang.String r1 = "video/mp4v-es"
            boolean r6 = r6.equals(r1)
            if (r6 != 0) goto L_0x0040
            goto L_0x0014
        L_0x0040:
            r6 = 2
            goto L_0x0057
        L_0x0042:
            java.lang.String r1 = "video/hevc"
            boolean r6 = r6.equals(r1)
            if (r6 != 0) goto L_0x004b
            goto L_0x0014
        L_0x004b:
            r6 = 1
            goto L_0x0057
        L_0x004d:
            java.lang.String r1 = "video/3gpp"
            boolean r6 = r6.equals(r1)
            if (r6 != 0) goto L_0x0056
            goto L_0x0014
        L_0x0056:
            r6 = 0
        L_0x0057:
            switch(r6) {
                case 0: goto L_0x0099;
                case 1: goto L_0x0096;
                case 2: goto L_0x0099;
                case 3: goto L_0x005b;
                case 4: goto L_0x0099;
                case 5: goto L_0x0096;
                default: goto L_0x005a;
            }
        L_0x005a:
            return r0
        L_0x005b:
            java.lang.String r6 = com.google.android.exoplayer2.util.C4949Wwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwww.f19891Wwwwwwwwwwwwwwwwwwwwwwwwwwwwwwww
            java.lang.String r1 = "BRAVIA 4K 2015"
            boolean r1 = r1.equals(r6)
            if (r1 != 0) goto L_0x0095
            java.lang.String r1 = com.google.android.exoplayer2.util.C4949Wwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwww.f19892Wwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwww
            java.lang.String r2 = "Amazon"
            boolean r1 = r2.equals(r1)
            if (r1 == 0) goto L_0x0084
            java.lang.String r1 = "KFSOWI"
            boolean r1 = r1.equals(r6)
            if (r1 != 0) goto L_0x0095
            java.lang.String r1 = "AFTS"
            boolean r6 = r1.equals(r6)
            if (r6 == 0) goto L_0x0084
            boolean r5 = r5.f3477Wwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwww
            if (r5 == 0) goto L_0x0084
            goto L_0x0095
        L_0x0084:
            r5 = 16
            int r6 = com.google.android.exoplayer2.util.C4949Wwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwww.Wwwwwwwwwwwwwwwwwwwwwwwwww(r7, r5)
            int r7 = com.google.android.exoplayer2.util.C4949Wwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwww.Wwwwwwwwwwwwwwwwwwwwwwwwww(r8, r5)
            int r6 = r6 * r7
            int r6 = r6 * 16
            int r7 = r6 * 16
            goto L_0x009b
        L_0x0095:
            return r0
        L_0x0096:
            int r7 = r7 * r8
            goto L_0x009c
        L_0x0099:
            int r7 = r7 * r8
        L_0x009b:
            r2 = 2
        L_0x009c:
            int r7 = r7 * 3
            int r2 = r2 * 2
            int r7 = r7 / r2
            return r7
        L_0x00a2:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: Ccc.C0881Wwwwwwwwwwwwwwwwwwwwwwwwwwwww.OO0000000(Uuuu.Wwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwww, java.lang.String, int, int):int");
    }

    public static boolean OO000000000() {
        return "NVIDIA".equals(C4949Wwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwww.f19892Wwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwww);
    }

    @TargetApi(23)
    public static void Ssssssss(MediaCodec mediaCodec, Surface surface) {
        mediaCodec.setOutputSurface(surface);
    }

    public void IIlllllllll() {
        try {
            super.IIlllllllll();
        } finally {
            this.f13323Wwwwwwwwwwwwwwwwwwwww = 0;
        }
    }

    public boolean Illlll(long j, long j2, MediaCodec mediaCodec, ByteBuffer byteBuffer, int i, int i2, long j3, boolean z, boolean z2, C2049Wwwwww wwwwww) {
        long j4 = j;
        MediaCodec mediaCodec2 = mediaCodec;
        int i3 = i;
        long j5 = j3;
        if (this.f13329Wwwwwwwwwwwwwwwwwwwwwwwwwww == -9223372036854775807L) {
            this.f13329Wwwwwwwwwwwwwwwwwwwwwwwwwww = j4;
        }
        long j6 = j5 - this.f936Wwwwwwwwwwwwwwwwwwwwww;
        if (!z || z2) {
            long j7 = j5 - j4;
            if (this.f947Wwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwww != this.f13334Wwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwww) {
                long elapsedRealtime = SystemClock.elapsedRealtime() * 1000;
                boolean z3 = Wwwwwwwwwwwwwwwwwwwwwwwwwww() == 2;
                if (!this.f13311Wwwwwwww || (z3 && Ssss(j7, elapsedRealtime - this.f938Wwwwwwwwwwwwwwwwwwwwwwww))) {
                    long nanoTime = System.nanoTime();
                    QQOOO(j6, nanoTime, wwwwww);
                    if (C4949Wwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwww.f19893Wwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwww >= 21) {
                        Ssssssssss(mediaCodec, i, j6, nanoTime);
                        return true;
                    }
                    Sssssssssss(mediaCodec2, i3, j6);
                    return true;
                } else if (!z3 || j4 == this.f13329Wwwwwwwwwwwwwwwwwwwwwwwwwww) {
                    return false;
                } else {
                    long j8 = j7 - (elapsedRealtime - j2);
                    long nanoTime2 = System.nanoTime();
                    long Wwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwww2 = this.f942Wwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwww.Wwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwww(j5, (j8 * 1000) + nanoTime2);
                    long j9 = (Wwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwww2 - nanoTime2) / 1000;
                    if (Ssssss(j9, j2, z2) && QQOOOOOOOOO(mediaCodec, i, j6, j)) {
                        return false;
                    }
                    if (Sssss(j9, j2, z2)) {
                        OO00000000(mediaCodec2, i3, j6);
                        return true;
                    } else if (C4949Wwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwww.f19893Wwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwww >= 21) {
                        if (j9 >= 50000) {
                            return false;
                        }
                        QQOOO(j6, Wwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwww2, wwwwww);
                        Ssssssssss(mediaCodec, i, j6, Wwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwww2);
                        return true;
                    } else if (j9 >= 30000) {
                        return false;
                    } else {
                        if (j9 > 11000) {
                            try {
                                Thread.sleep((j9 - 10000) / 1000);
                            } catch (InterruptedException unused) {
                                Thread.currentThread().interrupt();
                                return false;
                            }
                        }
                        QQOOO(j6, Wwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwww2, wwwwww);
                        Sssssssssss(mediaCodec2, i3, j6);
                        return true;
                    }
                }
            } else if (!OO00(j7)) {
                return false;
            } else {
                mo2166Ss(mediaCodec2, i3, j6);
                return true;
            }
        } else {
            mo2166Ss(mediaCodec2, i3, j6);
            return true;
        }
    }

    public void Illlllll(C1944Wwwwwwwwwwwwwwwwwwwwwwwwwwwwww wwwwwwwwwwwwwwwwwwwwwwwwwwwwww) {
        this.f13323Wwwwwwwwwwwwwwwwwwwww++;
        this.f937Wwwwwwwwwwwwwwwwwwwwwww = Math.max(wwwwwwwwwwwwwwwwwwwwwwwwwwwwww.f2360Wwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwww, this.f937Wwwwwwwwwwwwwwwwwwwwwww);
        if (C4949Wwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwww.f19893Wwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwww < 23 && this.f13310Wwwwwww) {
            QQOO(wwwwwwwwwwwwwwwwwwwwwwwwwwwwww.f2360Wwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwww);
        }
    }

    public void Illllllll(long j) {
        this.f13323Wwwwwwwwwwwwwwwwwwwww--;
        while (true) {
            int i = this.f13314Wwwwwwwwwwww;
            if (i != 0 && j >= this.f940Wwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwww[0]) {
                long[] jArr = this.f948Wwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwww;
                this.f936Wwwwwwwwwwwwwwwwwwwwww = jArr[0];
                int i2 = i - 1;
                this.f13314Wwwwwwwwwwww = i2;
                System.arraycopy(jArr, 1, jArr, 0, i2);
                long[] jArr2 = this.f940Wwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwww;
                System.arraycopy(jArr2, 1, jArr2, 0, this.f13314Wwwwwwwwwwww);
            } else {
                return;
            }
        }
    }

    public void Illlllllll(MediaCodec mediaCodec, MediaFormat mediaFormat) {
        int i;
        int i2;
        boolean z = mediaFormat.containsKey("crop-right") && mediaFormat.containsKey("crop-left") && mediaFormat.containsKey("crop-bottom") && mediaFormat.containsKey("crop-top");
        if (z) {
            i = (mediaFormat.getInteger("crop-right") - mediaFormat.getInteger("crop-left")) + 1;
        } else {
            i = mediaFormat.getInteger("width");
        }
        if (z) {
            i2 = (mediaFormat.getInteger("crop-bottom") - mediaFormat.getInteger("crop-top")) + 1;
        } else {
            i2 = mediaFormat.getInteger("height");
        }
        QQO(mediaCodec, i, i2);
    }

    public void Illllllllll(C2049Wwwwww wwwwww) {
        super.Illllllllll(wwwwww);
        this.f941Wwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwww.Wwwwwwwwwwwwwwwwwwwwwww(wwwwww);
        this.f13333Wwwwwwwwwwwwwwwwwwwwwwwwwwwwwww = wwwwww.f14929Wwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwww;
        this.f13322Wwwwwwwwwwwwwwwwwwww = wwwwww.f14924Wwwwwwwwwwwwwwwwwwwwwwwwwwww;
    }

    public void Illlllllllll(String str, long j, long j2) {
        this.f941Wwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwww.Wwwwwwwwwwwwwwwwwwwwwwwwwww(str, j, j2);
        this.f13312Wwwwwwwww = O00(str);
    }

    public List<C2979Wwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwww> Illlllllllllllllllllll(C2975Wwwwwwwwwwwwwwwwwwwwwwwwwwwwwwww wwwwwwwwwwwwwwwwwwwwwwwwwwwwwwww, C2049Wwwwww wwwwww, boolean z) {
        return Collections.unmodifiableList(wwwwwwwwwwwwwwwwwwwwwwwwwwwwwwww.Wwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwww(wwwwww.f2591Wwwwwwwwwwwwwwwwwwwwwwwwwwwwww, z, this.f13310Wwwwwww));
    }

    public float Illllllllllllllllllllll(float f, C2049Wwwwww wwwwww, C2049Wwwwww[] wwwwwwArr) {
        float f2 = -1.0f;
        for (C2049Wwwwww wwwwww2 : wwwwwwArr) {
            float f3 = wwwwww2.f14930Wwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwww;
            if (f3 != -1.0f) {
                f2 = Math.max(f2, f3);
            }
        }
        if (f2 == -1.0f) {
            return -1.0f;
        }
        return f2 * f;
    }

    public boolean Illlllllllllllllllllllll() {
        return this.f13310Wwwwwww;
    }

    public boolean Illllllllllllllllllllllllllll() {
        try {
            return super.Illllllllllllllllllllllllllll();
        } finally {
            this.f13323Wwwwwwwwwwwwwwwwwwwww = 0;
        }
    }

    public void Kkkkkkkkk(C2979Wwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwww wwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwww, MediaCodec mediaCodec, C2049Wwwwww wwwwww, MediaCrypto mediaCrypto, float f) {
        String str = wwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwww.f15993Wwwwwwwwwwwwwwwwwwwwwwwwwwwwwwww;
        C0883Wwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwww OO000002 = OO00000(wwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwww, wwwwww, Wwwwww());
        this.f945Wwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwww = OO000002;
        MediaFormat OO0002 = OO000(wwwwww, str, OO000002, f, this.f13313Wwwwwwwwww, this.f13315Wwwwwwwwwwwww);
        if (this.f947Wwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwww == null) {
            C4950Wwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwww.Wwwwwwwwwwwwwwwwwwwwwwwwwwww(Sss(wwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwww));
            if (this.f13334Wwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwww == null) {
                this.f13334Wwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwww = C0886Wwwwwwwwwwwwwwwwwwwwwwwwwwwwwww.Wwwwwwwwwwwwwwwwwwwwwwwwwww(this.f946Wwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwww, wwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwww.f3477Wwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwww);
            }
            this.f947Wwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwww = this.f13334Wwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwww;
        }
        mediaCodec.configure(OO0002, this.f947Wwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwww, mediaCrypto, 0);
        if (C4949Wwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwww.f19893Wwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwww >= 23 && this.f13310Wwwwwww) {
            this.f944Wwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwww = new C0882Wwwwwwwwwwwwwwwwwwwwwwwwwwwwwwww(mediaCodec);
        }
    }

    public int Kkkkkkkkkkkkkkkkkk(MediaCodec mediaCodec, C2979Wwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwww wwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwww, C2049Wwwwww wwwwww, C2049Wwwwww wwwwww2) {
        if (!wwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwww.Wwwwwwwwwwwwwwwwwwwwww(wwwwww, wwwwww2, true)) {
            return 0;
        }
        int i = wwwwww2.f14926Wwwwwwwwwwwwwwwwwwwwwwwwwwwwww;
        C0883Wwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwww wwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwww = this.f945Wwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwww;
        if (i > wwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwww.f13338Wwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwww || wwwwww2.f14925Wwwwwwwwwwwwwwwwwwwwwwwwwwwww > wwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwww.f13337Wwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwww || OO0000(wwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwww, wwwwww2) > this.f945Wwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwww.f13336Wwwwwwwwwwwwwwwwwwwwwwwwwwwwwwww) {
            return 0;
        }
        return wwwwww.Illllllllllllllllllllllllll(wwwwww2) ? 3 : 2;
    }

    public void Kkkkkkkkkkkkkkkkkkkkkk(C2049Wwwwww[] wwwwwwArr, long j) {
        if (this.f936Wwwwwwwwwwwwwwwwwwwwww == -9223372036854775807L) {
            this.f936Wwwwwwwwwwwwwwwwwwwwww = j;
        } else {
            int i = this.f13314Wwwwwwwwwwww;
            if (i == this.f948Wwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwww.length) {
                C0920Wwwwwwwwwwwwwwwwwwwwwww.Wwwwwwwwwwwwwwwwwwwwwwwwwwwww("MediaCodecVideoRenderer", "Too many stream changes, so dropping offset: " + this.f948Wwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwww[this.f13314Wwwwwwwwwwww - 1]);
            } else {
                this.f13314Wwwwwwwwwwww = i + 1;
            }
            long[] jArr = this.f948Wwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwww;
            int i2 = this.f13314Wwwwwwwwwwww;
            jArr[i2 - 1] = j;
            this.f940Wwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwww[i2 - 1] = this.f937Wwwwwwwwwwwwwwwwwwwwwww;
        }
        super.Kkkkkkkkkkkkkkkkkkkkkk(wwwwwwArr, j);
    }

    public void Kkkkkkkkkkkkkkkkkkkkkkk() {
        this.f13328Wwwwwwwwwwwwwwwwwwwwwwwwww = -9223372036854775807L;
        QQOOOOOOOO();
        super.Kkkkkkkkkkkkkkkkkkkkkkk();
    }

    public void Kkkkkkkkkkkkkkkkkkkkkkkk() {
        super.Kkkkkkkkkkkkkkkkkkkkkkkk();
        this.f13325Wwwwwwwwwwwwwwwwwwwwwww = 0;
        this.f939Wwwwwwwwwwwwwwwwwwwwwwwww = SystemClock.elapsedRealtime();
        this.f938Wwwwwwwwwwwwwwwwwwwwwwww = SystemClock.elapsedRealtime() * 1000;
    }

    public void Kkkkkkkkkkkkkkkkkkkkkkkkk() {
        try {
            super.Kkkkkkkkkkkkkkkkkkkkkkkkk();
            Surface surface = this.f13334Wwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwww;
            if (surface != null) {
                if (this.f947Wwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwww == surface) {
                    this.f947Wwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwww = null;
                }
                surface.release();
                this.f13334Wwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwww = null;
            }
        } catch (Throwable th) {
            if (this.f13334Wwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwww != null) {
                Surface surface2 = this.f947Wwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwww;
                Surface surface3 = this.f13334Wwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwww;
                if (surface2 == surface3) {
                    this.f947Wwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwww = null;
                }
                surface3.release();
                this.f13334Wwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwww = null;
            }
            throw th;
        }
    }

    public void Kkkkkkkkkkkkkkkkkkkkkkkkkk(long j, boolean z) {
        super.Kkkkkkkkkkkkkkkkkkkkkkkkkk(j, z);
        O0000();
        this.f13329Wwwwwwwwwwwwwwwwwwwwwwwwwww = -9223372036854775807L;
        this.f13324Wwwwwwwwwwwwwwwwwwwwww = 0;
        this.f937Wwwwwwwwwwwwwwwwwwwwwww = -9223372036854775807L;
        int i = this.f13314Wwwwwwwwwwww;
        if (i != 0) {
            this.f936Wwwwwwwwwwwwwwwwwwwwww = this.f948Wwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwww[i - 1];
            this.f13314Wwwwwwwwwwww = 0;
        }
        if (z) {
            Sssssssss();
        } else {
            this.f13328Wwwwwwwwwwwwwwwwwwwwwwwwww = -9223372036854775807L;
        }
    }

    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* JADX WARNING: Code restructure failed: missing block: B:395:0x0607, code lost:
        r2 = 65535;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:396:0x0608, code lost:
        switch(r2) {
            case 0: goto L_0x060c;
            case 1: goto L_0x060c;
            case 2: goto L_0x060c;
            case 3: goto L_0x060c;
            case 4: goto L_0x060c;
            case 5: goto L_0x060c;
            case 6: goto L_0x060c;
            case 7: goto L_0x060c;
            case 8: goto L_0x060c;
            case 9: goto L_0x060c;
            case 10: goto L_0x060c;
            case 11: goto L_0x060c;
            case 12: goto L_0x060c;
            case 13: goto L_0x060c;
            case 14: goto L_0x060c;
            case 15: goto L_0x060c;
            case 16: goto L_0x060c;
            case 17: goto L_0x060c;
            case 18: goto L_0x060c;
            case 19: goto L_0x060c;
            case 20: goto L_0x060c;
            case 21: goto L_0x060c;
            case 22: goto L_0x060c;
            case 23: goto L_0x060c;
            case 24: goto L_0x060c;
            case 25: goto L_0x060c;
            case 26: goto L_0x060c;
            case 27: goto L_0x060c;
            case 28: goto L_0x060c;
            case 29: goto L_0x060c;
            case 30: goto L_0x060c;
            case 31: goto L_0x060c;
            case 32: goto L_0x060c;
            case 33: goto L_0x060c;
            case 34: goto L_0x060c;
            case 35: goto L_0x060c;
            case 36: goto L_0x060c;
            case 37: goto L_0x060c;
            case 38: goto L_0x060c;
            case 39: goto L_0x060c;
            case 40: goto L_0x060c;
            case 41: goto L_0x060c;
            case 42: goto L_0x060c;
            case 43: goto L_0x060c;
            case 44: goto L_0x060c;
            case 45: goto L_0x060c;
            case 46: goto L_0x060c;
            case 47: goto L_0x060c;
            case 48: goto L_0x060c;
            case 49: goto L_0x060c;
            case 50: goto L_0x060c;
            case 51: goto L_0x060c;
            case 52: goto L_0x060c;
            case 53: goto L_0x060c;
            case 54: goto L_0x060c;
            case 55: goto L_0x060c;
            case 56: goto L_0x060c;
            case 57: goto L_0x060c;
            case 58: goto L_0x060c;
            case 59: goto L_0x060c;
            case 60: goto L_0x060c;
            case 61: goto L_0x060c;
            case 62: goto L_0x060c;
            case 63: goto L_0x060c;
            case 64: goto L_0x060c;
            case 65: goto L_0x060c;
            case 66: goto L_0x060c;
            case 67: goto L_0x060c;
            case 68: goto L_0x060c;
            case 69: goto L_0x060c;
            case 70: goto L_0x060c;
            case 71: goto L_0x060c;
            case 72: goto L_0x060c;
            case 73: goto L_0x060c;
            case 74: goto L_0x060c;
            case 75: goto L_0x060c;
            case 76: goto L_0x060c;
            case 77: goto L_0x060c;
            case 78: goto L_0x060c;
            case 79: goto L_0x060c;
            case 80: goto L_0x060c;
            case 81: goto L_0x060c;
            case 82: goto L_0x060c;
            case 83: goto L_0x060c;
            case 84: goto L_0x060c;
            case 85: goto L_0x060c;
            case 86: goto L_0x060c;
            case 87: goto L_0x060c;
            case 88: goto L_0x060c;
            case 89: goto L_0x060c;
            case Wwwwwwwww.Wwwwwwwwwwwwwwwwwwwwwwwwwwwwwww.Illlllllllllllllll :int: goto L_0x060c;
            case Wwwwwwwww.Wwwwwwwwwwwwwwwwwwwwwwwwwwwwwww.Illllllllllllllll :int: goto L_0x060c;
            case Wwwwwwwww.Wwwwwwwwwwwwwwwwwwwwwwwwwwwwwww.Illlllllllllllll :int: goto L_0x060c;
            case Wwwwwwwww.Wwwwwwwwwwwwwwwwwwwwwwwwwwwwwww.Illllllllllllll :int: goto L_0x060c;
            case Wwwwwwwww.Wwwwwwwwwwwwwwwwwwwwwwwwwwwwwww.Illlllllllllll :int: goto L_0x060c;
            case Wwwwwwwww.Wwwwwwwwwwwwwwwwwwwwwwwwwwwwwww.Illllllllllll :int: goto L_0x060c;
            case Wwwwwwwww.Wwwwwwwwwwwwwwwwwwwwwwwwwwwwwww.Illlllllllll :int: goto L_0x060c;
            case Wwwwwwwww.Wwwwwwwwwwwwwwwwwwwwwwwwwwwwwww.Illllllllll :int: goto L_0x060c;
            case Wwwwwwwww.Wwwwwwwwwwwwwwwwwwwwwwwwwwwwwww.Illlllllll :int: goto L_0x060c;
            case Wwwwwwwww.Wwwwwwwwwwwwwwwwwwwwwwwwwwwwwww.Illllllll :int: goto L_0x060c;
            case Wwwwwwwww.Wwwwwwwwwwwwwwwwwwwwwwwwwwwwwww.Illlllll :int: goto L_0x060c;
            case Wwwwwwwww.Wwwwwwwwwwwwwwwwwwwwwwwwwwwwwww.Illllll :int: goto L_0x060c;
            case Wwwwwwwww.Wwwwwwwwwwwwwwwwwwwwwwwwwwwwwww.Illlll :int: goto L_0x060c;
            case Wwwwwwwww.Wwwwwwwwwwwwwwwwwwwwwwwwwwwwwww.Illll :int: goto L_0x060c;
            case Wwwwwwwww.Wwwwwwwwwwwwwwwwwwwwwwwwwwwwwww.Illl :int: goto L_0x060c;
            case 105: goto L_0x060c;
            case Wwwwwwwww.Wwwwwwwwwwwwwwwwwwwwwwwwwwwwwww.Ill :int: goto L_0x060c;
            case Wwwwwwwww.Wwwwwwwwwwwwwwwwwwwwwwwwwwwwwww.Il :int: goto L_0x060c;
            case Wwwwwwwww.Wwwwwwwwwwwwwwwwwwwwwwwwwwwwwww.IIlllllllll :int: goto L_0x060c;
            case 109: goto L_0x060c;
            case 110: goto L_0x060c;
            case 111: goto L_0x060c;
            case 112: goto L_0x060c;
            case 113: goto L_0x060c;
            case 114: goto L_0x060c;
            case 115: goto L_0x060c;
            case Wwwwwwwwwwwwwwwwwwwwwwwwwwwww.Wwwwwwwwwwwwwwwwwwwwwwwww.Illlllllllllllllllll :int: goto L_0x060c;
            case Wwwwwwwwwwwwwwwwwwwwwwwwwwwww.Wwwwwwwwwwwwwwwwwwwwwwwww.Illllllllllllllllll :int: goto L_0x060c;
            case Wwwwwwwwwwwwwwwwwwwwwwwwwwwww.Wwwwwwwwwwwwwwwwwwwwwwwww.Illlllllllllllllll :int: goto L_0x060c;
            case Wwwwwwwwwwwwwwwwwwwwwwwwwwwww.Wwwwwwwwwwwwwwwwwwwwwwwww.Illllllllllllllll :int: goto L_0x060c;
            case Wwwwwwwwwwwwwwwwwwwwwwwwwwwww.Wwwwwwwwwwwwwwwwwwwwwwwww.Illlllllllllllll :int: goto L_0x060c;
            case Wwwwwwwwwwwwwwwwwwwwwwwwwwwww.Wwwwwwwwwwwwwwwwwwwwwwwww.Illllllllllllll :int: goto L_0x060c;
            case Wwwwwwwwwwwwwwwwwwwwwwwwwwwww.Wwwwwwwwwwwwwwwwwwwwwwwww.Illlllllllllll :int: goto L_0x060c;
            case Wwwwwwwwwwwwwwwwwwwwwwwwwwwww.Wwwwwwwwwwwwwwwwwwwwwwwww.Illllllllllll :int: goto L_0x060c;
            case Wwwwwwwwwwwwwwwwwwwwwwwwwwwww.Wwwwwwwwwwwwwwwwwwwwwwwww.Illlllllllll :int: goto L_0x060c;
            default: goto L_0x060b;
        };
     */
    /* JADX WARNING: Code restructure failed: missing block: B:398:0x060c, code lost:
        f13307Wwwww = true;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:399:0x060e, code lost:
        r1 = com.google.android.exoplayer2.util.C4949Wwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwww.f19891Wwwwwwwwwwwwwwwwwwwwwwwwwwwwwwww;
        r2 = r1.hashCode();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:400:0x0617, code lost:
        if (r2 == 2006354) goto L_0x0629;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:402:0x061c, code lost:
        if (r2 == 2006367) goto L_0x061f;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:405:0x0625, code lost:
        if (r1.equals("AFTN") == false) goto L_0x0632;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:406:0x0627, code lost:
        r0 = 1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:408:0x062f, code lost:
        if (r1.equals("AFTA") == false) goto L_0x0632;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:410:0x0632, code lost:
        r0 = 65535;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:411:0x0633, code lost:
        if (r0 == 0) goto L_0x0638;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:412:0x0635, code lost:
        if (r0 == 1) goto L_0x0638;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:414:0x0638, code lost:
        f13307Wwwww = true;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean O00(java.lang.String r7) {
        /*
            r6 = this;
            java.lang.String r0 = "OMX.google"
            boolean r7 = r7.startsWith(r0)
            r0 = 0
            if (r7 == 0) goto L_0x000a
            return r0
        L_0x000a:
            java.lang.Class<Ccc.Wwwwwwwwwwwwwwwwwwwwwwwwwwwww> r7 = Ccc.C0881Wwwwwwwwwwwwwwwwwwwwwwwwwwwww.class
            monitor-enter(r7)
            boolean r1 = f13308Wwwwww     // Catch:{ all -> 0x0640 }
            if (r1 != 0) goto L_0x063c
            int r1 = com.google.android.exoplayer2.util.C4949Wwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwww.f19893Wwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwww     // Catch:{ all -> 0x0640 }
            r2 = 27
            r3 = 1
            if (r1 > r2) goto L_0x002e
            java.lang.String r4 = "dangal"
            java.lang.String r5 = com.google.android.exoplayer2.util.C4949Wwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwww.f7449Wwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwww     // Catch:{ all -> 0x0640 }
            boolean r4 = r4.equals(r5)     // Catch:{ all -> 0x0640 }
            if (r4 != 0) goto L_0x002a
            java.lang.String r4 = "HWEML"
            boolean r4 = r4.equals(r5)     // Catch:{ all -> 0x0640 }
            if (r4 == 0) goto L_0x002e
        L_0x002a:
            f13307Wwwww = r3     // Catch:{ all -> 0x0640 }
            goto L_0x063a
        L_0x002e:
            if (r1 < r2) goto L_0x0032
            goto L_0x063a
        L_0x0032:
            java.lang.String r1 = com.google.android.exoplayer2.util.C4949Wwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwww.f7449Wwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwww     // Catch:{ all -> 0x0640 }
            int r4 = r1.hashCode()     // Catch:{ all -> 0x0640 }
            r5 = -1
            switch(r4) {
                case -2144781245: goto L_0x05fc;
                case -2144781185: goto L_0x05f1;
                case -2144781160: goto L_0x05e6;
                case -2097309513: goto L_0x05db;
                case -2022874474: goto L_0x05d0;
                case -1978993182: goto L_0x05c5;
                case -1978990237: goto L_0x05ba;
                case -1936688988: goto L_0x05af;
                case -1936688066: goto L_0x05a4;
                case -1936688065: goto L_0x0598;
                case -1931988508: goto L_0x058c;
                case -1696512866: goto L_0x0580;
                case -1680025915: goto L_0x0574;
                case -1615810839: goto L_0x0568;
                case -1554255044: goto L_0x055c;
                case -1481772737: goto L_0x0550;
                case -1481772730: goto L_0x0544;
                case -1481772729: goto L_0x0538;
                case -1320080169: goto L_0x052c;
                case -1217592143: goto L_0x0520;
                case -1180384755: goto L_0x0514;
                case -1139198265: goto L_0x0508;
                case -1052835013: goto L_0x04fc;
                case -993250464: goto L_0x04f1;
                case -993250458: goto L_0x04e6;
                case -965403638: goto L_0x04da;
                case -958336948: goto L_0x04ce;
                case -879245230: goto L_0x04c2;
                case -842500323: goto L_0x04b6;
                case -821392978: goto L_0x04ab;
                case -797483286: goto L_0x049f;
                case -794946968: goto L_0x0493;
                case -788334647: goto L_0x0487;
                case -782144577: goto L_0x047b;
                case -575125681: goto L_0x046f;
                case -521118391: goto L_0x0463;
                case -430914369: goto L_0x0457;
                case -290434366: goto L_0x044b;
                case -282781963: goto L_0x043f;
                case -277133239: goto L_0x0433;
                case -173639913: goto L_0x0427;
                case -56598463: goto L_0x041b;
                case 2126: goto L_0x040f;
                case 2564: goto L_0x0403;
                case 2715: goto L_0x03f7;
                case 2719: goto L_0x03eb;
                case 3483: goto L_0x03df;
                case 73405: goto L_0x03d3;
                case 75739: goto L_0x03c7;
                case 76779: goto L_0x03bb;
                case 78669: goto L_0x03af;
                case 79305: goto L_0x03a3;
                case 80618: goto L_0x0397;
                case 88274: goto L_0x038b;
                case 98846: goto L_0x037f;
                case 98848: goto L_0x0373;
                case 99329: goto L_0x0367;
                case 101481: goto L_0x035b;
                case 1513190: goto L_0x0350;
                case 1514184: goto L_0x0345;
                case 1514185: goto L_0x033a;
                case 2436959: goto L_0x032e;
                case 2463773: goto L_0x0322;
                case 2464648: goto L_0x0316;
                case 2689555: goto L_0x030a;
                case 3154429: goto L_0x02fe;
                case 3284551: goto L_0x02f2;
                case 3351335: goto L_0x02e6;
                case 3386211: goto L_0x02da;
                case 41325051: goto L_0x02ce;
                case 55178625: goto L_0x02c2;
                case 61542055: goto L_0x02b7;
                case 65355429: goto L_0x02ab;
                case 66214468: goto L_0x029f;
                case 66214470: goto L_0x0293;
                case 66214473: goto L_0x0287;
                case 66215429: goto L_0x027b;
                case 66215431: goto L_0x026f;
                case 66215433: goto L_0x0263;
                case 66216390: goto L_0x0257;
                case 76402249: goto L_0x024b;
                case 76404105: goto L_0x023f;
                case 76404911: goto L_0x0233;
                case 80963634: goto L_0x0227;
                case 82882791: goto L_0x021b;
                case 98715550: goto L_0x020f;
                case 102844228: goto L_0x0203;
                case 165221241: goto L_0x01f8;
                case 182191441: goto L_0x01ec;
                case 245388979: goto L_0x01e0;
                case 287431619: goto L_0x01d4;
                case 307593612: goto L_0x01c8;
                case 308517133: goto L_0x01bc;
                case 316215098: goto L_0x01b0;
                case 316215116: goto L_0x01a4;
                case 316246811: goto L_0x0198;
                case 316246818: goto L_0x018c;
                case 407160593: goto L_0x0180;
                case 507412548: goto L_0x0174;
                case 793982701: goto L_0x0168;
                case 794038622: goto L_0x015c;
                case 794040393: goto L_0x0150;
                case 835649806: goto L_0x0144;
                case 917340916: goto L_0x0138;
                case 958008161: goto L_0x012c;
                case 1060579533: goto L_0x0120;
                case 1150207623: goto L_0x0114;
                case 1176899427: goto L_0x0108;
                case 1280332038: goto L_0x00fc;
                case 1306947716: goto L_0x00f0;
                case 1349174697: goto L_0x00e4;
                case 1522194893: goto L_0x00d8;
                case 1691543273: goto L_0x00cc;
                case 1709443163: goto L_0x00c0;
                case 1865889110: goto L_0x00b4;
                case 1906253259: goto L_0x00a8;
                case 1977196784: goto L_0x009c;
                case 2006372676: goto L_0x0090;
                case 2029784656: goto L_0x0084;
                case 2030379515: goto L_0x0078;
                case 2033393791: goto L_0x006c;
                case 2047190025: goto L_0x0062;
                case 2047252157: goto L_0x0056;
                case 2048319463: goto L_0x004a;
                case 2048855701: goto L_0x003e;
                default: goto L_0x003c;
            }     // Catch:{ all -> 0x0640 }
        L_0x003c:
            goto L_0x0607
        L_0x003e:
            java.lang.String r2 = "HWWAS-H"
            boolean r1 = r1.equals(r2)     // Catch:{ all -> 0x0640 }
            if (r1 == 0) goto L_0x0607
            r2 = 55
            goto L_0x0608
        L_0x004a:
            java.lang.String r2 = "HWVNS-H"
            boolean r1 = r1.equals(r2)     // Catch:{ all -> 0x0640 }
            if (r1 == 0) goto L_0x0607
            r2 = 54
            goto L_0x0608
        L_0x0056:
            java.lang.String r2 = "ELUGA_Prim"
            boolean r1 = r1.equals(r2)     // Catch:{ all -> 0x0640 }
            if (r1 == 0) goto L_0x0607
            r2 = 28
            goto L_0x0608
        L_0x0062:
            java.lang.String r4 = "ELUGA_Note"
            boolean r1 = r1.equals(r4)     // Catch:{ all -> 0x0640 }
            if (r1 == 0) goto L_0x0607
            goto L_0x0608
        L_0x006c:
            java.lang.String r2 = "ASUS_X00AD_2"
            boolean r1 = r1.equals(r2)     // Catch:{ all -> 0x0640 }
            if (r1 == 0) goto L_0x0607
            r2 = 12
            goto L_0x0608
        L_0x0078:
            java.lang.String r2 = "HWCAM-H"
            boolean r1 = r1.equals(r2)     // Catch:{ all -> 0x0640 }
            if (r1 == 0) goto L_0x0607
            r2 = 53
            goto L_0x0608
        L_0x0084:
            java.lang.String r2 = "HWBLN-H"
            boolean r1 = r1.equals(r2)     // Catch:{ all -> 0x0640 }
            if (r1 == 0) goto L_0x0607
            r2 = 52
            goto L_0x0608
        L_0x0090:
            java.lang.String r2 = "BRAVIA_ATV3_4K"
            boolean r1 = r1.equals(r2)     // Catch:{ all -> 0x0640 }
            if (r1 == 0) goto L_0x0607
            r2 = 16
            goto L_0x0608
        L_0x009c:
            java.lang.String r2 = "Infinix-X572"
            boolean r1 = r1.equals(r2)     // Catch:{ all -> 0x0640 }
            if (r1 == 0) goto L_0x0607
            r2 = 58
            goto L_0x0608
        L_0x00a8:
            java.lang.String r2 = "PB2-670M"
            boolean r1 = r1.equals(r2)     // Catch:{ all -> 0x0640 }
            if (r1 == 0) goto L_0x0607
            r2 = 86
            goto L_0x0608
        L_0x00b4:
            java.lang.String r2 = "santoni"
            boolean r1 = r1.equals(r2)     // Catch:{ all -> 0x0640 }
            if (r1 == 0) goto L_0x0607
            r2 = 102(0x66, float:1.43E-43)
            goto L_0x0608
        L_0x00c0:
            java.lang.String r2 = "iball8735_9806"
            boolean r1 = r1.equals(r2)     // Catch:{ all -> 0x0640 }
            if (r1 == 0) goto L_0x0607
            r2 = 57
            goto L_0x0608
        L_0x00cc:
            java.lang.String r2 = "CPH1609"
            boolean r1 = r1.equals(r2)     // Catch:{ all -> 0x0640 }
            if (r1 == 0) goto L_0x0607
            r2 = 20
            goto L_0x0608
        L_0x00d8:
            java.lang.String r2 = "woods_f"
            boolean r1 = r1.equals(r2)     // Catch:{ all -> 0x0640 }
            if (r1 == 0) goto L_0x0607
            r2 = 118(0x76, float:1.65E-43)
            goto L_0x0608
        L_0x00e4:
            java.lang.String r2 = "htc_e56ml_dtul"
            boolean r1 = r1.equals(r2)     // Catch:{ all -> 0x0640 }
            if (r1 == 0) goto L_0x0607
            r2 = 50
            goto L_0x0608
        L_0x00f0:
            java.lang.String r2 = "EverStar_S"
            boolean r1 = r1.equals(r2)     // Catch:{ all -> 0x0640 }
            if (r1 == 0) goto L_0x0607
            r2 = 30
            goto L_0x0608
        L_0x00fc:
            java.lang.String r2 = "hwALE-H"
            boolean r1 = r1.equals(r2)     // Catch:{ all -> 0x0640 }
            if (r1 == 0) goto L_0x0607
            r2 = 51
            goto L_0x0608
        L_0x0108:
            java.lang.String r2 = "itel_S41"
            boolean r1 = r1.equals(r2)     // Catch:{ all -> 0x0640 }
            if (r1 == 0) goto L_0x0607
            r2 = 60
            goto L_0x0608
        L_0x0114:
            java.lang.String r2 = "LS-5017"
            boolean r1 = r1.equals(r2)     // Catch:{ all -> 0x0640 }
            if (r1 == 0) goto L_0x0607
            r2 = 66
            goto L_0x0608
        L_0x0120:
            java.lang.String r2 = "panell_d"
            boolean r1 = r1.equals(r2)     // Catch:{ all -> 0x0640 }
            if (r1 == 0) goto L_0x0607
            r2 = 82
            goto L_0x0608
        L_0x012c:
            java.lang.String r2 = "j2xlteins"
            boolean r1 = r1.equals(r2)     // Catch:{ all -> 0x0640 }
            if (r1 == 0) goto L_0x0607
            r2 = 61
            goto L_0x0608
        L_0x0138:
            java.lang.String r2 = "A7000plus"
            boolean r1 = r1.equals(r2)     // Catch:{ all -> 0x0640 }
            if (r1 == 0) goto L_0x0607
            r2 = 8
            goto L_0x0608
        L_0x0144:
            java.lang.String r2 = "manning"
            boolean r1 = r1.equals(r2)     // Catch:{ all -> 0x0640 }
            if (r1 == 0) goto L_0x0607
            r2 = 68
            goto L_0x0608
        L_0x0150:
            java.lang.String r2 = "GIONEE_WBL7519"
            boolean r1 = r1.equals(r2)     // Catch:{ all -> 0x0640 }
            if (r1 == 0) goto L_0x0607
            r2 = 48
            goto L_0x0608
        L_0x015c:
            java.lang.String r2 = "GIONEE_WBL7365"
            boolean r1 = r1.equals(r2)     // Catch:{ all -> 0x0640 }
            if (r1 == 0) goto L_0x0607
            r2 = 47
            goto L_0x0608
        L_0x0168:
            java.lang.String r2 = "GIONEE_WBL5708"
            boolean r1 = r1.equals(r2)     // Catch:{ all -> 0x0640 }
            if (r1 == 0) goto L_0x0607
            r2 = 46
            goto L_0x0608
        L_0x0174:
            java.lang.String r2 = "QM16XE_U"
            boolean r1 = r1.equals(r2)     // Catch:{ all -> 0x0640 }
            if (r1 == 0) goto L_0x0607
            r2 = 100
            goto L_0x0608
        L_0x0180:
            java.lang.String r2 = "Pixi5-10_4G"
            boolean r1 = r1.equals(r2)     // Catch:{ all -> 0x0640 }
            if (r1 == 0) goto L_0x0607
            r2 = 92
            goto L_0x0608
        L_0x018c:
            java.lang.String r2 = "TB3-850M"
            boolean r1 = r1.equals(r2)     // Catch:{ all -> 0x0640 }
            if (r1 == 0) goto L_0x0607
            r2 = 110(0x6e, float:1.54E-43)
            goto L_0x0608
        L_0x0198:
            java.lang.String r2 = "TB3-850F"
            boolean r1 = r1.equals(r2)     // Catch:{ all -> 0x0640 }
            if (r1 == 0) goto L_0x0607
            r2 = 109(0x6d, float:1.53E-43)
            goto L_0x0608
        L_0x01a4:
            java.lang.String r2 = "TB3-730X"
            boolean r1 = r1.equals(r2)     // Catch:{ all -> 0x0640 }
            if (r1 == 0) goto L_0x0607
            r2 = 108(0x6c, float:1.51E-43)
            goto L_0x0608
        L_0x01b0:
            java.lang.String r2 = "TB3-730F"
            boolean r1 = r1.equals(r2)     // Catch:{ all -> 0x0640 }
            if (r1 == 0) goto L_0x0607
            r2 = 107(0x6b, float:1.5E-43)
            goto L_0x0608
        L_0x01bc:
            java.lang.String r2 = "A7020a48"
            boolean r1 = r1.equals(r2)     // Catch:{ all -> 0x0640 }
            if (r1 == 0) goto L_0x0607
            r2 = 10
            goto L_0x0608
        L_0x01c8:
            java.lang.String r2 = "A7010a48"
            boolean r1 = r1.equals(r2)     // Catch:{ all -> 0x0640 }
            if (r1 == 0) goto L_0x0607
            r2 = 9
            goto L_0x0608
        L_0x01d4:
            java.lang.String r2 = "griffin"
            boolean r1 = r1.equals(r2)     // Catch:{ all -> 0x0640 }
            if (r1 == 0) goto L_0x0607
            r2 = 49
            goto L_0x0608
        L_0x01e0:
            java.lang.String r2 = "marino_f"
            boolean r1 = r1.equals(r2)     // Catch:{ all -> 0x0640 }
            if (r1 == 0) goto L_0x0607
            r2 = 69
            goto L_0x0608
        L_0x01ec:
            java.lang.String r2 = "CPY83_I00"
            boolean r1 = r1.equals(r2)     // Catch:{ all -> 0x0640 }
            if (r1 == 0) goto L_0x0607
            r2 = 21
            goto L_0x0608
        L_0x01f8:
            java.lang.String r2 = "A2016a40"
            boolean r1 = r1.equals(r2)     // Catch:{ all -> 0x0640 }
            if (r1 == 0) goto L_0x0607
            r2 = 6
            goto L_0x0608
        L_0x0203:
            java.lang.String r2 = "le_x6"
            boolean r1 = r1.equals(r2)     // Catch:{ all -> 0x0640 }
            if (r1 == 0) goto L_0x0607
            r2 = 65
            goto L_0x0608
        L_0x020f:
            java.lang.String r2 = "i9031"
            boolean r1 = r1.equals(r2)     // Catch:{ all -> 0x0640 }
            if (r1 == 0) goto L_0x0607
            r2 = 56
            goto L_0x0608
        L_0x021b:
            java.lang.String r2 = "X3_HK"
            boolean r1 = r1.equals(r2)     // Catch:{ all -> 0x0640 }
            if (r1 == 0) goto L_0x0607
            r2 = 120(0x78, float:1.68E-43)
            goto L_0x0608
        L_0x0227:
            java.lang.String r2 = "V23GB"
            boolean r1 = r1.equals(r2)     // Catch:{ all -> 0x0640 }
            if (r1 == 0) goto L_0x0607
            r2 = 113(0x71, float:1.58E-43)
            goto L_0x0608
        L_0x0233:
            java.lang.String r2 = "Q4310"
            boolean r1 = r1.equals(r2)     // Catch:{ all -> 0x0640 }
            if (r1 == 0) goto L_0x0607
            r2 = 98
            goto L_0x0608
        L_0x023f:
            java.lang.String r2 = "Q4260"
            boolean r1 = r1.equals(r2)     // Catch:{ all -> 0x0640 }
            if (r1 == 0) goto L_0x0607
            r2 = 96
            goto L_0x0608
        L_0x024b:
            java.lang.String r2 = "PRO7S"
            boolean r1 = r1.equals(r2)     // Catch:{ all -> 0x0640 }
            if (r1 == 0) goto L_0x0607
            r2 = 94
            goto L_0x0608
        L_0x0257:
            java.lang.String r2 = "F3311"
            boolean r1 = r1.equals(r2)     // Catch:{ all -> 0x0640 }
            if (r1 == 0) goto L_0x0607
            r2 = 37
            goto L_0x0608
        L_0x0263:
            java.lang.String r2 = "F3215"
            boolean r1 = r1.equals(r2)     // Catch:{ all -> 0x0640 }
            if (r1 == 0) goto L_0x0607
            r2 = 36
            goto L_0x0608
        L_0x026f:
            java.lang.String r2 = "F3213"
            boolean r1 = r1.equals(r2)     // Catch:{ all -> 0x0640 }
            if (r1 == 0) goto L_0x0607
            r2 = 35
            goto L_0x0608
        L_0x027b:
            java.lang.String r2 = "F3211"
            boolean r1 = r1.equals(r2)     // Catch:{ all -> 0x0640 }
            if (r1 == 0) goto L_0x0607
            r2 = 34
            goto L_0x0608
        L_0x0287:
            java.lang.String r2 = "F3116"
            boolean r1 = r1.equals(r2)     // Catch:{ all -> 0x0640 }
            if (r1 == 0) goto L_0x0607
            r2 = 33
            goto L_0x0608
        L_0x0293:
            java.lang.String r2 = "F3113"
            boolean r1 = r1.equals(r2)     // Catch:{ all -> 0x0640 }
            if (r1 == 0) goto L_0x0607
            r2 = 32
            goto L_0x0608
        L_0x029f:
            java.lang.String r2 = "F3111"
            boolean r1 = r1.equals(r2)     // Catch:{ all -> 0x0640 }
            if (r1 == 0) goto L_0x0607
            r2 = 31
            goto L_0x0608
        L_0x02ab:
            java.lang.String r2 = "E5643"
            boolean r1 = r1.equals(r2)     // Catch:{ all -> 0x0640 }
            if (r1 == 0) goto L_0x0607
            r2 = 25
            goto L_0x0608
        L_0x02b7:
            java.lang.String r2 = "A1601"
            boolean r1 = r1.equals(r2)     // Catch:{ all -> 0x0640 }
            if (r1 == 0) goto L_0x0607
            r2 = 5
            goto L_0x0608
        L_0x02c2:
            java.lang.String r2 = "Aura_Note_2"
            boolean r1 = r1.equals(r2)     // Catch:{ all -> 0x0640 }
            if (r1 == 0) goto L_0x0607
            r2 = 13
            goto L_0x0608
        L_0x02ce:
            java.lang.String r2 = "MEIZU_M5"
            boolean r1 = r1.equals(r2)     // Catch:{ all -> 0x0640 }
            if (r1 == 0) goto L_0x0607
            r2 = 70
            goto L_0x0608
        L_0x02da:
            java.lang.String r2 = "p212"
            boolean r1 = r1.equals(r2)     // Catch:{ all -> 0x0640 }
            if (r1 == 0) goto L_0x0607
            r2 = 79
            goto L_0x0608
        L_0x02e6:
            java.lang.String r2 = "mido"
            boolean r1 = r1.equals(r2)     // Catch:{ all -> 0x0640 }
            if (r1 == 0) goto L_0x0607
            r2 = 72
            goto L_0x0608
        L_0x02f2:
            java.lang.String r2 = "kate"
            boolean r1 = r1.equals(r2)     // Catch:{ all -> 0x0640 }
            if (r1 == 0) goto L_0x0607
            r2 = 64
            goto L_0x0608
        L_0x02fe:
            java.lang.String r2 = "fugu"
            boolean r1 = r1.equals(r2)     // Catch:{ all -> 0x0640 }
            if (r1 == 0) goto L_0x0607
            r2 = 39
            goto L_0x0608
        L_0x030a:
            java.lang.String r2 = "XE2X"
            boolean r1 = r1.equals(r2)     // Catch:{ all -> 0x0640 }
            if (r1 == 0) goto L_0x0607
            r2 = 121(0x79, float:1.7E-43)
            goto L_0x0608
        L_0x0316:
            java.lang.String r2 = "Q427"
            boolean r1 = r1.equals(r2)     // Catch:{ all -> 0x0640 }
            if (r1 == 0) goto L_0x0607
            r2 = 97
            goto L_0x0608
        L_0x0322:
            java.lang.String r2 = "Q350"
            boolean r1 = r1.equals(r2)     // Catch:{ all -> 0x0640 }
            if (r1 == 0) goto L_0x0607
            r2 = 95
            goto L_0x0608
        L_0x032e:
            java.lang.String r2 = "P681"
            boolean r1 = r1.equals(r2)     // Catch:{ all -> 0x0640 }
            if (r1 == 0) goto L_0x0607
            r2 = 80
            goto L_0x0608
        L_0x033a:
            java.lang.String r2 = "1714"
            boolean r1 = r1.equals(r2)     // Catch:{ all -> 0x0640 }
            if (r1 == 0) goto L_0x0607
            r2 = 2
            goto L_0x0608
        L_0x0345:
            java.lang.String r2 = "1713"
            boolean r1 = r1.equals(r2)     // Catch:{ all -> 0x0640 }
            if (r1 == 0) goto L_0x0607
            r2 = 1
            goto L_0x0608
        L_0x0350:
            java.lang.String r2 = "1601"
            boolean r1 = r1.equals(r2)     // Catch:{ all -> 0x0640 }
            if (r1 == 0) goto L_0x0607
            r2 = 0
            goto L_0x0608
        L_0x035b:
            java.lang.String r2 = "flo"
            boolean r1 = r1.equals(r2)     // Catch:{ all -> 0x0640 }
            if (r1 == 0) goto L_0x0607
            r2 = 38
            goto L_0x0608
        L_0x0367:
            java.lang.String r2 = "deb"
            boolean r1 = r1.equals(r2)     // Catch:{ all -> 0x0640 }
            if (r1 == 0) goto L_0x0607
            r2 = 24
            goto L_0x0608
        L_0x0373:
            java.lang.String r2 = "cv3"
            boolean r1 = r1.equals(r2)     // Catch:{ all -> 0x0640 }
            if (r1 == 0) goto L_0x0607
            r2 = 23
            goto L_0x0608
        L_0x037f:
            java.lang.String r2 = "cv1"
            boolean r1 = r1.equals(r2)     // Catch:{ all -> 0x0640 }
            if (r1 == 0) goto L_0x0607
            r2 = 22
            goto L_0x0608
        L_0x038b:
            java.lang.String r2 = "Z80"
            boolean r1 = r1.equals(r2)     // Catch:{ all -> 0x0640 }
            if (r1 == 0) goto L_0x0607
            r2 = 124(0x7c, float:1.74E-43)
            goto L_0x0608
        L_0x0397:
            java.lang.String r2 = "QX1"
            boolean r1 = r1.equals(r2)     // Catch:{ all -> 0x0640 }
            if (r1 == 0) goto L_0x0607
            r2 = 101(0x65, float:1.42E-43)
            goto L_0x0608
        L_0x03a3:
            java.lang.String r2 = "PLE"
            boolean r1 = r1.equals(r2)     // Catch:{ all -> 0x0640 }
            if (r1 == 0) goto L_0x0607
            r2 = 93
            goto L_0x0608
        L_0x03af:
            java.lang.String r2 = "P85"
            boolean r1 = r1.equals(r2)     // Catch:{ all -> 0x0640 }
            if (r1 == 0) goto L_0x0607
            r2 = 81
            goto L_0x0608
        L_0x03bb:
            java.lang.String r2 = "MX6"
            boolean r1 = r1.equals(r2)     // Catch:{ all -> 0x0640 }
            if (r1 == 0) goto L_0x0607
            r2 = 73
            goto L_0x0608
        L_0x03c7:
            java.lang.String r2 = "M5c"
            boolean r1 = r1.equals(r2)     // Catch:{ all -> 0x0640 }
            if (r1 == 0) goto L_0x0607
            r2 = 67
            goto L_0x0608
        L_0x03d3:
            java.lang.String r2 = "JGZ"
            boolean r1 = r1.equals(r2)     // Catch:{ all -> 0x0640 }
            if (r1 == 0) goto L_0x0607
            r2 = 62
            goto L_0x0608
        L_0x03df:
            java.lang.String r2 = "mh"
            boolean r1 = r1.equals(r2)     // Catch:{ all -> 0x0640 }
            if (r1 == 0) goto L_0x0607
            r2 = 71
            goto L_0x0608
        L_0x03eb:
            java.lang.String r2 = "V5"
            boolean r1 = r1.equals(r2)     // Catch:{ all -> 0x0640 }
            if (r1 == 0) goto L_0x0607
            r2 = 114(0x72, float:1.6E-43)
            goto L_0x0608
        L_0x03f7:
            java.lang.String r2 = "V1"
            boolean r1 = r1.equals(r2)     // Catch:{ all -> 0x0640 }
            if (r1 == 0) goto L_0x0607
            r2 = 112(0x70, float:1.57E-43)
            goto L_0x0608
        L_0x0403:
            java.lang.String r2 = "Q5"
            boolean r1 = r1.equals(r2)     // Catch:{ all -> 0x0640 }
            if (r1 == 0) goto L_0x0607
            r2 = 99
            goto L_0x0608
        L_0x040f:
            java.lang.String r2 = "C1"
            boolean r1 = r1.equals(r2)     // Catch:{ all -> 0x0640 }
            if (r1 == 0) goto L_0x0607
            r2 = 17
            goto L_0x0608
        L_0x041b:
            java.lang.String r2 = "woods_fn"
            boolean r1 = r1.equals(r2)     // Catch:{ all -> 0x0640 }
            if (r1 == 0) goto L_0x0607
            r2 = 119(0x77, float:1.67E-43)
            goto L_0x0608
        L_0x0427:
            java.lang.String r2 = "ELUGA_A3_Pro"
            boolean r1 = r1.equals(r2)     // Catch:{ all -> 0x0640 }
            if (r1 == 0) goto L_0x0607
            r2 = 26
            goto L_0x0608
        L_0x0433:
            java.lang.String r2 = "Z12_PRO"
            boolean r1 = r1.equals(r2)     // Catch:{ all -> 0x0640 }
            if (r1 == 0) goto L_0x0607
            r2 = 123(0x7b, float:1.72E-43)
            goto L_0x0608
        L_0x043f:
            java.lang.String r2 = "BLACK-1X"
            boolean r1 = r1.equals(r2)     // Catch:{ all -> 0x0640 }
            if (r1 == 0) goto L_0x0607
            r2 = 14
            goto L_0x0608
        L_0x044b:
            java.lang.String r2 = "taido_row"
            boolean r1 = r1.equals(r2)     // Catch:{ all -> 0x0640 }
            if (r1 == 0) goto L_0x0607
            r2 = 106(0x6a, float:1.49E-43)
            goto L_0x0608
        L_0x0457:
            java.lang.String r2 = "Pixi4-7_3G"
            boolean r1 = r1.equals(r2)     // Catch:{ all -> 0x0640 }
            if (r1 == 0) goto L_0x0607
            r2 = 91
            goto L_0x0608
        L_0x0463:
            java.lang.String r2 = "GIONEE_GBL7360"
            boolean r1 = r1.equals(r2)     // Catch:{ all -> 0x0640 }
            if (r1 == 0) goto L_0x0607
            r2 = 42
            goto L_0x0608
        L_0x046f:
            java.lang.String r2 = "GiONEE_CBL7513"
            boolean r1 = r1.equals(r2)     // Catch:{ all -> 0x0640 }
            if (r1 == 0) goto L_0x0607
            r2 = 40
            goto L_0x0608
        L_0x047b:
            java.lang.String r2 = "OnePlus5T"
            boolean r1 = r1.equals(r2)     // Catch:{ all -> 0x0640 }
            if (r1 == 0) goto L_0x0607
            r2 = 78
            goto L_0x0608
        L_0x0487:
            java.lang.String r2 = "whyred"
            boolean r1 = r1.equals(r2)     // Catch:{ all -> 0x0640 }
            if (r1 == 0) goto L_0x0607
            r2 = 117(0x75, float:1.64E-43)
            goto L_0x0608
        L_0x0493:
            java.lang.String r2 = "watson"
            boolean r1 = r1.equals(r2)     // Catch:{ all -> 0x0640 }
            if (r1 == 0) goto L_0x0607
            r2 = 116(0x74, float:1.63E-43)
            goto L_0x0608
        L_0x049f:
            java.lang.String r2 = "SVP-DTV15"
            boolean r1 = r1.equals(r2)     // Catch:{ all -> 0x0640 }
            if (r1 == 0) goto L_0x0607
            r2 = 104(0x68, float:1.46E-43)
            goto L_0x0608
        L_0x04ab:
            java.lang.String r2 = "A7000-a"
            boolean r1 = r1.equals(r2)     // Catch:{ all -> 0x0640 }
            if (r1 == 0) goto L_0x0607
            r2 = 7
            goto L_0x0608
        L_0x04b6:
            java.lang.String r2 = "nicklaus_f"
            boolean r1 = r1.equals(r2)     // Catch:{ all -> 0x0640 }
            if (r1 == 0) goto L_0x0607
            r2 = 75
            goto L_0x0608
        L_0x04c2:
            java.lang.String r2 = "tcl_eu"
            boolean r1 = r1.equals(r2)     // Catch:{ all -> 0x0640 }
            if (r1 == 0) goto L_0x0607
            r2 = 111(0x6f, float:1.56E-43)
            goto L_0x0608
        L_0x04ce:
            java.lang.String r2 = "ELUGA_Ray_X"
            boolean r1 = r1.equals(r2)     // Catch:{ all -> 0x0640 }
            if (r1 == 0) goto L_0x0607
            r2 = 29
            goto L_0x0608
        L_0x04da:
            java.lang.String r2 = "s905x018"
            boolean r1 = r1.equals(r2)     // Catch:{ all -> 0x0640 }
            if (r1 == 0) goto L_0x0607
            r2 = 105(0x69, float:1.47E-43)
            goto L_0x0608
        L_0x04e6:
            java.lang.String r2 = "A10-70L"
            boolean r1 = r1.equals(r2)     // Catch:{ all -> 0x0640 }
            if (r1 == 0) goto L_0x0607
            r2 = 4
            goto L_0x0608
        L_0x04f1:
            java.lang.String r2 = "A10-70F"
            boolean r1 = r1.equals(r2)     // Catch:{ all -> 0x0640 }
            if (r1 == 0) goto L_0x0607
            r2 = 3
            goto L_0x0608
        L_0x04fc:
            java.lang.String r2 = "namath"
            boolean r1 = r1.equals(r2)     // Catch:{ all -> 0x0640 }
            if (r1 == 0) goto L_0x0607
            r2 = 74
            goto L_0x0608
        L_0x0508:
            java.lang.String r2 = "Slate_Pro"
            boolean r1 = r1.equals(r2)     // Catch:{ all -> 0x0640 }
            if (r1 == 0) goto L_0x0607
            r2 = 103(0x67, float:1.44E-43)
            goto L_0x0608
        L_0x0514:
            java.lang.String r2 = "iris60"
            boolean r1 = r1.equals(r2)     // Catch:{ all -> 0x0640 }
            if (r1 == 0) goto L_0x0607
            r2 = 59
            goto L_0x0608
        L_0x0520:
            java.lang.String r2 = "BRAVIA_ATV2"
            boolean r1 = r1.equals(r2)     // Catch:{ all -> 0x0640 }
            if (r1 == 0) goto L_0x0607
            r2 = 15
            goto L_0x0608
        L_0x052c:
            java.lang.String r2 = "GiONEE_GBL7319"
            boolean r1 = r1.equals(r2)     // Catch:{ all -> 0x0640 }
            if (r1 == 0) goto L_0x0607
            r2 = 41
            goto L_0x0608
        L_0x0538:
            java.lang.String r2 = "panell_dt"
            boolean r1 = r1.equals(r2)     // Catch:{ all -> 0x0640 }
            if (r1 == 0) goto L_0x0607
            r2 = 85
            goto L_0x0608
        L_0x0544:
            java.lang.String r2 = "panell_ds"
            boolean r1 = r1.equals(r2)     // Catch:{ all -> 0x0640 }
            if (r1 == 0) goto L_0x0607
            r2 = 84
            goto L_0x0608
        L_0x0550:
            java.lang.String r2 = "panell_dl"
            boolean r1 = r1.equals(r2)     // Catch:{ all -> 0x0640 }
            if (r1 == 0) goto L_0x0607
            r2 = 83
            goto L_0x0608
        L_0x055c:
            java.lang.String r2 = "vernee_M5"
            boolean r1 = r1.equals(r2)     // Catch:{ all -> 0x0640 }
            if (r1 == 0) goto L_0x0607
            r2 = 115(0x73, float:1.61E-43)
            goto L_0x0608
        L_0x0568:
            java.lang.String r2 = "Phantom6"
            boolean r1 = r1.equals(r2)     // Catch:{ all -> 0x0640 }
            if (r1 == 0) goto L_0x0607
            r2 = 90
            goto L_0x0608
        L_0x0574:
            java.lang.String r2 = "ComioS1"
            boolean r1 = r1.equals(r2)     // Catch:{ all -> 0x0640 }
            if (r1 == 0) goto L_0x0607
            r2 = 18
            goto L_0x0608
        L_0x0580:
            java.lang.String r2 = "XT1663"
            boolean r1 = r1.equals(r2)     // Catch:{ all -> 0x0640 }
            if (r1 == 0) goto L_0x0607
            r2 = 122(0x7a, float:1.71E-43)
            goto L_0x0608
        L_0x058c:
            java.lang.String r2 = "AquaPowerM"
            boolean r1 = r1.equals(r2)     // Catch:{ all -> 0x0640 }
            if (r1 == 0) goto L_0x0607
            r2 = 11
            goto L_0x0608
        L_0x0598:
            java.lang.String r2 = "PGN611"
            boolean r1 = r1.equals(r2)     // Catch:{ all -> 0x0640 }
            if (r1 == 0) goto L_0x0607
            r2 = 89
            goto L_0x0608
        L_0x05a4:
            java.lang.String r2 = "PGN610"
            boolean r1 = r1.equals(r2)     // Catch:{ all -> 0x0640 }
            if (r1 == 0) goto L_0x0607
            r2 = 88
            goto L_0x0608
        L_0x05af:
            java.lang.String r2 = "PGN528"
            boolean r1 = r1.equals(r2)     // Catch:{ all -> 0x0640 }
            if (r1 == 0) goto L_0x0607
            r2 = 87
            goto L_0x0608
        L_0x05ba:
            java.lang.String r2 = "NX573J"
            boolean r1 = r1.equals(r2)     // Catch:{ all -> 0x0640 }
            if (r1 == 0) goto L_0x0607
            r2 = 77
            goto L_0x0608
        L_0x05c5:
            java.lang.String r2 = "NX541J"
            boolean r1 = r1.equals(r2)     // Catch:{ all -> 0x0640 }
            if (r1 == 0) goto L_0x0607
            r2 = 76
            goto L_0x0608
        L_0x05d0:
            java.lang.String r2 = "CP8676_I02"
            boolean r1 = r1.equals(r2)     // Catch:{ all -> 0x0640 }
            if (r1 == 0) goto L_0x0607
            r2 = 19
            goto L_0x0608
        L_0x05db:
            java.lang.String r2 = "K50a40"
            boolean r1 = r1.equals(r2)     // Catch:{ all -> 0x0640 }
            if (r1 == 0) goto L_0x0607
            r2 = 63
            goto L_0x0608
        L_0x05e6:
            java.lang.String r2 = "GIONEE_SWW1631"
            boolean r1 = r1.equals(r2)     // Catch:{ all -> 0x0640 }
            if (r1 == 0) goto L_0x0607
            r2 = 45
            goto L_0x0608
        L_0x05f1:
            java.lang.String r2 = "GIONEE_SWW1627"
            boolean r1 = r1.equals(r2)     // Catch:{ all -> 0x0640 }
            if (r1 == 0) goto L_0x0607
            r2 = 44
            goto L_0x0608
        L_0x05fc:
            java.lang.String r2 = "GIONEE_SWW1609"
            boolean r1 = r1.equals(r2)     // Catch:{ all -> 0x0640 }
            if (r1 == 0) goto L_0x0607
            r2 = 43
            goto L_0x0608
        L_0x0607:
            r2 = -1
        L_0x0608:
            switch(r2) {
                case 0: goto L_0x060c;
                case 1: goto L_0x060c;
                case 2: goto L_0x060c;
                case 3: goto L_0x060c;
                case 4: goto L_0x060c;
                case 5: goto L_0x060c;
                case 6: goto L_0x060c;
                case 7: goto L_0x060c;
                case 8: goto L_0x060c;
                case 9: goto L_0x060c;
                case 10: goto L_0x060c;
                case 11: goto L_0x060c;
                case 12: goto L_0x060c;
                case 13: goto L_0x060c;
                case 14: goto L_0x060c;
                case 15: goto L_0x060c;
                case 16: goto L_0x060c;
                case 17: goto L_0x060c;
                case 18: goto L_0x060c;
                case 19: goto L_0x060c;
                case 20: goto L_0x060c;
                case 21: goto L_0x060c;
                case 22: goto L_0x060c;
                case 23: goto L_0x060c;
                case 24: goto L_0x060c;
                case 25: goto L_0x060c;
                case 26: goto L_0x060c;
                case 27: goto L_0x060c;
                case 28: goto L_0x060c;
                case 29: goto L_0x060c;
                case 30: goto L_0x060c;
                case 31: goto L_0x060c;
                case 32: goto L_0x060c;
                case 33: goto L_0x060c;
                case 34: goto L_0x060c;
                case 35: goto L_0x060c;
                case 36: goto L_0x060c;
                case 37: goto L_0x060c;
                case 38: goto L_0x060c;
                case 39: goto L_0x060c;
                case 40: goto L_0x060c;
                case 41: goto L_0x060c;
                case 42: goto L_0x060c;
                case 43: goto L_0x060c;
                case 44: goto L_0x060c;
                case 45: goto L_0x060c;
                case 46: goto L_0x060c;
                case 47: goto L_0x060c;
                case 48: goto L_0x060c;
                case 49: goto L_0x060c;
                case 50: goto L_0x060c;
                case 51: goto L_0x060c;
                case 52: goto L_0x060c;
                case 53: goto L_0x060c;
                case 54: goto L_0x060c;
                case 55: goto L_0x060c;
                case 56: goto L_0x060c;
                case 57: goto L_0x060c;
                case 58: goto L_0x060c;
                case 59: goto L_0x060c;
                case 60: goto L_0x060c;
                case 61: goto L_0x060c;
                case 62: goto L_0x060c;
                case 63: goto L_0x060c;
                case 64: goto L_0x060c;
                case 65: goto L_0x060c;
                case 66: goto L_0x060c;
                case 67: goto L_0x060c;
                case 68: goto L_0x060c;
                case 69: goto L_0x060c;
                case 70: goto L_0x060c;
                case 71: goto L_0x060c;
                case 72: goto L_0x060c;
                case 73: goto L_0x060c;
                case 74: goto L_0x060c;
                case 75: goto L_0x060c;
                case 76: goto L_0x060c;
                case 77: goto L_0x060c;
                case 78: goto L_0x060c;
                case 79: goto L_0x060c;
                case 80: goto L_0x060c;
                case 81: goto L_0x060c;
                case 82: goto L_0x060c;
                case 83: goto L_0x060c;
                case 84: goto L_0x060c;
                case 85: goto L_0x060c;
                case 86: goto L_0x060c;
                case 87: goto L_0x060c;
                case 88: goto L_0x060c;
                case 89: goto L_0x060c;
                case 90: goto L_0x060c;
                case 91: goto L_0x060c;
                case 92: goto L_0x060c;
                case 93: goto L_0x060c;
                case 94: goto L_0x060c;
                case 95: goto L_0x060c;
                case 96: goto L_0x060c;
                case 97: goto L_0x060c;
                case 98: goto L_0x060c;
                case 99: goto L_0x060c;
                case 100: goto L_0x060c;
                case 101: goto L_0x060c;
                case 102: goto L_0x060c;
                case 103: goto L_0x060c;
                case 104: goto L_0x060c;
                case 105: goto L_0x060c;
                case 106: goto L_0x060c;
                case 107: goto L_0x060c;
                case 108: goto L_0x060c;
                case 109: goto L_0x060c;
                case 110: goto L_0x060c;
                case 111: goto L_0x060c;
                case 112: goto L_0x060c;
                case 113: goto L_0x060c;
                case 114: goto L_0x060c;
                case 115: goto L_0x060c;
                case 116: goto L_0x060c;
                case 117: goto L_0x060c;
                case 118: goto L_0x060c;
                case 119: goto L_0x060c;
                case 120: goto L_0x060c;
                case 121: goto L_0x060c;
                case 122: goto L_0x060c;
                case 123: goto L_0x060c;
                case 124: goto L_0x060c;
                default: goto L_0x060b;
            }     // Catch:{ all -> 0x0640 }
        L_0x060b:
            goto L_0x060e
        L_0x060c:
            f13307Wwwww = r3     // Catch:{ all -> 0x0640 }
        L_0x060e:
            java.lang.String r1 = com.google.android.exoplayer2.util.C4949Wwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwww.f19891Wwwwwwwwwwwwwwwwwwwwwwwwwwwwwwww     // Catch:{ all -> 0x0640 }
            int r2 = r1.hashCode()     // Catch:{ all -> 0x0640 }
            r4 = 2006354(0x1e9d52, float:2.811501E-39)
            if (r2 == r4) goto L_0x0629
            r0 = 2006367(0x1e9d5f, float:2.811519E-39)
            if (r2 == r0) goto L_0x061f
            goto L_0x0632
        L_0x061f:
            java.lang.String r0 = "AFTN"
            boolean r0 = r1.equals(r0)     // Catch:{ all -> 0x0640 }
            if (r0 == 0) goto L_0x0632
            r0 = 1
            goto L_0x0633
        L_0x0629:
            java.lang.String r2 = "AFTA"
            boolean r1 = r1.equals(r2)     // Catch:{ all -> 0x0640 }
            if (r1 == 0) goto L_0x0632
            goto L_0x0633
        L_0x0632:
            r0 = -1
        L_0x0633:
            if (r0 == 0) goto L_0x0638
            if (r0 == r3) goto L_0x0638
            goto L_0x063a
        L_0x0638:
            f13307Wwwww = r3     // Catch:{ all -> 0x0640 }
        L_0x063a:
            f13308Wwwwww = r3     // Catch:{ all -> 0x0640 }
        L_0x063c:
            monitor-exit(r7)     // Catch:{ all -> 0x0640 }
            boolean r7 = f13307Wwwww
            return r7
        L_0x0640:
            r0 = move-exception
            monitor-exit(r7)     // Catch:{ all -> 0x0640 }
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: Ccc.C0881Wwwwwwwwwwwwwwwwwwwwwwwwwwwww.O00(java.lang.String):boolean");
    }

    public final void O000() {
        this.f13318Wwwwwwwwwwwwwwww = -1;
        this.f13317Wwwwwwwwwwwwwww = -1;
        this.f13331Wwwwwwwwwwwwwwwwwwwwwwwwwwwww = -1.0f;
        this.f13316Wwwwwwwwwwwwww = -1;
    }

    public final void O0000() {
        MediaCodec Illllllllllllllllllllllllll2;
        this.f13311Wwwwwwww = false;
        if (C4949Wwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwww.f19893Wwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwww >= 23 && this.f13310Wwwwwww && (Illllllllllllllllllllllllll2 = Illllllllllllllllllllllllll()) != null) {
            this.f944Wwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwww = new C0882Wwwwwwwwwwwwwwwwwwwwwwwwwwwwwwww(Illllllllllllllllllllllllll2);
        }
    }

    public int O00000000(C2975Wwwwwwwwwwwwwwwwwwwwwwwwwwwwwwww wwwwwwwwwwwwwwwwwwwwwwwwwwwwwwww, C1931Wwwwwwwwwwwwwwwwwwwwwwwww<C1930Wwwwwwwwwwwwwwwwwwwwwwww> wwwwwwwwwwwwwwwwwwwwwwwww, C2049Wwwwww wwwwww) {
        boolean z;
        int i = 0;
        if (!C0916Wwwwwwwwwwwwwwwwwwww.Wwwwwwwwwwwwwwwwwwwwww(wwwwww.f2591Wwwwwwwwwwwwwwwwwwwwwwwwwwwwww)) {
            return 0;
        }
        C4877Wwwwwwwwwwwwwwwwwwwwwwwwwwwwwwww wwwwwwwwwwwwwwwwwwwwwwwwwwwwwwww2 = wwwwww.f2600Wwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwww;
        if (wwwwwwwwwwwwwwwwwwwwwwwwwwwwwwww2 != null) {
            z = false;
            for (int i2 = 0; i2 < wwwwwwwwwwwwwwwwwwwwwwwwwwwwwwww2.f19761Wwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwww; i2++) {
                z |= wwwwwwwwwwwwwwwwwwwwwwwwwwwwwwww2.Wwwwwwwwwwwwwwwwwwwwwwww(i2).f7150Wwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwww;
            }
        } else {
            z = false;
        }
        List<C2979Wwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwww> Illlllllllllllllllllll2 = Illlllllllllllllllllll(wwwwwwwwwwwwwwwwwwwwwwwwwwwwwwww, wwwwww, z);
        if (Illlllllllllllllllllll2.isEmpty()) {
            if (!z || wwwwwwwwwwwwwwwwwwwwwwwwwwwwwwww.Wwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwww(wwwwww.f2591Wwwwwwwwwwwwwwwwwwwwwwwwwwwwww, false, false).isEmpty()) {
                return 1;
            }
            return 2;
        } else if (!C2085Wwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwww.Kkkkkkkkkkkkkkkkkkk(wwwwwwwwwwwwwwwwwwwwwwwww, wwwwwwwwwwwwwwwwwwwwwwwwwwwwwwww2)) {
            return 2;
        } else {
            C2979Wwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwww wwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwww = Illlllllllllllllllllll2.get(0);
            boolean Wwwwwwwwwwwwwwwwwwwwwwww2 = wwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwww.Wwwwwwwwwwwwwwwwwwwwwwww(wwwwww);
            int i3 = wwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwww.Wwwwwwwwwwwwwwwwwwwwwww(wwwwww) ? 16 : 8;
            if (Wwwwwwwwwwwwwwwwwwwwwwww2) {
                List<C2979Wwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwww> Wwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwww2 = wwwwwwwwwwwwwwwwwwwwwwwwwwwwwwww.Wwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwww(wwwwww.f2591Wwwwwwwwwwwwwwwwwwwwwwwwwwwwww, z, true);
                if (!Wwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwww2.isEmpty()) {
                    C2979Wwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwww wwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwww2 = Wwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwww2.get(0);
                    if (wwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwww2.Wwwwwwwwwwwwwwwwwwwwwwww(wwwwww) && wwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwww2.Wwwwwwwwwwwwwwwwwwwwwww(wwwwww)) {
                        i = 32;
                    }
                }
            }
            return (Wwwwwwwwwwwwwwwwwwwwwwww2 ? 4 : 3) | i3 | i;
        }
    }

    public boolean O0000000000(C2979Wwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwww wwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwww) {
        return this.f947Wwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwww != null || Sss(wwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwww);
    }

    @SuppressLint({"InlinedApi"})
    public MediaFormat OO000(C2049Wwwwww wwwwww, String str, C0883Wwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwww wwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwww, float f, boolean z, int i) {
        Pair<Integer, Integer> Wwwwwwwwwwwwwwwwwwwwwwwwwwww2;
        MediaFormat mediaFormat = new MediaFormat();
        mediaFormat.setString("mime", str);
        mediaFormat.setInteger("width", wwwwww.f14926Wwwwwwwwwwwwwwwwwwwwwwwwwwwwww);
        mediaFormat.setInteger("height", wwwwww.f14925Wwwwwwwwwwwwwwwwwwwwwwwwwwwww);
        C2965Wwwwwwwwwwwwwwwwwwwwwwwwwwwwww.Wwwwwwwwwwwwwwwwwwwwwwwwwwwwww(mediaFormat, wwwwww.f2602Wwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwww);
        C2965Wwwwwwwwwwwwwwwwwwwwwwwwwwwwww.Wwwwwwwwwwwwwwwwwwwwwwwwwwwwwwww(mediaFormat, "frame-rate", wwwwww.f14930Wwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwww);
        C2965Wwwwwwwwwwwwwwwwwwwwwwwwwwwwww.Wwwwwwwwwwwwwwwwwwwwwwwwwwwwwww(mediaFormat, "rotation-degrees", wwwwww.f14924Wwwwwwwwwwwwwwwwwwwwwwwwwwww);
        C2965Wwwwwwwwwwwwwwwwwwwwwwwwwwwwww.Wwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwww(mediaFormat, wwwwww.f2598Wwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwww);
        if ("video/dolby-vision".equals(wwwwww.f2591Wwwwwwwwwwwwwwwwwwwwwwwwwwwwww) && (Wwwwwwwwwwwwwwwwwwwwwwwwwwww2 = C2966Wwwwwwwwwwwwwwwwwwwwwwwwwwwwwww.Wwwwwwwwwwwwwwwwwwwwwwwwwwww(wwwwww.f2593Wwwwwwwwwwwwwwwwwwwwwwwwwwwwwwww)) != null) {
            C2965Wwwwwwwwwwwwwwwwwwwwwwwwwwwwww.Wwwwwwwwwwwwwwwwwwwwwwwwwwwwwww(mediaFormat, "profile", ((Integer) Wwwwwwwwwwwwwwwwwwwwwwwwwwww2.first).intValue());
        }
        mediaFormat.setInteger("max-width", wwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwww.f13338Wwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwww);
        mediaFormat.setInteger("max-height", wwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwww.f13337Wwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwww);
        C2965Wwwwwwwwwwwwwwwwwwwwwwwwwwwwww.Wwwwwwwwwwwwwwwwwwwwwwwwwwwwwww(mediaFormat, "max-input-size", wwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwww.f13336Wwwwwwwwwwwwwwwwwwwwwwwwwwwwwwww);
        if (C4949Wwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwww.f19893Wwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwww >= 23) {
            mediaFormat.setInteger("priority", 0);
            if (f != -1.0f) {
                mediaFormat.setFloat("operating-rate", f);
            }
        }
        if (z) {
            mediaFormat.setInteger("no-post-process", 1);
            mediaFormat.setInteger("auto-frc", 0);
        }
        if (i != 0) {
            m18O0(mediaFormat, i);
        }
        return mediaFormat;
    }

    public C0883Wwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwww OO00000(C2979Wwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwww wwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwww, C2049Wwwwww wwwwww, C2049Wwwwww[] wwwwwwArr) {
        int OO00000002;
        int i = wwwwww.f14926Wwwwwwwwwwwwwwwwwwwwwwwwwwwwww;
        int i2 = wwwwww.f14925Wwwwwwwwwwwwwwwwwwwwwwwwwwwww;
        int OO00002 = OO0000(wwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwww, wwwwww);
        if (wwwwwwArr.length == 1) {
            if (!(OO00002 == -1 || (OO00000002 = OO0000000(wwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwww, wwwwww.f2591Wwwwwwwwwwwwwwwwwwwwwwwwwwwwww, wwwwww.f14926Wwwwwwwwwwwwwwwwwwwwwwwwwwwwww, wwwwww.f14925Wwwwwwwwwwwwwwwwwwwwwwwwwwwww)) == -1)) {
                OO00002 = Math.min((int) (((float) OO00002) * 1.5f), OO00000002);
            }
            return new C0883Wwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwww(i, i2, OO00002);
        }
        boolean z = false;
        for (C2049Wwwwww wwwwww2 : wwwwwwArr) {
            if (wwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwww.Wwwwwwwwwwwwwwwwwwwwww(wwwwww, wwwwww2, false)) {
                int i3 = wwwwww2.f14926Wwwwwwwwwwwwwwwwwwwwwwwwwwwwww;
                z |= i3 == -1 || wwwwww2.f14925Wwwwwwwwwwwwwwwwwwwwwwwwwwwww == -1;
                i = Math.max(i, i3);
                i2 = Math.max(i2, wwwwww2.f14925Wwwwwwwwwwwwwwwwwwwwwwwwwwwww);
                OO00002 = Math.max(OO00002, OO0000(wwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwww, wwwwww2));
            }
        }
        if (z) {
            C0920Wwwwwwwwwwwwwwwwwwwwwww.Wwwwwwwwwwwwwwwwwwwwwwwwwwwww("MediaCodecVideoRenderer", "Resolutions unknown. Codec max resolution: " + i + "x" + i2);
            Point OO0000002 = OO000000(wwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwww, wwwwww);
            if (OO0000002 != null) {
                i = Math.max(i, OO0000002.x);
                i2 = Math.max(i2, OO0000002.y);
                OO00002 = Math.max(OO00002, OO0000000(wwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwww, wwwwww.f2591Wwwwwwwwwwwwwwwwwwwwwwwwwwwwww, i, i2));
                C0920Wwwwwwwwwwwwwwwwwwwwwww.Wwwwwwwwwwwwwwwwwwwwwwwwwwwww("MediaCodecVideoRenderer", "Codec max resolution adjusted to: " + i + "x" + i2);
            }
        }
        return new C0883Wwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwww(i, i2, OO00002);
    }

    public void OO00000000(MediaCodec mediaCodec, int i, long j) {
        C0896Wwww.Wwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwww("dropVideoBuffer");
        mediaCodec.releaseOutputBuffer(i, false);
        C0896Wwww.Wwwwwwwwwwwwwwwwwwwwwwwwwwwwwwww();
        Ooooooooooo(1);
    }

    public void Ooooooooooo(int i) {
        C1945Wwwwwwwwwwwwwwwwwwwwwwwwwwwwwww wwwwwwwwwwwwwwwwwwwwwwwwwwwwwww = this.f3461Wwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwww;
        wwwwwwwwwwwwwwwwwwwwwwwwwwwwwww.f14714Wwwwwwwwwwwwwwwwwwwwwwwwwwww += i;
        this.f13325Wwwwwwwwwwwwwwwwwwwwwww += i;
        int i2 = this.f13324Wwwwwwwwwwwwwwwwwwwwww + i;
        this.f13324Wwwwwwwwwwwwwwwwwwwwww = i2;
        wwwwwwwwwwwwwwwwwwwwwwwwwwwwwww.f14713Wwwwwwwwwwwwwwwwwwwwwwwwwww = Math.max(i2, wwwwwwwwwwwwwwwwwwwwwwwwwwwwwww.f14713Wwwwwwwwwwwwwwwwwwwwwwwwwww);
        int i3 = this.f13327Wwwwwwwwwwwwwwwwwwwwwwwww;
        if (i3 > 0 && this.f13325Wwwwwwwwwwwwwwwwwwwwwww >= i3) {
            QQOOOOOOOO();
        }
    }

    public final void QQO(MediaCodec mediaCodec, int i, int i2) {
        this.f13321Wwwwwwwwwwwwwwwwwww = i;
        this.f13320Wwwwwwwwwwwwwwwwww = i2;
        float f = this.f13333Wwwwwwwwwwwwwwwwwwwwwwwwwwwwwww;
        this.f13332Wwwwwwwwwwwwwwwwwwwwwwwwwwwwww = f;
        if (C4949Wwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwww.f19893Wwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwww >= 21) {
            int i3 = this.f13322Wwwwwwwwwwwwwwwwwwww;
            if (i3 == 90 || i3 == 270) {
                this.f13321Wwwwwwwwwwwwwwwwwww = i2;
                this.f13320Wwwwwwwwwwwwwwwwww = i;
                this.f13332Wwwwwwwwwwwwwwwwwwwwwwwwwwwwww = 1.0f / f;
            }
        } else {
            this.f13319Wwwwwwwwwwwwwwwww = this.f13322Wwwwwwwwwwwwwwwwwwww;
        }
        mediaCodec.setVideoScalingMode(this.f13326Wwwwwwwwwwwwwwwwwwwwwwww);
    }

    public void QQOO(long j) {
        C2049Wwwwww O000002 = O00000(j);
        if (O000002 != null) {
            QQO(Illllllllllllllllllllllllll(), O000002.f14926Wwwwwwwwwwwwwwwwwwwwwwwwwwwwww, O000002.f14925Wwwwwwwwwwwwwwwwwwwwwwwwwwwww);
        }
        QQOOOOOO();
        QQOOOOOOO();
        Illllllll(j);
    }

    public final void QQOOO(long j, long j2, C2049Wwwwww wwwwww) {
        C0880Wwwwwwwwwwwwwwwwwwwwwwwwwwww wwwwwwwwwwwwwwwwwwwwwwwwwwww = this.f943Wwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwww;
        if (wwwwwwwwwwwwwwwwwwwwwwwwwwww != null) {
            wwwwwwwwwwwwwwwwwwwwwwwwwwww.Wwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwww(j, j2, wwwwww);
        }
    }

    public final void QQOOOO() {
        int i = this.f13318Wwwwwwwwwwwwwwww;
        if (i != -1 || this.f13317Wwwwwwwwwwwwwww != -1) {
            this.f941Wwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwww.Wwwwwwwwwwwwww(i, this.f13317Wwwwwwwwwwwwwww, this.f13316Wwwwwwwwwwwwww, this.f13331Wwwwwwwwwwwwwwwwwwwwwwwwwwwww);
        }
    }

    public final void QQOOOOO() {
        if (this.f13311Wwwwwwww) {
            this.f941Wwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwww.Wwwwwwwwwwwwwww(this.f947Wwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwww);
        }
    }

    public final void QQOOOOOO() {
        int i = this.f13321Wwwwwwwwwwwwwwwwwww;
        if (i != -1 || this.f13320Wwwwwwwwwwwwwwwwww != -1) {
            if (this.f13318Wwwwwwwwwwwwwwww != i || this.f13317Wwwwwwwwwwwwwww != this.f13320Wwwwwwwwwwwwwwwwww || this.f13316Wwwwwwwwwwwwww != this.f13319Wwwwwwwwwwwwwwwww || this.f13331Wwwwwwwwwwwwwwwwwwwwwwwwwwwww != this.f13332Wwwwwwwwwwwwwwwwwwwwwwwwwwwwww) {
                this.f941Wwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwww.Wwwwwwwwwwwwww(i, this.f13320Wwwwwwwwwwwwwwwwww, this.f13319Wwwwwwwwwwwwwwwww, this.f13332Wwwwwwwwwwwwwwwwwwwwwwwwwwwwww);
                this.f13318Wwwwwwwwwwwwwwww = this.f13321Wwwwwwwwwwwwwwwwwww;
                this.f13317Wwwwwwwwwwwwwww = this.f13320Wwwwwwwwwwwwwwwwww;
                this.f13316Wwwwwwwwwwwwww = this.f13319Wwwwwwwwwwwwwwwww;
                this.f13331Wwwwwwwwwwwwwwwwwwwwwwwwwwwww = this.f13332Wwwwwwwwwwwwwwwwwwwwwwwwwwwwww;
            }
        }
    }

    public void QQOOOOOOO() {
        if (!this.f13311Wwwwwwww) {
            this.f13311Wwwwwwww = true;
            this.f941Wwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwww.Wwwwwwwwwwwwwww(this.f947Wwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwww);
        }
    }

    public final void QQOOOOOOOO() {
        if (this.f13325Wwwwwwwwwwwwwwwwwwwwwww > 0) {
            long elapsedRealtime = SystemClock.elapsedRealtime();
            this.f941Wwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwww.Wwwwwwwwwwwwwwwwwwwwwwwww(this.f13325Wwwwwwwwwwwwwwwwwwwwwww, elapsedRealtime - this.f939Wwwwwwwwwwwwwwwwwwwwwwwww);
            this.f13325Wwwwwwwwwwwwwwwwwwwwwww = 0;
            this.f939Wwwwwwwwwwwwwwwwwwwwwwwww = elapsedRealtime;
        }
    }

    public boolean QQOOOOOOOOO(MediaCodec mediaCodec, int i, long j, long j2) {
        int Kkkkkkkkkkkkkkkkkkkk2 = Kkkkkkkkkkkkkkkkkkkk(j2);
        if (Kkkkkkkkkkkkkkkkkkkk2 == 0) {
            return false;
        }
        this.f3461Wwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwww.f14712Wwwwwwwwwwwwwwwwwwwwwwwwww++;
        Ooooooooooo(this.f13323Wwwwwwwwwwwwwwwwwwwww + Kkkkkkkkkkkkkkkkkkkk2);
        mo7929Kk();
        return true;
    }

    /* renamed from: Ss */
    public void mo2166Ss(MediaCodec mediaCodec, int i, long j) {
        C0896Wwww.Wwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwww("skipVideoBuffer");
        mediaCodec.releaseOutputBuffer(i, false);
        C0896Wwww.Wwwwwwwwwwwwwwwwwwwwwwwwwwwwwwww();
        this.f3461Wwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwww.f14715Wwwwwwwwwwwwwwwwwwwwwwwwwwwww++;
    }

    public final boolean Sss(C2979Wwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwww wwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwww) {
        return C4949Wwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwww.f19893Wwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwww >= 23 && !this.f13310Wwwwwww && !O00(wwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwww.f3478Wwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwww) && (!wwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwww.f3477Wwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwww || C0886Wwwwwwwwwwwwwwwwwwwwwwwwwwwwwww.Wwwwwwwwwwwwwwwwwwwwwwwwwwwwww(this.f946Wwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwww));
    }

    public boolean Ssss(long j, long j2) {
        return OO00(j) && j2 > 100000;
    }

    public boolean Sssss(long j, long j2, boolean z) {
        return OO00(j) && !z;
    }

    public boolean Ssssss(long j, long j2, boolean z) {
        return OO0(j) && !z;
    }

    public final void Sssssss(Surface surface) {
        if (surface == null) {
            Surface surface2 = this.f13334Wwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwww;
            if (surface2 != null) {
                surface = surface2;
            } else {
                C2979Wwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwww Illllllllllllllllllllllll2 = Illllllllllllllllllllllll();
                if (Illllllllllllllllllllllll2 != null && Sss(Illllllllllllllllllllllll2)) {
                    surface = C0886Wwwwwwwwwwwwwwwwwwwwwwwwwwwwwww.Wwwwwwwwwwwwwwwwwwwwwwwwwww(this.f946Wwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwww, Illllllllllllllllllllllll2.f3477Wwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwww);
                    this.f13334Wwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwww = surface;
                }
            }
        }
        if (this.f947Wwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwww != surface) {
            this.f947Wwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwww = surface;
            int Wwwwwwwwwwwwwwwwwwwwwwwwwww2 = Wwwwwwwwwwwwwwwwwwwwwwwwwww();
            MediaCodec Illllllllllllllllllllllllll2 = Illllllllllllllllllllllllll();
            if (Illllllllllllllllllllllllll2 != null) {
                if (C4949Wwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwww.f19893Wwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwww < 23 || surface == null || this.f13312Wwwwwwwww) {
                    IIlllllllll();
                    Illlllllllllll();
                } else {
                    Ssssssss(Illllllllllllllllllllllllll2, surface);
                }
            }
            if (surface == null || surface == this.f13334Wwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwww) {
                O000();
                O0000();
                return;
            }
            QQOOOO();
            O0000();
            if (Wwwwwwwwwwwwwwwwwwwwwwwwwww2 == 2) {
                Sssssssss();
            }
        } else if (surface != null && surface != this.f13334Wwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwww) {
            QQOOOO();
            QQOOOOO();
        }
    }

    public final void Sssssssss() {
        this.f13328Wwwwwwwwwwwwwwwwwwwwwwwwww = this.f13330Wwwwwwwwwwwwwwwwwwwwwwwwwwww > 0 ? SystemClock.elapsedRealtime() + this.f13330Wwwwwwwwwwwwwwwwwwwwwwwwwwww : -9223372036854775807L;
    }

    @TargetApi(21)
    public void Ssssssssss(MediaCodec mediaCodec, int i, long j, long j2) {
        QQOOOOOO();
        C0896Wwww.Wwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwww("releaseOutputBuffer");
        mediaCodec.releaseOutputBuffer(i, j2);
        C0896Wwww.Wwwwwwwwwwwwwwwwwwwwwwwwwwwwwwww();
        this.f938Wwwwwwwwwwwwwwwwwwwwwwww = SystemClock.elapsedRealtime() * 1000;
        this.f3461Wwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwww.f14716Wwwwwwwwwwwwwwwwwwwwwwwwwwwwww++;
        this.f13324Wwwwwwwwwwwwwwwwwwwwww = 0;
        QQOOOOOOO();
    }

    public void Sssssssssss(MediaCodec mediaCodec, int i, long j) {
        QQOOOOOO();
        C0896Wwww.Wwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwww("releaseOutputBuffer");
        mediaCodec.releaseOutputBuffer(i, true);
        C0896Wwww.Wwwwwwwwwwwwwwwwwwwwwwwwwwwwwwww();
        this.f938Wwwwwwwwwwwwwwwwwwwwwwww = SystemClock.elapsedRealtime() * 1000;
        this.f3461Wwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwww.f14716Wwwwwwwwwwwwwwwwwwwwwwwwwwwwww++;
        this.f13324Wwwwwwwwwwwwwwwwwwwwww = 0;
        QQOOOOOOO();
    }

    public void Www(boolean z) {
        super.Www(z);
        int i = this.f13315Wwwwwwwwwwwww;
        int i2 = Wwwwwwww().f2545Wwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwww;
        this.f13315Wwwwwwwwwwwww = i2;
        this.f13310Wwwwwww = i2 != 0;
        if (i2 != i) {
            IIlllllllll();
        }
        this.f941Wwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwww.Wwwwwwwwwwwwwwwwwwwwwwww(this.f3461Wwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwww);
        this.f942Wwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwww.Wwwwwwwwwwwwwwwwwwwwwwwwwwwwww();
    }

    public void Wwww() {
        this.f937Wwwwwwwwwwwwwwwwwwwwwww = -9223372036854775807L;
        this.f936Wwwwwwwwwwwwwwwwwwwwww = -9223372036854775807L;
        this.f13314Wwwwwwwwwwww = 0;
        O000();
        O0000();
        this.f942Wwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwww.Wwwwwwwwwwwwwwwwwwwwwwwwwwwwwww();
        this.f944Wwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwww = null;
        try {
            super.Wwww();
        } finally {
            this.f941Wwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwww.Wwwwwwwwwwwwwwwwwwwwwwwwww(this.f3461Wwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwww);
        }
    }

    public void Wwwwwwwwww(int i, Object obj) {
        if (i == 1) {
            Sssssss((Surface) obj);
        } else if (i == 4) {
            this.f13326Wwwwwwwwwwwwwwwwwwwwwwww = ((Integer) obj).intValue();
            MediaCodec Illllllllllllllllllllllllll2 = Illllllllllllllllllllllllll();
            if (Illllllllllllllllllllllllll2 != null) {
                Illllllllllllllllllllllllll2.setVideoScalingMode(this.f13326Wwwwwwwwwwwwwwwwwwwwwwww);
            }
        } else if (i == 6) {
            this.f943Wwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwww = (C0880Wwwwwwwwwwwwwwwwwwwwwwwwwwww) obj;
        } else {
            super.Wwwwwwwwww(i, obj);
        }
    }

    public boolean Wwwwwwwwwwwwwwwwwwwwwwwwwwwwww() {
        Surface surface;
        if (super.Wwwwwwwwwwwwwwwwwwwwwwwwwwwwww() && (this.f13311Wwwwwwww || (((surface = this.f13334Wwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwww) != null && this.f947Wwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwww == surface) || Illllllllllllllllllllllllll() == null || this.f13310Wwwwwww))) {
            this.f13328Wwwwwwwwwwwwwwwwwwwwwwwwww = -9223372036854775807L;
            return true;
        } else if (this.f13328Wwwwwwwwwwwwwwwwwwwwwwwwww == -9223372036854775807L) {
            return false;
        } else {
            if (SystemClock.elapsedRealtime() < this.f13328Wwwwwwwwwwwwwwwwwwwwwwwwww) {
                return true;
            }
            this.f13328Wwwwwwwwwwwwwwwwwwwwwwwwww = -9223372036854775807L;
            return false;
        }
    }
}
