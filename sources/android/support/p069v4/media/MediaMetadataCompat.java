package android.support.p069v4.media;

import Wwwwwwwwwwwwwww.C3255Wwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwww;
import android.annotation.SuppressLint;
import android.graphics.Bitmap;
import android.media.MediaMetadata;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.support.p069v4.media.MediaDescriptionCompat;
import android.support.p069v4.media.session.MediaSessionCompat;
import android.text.TextUtils;
import android.util.Log;

@SuppressLint({"BanParcelableUsage"})
/* renamed from: android.support.v4.media.MediaMetadataCompat */
public final class MediaMetadataCompat implements Parcelable {
    public static final Parcelable.Creator<MediaMetadataCompat> CREATOR = new C3875Wwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwww();

    /* renamed from: Wwwwwwwwwwwwwwwwwwwwwwwwwwwwwwww  reason: collision with root package name */
    public static final String[] f18054Wwwwwwwwwwwwwwwwwwwwwwwwwwwwwwww = {"android.media.metadata.DISPLAY_ICON_URI", "android.media.metadata.ART_URI", "android.media.metadata.ALBUM_ART_URI"};

    /* renamed from: Wwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwww  reason: collision with root package name */
    public static final String[] f18055Wwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwww = {"android.media.metadata.DISPLAY_ICON", "android.media.metadata.ART", "android.media.metadata.ALBUM_ART"};

    /* renamed from: Wwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwww  reason: collision with root package name */
    public static final C3255Wwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwww<String, Integer> f18056Wwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwww;

    /* renamed from: Wwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwww  reason: collision with other field name */
    public static final String[] f5247Wwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwww = {"android.media.metadata.TITLE", "android.media.metadata.ARTIST", "android.media.metadata.ALBUM", "android.media.metadata.ALBUM_ARTIST", "android.media.metadata.WRITER", "android.media.metadata.AUTHOR", "android.media.metadata.COMPOSER"};

    /* renamed from: Wwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwww  reason: collision with other field name */
    public MediaMetadata f5248Wwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwww;

    /* renamed from: Wwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwww  reason: collision with other field name */
    public final Bundle f5249Wwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwww;

    /* renamed from: Wwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwww  reason: collision with other field name */
    public MediaDescriptionCompat f5250Wwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwww;

    /* renamed from: android.support.v4.media.MediaMetadataCompat$Wwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwww */
    public class C3875Wwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwww implements Parcelable.Creator<MediaMetadataCompat> {
        /* renamed from: Wwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwww */
        public MediaMetadataCompat[] newArray(int i) {
            return new MediaMetadataCompat[i];
        }

        /* renamed from: Wwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwww */
        public MediaMetadataCompat createFromParcel(Parcel parcel) {
            return new MediaMetadataCompat(parcel);
        }
    }

    static {
        C3255Wwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwww<String, Integer> wwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwww = new C3255Wwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwww<>();
        f18056Wwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwww = wwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwww;
        wwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwww.put("android.media.metadata.TITLE", 1);
        wwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwww.put("android.media.metadata.ARTIST", 1);
        wwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwww.put("android.media.metadata.DURATION", 0);
        wwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwww.put("android.media.metadata.ALBUM", 1);
        wwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwww.put("android.media.metadata.AUTHOR", 1);
        wwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwww.put("android.media.metadata.WRITER", 1);
        wwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwww.put("android.media.metadata.COMPOSER", 1);
        wwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwww.put("android.media.metadata.COMPILATION", 1);
        wwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwww.put("android.media.metadata.DATE", 1);
        wwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwww.put("android.media.metadata.YEAR", 0);
        wwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwww.put("android.media.metadata.GENRE", 1);
        wwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwww.put("android.media.metadata.TRACK_NUMBER", 0);
        wwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwww.put("android.media.metadata.NUM_TRACKS", 0);
        wwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwww.put("android.media.metadata.DISC_NUMBER", 0);
        wwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwww.put("android.media.metadata.ALBUM_ARTIST", 1);
        wwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwww.put("android.media.metadata.ART", 2);
        wwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwww.put("android.media.metadata.ART_URI", 1);
        wwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwww.put("android.media.metadata.ALBUM_ART", 2);
        wwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwww.put("android.media.metadata.ALBUM_ART_URI", 1);
        wwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwww.put("android.media.metadata.USER_RATING", 3);
        wwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwww.put("android.media.metadata.RATING", 3);
        wwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwww.put("android.media.metadata.DISPLAY_TITLE", 1);
        wwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwww.put("android.media.metadata.DISPLAY_SUBTITLE", 1);
        wwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwww.put("android.media.metadata.DISPLAY_DESCRIPTION", 1);
        wwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwww.put("android.media.metadata.DISPLAY_ICON", 2);
        wwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwww.put("android.media.metadata.DISPLAY_ICON_URI", 1);
        wwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwww.put("android.media.metadata.MEDIA_ID", 1);
        wwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwww.put("android.media.metadata.BT_FOLDER_TYPE", 0);
        wwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwww.put("android.media.metadata.MEDIA_URI", 1);
        wwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwww.put("android.media.metadata.ADVERTISEMENT", 0);
        wwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwww.put("android.media.metadata.DOWNLOAD_STATUS", 0);
    }

