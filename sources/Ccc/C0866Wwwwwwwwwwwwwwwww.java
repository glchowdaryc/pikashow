package Ccc;

import Lllllll.C1945Wwwwwwwwwwwwwwwwwwwwwwwwwwwwwww;
import Llllllllll.C2049Wwwwww;
import android.os.Handler;
import android.view.Surface;
import com.google.android.exoplayer2.util.C4950Wwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwww;

/* renamed from: Ccc.Wwwwwwwwwwwwwwwww */
public interface C0866Wwwwwwwwwwwwwwwww {

    /* renamed from: Ccc.Wwwwwwwwwwwwwwwww$Wwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwww */
    public static final class C0867Wwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwww {

        /* renamed from: Wwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwww  reason: collision with root package name */
        public final C0866Wwwwwwwwwwwwwwwww f13286Wwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwww;

        /* renamed from: Wwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwww  reason: collision with other field name */
        public final Handler f915Wwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwww;

        public C0867Wwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwww(Handler handler, C0866Wwwwwwwwwwwwwwwww wwwwwwwwwwwwwwwww) {
            this.f915Wwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwww = wwwwwwwwwwwwwwwww != null ? (Handler) C4950Wwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwww.Wwwwwwwwwwwwwwwwwwwwwwwwwwwwww(handler) : null;
            this.f13286Wwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwww = wwwwwwwwwwwwwwwww;
        }

        /* access modifiers changed from: private */
        public /* synthetic */ void Wwwwwwwwwwwwwwww(int i, int i2, int i3, float f) {
            this.f13286Wwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwww.Wwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwww(i, i2, i3, f);
        }

        /* access modifiers changed from: private */
        public /* synthetic */ void Wwwwwwwwwwwwwwwww(Surface surface) {
            this.f13286Wwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwww.Wwwwwwwwwwwwwwwww(surface);
        }

        /* access modifiers changed from: private */
        public /* synthetic */ void Wwwwwwwwwwwwwwwwww(C2049Wwwwww wwwwww) {
            this.f13286Wwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwww.Wwwwwwwwwwwwwwwwwww(wwwwww);
        }

        /* access modifiers changed from: private */
        public /* synthetic */ void Wwwwwwwwwwwwwwwwwww(C1945Wwwwwwwwwwwwwwwwwwwwwwwwwwwwwww wwwwwwwwwwwwwwwwwwwwwwwwwwwwwww) {
            this.f13286Wwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwww.Wwww(wwwwwwwwwwwwwwwwwwwwwwwwwwwwwww);
        }

        /* access modifiers changed from: private */
        public /* synthetic */ void Wwwwwwwwwwwwwwwwwwww(int i, long j) {
            this.f13286Wwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwww.Kkkkkkkkkkkkkkkkkkkkkkkkkk(i, j);
        }

        /* access modifiers changed from: private */
        public /* synthetic */ void Wwwwwwwwwwwwwwwwwwwww(C1945Wwwwwwwwwwwwwwwwwwwwwwwwwwwwwww wwwwwwwwwwwwwwwwwwwwwwwwwwwwwww) {
            wwwwwwwwwwwwwwwwwwwwwwwwwwwwwww.Wwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwww();
            this.f13286Wwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwww.Kkkkkkkkkkkkkkkkkkk(wwwwwwwwwwwwwwwwwwwwwwwwwwwwwww);
        }

        /* access modifiers changed from: private */
        public /* synthetic */ void Wwwwwwwwwwwwwwwwwwwwww(String str, long j, long j2) {
            this.f13286Wwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwww.Kkkkkkkkkkkkkkkkkkkkk(str, j, j2);
        }

        public void Wwwwwwwwwwwwww(int i, int i2, int i3, float f) {
            if (this.f13286Wwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwww != null) {
                this.f915Wwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwww.post(new C0874Wwwwwwwwwwwwwwwwwwwwwwww(this, i, i2, i3, f));
            }
        }

        public void Wwwwwwwwwwwwwww(Surface surface) {
            if (this.f13286Wwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwww != null) {
                this.f915Wwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwww.post(new C0869Wwwwwwwwwwwwwwwwwww(this, surface));
            }
        }

        public void Wwwwwwwwwwwwwwwwwwwwwww(C2049Wwwwww wwwwww) {
            if (this.f13286Wwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwww != null) {
                this.f915Wwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwww.post(new C0870Wwwwwwwwwwwwwwwwwwww(this, wwwwww));
            }
        }

        public void Wwwwwwwwwwwwwwwwwwwwwwww(C1945Wwwwwwwwwwwwwwwwwwwwwwwwwwwwwww wwwwwwwwwwwwwwwwwwwwwwwwwwwwwww) {
            if (this.f13286Wwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwww != null) {
                this.f915Wwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwww.post(new C0872Wwwwwwwwwwwwwwwwwwwwww(this, wwwwwwwwwwwwwwwwwwwwwwwwwwwwwww));
            }
        }

        public void Wwwwwwwwwwwwwwwwwwwwwwwww(int i, long j) {
            if (this.f13286Wwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwww != null) {
                this.f915Wwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwww.post(new C0873Wwwwwwwwwwwwwwwwwwwwwww(this, i, j));
            }
        }

        public void Wwwwwwwwwwwwwwwwwwwwwwwwww(C1945Wwwwwwwwwwwwwwwwwwwwwwwwwwwwwww wwwwwwwwwwwwwwwwwwwwwwwwwwwwwww) {
            wwwwwwwwwwwwwwwwwwwwwwwwwwwwwww.Wwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwww();
            if (this.f13286Wwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwww != null) {
                this.f915Wwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwww.post(new C0871Wwwwwwwwwwwwwwwwwwwww(this, wwwwwwwwwwwwwwwwwwwwwwwwwwwwwww));
            }
        }

        public void Wwwwwwwwwwwwwwwwwwwwwwwwwww(String str, long j, long j2) {
            if (this.f13286Wwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwww != null) {
                this.f915Wwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwww.post(new C0868Wwwwwwwwwwwwwwwwww(this, str, j, j2));
            }
        }
    }

    void Kkkkkkkkkkkkkkkkkkk(C1945Wwwwwwwwwwwwwwwwwwwwwwwwwwwwwww wwwwwwwwwwwwwwwwwwwwwwwwwwwwwww);

    void Kkkkkkkkkkkkkkkkkkkkk(String str, long j, long j2);

    void Kkkkkkkkkkkkkkkkkkkkkkkkkk(int i, long j);

    void Wwww(C1945Wwwwwwwwwwwwwwwwwwwwwwwwwwwwwww wwwwwwwwwwwwwwwwwwwwwwwwwwwwwww);

    void Wwwwwwwwwwwwwwwww(Surface surface);

    void Wwwwwwwwwwwwwwwwwww(C2049Wwwwww wwwwww);

    void Wwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwww(int i, int i2, int i3, float f);
}
