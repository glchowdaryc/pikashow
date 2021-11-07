package Cccc;

import com.google.android.exoplayer2.util.C4949Wwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwww;
import java.util.Collections;
import java.util.PriorityQueue;

/* renamed from: Cccc.Wwwwwwwwwwwwww */
public final class C0908Wwwwwwwwwwwwww {

    /* renamed from: Wwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwww  reason: collision with root package name */
    public int f13370Wwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwww = Integer.MIN_VALUE;

    /* renamed from: Wwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwww  reason: collision with other field name */
    public final Object f969Wwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwww = new Object();

    /* renamed from: Wwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwww  reason: collision with other field name */
    public final PriorityQueue<Integer> f970Wwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwww = new PriorityQueue<>(10, Collections.reverseOrder());

    public void Wwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwww(int i) {
        synchronized (this.f969Wwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwww) {
            this.f970Wwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwww.remove(Integer.valueOf(i));
            this.f13370Wwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwww = this.f970Wwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwww.isEmpty() ? Integer.MIN_VALUE : ((Integer) C4949Wwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwww.Wwwwwwwwwwwwwwwwwwwwwwwwwwww(this.f970Wwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwww.peek())).intValue();
            this.f969Wwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwww.notifyAll();
        }
    }

    public void Wwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwww(int i) {
        synchronized (this.f969Wwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwww) {
            this.f970Wwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwww.add(Integer.valueOf(i));
            this.f13370Wwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwww = Math.max(this.f13370Wwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwww, i);
        }
    }
}
