package Cccc;

/* renamed from: Cccc.Wwwwwwwwwwwwwwwwwwwwwwwwwwwwwww */
public final class C0933Wwwwwwwwwwwwwwwwwwwwwwwwwwwwwww {

    /* renamed from: Wwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwww  reason: collision with root package name */
    public boolean f13403Wwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwww;

    public synchronized boolean Wwwwwwwwwwwwwwwwwwwwwwwwwwwwwwww() {
        if (this.f13403Wwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwww) {
            return false;
        }
        this.f13403Wwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwww = true;
        notifyAll();
        return true;
    }

    public synchronized boolean Wwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwww() {
        boolean z;
        z = this.f13403Wwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwww;
        this.f13403Wwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwww = false;
        return z;
    }

    public synchronized void Wwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwww() {
        while (!this.f13403Wwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwww) {
            wait();
        }
    }
}
