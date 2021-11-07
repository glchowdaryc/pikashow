package Cccc;

import android.annotation.TargetApi;
import android.graphics.SurfaceTexture;
import android.opengl.EGL14;
import android.opengl.EGLConfig;
import android.opengl.EGLContext;
import android.opengl.EGLDisplay;
import android.opengl.EGLSurface;
import android.opengl.GLES20;
import android.os.Handler;
import com.google.android.exoplayer2.util.C4949Wwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwww;
import com.google.android.exoplayer2.util.C4950Wwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwww;

@TargetApi(17)
/* renamed from: Cccc.Wwwwwwwwwwwwwwwwwwwwwwwwwwwwww */
public final class C0929Wwwwwwwwwwwwwwwwwwwwwwwwwwwwww implements SurfaceTexture.OnFrameAvailableListener, Runnable {

    /* renamed from: Wwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwww  reason: collision with root package name */
    public static final int[] f13401Wwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwww = {12352, 4, 12324, 8, 12323, 8, 12322, 8, 12321, 8, 12325, 0, 12327, 12344, 12339, 4, 12344};

    /* renamed from: Wwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwww  reason: collision with root package name */
    public final C0930Wwwwwwwwwwwwwwwwwwwwwwwwwwwwwwww f13402Wwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwww;

    /* renamed from: Wwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwww  reason: collision with other field name */
    public SurfaceTexture f989Wwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwww;

    /* renamed from: Wwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwww  reason: collision with other field name */
    public EGLContext f990Wwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwww;

    /* renamed from: Wwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwww  reason: collision with other field name */
    public EGLDisplay f991Wwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwww;

    /* renamed from: Wwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwww  reason: collision with other field name */
    public EGLSurface f992Wwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwww;

    /* renamed from: Wwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwww  reason: collision with other field name */
    public final Handler f993Wwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwww;

    /* renamed from: Wwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwww  reason: collision with other field name */
    public final int[] f994Wwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwww;

    /* renamed from: Cccc.Wwwwwwwwwwwwwwwwwwwwwwwwwwwwww$Wwwwwwwwwwwwwwwwwwwwwwwwwwwwwwww */
    public interface C0930Wwwwwwwwwwwwwwwwwwwwwwwwwwwwwwww {
        void Wwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwww();
    }

    /* renamed from: Cccc.Wwwwwwwwwwwwwwwwwwwwwwwwwwwwww$Wwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwww */
    public static final class C0931Wwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwww extends RuntimeException {
        public C0931Wwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwww(String str) {
            super(str);
        }
    }

    public C0929Wwwwwwwwwwwwwwwwwwwwwwwwwwwwww(Handler handler) {
        this(handler, (C0930Wwwwwwwwwwwwwwwwwwwwwwwwwwwwwwww) null);
    }

    public static EGLDisplay Wwwwwwwwwwwwwwwwwwwwwwwwwwwww() {
        EGLDisplay eglGetDisplay = EGL14.eglGetDisplay(0);
        if (eglGetDisplay != null) {
            int[] iArr = new int[2];
            if (EGL14.eglInitialize(eglGetDisplay, iArr, 0, iArr, 1)) {
                return eglGetDisplay;
            }
            throw new C0931Wwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwww("eglInitialize failed");
        }
        throw new C0931Wwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwww("eglGetDisplay failed");
    }

    public static void Wwwwwwwwwwwwwwwwwwwwwwwwwwwwww(int[] iArr) {
        GLES20.glGenTextures(1, iArr, 0);
        C0923Wwwwwwwwwwwwwwwwwwwwwwwwww.Wwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwww();
    }

    public static EGLSurface Wwwwwwwwwwwwwwwwwwwwwwwwwwwwwwww(EGLDisplay eGLDisplay, EGLConfig eGLConfig, EGLContext eGLContext, int i) {
        EGLSurface eGLSurface;
        int[] iArr;
        if (i == 1) {
            eGLSurface = EGL14.EGL_NO_SURFACE;
        } else {
            if (i == 2) {
                iArr = new int[]{12375, 1, 12374, 1, 12992, 1, 12344};
            } else {
                iArr = new int[]{12375, 1, 12374, 1, 12344};
            }
            eGLSurface = EGL14.eglCreatePbufferSurface(eGLDisplay, eGLConfig, iArr, 0);
            if (eGLSurface == null) {
                throw new C0931Wwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwww("eglCreatePbufferSurface failed");
            }
        }
        if (EGL14.eglMakeCurrent(eGLDisplay, eGLSurface, eGLSurface, eGLContext)) {
            return eGLSurface;
        }
        throw new C0931Wwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwww("eglMakeCurrent failed");
    }

    public static EGLContext Wwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwww(EGLDisplay eGLDisplay, EGLConfig eGLConfig, int i) {
        EGLContext eglCreateContext = EGL14.eglCreateContext(eGLDisplay, eGLConfig, EGL14.EGL_NO_CONTEXT, i == 0 ? new int[]{12440, 2, 12344} : new int[]{12440, 2, 12992, 1, 12344}, 0);
        if (eglCreateContext != null) {
            return eglCreateContext;
        }
        throw new C0931Wwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwww("eglCreateContext failed");
    }

