package Cccc;

import Wwwwwwwww.C3181Wwwwwwwwwwwwwwwwwwwwwwwwwwwwwww;
import android.text.TextUtils;
import com.google.android.exoplayer2.util.C4949Wwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwww;
import java.util.ArrayList;

/* renamed from: Cccc.Wwwwwwwwwwwwwwwwwwww */
public final class C0916Wwwwwwwwwwwwwwwwwwww {

    /* renamed from: Wwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwww  reason: collision with root package name */
    public static final ArrayList<C0917Wwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwww> f13391Wwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwww = new ArrayList<>();

    /* renamed from: Cccc.Wwwwwwwwwwwwwwwwwwww$Wwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwww */
    public static final class C0917Wwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwww {

        /* renamed from: Wwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwww  reason: collision with root package name */
        public final String f13392Wwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwww;

        /* renamed from: Wwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwww  reason: collision with root package name */
        public final int f13393Wwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwww;

        /* renamed from: Wwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwww  reason: collision with other field name */
        public final String f982Wwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwww;
    }

    public static boolean Wwwwwwwwwwwwwwwwwwwwww(String str) {
        return "video".equals(Wwwwwwwwwwwwwwwwwwwwwwwwwwwww(str));
    }

    public static boolean Wwwwwwwwwwwwwwwwwwwwwww(String str) {
        return "text".equals(Wwwwwwwwwwwwwwwwwwwwwwwwwwwww(str));
    }

    public static boolean Wwwwwwwwwwwwwwwwwwwwwwww(String str) {
        return "audio".equals(Wwwwwwwwwwwwwwwwwwwwwwwwwwwww(str));
    }

    public static String Wwwwwwwwwwwwwwwwwwwwwwwww(String str) {
        if (str == null) {
            return null;
        }
        for (String Wwwwwwwwwwwwwwwwwwwwwwwwwwwwwww2 : C4949Wwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwww.Illlllllllllllllll(str)) {
            String Wwwwwwwwwwwwwwwwwwwwwwwwwwwwwww3 = Wwwwwwwwwwwwwwwwwwwwwwwwwwwwwww(Wwwwwwwwwwwwwwwwwwwwwwwwwwwwwww2);
            if (Wwwwwwwwwwwwwwwwwwwwwwwwwwwwwww3 != null && Wwwwwwwwwwwwwwwwwwwwww(Wwwwwwwwwwwwwwwwwwwwwwwwwwwwwww3)) {
                return Wwwwwwwwwwwwwwwwwwwwwwwwwwwwwww3;
            }
        }
        return null;
    }

    public static int Wwwwwwwwwwwwwwwwwwwwwwwwww(String str) {
        return Wwwwwwwwwwwwwwwwwwwwwwwwwwww(Wwwwwwwwwwwwwwwwwwwwwwwwwwwwwww(str));
    }

    public static int Wwwwwwwwwwwwwwwwwwwwwwwwwww(String str) {
        int size = f13391Wwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwww.size();
        for (int i = 0; i < size; i++) {
            C0917Wwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwww wwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwww = f13391Wwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwww.get(i);
            if (str.equals(wwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwww.f982Wwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwww)) {
                return wwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwww.f13393Wwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwww;
            }
        }
        return -1;
    }

    public static int Wwwwwwwwwwwwwwwwwwwwwwwwwwww(String str) {
        if (TextUtils.isEmpty(str)) {
            return -1;
        }
        if (Wwwwwwwwwwwwwwwwwwwwwwww(str)) {
            return 1;
        }
        if (Wwwwwwwwwwwwwwwwwwwwww(str)) {
            return 2;
        }
        if (Wwwwwwwwwwwwwwwwwwwwwww(str) || "application/cea-608".equals(str) || "application/cea-708".equals(str) || "application/x-mp4-cea-608".equals(str) || "application/x-subrip".equals(str) || "application/ttml+xml".equals(str) || "application/x-quicktime-tx3g".equals(str) || "application/x-mp4-vtt".equals(str) || "application/x-rawcc".equals(str) || "application/vobsub".equals(str) || "application/pgs".equals(str) || "application/dvbsubs".equals(str)) {
            return 3;
        }
        if ("application/id3".equals(str) || "application/x-emsg".equals(str) || "application/x-scte35".equals(str)) {
            return 4;
        }
        if ("application/x-camera-motion".equals(str)) {
            return 5;
        }
        return Wwwwwwwwwwwwwwwwwwwwwwwwwww(str);
    }

