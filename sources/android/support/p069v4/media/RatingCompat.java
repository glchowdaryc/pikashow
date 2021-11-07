package android.support.p069v4.media;

import android.annotation.SuppressLint;
import android.media.Rating;
import android.os.Build;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.Log;

@SuppressLint({"BanParcelableUsage"})
/* renamed from: android.support.v4.media.RatingCompat */
public final class RatingCompat implements Parcelable {
    public static final Parcelable.Creator<RatingCompat> CREATOR = new C3877Wwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwww();

    /* renamed from: Wwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwww  reason: collision with root package name */
    public final float f18058Wwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwww;

    /* renamed from: Wwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwww  reason: collision with other field name */
    public final int f5251Wwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwww;

    /* renamed from: Wwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwww  reason: collision with other field name */
    public Object f5252Wwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwww;

    /* renamed from: android.support.v4.media.RatingCompat$Wwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwww */
    public static class C3876Wwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwww {
        public static Rating Wwwwwwwwwwwwwwwwwwwwwwww(int i) {
            return Rating.newUnratedRating(i);
        }

        public static Rating Wwwwwwwwwwwwwwwwwwwwwwwww(boolean z) {
            return Rating.newThumbRating(z);
        }

        public static Rating Wwwwwwwwwwwwwwwwwwwwwwwwww(int i, float f) {
            return Rating.newStarRating(i, f);
        }

        public static Rating Wwwwwwwwwwwwwwwwwwwwwwwwwww(float f) {
            return Rating.newPercentageRating(f);
        }

        public static Rating Wwwwwwwwwwwwwwwwwwwwwwwwwwww(boolean z) {
            return Rating.newHeartRating(z);
        }

        public static boolean Wwwwwwwwwwwwwwwwwwwwwwwwwwwww(Rating rating) {
            return rating.isThumbUp();
        }

        public static boolean Wwwwwwwwwwwwwwwwwwwwwwwwwwwwww(Rating rating) {
            return rating.isRated();
        }

        public static boolean Wwwwwwwwwwwwwwwwwwwwwwwwwwwwwww(Rating rating) {
            return rating.hasHeart();
        }

        public static float Wwwwwwwwwwwwwwwwwwwwwwwwwwwwwwww(Rating rating) {
            return rating.getStarRating();
        }

        public static int Wwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwww(Rating rating) {
            return rating.getRatingStyle();
        }

        public static float Wwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwww(Rating rating) {
            return rating.getPercentRating();
        }
    }

    /* renamed from: android.support.v4.media.RatingCompat$Wwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwww */
    public class C3877Wwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwww implements Parcelable.Creator<RatingCompat> {
        /* renamed from: Wwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwww */
        public RatingCompat[] newArray(int i) {
            return new RatingCompat[i];
        }

        /* renamed from: Wwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwww */
        public RatingCompat createFromParcel(Parcel parcel) {
            return new RatingCompat(parcel.readInt(), parcel.readFloat());
        }
    }

    public RatingCompat(int i, float f) {
        this.f5251Wwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwww = i;
        this.f18058Wwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwww = f;
    }

    public static RatingCompat Wwwwwwwwwwwwwwwwwwwwwww(int i) {
        switch (i) {
            case 1:
            case 2:
            case 3:
            case 4:
            case 5:
            case 6:
                return new RatingCompat(i, -1.0f);
            default:
                return null;
        }
    }

    public static RatingCompat Wwwwwwwwwwwwwwwwwwwwwwww(boolean z) {
        return new RatingCompat(2, z ? 1.0f : 0.0f);
    }

    public static RatingCompat Wwwwwwwwwwwwwwwwwwwwwwwwwww(int i, float f) {
        float f2;
        if (i == 3) {
            f2 = 3.0f;
        } else if (i == 4) {
            f2 = 4.0f;
        } else if (i != 5) {
            Log.e("Rating", "Invalid rating style (" + i + ") for a star rating");
            return null;
        } else {
            f2 = 5.0f;
        }
        if (f >= 0.0f && f <= f2) {
            return new RatingCompat(i, f);
        }
        Log.e("Rating", "Trying to set out of range star-based rating");
        return null;
    }

    public static RatingCompat Wwwwwwwwwwwwwwwwwwwwwwwwwwwwww(float f) {
        if (f >= 0.0f && f <= 100.0f) {
            return new RatingCompat(6, f);
        }
        Log.e("Rating", "Invalid percentage-based rating value");
        return null;
    }

    public static RatingCompat Wwwwwwwwwwwwwwwwwwwwwwwwwwwwwwww(boolean z) {
        return new RatingCompat(1, z ? 1.0f : 0.0f);
    }

    public static RatingCompat Wwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwww(Object obj) {
        RatingCompat ratingCompat = null;
        if (obj != null && Build.VERSION.SDK_INT >= 19) {
            Rating rating = (Rating) obj;
            int Wwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwww2 = C3876Wwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwww.Wwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwww(rating);
            if (C3876Wwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwww.Wwwwwwwwwwwwwwwwwwwwwwwwwwwwww(rating)) {
                switch (Wwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwww2) {
                    case 1:
                        ratingCompat = Wwwwwwwwwwwwwwwwwwwwwwwwwwwwwwww(C3876Wwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwww.Wwwwwwwwwwwwwwwwwwwwwwwwwwwwwww(rating));
                        break;
                    case 2:
                        ratingCompat = Wwwwwwwwwwwwwwwwwwwwwwww(C3876Wwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwww.Wwwwwwwwwwwwwwwwwwwwwwwwwwwww(rating));
                        break;
                    case 3:
                    case 4:
                    case 5:
                        ratingCompat = Wwwwwwwwwwwwwwwwwwwwwwwwwww(Wwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwww2, C3876Wwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwww.Wwwwwwwwwwwwwwwwwwwwwwwwwwwwwwww(rating));
                        break;
                    case 6:
                        ratingCompat = Wwwwwwwwwwwwwwwwwwwwwwwwwwwwww(C3876Wwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwww.Wwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwww(rating));
                        break;
                    default:
                        return null;
                }
            } else {
                ratingCompat = Wwwwwwwwwwwwwwwwwwwwwww(Wwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwww2);
            }
            ratingCompat.f5252Wwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwww = obj;
        }
        return ratingCompat;
    }

    public int describeContents() {
        return this.f5251Wwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwww;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Rating:style=");
        sb.append(this.f5251Wwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwww);
        sb.append(" rating=");
        float f = this.f18058Wwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwww;
        sb.append(f < 0.0f ? "unrated" : String.valueOf(f));
        return sb.toString();
    }

    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.f5251Wwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwww);
        parcel.writeFloat(this.f18058Wwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwww);
    }
}