    public MediaMetadataCompat(Bundle bundle) {
        Bundle bundle2 = new Bundle(bundle);
        this.f5249Wwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwww = bundle2;
        MediaSessionCompat.Wwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwww(bundle2);
    }

    public static MediaMetadataCompat Wwwwwwwwwwwwwwwwwwwwwwwwwwwwwwww(Object obj) {
        if (obj == null || Build.VERSION.SDK_INT < 21) {
            return null;
        }
        Parcel obtain = Parcel.obtain();
        MediaMetadata mediaMetadata = (MediaMetadata) obj;
        mediaMetadata.writeToParcel(obtain, 0);
        obtain.setDataPosition(0);
        MediaMetadataCompat createFromParcel = CREATOR.createFromParcel(obtain);
        obtain.recycle();
        createFromParcel.f5248Wwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwww = mediaMetadata;
        return createFromParcel;
    }

    public CharSequence Wwwwwwwwwwwww(String str) {
        return this.f5249Wwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwww.getCharSequence(str);
    }

    public String Wwwwwwwwwwwwwwwww(String str) {
        CharSequence charSequence = this.f5249Wwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwww.getCharSequence(str);
        if (charSequence != null) {
            return charSequence.toString();
        }
        return null;
    }

    public Object Wwwwwwwwwwwwwwwwww() {
        if (this.f5248Wwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwww == null && Build.VERSION.SDK_INT >= 21) {
            Parcel obtain = Parcel.obtain();
            writeToParcel(obtain, 0);
            obtain.setDataPosition(0);
            this.f5248Wwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwww = (MediaMetadata) MediaMetadata.CREATOR.createFromParcel(obtain);
            obtain.recycle();
        }
        return this.f5248Wwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwww;
    }

    public long Wwwwwwwwwwwwwwwwwwwwwww(String str) {
        return this.f5249Wwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwww.getLong(str, 0);
    }

