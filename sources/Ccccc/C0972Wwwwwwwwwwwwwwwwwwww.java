package Ccccc;

import Cccc.C0902Wwwwwwwwww;
import Cccc.C0925Wwwwwwwwwwwwwwwwwwwwwwwwwwww;
import Cccc.C0936Wwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwww;
import Ccccc.C0988Wwwwwwwwwwwwwwwwwwwwwwwwwwwwwww;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.os.Handler;
import android.os.Looper;
import android.util.SparseArray;
import com.google.android.exoplayer2.util.C4949Wwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwww;
import com.google.android.exoplayer2.util.C4950Wwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwww;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/* renamed from: Ccccc.Wwwwwwwwwwwwwwwwwwww */
public final class C0972Wwwwwwwwwwwwwwwwwwww implements C0988Wwwwwwwwwwwwwwwwwwwwwwwwwwwwwww, C0939Wwwww {

    /* renamed from: Wwwwwwwwwwwwwwwwwwwwwwwwwwwwwww  reason: collision with root package name */
    public static final long[] f13448Wwwwwwwwwwwwwwwwwwwwwwwwwwwwwww = {6000000, 3400000, 2100000, 1400000, 570000};

    /* renamed from: Wwwwwwwwwwwwwwwwwwwwwwwwwwwwwwww  reason: collision with root package name */
    public static final long[] f13449Wwwwwwwwwwwwwwwwwwwwwwwwwwwwwwww = {2100000, 1300000, 960000, 770000, 450000};

    /* renamed from: Wwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwww  reason: collision with root package name */
    public static final long[] f13450Wwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwww = {170000, 139000, 122000, 107000, 90000};

    /* renamed from: Wwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwww  reason: collision with root package name */
    public static final Map<String, int[]> f13451Wwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwww = Wwwwwwwwwwwwwwwwwwwwwwww();

    /* renamed from: Wwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwww  reason: collision with other field name */
    public static final long[] f1051Wwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwww = {5400000, 3400000, 1900000, 1100000, 400000};

    /* renamed from: Wwwwwwwwwwwwwwwwwwwwwwwwwwwww  reason: collision with root package name */
    public long f13452Wwwwwwwwwwwwwwwwwwwwwwwwwwwww;

    /* renamed from: Wwwwwwwwwwwwwwwwwwwwwwwwwwwwww  reason: collision with root package name */
    public long f13453Wwwwwwwwwwwwwwwwwwwwwwwwwwwwww;

    /* renamed from: Wwwwwwwwwwwwwwwwwwwwwwwwwwwwwww  reason: collision with other field name */
    public long f1052Wwwwwwwwwwwwwwwwwwwwwwwwwwwwwww;

    /* renamed from: Wwwwwwwwwwwwwwwwwwwwwwwwwwwwwwww  reason: collision with other field name */
    public int f1053Wwwwwwwwwwwwwwwwwwwwwwwwwwwwwwww;

    /* renamed from: Wwwwwwwwwwwwwwwwwwwwwwwwwwwwwwww  reason: collision with other field name */
    public long f1054Wwwwwwwwwwwwwwwwwwwwwwwwwwwwwwww;

    /* renamed from: Wwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwww  reason: collision with other field name */
    public int f1055Wwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwww;

    /* renamed from: Wwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwww  reason: collision with other field name */
    public long f1056Wwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwww;

    /* renamed from: Wwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwww  reason: collision with other field name */
    public int f1057Wwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwww;

    /* renamed from: Wwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwww  reason: collision with other field name */
    public long f1058Wwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwww;

    /* renamed from: Wwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwww  reason: collision with other field name */
    public final C0902Wwwwwwwwww f1059Wwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwww;

    /* renamed from: Wwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwww  reason: collision with other field name */
    public final C0925Wwwwwwwwwwwwwwwwwwwwwwwwwwww<C0988Wwwwwwwwwwwwwwwwwwwwwwwwwwwwwww.C0989Wwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwww> f1060Wwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwww;

    /* renamed from: Wwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwww  reason: collision with other field name */
    public final C0936Wwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwww f1061Wwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwww;

    /* renamed from: Wwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwww  reason: collision with other field name */
    public final Context f1062Wwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwww;

    /* renamed from: Wwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwww  reason: collision with other field name */
    public final SparseArray<Long> f1063Wwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwww;

    /* renamed from: Wwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwww  reason: collision with other field name */
    public boolean f1064Wwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwww;

    /* renamed from: Ccccc.Wwwwwwwwwwwwwwwwwwww$Wwwwwwwwwwwwwwwwwwwwwwwwwwwwwwww */
    public static class C0973Wwwwwwwwwwwwwwwwwwwwwwwwwwwwwwww extends BroadcastReceiver {

        /* renamed from: Wwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwww  reason: collision with root package name */
        public static C0973Wwwwwwwwwwwwwwwwwwwwwwwwwwwwwwww f13454Wwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwww;

        /* renamed from: Wwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwww  reason: collision with other field name */
        public final Handler f1065Wwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwww = new Handler(Looper.getMainLooper());

