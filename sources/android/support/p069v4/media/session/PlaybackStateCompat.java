package android.support.p069v4.media.session;

import android.annotation.SuppressLint;
import android.media.session.PlaybackState;
import android.os.Build;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.SystemClock;
import android.text.TextUtils;
import java.util.ArrayList;
import java.util.List;

@SuppressLint({"BanParcelableUsage"})
/* renamed from: android.support.v4.media.session.PlaybackStateCompat */
public final class PlaybackStateCompat implements Parcelable {
    public static final Parcelable.Creator<PlaybackStateCompat> CREATOR = new C3922Wwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwww();

    /* renamed from: Wwwwwwwwwwwwwwwwwwwwwwwwwwwwww  reason: collision with root package name */
    public final long f18100Wwwwwwwwwwwwwwwwwwwwwwwwwwwwww;

    /* renamed from: Wwwwwwwwwwwwwwwwwwwwwwwwwwwwwww  reason: collision with root package name */
    public final long f18101Wwwwwwwwwwwwwwwwwwwwwwwwwwwwwww;

    /* renamed from: Wwwwwwwwwwwwwwwwwwwwwwwwwwwwwwww  reason: collision with root package name */
    public final long f18102Wwwwwwwwwwwwwwwwwwwwwwwwwwwwwwww;

    /* renamed from: Wwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwww  reason: collision with root package name */
    public final int f18103Wwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwww;

    /* renamed from: Wwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwww  reason: collision with other field name */
    public final long f5313Wwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwww;

    /* renamed from: Wwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwww  reason: collision with root package name */
    public final float f18104Wwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwww;

    /* renamed from: Wwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwww  reason: collision with other field name */
    public final int f5314Wwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwww;

    /* renamed from: Wwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwww  reason: collision with other field name */
    public final long f5315Wwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwww;

    /* renamed from: Wwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwww  reason: collision with other field name */
    public PlaybackState f5316Wwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwww;

    /* renamed from: Wwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwww  reason: collision with other field name */
    public final Bundle f5317Wwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwww;

    /* renamed from: Wwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwww  reason: collision with other field name */
    public final CharSequence f5318Wwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwww;

    /* renamed from: Wwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwww  reason: collision with other field name */
    public List<CustomAction> f5319Wwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwww;

    /* renamed from: android.support.v4.media.session.PlaybackStateCompat$Wwwwwwwwwwwwwwwwwwwwwwwwwwwwwwww */
    public static class C3920Wwwwwwwwwwwwwwwwwwwwwwwwwwwwwwww {
        public static void Wwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwww(PlaybackState.Builder builder, Bundle bundle) {
            builder.setExtras(bundle);
        }

        public static Bundle Wwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwww(PlaybackState playbackState) {
            return playbackState.getExtras();
        }
    }

    /* renamed from: android.support.v4.media.session.PlaybackStateCompat$Wwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwww */
    public static class C3921Wwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwww {
        public static void Wwwwwwwwwww(PlaybackState.Builder builder, int i, long j, float f, long j2) {
            builder.setState(i, j, f, j2);
        }

        public static void Wwwwwwwwwwww(PlaybackState.CustomAction.Builder builder, Bundle bundle) {
            builder.setExtras(bundle);
        }

        public static void Wwwwwwwwwwwww(PlaybackState.Builder builder, CharSequence charSequence) {
            builder.setErrorMessage(charSequence);
        }

        public static void Wwwwwwwwwwwwww(PlaybackState.Builder builder, long j) {
            builder.setBufferedPosition(j);
        }

        public static void Wwwwwwwwwwwwwww(PlaybackState.Builder builder, long j) {
            builder.setActiveQueueItemId(j);
        }

        public static void Wwwwwwwwwwwwwwww(PlaybackState.Builder builder, long j) {
            builder.setActions(j);
        }

        public static int Wwwwwwwwwwwwwwwww(PlaybackState playbackState) {
            return playbackState.getState();
        }

        public static long Wwwwwwwwwwwwwwwwww(PlaybackState playbackState) {
            return playbackState.getPosition();
        }

        public static float Wwwwwwwwwwwwwwwwwww(PlaybackState playbackState) {
            return playbackState.getPlaybackSpeed();
        }

        public static CharSequence Wwwwwwwwwwwwwwwwwwww(PlaybackState.CustomAction customAction) {
            return customAction.getName();
        }

