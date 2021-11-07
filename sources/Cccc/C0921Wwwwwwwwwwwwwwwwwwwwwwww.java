package Cccc;

import java.util.Arrays;

/* renamed from: Cccc.Wwwwwwwwwwwwwwwwwwwwwwww */
public final class C0921Wwwwwwwwwwwwwwwwwwwwwwww {

    /* renamed from: Wwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwww  reason: collision with root package name */
    public boolean f13396Wwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwww;

    /* renamed from: Wwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwww  reason: collision with root package name */
    public boolean f13397Wwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwww;

    /* renamed from: Wwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwww  reason: collision with other field name */
    public String[] f985Wwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwww;

    public C0921Wwwwwwwwwwwwwwwwwwwwwwww(String... strArr) {
        this.f985Wwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwww = strArr;
    }

    public synchronized boolean Wwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwww() {
        if (this.f13397Wwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwww) {
            return this.f13396Wwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwww;
        }
        this.f13397Wwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwww = true;
        try {
            for (String loadLibrary : this.f985Wwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwww) {
                System.loadLibrary(loadLibrary);
            }
            this.f13396Wwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwww = true;
        } catch (UnsatisfiedLinkError unused) {
            C0920Wwwwwwwwwwwwwwwwwwwwwww.Wwwwwwwwwwwwwwwwwwwwwwwwwwwww("LibraryLoader", "Failed to load " + Arrays.toString(this.f985Wwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwww));
        }
        return this.f13396Wwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwww;
    }
}
