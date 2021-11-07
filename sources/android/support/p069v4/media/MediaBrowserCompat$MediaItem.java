package android.support.p069v4.media;

import android.annotation.SuppressLint;
import android.os.Parcel;
import android.os.Parcelable;

@SuppressLint({"BanParcelableUsage"})
/* renamed from: android.support.v4.media.MediaBrowserCompat$MediaItem */
public class MediaBrowserCompat$MediaItem implements Parcelable {
    public static final Parcelable.Creator<MediaBrowserCompat$MediaItem> CREATOR = new C3869Wwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwww();

    /* renamed from: Wwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwww  reason: collision with root package name */
    public final int f18047Wwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwww;

    /* renamed from: Wwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwww  reason: collision with other field name */
    public final MediaDescriptionCompat f5235Wwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwww;

    /* renamed from: android.support.v4.media.MediaBrowserCompat$MediaItem$Wwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwww */
    public class C3869Wwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwww implements Parcelable.Creator<MediaBrowserCompat$MediaItem> {
        /* renamed from: Wwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwww */
        public MediaBrowserCompat$MediaItem[] newArray(int i) {
            return new MediaBrowserCompat$MediaItem[i];
        }

        /* renamed from: Wwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwww */
        public MediaBrowserCompat$MediaItem createFromParcel(Parcel parcel) {
            return new MediaBrowserCompat$MediaItem(parcel);
        }
    }

    public MediaBrowserCompat$MediaItem(Parcel parcel) {
        this.f18047Wwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwww = parcel.readInt();
        this.f5235Wwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwww = MediaDescriptionCompat.CREATOR.createFromParcel(parcel);
    }

    public int describeContents() {
        return 0;
    }

    public String toString() {
        return "MediaItem{" + "mFlags=" + this.f18047Wwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwww + ", mDescription=" + this.f5235Wwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwww + '}';
    }

    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.f18047Wwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwww);
        this.f5235Wwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwww.writeToParcel(parcel, i);
    }
}
