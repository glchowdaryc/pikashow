package Ccccc;

import Ccccc.C0981Wwwwwwwwwwwwwwwwwwwwwwwwww;
import java.io.IOException;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* renamed from: Ccccc.Wwwwwwwwwwww */
public interface C0957Wwwwwwwwwwww extends C0981Wwwwwwwwwwwwwwwwwwwwwwwwww {

    /* renamed from: Ccccc.Wwwwwwwwwwww$Wwwwwwwwwwwwwwwwwwwwwwwwwwwww */
    public static final class C0958Wwwwwwwwwwwwwwwwwwwwwwwwwwwww {

        /* renamed from: Wwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwww  reason: collision with root package name */
        public Map<String, String> f13424Wwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwww;

        /* renamed from: Wwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwww  reason: collision with root package name */
        public final Map<String, String> f13425Wwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwww = new HashMap();

        public synchronized void Wwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwww(String str, String str2) {
            this.f13424Wwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwww = null;
            this.f13425Wwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwww.put(str, str2);
        }

        public synchronized Map<String, String> Wwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwww() {
            if (this.f13424Wwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwww == null) {
                this.f13424Wwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwww = Collections.unmodifiableMap(new HashMap(this.f13425Wwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwww));
            }
            return this.f13424Wwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwww;
        }
    }

    /* renamed from: Ccccc.Wwwwwwwwwwww$Wwwwwwwwwwwwwwwwwwwwwwwwwwwwww */
    public static final class C0959Wwwwwwwwwwwwwwwwwwwwwwwwwwwwww extends C0961Wwwwwwwwwwwwwwwwwwwwwwwwwwwwwwww {

        /* renamed from: Wwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwww  reason: collision with root package name */
        public final int f13426Wwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwww;

        /* renamed from: Wwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwww  reason: collision with other field name */
        public final Map<String, List<String>> f1026Wwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwww;

        public C0959Wwwwwwwwwwwwwwwwwwwwwwwwwwwwww(int i, String str, Map<String, List<String>> map, C0978Wwwwwwwwwwwwwwwwwwwwwww wwwwwwwwwwwwwwwwwwwwwww) {
            super("Response code: " + i, wwwwwwwwwwwwwwwwwwwwwww, 1);
            this.f13426Wwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwww = i;
            this.f1026Wwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwww = map;
        }
    }

    /* renamed from: Ccccc.Wwwwwwwwwwww$Wwwwwwwwwwwwwwwwwwwwwwwwwwwwwww */
    public static final class C0960Wwwwwwwwwwwwwwwwwwwwwwwwwwwwwww extends C0961Wwwwwwwwwwwwwwwwwwwwwwwwwwwwwwww {
        public C0960Wwwwwwwwwwwwwwwwwwwwwwwwwwwwwww(String str, C0978Wwwwwwwwwwwwwwwwwwwwwww wwwwwwwwwwwwwwwwwwwwwww) {
            super("Invalid content type: " + str, wwwwwwwwwwwwwwwwwwwwwww, 1);
        }
    }

    /* renamed from: Ccccc.Wwwwwwwwwwww$Wwwwwwwwwwwwwwwwwwwwwwwwwwwwwwww */
    public static class C0961Wwwwwwwwwwwwwwwwwwwwwwwwwwwwwwww extends IOException {
        public C0961Wwwwwwwwwwwwwwwwwwwwwwwwwwwwwwww(String str, C0978Wwwwwwwwwwwwwwwwwwwwwww wwwwwwwwwwwwwwwwwwwwwww, int i) {
            super(str);
        }

        public C0961Wwwwwwwwwwwwwwwwwwwwwwwwwwwwwwww(IOException iOException, C0978Wwwwwwwwwwwwwwwwwwwwwww wwwwwwwwwwwwwwwwwwwwwww, int i) {
            super(iOException);
        }

        public C0961Wwwwwwwwwwwwwwwwwwwwwwwwwwwwwwww(String str, IOException iOException, C0978Wwwwwwwwwwwwwwwwwwwwwww wwwwwwwwwwwwwwwwwwwwwww, int i) {
            super(str, iOException);
        }
    }

    /* renamed from: Ccccc.Wwwwwwwwwwww$Wwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwww */
    public interface C0962Wwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwww extends C0981Wwwwwwwwwwwwwwwwwwwwwwwwww.C0982Wwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwww {
        C0957Wwwwwwwwwwww Wwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwww();
    }

    /* renamed from: Ccccc.Wwwwwwwwwwww$Wwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwww */
    public static abstract class C0963Wwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwww implements C0962Wwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwww {

        /* renamed from: Wwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwww  reason: collision with root package name */
        public final C0958Wwwwwwwwwwwwwwwwwwwwwwwwwwwww f13427Wwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwww = new C0958Wwwwwwwwwwwwwwwwwwwwwwwwwwwww();

        public final C0958Wwwwwwwwwwwwwwwwwwwwwwwwwwwww Wwwwwwwwwwwwwwwwwwwwwwwwwwwwwww() {
            return this.f13427Wwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwww;
        }

        public abstract C0957Wwwwwwwwwwww Wwwwwwwwwwwwwwwwwwwwwwwwwwwwwwww(C0958Wwwwwwwwwwwwwwwwwwwwwwwwwwwww wwwwwwwwwwwwwwwwwwwwwwwwwwwww);

        /* renamed from: Wwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwww */
        public final C0957Wwwwwwwwwwww Wwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwww() {
            return Wwwwwwwwwwwwwwwwwwwwwwwwwwwwwwww(this.f13427Wwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwww);
        }
    }

    void Wwwwwwwwwwwwwwwwwwwwwwwwwwwwwwww(String str, String str2);
}
