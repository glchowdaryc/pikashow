package Ccc;

import android.annotation.TargetApi;
import android.content.Context;
import android.hardware.display.DisplayManager;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.Message;
import android.view.Choreographer;
import android.view.Display;
import android.view.WindowManager;
import com.google.android.exoplayer2.util.C4949Wwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwww;

/* renamed from: Ccc.Wwwwwwwwwwwwwwwwwwwwwwwwwww */
public final class C0877Wwwwwwwwwwwwwwwwwwwwwwwwwww {

    /* renamed from: Wwwwwwwwwwwwwwwwwwwwwwwwwww  reason: collision with root package name */
    public long f13297Wwwwwwwwwwwwwwwwwwwwwwwwwww;

    /* renamed from: Wwwwwwwwwwwwwwwwwwwwwwwwwwww  reason: collision with root package name */
    public long f13298Wwwwwwwwwwwwwwwwwwwwwwwwwwww;

    /* renamed from: Wwwwwwwwwwwwwwwwwwwwwwwwwwwww  reason: collision with root package name */
    public long f13299Wwwwwwwwwwwwwwwwwwwwwwwwwwwww;

    /* renamed from: Wwwwwwwwwwwwwwwwwwwwwwwwwwwwww  reason: collision with root package name */
    public long f13300Wwwwwwwwwwwwwwwwwwwwwwwwwwwwww;

    /* renamed from: Wwwwwwwwwwwwwwwwwwwwwwwwwwwwwww  reason: collision with root package name */
    public long f13301Wwwwwwwwwwwwwwwwwwwwwwwwwwwwwww;

    /* renamed from: Wwwwwwwwwwwwwwwwwwwwwwwwwwwwwwww  reason: collision with root package name */
    public long f13302Wwwwwwwwwwwwwwwwwwwwwwwwwwwwwwww;

    /* renamed from: Wwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwww  reason: collision with root package name */
    public long f13303Wwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwww;

    /* renamed from: Wwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwww  reason: collision with root package name */
    public long f13304Wwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwww;

    /* renamed from: Wwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwww  reason: collision with other field name */
    public final C0878Wwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwww f926Wwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwww;

    /* renamed from: Wwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwww  reason: collision with other field name */
    public final C0879Wwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwww f927Wwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwww;

    /* renamed from: Wwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwww  reason: collision with other field name */
    public final WindowManager f928Wwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwww;

    /* renamed from: Wwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwww  reason: collision with other field name */
    public boolean f929Wwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwww;

    /* renamed from: Ccc.Wwwwwwwwwwwwwwwwwwwwwwwwwww$Wwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwww */
    public static final class C0878Wwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwww implements Choreographer.FrameCallback, Handler.Callback {

        /* renamed from: Wwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwww  reason: collision with root package name */
        public static final C0878Wwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwww f13305Wwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwww = new C0878Wwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwww();

        /* renamed from: Wwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwww  reason: collision with other field name */
        public int f930Wwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwww;

        /* renamed from: Wwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwww  reason: collision with other field name */
        public volatile long f931Wwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwww = -9223372036854775807L;

        /* renamed from: Wwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwww  reason: collision with other field name */
        public final Handler f932Wwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwww;

        /* renamed from: Wwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwww  reason: collision with other field name */
        public final HandlerThread f933Wwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwww;

        /* renamed from: Wwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwww  reason: collision with other field name */
        public Choreographer f934Wwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwww;

        public C0878Wwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwww() {
            HandlerThread handlerThread = new HandlerThread("ChoreographerOwner:Handler");
            this.f933Wwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwww = handlerThread;
            handlerThread.start();
            Handler Wwwwwwwwwwwwwww2 = C4949Wwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwww.Wwwwwwwwwwwwwww(handlerThread.getLooper(), this);
            this.f932Wwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwww = Wwwwwwwwwwwwwww2;
            Wwwwwwwwwwwwwww2.sendEmptyMessage(0);
        }

        public static C0878Wwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwww Wwwwwwwwwwwwwwwwwwwwwwwwwwwwwww() {
            return f13305Wwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwww;
        }

        public final void Wwwwwwwwwwwwwwwwwwwwwwwwwwwww() {
            int i = this.f930Wwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwww - 1;
            this.f930Wwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwww = i;
            if (i == 0) {
                this.f934Wwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwww.removeFrameCallback(this);
                this.f931Wwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwww = -9223372036854775807L;
            }
        }

        public void Wwwwwwwwwwwwwwwwwwwwwwwwwwwwww() {
            this.f932Wwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwww.sendEmptyMessage(2);
        }

        public final void Wwwwwwwwwwwwwwwwwwwwwwwwwwwwwwww() {
            this.f934Wwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwww = Choreographer.getInstance();
        }

