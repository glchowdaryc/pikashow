package Cccc;

import android.os.Handler;
import com.google.android.exoplayer2.util.C4950Wwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwww;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;

/* renamed from: Cccc.Wwwwwwwwwwwwwwwwwwwwwwwwwwww */
public final class C0925Wwwwwwwwwwwwwwwwwwwwwwwwwwww<T> {

    /* renamed from: Wwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwww  reason: collision with root package name */
    public final CopyOnWriteArrayList<C0926Wwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwww<T>> f13399Wwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwww = new CopyOnWriteArrayList<>();

    /* renamed from: Cccc.Wwwwwwwwwwwwwwwwwwwwwwwwwwww$Wwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwww */
    public static final class C0926Wwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwww<T> {

        /* renamed from: Wwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwww  reason: collision with root package name */
        public final Handler f13400Wwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwww;

        /* renamed from: Wwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwww  reason: collision with other field name */
        public final T f987Wwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwww;

        /* renamed from: Wwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwww  reason: collision with other field name */
        public boolean f988Wwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwww;

        public C0926Wwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwww(Handler handler, T t) {
            this.f13400Wwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwww = handler;
            this.f987Wwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwww = t;
        }

        /* access modifiers changed from: private */
        public /* synthetic */ void Wwwwwwwwwwwwwwwwwwwwwwwwwwwwwww(C0927Wwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwww wwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwww) {
            if (!this.f988Wwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwww) {
                wwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwww.Wwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwww(this.f987Wwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwww);
            }
        }

        public void Wwwwwwwwwwwwwwwwwwwwwwwwwwwwww() {
            this.f988Wwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwww = true;
        }

        public void Wwwwwwwwwwwwwwwwwwwwwwwwwwwwwwww(C0927Wwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwww<T> wwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwww) {
            this.f13400Wwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwww.post(new C0924Wwwwwwwwwwwwwwwwwwwwwwwwwww(this, wwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwww));
        }
    }

    /* renamed from: Cccc.Wwwwwwwwwwwwwwwwwwwwwwwwwwww$Wwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwww */
    public interface C0927Wwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwww<T> {
        void Wwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwww(T t);
    }

    public void Wwwwwwwwwwwwwwwwwwwwwwwwwwwwwwww(T t) {
        Iterator<C0926Wwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwww<T>> it = this.f13399Wwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwww.iterator();
        while (it.hasNext()) {
            C0926Wwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwww next = it.next();
            if (next.f987Wwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwww == t) {
                next.Wwwwwwwwwwwwwwwwwwwwwwwwwwwwww();
                this.f13399Wwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwww.remove(next);
            }
        }
    }

    public void Wwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwww(C0927Wwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwww<T> wwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwww) {
        Iterator<C0926Wwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwww<T>> it = this.f13399Wwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwww.iterator();
        while (it.hasNext()) {
            it.next().Wwwwwwwwwwwwwwwwwwwwwwwwwwwwwwww(wwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwww);
        }
    }

    public void Wwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwww(Handler handler, T t) {
        C4950Wwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwww.Wwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwww((handler == null || t == null) ? false : true);
        Wwwwwwwwwwwwwwwwwwwwwwwwwwwwwwww(t);
        this.f13399Wwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwww.add(new C0926Wwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwww(handler, t));
    }
}