        public static long Wwwwwwwwwwwwwwwwwwwww(PlaybackState playbackState) {
            return playbackState.getLastPositionUpdateTime();
        }

        public static int Wwwwwwwwwwwwwwwwwwwwww(PlaybackState.CustomAction customAction) {
            return customAction.getIcon();
        }

        public static Bundle Wwwwwwwwwwwwwwwwwwwwwww(PlaybackState.CustomAction customAction) {
            return customAction.getExtras();
        }

        public static CharSequence Wwwwwwwwwwwwwwwwwwwwwwww(PlaybackState playbackState) {
            return playbackState.getErrorMessage();
        }

        public static List<PlaybackState.CustomAction> Wwwwwwwwwwwwwwwwwwwwwwwww(PlaybackState playbackState) {
            return playbackState.getCustomActions();
        }

        public static long Wwwwwwwwwwwwwwwwwwwwwwwwww(PlaybackState playbackState) {
            return playbackState.getBufferedPosition();
        }

        public static long Wwwwwwwwwwwwwwwwwwwwwwwwwww(PlaybackState playbackState) {
            return playbackState.getActiveQueueItemId();
        }

        public static long Wwwwwwwwwwwwwwwwwwwwwwwwwwww(PlaybackState playbackState) {
            return playbackState.getActions();
        }

        public static String Wwwwwwwwwwwwwwwwwwwwwwwwwwwww(PlaybackState.CustomAction customAction) {
            return customAction.getAction();
        }

        public static PlaybackState.CustomAction.Builder Wwwwwwwwwwwwwwwwwwwwwwwwwwwwww(String str, CharSequence charSequence, int i) {
            return new PlaybackState.CustomAction.Builder(str, charSequence, i);
        }

        public static PlaybackState.Builder Wwwwwwwwwwwwwwwwwwwwwwwwwwwwwww() {
            return new PlaybackState.Builder();
        }

        public static PlaybackState Wwwwwwwwwwwwwwwwwwwwwwwwwwwwwwww(PlaybackState.Builder builder) {
            return builder.build();
        }

        public static PlaybackState.CustomAction Wwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwww(PlaybackState.CustomAction.Builder builder) {
            return builder.build();
        }

        public static void Wwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwww(PlaybackState.Builder builder, PlaybackState.CustomAction customAction) {
            builder.addCustomAction(customAction);
        }
    }

    /* renamed from: android.support.v4.media.session.PlaybackStateCompat$Wwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwww */
    public class C3922Wwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwww implements Parcelable.Creator<PlaybackStateCompat> {
        /* renamed from: Wwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwww */
        public PlaybackStateCompat[] newArray(int i) {
            return new PlaybackStateCompat[i];
        }

        /* renamed from: Wwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwww */
        public PlaybackStateCompat createFromParcel(Parcel parcel) {
            return new PlaybackStateCompat(parcel);
        }
    }

    public PlaybackStateCompat(int i, long j, long j2, float f, long j3, int i2, CharSequence charSequence, long j4, List<CustomAction> list, long j5, Bundle bundle) {
        this.f5314Wwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwww = i;
        this.f5315Wwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwww = j;
        this.f5313Wwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwww = j2;
        this.f18104Wwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwww = f;
        this.f18102Wwwwwwwwwwwwwwwwwwwwwwwwwwwwwwww = j3;
        this.f18103Wwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwww = i2;
        this.f5318Wwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwww = charSequence;
        this.f18101Wwwwwwwwwwwwwwwwwwwwwwwwwwwwwww = j4;
        this.f5319Wwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwww = new ArrayList(list);
        this.f18100Wwwwwwwwwwwwwwwwwwwwwwwwwwwwww = j5;
        this.f5317Wwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwww = bundle;
    }