    public MediaDescriptionCompat Wwwwwwwwwwwwwwwwwwwwwwww() {
        Uri uri;
        Bitmap bitmap;
        Uri uri2;
        MediaDescriptionCompat mediaDescriptionCompat = this.f5250Wwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwww;
        if (mediaDescriptionCompat != null) {
            return mediaDescriptionCompat;
        }
        String Wwwwwwwwwwwwwwwww2 = Wwwwwwwwwwwwwwwww("android.media.metadata.MEDIA_ID");
        CharSequence[] charSequenceArr = new CharSequence[3];
        CharSequence Wwwwwwwwwwwww2 = Wwwwwwwwwwwww("android.media.metadata.DISPLAY_TITLE");
        if (TextUtils.isEmpty(Wwwwwwwwwwwww2)) {
            int i = 0;
            int i2 = 0;
            while (i < 3) {
                String[] strArr = f5247Wwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwww;
                if (i2 >= strArr.length) {
                    break;
                }
                int i3 = i2 + 1;
                CharSequence Wwwwwwwwwwwww3 = Wwwwwwwwwwwww(strArr[i2]);
                if (!TextUtils.isEmpty(Wwwwwwwwwwwww3)) {
                    charSequenceArr[i] = Wwwwwwwwwwwww3;
                    i++;
                }
                i2 = i3;
            }
        } else {
            charSequenceArr[0] = Wwwwwwwwwwwww2;
            charSequenceArr[1] = Wwwwwwwwwwwww("android.media.metadata.DISPLAY_SUBTITLE");
            charSequenceArr[2] = Wwwwwwwwwwwww("android.media.metadata.DISPLAY_DESCRIPTION");
        }
        int i4 = 0;
        while (true) {
            String[] strArr2 = f18055Wwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwww;
            uri = null;
            if (i4 >= strArr2.length) {
                bitmap = null;
                break;
            }
            bitmap = Wwwwwwwwwwwwwwwwwwwwwwwwwwwwww(strArr2[i4]);
            if (bitmap != null) {
                break;
            }
            i4++;
        }
        int i5 = 0;
        while (true) {
            String[] strArr3 = f18054Wwwwwwwwwwwwwwwwwwwwwwwwwwwwwwww;
            if (i5 >= strArr3.length) {
                uri2 = null;
                break;
            }
            String Wwwwwwwwwwwwwwwww3 = Wwwwwwwwwwwwwwwww(strArr3[i5]);
            if (!TextUtils.isEmpty(Wwwwwwwwwwwwwwwww3)) {
                uri2 = Uri.parse(Wwwwwwwwwwwwwwwww3);
                break;
            }
            i5++;
        }
        String Wwwwwwwwwwwwwwwww4 = Wwwwwwwwwwwwwwwww("android.media.metadata.MEDIA_URI");
        if (!TextUtils.isEmpty(Wwwwwwwwwwwwwwwww4)) {
            uri = Uri.parse(Wwwwwwwwwwwwwwwww4);
        }
        MediaDescriptionCompat.C3870Wwwwwwwwwwwwwwwwwwwwwwwwwwwwwww wwwwwwwwwwwwwwwwwwwwwwwwwwwwwww = new MediaDescriptionCompat.C3870Wwwwwwwwwwwwwwwwwwwwwwwwwwwwwww();
        wwwwwwwwwwwwwwwwwwwwwwwwwwwwwww.Wwwwwwwwwwwwwwwwwwwwwwwwwwwww(Wwwwwwwwwwwwwwwww2);
        wwwwwwwwwwwwwwwwwwwwwwwwwwwwwww.Wwwwwwwwwwwwwwwwwwwwwwwwww(charSequenceArr[0]);
        wwwwwwwwwwwwwwwwwwwwwwwwwwwwwww.Wwwwwwwwwwwwwwwwwwwwwwwwwww(charSequenceArr[1]);
        wwwwwwwwwwwwwwwwwwwwwwwwwwwwwww.Wwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwww(charSequenceArr[2]);
        wwwwwwwwwwwwwwwwwwwwwwwwwwwwwww.Wwwwwwwwwwwwwwwwwwwwwwwwwwwwwww(bitmap);
        wwwwwwwwwwwwwwwwwwwwwwwwwwwwwww.Wwwwwwwwwwwwwwwwwwwwwwwwwwwwww(uri2);
        wwwwwwwwwwwwwwwwwwwwwwwwwwwwwww.Wwwwwwwwwwwwwwwwwwwwwwwwwwww(uri);
        Bundle bundle = new Bundle();
        if (this.f5249Wwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwww.containsKey("android.media.metadata.BT_FOLDER_TYPE")) {
            bundle.putLong("android.media.extra.BT_FOLDER_TYPE", Wwwwwwwwwwwwwwwwwwwwwww("android.media.metadata.BT_FOLDER_TYPE"));
        }
        if (this.f5249Wwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwww.containsKey("android.media.metadata.DOWNLOAD_STATUS")) {
            bundle.putLong("android.media.extra.DOWNLOAD_STATUS", Wwwwwwwwwwwwwwwwwwwwwww("android.media.metadata.DOWNLOAD_STATUS"));
        }
        if (!bundle.isEmpty()) {
            wwwwwwwwwwwwwwwwwwwwwwwwwwwwwww.Wwwwwwwwwwwwwwwwwwwwwwwwwwwwwwww(bundle);
        }
        MediaDescriptionCompat Wwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwww2 = wwwwwwwwwwwwwwwwwwwwwwwwwwwwwww.Wwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwww();
        this.f5250Wwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwww = Wwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwww2;
        return Wwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwww2;
    }