        public final void Wwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwww() {
            int i = this.f930Wwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwww + 1;
            this.f930Wwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwww = i;
            if (i == 1) {
                this.f934Wwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwww.postFrameCallback(this);
            }
        }

        public void Wwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwww() {
            this.f932Wwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwww.sendEmptyMessage(1);
        }

        public void doFrame(long j) {
            this.f931Wwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwww = j;
            this.f934Wwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwww.postFrameCallbackDelayed(this, 500);
        }

        public boolean handleMessage(Message message) {
            int i = message.what;
            if (i == 0) {
                Wwwwwwwwwwwwwwwwwwwwwwwwwwwwwwww();
                return true;
            } else if (i == 1) {
                Wwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwww();
                return true;
            } else if (i != 2) {
                return false;
            } else {
                Wwwwwwwwwwwwwwwwwwwwwwwwwwwww();
                return true;
            }
        }
    }

    @TargetApi(17)
    /* renamed from: Ccc.Wwwwwwwwwwwwwwwwwwwwwwwwwww$Wwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwww */
    public final class C0879Wwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwww implements DisplayManager.DisplayListener {

        /* renamed from: Wwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwww  reason: collision with other field name */
        public final DisplayManager f935Wwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwww;

        public C0879Wwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwww(DisplayManager displayManager) {
            this.f935Wwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwww = displayManager;
        }

        public void Wwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwww() {
            this.f935Wwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwww.unregisterDisplayListener(this);
        }

        public void Wwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwww() {
            this.f935Wwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwww.registerDisplayListener(this, (Handler) null);
        }

        public void onDisplayAdded(int i) {
        }

        public void onDisplayChanged(int i) {
            if (i == 0) {
                C0877Wwwwwwwwwwwwwwwwwwwwwwwwwww.this.Wwwwwwwwwwwwwwwwwwwwwwwwwww();
            }
        }

        public void onDisplayRemoved(int i) {
        }
    }

    public C0877Wwwwwwwwwwwwwwwwwwwwwwwwwww(Context context) {
        C0879Wwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwww wwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwww = null;
        if (context != null) {
            context = context.getApplicationContext();
            this.f928Wwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwww = (WindowManager) context.getSystemService("window");
        } else {
            this.f928Wwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwww = null;
        }
        if (this.f928Wwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwww != null) {
            this.f927Wwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwww = C4949Wwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwww.f19893Wwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwww >= 17 ? Wwwwwwwwwwwwwwwwwwwwwwwwwwww(context) : wwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwww;
            this.f926Wwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwww = C0878Wwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwww.Wwwwwwwwwwwwwwwwwwwwwwwwwwwwwww();
        } else {
            this.f927Wwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwww = null;
            this.f926Wwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwww = null;
        }
        this.f13304Wwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwww = -9223372036854775807L;
        this.f13303Wwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwww = -9223372036854775807L;
    }

    public static long Wwwwwwwwwwwwwwwwwwwwwwwwwwwwwwww(long j, long j2, long j3) {
        long j4;
        long j5 = j2 + (((j - j2) / j3) * j3);
        if (j <= j5) {
            j4 = j5 - j3;
        } else {
            long j6 = j5;
            j5 = j3 + j5;
            j4 = j6;
        }
        return j5 - j < j - j4 ? j5 : j4;
    }

    public final void Wwwwwwwwwwwwwwwwwwwwwwwwwww() {
        Display defaultDisplay = this.f928Wwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwww.getDefaultDisplay();
        if (defaultDisplay != null) {
            long refreshRate = (long) (1.0E9d / ((double) defaultDisplay.getRefreshRate()));
            this.f13304Wwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwww = refreshRate;
            this.f13303Wwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwww = (refreshRate * 80) / 100;
        }
    }

    @TargetApi(17)
    public final C0879Wwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwww Wwwwwwwwwwwwwwwwwwwwwwwwwwww(Context context) {
        DisplayManager displayManager = (DisplayManager) context.getSystemService("display");
        if (displayManager == null) {
            return null;
        }
        return new C0879Wwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwww(displayManager);
    }

    public final boolean Wwwwwwwwwwwwwwwwwwwwwwwwwwwww(long j, long j2) {
        return Math.abs((j2 - this.f13299Wwwwwwwwwwwwwwwwwwwwwwwwwwwww) - (j - this.f13298Wwwwwwwwwwwwwwwwwwwwwwwwwwww)) > 20000000;
    }

    public void Wwwwwwwwwwwwwwwwwwwwwwwwwwwwww() {
        this.f929Wwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwww = false;
        if (this.f928Wwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwww != null) {
            this.f926Wwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwww.Wwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwww();
            C0879Wwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwww wwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwww = this.f927Wwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwww;
            if (wwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwww != null) {
                wwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwww.Wwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwww();
            }
            Wwwwwwwwwwwwwwwwwwwwwwwwwww();
        }
    }