    public static PlaybackStateCompat Wwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwww(Object obj) {
        ArrayList arrayList;
        Bundle bundle = null;
        if (obj == null || Build.VERSION.SDK_INT < 21) {
            return null;
        }
        PlaybackState playbackState = (PlaybackState) obj;
        List<PlaybackState.CustomAction> Wwwwwwwwwwwwwwwwwwwwwwwww2 = C3921Wwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwww.Wwwwwwwwwwwwwwwwwwwwwwwww(playbackState);
        if (Wwwwwwwwwwwwwwwwwwwwwwwww2 != null) {
            ArrayList arrayList2 = new ArrayList(Wwwwwwwwwwwwwwwwwwwwwwwww2.size());
            for (PlaybackState.CustomAction Wwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwww2 : Wwwwwwwwwwwwwwwwwwwwwwwww2) {
                arrayList2.add(CustomAction.Wwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwww(Wwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwww2));
            }
            arrayList = arrayList2;
        } else {
            arrayList = null;
        }
        if (Build.VERSION.SDK_INT >= 22) {
            bundle = C3920Wwwwwwwwwwwwwwwwwwwwwwwwwwwwwwww.Wwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwww(playbackState);
            MediaSessionCompat.Wwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwww(bundle);
        }
        PlaybackStateCompat playbackStateCompat = new PlaybackStateCompat(C3921Wwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwww.Wwwwwwwwwwwwwwwww(playbackState), C3921Wwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwww.Wwwwwwwwwwwwwwwwww(playbackState), C3921Wwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwww.Wwwwwwwwwwwwwwwwwwwwwwwwww(playbackState), C3921Wwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwww.Wwwwwwwwwwwwwwwwwww(playbackState), C3921Wwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwww.Wwwwwwwwwwwwwwwwwwwwwwwwwwww(playbackState), 0, C3921Wwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwww.Wwwwwwwwwwwwwwwwwwwwwwww(playbackState), C3921Wwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwww.Wwwwwwwwwwwwwwwwwwwww(playbackState), arrayList, C3921Wwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwww.Wwwwwwwwwwwwwwwwwwwwwwwwwww(playbackState), bundle);
        playbackStateCompat.f5316Wwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwww = playbackState;
        return playbackStateCompat;
    }

    public int Wwwwwwwwwwwwwwwwww() {
        return this.f5314Wwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwww;
    }

    public long Wwwwwwwwwwwwwwwwwwwwwww() {
        return this.f5315Wwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwww;
    }

    public Object Wwwwwwwwwwwwwwwwwwwwwwww() {
        if (this.f5316Wwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwww == null && Build.VERSION.SDK_INT >= 21) {
            PlaybackState.Builder Wwwwwwwwwwwwwwwwwwwwwwwwwwwwwww2 = C3921Wwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwww.Wwwwwwwwwwwwwwwwwwwwwwwwwwwwwww();
            C3921Wwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwww.Wwwwwwwwwww(Wwwwwwwwwwwwwwwwwwwwwwwwwwwwwww2, this.f5314Wwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwww, this.f5315Wwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwww, this.f18104Wwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwww, this.f18101Wwwwwwwwwwwwwwwwwwwwwwwwwwwwwww);
            C3921Wwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwww.Wwwwwwwwwwwwww(Wwwwwwwwwwwwwwwwwwwwwwwwwwwwwww2, this.f5313Wwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwww);
            C3921Wwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwww.Wwwwwwwwwwwwwwww(Wwwwwwwwwwwwwwwwwwwwwwwwwwwwwww2, this.f18102Wwwwwwwwwwwwwwwwwwwwwwwwwwwwwwww);
            C3921Wwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwww.Wwwwwwwwwwwww(Wwwwwwwwwwwwwwwwwwwwwwwwwwwwwww2, this.f5318Wwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwww);
            for (CustomAction Wwwwwwwwwwwwwwwwwwwwwwwwwwwwwwww2 : this.f5319Wwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwww) {
                C3921Wwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwww.Wwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwww(Wwwwwwwwwwwwwwwwwwwwwwwwwwwwwww2, (PlaybackState.CustomAction) Wwwwwwwwwwwwwwwwwwwwwwwwwwwwwwww2.Wwwwwwwwwwwwwwwwwwwwwwwwwwwwwwww());
            }
            C3921Wwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwww.Wwwwwwwwwwwwwww(Wwwwwwwwwwwwwwwwwwwwwwwwwwwwwww2, this.f18100Wwwwwwwwwwwwwwwwwwwwwwwwwwwwww);
            if (Build.VERSION.SDK_INT >= 22) {
                C3920Wwwwwwwwwwwwwwwwwwwwwwwwwwwwwwww.Wwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwww(Wwwwwwwwwwwwwwwwwwwwwwwwwwwwwww2, this.f5317Wwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwww);
            }
            this.f5316Wwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwww = C3921Wwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwww.Wwwwwwwwwwwwwwwwwwwwwwwwwwwwwwww(Wwwwwwwwwwwwwwwwwwwwwwwwwwwwwww2);
        }
        return this.f5316Wwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwww;
    }

