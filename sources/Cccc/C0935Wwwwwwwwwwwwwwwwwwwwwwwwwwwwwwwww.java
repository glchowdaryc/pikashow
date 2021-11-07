package Cccc;

import Llllllllll.C2042Kkkkkkkkkkkkkkkkkkkkkkk;
import Wwwwwwwwwwwwwwwwwwwwwwwwwwwww.C3396Wwwwwwwwwwwwwwwwwwwwwwwww;
import android.util.Pair;
import com.google.android.exoplayer2.util.C4950Wwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwww;
import java.util.ArrayList;

/* renamed from: Cccc.Wwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwww */
public final class C0935Wwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwww {

    /* renamed from: Wwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwww  reason: collision with root package name */
    public static final int[] f13407Wwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwww = {0, 1, 2, 3, 4, 5, 6, 8, -1, -1, -1, 7, 8, -1, 8, -1};

    /* renamed from: Wwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwww  reason: collision with root package name */
    public static final byte[] f13408Wwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwww = {0, 0, 0, 1};

    /* renamed from: Wwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwww  reason: collision with other field name */
    public static final int[] f996Wwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwww = {96000, 88200, 64000, 48000, 44100, 32000, 24000, 22050, 16000, 12000, 11025, 8000, 7350};

    public static byte[][] Wwwwwwwwwwwwwwwwwwwwww(byte[] bArr) {
        if (!Wwwwwwwwwwwwwwwwwwwwwwwwwww(bArr, 0)) {
            return null;
        }
        ArrayList arrayList = new ArrayList();
        int i = 0;
        do {
            arrayList.add(Integer.valueOf(i));
            i = Wwwwwwwwwwwwwwwwwwwwwwwwwwwwww(bArr, i + f13408Wwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwww.length);
        } while (i != -1);
        byte[][] bArr2 = new byte[arrayList.size()][];
        int i2 = 0;
        while (i2 < arrayList.size()) {
            int intValue = ((Integer) arrayList.get(i2)).intValue();
            int intValue2 = (i2 < arrayList.size() + -1 ? ((Integer) arrayList.get(i2 + 1)).intValue() : bArr.length) - intValue;
            byte[] bArr3 = new byte[intValue2];
            System.arraycopy(bArr, intValue, bArr3, 0, intValue2);
            bArr2[i2] = bArr3;
            i2++;
        }
        return bArr2;
    }

    public static void Wwwwwwwwwwwwwwwwwwwwwww(C0912Wwwwwwwwwwwwwwwwww wwwwwwwwwwwwwwwwww, int i, int i2) {
        wwwwwwwwwwwwwwwwww.Wwwwwwwwwwwwwwwwwww(1);
        if (wwwwwwwwwwwwwwwwww.Wwwwwwwwwwwwwwwwwwwwwwwwwwww()) {
            wwwwwwwwwwwwwwwwww.Wwwwwwwwwwwwwwwwwww(14);
        }
        boolean Wwwwwwwwwwwwwwwwwwwwwwwwwwww2 = wwwwwwwwwwwwwwwwww.Wwwwwwwwwwwwwwwwwwwwwwwwwwww();
        if (i2 != 0) {
            if (i == 6 || i == 20) {
                wwwwwwwwwwwwwwwwww.Wwwwwwwwwwwwwwwwwww(3);
            }
            if (Wwwwwwwwwwwwwwwwwwwwwwwwwwww2) {
                if (i == 22) {
                    wwwwwwwwwwwwwwwwww.Wwwwwwwwwwwwwwwwwww(16);
                }
                if (i == 17 || i == 19 || i == 20 || i == 23) {
                    wwwwwwwwwwwwwwwwww.Wwwwwwwwwwwwwwwwwww(3);
                }
                wwwwwwwwwwwwwwwwww.Wwwwwwwwwwwwwwwwwww(1);
                return;
            }
            return;
        }
        throw new UnsupportedOperationException();
    }

    public static Pair<Integer, Integer> Wwwwwwwwwwwwwwwwwwwwwwww(byte[] bArr) {
        C0911Wwwwwwwwwwwwwwwww wwwwwwwwwwwwwwwww = new C0911Wwwwwwwwwwwwwwwww(bArr);
        wwwwwwwwwwwwwwwww.Kkkkkkkkkkkkkkkkkkk(9);
        int Wwwwwwww2 = wwwwwwwwwwwwwwwww.Wwwwwwww();
        wwwwwwwwwwwwwwwww.Kkkkkkkkkkkkkkkkkkk(20);
        return Pair.create(Integer.valueOf(wwwwwwwwwwwwwwwww.Wwww()), Integer.valueOf(Wwwwwwww2));
    }