    public Bundle Wwwwwwwwwwwwwwwwwwwwwwwwwww() {
        return new Bundle(this.f5249Wwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwww);
    }

    public Bitmap Wwwwwwwwwwwwwwwwwwwwwwwwwwwwww(String str) {
        try {
            return (Bitmap) this.f5249Wwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwww.getParcelable(str);
        } catch (Exception e) {
            Log.w("MediaMetadata", "Failed to retrieve a key as Bitmap.", e);
            return null;
        }
    }

    public boolean Wwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwww(String str) {
        return this.f5249Wwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwww.containsKey(str);
    }

    public int describeContents() {
        return 0;
    }

    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeBundle(this.f5249Wwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwww);
    }

    /* renamed from: android.support.v4.media.MediaMetadataCompat$Wwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwww */
    public static final class C3874Wwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwww {

        /* renamed from: Wwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwww  reason: collision with root package name */
        public final Bundle f18057Wwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwww;

        public C3874Wwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwww() {
            this.f18057Wwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwww = new Bundle();
        }

        public final Bitmap Wwwwwwwwwwwwwwwwwwwwwwwwwwwwww(Bitmap bitmap, int i) {
            float f = (float) i;
            float min = Math.min(f / ((float) bitmap.getWidth()), f / ((float) bitmap.getHeight()));
            return Bitmap.createScaledBitmap(bitmap, (int) (((float) bitmap.getWidth()) * min), (int) (((float) bitmap.getHeight()) * min), true);
        }

        public C3874Wwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwww Wwwwwwwwwwwwwwwwwwwwwwwwwwwwwww(String str, String str2) {
            C3255Wwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwww<String, Integer> wwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwww = MediaMetadataCompat.f18056Wwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwww;
            if (!wwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwww.containsKey(str) || wwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwww.get(str).intValue() == 1) {
                this.f18057Wwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwww.putCharSequence(str, str2);
                return this;
            }
            throw new IllegalArgumentException("The " + str + " key cannot be used to put a String");
        }

        public C3874Wwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwww Wwwwwwwwwwwwwwwwwwwwwwwwwwwwwwww(String str, long j) {
            C3255Wwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwww<String, Integer> wwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwww = MediaMetadataCompat.f18056Wwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwww;
            if (!wwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwww.containsKey(str) || wwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwww.get(str).intValue() == 0) {
                this.f18057Wwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwww.putLong(str, j);
                return this;
            }
            throw new IllegalArgumentException("The " + str + " key cannot be used to put a long");
        }

        public C3874Wwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwww Wwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwww(String str, Bitmap bitmap) {
            C3255Wwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwww<String, Integer> wwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwww = MediaMetadataCompat.f18056Wwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwww;
            if (!wwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwww.containsKey(str) || wwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwww.get(str).intValue() == 2) {
                this.f18057Wwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwww.putParcelable(str, bitmap);
                return this;
            }
            throw new IllegalArgumentException("The " + str + " key cannot be used to put a Bitmap");
        }

        public MediaMetadataCompat Wwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwww() {
            return new MediaMetadataCompat(this.f18057Wwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwww);
        }

        public C3874Wwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwww(MediaMetadataCompat mediaMetadataCompat) {
            Bundle bundle = new Bundle(mediaMetadataCompat.f5249Wwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwww);
            this.f18057Wwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwww = bundle;
            MediaSessionCompat.Wwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwww(bundle);
        }

        public C3874Wwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwww(MediaMetadataCompat mediaMetadataCompat, int i) {
            this(mediaMetadataCompat);
            for (String str : this.f18057Wwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwww.keySet()) {
                Object obj = this.f18057Wwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwww.get(str);
                if (obj instanceof Bitmap) {
                    Bitmap bitmap = (Bitmap) obj;
                    if (bitmap.getHeight() > i || bitmap.getWidth() > i) {
                        Wwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwww(str, Wwwwwwwwwwwwwwwwwwwwwwwwwwwwww(bitmap, i));
                    }
                }
            }
        }
    }

    public MediaMetadataCompat(Parcel parcel) {
        this.f5249Wwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwww = parcel.readBundle(MediaSessionCompat.class.getClassLoader());
    }
}