    public void Wwwwwwwwwwwwwwwwwwwwwwwwwwwwwww() {
        if (this.f928Wwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwww != null) {
            C0879Wwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwww wwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwww = this.f927Wwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwww;
            if (wwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwww != null) {
                wwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwww.Wwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwww();
            }
            this.f926Wwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwww.Wwwwwwwwwwwwwwwwwwwwwwwwwwwwww();
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:17:0x0048  */
    /* JADX WARNING: Removed duplicated region for block: B:22:0x0067  */
    /* JADX WARNING: Removed duplicated region for block: B:27:0x0078 A[RETURN] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public long Wwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwww(long r11, long r13) {
        /*
            r10 = this;
            r0 = 1000(0x3e8, double:4.94E-321)
            long r0 = r0 * r11
            boolean r2 = r10.f929Wwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwww
            if (r2 == 0) goto L_0x0042
            long r2 = r10.f13302Wwwwwwwwwwwwwwwwwwwwwwwwwwwwwwww
            int r4 = (r11 > r2 ? 1 : (r11 == r2 ? 0 : -1))
            if (r4 == 0) goto L_0x0019
            long r2 = r10.f13297Wwwwwwwwwwwwwwwwwwwwwwwwwww
            r4 = 1
            long r2 = r2 + r4
            r10.f13297Wwwwwwwwwwwwwwwwwwwwwwwwwww = r2
            long r2 = r10.f13300Wwwwwwwwwwwwwwwwwwwwwwwwwwwwww
            r10.f13301Wwwwwwwwwwwwwwwwwwwwwwwwwwwwwww = r2
        L_0x0019:
            long r2 = r10.f13297Wwwwwwwwwwwwwwwwwwwwwwwwwww
            r4 = 6
            r6 = 0
            int r7 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            if (r7 < 0) goto L_0x003a
            long r4 = r10.f13298Wwwwwwwwwwwwwwwwwwwwwwwwwwww
            long r4 = r0 - r4
            long r4 = r4 / r2
            long r2 = r10.f13301Wwwwwwwwwwwwwwwwwwwwwwwwwwwwwww
            long r2 = r2 + r4
            boolean r4 = r10.Wwwwwwwwwwwwwwwwwwwwwwwwwwwww(r2, r13)
            if (r4 == 0) goto L_0x0033
            r10.f929Wwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwww = r6
            goto L_0x0042
        L_0x0033:
            long r4 = r10.f13299Wwwwwwwwwwwwwwwwwwwwwwwwwwwww
            long r4 = r4 + r2
            long r6 = r10.f13298Wwwwwwwwwwwwwwwwwwwwwwwwwwww
            long r4 = r4 - r6
            goto L_0x0044
        L_0x003a:
            boolean r2 = r10.Wwwwwwwwwwwwwwwwwwwwwwwwwwwww(r0, r13)
            if (r2 == 0) goto L_0x0042
            r10.f929Wwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwww = r6
        L_0x0042:
            r4 = r13
            r2 = r0
        L_0x0044:
            boolean r6 = r10.f929Wwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwww
            if (r6 != 0) goto L_0x0053
            r10.f13298Wwwwwwwwwwwwwwwwwwwwwwwwwwww = r0
            r10.f13299Wwwwwwwwwwwwwwwwwwwwwwwwwwwww = r13
            r13 = 0
            r10.f13297Wwwwwwwwwwwwwwwwwwwwwwwwwww = r13
            r13 = 1
            r10.f929Wwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwww = r13
        L_0x0053:
            r10.f13302Wwwwwwwwwwwwwwwwwwwwwwwwwwwwwwww = r11
            r10.f13300Wwwwwwwwwwwwwwwwwwwwwwwwwwwwww = r2
            Ccc.Wwwwwwwwwwwwwwwwwwwwwwwwwww$Wwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwww r11 = r10.f926Wwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwww
            if (r11 == 0) goto L_0x0078
            long r12 = r10.f13304Wwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwww
            r0 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            int r14 = (r12 > r0 ? 1 : (r12 == r0 ? 0 : -1))
            if (r14 != 0) goto L_0x0067
            goto L_0x0078
        L_0x0067:
            long r6 = r11.f931Wwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwww
            int r11 = (r6 > r0 ? 1 : (r6 == r0 ? 0 : -1))
            if (r11 != 0) goto L_0x006e
            return r4
        L_0x006e:
            long r8 = r10.f13304Wwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwww
            long r11 = Wwwwwwwwwwwwwwwwwwwwwwwwwwwwwwww(r4, r6, r8)
            long r13 = r10.f13303Wwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwww
            long r11 = r11 - r13
            return r11
        L_0x0078:
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: Ccc.C0877Wwwwwwwwwwwwwwwwwwwwwwwwwww.Wwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwww(long, long):long");
    }
}