    public static Pair<Integer, Integer> Wwwwwwwwwwwwwwwwwwwwwwwww(byte[] bArr) {
        return Wwwwwwwwwwwwwwwwwwwwwwwwww(new C0912Wwwwwwwwwwwwwwwwww(bArr), false);
    }

    public static Pair<Integer, Integer> Wwwwwwwwwwwwwwwwwwwwwwwwww(C0912Wwwwwwwwwwwwwwwwww wwwwwwwwwwwwwwwwww, boolean z) {
        int Wwwwwwwwwwwwwwwwwwwwwwwwwwwww2 = Wwwwwwwwwwwwwwwwwwwwwwwwwwwww(wwwwwwwwwwwwwwwwww);
        int Wwwwwwwwwwwwwwwwwwwwwwwwwwww2 = Wwwwwwwwwwwwwwwwwwwwwwwwwwww(wwwwwwwwwwwwwwwwww);
        int Wwwwwwwwwwwwwwwwwwwwwwwwwww2 = wwwwwwwwwwwwwwwwww.Wwwwwwwwwwwwwwwwwwwwwwwwwww(4);
        if (Wwwwwwwwwwwwwwwwwwwwwwwwwwwww2 == 5 || Wwwwwwwwwwwwwwwwwwwwwwwwwwwww2 == 29) {
            Wwwwwwwwwwwwwwwwwwwwwwwwwwww2 = Wwwwwwwwwwwwwwwwwwwwwwwwwwww(wwwwwwwwwwwwwwwwww);
            Wwwwwwwwwwwwwwwwwwwwwwwwwwwww2 = Wwwwwwwwwwwwwwwwwwwwwwwwwwwww(wwwwwwwwwwwwwwwwww);
            if (Wwwwwwwwwwwwwwwwwwwwwwwwwwwww2 == 22) {
                Wwwwwwwwwwwwwwwwwwwwwwwwwww2 = wwwwwwwwwwwwwwwwww.Wwwwwwwwwwwwwwwwwwwwwwwwwww(4);
            }
        }
        boolean z2 = true;
        if (z) {
            if (!(Wwwwwwwwwwwwwwwwwwwwwwwwwwwww2 == 1 || Wwwwwwwwwwwwwwwwwwwwwwwwwwwww2 == 2 || Wwwwwwwwwwwwwwwwwwwwwwwwwwwww2 == 3 || Wwwwwwwwwwwwwwwwwwwwwwwwwwwww2 == 4 || Wwwwwwwwwwwwwwwwwwwwwwwwwwwww2 == 6 || Wwwwwwwwwwwwwwwwwwwwwwwwwwwww2 == 7 || Wwwwwwwwwwwwwwwwwwwwwwwwwwwww2 == 17)) {
                switch (Wwwwwwwwwwwwwwwwwwwwwwwwwwwww2) {
                    case 19:
                    case 20:
                    case 21:
                    case 22:
                    case 23:
                        break;
                    default:
                        throw new C2042Kkkkkkkkkkkkkkkkkkkkkkk("Unsupported audio object type: " + Wwwwwwwwwwwwwwwwwwwwwwwwwwwww2);
                }
            }
            Wwwwwwwwwwwwwwwwwwwwwww(wwwwwwwwwwwwwwwwww, Wwwwwwwwwwwwwwwwwwwwwwwwwwwww2, Wwwwwwwwwwwwwwwwwwwwwwwwwww2);
            switch (Wwwwwwwwwwwwwwwwwwwwwwwwwwwww2) {
                case 17:
                case 19:
                case 20:
                case 21:
                case 22:
                case 23:
                    int Wwwwwwwwwwwwwwwwwwwwwwwwwww3 = wwwwwwwwwwwwwwwwww.Wwwwwwwwwwwwwwwwwwwwwwwwwww(2);
                    if (Wwwwwwwwwwwwwwwwwwwwwwwwwww3 == 2 || Wwwwwwwwwwwwwwwwwwwwwwwwwww3 == 3) {
                        throw new C2042Kkkkkkkkkkkkkkkkkkkkkkk("Unsupported epConfig: " + Wwwwwwwwwwwwwwwwwwwwwwwwwww3);
                    }
            }
        }
        int i = f13407Wwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwww[Wwwwwwwwwwwwwwwwwwwwwwwwwww2];
        if (i == -1) {
            z2 = false;
        }
        C4950Wwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwww.Wwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwww(z2);
        return Pair.create(Integer.valueOf(Wwwwwwwwwwwwwwwwwwwwwwwwwwww2), Integer.valueOf(i));
    }