    public float Wwwwwwwwwwwwwwwwwwwwwwwwwww() {
        return this.f18104Wwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwww;
    }

    public long Wwwwwwwwwwwwwwwwwwwwwwwwwwwwww() {
        return this.f18101Wwwwwwwwwwwwwwwwwwwwwwwwwwwwwww;
    }

    public long Wwwwwwwwwwwwwwwwwwwwwwwwwwwwwwww() {
        return this.f18102Wwwwwwwwwwwwwwwwwwwwwwwwwwwwwwww;
    }

    public int describeContents() {
        return 0;
    }

    public String toString() {
        return "PlaybackState {" + "state=" + this.f5314Wwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwww + ", position=" + this.f5315Wwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwww + ", buffered position=" + this.f5313Wwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwww + ", speed=" + this.f18104Wwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwww + ", updated=" + this.f18101Wwwwwwwwwwwwwwwwwwwwwwwwwwwwwww + ", actions=" + this.f18102Wwwwwwwwwwwwwwwwwwwwwwwwwwwwwwww + ", error code=" + this.f18103Wwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwww + ", error message=" + this.f5318Wwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwww + ", custom actions=" + this.f5319Wwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwww + ", active item id=" + this.f18100Wwwwwwwwwwwwwwwwwwwwwwwwwwwwww + "}";
    }

    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.f5314Wwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwww);
        parcel.writeLong(this.f5315Wwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwww);
        parcel.writeFloat(this.f18104Wwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwww);
        parcel.writeLong(this.f18101Wwwwwwwwwwwwwwwwwwwwwwwwwwwwwww);
        parcel.writeLong(this.f5313Wwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwww);
        parcel.writeLong(this.f18102Wwwwwwwwwwwwwwwwwwwwwwwwwwwwwwww);
        TextUtils.writeToParcel(this.f5318Wwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwww, parcel, i);
        parcel.writeTypedList(this.f5319Wwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwww);
        parcel.writeLong(this.f18100Wwwwwwwwwwwwwwwwwwwwwwwwwwwwww);
        parcel.writeBundle(this.f5317Wwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwww);
        parcel.writeInt(this.f18103Wwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwww);
    }

    /* renamed from: android.support.v4.media.session.PlaybackStateCompat$Wwwwwwwwwwwwwwwwwwwwwwwwwwwwwww */
    public static final class C3919Wwwwwwwwwwwwwwwwwwwwwwwwwwwwwww {

        /* renamed from: Wwwwwwwwwwwwwwwwwwwwwwwwwwwwww  reason: collision with root package name */
        public long f18106Wwwwwwwwwwwwwwwwwwwwwwwwwwwwww;

        /* renamed from: Wwwwwwwwwwwwwwwwwwwwwwwwwwwwwww  reason: collision with root package name */
        public long f18107Wwwwwwwwwwwwwwwwwwwwwwwwwwwwwww;

        /* renamed from: Wwwwwwwwwwwwwwwwwwwwwwwwwwwwwwww  reason: collision with root package name */
        public long f18108Wwwwwwwwwwwwwwwwwwwwwwwwwwwwwwww;

        /* renamed from: Wwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwww  reason: collision with root package name */
        public int f18109Wwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwww;

        /* renamed from: Wwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwww  reason: collision with other field name */
        public long f5324Wwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwww;

        /* renamed from: Wwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwww  reason: collision with root package name */
        public float f18110Wwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwww;

        /* renamed from: Wwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwww  reason: collision with other field name */
        public int f5325Wwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwww;

        /* renamed from: Wwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwww  reason: collision with other field name */
        public long f5326Wwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwww;

        /* renamed from: Wwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwww  reason: collision with other field name */
        public Bundle f5327Wwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwww;

        /* renamed from: Wwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwww  reason: collision with other field name */
        public CharSequence f5328Wwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwww;

        /* renamed from: Wwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwww  reason: collision with other field name */
        public final List<CustomAction> f5329Wwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwww;

        public C3919Wwwwwwwwwwwwwwwwwwwwwwwwwwwwwww() {
            this.f5329Wwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwww = new ArrayList();
            this.f18106Wwwwwwwwwwwwwwwwwwwwwwwwwwwwww = -1;
        }

        public C3919Wwwwwwwwwwwwwwwwwwwwwwwwwwwwwww Wwwwwwwwwwwwwwwwwwwwwwwwwwwwwww(int i, long j, float f, long j2) {
            this.f5325Wwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwww = i;
            this.f5326Wwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwww = j;
            this.f18107Wwwwwwwwwwwwwwwwwwwwwwwwwwwwwww = j2;
            this.f18110Wwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwww = f;
            return this;
        }

        public C3919Wwwwwwwwwwwwwwwwwwwwwwwwwwwwwww Wwwwwwwwwwwwwwwwwwwwwwwwwwwwwwww(int i, long j, float f) {
            return Wwwwwwwwwwwwwwwwwwwwwwwwwwwwwww(i, j, f, SystemClock.elapsedRealtime());
        }

        public C3919Wwwwwwwwwwwwwwwwwwwwwwwwwwwwwww Wwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwww(long j) {
            this.f18108Wwwwwwwwwwwwwwwwwwwwwwwwwwwwwwww = j;
            return this;
        }

        public PlaybackStateCompat Wwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwww() {
            return new PlaybackStateCompat(this.f5325Wwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwww, this.f5326Wwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwww, this.f5324Wwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwww, this.f18110Wwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwww, this.f18108Wwwwwwwwwwwwwwwwwwwwwwwwwwwwwwww, this.f18109Wwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwww, this.f5328Wwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwww, this.f18107Wwwwwwwwwwwwwwwwwwwwwwwwwwwwwww, this.f5329Wwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwww, this.f18106Wwwwwwwwwwwwwwwwwwwwwwwwwwwwww, this.f5327Wwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwww);
        }

        public C3919Wwwwwwwwwwwwwwwwwwwwwwwwwwwwwww(PlaybackStateCompat playbackStateCompat) {
            ArrayList arrayList = new ArrayList();
            this.f5329Wwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwww = arrayList;
            this.f18106Wwwwwwwwwwwwwwwwwwwwwwwwwwwwww = -1;
            this.f5325Wwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwww = playbackStateCompat.f5314Wwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwww;
            this.f5326Wwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwww = playbackStateCompat.f5315Wwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwww;
            this.f18110Wwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwww = playbackStateCompat.f18104Wwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwww;
            this.f18107Wwwwwwwwwwwwwwwwwwwwwwwwwwwwwww = playbackStateCompat.f18101Wwwwwwwwwwwwwwwwwwwwwwwwwwwwwww;
            this.f5324Wwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwww = playbackStateCompat.f5313Wwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwww;
            this.f18108Wwwwwwwwwwwwwwwwwwwwwwwwwwwwwwww = playbackStateCompat.f18102Wwwwwwwwwwwwwwwwwwwwwwwwwwwwwwww;
            this.f18109Wwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwww = playbackStateCompat.f18103Wwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwww;
            this.f5328Wwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwww = playbackStateCompat.f5318Wwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwww;
            List<CustomAction> list = playbackStateCompat.f5319Wwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwww;
            if (list != null) {
                arrayList.addAll(list);
            }
            this.f18106Wwwwwwwwwwwwwwwwwwwwwwwwwwwwww = playbackStateCompat.f18100Wwwwwwwwwwwwwwwwwwwwwwwwwwwwww;
            this.f5327Wwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwww = playbackStateCompat.f5317Wwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwww;
        }
    }

    /* renamed from: android.support.v4.media.session.PlaybackStateCompat$CustomAction */
    public static final class CustomAction implements Parcelable {
        public static final Parcelable.Creator<CustomAction> CREATOR = new C3918Wwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwww();

        /* renamed from: Wwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwww  reason: collision with root package name */
        public final int f18105Wwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwww;

        /* renamed from: Wwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwww  reason: collision with other field name */
        public PlaybackState.CustomAction f5320Wwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwww;

        /* renamed from: Wwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwww  reason: collision with other field name */
        public final Bundle f5321Wwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwww;

        /* renamed from: Wwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwww  reason: collision with other field name */
        public final CharSequence f5322Wwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwww;

        /* renamed from: Wwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwww  reason: collision with other field name */
        public final String f5323Wwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwww;

        /* renamed from: android.support.v4.media.session.PlaybackStateCompat$CustomAction$Wwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwww */
        public class C3918Wwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwww implements Parcelable.Creator<CustomAction> {
            /* renamed from: Wwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwww */
            public CustomAction[] newArray(int i) {
                return new CustomAction[i];
            }

            /* renamed from: Wwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwww */
            public CustomAction createFromParcel(Parcel parcel) {
                return new CustomAction(parcel);
            }
        }

        public CustomAction(String str, CharSequence charSequence, int i, Bundle bundle) {
            this.f5323Wwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwww = str;
            this.f5322Wwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwww = charSequence;
            this.f18105Wwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwww = i;
            this.f5321Wwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwww = bundle;
        }

        public static CustomAction Wwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwww(Object obj) {
            if (obj == null || Build.VERSION.SDK_INT < 21) {
                return null;
            }
            PlaybackState.CustomAction customAction = (PlaybackState.CustomAction) obj;
            Bundle Wwwwwwwwwwwwwwwwwwwwwww2 = C3921Wwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwww.Wwwwwwwwwwwwwwwwwwwwwww(customAction);
            MediaSessionCompat.Wwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwww(Wwwwwwwwwwwwwwwwwwwwwww2);
            CustomAction customAction2 = new CustomAction(C3921Wwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwww.Wwwwwwwwwwwwwwwwwwwwwwwwwwwww(customAction), C3921Wwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwww.Wwwwwwwwwwwwwwwwwwww(customAction), C3921Wwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwww.Wwwwwwwwwwwwwwwwwwwwww(customAction), Wwwwwwwwwwwwwwwwwwwwwww2);
            customAction2.f5320Wwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwww = customAction;
            return customAction2;
        }

        public Object Wwwwwwwwwwwwwwwwwwwwwwwwwwwwwwww() {
            PlaybackState.CustomAction customAction = this.f5320Wwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwww;
            if (customAction != null || Build.VERSION.SDK_INT < 21) {
                return customAction;
            }
            PlaybackState.CustomAction.Builder Wwwwwwwwwwwwwwwwwwwwwwwwwwwwww2 = C3921Wwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwww.Wwwwwwwwwwwwwwwwwwwwwwwwwwwwww(this.f5323Wwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwww, this.f5322Wwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwww, this.f18105Wwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwww);
            C3921Wwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwww.Wwwwwwwwwwww(Wwwwwwwwwwwwwwwwwwwwwwwwwwwwww2, this.f5321Wwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwww);
            return C3921Wwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwww.Wwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwww(Wwwwwwwwwwwwwwwwwwwwwwwwwwwwww2);
        }

        public int describeContents() {
            return 0;
        }

        public String toString() {
            return "Action:mName='" + this.f5322Wwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwww + ", mIcon=" + this.f18105Wwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwww + ", mExtras=" + this.f5321Wwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwww;
        }

        public void writeToParcel(Parcel parcel, int i) {
            parcel.writeString(this.f5323Wwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwww);
            TextUtils.writeToParcel(this.f5322Wwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwww, parcel, i);
            parcel.writeInt(this.f18105Wwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwww);
            parcel.writeBundle(this.f5321Wwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwww);
        }

        public CustomAction(Parcel parcel) {
            this.f5323Wwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwww = parcel.readString();
            this.f5322Wwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwww = (CharSequence) TextUtils.CHAR_SEQUENCE_CREATOR.createFromParcel(parcel);
            this.f18105Wwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwww = parcel.readInt();
            this.f5321Wwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwww = parcel.readBundle(MediaSessionCompat.class.getClassLoader());
        }
    }

    public PlaybackStateCompat(Parcel parcel) {
        this.f5314Wwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwww = parcel.readInt();
        this.f5315Wwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwww = parcel.readLong();
        this.f18104Wwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwww = parcel.readFloat();
        this.f18101Wwwwwwwwwwwwwwwwwwwwwwwwwwwwwww = parcel.readLong();
        this.f5313Wwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwww = parcel.readLong();
        this.f18102Wwwwwwwwwwwwwwwwwwwwwwwwwwwwwwww = parcel.readLong();
        this.f5318Wwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwww = (CharSequence) TextUtils.CHAR_SEQUENCE_CREATOR.createFromParcel(parcel);
        this.f5319Wwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwww = parcel.createTypedArrayList(CustomAction.CREATOR);
        this.f18100Wwwwwwwwwwwwwwwwwwwwwwwwwwwwww = parcel.readLong();
        this.f5317Wwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwww = parcel.readBundle(MediaSessionCompat.class.getClassLoader());
        this.f18103Wwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwww = parcel.readInt();
    }
}
