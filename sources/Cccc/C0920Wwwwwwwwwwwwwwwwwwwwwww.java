package Cccc;

import android.text.TextUtils;
import android.util.Log;

/* renamed from: Cccc.Wwwwwwwwwwwwwwwwwwwwwww */
public final class C0920Wwwwwwwwwwwwwwwwwwwwwww {

    /* renamed from: Wwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwww  reason: collision with root package name */
    public static int f13395Wwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwww = 0;

    /* renamed from: Wwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwww  reason: collision with other field name */
    public static boolean f984Wwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwww = true;

    public static void Wwwwwwwwwwwwwwwwwwwwwwwwwwww(String str, String str2, Throwable th) {
        if (!f984Wwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwww) {
            Wwwwwwwwwwwwwwwwwwwwwwwwwwwww(str, Wwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwww(str2, th));
        } else if (f13395Wwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwww <= 2) {
            Log.w(str, str2, th);
        }
    }

    public static void Wwwwwwwwwwwwwwwwwwwwwwwwwwwww(String str, String str2) {
        if (f13395Wwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwww <= 2) {
            Log.w(str, str2);
        }
    }

    public static void Wwwwwwwwwwwwwwwwwwwwwwwwwwwwww(String str, String str2) {
        if (f13395Wwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwww <= 1) {
            Log.i(str, str2);
        }
    }

    public static void Wwwwwwwwwwwwwwwwwwwwwwwwwwwwwww(String str, String str2, Throwable th) {
        if (!f984Wwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwww) {
            Wwwwwwwwwwwwwwwwwwwwwwwwwwwwwwww(str, Wwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwww(str2, th));
        } else if (f13395Wwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwww <= 3) {
            Log.e(str, str2, th);
        }
    }

    public static void Wwwwwwwwwwwwwwwwwwwwwwwwwwwwwwww(String str, String str2) {
        if (f13395Wwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwww <= 3) {
            Log.e(str, str2);
        }
    }

    public static void Wwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwww(String str, String str2) {
        if (f13395Wwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwww == 0) {
            Log.d(str, str2);
        }
    }

    public static String Wwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwww(String str, Throwable th) {
        if (th == null) {
            return str;
        }
        String message = th.getMessage();
        if (TextUtils.isEmpty(message)) {
            return str;
        }
        return str + " - " + message;
    }
}
