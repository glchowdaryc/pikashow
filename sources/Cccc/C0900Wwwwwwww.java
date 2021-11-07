package Cccc;

import android.os.Handler;
import android.os.Looper;
import android.os.SystemClock;

/* renamed from: Cccc.Wwwwwwww */
public final class C0900Wwwwwwww implements C0936Wwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwww {
    public long Wwwwwwwwwwwwwwwwwwwwwwwwwwwwww() {
        return SystemClock.uptimeMillis();
    }

    public C0922Wwwwwwwwwwwwwwwwwwwwwwwww Wwwwwwwwwwwwwwwwwwwwwwwwwwwwwww(Looper looper, Handler.Callback callback) {
        return new C0899Wwwwwww(new Handler(looper, callback));
    }

    public long Wwwwwwwwwwwwwwwwwwwwwwwwwwwwwwww() {
        return SystemClock.elapsedRealtime();
    }
}