    public static EGLConfig Wwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwww(EGLDisplay eGLDisplay) {
        EGLConfig[] eGLConfigArr = new EGLConfig[1];
        int[] iArr = new int[1];
        boolean eglChooseConfig = EGL14.eglChooseConfig(eGLDisplay, f13401Wwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwww, 0, eGLConfigArr, 0, 1, iArr, 0);
        if (eglChooseConfig && iArr[0] > 0 && eGLConfigArr[0] != null) {
            return eGLConfigArr[0];
        }
        throw new C0931Wwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwww(C4949Wwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwww.Wwwwwwwwwwwww("eglChooseConfig failed: success=%b, numConfigs[0]=%d, configs[0]=%s", Boolean.valueOf(eglChooseConfig), Integer.valueOf(iArr[0]), eGLConfigArr[0]));
    }

    public void Wwwwwwwwwwwwwwwwwwwwwwwww() {
        this.f993Wwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwww.removeCallbacks(this);
        try {
            SurfaceTexture surfaceTexture = this.f989Wwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwww;
            if (surfaceTexture != null) {
                surfaceTexture.release();
                GLES20.glDeleteTextures(1, this.f994Wwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwww, 0);
            }
        } finally {
            EGLDisplay eGLDisplay = this.f991Wwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwww;
            if (eGLDisplay != null && !eGLDisplay.equals(EGL14.EGL_NO_DISPLAY)) {
                EGLDisplay eGLDisplay2 = this.f991Wwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwww;
                EGLSurface eGLSurface = EGL14.EGL_NO_SURFACE;
                EGL14.eglMakeCurrent(eGLDisplay2, eGLSurface, eGLSurface, EGL14.EGL_NO_CONTEXT);
            }
            EGLSurface eGLSurface2 = this.f992Wwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwww;
            if (eGLSurface2 != null && !eGLSurface2.equals(EGL14.EGL_NO_SURFACE)) {
                EGL14.eglDestroySurface(this.f991Wwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwww, this.f992Wwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwww);
            }
            EGLContext eGLContext = this.f990Wwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwww;
            if (eGLContext != null) {
                EGL14.eglDestroyContext(this.f991Wwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwww, eGLContext);
            }
            if (C4949Wwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwww.f19893Wwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwww >= 19) {
                EGL14.eglReleaseThread();
            }
            EGLDisplay eGLDisplay3 = this.f991Wwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwww;
            if (eGLDisplay3 != null && !eGLDisplay3.equals(EGL14.EGL_NO_DISPLAY)) {
                EGL14.eglTerminate(this.f991Wwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwww);
            }
            this.f991Wwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwww = null;
            this.f990Wwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwww = null;
            this.f992Wwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwww = null;
            this.f989Wwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwww = null;
        }
    }

    public void Wwwwwwwwwwwwwwwwwwwwwwwwww(int i) {
        EGLDisplay Wwwwwwwwwwwwwwwwwwwwwwwwwwwww2 = Wwwwwwwwwwwwwwwwwwwwwwwwwwwww();
        this.f991Wwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwww = Wwwwwwwwwwwwwwwwwwwwwwwwwwwww2;
        EGLConfig Wwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwww2 = Wwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwww(Wwwwwwwwwwwwwwwwwwwwwwwwwwwww2);
        EGLContext Wwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwww2 = Wwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwww(this.f991Wwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwww, Wwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwww2, i);
        this.f990Wwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwww = Wwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwww2;
        this.f992Wwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwww = Wwwwwwwwwwwwwwwwwwwwwwwwwwwwwwww(this.f991Wwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwww, Wwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwww2, Wwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwww2, i);
        Wwwwwwwwwwwwwwwwwwwwwwwwwwwwww(this.f994Wwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwww);
        SurfaceTexture surfaceTexture = new SurfaceTexture(this.f994Wwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwww[0]);
        this.f989Wwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwww = surfaceTexture;
        surfaceTexture.setOnFrameAvailableListener(this);
    }

    public SurfaceTexture Wwwwwwwwwwwwwwwwwwwwwwwwwwww() {
        return (SurfaceTexture) C4950Wwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwww.Wwwwwwwwwwwwwwwwwwwwwwwwwwwwww(this.f989Wwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwww);
    }

    public final void Wwwwwwwwwwwwwwwwwwwwwwwwwwwwwww() {
        C0930Wwwwwwwwwwwwwwwwwwwwwwwwwwwwwwww wwwwwwwwwwwwwwwwwwwwwwwwwwwwwwww = this.f13402Wwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwww;
        if (wwwwwwwwwwwwwwwwwwwwwwwwwwwwwwww != null) {
            wwwwwwwwwwwwwwwwwwwwwwwwwwwwwwww.Wwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwww();
        }
    }

    public void onFrameAvailable(SurfaceTexture surfaceTexture) {
        this.f993Wwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwww.post(this);
    }

    public void run() {
        Wwwwwwwwwwwwwwwwwwwwwwwwwwwwwww();
        SurfaceTexture surfaceTexture = this.f989Wwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwww;
        if (surfaceTexture != null) {
            try {
                surfaceTexture.updateTexImage();
            } catch (RuntimeException unused) {
            }
        }
    }

    public C0929Wwwwwwwwwwwwwwwwwwwwwwwwwwwwww(Handler handler, C0930Wwwwwwwwwwwwwwwwwwwwwwwwwwwwwwww wwwwwwwwwwwwwwwwwwwwwwwwwwwwwwww) {
        this.f993Wwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwww = handler;
        this.f13402Wwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwww = wwwwwwwwwwwwwwwwwwwwwwwwwwwwwwww;
        this.f994Wwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwww = new int[1];
    }
}
