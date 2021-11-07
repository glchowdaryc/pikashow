package Ccc;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.exoplayer2.util.C4949Wwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwww;
import java.util.Arrays;

/* renamed from: Ccc.Wwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwww */
public final class C0890Wwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwww implements Parcelable {
    public static final Parcelable.Creator<C0890Wwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwww> CREATOR = new C0891Wwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwww();

    /* renamed from: Wwwwwwwwwwwwwwwwwwwwwwwwwwwwwww  reason: collision with root package name */
    public int f13345Wwwwwwwwwwwwwwwwwwwwwwwwwwwwwww;

    /* renamed from: Wwwwwwwwwwwwwwwwwwwwwwwwwwwwwwww  reason: collision with root package name */
    public final int f13346Wwwwwwwwwwwwwwwwwwwwwwwwwwwwwwww;

    /* renamed from: Wwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwww  reason: collision with root package name */
    public final int f13347Wwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwww;

    /* renamed from: Wwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwww  reason: collision with root package name */
    public final int f13348Wwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwww;

    /* renamed from: Wwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwww  reason: collision with other field name */
    public final byte[] f956Wwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwww;

    /* renamed from: Ccc.Wwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwww$Wwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwww */
    public static class C0891Wwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwww implements Parcelable.Creator<C0890Wwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwww> {
        /* renamed from: Wwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwww */
        public C0890Wwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwww[] newArray(int i) {
            return new C0890Wwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwww[i];
        }

        /* renamed from: Wwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwww */
        public C0890Wwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwww createFromParcel(Parcel parcel) {
            return new C0890Wwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwww(parcel);
        }
    }

    public C0890Wwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwww(int i, int i2, int i3, byte[] bArr) {
        this.f13348Wwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwww = i;
        this.f13347Wwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwww = i2;
        this.f13346Wwwwwwwwwwwwwwwwwwwwwwwwwwwwwwww = i3;
        this.f956Wwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwww = bArr;
    }

    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || C0890Wwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwww.class != obj.getClass()) {
            return false;
        }
        C0890Wwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwww wwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwww = (C0890Wwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwww) obj;
        if (this.f13348Wwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwww == wwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwww.f13348Wwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwww && this.f13347Wwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwww == wwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwww.f13347Wwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwww && this.f13346Wwwwwwwwwwwwwwwwwwwwwwwwwwwwwwww == wwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwww.f13346Wwwwwwwwwwwwwwwwwwwwwwwwwwwwwwww && Arrays.equals(this.f956Wwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwww, wwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwww.f956Wwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwww)) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        if (this.f13345Wwwwwwwwwwwwwwwwwwwwwwwwwwwwwww == 0) {
            this.f13345Wwwwwwwwwwwwwwwwwwwwwwwwwwwwwww = ((((((527 + this.f13348Wwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwww) * 31) + this.f13347Wwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwww) * 31) + this.f13346Wwwwwwwwwwwwwwwwwwwwwwwwwwwwwwww) * 31) + Arrays.hashCode(this.f956Wwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwww);
        }
        return this.f13345Wwwwwwwwwwwwwwwwwwwwwwwwwwwwwww;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("ColorInfo(");
        sb.append(this.f13348Wwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwww);
        sb.append(", ");
        sb.append(this.f13347Wwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwww);
        sb.append(", ");
        sb.append(this.f13346Wwwwwwwwwwwwwwwwwwwwwwwwwwwwwwww);
        sb.append(", ");
        sb.append(this.f956Wwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwww != null);
        sb.append(")");
        return sb.toString();
    }

    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.f13348Wwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwww);
        parcel.writeInt(this.f13347Wwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwww);
        parcel.writeInt(this.f13346Wwwwwwwwwwwwwwwwwwwwwwwwwwwwwwww);
        C4949Wwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwww.Illlllllllll(parcel, this.f956Wwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwww != null);
        byte[] bArr = this.f956Wwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwww;
        if (bArr != null) {
            parcel.writeByteArray(bArr);
        }
    }

    public C0890Wwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwww(Parcel parcel) {
        this.f13348Wwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwww = parcel.readInt();
        this.f13347Wwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwww = parcel.readInt();
        this.f13346Wwwwwwwwwwwwwwwwwwwwwwwwwwwwwwww = parcel.readInt();
        this.f956Wwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwww = C4949Wwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwww.Illlllllllllllllllllllllll(parcel) ? parcel.createByteArray() : null;
    }
}