        /* renamed from: Wwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwww  reason: collision with other field name */
        public final ArrayList<WeakReference<C0972Wwwwwwwwwwwwwwwwwwww>> f1066Wwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwww = new ArrayList<>();

        public static synchronized C0973Wwwwwwwwwwwwwwwwwwwwwwwwwwwwwwww Wwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwww(Context context) {
            C0973Wwwwwwwwwwwwwwwwwwwwwwwwwwwwwwww wwwwwwwwwwwwwwwwwwwwwwwwwwwwwwww;
            synchronized (C0973Wwwwwwwwwwwwwwwwwwwwwwwwwwwwwwww.class) {
                if (f13454Wwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwww == null) {
                    f13454Wwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwww = new C0973Wwwwwwwwwwwwwwwwwwwwwwwwwwwwwwww();
                    IntentFilter intentFilter = new IntentFilter();
                    intentFilter.addAction("android.net.conn.CONNECTIVITY_CHANGE");
                    context.registerReceiver(f13454Wwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwww, intentFilter);
                }
                wwwwwwwwwwwwwwwwwwwwwwwwwwwwwwww = f13454Wwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwww;
            }
            return wwwwwwwwwwwwwwwwwwwwwwwwwwwwwwww;
        }

        /* renamed from: Wwwwwwwwwwwwwwwwwwwwwwwwwwwww */
        public final void Wwwwwwwwwwwwwwwwwwwwwwwwwwwwwwww(C0972Wwwwwwwwwwwwwwwwwwww wwwwwwwwwwwwwwwwwwww) {
            wwwwwwwwwwwwwwwwwwww.Wwwwwwwwwwwwwwwwwwww();
        }

        public final void Wwwwwwwwwwwwwwwwwwwwwwwwwwwwww() {
            for (int size = this.f1066Wwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwww.size() - 1; size >= 0; size--) {
                if (((C0972Wwwwwwwwwwwwwwwwwwww) this.f1066Wwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwww.get(size).get()) == null) {
                    this.f1066Wwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwww.remove(size);
                }
            }
        }

        public synchronized void Wwwwwwwwwwwwwwwwwwwwwwwwwwwwwww(C0972Wwwwwwwwwwwwwwwwwwww wwwwwwwwwwwwwwwwwwww) {
            Wwwwwwwwwwwwwwwwwwwwwwwwwwwwww();
            this.f1066Wwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwww.add(new WeakReference(wwwwwwwwwwwwwwwwwwww));
            this.f1065Wwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwww.post(new C0971Wwwwwwwwwwwwwwwwwww(this, wwwwwwwwwwwwwwwwwwww));
        }

        public synchronized void onReceive(Context context, Intent intent) {
            if (!isInitialStickyBroadcast()) {
                Wwwwwwwwwwwwwwwwwwwwwwwwwwwwww();
                for (int i = 0; i < this.f1066Wwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwww.size(); i++) {
                    C0972Wwwwwwwwwwwwwwwwwwww wwwwwwwwwwwwwwwwwwww = (C0972Wwwwwwwwwwwwwwwwwwww) this.f1066Wwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwww.get(i).get();
                    if (wwwwwwwwwwwwwwwwwwww != null) {
                        Wwwwwwwwwwwwwwwwwwwwwwwwwwwwwwww(wwwwwwwwwwwwwwwwwwww);
                    }
                }
            }
        }
    }

    /* renamed from: Ccccc.Wwwwwwwwwwwwwwwwwwww$Wwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwww */
    public static final class C0974Wwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwww {

        /* renamed from: Wwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwww  reason: collision with root package name */
        public int f13455Wwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwww;

        /* renamed from: Wwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwww  reason: collision with other field name */
        public C0936Wwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwww f1067Wwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwww;

        /* renamed from: Wwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwww  reason: collision with other field name */
        public final Context f1068Wwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwww;

        /* renamed from: Wwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwww  reason: collision with other field name */
        public SparseArray<Long> f1069Wwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwww;

        /* renamed from: Wwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwww  reason: collision with other field name */
        public boolean f1070Wwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwww;

        public C0974Wwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwww(Context context) {
            Context context2;
            if (context == null) {
                context2 = null;
            } else {
                context2 = context.getApplicationContext();
            }
            this.f1068Wwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwww = context2;
            this.f1069Wwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwww = Wwwwwwwwwwwwwwwwwwwwwwwwwwwwwwww(C4949Wwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwww.Wwwwww(context));
            this.f13455Wwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwww = 2000;
            this.f1067Wwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwww = C0936Wwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwww.f13409Wwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwww;
            this.f1070Wwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwww = true;
        }

