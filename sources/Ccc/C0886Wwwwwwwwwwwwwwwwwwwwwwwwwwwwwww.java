package Ccc;

import Cccc.C0920Wwwwwwwwwwwwwwwwwwwwwww;
import Cccc.C0929Wwwwwwwwwwwwwwwwwwwwwwwwwwwwww;
import android.annotation.TargetApi;
import android.content.Context;
import android.graphics.SurfaceTexture;
import android.opengl.EGL14;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.Message;
import android.view.Surface;
import com.google.android.exoplayer2.util.C4949Wwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwww;
import com.google.android.exoplayer2.util.C4950Wwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwww;

@TargetApi(17)
/* renamed from: Ccc.Wwwwwwwwwwwwwwwwwwwwwwwwwwwwwww */
public final class C0886Wwwwwwwwwwwwwwwwwwwwwwwwwwwwwww extends Surface {

    /* renamed from: Wwwwwwwwwwwwwwwwwwwwwwwwwwwwwwww  reason: collision with root package name */
    public static boolean f13340Wwwwwwwwwwwwwwwwwwwwwwwwwwwwwwww;

    /* renamed from: Wwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwww  reason: collision with root package name */
    public static int f13341Wwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwww;

    /* renamed from: Wwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwww  reason: collision with root package name */
    public boolean f13342Wwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwww;

    /* renamed from: Wwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwww  reason: collision with other field name */
    public final C0887Wwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwww f950Wwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwww;

    /* renamed from: Ccc.Wwwwwwwwwwwwwwwwwwwwwwwwwwwwwww$Wwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwww */
    public static class C0887Wwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwww extends HandlerThread implements Handler.Callback {

        /* renamed from: Wwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwww  reason: collision with root package name */
        public C0886Wwwwwwwwwwwwwwwwwwwwwwwwwwwwwww f13343Wwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwww;

        /* renamed from: Wwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwww  reason: collision with other field name */
        public C0929Wwwwwwwwwwwwwwwwwwwwwwwwwwwwww f951Wwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwww;

        /* renamed from: Wwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwww  reason: collision with other field name */
        public Handler f952Wwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwww;

        /* renamed from: Wwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwww  reason: collision with other field name */
        public Error f953Wwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwww;

        /* renamed from: Wwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwww  reason: collision with other field name */
        public RuntimeException f954Wwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwww;

        public C0887Wwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwww() {
            super("dummySurface");
        }

        public final void Wwwwwwwwwwwwwwwwwwwwwwwwwwwwwww() {
            C4950Wwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwww.Wwwwwwwwwwwwwwwwwwwwwwwwwwwwww(this.f951Wwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwww);
            this.f951Wwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwww.Wwwwwwwwwwwwwwwwwwwwwwwww();
        }

        public void Wwwwwwwwwwwwwwwwwwwwwwwwwwwwwwww() {
            C4950Wwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwww.Wwwwwwwwwwwwwwwwwwwwwwwwwwwwww(this.f952Wwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwww);
            this.f952Wwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwww.sendEmptyMessage(2);
        }

        public final void Wwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwww(int i) {
            C4950Wwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwww.Wwwwwwwwwwwwwwwwwwwwwwwwwwwwww(this.f951Wwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwww);
            this.f951Wwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwww.Wwwwwwwwwwwwwwwwwwwwwwwwww(i);
            this.f13343Wwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwww = new C0886Wwwwwwwwwwwwwwwwwwwwwwwwwwwwwww(this, this.f951Wwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwww.Wwwwwwwwwwwwwwwwwwwwwwwwwwww(), i != 0);
        }

        public C0886Wwwwwwwwwwwwwwwwwwwwwwwwwwwwwww Wwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwww(int i) {
            boolean z;
            start();
            this.f952Wwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwww = new Handler(getLooper(), this);
            this.f951Wwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwww = new C0929Wwwwwwwwwwwwwwwwwwwwwwwwwwwwww(this.f952Wwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwww);
            synchronized (this) {
                z = false;
                this.f952Wwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwww.obtainMessage(1, i, 0).sendToTarget();
                while (this.f13343Wwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwww == null && this.f954Wwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwww == null && this.f953Wwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwww == null) {
                    try {
                        wait();
                    } catch (InterruptedException unused) {
                        z = true;
                    }
                }
            }
            if (z) {
                Thread.currentThread().interrupt();
            }
            RuntimeException runtimeException = this.f954Wwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwww;
            if (runtimeException == null) {
                Error error = this.f953Wwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwww;
                if (error == null) {
                    return (C0886Wwwwwwwwwwwwwwwwwwwwwwwwwwwwwww) C4950Wwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwww.Wwwwwwwwwwwwwwwwwwwwwwwwwwwwww(this.f13343Wwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwww);
                }
                throw error;
            }
            throw runtimeException;
        }