    public static boolean Wwwwwwwwwwwwwwwwwwwwwwwwwww(byte[] bArr, int i) {
        if (bArr.length - i <= f13408Wwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwww.length) {
            return false;
        }
        int i2 = 0;
        while (true) {
            byte[] bArr2 = f13408Wwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwww;
            if (i2 >= bArr2.length) {
                return true;
            }
            if (bArr[i + i2] != bArr2[i2]) {
                return false;
            }
            i2++;
        }
    }

    public static int Wwwwwwwwwwwwwwwwwwwwwwwwwwww(C0912Wwwwwwwwwwwwwwwwww wwwwwwwwwwwwwwwwww) {
        int Wwwwwwwwwwwwwwwwwwwwwwwwwww2 = wwwwwwwwwwwwwwwwww.Wwwwwwwwwwwwwwwwwwwwwwwwwww(4);
        if (Wwwwwwwwwwwwwwwwwwwwwwwwwww2 == 15) {
            return wwwwwwwwwwwwwwwwww.Wwwwwwwwwwwwwwwwwwwwwwwwwww(24);
        }
        C4950Wwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwww.Wwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwww(Wwwwwwwwwwwwwwwwwwwwwwwwwww2 < 13);
        return f996Wwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwww[Wwwwwwwwwwwwwwwwwwwwwwwwwww2];
    }

    public static int Wwwwwwwwwwwwwwwwwwwwwwwwwwwww(C0912Wwwwwwwwwwwwwwwwww wwwwwwwwwwwwwwwwww) {
        int Wwwwwwwwwwwwwwwwwwwwwwwwwww2 = wwwwwwwwwwwwwwwwww.Wwwwwwwwwwwwwwwwwwwwwwwwwww(5);
        return Wwwwwwwwwwwwwwwwwwwwwwwwwww2 == 31 ? wwwwwwwwwwwwwwwwww.Wwwwwwwwwwwwwwwwwwwwwwwwwww(6) + 32 : Wwwwwwwwwwwwwwwwwwwwwwwwwww2;
    }

    public static int Wwwwwwwwwwwwwwwwwwwwwwwwwwwwww(byte[] bArr, int i) {
        int length = bArr.length - f13408Wwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwww.length;
        while (i <= length) {
            if (Wwwwwwwwwwwwwwwwwwwwwwwwwww(bArr, i)) {
                return i;
            }
            i++;
        }
        return -1;
    }

    public static byte[] Wwwwwwwwwwwwwwwwwwwwwwwwwwwwwww(byte[] bArr, int i, int i2) {
        byte[] bArr2 = f13408Wwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwww;
        byte[] bArr3 = new byte[(bArr2.length + i2)];
        System.arraycopy(bArr2, 0, bArr3, 0, bArr2.length);
        System.arraycopy(bArr, i, bArr3, bArr2.length, i2);
        return bArr3;
    }

    public static String Wwwwwwwwwwwwwwwwwwwwwwwwwwwwwwww(int i, int i2, int i3) {
        return String.format("avc1.%02X%02X%02X", new Object[]{Integer.valueOf(i), Integer.valueOf(i2), Integer.valueOf(i3)});
    }

    public static byte[] Wwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwww(int i, int i2) {
        int i3 = 0;
        int i4 = 0;
        int i5 = -1;
        while (true) {
            int[] iArr = f996Wwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwww;
            if (i4 >= iArr.length) {
                break;
            }
            if (i == iArr[i4]) {
                i5 = i4;
            }
            i4++;
        }
        int i6 = -1;
        while (true) {
            int[] iArr2 = f13407Wwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwww;
            if (i3 >= iArr2.length) {
                break;
            }
            if (i2 == iArr2[i3]) {
                i6 = i3;
            }
            i3++;
        }
        if (i != -1 && i6 != -1) {
            return Wwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwww(2, i5, i6);
        }
        throw new IllegalArgumentException("Invalid sample rate or number of channels: " + i + ", " + i2);
    }

    public static byte[] Wwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwww(int i, int i2, int i3) {
        return new byte[]{(byte) (((i << 3) & 248) | ((i2 >> 1) & 7)), (byte) (((i2 << 7) & 128) | ((i3 << 3) & C3396Wwwwwwwwwwwwwwwwwwwwwwwww.f17178Illlllllllllllll))};
    }
}
