package android.support.p069v4.media.session;

import android.annotation.SuppressLint;
import android.os.Parcel;
import android.os.Parcelable;

@SuppressLint({"BanParcelableUsage"})
/* renamed from: android.support.v4.media.session.ParcelableVolumeInfo */
public class ParcelableVolumeInfo implements Parcelable {
    public static final Parcelable.Creator<ParcelableVolumeInfo> CREATOR = new C3917Wwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwww();

    /* renamed from: Wwwwwwwwwwwwwwwwwwwwwwwwwwwwww  reason: collision with root package name */
    public int f18095Wwwwwwwwwwwwwwwwwwwwwwwwwwwwww;

    /* renamed from: Wwwwwwwwwwwwwwwwwwwwwwwwwwwwwww  reason: collision with root package name */
    public int f18096Wwwwwwwwwwwwwwwwwwwwwwwwwwwwwww;

    /* renamed from: Wwwwwwwwwwwwwwwwwwwwwwwwwwwwwwww  reason: collision with root package name */
    public int f18097Wwwwwwwwwwwwwwwwwwwwwwwwwwwwwwww;

    /* renamed from: Wwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwww  reason: collision with root package name */
    public int f18098Wwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwww;

    /* renamed from: Wwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwww  reason: collision with root package name */
    public int f18099Wwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwww;

    /* renamed from: android.support.v4.media.session.ParcelableVolumeInfo$Wwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwww */
    public class C3917Wwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwww implements Parcelable.Creator<ParcelableVolumeInfo> {
        /* renamed from: Wwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwww */
        public ParcelableVolumeInfo[] newArray(int i) {
            return new ParcelableVolumeInfo[i];
        }

        /* renamed from: Wwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwww */
        public ParcelableVolumeInfo createFromParcel(Parcel parcel) {
            return new ParcelableVolumeInfo(parcel);
        }
    }

    public ParcelableVolumeInfo(int i, int i2, int i3, int i4, int i5) {
        this.f18099Wwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwww = i;
        this.f18098Wwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwww = i2;
        this.f18097Wwwwwwwwwwwwwwwwwwwwwwwwwwwwwwww = i3;
        this.f18096Wwwwwwwwwwwwwwwwwwwwwwwwwwwwwww = i4;
        this.f18095Wwwwwwwwwwwwwwwwwwwwwwwwwwwwww = i5;
    }

    public int describeContents() {
        return 0;
    }

    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.f18099Wwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwww);
        parcel.writeInt(this.f18097Wwwwwwwwwwwwwwwwwwwwwwwwwwwwwwww);
        parcel.writeInt(this.f18096Wwwwwwwwwwwwwwwwwwwwwwwwwwwwwww);
        parcel.writeInt(this.f18095Wwwwwwwwwwwwwwwwwwwwwwwwwwwwww);
        parcel.writeInt(this.f18098Wwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwww);
    }

    public ParcelableVolumeInfo(Parcel parcel) {
        this.f18099Wwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwww = parcel.readInt();
        this.f18097Wwwwwwwwwwwwwwwwwwwwwwwwwwwwwwww = parcel.readInt();
        this.f18096Wwwwwwwwwwwwwwwwwwwwwwwwwwwwwww = parcel.readInt();
        this.f18095Wwwwwwwwwwwwwwwwwwwwwwwwwwwwww = parcel.readInt();
        this.f18098Wwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwww = parcel.readInt();
    }
}