    public static String Wwwwwwwwwwwwwwwwwwwwwwwwwwwww(String str) {
        int indexOf;
        if (str == null || (indexOf = str.indexOf(47)) == -1) {
            return null;
        }
        return str.substring(0, indexOf);
    }

    public static String Wwwwwwwwwwwwwwwwwwwwwwwwwwwwww(int i) {
        if (i == 32) {
            return "video/mp4v-es";
        }
        if (i == 33) {
            return "video/avc";
        }
        if (i == 35) {
            return "video/hevc";
        }
        if (i == 64) {
            return "audio/mp4a-latm";
        }
        if (i == 163) {
            return "video/wvc1";
        }
        if (i == 177) {
            return "video/x-vnd.on2.vp9";
        }
        if (i == 165) {
            return "audio/ac3";
        }
        if (i == 166) {
            return "audio/eac3";
        }
        switch (i) {
            case C3181Wwwwwwwwwwwwwwwwwwwwwwwwwwwwwww.f16576Illlllllllll /*96*/:
            case C3181Wwwwwwwwwwwwwwwwwwwwwwwwwwwwwww.f16575Illllllllll /*97*/:
            case C3181Wwwwwwwwwwwwwwwwwwwwwwwwwwwwwww.f16574Illlllllll /*98*/:
            case C3181Wwwwwwwwwwwwwwwwwwwwwwwwwwwwwww.f16573Illllllll /*99*/:
            case C3181Wwwwwwwwwwwwwwwwwwwwwwwwwwwwwww.f16572Illlllll /*100*/:
            case C3181Wwwwwwwwwwwwwwwwwwwwwwwwwwwwwww.f16571Illllll /*101*/:
                return "video/mpeg2";
            case C3181Wwwwwwwwwwwwwwwwwwwwwwwwwwwwwww.f16570Illlll /*102*/:
            case C3181Wwwwwwwwwwwwwwwwwwwwwwwwwwwwwww.f16569Illll /*103*/:
            case C3181Wwwwwwwwwwwwwwwwwwwwwwwwwwwwwww.f16568Illl /*104*/:
                return "audio/mp4a-latm";
            case 105:
            case C3181Wwwwwwwwwwwwwwwwwwwwwwwwwwwwwww.f14Il /*107*/:
                return "audio/mpeg";
            case C3181Wwwwwwwwwwwwwwwwwwwwwwwwwwwwwww.f16567Ill /*106*/:
                return "video/mpeg";
            default:
                switch (i) {
                    case 169:
                    case 172:
                        return "audio/vnd.dts";
                    case 170:
                    case 171:
                        return "audio/vnd.dts.hd";
                    case 173:
                        return "audio/opus";
                    case 174:
                        return "audio/ac4";
                    default:
                        return null;
                }
        }
    }