        public boolean handleMessage(Message message) {
            int i = message.what;
            if (i == 1) {
                try {
                    Wwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwww(message.arg1);
                    synchronized (this) {
                        notify();
                    }
                } catch (RuntimeException e) {
                    C0920Wwwwwwwwwwwwwwwwwwwwwww.Wwwwwwwwwwwwwwwwwwwwwwwwwwwwwww("DummySurface", "Failed to initialize dummy surface", e);
                    this.f954Wwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwww = e;
                    synchronized (this) {
                        notify();
                    }
                } catch (Error e2) {
                    try {
                        C0920Wwwwwwwwwwwwwwwwwwwwwww.Wwwwwwwwwwwwwwwwwwwwwwwwwwwwwww("DummySurface", "Failed to initialize dummy surface", e2);
                        this.f953Wwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwww = e2;
                        synchronized (this) {
                            notify();
                        }
                    } catch (Throwable th) {
                        synchronized (this) {
                            notify();
                            throw th;
                        }
                    }
                }
                return true;
            } else if (i != 2) {
                return true;
            } else {
                try {
                    Wwwwwwwwwwwwwwwwwwwwwwwwwwwwwww();
                } catch (Throwable th2) {
                    quit();
                    throw th2;
                }
                quit();
                return true;
            }
        }
    }

    public static C0886Wwwwwwwwwwwwwwwwwwwwwwwwwwwwwww Wwwwwwwwwwwwwwwwwwwwwwwwwww(Context context, boolean z) {
        Wwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwww();
        int i = 0;
        C4950Wwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwww.Wwwwwwwwwwwwwwwwwwwwwwwwwwww(!z || Wwwwwwwwwwwwwwwwwwwwwwwwwwwwww(context));
        C0887Wwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwww wwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwww = new C0887Wwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwww();
        if (z) {
            i = f13341Wwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwww;
        }
        return wwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwww.Wwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwww(i);
    }

    public static synchronized boolean Wwwwwwwwwwwwwwwwwwwwwwwwwwwwww(Context context) {
        boolean z;
        synchronized (C0886Wwwwwwwwwwwwwwwwwwwwwwwwwwwwwww.class) {
            z = true;
            if (!f13340Wwwwwwwwwwwwwwwwwwwwwwwwwwwwwwww) {
                f13341Wwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwww = C4949Wwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwww.f19893Wwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwww < 24 ? 0 : Wwwwwwwwwwwwwwwwwwwwwwwwwwwwwwww(context);
                f13340Wwwwwwwwwwwwwwwwwwwwwwwwwwwwwwww = true;
            }
            if (f13341Wwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwww == 0) {
                z = false;
            }
        }
        return z;
    }

    @TargetApi(24)
    public static int Wwwwwwwwwwwwwwwwwwwwwwwwwwwwwwww(Context context) {
        String eglQueryString;
        int i = C4949Wwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwww.f19893Wwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwww;
        if (i < 26 && ("samsung".equals(C4949Wwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwww.f19892Wwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwww) || "XT1650".equals(C4949Wwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwww.f19891Wwwwwwwwwwwwwwwwwwwwwwwwwwwwwwww))) {
            return 0;
        }
        if ((i >= 26 || context.getPackageManager().hasSystemFeature("android.hardware.vr.high_performance")) && (eglQueryString = EGL14.eglQueryString(EGL14.eglGetDisplay(0), 12373)) != null && eglQueryString.contains("EGL_EXT_protected_content")) {
            return eglQueryString.contains("EGL_KHR_surfaceless_context") ? 1 : 2;
        }
        return 0;
    }

    public static void Wwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwww() {
        if (C4949Wwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwww.f19893Wwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwww < 17) {
            throw new UnsupportedOperationException("Unsupported prior to API level 17");
        }
    }

    public void release() {
        super.release();
        synchronized (this.f950Wwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwww) {
            if (!this.f13342Wwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwww) {
                this.f950Wwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwww.Wwwwwwwwwwwwwwwwwwwwwwwwwwwwwwww();
                this.f13342Wwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwww = true;
            }
        }
    }

    public C0886Wwwwwwwwwwwwwwwwwwwwwwwwwwwwwww(C0887Wwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwww wwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwww, SurfaceTexture surfaceTexture, boolean z) {
        super(surfaceTexture);
        this.f950Wwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwww = wwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwww;
    }
}