        public static SparseArray<Long> Wwwwwwwwwwwwwwwwwwwwwwwwwwwwwwww(String str) {
            int[] Wwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwww2 = Wwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwww(str);
            SparseArray<Long> sparseArray = new SparseArray<>(6);
            sparseArray.append(0, 1000000L);
            long[] jArr = C0972Wwwwwwwwwwwwwwwwwwww.f1051Wwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwww;
            sparseArray.append(2, Long.valueOf(jArr[Wwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwww2[0]]));
            sparseArray.append(3, Long.valueOf(C0972Wwwwwwwwwwwwwwwwwwww.f13450Wwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwww[Wwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwww2[1]]));
            sparseArray.append(4, Long.valueOf(C0972Wwwwwwwwwwwwwwwwwwww.f13449Wwwwwwwwwwwwwwwwwwwwwwwwwwwwwwww[Wwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwww2[2]]));
            sparseArray.append(5, Long.valueOf(C0972Wwwwwwwwwwwwwwwwwwww.f13448Wwwwwwwwwwwwwwwwwwwwwwwwwwwwwww[Wwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwww2[3]]));
            sparseArray.append(7, Long.valueOf(jArr[Wwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwww2[0]]));
            return sparseArray;
        }

        public static int[] Wwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwww(String str) {
            int[] iArr = C0972Wwwwwwwwwwwwwwwwwwww.f13451Wwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwww.get(str);
            if (iArr == null) {
                return new int[]{2, 2, 2, 2};
            }
            return iArr;
        }

        public C0972Wwwwwwwwwwwwwwwwwwww Wwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwww() {
            return new C0972Wwwwwwwwwwwwwwwwwwww(this.f1068Wwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwww, this.f1069Wwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwww, this.f13455Wwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwww, this.f1067Wwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwww, this.f1070Wwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwww);
        }
    }