    public static String Wwwwwwwwwwwwwwwwwwwwwwwwwwwwwww(String str) {
        String str2 = null;
        if (str == null) {
            return null;
        }
        String Illlllllllllll2 = C4949Wwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwww.Illlllllllllll(str.trim());
        if (Illlllllllllll2.startsWith("avc1") || Illlllllllllll2.startsWith("avc3")) {
            return "video/avc";
        }
        if (Illlllllllllll2.startsWith("hev1") || Illlllllllllll2.startsWith("hvc1")) {
            return "video/hevc";
        }
        if (Illlllllllllll2.startsWith("dvav") || Illlllllllllll2.startsWith("dva1") || Illlllllllllll2.startsWith("dvhe") || Illlllllllllll2.startsWith("dvh1")) {
            return "video/dolby-vision";
        }
        if (Illlllllllllll2.startsWith("av01")) {
            return "video/av01";
        }
        if (Illlllllllllll2.startsWith("vp9") || Illlllllllllll2.startsWith("vp09")) {
            return "video/x-vnd.on2.vp9";
        }
        if (Illlllllllllll2.startsWith("vp8") || Illlllllllllll2.startsWith("vp08")) {
            return "video/x-vnd.on2.vp8";
        }
        if (Illlllllllllll2.startsWith("mp4a")) {
            if (Illlllllllllll2.startsWith("mp4a.")) {
                String substring = Illlllllllllll2.substring(5);
                if (substring.length() >= 2) {
                    try {
                        str2 = Wwwwwwwwwwwwwwwwwwwwwwwwwwwwww(Integer.parseInt(C4949Wwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwww.Illllllllllll(substring.substring(0, 2)), 16));
                    } catch (NumberFormatException unused) {
                    }
                }
            }
            return str2 == null ? "audio/mp4a-latm" : str2;
        } else if (Illlllllllllll2.startsWith("ac-3") || Illlllllllllll2.startsWith("dac3")) {
            return "audio/ac3";
        } else {
            if (Illlllllllllll2.startsWith("ec-3") || Illlllllllllll2.startsWith("dec3")) {
                return "audio/eac3";
            }
            if (Illlllllllllll2.startsWith("ec+3")) {
                return "audio/eac3-joc";
            }
            if (Illlllllllllll2.startsWith("ac-4") || Illlllllllllll2.startsWith("dac4")) {
                return "audio/ac4";
            }
            if (Illlllllllllll2.startsWith("dtsc") || Illlllllllllll2.startsWith("dtse")) {
                return "audio/vnd.dts";
            }
            if (Illlllllllllll2.startsWith("dtsh") || Illlllllllllll2.startsWith("dtsl")) {
                return "audio/vnd.dts.hd";
            }
            if (Illlllllllllll2.startsWith("opus")) {
                return "audio/opus";
            }
            if (Illlllllllllll2.startsWith("vorbis")) {
                return "audio/vorbis";
            }
            if (Illlllllllllll2.startsWith("flac")) {
                return "audio/flac";
            }
            return Wwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwww(Illlllllllllll2);
        }
    }

    public static int Wwwwwwwwwwwwwwwwwwwwwwwwwwwwwwww(String str) {
        str.hashCode();
        char c = 65535;
        switch (str.hashCode()) {
            case -2123537834:
                if (str.equals("audio/eac3-joc")) {
                    c = 0;
                    break;
                }
                break;
            case -1095064472:
                if (str.equals("audio/vnd.dts")) {
                    c = 1;
                    break;
                }
                break;
            case 187078296:
                if (str.equals("audio/ac3")) {
                    c = 2;
                    break;
                }
                break;
            case 187078297:
                if (str.equals("audio/ac4")) {
                    c = 3;
                    break;
                }
                break;
            case 1504578661:
                if (str.equals("audio/eac3")) {
                    c = 4;
                    break;
                }
                break;
            case 1505942594:
                if (str.equals("audio/vnd.dts.hd")) {
                    c = 5;
                    break;
                }
                break;
            case 1556697186:
                if (str.equals("audio/true-hd")) {
                    c = 6;
                    break;
                }
                break;
        }
        switch (c) {
            case 0:
                return 18;
            case 1:
                return 7;
            case 2:
                return 5;
            case 3:
                return 17;
            case 4:
                return 6;
            case 5:
                return 8;
            case 6:
                return 14;
            default:
                return 0;
        }
    }

    public static String Wwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwww(String str) {
        int size = f13391Wwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwww.size();
        for (int i = 0; i < size; i++) {
            C0917Wwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwww wwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwww = f13391Wwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwww.get(i);
            if (str.startsWith(wwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwww.f13392Wwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwww)) {
                return wwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwww.f982Wwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwww;
            }
        }
        return null;
    }

    public static String Wwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwww(String str) {
        if (str == null) {
            return null;
        }
        for (String Wwwwwwwwwwwwwwwwwwwwwwwwwwwwwww2 : C4949Wwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwww.Illlllllllllllllll(str)) {
            String Wwwwwwwwwwwwwwwwwwwwwwwwwwwwwww3 = Wwwwwwwwwwwwwwwwwwwwwwwwwwwwwww(Wwwwwwwwwwwwwwwwwwwwwwwwwwwwwww2);
            if (Wwwwwwwwwwwwwwwwwwwwwwwwwwwwwww3 != null && Wwwwwwwwwwwwwwwwwwwwwwww(Wwwwwwwwwwwwwwwwwwwwwwwwwwwwwww3)) {
                return Wwwwwwwwwwwwwwwwwwwwwwwwwwwwwww3;
            }
        }
        return null;
    }
}
