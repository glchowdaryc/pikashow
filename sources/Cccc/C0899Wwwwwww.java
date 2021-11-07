package Cccc;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;

/* renamed from: Cccc.Wwwwwww */
public final class C0899Wwwwwww implements C0922Wwwwwwwwwwwwwwwwwwwwwwwww {

    /* renamed from: Wwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwww  reason: collision with root package name */
    public final Handler f13358Wwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwww;

    public C0899Wwwwwww(Handler handler) {
        this.f13358Wwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwww = handler;
    }

    public void Wwwwwwwwwwwwwwwwwwwwwwwwwwww(int i) {
        this.f13358Wwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwww.removeMessages(i);
    }

    public Message Wwwwwwwwwwwwwwwwwwwwwwwwwwwww(int i, Object obj) {
        return this.f13358Wwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwww.obtainMessage(i, obj);
    }

    public Looper Wwwwwwwwwwwwwwwwwwwwwwwwwwwwww() {
        return this.f13358Wwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwww.getLooper();
    }

    public Message Wwwwwwwwwwwwwwwwwwwwwwwwwwwwwww(int i, int i2, int i3, Object obj) {
        return this.f13358Wwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwww.obtainMessage(i, i2, i3, obj);
    }

    public boolean Wwwwwwwwwwwwwwwwwwwwwwwwwwwwwwww(int i) {
        return this.f13358Wwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwww.sendEmptyMessage(i);
    }

    public boolean Wwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwww(int i, long j) {
        return this.f13358Wwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwww.sendEmptyMessageAtTime(i, j);
    }

    public Message Wwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwww(int i, int i2, int i3) {
        return this.f13358Wwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwww.obtainMessage(i, i2, i3);
    }
}