    public static Map<String, int[]> Wwwwwwwwwwwwwwwwwwwwwwww() {
        HashMap hashMap = new HashMap();
        hashMap.put("AD", new int[]{1, 0, 0, 1});
        hashMap.put("AE", new int[]{1, 4, 4, 4});
        hashMap.put("AF", new int[]{4, 4, 3, 3});
        hashMap.put("AG", new int[]{3, 2, 1, 1});
        hashMap.put("AI", new int[]{1, 0, 1, 3});
        hashMap.put("AL", new int[]{1, 2, 1, 1});
        hashMap.put("AM", new int[]{2, 2, 3, 2});
        hashMap.put("AO", new int[]{3, 4, 2, 0});
        hashMap.put("AQ", new int[]{4, 2, 2, 2});
        hashMap.put("AR", new int[]{2, 3, 2, 2});
        hashMap.put("AS", new int[]{3, 3, 4, 1});
        hashMap.put("AT", new int[]{0, 2, 0, 0});
        hashMap.put("AU", new int[]{0, 1, 1, 1});
        hashMap.put("AW", new int[]{1, 1, 0, 2});
        hashMap.put("AX", new int[]{0, 2, 1, 0});
        hashMap.put("AZ", new int[]{3, 3, 2, 2});
        hashMap.put("BA", new int[]{1, 1, 1, 2});
        hashMap.put("BB", new int[]{0, 1, 0, 0});
        hashMap.put("BD", new int[]{2, 2, 3, 2});
        hashMap.put("BE", new int[]{0, 0, 0, 1});
        hashMap.put("BF", new int[]{4, 4, 3, 1});
        hashMap.put("BG", new int[]{0, 1, 0, 0});
        hashMap.put("BH", new int[]{2, 1, 3, 4});
        hashMap.put("BI", new int[]{4, 3, 4, 4});
        hashMap.put("BJ", new int[]{4, 3, 4, 4});
        hashMap.put("BL", new int[]{1, 0, 2, 3});
        hashMap.put("BM", new int[]{1, 0, 0, 0});
        hashMap.put("BN", new int[]{4, 2, 3, 3});
        hashMap.put("BO", new int[]{2, 2, 3, 2});
        hashMap.put("BQ", new int[]{1, 0, 3, 4});
        hashMap.put("BR", new int[]{2, 3, 3, 2});
        hashMap.put("BS", new int[]{2, 0, 1, 4});
        hashMap.put("BT", new int[]{3, 0, 2, 1});
        hashMap.put("BW", new int[]{4, 4, 1, 2});
        hashMap.put("BY", new int[]{0, 1, 1, 2});
        hashMap.put("BZ", new int[]{2, 2, 3, 1});
        hashMap.put("CA", new int[]{0, 3, 3, 3});
        hashMap.put("CD", new int[]{4, 4, 3, 2});
        hashMap.put("CF", new int[]{4, 3, 3, 4});
        hashMap.put("CG", new int[]{4, 4, 4, 4});
        hashMap.put("CH", new int[]{0, 0, 1, 1});
        hashMap.put("CI", new int[]{3, 4, 3, 3});
        hashMap.put("CK", new int[]{2, 4, 1, 0});
        hashMap.put("CL", new int[]{2, 2, 2, 3});
        hashMap.put("CM", new int[]{3, 4, 2, 1});
        hashMap.put("CN", new int[]{2, 2, 2, 3});
        hashMap.put("CO", new int[]{2, 3, 2, 2});
        hashMap.put("CR", new int[]{2, 2, 4, 4});
        hashMap.put("CU", new int[]{4, 4, 3, 1});
        hashMap.put("CV", new int[]{2, 3, 2, 4});
        hashMap.put("CW", new int[]{1, 0, 0, 0});
        hashMap.put("CX", new int[]{2, 2, 2, 2});
        hashMap.put("CY", new int[]{1, 1, 1, 1});
        hashMap.put("CZ", new int[]{0, 1, 0, 0});
        hashMap.put("DE", new int[]{0, 2, 2, 2});
        hashMap.put("DJ", new int[]{3, 3, 4, 0});
        hashMap.put("DK", new int[]{0, 0, 0, 0});
        hashMap.put("DM", new int[]{1, 0, 0, 3});
        hashMap.put("DO", new int[]{3, 3, 4, 4});
        hashMap.put("DZ", new int[]{3, 3, 4, 4});
        hashMap.put("EC", new int[]{2, 4, 4, 2});
        hashMap.put("EE", new int[]{0, 0, 0, 0});
        hashMap.put("EG", new int[]{3, 4, 2, 2});
        hashMap.put("EH", new int[]{2, 0, 3, 3});
        hashMap.put("ER", new int[]{4, 2, 2, 2});
        hashMap.put("ES", new int[]{0, 1, 1, 1});
        hashMap.put("ET", new int[]{4, 4, 4, 0});
        hashMap.put("FI", new int[]{0, 0, 1, 0});
        hashMap.put("FJ", new int[]{3, 1, 3, 3});
        hashMap.put("FK", new int[]{4, 2, 2, 3});
        hashMap.put("FM", new int[]{4, 2, 4, 0});
        hashMap.put("FO", new int[]{0, 0, 0, 0});
        hashMap.put("FR", new int[]{1, 0, 3, 1});
        hashMap.put("GA", new int[]{3, 3, 2, 1});
        hashMap.put("GB", new int[]{0, 1, 3, 3});
        hashMap.put("GD", new int[]{2, 0, 4, 4});
        hashMap.put("GE", new int[]{1, 1, 0, 3});
        hashMap.put("GF", new int[]{1, 2, 4, 4});
        hashMap.put("GG", new int[]{0, 0, 0, 0});
        hashMap.put("GH", new int[]{3, 3, 3, 2});
        hashMap.put("GI", new int[]{0, 0, 0, 1});
        hashMap.put("GL", new int[]{2, 2, 3, 4});
        hashMap.put("GM", new int[]{4, 3, 3, 2});
        hashMap.put("GN", new int[]{4, 4, 4, 0});
        hashMap.put("GP", new int[]{2, 2, 1, 3});
        hashMap.put("GQ", new int[]{4, 3, 3, 0});
        hashMap.put("GR", new int[]{1, 1, 0, 1});
        hashMap.put("GT", new int[]{3, 3, 3, 4});
        hashMap.put("GU", new int[]{1, 2, 4, 4});
        hashMap.put("GW", new int[]{4, 4, 4, 0});
        hashMap.put("GY", new int[]{3, 4, 1, 0});
        hashMap.put("HK", new int[]{0, 1, 4, 4});
        hashMap.put("HN", new int[]{3, 3, 2, 2});
        hashMap.put("HR", new int[]{1, 0, 0, 2});
        hashMap.put("HT", new int[]{3, 4, 4, 3});
        hashMap.put("HU", new int[]{0, 0, 1, 0});
        hashMap.put("ID", new int[]{3, 2, 3, 4});
        hashMap.put("IE", new int[]{0, 0, 3, 2});
        hashMap.put("IL", new int[]{0, 1, 2, 3});
        hashMap.put("IM", new int[]{0, 0, 0, 1});
        hashMap.put("IN", new int[]{2, 2, 4, 4});
        hashMap.put("IO", new int[]{4, 4, 2, 2});
        hashMap.put("IQ", new int[]{3, 3, 4, 4});
        hashMap.put("IR", new int[]{1, 0, 1, 0});
        hashMap.put("IS", new int[]{0, 0, 0, 0});
        hashMap.put("IT", new int[]{1, 0, 1, 1});
        hashMap.put("JE", new int[]{1, 0, 0, 1});
        hashMap.put("JM", new int[]{3, 2, 2, 1});
        hashMap.put("JO", new int[]{1, 1, 1, 2});
        hashMap.put("JP", new int[]{0, 2, 2, 2});
        hashMap.put("KE", new int[]{3, 3, 3, 3});
        hashMap.put("KG", new int[]{1, 1, 2, 3});
        hashMap.put("KH", new int[]{2, 0, 4, 4});
        hashMap.put("KI", new int[]{4, 4, 4, 4});
        hashMap.put("KM", new int[]{4, 4, 3, 3});
        hashMap.put("KN", new int[]{1, 0, 1, 4});
        hashMap.put("KP", new int[]{1, 2, 0, 2});
        hashMap.put("KR", new int[]{0, 3, 0, 2});
        hashMap.put("KW", new int[]{2, 2, 1, 2});
        hashMap.put("KY", new int[]{1, 1, 0, 2});
        hashMap.put("KZ", new int[]{1, 2, 2, 2});
        hashMap.put("LA", new int[]{2, 1, 1, 0});
        hashMap.put("LB", new int[]{3, 2, 0, 0});
        hashMap.put("LC", new int[]{2, 1, 0, 0});
        hashMap.put("LI", new int[]{0, 0, 2, 2});
        hashMap.put("LK", new int[]{1, 1, 2, 2});
        hashMap.put("LR", new int[]{3, 4, 4, 1});
        hashMap.put("LS", new int[]{3, 3, 2, 0});
        hashMap.put("LT", new int[]{0, 0, 0, 0});
        hashMap.put("LU", new int[]{0, 1, 0, 0});
        hashMap.put("LV", new int[]{0, 0, 0, 0});
        hashMap.put("LY", new int[]{4, 3, 4, 4});
        hashMap.put("MA", new int[]{2, 1, 2, 2});
        hashMap.put("MC", new int[]{1, 0, 1, 0});
        hashMap.put("MD", new int[]{1, 1, 0, 0});
        hashMap.put("ME", new int[]{1, 2, 2, 3});
        hashMap.put("MF", new int[]{1, 4, 2, 1});
        hashMap.put("MG", new int[]{3, 4, 1, 3});
        hashMap.put("MH", new int[]{4, 0, 2, 3});
        hashMap.put("MK", new int[]{1, 0, 0, 0});
        hashMap.put("ML", new int[]{4, 4, 4, 3});
        hashMap.put("MM", new int[]{2, 3, 1, 2});
        hashMap.put("MN", new int[]{2, 3, 2, 4});
        hashMap.put("MO", new int[]{0, 0, 4, 4});
        hashMap.put("MP", new int[]{0, 2, 4, 4});
        hashMap.put("MQ", new int[]{1, 1, 1, 3});
        hashMap.put("MR", new int[]{4, 4, 4, 4});
        hashMap.put("MS", new int[]{1, 4, 0, 3});
        hashMap.put("MT", new int[]{0, 1, 0, 0});
        hashMap.put("MU", new int[]{2, 2, 3, 4});
        hashMap.put("MV", new int[]{3, 2, 1, 1});
        hashMap.put("MW", new int[]{4, 2, 1, 1});
        hashMap.put("MX", new int[]{2, 4, 3, 2});
        hashMap.put("MY", new int[]{2, 2, 2, 3});
        hashMap.put("MZ", new int[]{3, 4, 2, 2});
        hashMap.put("NA", new int[]{3, 2, 2, 1});
        hashMap.put("NC", new int[]{2, 1, 3, 2});
        hashMap.put("NE", new int[]{4, 4, 4, 3});
        hashMap.put("NF", new int[]{1, 2, 2, 2});
        hashMap.put("NG", new int[]{3, 4, 3, 2});
        hashMap.put("NI", new int[]{3, 3, 3, 4});
        hashMap.put("NL", new int[]{0, 2, 4, 3});
        hashMap.put("NO", new int[]{0, 1, 0, 0});
        hashMap.put("NP", new int[]{3, 3, 2, 2});
        hashMap.put("NR", new int[]{4, 0, 4, 0});
        hashMap.put("NU", new int[]{2, 2, 2, 1});
        hashMap.put("NZ", new int[]{0, 0, 0, 1});
        hashMap.put("OM", new int[]{2, 2, 1, 3});
        hashMap.put("PA", new int[]{1, 3, 3, 4});
        hashMap.put("PE", new int[]{2, 3, 4, 4});
        hashMap.put("PF", new int[]{3, 1, 0, 1});
        hashMap.put("PG", new int[]{4, 3, 1, 1});
        hashMap.put("PH", new int[]{3, 0, 4, 4});
        hashMap.put("PK", new int[]{3, 3, 3, 3});
        hashMap.put("PL", new int[]{1, 1, 1, 3});
        hashMap.put("PM", new int[]{0, 2, 0, 0});
        hashMap.put("PR", new int[]{2, 1, 3, 3});
        hashMap.put("PS", new int[]{3, 3, 1, 4});
        hashMap.put("PT", new int[]{1, 1, 0, 1});
        hashMap.put("PW", new int[]{2, 2, 1, 1});
        hashMap.put("PY", new int[]{3, 1, 3, 3});
        hashMap.put("QA", new int[]{2, 3, 0, 1});
        hashMap.put("RE", new int[]{1, 0, 2, 2});
        hashMap.put("RO", new int[]{0, 1, 1, 2});
        hashMap.put("RS", new int[]{1, 2, 0, 0});
        hashMap.put("RU", new int[]{0, 1, 1, 1});
        hashMap.put("RW", new int[]{3, 4, 2, 4});
        hashMap.put("SA", new int[]{2, 2, 1, 2});
        hashMap.put("SB", new int[]{4, 4, 3, 0});
        hashMap.put("SC", new int[]{4, 2, 0, 1});
        hashMap.put("SD", new int[]{4, 4, 4, 2});
        hashMap.put("SE", new int[]{0, 1, 0, 0});
        hashMap.put("SG", new int[]{1, 2, 3, 3});
        hashMap.put("SH", new int[]{4, 4, 2, 3});
        hashMap.put("SI", new int[]{0, 1, 0, 1});
        hashMap.put("SJ", new int[]{0, 0, 2, 0});
        hashMap.put("SK", new int[]{0, 1, 0, 1});
        hashMap.put("SL", new int[]{4, 3, 2, 4});
        hashMap.put("SM", new int[]{0, 0, 1, 3});
        hashMap.put("SN", new int[]{4, 4, 4, 3});
        hashMap.put("SO", new int[]{4, 4, 4, 4});
        hashMap.put("SR", new int[]{3, 2, 2, 4});
        hashMap.put("SS", new int[]{4, 2, 4, 2});
        hashMap.put("ST", new int[]{3, 4, 2, 2});
        hashMap.put("SV", new int[]{2, 3, 3, 4});
        hashMap.put("SX", new int[]{2, 4, 1, 0});
        hashMap.put("SY", new int[]{4, 4, 1, 0});
        hashMap.put("SZ", new int[]{3, 4, 2, 3});
        hashMap.put("TC", new int[]{1, 1, 3, 1});
        hashMap.put("TD", new int[]{4, 4, 4, 3});
        hashMap.put("TG", new int[]{3, 3, 1, 0});
        hashMap.put("TH", new int[]{1, 3, 4, 4});
        hashMap.put("TJ", new int[]{4, 4, 4, 4});
        hashMap.put("TL", new int[]{4, 2, 4, 4});
        hashMap.put("TM", new int[]{4, 1, 2, 3});
        hashMap.put("TN", new int[]{2, 1, 1, 1});
        hashMap.put("TO", new int[]{3, 3, 3, 1});
        hashMap.put("TR", new int[]{1, 2, 0, 1});
        hashMap.put("TT", new int[]{2, 3, 1, 2});
        hashMap.put("TV", new int[]{4, 2, 2, 4});
        hashMap.put("TW", new int[]{0, 0, 0, 1});
        hashMap.put("TZ", new int[]{3, 3, 4, 3});
        hashMap.put("UA", new int[]{0, 2, 1, 2});
        hashMap.put("UG", new int[]{4, 3, 2, 3});
        hashMap.put("US", new int[]{0, 1, 3, 3});
        hashMap.put("UY", new int[]{2, 2, 2, 2});
        hashMap.put("UZ", new int[]{3, 2, 2, 2});
        hashMap.put("VA", new int[]{1, 2, 2, 2});
        hashMap.put("VC", new int[]{2, 1, 0, 0});
        hashMap.put("VE", new int[]{4, 4, 4, 3});
        hashMap.put("VG", new int[]{2, 1, 1, 2});
        hashMap.put("VI", new int[]{1, 0, 2, 4});
        hashMap.put("VN", new int[]{0, 2, 4, 4});
        hashMap.put("VU", new int[]{4, 1, 3, 1});
        hashMap.put("WS", new int[]{3, 2, 3, 1});
        hashMap.put("XK", new int[]{1, 2, 1, 0});
        hashMap.put("YE", new int[]{4, 4, 4, 2});
        hashMap.put("YT", new int[]{2, 0, 2, 3});
        hashMap.put("ZA", new int[]{2, 3, 2, 2});
        hashMap.put("ZM", new int[]{3, 3, 2, 1});
        hashMap.put("ZW", new int[]{3, 3, 3, 1});
        return Collections.unmodifiableMap(hashMap);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:28:0x0057, code lost:
        return;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final synchronized void Wwwwwwwwwwwwwwwwwwww() {
        /*
            r10 = this;
            monitor-enter(r10)
            boolean r0 = r10.f1064Wwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwww     // Catch:{ all -> 0x0058 }
            r1 = 0
            if (r0 == 0) goto L_0x0009
            int r0 = r10.f1053Wwwwwwwwwwwwwwwwwwwwwwwwwwwwwwww     // Catch:{ all -> 0x0058 }
            goto L_0x0013
        L_0x0009:
            android.content.Context r0 = r10.f1062Wwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwww     // Catch:{ all -> 0x0058 }
            if (r0 != 0) goto L_0x000f
            r0 = 0
            goto L_0x0013
        L_0x000f:
            int r0 = com.google.android.exoplayer2.util.C4949Wwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwww.Kkkkkkkkkkkkkkkkkkkkkkkk(r0)     // Catch:{ all -> 0x0058 }
        L_0x0013:
            int r2 = r10.f1055Wwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwww     // Catch:{ all -> 0x0058 }
            if (r2 != r0) goto L_0x0019
            monitor-exit(r10)
            return
        L_0x0019:
            r10.f1055Wwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwww = r0     // Catch:{ all -> 0x0058 }
            r2 = 1
            if (r0 == r2) goto L_0x0056
            if (r0 == 0) goto L_0x0056
            r2 = 8
            if (r0 != r2) goto L_0x0025
            goto L_0x0056
        L_0x0025:
            long r2 = r10.Wwwwwwwwwwwwwwwwwwwwwww(r0)     // Catch:{ all -> 0x0058 }
            r10.f13453Wwwwwwwwwwwwwwwwwwwwwwwwwwwwww = r2     // Catch:{ all -> 0x0058 }
            Cccc.Wwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwww r0 = r10.f1061Wwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwww     // Catch:{ all -> 0x0058 }
            long r2 = r0.Wwwwwwwwwwwwwwwwwwwwwwwwwwwwwwww()     // Catch:{ all -> 0x0058 }
            int r0 = r10.f1057Wwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwww     // Catch:{ all -> 0x0058 }
            if (r0 <= 0) goto L_0x003c
            long r0 = r10.f1058Wwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwww     // Catch:{ all -> 0x0058 }
            long r0 = r2 - r0
            int r1 = (int) r0     // Catch:{ all -> 0x0058 }
            r5 = r1
            goto L_0x003d
        L_0x003c:
            r5 = 0
        L_0x003d:
            long r6 = r10.f1056Wwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwww     // Catch:{ all -> 0x0058 }
            long r8 = r10.f13453Wwwwwwwwwwwwwwwwwwwwwwwwwwwwww     // Catch:{ all -> 0x0058 }
            r4 = r10
            r4.Wwwwwwwwwwwwwwwwwwwww(r5, r6, r8)     // Catch:{ all -> 0x0058 }
            r10.f1058Wwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwww = r2     // Catch:{ all -> 0x0058 }
            r0 = 0
            r10.f1056Wwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwww = r0     // Catch:{ all -> 0x0058 }
            r10.f1052Wwwwwwwwwwwwwwwwwwwwwwwwwwwwwww = r0     // Catch:{ all -> 0x0058 }
            r10.f1054Wwwwwwwwwwwwwwwwwwwwwwwwwwwwwwww = r0     // Catch:{ all -> 0x0058 }
            Cccc.Wwwwwwwwww r0 = r10.f1059Wwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwww     // Catch:{ all -> 0x0058 }
            r0.Wwwwwwwwwwwwwwwwwwwwwwwwww()     // Catch:{ all -> 0x0058 }
            monitor-exit(r10)
            return
        L_0x0056:
            monitor-exit(r10)
            return
        L_0x0058:
            r0 = move-exception
            monitor-exit(r10)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: Ccccc.C0972Wwwwwwwwwwwwwwwwwwww.Wwwwwwwwwwwwwwwwwwww():void");
    }

    public final void Wwwwwwwwwwwwwwwwwwwww(int i, long j, long j2) {
        if (i != 0 || j != 0 || j2 != this.f13452Wwwwwwwwwwwwwwwwwwwwwwwwwwwww) {
            this.f13452Wwwwwwwwwwwwwwwwwwwwwwwwwwwww = j2;
            this.f1060Wwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwww.Wwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwww(new C0976Wwwwwwwwwwwwwwwwwwwww(i, j, j2));
        }
    }

    public final long Wwwwwwwwwwwwwwwwwwwwwww(int i) {
        Long l = this.f1063Wwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwww.get(i);
        if (l == null) {
            l = this.f1063Wwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwww.get(0);
        }
        if (l == null) {
            l = 1000000L;
        }
        return l.longValue();
    }

    public synchronized void Wwwwwwwwwwwwwwwwwwwwwwwwwww(C0981Wwwwwwwwwwwwwwwwwwwwwwwwww wwwwwwwwwwwwwwwwwwwwwwwwww, C0978Wwwwwwwwwwwwwwwwwwwwwww wwwwwwwwwwwwwwwwwwwwwww, boolean z, int i) {
        if (z) {
            this.f1056Wwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwww += (long) i;
        }
    }

    public synchronized void Wwwwwwwwwwwwwwwwwwwwwwwwwwww(C0981Wwwwwwwwwwwwwwwwwwwwwwwwww wwwwwwwwwwwwwwwwwwwwwwwwww, C0978Wwwwwwwwwwwwwwwwwwwwwww wwwwwwwwwwwwwwwwwwwwwww, boolean z) {
        if (z) {
            C4950Wwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwww.Wwwwwwwwwwwwwwwwwwwwwwwwwwww(this.f1057Wwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwww > 0);
            long Wwwwwwwwwwwwwwwwwwwwwwwwwwwwwwww2 = this.f1061Wwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwww.Wwwwwwwwwwwwwwwwwwwwwwwwwwwwwwww();
            int i = (int) (Wwwwwwwwwwwwwwwwwwwwwwwwwwwwwwww2 - this.f1058Wwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwww);
            long j = (long) i;
            this.f1054Wwwwwwwwwwwwwwwwwwwwwwwwwwwwwwww += j;
            long j2 = this.f1052Wwwwwwwwwwwwwwwwwwwwwwwwwwwwwww;
            long j3 = this.f1056Wwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwww;
            this.f1052Wwwwwwwwwwwwwwwwwwwwwwwwwwwwwww = j2 + j3;
            if (i > 0) {
                this.f1059Wwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwww.Wwwwwwwwwwwwwwwwwwwwwwwwwwwwwwww((int) Math.sqrt((double) j3), (float) ((8000 * j3) / j));
                if (this.f1054Wwwwwwwwwwwwwwwwwwwwwwwwwwwwwwww >= 2000 || this.f1052Wwwwwwwwwwwwwwwwwwwwwwwwwwwwwww >= 524288) {
                    this.f13453Wwwwwwwwwwwwwwwwwwwwwwwwwwwwww = (long) this.f1059Wwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwww.Wwwwwwwwwwwwwwwwwwwwwwwwwwwww(0.5f);
                }
                Wwwwwwwwwwwwwwwwwwwww(i, this.f1056Wwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwww, this.f13453Wwwwwwwwwwwwwwwwwwwwwwwwwwwwww);
                this.f1058Wwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwww = Wwwwwwwwwwwwwwwwwwwwwwwwwwwwwwww2;
                this.f1056Wwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwww = 0;
            }
            this.f1057Wwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwww--;
        }
    }

    public void Wwwwwwwwwwwwwwwwwwwwwwwwwwwww(Handler handler, C0988Wwwwwwwwwwwwwwwwwwwwwwwwwwwwwww.C0989Wwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwww wwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwww) {
        this.f1060Wwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwww.Wwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwww(handler, wwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwww);
    }

    public synchronized void Wwwwwwwwwwwwwwwwwwwwwwwwwwwwww(C0981Wwwwwwwwwwwwwwwwwwwwwwwwww wwwwwwwwwwwwwwwwwwwwwwwwww, C0978Wwwwwwwwwwwwwwwwwwwwwww wwwwwwwwwwwwwwwwwwwwwww, boolean z) {
        if (z) {
            if (this.f1057Wwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwww == 0) {
                this.f1058Wwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwww = this.f1061Wwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwww.Wwwwwwwwwwwwwwwwwwwwwwwwwwwwwwww();
            }
            this.f1057Wwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwww++;
        }
    }

    public C0939Wwwww Wwwwwwwwwwwwwwwwwwwwwwwwwwwwwww() {
        return this;
    }

    public void Wwwwwwwwwwwwwwwwwwwwwwwwwwwwwwww(C0988Wwwwwwwwwwwwwwwwwwwwwwwwwwwwwww.C0989Wwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwww wwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwww) {
        this.f1060Wwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwww.Wwwwwwwwwwwwwwwwwwwwwwwwwwwwwwww(wwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwww);
    }

    public synchronized long Wwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwww() {
        return this.f13453Wwwwwwwwwwwwwwwwwwwwwwwwwwwwww;
    }

    public void Wwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwww(C0981Wwwwwwwwwwwwwwwwwwwwwwwwww wwwwwwwwwwwwwwwwwwwwwwwwww, C0978Wwwwwwwwwwwwwwwwwwwwwww wwwwwwwwwwwwwwwwwwwwwww, boolean z) {
    }

    @Deprecated
    public C0972Wwwwwwwwwwwwwwwwwwww() {
        this((Context) null, new SparseArray(), 2000, C0936Wwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwww.f13409Wwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwww, false);
    }

    public C0972Wwwwwwwwwwwwwwwwwwww(Context context, SparseArray<Long> sparseArray, int i, C0936Wwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwww wwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwww, boolean z) {
        Context context2;
        int i2;
        if (context == null) {
            context2 = null;
        } else {
            context2 = context.getApplicationContext();
        }
        this.f1062Wwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwww = context2;
        this.f1063Wwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwww = sparseArray;
        this.f1060Wwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwww = new C0925Wwwwwwwwwwwwwwwwwwwwwwwwwwww<>();
        this.f1059Wwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwww = new C0902Wwwwwwwwww(i);
        this.f1061Wwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwww = wwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwww;
        if (context == null) {
            i2 = 0;
        } else {
            i2 = C4949Wwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwww.Kkkkkkkkkkkkkkkkkkkkkkkk(context);
        }
        this.f1055Wwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwww = i2;
        this.f13453Wwwwwwwwwwwwwwwwwwwwwwwwwwwwww = Wwwwwwwwwwwwwwwwwwwwwww(i2);
        if (context != null && z) {
            C0973Wwwwwwwwwwwwwwwwwwwwwwwwwwwwwwww.Wwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwww(context).Wwwwwwwwwwwwwwwwwwwwwwwwwwwwwww(this);
        }
    }
}
