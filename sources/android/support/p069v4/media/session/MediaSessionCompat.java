package android.support.p069v4.media.session;

import Illlllllllllll.C1306Wwwwwwwwwwwwwwwwwwwwwwwwwwwwwww;
import Illllllllllllllllllllllllll.C1621Wwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwww;
import Illlllllllllllllllllllllllll.C1622Wwwwwwwwwwwwwwwwwwwwwwwwwwwwww;
import Illlllllllllllllllllllllllll.C1630Wwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwww;
import Kkkkkkkkkkkkkkkkkkkk.C1844Wwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwww;
import Wwwwwwwww.C3181Wwwwwwwwwwwwwwwwwwwwwwwwwwwwwww;
import android.annotation.SuppressLint;
import android.app.PendingIntent;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.graphics.Bitmap;
import android.media.AudioAttributes;
import android.media.AudioManager;
import android.media.MediaDescription;
import android.media.MediaMetadata;
import android.media.Rating;
import android.media.RemoteControlClient;
import android.media.VolumeProvider;
import android.media.session.MediaSession;
import android.media.session.PlaybackState;
import android.net.Uri;
import android.os.BadParcelableException;
import android.os.Binder;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.os.IBinder;
import android.os.Looper;
import android.os.Message;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.RemoteCallbackList;
import android.os.RemoteException;
import android.os.ResultReceiver;
import android.os.SystemClock;
import android.support.p069v4.media.MediaDescriptionCompat;
import android.support.p069v4.media.MediaMetadataCompat;
import android.support.p069v4.media.RatingCompat;
import android.support.p069v4.media.session.C3923Wwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwww;
import android.support.p069v4.media.session.PlaybackStateCompat;
import android.text.TextUtils;
import android.util.Log;
import android.util.TypedValue;
import android.view.KeyEvent;
import android.view.ViewConfiguration;
import java.lang.ref.WeakReference;
import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* renamed from: android.support.v4.media.session.MediaSessionCompat */
public class MediaSessionCompat {

    /* renamed from: Wwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwww  reason: collision with root package name */
    public static int f18069Wwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwww;

    /* renamed from: Wwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwww  reason: collision with root package name */
    public static final int f18070Wwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwww = (C1844Wwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwww.Wwwwwwwwwwwwwwwwwwwwwwwwwwwwwwww() ? 33554432 : 0);

    /* renamed from: Wwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwww  reason: collision with other field name */
    public final MediaControllerCompat f5263Wwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwww;

    /* renamed from: Wwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwww  reason: collision with other field name */
    public final C3912Wwwwwwwwwwwwwwwwwwwwwwwwwwwwwwww f5264Wwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwww;

    /* renamed from: Wwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwww  reason: collision with other field name */
    public final ArrayList<C3897Wwwwwwwwwwwwwwwwwwwwwwww> f5265Wwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwww;

    @SuppressLint({"BanParcelableUsage"})
    /* renamed from: android.support.v4.media.session.MediaSessionCompat$ResultReceiverWrapper */
    public static final class ResultReceiverWrapper implements Parcelable {
        public static final Parcelable.Creator<ResultReceiverWrapper> CREATOR = new C3895Wwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwww();

        /* renamed from: Wwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwww  reason: collision with root package name */
        public ResultReceiver f18072Wwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwww;

        /* renamed from: android.support.v4.media.session.MediaSessionCompat$ResultReceiverWrapper$Wwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwww */
        public class C3895Wwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwww implements Parcelable.Creator<ResultReceiverWrapper> {
            /* renamed from: Wwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwww */
            public ResultReceiverWrapper[] newArray(int i) {
                return new ResultReceiverWrapper[i];
            }

            /* renamed from: Wwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwww */
            public ResultReceiverWrapper createFromParcel(Parcel parcel) {
                return new ResultReceiverWrapper(parcel);
            }
        }

        public ResultReceiverWrapper(Parcel parcel) {
            this.f18072Wwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwww = (ResultReceiver) ResultReceiver.CREATOR.createFromParcel(parcel);
        }

        public int describeContents() {
            return 0;
        }

        public void writeToParcel(Parcel parcel, int i) {
            this.f18072Wwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwww.writeToParcel(parcel, i);
        }
    }

    @SuppressLint({"BanParcelableUsage"})
    /* renamed from: android.support.v4.media.session.MediaSessionCompat$Token */
    public static final class Token implements Parcelable {
        public static final Parcelable.Creator<Token> CREATOR = new C3896Wwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwww();

        /* renamed from: Wwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwww  reason: collision with root package name */
        public final Object f18073Wwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwww;

        /* renamed from: Wwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwww  reason: collision with root package name */
        public C1306Wwwwwwwwwwwwwwwwwwwwwwwwwwwwwww f18074Wwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwww;

        /* renamed from: Wwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwww  reason: collision with other field name */
        public C3923Wwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwww f5267Wwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwww;

        /* renamed from: Wwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwww  reason: collision with other field name */
        public final Object f5268Wwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwww;

        /* renamed from: android.support.v4.media.session.MediaSessionCompat$Token$Wwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwww */
        public class C3896Wwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwww implements Parcelable.Creator<Token> {
            /* renamed from: Wwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwww */
            public Token[] newArray(int i) {
                return new Token[i];
            }

            /* renamed from: Wwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwww */
            public Token createFromParcel(Parcel parcel) {
                Object obj;
                if (Build.VERSION.SDK_INT >= 21) {
                    obj = parcel.readParcelable((ClassLoader) null);
                } else {
                    obj = parcel.readStrongBinder();
                }
                return new Token(obj);
            }
        }

        public Token(Object obj) {
            this(obj, (C3923Wwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwww) null, (C1306Wwwwwwwwwwwwwwwwwwwwwwwwwwwwwww) null);
        }

        public void Wwwwwwwwwwwwwwwwwwwwwwww(C1306Wwwwwwwwwwwwwwwwwwwwwwwwwwwwwww wwwwwwwwwwwwwwwwwwwwwwwwwwwwwww) {
            synchronized (this.f5268Wwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwww) {
                this.f18074Wwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwww = wwwwwwwwwwwwwwwwwwwwwwwwwwwwwww;
            }
        }

        public void Wwwwwwwwwwwwwwwwwwwwwwwwwww(C3923Wwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwww wwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwww) {
            synchronized (this.f5268Wwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwww) {
                this.f5267Wwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwww = wwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwww;
            }
        }

        public Object Wwwwwwwwwwwwwwwwwwwwwwwwwwwwww() {
            return this.f18073Wwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwww;
        }

        public C1306Wwwwwwwwwwwwwwwwwwwwwwwwwwwwwww Wwwwwwwwwwwwwwwwwwwwwwwwwwwwwwww() {
            C1306Wwwwwwwwwwwwwwwwwwwwwwwwwwwwwww wwwwwwwwwwwwwwwwwwwwwwwwwwwwwww;
            synchronized (this.f5268Wwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwww) {
                wwwwwwwwwwwwwwwwwwwwwwwwwwwwwww = this.f18074Wwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwww;
            }
            return wwwwwwwwwwwwwwwwwwwwwwwwwwwwwww;
        }

        public C3923Wwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwww Wwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwww() {
            C3923Wwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwww wwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwww;
            synchronized (this.f5268Wwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwww) {
                wwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwww = this.f5267Wwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwww;
            }
            return wwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwww;
        }

        public int describeContents() {
            return 0;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof Token)) {
                return false;
            }
            Token token = (Token) obj;
            Object obj2 = this.f18073Wwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwww;
            if (obj2 != null) {
                Object obj3 = token.f18073Wwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwww;
                if (obj3 == null) {
                    return false;
                }
                return obj2.equals(obj3);
            } else if (token.f18073Wwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwww == null) {
                return true;
            } else {
                return false;
            }
        }

        public int hashCode() {
            Object obj = this.f18073Wwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwww;
            if (obj == null) {
                return 0;
            }
            return obj.hashCode();
        }

        public void writeToParcel(Parcel parcel, int i) {
            if (Build.VERSION.SDK_INT >= 21) {
                parcel.writeParcelable((Parcelable) this.f18073Wwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwww, i);
            } else {
                parcel.writeStrongBinder((IBinder) this.f18073Wwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwww);
            }
        }

        public Token(Object obj, C3923Wwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwww wwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwww, C1306Wwwwwwwwwwwwwwwwwwwwwwwwwwwwwww wwwwwwwwwwwwwwwwwwwwwwwwwwwwwww) {
            this.f5268Wwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwww = new Object();
            this.f18073Wwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwww = obj;
            this.f5267Wwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwww = wwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwww;
            this.f18074Wwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwww = wwwwwwwwwwwwwwwwwwwwwwwwwwwwwww;
        }
    }

    /* renamed from: android.support.v4.media.session.MediaSessionCompat$Wwwwwwwwwwwwwwwwwwwwwwww */
    public interface C3897Wwwwwwwwwwwwwwwwwwwwwwww {
        void Wwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwww();
    }

    /* renamed from: android.support.v4.media.session.MediaSessionCompat$Wwwwwwwwwwwwwwwwwwwwwwwww */
    public static class C3898Wwwwwwwwwwwwwwwwwwwwwwwww implements C3912Wwwwwwwwwwwwwwwwwwwwwwwwwwwwwwww {

        /* renamed from: Wwwwwwwwwwwwwwwwwwwwwwwwwwwww  reason: collision with root package name */
        public int f18075Wwwwwwwwwwwwwwwwwwwwwwwwwwwww;

        /* renamed from: Wwwwwwwwwwwwwwwwwwwwwwwwwwwwww  reason: collision with root package name */
        public int f18076Wwwwwwwwwwwwwwwwwwwwwwwwwwwwww;

        /* renamed from: Wwwwwwwwwwwwwwwwwwwwwwwwwwwwwww  reason: collision with root package name */
        public int f18077Wwwwwwwwwwwwwwwwwwwwwwwwwwwwwww;

        /* renamed from: Wwwwwwwwwwwwwwwwwwwwwwwwwwwwwwww  reason: collision with root package name */
        public int f18078Wwwwwwwwwwwwwwwwwwwwwwwwwwwwwwww;

        /* renamed from: Wwwwwwwwwwwwwwwwwwwwwwwwwwwwwwww  reason: collision with other field name */
        public boolean f5269Wwwwwwwwwwwwwwwwwwwwwwwwwwwwwwww;

        /* renamed from: Wwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwww  reason: collision with root package name */
        public int f18079Wwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwww;

        /* renamed from: Wwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwww  reason: collision with other field name */
        public PendingIntent f5270Wwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwww;

        /* renamed from: Wwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwww  reason: collision with other field name */
        public Bundle f5271Wwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwww;

        /* renamed from: Wwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwww  reason: collision with other field name */
        public final String f5272Wwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwww;

        /* renamed from: Wwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwww  reason: collision with other field name */
        public boolean f5273Wwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwww = false;

        /* renamed from: Wwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwww  reason: collision with root package name */
        public int f18080Wwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwww = 3;

        /* renamed from: Wwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwww  reason: collision with other field name */
        public C1622Wwwwwwwwwwwwwwwwwwwwwwwwwwwwww.C1623Wwwwwwwwwwwwwwwwwwwwwwwwwwwwwww f5274Wwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwww = new C3902Wwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwww();

        /* renamed from: Wwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwww  reason: collision with other field name */
        public C1622Wwwwwwwwwwwwwwwwwwwwwwwwwwwwww f5275Wwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwww;

        /* renamed from: Wwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwww  reason: collision with other field name */
        public C1630Wwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwww f5276Wwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwww;

        /* renamed from: Wwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwww  reason: collision with other field name */
        public final PendingIntent f5277Wwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwww;

        /* renamed from: Wwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwww  reason: collision with other field name */
        public final ComponentName f5278Wwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwww;

        /* renamed from: Wwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwww  reason: collision with other field name */
        public final Context f5279Wwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwww;

        /* renamed from: Wwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwww  reason: collision with other field name */
        public final AudioManager f5280Wwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwww;

        /* renamed from: Wwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwww  reason: collision with other field name */
        public final RemoteControlClient f5281Wwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwww;

        /* renamed from: Wwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwww  reason: collision with other field name */
        public final Bundle f5282Wwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwww;

        /* renamed from: Wwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwww  reason: collision with other field name */
        public final RemoteCallbackList<C3926Wwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwww> f5283Wwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwww = new RemoteCallbackList<>();

        /* renamed from: Wwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwww  reason: collision with other field name */
        public MediaMetadataCompat f5284Wwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwww;

        /* renamed from: Wwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwww  reason: collision with other field name */
        public final Token f5285Wwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwww;

        /* renamed from: Wwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwww  reason: collision with other field name */
        public C3899Wwwwwwwwwwwwwwwwwwwwwwwwwwwwwww f5286Wwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwww;

        /* renamed from: Wwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwww  reason: collision with other field name */
        public final C3900Wwwwwwwwwwwwwwwwwwwwwwwwwwwwwwww f5287Wwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwww;

        /* renamed from: Wwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwww  reason: collision with other field name */
        public volatile C3913Wwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwww f5288Wwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwww;

        /* renamed from: Wwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwww  reason: collision with other field name */
        public PlaybackStateCompat f5289Wwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwww;

        /* renamed from: Wwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwww  reason: collision with other field name */
        public CharSequence f5290Wwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwww;

        /* renamed from: Wwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwww  reason: collision with other field name */
        public final Object f5291Wwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwww = new Object();

        /* renamed from: Wwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwww  reason: collision with other field name */
        public final String f5292Wwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwww;

        /* renamed from: Wwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwww  reason: collision with other field name */
        public List<QueueItem> f5293Wwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwww;

        /* renamed from: Wwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwww  reason: collision with other field name */
        public boolean f5294Wwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwww = false;

        /* renamed from: android.support.v4.media.session.MediaSessionCompat$Wwwwwwwwwwwwwwwwwwwwwwwww$Wwwwwwwwwwwwwwwwwwwwwwwwwwwwwww */
        public class C3899Wwwwwwwwwwwwwwwwwwwwwwwwwwwwwww extends Handler {
            public C3899Wwwwwwwwwwwwwwwwwwwwwwwwwwwwwww(Looper looper) {
                super(looper);
            }

            public final void Wwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwww(KeyEvent keyEvent, C3913Wwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwww wwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwww) {
                if (keyEvent != null && keyEvent.getAction() == 0) {
                    PlaybackStateCompat playbackStateCompat = C3898Wwwwwwwwwwwwwwwwwwwwwwwww.this.f5289Wwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwww;
                    long Wwwwwwwwwwwwwwwwwwwwwwwwwwwwwwww2 = playbackStateCompat == null ? 0 : playbackStateCompat.Wwwwwwwwwwwwwwwwwwwwwwwwwwwwwwww();
                    int keyCode = keyEvent.getKeyCode();
                    if (keyCode != 79) {
                        if (keyCode != 126) {
                            if (keyCode != 127) {
                                switch (keyCode) {
                                    case 85:
                                        break;
                                    case 86:
                                        if ((Wwwwwwwwwwwwwwwwwwwwwwwwwwwwwwww2 & 1) != 0) {
                                            wwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwww.Wwwwww();
                                            return;
                                        }
                                        return;
                                    case 87:
                                        if ((Wwwwwwwwwwwwwwwwwwwwwwwwwwwwwwww2 & 32) != 0) {
                                            wwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwww.Wwwwwwwww();
                                            return;
                                        }
                                        return;
                                    case 88:
                                        if ((Wwwwwwwwwwwwwwwwwwwwwwwwwwwwwwww2 & 16) != 0) {
                                            wwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwww.Wwwwwwww();
                                            return;
                                        }
                                        return;
                                    case 89:
                                        if ((Wwwwwwwwwwwwwwwwwwwwwwwwwwwwwwww2 & 8) != 0) {
                                            wwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwww.Wwwwwwwwwwwwwwwww();
                                            return;
                                        }
                                        return;
                                    case C3181Wwwwwwwwwwwwwwwwwwwwwwwwwwwwwww.f16582Illlllllllllllllll:
                                        if ((Wwwwwwwwwwwwwwwwwwwwwwwwwwwwwwww2 & 64) != 0) {
                                            wwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwww.Wwwwwwwwwwwwwwwwwwwwwwwwwwwww();
                                            return;
                                        }
                                        return;
                                    default:
                                        return;
                                }
                            } else if ((Wwwwwwwwwwwwwwwwwwwwwwwwwwwwwwww2 & 2) != 0) {
                                wwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwww.Wwwwwwwwwwwwwwwwwwwwwwwwwww();
                                return;
                            } else {
                                return;
                            }
                        } else if ((Wwwwwwwwwwwwwwwwwwwwwwwwwwwwwwww2 & 4) != 0) {
                            wwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwww.Wwwwwwwwwwwwwwwwwwwwwwwwww();
                            return;
                        } else {
                            return;
                        }
                    }
                    Log.w("MediaSessionCompat", "KEYCODE_MEDIA_PLAY_PAUSE and KEYCODE_HEADSETHOOK are handled already");
                }
            }

            public void handleMessage(Message message) {
                C3913Wwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwww wwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwww = C3898Wwwwwwwwwwwwwwwwwwwwwwwww.this.f5288Wwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwww;
                if (wwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwww != null) {
                    Bundle data = message.getData();
                    MediaSessionCompat.Wwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwww(data);
                    C3898Wwwwwwwwwwwwwwwwwwwwwwwww.this.Wwwwwwwwwwwwwwwwwwwwwwwwwwwwwww(new C1630Wwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwww(data.getString("data_calling_pkg"), data.getInt("data_calling_pid"), data.getInt("data_calling_uid")));
                    Bundle bundle = data.getBundle("data_extras");
                    MediaSessionCompat.Wwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwww(bundle);
                    try {
                        switch (message.what) {
                            case 1:
                                C3901Wwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwww wwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwww2 = (C3901Wwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwww) message.obj;
                                wwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwww.Wwwwwwwwwwwwwwwwwwwwwwwwwwwwwww(wwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwww2.f5296Wwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwww, wwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwww2.f18083Wwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwww, wwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwww2.f5295Wwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwww);
                                break;
                            case 2:
                                C3898Wwwwwwwwwwwwwwwwwwwwwwwww.this.Wwwwwwwwwwwwwwww(message.arg1, 0);
                                break;
                            case 3:
                                wwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwww.Wwwwwwwwwwwwwwwwwwwwww();
                                break;
                            case 4:
                                wwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwww.Wwwwwwwwwwwwwwwwwwwww((String) message.obj, bundle);
                                break;
                            case 5:
                                wwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwww.Wwwwwwwwwwwwwwwwwwww((String) message.obj, bundle);
                                break;
                            case 6:
                                wwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwww.Wwwwwwwwwwwwwwwwwww((Uri) message.obj, bundle);
                                break;
                            case 7:
                                wwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwww.Wwwwwwwwwwwwwwwwwwwwwwwwww();
                                break;
                            case 8:
                                wwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwww.Wwwwwwwwwwwwwwwwwwwwwwwww((String) message.obj, bundle);
                                break;
                            case 9:
                                wwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwww.Wwwwwwwwwwwwwwwwwwwwwwww((String) message.obj, bundle);
                                break;
                            case 10:
                                wwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwww.Wwwwwwwwwwwwwwwwwwwwwww((Uri) message.obj, bundle);
                                break;
                            case 11:
                                wwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwww.Wwwwwww(((Long) message.obj).longValue());
                                break;
                            case 12:
                                wwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwww.Wwwwwwwwwwwwwwwwwwwwwwwwwww();
                                break;
                            case 13:
                                wwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwww.Wwwwww();
                                break;
                            case 14:
                                wwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwww.Wwwwwwwww();
                                break;
                            case 15:
                                wwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwww.Wwwwwwww();
                                break;
                            case 16:
                                wwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwww.Wwwwwwwwwwwwwwwwwwwwwwwwwwwww();
                                break;
                            case 17:
                                wwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwww.Wwwwwwwwwwwwwwwww();
                                break;
                            case 18:
                                wwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwww.Wwwwwwwwwwwwwwww(((Long) message.obj).longValue());
                                break;
                            case 19:
                                wwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwww.Wwwwwwwwwwwww((RatingCompat) message.obj);
                                break;
                            case 20:
                                wwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwww.Wwwwwwwwwwwwwwwwwwwwwwwwwwwwww((String) message.obj, bundle);
                                break;
                            case 21:
                                KeyEvent keyEvent = (KeyEvent) message.obj;
                                Intent intent = new Intent("android.intent.action.MEDIA_BUTTON");
                                intent.putExtra("android.intent.extra.KEY_EVENT", keyEvent);
                                if (!wwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwww.Wwwwwwwwwwwwwwwwwwwwwwwwwwww(intent)) {
                                    Wwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwww(keyEvent, wwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwww);
                                    break;
                                }
                                break;
                            case 22:
                                C3898Wwwwwwwwwwwwwwwwwwwwwwwww.this.Wwww(message.arg1, 0);
                                break;
                            case 23:
                                wwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwww.Wwwwwwwwwww(message.arg1);
                                break;
                            case 25:
                                wwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwww.Wwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwww((MediaDescriptionCompat) message.obj);
                                break;
                            case 26:
                                wwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwww.Wwwwwwwwwwwwwwwwwwwwwwwwwwwwwwww((MediaDescriptionCompat) message.obj, message.arg1);
                                break;
                            case 27:
                                wwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwww.Wwwwwwwwwwwwwwwwww((MediaDescriptionCompat) message.obj);
                                break;
                            case 28:
                                List<QueueItem> list = C3898Wwwwwwwwwwwwwwwwwwwwwwwww.this.f5293Wwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwww;
                                if (list != null) {
                                    int i = message.arg1;
                                    QueueItem queueItem = (i < 0 || i >= list.size()) ? null : C3898Wwwwwwwwwwwwwwwwwwwwwwwww.this.f5293Wwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwww.get(message.arg1);
                                    if (queueItem != null) {
                                        wwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwww.Wwwwwwwwwwwwwwwwww(queueItem.Wwwwwwwwwwwwwwwwwwwwwwwwwwwwww());
                                        break;
                                    }
                                }
                                break;
                            case 29:
                                wwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwww.Wwwwwwwwwwwwwww(((Boolean) message.obj).booleanValue());
                                break;
                            case 30:
                                wwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwww.Wwwwwwwwww(message.arg1);
                                break;
                            case 31:
                                wwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwww.Wwwwwwwwwwww((RatingCompat) message.obj, bundle);
                                break;
                            case 32:
                                wwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwww.Wwwwwwwwwwwwww(((Float) message.obj).floatValue());
                                break;
                        }
                    } finally {
                        C3898Wwwwwwwwwwwwwwwwwwwwwwwww.this.Wwwwwwwwwwwwwwwwwwwwwwwwwwwwwww((C1630Wwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwww) null);
                    }
                }
            }
        }

        /* renamed from: android.support.v4.media.session.MediaSessionCompat$Wwwwwwwwwwwwwwwwwwwwwwwww$Wwwwwwwwwwwwwwwwwwwwwwwwwwwwwwww */
        public class C3900Wwwwwwwwwwwwwwwwwwwwwwwwwwwwwwww extends C3923Wwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwww.C3924Wwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwww {
            public C3900Wwwwwwwwwwwwwwwwwwwwwwwwwwwwwwww() {
            }

            /* renamed from: A */
            public void mo11002A(int i, Object obj, int i2) {
                C3898Wwwwwwwwwwwwwwwwwwwwwwwww.this.Wwwwwwwwwww(i, i2, 0, obj, (Bundle) null);
            }

            /* renamed from: B */
            public void mo11003B(int i, Object obj, Bundle bundle) {
                C3898Wwwwwwwwwwwwwwwwwwwwwwwww.this.Wwwwwwwwwww(i, 0, 0, obj, bundle);
            }

            public void Cccc(int i) {
                mo11056y(30, i);
            }

            public void Ccccc(String str, Bundle bundle, ResultReceiverWrapper resultReceiverWrapper) {
                ResultReceiver resultReceiver;
                if (resultReceiverWrapper == null) {
                    resultReceiver = null;
                } else {
                    resultReceiver = resultReceiverWrapper.f18072Wwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwww;
                }
                mo11057z(1, new C3901Wwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwww(str, bundle, resultReceiver));
            }

            public void Cccccccc(C3926Wwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwww wwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwww) {
                if (C3898Wwwwwwwwwwwwwwwwwwwwwwwww.this.f5294Wwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwww) {
                    try {
                        wwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwww.Kkkk();
                    } catch (Exception unused) {
                    }
                } else {
                    C3898Wwwwwwwwwwwwwwwwwwwwwwwww.this.f5283Wwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwww.register(wwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwww, new C1630Wwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwww(C3898Wwwwwwwwwwwwwwwwwwwwwwwww.this.Wwwwwwwwwwwwww(Binder.getCallingUid()), Binder.getCallingPid(), Binder.getCallingUid()));
                }
            }

            public String IIllll() {
                return C3898Wwwwwwwwwwwwwwwwwwwwwwwww.this.f5292Wwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwww;
            }

            public void IIlllllll() {
                mo11055x(3);
            }

            public void Illl(Uri uri, Bundle bundle) {
                mo11003B(6, uri, bundle);
            }

            public void Illll(long j) {
                mo11057z(18, Long.valueOf(j));
            }

            public void Illllllllllllllllllllllllll(float f) {
                mo11057z(32, Float.valueOf(f));
            }

            public void Kkk(MediaDescriptionCompat mediaDescriptionCompat, int i) {
                mo11002A(26, mediaDescriptionCompat, i);
            }

            public List<QueueItem> Kkkkkkkk() {
                List<QueueItem> list;
                synchronized (C3898Wwwwwwwwwwwwwwwwwwwwwwwww.this.f5291Wwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwww) {
                    list = C3898Wwwwwwwwwwwwwwwwwwwwwwwww.this.f5293Wwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwww;
                }
                return list;
            }

            public Bundle Kkkkkkkkkkkkkkkk() {
                if (C3898Wwwwwwwwwwwwwwwwwwwwwwwww.this.f5282Wwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwww == null) {
                    return null;
                }
                return new Bundle(C3898Wwwwwwwwwwwwwwwwwwwwwwwww.this.f5282Wwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwww);
            }

            public ParcelableVolumeInfo Kkkkkkkkkkkkkkkkk() {
                int i;
                int i2;
                int i3;
                int i4;
                int i5;
                synchronized (C3898Wwwwwwwwwwwwwwwwwwwwwwwww.this.f5291Wwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwww) {
                    C3898Wwwwwwwwwwwwwwwwwwwwwwwww wwwwwwwwwwwwwwwwwwwwwwwww = C3898Wwwwwwwwwwwwwwwwwwwwwwwww.this;
                    i = wwwwwwwwwwwwwwwwwwwwwwwww.f18076Wwwwwwwwwwwwwwwwwwwwwwwwwwwwww;
                    i2 = wwwwwwwwwwwwwwwwwwwwwwwww.f18075Wwwwwwwwwwwwwwwwwwwwwwwwwwwww;
                    C1622Wwwwwwwwwwwwwwwwwwwwwwwwwwwwww wwwwwwwwwwwwwwwwwwwwwwwwwwwwww = wwwwwwwwwwwwwwwwwwwwwwwww.f5275Wwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwww;
                    i3 = 2;
                    if (i == 2) {
                        int Wwwwwwwwwwwwwwwwwwwwwwwwwwwwwwww2 = wwwwwwwwwwwwwwwwwwwwwwwwwwwwww.Wwwwwwwwwwwwwwwwwwwwwwwwwwwwwwww();
                        int Wwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwww2 = wwwwwwwwwwwwwwwwwwwwwwwwwwwwww.Wwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwww();
                        i4 = wwwwwwwwwwwwwwwwwwwwwwwwwwwwww.Wwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwww();
                        i5 = Wwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwww2;
                        i3 = Wwwwwwwwwwwwwwwwwwwwwwwwwwwwwwww2;
                    } else {
                        i5 = wwwwwwwwwwwwwwwwwwwwwwwww.f5280Wwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwww.getStreamMaxVolume(i2);
                        i4 = C3898Wwwwwwwwwwwwwwwwwwwwwwwww.this.f5280Wwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwww.getStreamVolume(i2);
                    }
                }
                return new ParcelableVolumeInfo(i, i2, i3, i5, i4);
            }

            public void Kkkkkkkkkkkkkkkkkkk(String str, Bundle bundle) {
                mo11003B(5, str, bundle);
            }

            public CharSequence Kkkkkkkkkkkkkkkkkkkkk() {
                return C3898Wwwwwwwwwwwwwwwwwwwwwwwww.this.f5290Wwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwww;
            }

            public long Kkkkkkkkkkkkkkkkkkkkkkk() {
                long j;
                synchronized (C3898Wwwwwwwwwwwwwwwwwwwwwwwww.this.f5291Wwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwww) {
                    j = (long) C3898Wwwwwwwwwwwwwwwwwwwwwwwww.this.f18080Wwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwww;
                }
                return j;
            }

            public void Lllll(MediaDescriptionCompat mediaDescriptionCompat) {
                mo11057z(25, mediaDescriptionCompat);
            }

            public boolean Llllllllllll(KeyEvent keyEvent) {
                mo11057z(21, keyEvent);
                return true;
            }

            /* renamed from: O0 */
            public void mo11021O0(int i, int i2, String str) {
                C3898Wwwwwwwwwwwwwwwwwwwwwwwww.this.Wwww(i, i2);
            }

            public boolean O00() {
                return true;
            }

            public void O000000() {
                mo11055x(17);
            }

            public void OO000(int i, int i2, String str) {
                C3898Wwwwwwwwwwwwwwwwwwwwwwwww.this.Wwwwwwwwwwwwwwww(i, i2);
            }

            public boolean OO00000() {
                return false;
            }

            public void Ooooooooooo(RatingCompat ratingCompat, Bundle bundle) {
                mo11003B(31, ratingCompat, bundle);
            }

            public void QQO(Uri uri, Bundle bundle) {
                mo11003B(10, uri, bundle);
            }

            public void QQOOOOO(String str, Bundle bundle) {
                mo11003B(20, str, bundle);
            }

            public void QQOOOOOOOOO(RatingCompat ratingCompat) {
                mo11057z(19, ratingCompat);
            }

            public boolean Sssss() {
                return C3898Wwwwwwwwwwwwwwwwwwwwwwwww.this.f5269Wwwwwwwwwwwwwwwwwwwwwwwwwwwwwwww;
            }

            public void Uuuuu(String str, Bundle bundle) {
                mo11003B(8, str, bundle);
            }

            public int Www() {
                return C3898Wwwwwwwwwwwwwwwwwwwwwwwww.this.f18079Wwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwww;
            }

            public int Wwww() {
                return C3898Wwwwwwwwwwwwwwwwwwwwwwwww.this.f18078Wwwwwwwwwwwwwwwwwwwwwwwwwwwwwwww;
            }

            public void Wwwww(int i) {
                mo11056y(23, i);
            }

            public MediaMetadataCompat Wwwwwww() {
                return C3898Wwwwwwwwwwwwwwwwwwwwwwwww.this.f5284Wwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwww;
            }

            public void Wwwwwwwwwwwwwwwwwww() {
                mo11055x(7);
            }

            public PlaybackStateCompat Wwwwwwwwwwwwwwwwwwwwwwwwwww() {
                PlaybackStateCompat playbackStateCompat;
                MediaMetadataCompat mediaMetadataCompat;
                synchronized (C3898Wwwwwwwwwwwwwwwwwwwwwwwww.this.f5291Wwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwww) {
                    C3898Wwwwwwwwwwwwwwwwwwwwwwwww wwwwwwwwwwwwwwwwwwwwwwwww = C3898Wwwwwwwwwwwwwwwwwwwwwwwww.this;
                    playbackStateCompat = wwwwwwwwwwwwwwwwwwwwwwwww.f5289Wwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwww;
                    mediaMetadataCompat = wwwwwwwwwwwwwwwwwwwwwwwww.f5284Wwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwww;
                }
                return MediaSessionCompat.Wwwwwwwwwwwwwwwwwwwwwwwwwwwww(playbackStateCompat, mediaMetadataCompat);
            }

            public String Wwwwwwwwwwwwwwwwwwwwwwwwwwww() {
                return C3898Wwwwwwwwwwwwwwwwwwwwwwwww.this.f5272Wwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwww;
            }

            public void Xxxx() {
                mo11055x(15);
            }

            public void Xxxxxxx(boolean z) {
                mo11057z(29, Boolean.valueOf(z));
            }

            public void Xxxxxxxx() {
                mo11055x(16);
            }

            public void Xxxxxxxxxxx(boolean z) {
            }

            public PendingIntent Zzzz() {
                PendingIntent pendingIntent;
                synchronized (C3898Wwwwwwwwwwwwwwwwwwwwwwwww.this.f5291Wwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwww) {
                    pendingIntent = C3898Wwwwwwwwwwwwwwwwwwwwwwwww.this.f5270Wwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwww;
                }
                return pendingIntent;
            }

            public void Zzzzzzzzz(int i) {
                mo11056y(28, i);
            }

            /* renamed from: b */
            public void mo11045b(long j) {
                mo11057z(11, Long.valueOf(j));
            }

            /* renamed from: d */
            public void mo11046d(String str, Bundle bundle) {
                mo11003B(4, str, bundle);
            }

            /* renamed from: g */
            public void mo11047g(MediaDescriptionCompat mediaDescriptionCompat) {
                mo11057z(27, mediaDescriptionCompat);
            }

            public Bundle getExtras() {
                Bundle bundle;
                synchronized (C3898Wwwwwwwwwwwwwwwwwwwwwwwww.this.f5291Wwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwww) {
                    bundle = C3898Wwwwwwwwwwwwwwwwwwwwwwwww.this.f5271Wwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwww;
                }
                return bundle;
            }

            /* renamed from: m */
            public void mo11049m(C3926Wwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwww wwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwww) {
                C3898Wwwwwwwwwwwwwwwwwwwwwwwww.this.f5283Wwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwww.unregister(wwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwww);
            }

            public void pause() {
                mo11055x(12);
            }

            public void stop() {
                mo11055x(13);
            }

            public void tooYoung() {
                mo11055x(14);
            }

            /* renamed from: u */
            public void mo11053u(String str, Bundle bundle) {
                mo11003B(9, str, bundle);
            }

            /* renamed from: v */
            public int mo11054v() {
                return C3898Wwwwwwwwwwwwwwwwwwwwwwwww.this.f18077Wwwwwwwwwwwwwwwwwwwwwwwwwwwwwww;
            }

            /* renamed from: x */
            public void mo11055x(int i) {
                C3898Wwwwwwwwwwwwwwwwwwwwwwwww.this.Wwwwwwwwwww(i, 0, 0, (Object) null, (Bundle) null);
            }

            /* renamed from: y */
            public void mo11056y(int i, int i2) {
                C3898Wwwwwwwwwwwwwwwwwwwwwwwww.this.Wwwwwwwwwww(i, i2, 0, (Object) null, (Bundle) null);
            }

            /* renamed from: z */
            public void mo11057z(int i, Object obj) {
                C3898Wwwwwwwwwwwwwwwwwwwwwwwww.this.Wwwwwwwwwww(i, 0, 0, obj, (Bundle) null);
            }
        }

        /* renamed from: android.support.v4.media.session.MediaSessionCompat$Wwwwwwwwwwwwwwwwwwwwwwwww$Wwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwww */
        public static final class C3901Wwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwww {

            /* renamed from: Wwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwww  reason: collision with root package name */
            public final Bundle f18083Wwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwww;

            /* renamed from: Wwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwww  reason: collision with other field name */
            public final ResultReceiver f5295Wwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwww;

            /* renamed from: Wwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwww  reason: collision with other field name */
            public final String f5296Wwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwww;

            public C3901Wwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwww(String str, Bundle bundle, ResultReceiver resultReceiver) {
                this.f5296Wwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwww = str;
                this.f18083Wwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwww = bundle;
                this.f5295Wwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwww = resultReceiver;
            }
        }

        /* renamed from: android.support.v4.media.session.MediaSessionCompat$Wwwwwwwwwwwwwwwwwwwwwwwww$Wwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwww */
        public class C3902Wwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwww extends C1622Wwwwwwwwwwwwwwwwwwwwwwwwwwwwww.C1623Wwwwwwwwwwwwwwwwwwwwwwwwwwwwwww {
            public C3902Wwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwww() {
            }

            public void Wwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwww(C1622Wwwwwwwwwwwwwwwwwwwwwwwwwwwwww wwwwwwwwwwwwwwwwwwwwwwwwwwwwww) {
                if (C3898Wwwwwwwwwwwwwwwwwwwwwwwww.this.f5275Wwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwww == wwwwwwwwwwwwwwwwwwwwwwwwwwwwww) {
                    C3898Wwwwwwwwwwwwwwwwwwwwwwwww wwwwwwwwwwwwwwwwwwwwwwwww = C3898Wwwwwwwwwwwwwwwwwwwwwwwww.this;
                    C3898Wwwwwwwwwwwwwwwwwwwwwwwww.this.Wwwwww(new ParcelableVolumeInfo(wwwwwwwwwwwwwwwwwwwwwwwww.f18076Wwwwwwwwwwwwwwwwwwwwwwwwwwwwww, wwwwwwwwwwwwwwwwwwwwwwwww.f18075Wwwwwwwwwwwwwwwwwwwwwwwwwwwww, wwwwwwwwwwwwwwwwwwwwwwwwwwwwww.Wwwwwwwwwwwwwwwwwwwwwwwwwwwwwwww(), wwwwwwwwwwwwwwwwwwwwwwwwwwwwww.Wwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwww(), wwwwwwwwwwwwwwwwwwwwwwwwwwwwww.Wwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwww()));
                }
            }
        }

        public C3898Wwwwwwwwwwwwwwwwwwwwwwwww(Context context, String str, ComponentName componentName, PendingIntent pendingIntent, C1306Wwwwwwwwwwwwwwwwwwwwwwwwwwwwwww wwwwwwwwwwwwwwwwwwwwwwwwwwwwwww, Bundle bundle) {
            if (componentName != null) {
                this.f5279Wwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwww = context;
                this.f5292Wwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwww = context.getPackageName();
                this.f5282Wwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwww = bundle;
                this.f5280Wwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwww = (AudioManager) context.getSystemService("audio");
                this.f5272Wwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwww = str;
                this.f5278Wwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwww = componentName;
                this.f5277Wwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwww = pendingIntent;
                C3900Wwwwwwwwwwwwwwwwwwwwwwwwwwwwwwww wwwwwwwwwwwwwwwwwwwwwwwwwwwwwwww = new C3900Wwwwwwwwwwwwwwwwwwwwwwwwwwwwwwww();
                this.f5287Wwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwww = wwwwwwwwwwwwwwwwwwwwwwwwwwwwwwww;
                this.f5285Wwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwww = new Token(wwwwwwwwwwwwwwwwwwwwwwwwwwwwwwww, (C3923Wwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwww) null, wwwwwwwwwwwwwwwwwwwwwwwwwwwwwww);
                this.f18079Wwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwww = 0;
                this.f18076Wwwwwwwwwwwwwwwwwwwwwwwwwwwwww = 1;
                this.f18075Wwwwwwwwwwwwwwwwwwwwwwwwwwwww = 3;
                this.f5281Wwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwww = new RemoteControlClient(pendingIntent);
                return;
            }
            throw new IllegalArgumentException("MediaButtonReceiver component may not be null");
        }

        public void Kkkkkkkkkkkkkkkkkkkkkkkkkk() {
            if (this.f5273Wwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwww) {
                Wwwwwwwwww(this.f5277Wwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwww, this.f5278Wwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwww);
                this.f5280Wwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwww.registerRemoteControlClient(this.f5281Wwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwww);
                Wwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwww(this.f5284Wwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwww);
                Wwwwwwwwwwwwwwwwwwwwwwwwww(this.f5289Wwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwww);
                return;
            }
            Www(this.f5277Wwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwww, this.f5278Wwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwww);
            this.f5281Wwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwww.setPlaybackState(0);
            this.f5280Wwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwww.unregisterRemoteControlClient(this.f5281Wwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwww);
        }

        public void Www(PendingIntent pendingIntent, ComponentName componentName) {
            this.f5280Wwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwww.unregisterMediaButtonEventReceiver(componentName);
        }

        public void Wwww(int i, int i2) {
            if (this.f18076Wwwwwwwwwwwwwwwwwwwwwwwwwwwwww == 2) {
                C1622Wwwwwwwwwwwwwwwwwwwwwwwwwwwwww wwwwwwwwwwwwwwwwwwwwwwwwwwwwww = this.f5275Wwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwww;
                if (wwwwwwwwwwwwwwwwwwwwwwwwwwwwww != null) {
                    wwwwwwwwwwwwwwwwwwwwwwwwwwwwww.Wwwwwwwwwwwwwwwwwwwwwwwwwwwww(i);
                    return;
                }
                return;
            }
            this.f5280Wwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwww.setStreamVolume(this.f18075Wwwwwwwwwwwwwwwwwwwwwwwwwwwww, i, i2);
        }

        public void Wwwww(PlaybackStateCompat playbackStateCompat) {
            this.f5281Wwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwww.setPlaybackState(Wwwwwwwwwwwww(playbackStateCompat.Wwwwwwwwwwwwwwwwww()));
        }

        public void Wwwwww(ParcelableVolumeInfo parcelableVolumeInfo) {
            for (int beginBroadcast = this.f5283Wwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwww.beginBroadcast() - 1; beginBroadcast >= 0; beginBroadcast--) {
                try {
                    this.f5283Wwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwww.getBroadcastItem(beginBroadcast).sometimesNaive(parcelableVolumeInfo);
                } catch (RemoteException unused) {
                }
            }
            this.f5283Wwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwww.finishBroadcast();
        }

        public final void Wwwwwww(PlaybackStateCompat playbackStateCompat) {
            for (int beginBroadcast = this.f5283Wwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwww.beginBroadcast() - 1; beginBroadcast >= 0; beginBroadcast--) {
                try {
                    this.f5283Wwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwww.getBroadcastItem(beginBroadcast).Mmmmmmmmm(playbackStateCompat);
                } catch (RemoteException unused) {
                }
            }
            this.f5283Wwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwww.finishBroadcast();
        }

        public final void Wwwwwwww() {
            for (int beginBroadcast = this.f5283Wwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwww.beginBroadcast() - 1; beginBroadcast >= 0; beginBroadcast--) {
                try {
                    this.f5283Wwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwww.getBroadcastItem(beginBroadcast).Kkkk();
                } catch (RemoteException unused) {
                }
            }
            this.f5283Wwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwww.finishBroadcast();
            this.f5283Wwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwww.kill();
        }

        public final void Wwwwwwwww(MediaMetadataCompat mediaMetadataCompat) {
            for (int beginBroadcast = this.f5283Wwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwww.beginBroadcast() - 1; beginBroadcast >= 0; beginBroadcast--) {
                try {
                    this.f5283Wwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwww.getBroadcastItem(beginBroadcast).Illllllllllllll(mediaMetadataCompat);
                } catch (RemoteException unused) {
                }
            }
            this.f5283Wwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwww.finishBroadcast();
        }

        public void Wwwwwwwwww(PendingIntent pendingIntent, ComponentName componentName) {
            this.f5280Wwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwww.registerMediaButtonEventReceiver(componentName);
        }

        public void Wwwwwwwwwww(int i, int i2, int i3, Object obj, Bundle bundle) {
            synchronized (this.f5291Wwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwww) {
                C3899Wwwwwwwwwwwwwwwwwwwwwwwwwwwwwww wwwwwwwwwwwwwwwwwwwwwwwwwwwwwww = this.f5286Wwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwww;
                if (wwwwwwwwwwwwwwwwwwwwwwwwwwwwwww != null) {
                    Message obtainMessage = wwwwwwwwwwwwwwwwwwwwwwwwwwwwwww.obtainMessage(i, i2, i3, obj);
                    Bundle bundle2 = new Bundle();
                    int callingUid = Binder.getCallingUid();
                    bundle2.putInt("data_calling_uid", callingUid);
                    bundle2.putString("data_calling_pkg", Wwwwwwwwwwwwww(callingUid));
                    int callingPid = Binder.getCallingPid();
                    if (callingPid > 0) {
                        bundle2.putInt("data_calling_pid", callingPid);
                    } else {
                        bundle2.putInt("data_calling_pid", -1);
                    }
                    if (bundle != null) {
                        bundle2.putBundle("data_extras", bundle);
                    }
                    obtainMessage.setData(bundle2);
                    obtainMessage.sendToTarget();
                }
            }
        }

        public int Wwwwwwwwwwww(long j) {
            int i = (1 & j) != 0 ? 32 : 0;
            if ((2 & j) != 0) {
                i |= 16;
            }
            if ((4 & j) != 0) {
                i |= 4;
            }
            if ((8 & j) != 0) {
                i |= 2;
            }
            if ((16 & j) != 0) {
                i |= 1;
            }
            if ((32 & j) != 0) {
                i |= 128;
            }
            if ((64 & j) != 0) {
                i |= 64;
            }
            return (j & 512) != 0 ? i | 8 : i;
        }

        public int Wwwwwwwwwwwww(int i) {
            switch (i) {
                case 0:
                    return 0;
                case 1:
                    return 1;
                case 2:
                    return 2;
                case 3:
                    return 3;
                case 4:
                    return 4;
                case 5:
                    return 5;
                case 6:
                case 8:
                    return 8;
                case 7:
                    return 9;
                case 9:
                    return 7;
                case 10:
                case 11:
                    return 6;
                default:
                    return -1;
            }
        }

        public String Wwwwwwwwwwwwww(int i) {
            String nameForUid = this.f5279Wwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwww.getPackageManager().getNameForUid(i);
            return TextUtils.isEmpty(nameForUid) ? "android.media.session.MediaController" : nameForUid;
        }

        public RemoteControlClient.MetadataEditor Wwwwwwwwwwwwwww(Bundle bundle) {
            RemoteControlClient.MetadataEditor editMetadata = this.f5281Wwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwww.editMetadata(true);
            if (bundle == null) {
                return editMetadata;
            }
            if (bundle.containsKey("android.media.metadata.ART")) {
                Bitmap bitmap = (Bitmap) bundle.getParcelable("android.media.metadata.ART");
                if (bitmap != null) {
                    bitmap = bitmap.copy(bitmap.getConfig(), false);
                }
                editMetadata.putBitmap(100, bitmap);
            } else if (bundle.containsKey("android.media.metadata.ALBUM_ART")) {
                Bitmap bitmap2 = (Bitmap) bundle.getParcelable("android.media.metadata.ALBUM_ART");
                if (bitmap2 != null) {
                    bitmap2 = bitmap2.copy(bitmap2.getConfig(), false);
                }
                editMetadata.putBitmap(100, bitmap2);
            }
            if (bundle.containsKey("android.media.metadata.ALBUM")) {
                editMetadata.putString(1, bundle.getString("android.media.metadata.ALBUM"));
            }
            if (bundle.containsKey("android.media.metadata.ALBUM_ARTIST")) {
                editMetadata.putString(13, bundle.getString("android.media.metadata.ALBUM_ARTIST"));
            }
            if (bundle.containsKey("android.media.metadata.ARTIST")) {
                editMetadata.putString(2, bundle.getString("android.media.metadata.ARTIST"));
            }
            if (bundle.containsKey("android.media.metadata.AUTHOR")) {
                editMetadata.putString(3, bundle.getString("android.media.metadata.AUTHOR"));
            }
            if (bundle.containsKey("android.media.metadata.COMPILATION")) {
                editMetadata.putString(15, bundle.getString("android.media.metadata.COMPILATION"));
            }
            if (bundle.containsKey("android.media.metadata.COMPOSER")) {
                editMetadata.putString(4, bundle.getString("android.media.metadata.COMPOSER"));
            }
            if (bundle.containsKey("android.media.metadata.DATE")) {
                editMetadata.putString(5, bundle.getString("android.media.metadata.DATE"));
            }
            if (bundle.containsKey("android.media.metadata.DISC_NUMBER")) {
                editMetadata.putLong(14, bundle.getLong("android.media.metadata.DISC_NUMBER"));
            }
            if (bundle.containsKey("android.media.metadata.DURATION")) {
                editMetadata.putLong(9, bundle.getLong("android.media.metadata.DURATION"));
            }
            if (bundle.containsKey("android.media.metadata.GENRE")) {
                editMetadata.putString(6, bundle.getString("android.media.metadata.GENRE"));
            }
            if (bundle.containsKey("android.media.metadata.TITLE")) {
                editMetadata.putString(7, bundle.getString("android.media.metadata.TITLE"));
            }
            if (bundle.containsKey("android.media.metadata.TRACK_NUMBER")) {
                editMetadata.putLong(0, bundle.getLong("android.media.metadata.TRACK_NUMBER"));
            }
            if (bundle.containsKey("android.media.metadata.WRITER")) {
                editMetadata.putString(11, bundle.getString("android.media.metadata.WRITER"));
            }
            return editMetadata;
        }

        public void Wwwwwwwwwwwwwwww(int i, int i2) {
            if (this.f18076Wwwwwwwwwwwwwwwwwwwwwwwwwwwwww == 2) {
                C1622Wwwwwwwwwwwwwwwwwwwwwwwwwwwwww wwwwwwwwwwwwwwwwwwwwwwwwwwwwww = this.f5275Wwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwww;
                if (wwwwwwwwwwwwwwwwwwwwwwwwwwwwww != null) {
                    wwwwwwwwwwwwwwwwwwwwwwwwwwwwww.Wwwwwwwwwwwwwwwwwwwwwwwwwwwwww(i);
                    return;
                }
                return;
            }
            this.f5280Wwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwww.adjustStreamVolume(this.f18075Wwwwwwwwwwwwwwwwwwwwwwwwwwwww, i, i2);
        }

        public C3913Wwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwww Wwwwwwwwwwwwwwwww() {
            C3913Wwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwww wwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwww;
            synchronized (this.f5291Wwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwww) {
                wwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwww = this.f5288Wwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwww;
            }
            return wwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwww;
        }

        public void Wwwwwwwwwwwwwwwwww(PendingIntent pendingIntent) {
            synchronized (this.f5291Wwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwww) {
                this.f5270Wwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwww = pendingIntent;
            }
        }

        public Token Wwwwwwwwwwwwwwwwwww() {
            return this.f5285Wwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwww;
        }

        public C1630Wwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwww Wwwwwwwwwwwwwwwwwwww() {
            C1630Wwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwww wwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwww;
            synchronized (this.f5291Wwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwww) {
                wwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwww = this.f5276Wwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwww;
            }
            return wwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwww;
        }

        public void Wwwwwwwwwwwwwwwwwwwww(int i) {
            synchronized (this.f5291Wwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwww) {
                this.f18080Wwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwww = i | 1 | 2;
            }
        }

        public String Wwwwwwwwwwwwwwwwwwwwww() {
            return null;
        }

        public Object Wwwwwwwwwwwwwwwwwwwwwww() {
            return null;
        }

        public void Wwwwwwwwwwwwwwwwwwwwwwww(boolean z) {
            if (z != this.f5273Wwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwww) {
                this.f5273Wwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwww = z;
                Kkkkkkkkkkkkkkkkkkkkkkkkkk();
            }
        }

        public void Wwwwwwwwwwwwwwwwwwwwwwwww(int i) {
            C1622Wwwwwwwwwwwwwwwwwwwwwwwwwwwwww wwwwwwwwwwwwwwwwwwwwwwwwwwwwww = this.f5275Wwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwww;
            if (wwwwwwwwwwwwwwwwwwwwwwwwwwwwww != null) {
                wwwwwwwwwwwwwwwwwwwwwwwwwwwwww.Wwwwwwwwwwwwwwwwwwwwwwwwwwww((C1622Wwwwwwwwwwwwwwwwwwwwwwwwwwwwww.C1623Wwwwwwwwwwwwwwwwwwwwwwwwwwwwwww) null);
            }
            this.f18075Wwwwwwwwwwwwwwwwwwwwwwwwwwwww = i;
            this.f18076Wwwwwwwwwwwwwwwwwwwwwwwwwwwwww = 1;
            int i2 = this.f18076Wwwwwwwwwwwwwwwwwwwwwwwwwwwwww;
            int i3 = this.f18075Wwwwwwwwwwwwwwwwwwwwwwwwwwwww;
            Wwwwww(new ParcelableVolumeInfo(i2, i3, 2, this.f5280Wwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwww.getStreamMaxVolume(i3), this.f5280Wwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwww.getStreamVolume(this.f18075Wwwwwwwwwwwwwwwwwwwwwwwwwwwww)));
        }

        public void Wwwwwwwwwwwwwwwwwwwwwwwwww(PlaybackStateCompat playbackStateCompat) {
            synchronized (this.f5291Wwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwww) {
                this.f5289Wwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwww = playbackStateCompat;
            }
            Wwwwwww(playbackStateCompat);
            if (this.f5273Wwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwww) {
                if (playbackStateCompat == null) {
                    this.f5281Wwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwww.setPlaybackState(0);
                    this.f5281Wwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwww.setTransportControlFlags(0);
                    return;
                }
                Wwwww(playbackStateCompat);
                this.f5281Wwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwww.setTransportControlFlags(Wwwwwwwwwwww(playbackStateCompat.Wwwwwwwwwwwwwwwwwwwwwwwwwwwwwwww()));
            }
        }

        public PlaybackStateCompat Wwwwwwwwwwwwwwwwwwwwwwwwwww() {
            PlaybackStateCompat playbackStateCompat;
            synchronized (this.f5291Wwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwww) {
                playbackStateCompat = this.f5289Wwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwww;
            }
            return playbackStateCompat;
        }

        public void Wwwwwwwwwwwwwwwwwwwwwwwwwwww(PendingIntent pendingIntent) {
        }

        /* JADX WARNING: Removed duplicated region for block: B:18:0x0030  */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public void Wwwwwwwwwwwwwwwwwwwwwwwwwwwww(android.support.p069v4.media.session.MediaSessionCompat.C3913Wwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwww r5, android.os.Handler r6) {
            /*
                r4 = this;
                java.lang.Object r0 = r4.f5291Wwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwww
                monitor-enter(r0)
                android.support.v4.media.session.MediaSessionCompat$Wwwwwwwwwwwwwwwwwwwwwwwww$Wwwwwwwwwwwwwwwwwwwwwwwwwwwwwww r1 = r4.f5286Wwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwww     // Catch:{ all -> 0x0037 }
                r2 = 0
                if (r1 == 0) goto L_0x000b
                r1.removeCallbacksAndMessages(r2)     // Catch:{ all -> 0x0037 }
            L_0x000b:
                if (r5 == 0) goto L_0x001a
                if (r6 != 0) goto L_0x0010
                goto L_0x001a
            L_0x0010:
                android.support.v4.media.session.MediaSessionCompat$Wwwwwwwwwwwwwwwwwwwwwwwww$Wwwwwwwwwwwwwwwwwwwwwwwwwwwwwww r1 = new android.support.v4.media.session.MediaSessionCompat$Wwwwwwwwwwwwwwwwwwwwwwwww$Wwwwwwwwwwwwwwwwwwwwwwwwwwwwwww     // Catch:{ all -> 0x0037 }
                android.os.Looper r3 = r6.getLooper()     // Catch:{ all -> 0x0037 }
                r1.<init>(r3)     // Catch:{ all -> 0x0037 }
                goto L_0x001b
            L_0x001a:
                r1 = r2
            L_0x001b:
                r4.f5286Wwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwww = r1     // Catch:{ all -> 0x0037 }
                android.support.v4.media.session.MediaSessionCompat$Wwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwww r1 = r4.f5288Wwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwww     // Catch:{ all -> 0x0037 }
                if (r1 == r5) goto L_0x002a
                android.support.v4.media.session.MediaSessionCompat$Wwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwww r1 = r4.f5288Wwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwww     // Catch:{ all -> 0x0037 }
                if (r1 == 0) goto L_0x002a
                android.support.v4.media.session.MediaSessionCompat$Wwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwww r1 = r4.f5288Wwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwww     // Catch:{ all -> 0x0037 }
                r1.Wwwww(r2, r2)     // Catch:{ all -> 0x0037 }
            L_0x002a:
                r4.f5288Wwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwww = r5     // Catch:{ all -> 0x0037 }
                android.support.v4.media.session.MediaSessionCompat$Wwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwww r5 = r4.f5288Wwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwww     // Catch:{ all -> 0x0037 }
                if (r5 == 0) goto L_0x0035
                android.support.v4.media.session.MediaSessionCompat$Wwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwww r5 = r4.f5288Wwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwww     // Catch:{ all -> 0x0037 }
                r5.Wwwww(r4, r6)     // Catch:{ all -> 0x0037 }
            L_0x0035:
                monitor-exit(r0)     // Catch:{ all -> 0x0037 }
                return
            L_0x0037:
                r5 = move-exception
                monitor-exit(r0)     // Catch:{ all -> 0x0037 }
                throw r5
            */
            throw new UnsupportedOperationException("Method not decompiled: android.support.p069v4.media.session.MediaSessionCompat.C3898Wwwwwwwwwwwwwwwwwwwwwwwww.Wwwwwwwwwwwwwwwwwwwwwwwwwwwww(android.support.v4.media.session.MediaSessionCompat$Wwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwww, android.os.Handler):void");
        }

        public void Wwwwwwwwwwwwwwwwwwwwwwwwwwwwww(C1622Wwwwwwwwwwwwwwwwwwwwwwwwwwwwww wwwwwwwwwwwwwwwwwwwwwwwwwwwwww) {
            if (wwwwwwwwwwwwwwwwwwwwwwwwwwwwww != null) {
                C1622Wwwwwwwwwwwwwwwwwwwwwwwwwwwwww wwwwwwwwwwwwwwwwwwwwwwwwwwwwww2 = this.f5275Wwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwww;
                if (wwwwwwwwwwwwwwwwwwwwwwwwwwwwww2 != null) {
                    wwwwwwwwwwwwwwwwwwwwwwwwwwwwww2.Wwwwwwwwwwwwwwwwwwwwwwwwwwww((C1622Wwwwwwwwwwwwwwwwwwwwwwwwwwwwww.C1623Wwwwwwwwwwwwwwwwwwwwwwwwwwwwwww) null);
                }
                this.f18076Wwwwwwwwwwwwwwwwwwwwwwwwwwwwww = 2;
                this.f5275Wwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwww = wwwwwwwwwwwwwwwwwwwwwwwwwwwwww;
                Wwwwww(new ParcelableVolumeInfo(this.f18076Wwwwwwwwwwwwwwwwwwwwwwwwwwwwww, this.f18075Wwwwwwwwwwwwwwwwwwwwwwwwwwwww, this.f5275Wwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwww.Wwwwwwwwwwwwwwwwwwwwwwwwwwwwwwww(), this.f5275Wwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwww.Wwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwww(), this.f5275Wwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwww.Wwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwww()));
                wwwwwwwwwwwwwwwwwwwwwwwwwwwwww.Wwwwwwwwwwwwwwwwwwwwwwwwwwww(this.f5274Wwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwww);
                return;
            }
            throw new IllegalArgumentException("volumeProvider may not be null");
        }

        public void Wwwwwwwwwwwwwwwwwwwwwwwwwwwwwww(C1630Wwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwww wwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwww) {
            synchronized (this.f5291Wwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwww) {
                this.f5276Wwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwww = wwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwww;
            }
        }

        public boolean Wwwwwwwwwwwwwwwwwwwwwwwwwwwwwwww() {
            return this.f5273Wwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwww;
        }

        public void Wwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwww() {
            this.f5273Wwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwww = false;
            this.f5294Wwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwww = true;
            Kkkkkkkkkkkkkkkkkkkkkkkkkk();
            Wwwwwwww();
            Wwwwwwwwwwwwwwwwwwwwwwwwwwwww((C3913Wwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwww) null, (Handler) null);
        }

        public void Wwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwww(MediaMetadataCompat mediaMetadataCompat) {
            Bundle bundle;
            if (mediaMetadataCompat != null) {
                mediaMetadataCompat = new MediaMetadataCompat.C3874Wwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwww(mediaMetadataCompat, MediaSessionCompat.f18069Wwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwww).Wwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwww();
            }
            synchronized (this.f5291Wwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwww) {
                this.f5284Wwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwww = mediaMetadataCompat;
            }
            Wwwwwwwww(mediaMetadataCompat);
            if (this.f5273Wwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwww) {
                if (mediaMetadataCompat == null) {
                    bundle = null;
                } else {
                    bundle = mediaMetadataCompat.Wwwwwwwwwwwwwwwwwwwwwwwwwww();
                }
                Wwwwwwwwwwwwwww(bundle).apply();
            }
        }
    }

    /* renamed from: android.support.v4.media.session.MediaSessionCompat$Wwwwwwwwwwwwwwwwwwwwwwwwww */
    public static class C3903Wwwwwwwwwwwwwwwwwwwwwwwwww extends C3904Wwwwwwwwwwwwwwwwwwwwwwwwwww {
        public C3903Wwwwwwwwwwwwwwwwwwwwwwwwww(Context context, String str, C1306Wwwwwwwwwwwwwwwwwwwwwwwwwwwwwww wwwwwwwwwwwwwwwwwwwwwwwwwwwwwww, Bundle bundle) {
            super(context, str, wwwwwwwwwwwwwwwwwwwwwwwwwwwwwww, bundle);
        }

        public MediaSession Wwwwwwwwwwwwwwww(Context context, String str, Bundle bundle) {
            return new MediaSession(context, str, bundle);
        }
    }

    /* renamed from: android.support.v4.media.session.MediaSessionCompat$Wwwwwwwwwwwwwwwwwwwwwwwwwww */
    public static class C3904Wwwwwwwwwwwwwwwwwwwwwwwwwww extends C3905Wwwwwwwwwwwwwwwwwwwwwwwwwwww {
        public C3904Wwwwwwwwwwwwwwwwwwwwwwwwwww(Context context, String str, C1306Wwwwwwwwwwwwwwwwwwwwwwwwwwwwwww wwwwwwwwwwwwwwwwwwwwwwwwwwwwwww, Bundle bundle) {
            super(context, str, wwwwwwwwwwwwwwwwwwwwwwwwwwwwwww, bundle);
        }

        public final C1630Wwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwww Wwwwwwwwwwwwwwwwwwww() {
            return new C1630Wwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwww(this.f5299Wwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwww.getCurrentControllerInfo());
        }

        public void Wwwwwwwwwwwwwwwwwwwwwwwwwwwwwww(C1630Wwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwww wwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwww) {
        }
    }

    /* renamed from: android.support.v4.media.session.MediaSessionCompat$Wwwwwwwwwwwwwwwwwwwwwwwwwwww */
    public static class C3905Wwwwwwwwwwwwwwwwwwwwwwwwwwww extends C3906Wwwwwwwwwwwwwwwwwwwwwwwwwwwww {
        public C3905Wwwwwwwwwwwwwwwwwwwwwwwwwwww(Context context, String str, C1306Wwwwwwwwwwwwwwwwwwwwwwwwwwwwwww wwwwwwwwwwwwwwwwwwwwwwwwwwwwwww, Bundle bundle) {
            super(context, str, wwwwwwwwwwwwwwwwwwwwwwwwwwwwwww, bundle);
        }
    }

    /* renamed from: android.support.v4.media.session.MediaSessionCompat$Wwwwwwwwwwwwwwwwwwwwwwwwwwwww */
    public static class C3906Wwwwwwwwwwwwwwwwwwwwwwwwwwwww implements C3912Wwwwwwwwwwwwwwwwwwwwwwwwwwwwwwww {

        /* renamed from: Wwwwwwwwwwwwwwwwwwwwwwwwwwwwwwww  reason: collision with root package name */
        public int f18085Wwwwwwwwwwwwwwwwwwwwwwwwwwwwwwww;

        /* renamed from: Wwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwww  reason: collision with root package name */
        public int f18086Wwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwww;

        /* renamed from: Wwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwww  reason: collision with other field name */
        public boolean f5297Wwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwww;

        /* renamed from: Wwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwww  reason: collision with root package name */
        public int f18087Wwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwww;

        /* renamed from: Wwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwww  reason: collision with other field name */
        public C1630Wwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwww f5298Wwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwww;

        /* renamed from: Wwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwww  reason: collision with other field name */
        public final MediaSession f5299Wwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwww;

        /* renamed from: Wwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwww  reason: collision with other field name */
        public Bundle f5300Wwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwww;

        /* renamed from: Wwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwww  reason: collision with other field name */
        public final RemoteCallbackList<C3926Wwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwww> f5301Wwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwww = new RemoteCallbackList<>();

        /* renamed from: Wwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwww  reason: collision with other field name */
        public MediaMetadataCompat f5302Wwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwww;

        /* renamed from: Wwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwww  reason: collision with other field name */
        public final Token f5303Wwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwww;

        /* renamed from: Wwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwww  reason: collision with other field name */
        public C3913Wwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwww f5304Wwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwww;

        /* renamed from: Wwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwww  reason: collision with other field name */
        public PlaybackStateCompat f5305Wwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwww;

        /* renamed from: Wwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwww  reason: collision with other field name */
        public final Object f5306Wwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwww = new Object();

        /* renamed from: Wwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwww  reason: collision with other field name */
        public List<QueueItem> f5307Wwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwww;

        /* renamed from: Wwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwww  reason: collision with other field name */
        public boolean f5308Wwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwww = false;

        /* renamed from: android.support.v4.media.session.MediaSessionCompat$Wwwwwwwwwwwwwwwwwwwwwwwwwwwww$Wwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwww */
        public class C3907Wwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwww extends C3923Wwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwww.C3924Wwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwww {
            public C3907Wwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwww() {
            }

            public void Cccc(int i) {
                throw new AssertionError();
            }

            public void Ccccc(String str, Bundle bundle, ResultReceiverWrapper resultReceiverWrapper) {
                throw new AssertionError();
            }

            public void Cccccccc(C3926Wwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwww wwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwww) {
                if (!C3906Wwwwwwwwwwwwwwwwwwwwwwwwwwwww.this.f5308Wwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwww) {
                    C3906Wwwwwwwwwwwwwwwwwwwwwwwwwwwww.this.f5301Wwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwww.register(wwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwww, new C1630Wwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwww("android.media.session.MediaController", Binder.getCallingPid(), Binder.getCallingUid()));
                }
            }

            public String IIllll() {
                throw new AssertionError();
            }

            public void IIlllllll() {
                throw new AssertionError();
            }

            public void Illl(Uri uri, Bundle bundle) {
                throw new AssertionError();
            }

            public void Illll(long j) {
                throw new AssertionError();
            }

            public void Illllllllllllllllllllllllll(float f) {
                throw new AssertionError();
            }

            public void Kkk(MediaDescriptionCompat mediaDescriptionCompat, int i) {
                throw new AssertionError();
            }

            public List<QueueItem> Kkkkkkkk() {
                return null;
            }

            public Bundle Kkkkkkkkkkkkkkkk() {
                if (C3906Wwwwwwwwwwwwwwwwwwwwwwwwwwwww.this.f5300Wwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwww == null) {
                    return null;
                }
                return new Bundle(C3906Wwwwwwwwwwwwwwwwwwwwwwwwwwwww.this.f5300Wwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwww);
            }

            public ParcelableVolumeInfo Kkkkkkkkkkkkkkkkk() {
                throw new AssertionError();
            }

            public void Kkkkkkkkkkkkkkkkkkk(String str, Bundle bundle) {
                throw new AssertionError();
            }

            public CharSequence Kkkkkkkkkkkkkkkkkkkkk() {
                throw new AssertionError();
            }

            public long Kkkkkkkkkkkkkkkkkkkkkkk() {
                throw new AssertionError();
            }

            public void Lllll(MediaDescriptionCompat mediaDescriptionCompat) {
                throw new AssertionError();
            }

            public boolean Llllllllllll(KeyEvent keyEvent) {
                throw new AssertionError();
            }

            /* renamed from: O0 */
            public void mo11021O0(int i, int i2, String str) {
                throw new AssertionError();
            }

            public boolean O00() {
                throw new AssertionError();
            }

            public void O000000() {
                throw new AssertionError();
            }

            public void OO000(int i, int i2, String str) {
                throw new AssertionError();
            }

            public boolean OO00000() {
                return false;
            }

            public void Ooooooooooo(RatingCompat ratingCompat, Bundle bundle) {
                throw new AssertionError();
            }

            public void QQO(Uri uri, Bundle bundle) {
                throw new AssertionError();
            }

            public void QQOOOOO(String str, Bundle bundle) {
                throw new AssertionError();
            }

            public void QQOOOOOOOOO(RatingCompat ratingCompat) {
                throw new AssertionError();
            }

            public boolean Sssss() {
                return C3906Wwwwwwwwwwwwwwwwwwwwwwwwwwwww.this.f5297Wwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwww;
            }

            public void Uuuuu(String str, Bundle bundle) {
                throw new AssertionError();
            }

            public int Www() {
                return C3906Wwwwwwwwwwwwwwwwwwwwwwwwwwwww.this.f18087Wwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwww;
            }

            public int Wwww() {
                return C3906Wwwwwwwwwwwwwwwwwwwwwwwwwwwww.this.f18086Wwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwww;
            }

            public void Wwwww(int i) {
                throw new AssertionError();
            }

            public MediaMetadataCompat Wwwwwww() {
                throw new AssertionError();
            }

            public void Wwwwwwwwwwwwwwwwwww() {
                throw new AssertionError();
            }

            public PlaybackStateCompat Wwwwwwwwwwwwwwwwwwwwwwwwwww() {
                C3906Wwwwwwwwwwwwwwwwwwwwwwwwwwwww wwwwwwwwwwwwwwwwwwwwwwwwwwwww = C3906Wwwwwwwwwwwwwwwwwwwwwwwwwwwww.this;
                return MediaSessionCompat.Wwwwwwwwwwwwwwwwwwwwwwwwwwwww(wwwwwwwwwwwwwwwwwwwwwwwwwwwww.f5305Wwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwww, wwwwwwwwwwwwwwwwwwwwwwwwwwwww.f5302Wwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwww);
            }

            public String Wwwwwwwwwwwwwwwwwwwwwwwwwwww() {
                throw new AssertionError();
            }

            public void Xxxx() {
                throw new AssertionError();
            }

            public void Xxxxxxx(boolean z) {
                throw new AssertionError();
            }

            public void Xxxxxxxx() {
                throw new AssertionError();
            }

            public void Xxxxxxxxxxx(boolean z) {
            }

            public PendingIntent Zzzz() {
                throw new AssertionError();
            }

            public void Zzzzzzzzz(int i) {
                throw new AssertionError();
            }

            /* renamed from: b */
            public void mo11045b(long j) {
                throw new AssertionError();
            }

            /* renamed from: d */
            public void mo11046d(String str, Bundle bundle) {
                throw new AssertionError();
            }

            /* renamed from: g */
            public void mo11047g(MediaDescriptionCompat mediaDescriptionCompat) {
                throw new AssertionError();
            }

            public Bundle getExtras() {
                throw new AssertionError();
            }

            /* renamed from: m */
            public void mo11049m(C3926Wwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwww wwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwww) {
                C3906Wwwwwwwwwwwwwwwwwwwwwwwwwwwww.this.f5301Wwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwww.unregister(wwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwww);
            }

            public void pause() {
                throw new AssertionError();
            }

            public void stop() {
                throw new AssertionError();
            }

            public void tooYoung() {
                throw new AssertionError();
            }

            /* renamed from: u */
            public void mo11053u(String str, Bundle bundle) {
                throw new AssertionError();
            }

            /* renamed from: v */
            public int mo11054v() {
                return C3906Wwwwwwwwwwwwwwwwwwwwwwwwwwwww.this.f18085Wwwwwwwwwwwwwwwwwwwwwwwwwwwwwwww;
            }
        }

        public C3906Wwwwwwwwwwwwwwwwwwwwwwwwwwwww(Context context, String str, C1306Wwwwwwwwwwwwwwwwwwwwwwwwwwwwwww wwwwwwwwwwwwwwwwwwwwwwwwwwwwwww, Bundle bundle) {
            MediaSession Wwwwwwwwwwwwwwww2 = Wwwwwwwwwwwwwwww(context, str, bundle);
            this.f5299Wwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwww = Wwwwwwwwwwwwwwww2;
            this.f5303Wwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwww = new Token(Wwwwwwwwwwwwwwww2.getSessionToken(), new C3907Wwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwww(), wwwwwwwwwwwwwwwwwwwwwwwwwwwwwww);
            this.f5300Wwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwww = bundle;
            Wwwwwwwwwwwwwwwwwwwww(3);
        }

        public MediaSession Wwwwwwwwwwwwwwww(Context context, String str, Bundle bundle) {
            return new MediaSession(context, str);
        }

        public C3913Wwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwww Wwwwwwwwwwwwwwwww() {
            C3913Wwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwww wwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwww;
            synchronized (this.f5306Wwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwww) {
                wwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwww = this.f5304Wwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwww;
            }
            return wwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwww;
        }

        public void Wwwwwwwwwwwwwwwwww(PendingIntent pendingIntent) {
            this.f5299Wwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwww.setSessionActivity(pendingIntent);
        }

        public Token Wwwwwwwwwwwwwwwwwww() {
            return this.f5303Wwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwww;
        }

        public C1630Wwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwww Wwwwwwwwwwwwwwwwwwww() {
            C1630Wwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwww wwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwww;
            synchronized (this.f5306Wwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwww) {
                wwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwww = this.f5298Wwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwww;
            }
            return wwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwww;
        }

        @SuppressLint({"WrongConstant"})
        public void Wwwwwwwwwwwwwwwwwwwww(int i) {
            this.f5299Wwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwww.setFlags(i | 1 | 2);
        }

        public String Wwwwwwwwwwwwwwwwwwwwww() {
            if (Build.VERSION.SDK_INT < 24) {
                return null;
            }
            try {
                return (String) this.f5299Wwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwww.getClass().getMethod("getCallingPackage", new Class[0]).invoke(this.f5299Wwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwww, new Object[0]);
            } catch (Exception e) {
                Log.e("MediaSessionCompat", "Cannot execute MediaSession.getCallingPackage()", e);
                return null;
            }
        }

        public Object Wwwwwwwwwwwwwwwwwwwwwww() {
            return null;
        }

        public void Wwwwwwwwwwwwwwwwwwwwwwww(boolean z) {
            this.f5299Wwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwww.setActive(z);
        }

        public void Wwwwwwwwwwwwwwwwwwwwwwwww(int i) {
            AudioAttributes.Builder builder = new AudioAttributes.Builder();
            builder.setLegacyStreamType(i);
            this.f5299Wwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwww.setPlaybackToLocal(builder.build());
        }

        public void Wwwwwwwwwwwwwwwwwwwwwwwwww(PlaybackStateCompat playbackStateCompat) {
            PlaybackState playbackState;
            this.f5305Wwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwww = playbackStateCompat;
            for (int beginBroadcast = this.f5301Wwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwww.beginBroadcast() - 1; beginBroadcast >= 0; beginBroadcast--) {
                try {
                    this.f5301Wwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwww.getBroadcastItem(beginBroadcast).Mmmmmmmmm(playbackStateCompat);
                } catch (RemoteException unused) {
                }
            }
            this.f5301Wwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwww.finishBroadcast();
            MediaSession mediaSession = this.f5299Wwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwww;
            if (playbackStateCompat == null) {
                playbackState = null;
            } else {
                playbackState = (PlaybackState) playbackStateCompat.Wwwwwwwwwwwwwwwwwwwwwwww();
            }
            mediaSession.setPlaybackState(playbackState);
        }

        public PlaybackStateCompat Wwwwwwwwwwwwwwwwwwwwwwwwwww() {
            return this.f5305Wwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwww;
        }

        public void Wwwwwwwwwwwwwwwwwwwwwwwwwwww(PendingIntent pendingIntent) {
            this.f5299Wwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwww.setMediaButtonReceiver(pendingIntent);
        }

        public void Wwwwwwwwwwwwwwwwwwwwwwwwwwwww(C3913Wwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwww wwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwww, Handler handler) {
            synchronized (this.f5306Wwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwww) {
                this.f5304Wwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwww = wwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwww;
                this.f5299Wwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwww.setCallback(wwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwww == null ? null : wwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwww.f18092Wwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwww, handler);
                if (wwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwww != null) {
                    wwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwww.Wwwww(this, handler);
                }
            }
        }

        public void Wwwwwwwwwwwwwwwwwwwwwwwwwwwwww(C1622Wwwwwwwwwwwwwwwwwwwwwwwwwwwwww wwwwwwwwwwwwwwwwwwwwwwwwwwwwww) {
            this.f5299Wwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwww.setPlaybackToRemote((VolumeProvider) wwwwwwwwwwwwwwwwwwwwwwwwwwwwww.Wwwwwwwwwwwwwwwwwwwwwwwwwwwwwww());
        }

        public void Wwwwwwwwwwwwwwwwwwwwwwwwwwwwwww(C1630Wwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwww wwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwww) {
            synchronized (this.f5306Wwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwww) {
                this.f5298Wwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwww = wwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwww;
            }
        }

        public boolean Wwwwwwwwwwwwwwwwwwwwwwwwwwwwwwww() {
            return this.f5299Wwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwww.isActive();
        }

        public void Wwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwww() {
            this.f5308Wwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwww = true;
            this.f5301Wwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwww.kill();
            if (Build.VERSION.SDK_INT == 27) {
                try {
                    Field declaredField = this.f5299Wwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwww.getClass().getDeclaredField("mCallback");
                    declaredField.setAccessible(true);
                    Handler handler = (Handler) declaredField.get(this.f5299Wwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwww);
                    if (handler != null) {
                        handler.removeCallbacksAndMessages((Object) null);
                    }
                } catch (Exception e) {
                    Log.w("MediaSessionCompat", "Exception happened while accessing MediaSession.mCallback.", e);
                }
            }
            this.f5299Wwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwww.setCallback((MediaSession.Callback) null);
            this.f5299Wwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwww.release();
        }

        public void Wwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwww(MediaMetadataCompat mediaMetadataCompat) {
            MediaMetadata mediaMetadata;
            this.f5302Wwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwww = mediaMetadataCompat;
            MediaSession mediaSession = this.f5299Wwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwww;
            if (mediaMetadataCompat == null) {
                mediaMetadata = null;
            } else {
                mediaMetadata = (MediaMetadata) mediaMetadataCompat.Wwwwwwwwwwwwwwwwww();
            }
            mediaSession.setMetadata(mediaMetadata);
        }
    }

    /* renamed from: android.support.v4.media.session.MediaSessionCompat$Wwwwwwwwwwwwwwwwwwwwwwwwwwwwww */
    public static class C3908Wwwwwwwwwwwwwwwwwwwwwwwwwwwwww extends C3910Wwwwwwwwwwwwwwwwwwwwwwwwwwwwwww {

        /* renamed from: android.support.v4.media.session.MediaSessionCompat$Wwwwwwwwwwwwwwwwwwwwwwwwwwwwww$Wwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwww */
        public class C3909Wwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwww implements RemoteControlClient.OnMetadataUpdateListener {
            public C3909Wwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwww() {
            }

            public void onMetadataUpdate(int i, Object obj) {
                if (i == 268435457 && (obj instanceof Rating)) {
                    C3908Wwwwwwwwwwwwwwwwwwwwwwwwwwwwww.this.Wwwwwwwwwww(19, -1, -1, RatingCompat.Wwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwww(obj), (Bundle) null);
                }
            }
        }

        public C3908Wwwwwwwwwwwwwwwwwwwwwwwwwwwwww(Context context, String str, ComponentName componentName, PendingIntent pendingIntent, C1306Wwwwwwwwwwwwwwwwwwwwwwwwwwwwwww wwwwwwwwwwwwwwwwwwwwwwwwwwwwwww, Bundle bundle) {
            super(context, str, componentName, pendingIntent, wwwwwwwwwwwwwwwwwwwwwwwwwwwwwww, bundle);
        }

        public int Wwwwwwwwwwww(long j) {
            int Wwwwwwwwwwww2 = super.Wwwwwwwwwwww(j);
            return (j & 128) != 0 ? Wwwwwwwwwwww2 | 512 : Wwwwwwwwwwww2;
        }

        public RemoteControlClient.MetadataEditor Wwwwwwwwwwwwwww(Bundle bundle) {
            RemoteControlClient.MetadataEditor Wwwwwwwwwwwwwww2 = super.Wwwwwwwwwwwwwww(bundle);
            PlaybackStateCompat playbackStateCompat = this.f5289Wwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwww;
            if (((playbackStateCompat == null ? 0 : playbackStateCompat.Wwwwwwwwwwwwwwwwwwwwwwwwwwwwwwww()) & 128) != 0) {
                Wwwwwwwwwwwwwww2.addEditableKey(268435457);
            }
            if (bundle == null) {
                return Wwwwwwwwwwwwwww2;
            }
            if (bundle.containsKey("android.media.metadata.YEAR")) {
                Wwwwwwwwwwwwwww2.putLong(8, bundle.getLong("android.media.metadata.YEAR"));
            }
            if (bundle.containsKey("android.media.metadata.RATING")) {
                Wwwwwwwwwwwwwww2.putObject(C3181Wwwwwwwwwwwwwwwwwwwwwwwwwwwwwww.f16571Illllll, bundle.getParcelable("android.media.metadata.RATING"));
            }
            if (bundle.containsKey("android.media.metadata.USER_RATING")) {
                Wwwwwwwwwwwwwww2.putObject(268435457, bundle.getParcelable("android.media.metadata.USER_RATING"));
            }
            return Wwwwwwwwwwwwwww2;
        }

        public void Wwwwwwwwwwwwwwwwwwwwwwwwwwwww(C3913Wwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwww wwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwww, Handler handler) {
            super.Wwwwwwwwwwwwwwwwwwwwwwwwwwwww(wwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwww, handler);
            if (wwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwww == null) {
                this.f5281Wwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwww.setMetadataUpdateListener((RemoteControlClient.OnMetadataUpdateListener) null);
                return;
            }
            this.f5281Wwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwww.setMetadataUpdateListener(new C3909Wwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwww());
        }
    }

    /* renamed from: android.support.v4.media.session.MediaSessionCompat$Wwwwwwwwwwwwwwwwwwwwwwwwwwwwwww */
    public static class C3910Wwwwwwwwwwwwwwwwwwwwwwwwwwwwwww extends C3898Wwwwwwwwwwwwwwwwwwwwwwwww {

        /* renamed from: Wwwwwwwwwwwwwwwwwwwwwwwwwwwwwww  reason: collision with root package name */
        public static boolean f18090Wwwwwwwwwwwwwwwwwwwwwwwwwwwwwww = true;

        /* renamed from: android.support.v4.media.session.MediaSessionCompat$Wwwwwwwwwwwwwwwwwwwwwwwwwwwwwww$Wwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwww */
        public class C3911Wwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwww implements RemoteControlClient.OnPlaybackPositionUpdateListener {
            public C3911Wwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwww() {
            }

            public void onPlaybackPositionUpdate(long j) {
                C3910Wwwwwwwwwwwwwwwwwwwwwwwwwwwwwww.this.Wwwwwwwwwww(18, -1, -1, Long.valueOf(j), (Bundle) null);
            }
        }

        public C3910Wwwwwwwwwwwwwwwwwwwwwwwwwwwwwww(Context context, String str, ComponentName componentName, PendingIntent pendingIntent, C1306Wwwwwwwwwwwwwwwwwwwwwwwwwwwwwww wwwwwwwwwwwwwwwwwwwwwwwwwwwwwww, Bundle bundle) {
            super(context, str, componentName, pendingIntent, wwwwwwwwwwwwwwwwwwwwwwwwwwwwwww, bundle);
        }

        public void Www(PendingIntent pendingIntent, ComponentName componentName) {
            if (f18090Wwwwwwwwwwwwwwwwwwwwwwwwwwwwwww) {
                this.f5280Wwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwww.unregisterMediaButtonEventReceiver(pendingIntent);
            } else {
                super.Www(pendingIntent, componentName);
            }
        }

        public void Wwwww(PlaybackStateCompat playbackStateCompat) {
            long Wwwwwwwwwwwwwwwwwwwwwww2 = playbackStateCompat.Wwwwwwwwwwwwwwwwwwwwwww();
            float Wwwwwwwwwwwwwwwwwwwwwwwwwww2 = playbackStateCompat.Wwwwwwwwwwwwwwwwwwwwwwwwwww();
            long Wwwwwwwwwwwwwwwwwwwwwwwwwwwwww2 = playbackStateCompat.Wwwwwwwwwwwwwwwwwwwwwwwwwwwwww();
            long elapsedRealtime = SystemClock.elapsedRealtime();
            if (playbackStateCompat.Wwwwwwwwwwwwwwwwww() == 3) {
                long j = 0;
                if (Wwwwwwwwwwwwwwwwwwwwwww2 > 0) {
                    if (Wwwwwwwwwwwwwwwwwwwwwwwwwwwwww2 > 0) {
                        j = elapsedRealtime - Wwwwwwwwwwwwwwwwwwwwwwwwwwwwww2;
                        if (Wwwwwwwwwwwwwwwwwwwwwwwwwww2 > 0.0f && Wwwwwwwwwwwwwwwwwwwwwwwwwww2 != 1.0f) {
                            j = (long) (((float) j) * Wwwwwwwwwwwwwwwwwwwwwwwwwww2);
                        }
                    }
                    Wwwwwwwwwwwwwwwwwwwwwww2 += j;
                }
            }
            this.f5281Wwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwww.setPlaybackState(Wwwwwwwwwwwww(playbackStateCompat.Wwwwwwwwwwwwwwwwww()), Wwwwwwwwwwwwwwwwwwwwwww2, Wwwwwwwwwwwwwwwwwwwwwwwwwww2);
        }

        public void Wwwwwwwwww(PendingIntent pendingIntent, ComponentName componentName) {
            if (f18090Wwwwwwwwwwwwwwwwwwwwwwwwwwwwwww) {
                try {
                    this.f5280Wwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwww.registerMediaButtonEventReceiver(pendingIntent);
                } catch (NullPointerException unused) {
                    Log.w("MediaSessionCompat", "Unable to register media button event receiver with PendingIntent, falling back to ComponentName.");
                    f18090Wwwwwwwwwwwwwwwwwwwwwwwwwwwwwww = false;
                }
            }
            if (!f18090Wwwwwwwwwwwwwwwwwwwwwwwwwwwwwww) {
                super.Wwwwwwwwww(pendingIntent, componentName);
            }
        }

        public int Wwwwwwwwwwww(long j) {
            int Wwwwwwwwwwww2 = super.Wwwwwwwwwwww(j);
            return (j & 256) != 0 ? Wwwwwwwwwwww2 | 256 : Wwwwwwwwwwww2;
        }

        public void Wwwwwwwwwwwwwwwwwwwwwwwwwwwww(C3913Wwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwww wwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwww, Handler handler) {
            super.Wwwwwwwwwwwwwwwwwwwwwwwwwwwww(wwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwww, handler);
            if (wwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwww == null) {
                this.f5281Wwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwww.setPlaybackPositionUpdateListener((RemoteControlClient.OnPlaybackPositionUpdateListener) null);
                return;
            }
            this.f5281Wwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwww.setPlaybackPositionUpdateListener(new C3911Wwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwww());
        }
    }

    /* renamed from: android.support.v4.media.session.MediaSessionCompat$Wwwwwwwwwwwwwwwwwwwwwwwwwwwwwwww */
    public interface C3912Wwwwwwwwwwwwwwwwwwwwwwwwwwwwwwww {
        C3913Wwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwww Wwwwwwwwwwwwwwwww();

        void Wwwwwwwwwwwwwwwwww(PendingIntent pendingIntent);

        Token Wwwwwwwwwwwwwwwwwww();

        C1630Wwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwww Wwwwwwwwwwwwwwwwwwww();

        void Wwwwwwwwwwwwwwwwwwwww(int i);

        String Wwwwwwwwwwwwwwwwwwwwww();

        Object Wwwwwwwwwwwwwwwwwwwwwww();

        void Wwwwwwwwwwwwwwwwwwwwwwww(boolean z);

        void Wwwwwwwwwwwwwwwwwwwwwwwww(int i);

        void Wwwwwwwwwwwwwwwwwwwwwwwwww(PlaybackStateCompat playbackStateCompat);

        PlaybackStateCompat Wwwwwwwwwwwwwwwwwwwwwwwwwww();

        void Wwwwwwwwwwwwwwwwwwwwwwwwwwww(PendingIntent pendingIntent);

        void Wwwwwwwwwwwwwwwwwwwwwwwwwwwww(C3913Wwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwww wwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwww, Handler handler);

        void Wwwwwwwwwwwwwwwwwwwwwwwwwwwwww(C1622Wwwwwwwwwwwwwwwwwwwwwwwwwwwwww wwwwwwwwwwwwwwwwwwwwwwwwwwwwww);

        void Wwwwwwwwwwwwwwwwwwwwwwwwwwwwwww(C1630Wwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwww wwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwww);

        boolean Wwwwwwwwwwwwwwwwwwwwwwwwwwwwwwww();

        void Wwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwww();

        void Wwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwww(MediaMetadataCompat mediaMetadataCompat);
    }

    /* renamed from: android.support.v4.media.session.MediaSessionCompat$Wwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwww */
    public static abstract class C3913Wwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwww {

        /* renamed from: Wwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwww  reason: collision with root package name */
        public final MediaSession.Callback f18092Wwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwww;

        /* renamed from: Wwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwww  reason: collision with other field name */
        public C3915Wwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwww f5309Wwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwww;

        /* renamed from: Wwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwww  reason: collision with other field name */
        public final Object f5310Wwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwww = new Object();

        /* renamed from: Wwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwww  reason: collision with other field name */
        public WeakReference<C3912Wwwwwwwwwwwwwwwwwwwwwwwwwwwwwwww> f5311Wwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwww;

        /* renamed from: Wwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwww  reason: collision with other field name */
        public boolean f5312Wwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwww;

        /* renamed from: android.support.v4.media.session.MediaSessionCompat$Wwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwww$Wwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwww */
        public class C3914Wwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwww extends MediaSession.Callback {
            public C3914Wwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwww() {
            }

            public final void Wwwwwwwwwwwwwwwwwwwwwwwwwwwwwwww(C3912Wwwwwwwwwwwwwwwwwwwwwwwwwwwwwwww wwwwwwwwwwwwwwwwwwwwwwwwwwwwwwww) {
                if (Build.VERSION.SDK_INT < 28) {
                    String Wwwwwwwwwwwwwwwwwwwwww2 = wwwwwwwwwwwwwwwwwwwwwwwwwwwwwwww.Wwwwwwwwwwwwwwwwwwwwww();
                    if (TextUtils.isEmpty(Wwwwwwwwwwwwwwwwwwwwww2)) {
                        Wwwwwwwwwwwwwwwwwwwwww2 = "android.media.session.MediaController";
                    }
                    wwwwwwwwwwwwwwwwwwwwwwwwwwwwwwww.Wwwwwwwwwwwwwwwwwwwwwwwwwwwwwww(new C1630Wwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwww(Wwwwwwwwwwwwwwwwwwwwww2, -1, -1));
                }
            }

            public final C3906Wwwwwwwwwwwwwwwwwwwwwwwwwwwww Wwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwww() {
                C3906Wwwwwwwwwwwwwwwwwwwwwwwwwwwww wwwwwwwwwwwwwwwwwwwwwwwwwwwww;
                synchronized (C3913Wwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwww.this.f5310Wwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwww) {
                    wwwwwwwwwwwwwwwwwwwwwwwwwwwww = (C3906Wwwwwwwwwwwwwwwwwwwwwwwwwwwww) C3913Wwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwww.this.f5311Wwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwww.get();
                }
                if (wwwwwwwwwwwwwwwwwwwwwwwwwwwww == null || C3913Wwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwww.this != wwwwwwwwwwwwwwwwwwwwwwwwwwwww.Wwwwwwwwwwwwwwwww()) {
                    return null;
                }
                return wwwwwwwwwwwwwwwwwwwwwwwwwwwww;
            }

            public final void Wwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwww(C3912Wwwwwwwwwwwwwwwwwwwwwwwwwwwwwwww wwwwwwwwwwwwwwwwwwwwwwwwwwwwwwww) {
                wwwwwwwwwwwwwwwwwwwwwwwwwwwwwwww.Wwwwwwwwwwwwwwwwwwwwwwwwwwwwwww((C1630Wwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwww) null);
            }

            /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v1, resolved type: android.support.v4.media.session.MediaSessionCompat$QueueItem} */
            /* JADX WARNING: type inference failed for: r2v0 */
            /* JADX WARNING: type inference failed for: r2v4, types: [android.os.IBinder] */
            /* JADX WARNING: type inference failed for: r2v6 */
            /* JADX WARNING: type inference failed for: r2v7 */
            /* JADX WARNING: Multi-variable type inference failed */
            /* Code decompiled incorrectly, please refer to instructions dump. */
            public void onCommand(java.lang.String r6, android.os.Bundle r7, android.os.ResultReceiver r8) {
                /*
                    r5 = this;
                    android.support.v4.media.session.MediaSessionCompat$Wwwwwwwwwwwwwwwwwwwwwwwwwwwww r0 = r5.Wwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwww()
                    if (r0 != 0) goto L_0x0007
                    return
                L_0x0007:
                    android.support.p069v4.media.session.MediaSessionCompat.Wwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwww(r7)
                    r5.Wwwwwwwwwwwwwwwwwwwwwwwwwwwwwwww(r0)
                    java.lang.String r1 = "android.support.v4.media.session.command.GET_EXTRA_BINDER"
                    boolean r1 = r6.equals(r1)     // Catch:{ BadParcelableException -> 0x00b8 }
                    r2 = 0
                    if (r1 == 0) goto L_0x003e
                    android.os.Bundle r6 = new android.os.Bundle     // Catch:{ BadParcelableException -> 0x00b8 }
                    r6.<init>()     // Catch:{ BadParcelableException -> 0x00b8 }
                    android.support.v4.media.session.MediaSessionCompat$Token r7 = r0.Wwwwwwwwwwwwwwwwwww()     // Catch:{ BadParcelableException -> 0x00b8 }
                    android.support.v4.media.session.Wwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwww r1 = r7.Wwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwww()     // Catch:{ BadParcelableException -> 0x00b8 }
                    java.lang.String r3 = "android.support.v4.media.session.EXTRA_BINDER"
                    if (r1 != 0) goto L_0x0028
                    goto L_0x002c
                L_0x0028:
                    android.os.IBinder r2 = r1.asBinder()     // Catch:{ BadParcelableException -> 0x00b8 }
                L_0x002c:
                    Wwwww.C3155Wwwwwwwwwwwwwwwwwwwwwwwwwwwww.Wwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwww(r6, r3, r2)     // Catch:{ BadParcelableException -> 0x00b8 }
                    java.lang.String r1 = "android.support.v4.media.session.SESSION_TOKEN2"
                    Illlllllllllll.Wwwwwwwwwwwwwwwwwwwwwwwwwwwwwww r7 = r7.Wwwwwwwwwwwwwwwwwwwwwwwwwwwwwwww()     // Catch:{ BadParcelableException -> 0x00b8 }
                    Illlllllllllll.C1309Wwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwww.Wwwwwwwwwwwwwwwwwwwwwwwwwwwwwwww(r6, r1, r7)     // Catch:{ BadParcelableException -> 0x00b8 }
                    r7 = 0
                    r8.send(r7, r6)     // Catch:{ BadParcelableException -> 0x00b8 }
                    goto L_0x00bf
                L_0x003e:
                    java.lang.String r1 = "android.support.v4.media.session.command.ADD_QUEUE_ITEM"
                    boolean r1 = r6.equals(r1)     // Catch:{ BadParcelableException -> 0x00b8 }
                    java.lang.String r3 = "android.support.v4.media.session.command.ARGUMENT_MEDIA_DESCRIPTION"
                    if (r1 == 0) goto L_0x0054
                    android.support.v4.media.session.MediaSessionCompat$Wwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwww r6 = android.support.p069v4.media.session.MediaSessionCompat.C3913Wwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwww.this     // Catch:{ BadParcelableException -> 0x00b8 }
                    android.os.Parcelable r7 = r7.getParcelable(r3)     // Catch:{ BadParcelableException -> 0x00b8 }
                    android.support.v4.media.MediaDescriptionCompat r7 = (android.support.p069v4.media.MediaDescriptionCompat) r7     // Catch:{ BadParcelableException -> 0x00b8 }
                    r6.Wwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwww(r7)     // Catch:{ BadParcelableException -> 0x00b8 }
                    goto L_0x00bf
                L_0x0054:
                    java.lang.String r1 = "android.support.v4.media.session.command.ADD_QUEUE_ITEM_AT"
                    boolean r1 = r6.equals(r1)     // Catch:{ BadParcelableException -> 0x00b8 }
                    java.lang.String r4 = "android.support.v4.media.session.command.ARGUMENT_INDEX"
                    if (r1 == 0) goto L_0x006e
                    android.support.v4.media.session.MediaSessionCompat$Wwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwww r6 = android.support.p069v4.media.session.MediaSessionCompat.C3913Wwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwww.this     // Catch:{ BadParcelableException -> 0x00b8 }
                    android.os.Parcelable r8 = r7.getParcelable(r3)     // Catch:{ BadParcelableException -> 0x00b8 }
                    android.support.v4.media.MediaDescriptionCompat r8 = (android.support.p069v4.media.MediaDescriptionCompat) r8     // Catch:{ BadParcelableException -> 0x00b8 }
                    int r7 = r7.getInt(r4)     // Catch:{ BadParcelableException -> 0x00b8 }
                    r6.Wwwwwwwwwwwwwwwwwwwwwwwwwwwwwwww(r8, r7)     // Catch:{ BadParcelableException -> 0x00b8 }
                    goto L_0x00bf
                L_0x006e:
                    java.lang.String r1 = "android.support.v4.media.session.command.REMOVE_QUEUE_ITEM"
                    boolean r1 = r6.equals(r1)     // Catch:{ BadParcelableException -> 0x00b8 }
                    if (r1 == 0) goto L_0x0082
                    android.support.v4.media.session.MediaSessionCompat$Wwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwww r6 = android.support.p069v4.media.session.MediaSessionCompat.C3913Wwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwww.this     // Catch:{ BadParcelableException -> 0x00b8 }
                    android.os.Parcelable r7 = r7.getParcelable(r3)     // Catch:{ BadParcelableException -> 0x00b8 }
                    android.support.v4.media.MediaDescriptionCompat r7 = (android.support.p069v4.media.MediaDescriptionCompat) r7     // Catch:{ BadParcelableException -> 0x00b8 }
                    r6.Wwwwwwwwwwwwwwwwww(r7)     // Catch:{ BadParcelableException -> 0x00b8 }
                    goto L_0x00bf
                L_0x0082:
                    java.lang.String r1 = "android.support.v4.media.session.command.REMOVE_QUEUE_ITEM_AT"
                    boolean r1 = r6.equals(r1)     // Catch:{ BadParcelableException -> 0x00b8 }
                    if (r1 == 0) goto L_0x00b2
                    java.util.List<android.support.v4.media.session.MediaSessionCompat$QueueItem> r6 = r0.f5307Wwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwww     // Catch:{ BadParcelableException -> 0x00b8 }
                    if (r6 == 0) goto L_0x00bf
                    r6 = -1
                    int r6 = r7.getInt(r4, r6)     // Catch:{ BadParcelableException -> 0x00b8 }
                    if (r6 < 0) goto L_0x00a6
                    java.util.List<android.support.v4.media.session.MediaSessionCompat$QueueItem> r7 = r0.f5307Wwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwww     // Catch:{ BadParcelableException -> 0x00b8 }
                    int r7 = r7.size()     // Catch:{ BadParcelableException -> 0x00b8 }
                    if (r6 >= r7) goto L_0x00a6
                    java.util.List<android.support.v4.media.session.MediaSessionCompat$QueueItem> r7 = r0.f5307Wwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwww     // Catch:{ BadParcelableException -> 0x00b8 }
                    java.lang.Object r6 = r7.get(r6)     // Catch:{ BadParcelableException -> 0x00b8 }
                    r2 = r6
                    android.support.v4.media.session.MediaSessionCompat$QueueItem r2 = (android.support.p069v4.media.session.MediaSessionCompat.QueueItem) r2     // Catch:{ BadParcelableException -> 0x00b8 }
                L_0x00a6:
                    if (r2 == 0) goto L_0x00bf
                    android.support.v4.media.session.MediaSessionCompat$Wwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwww r6 = android.support.p069v4.media.session.MediaSessionCompat.C3913Wwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwww.this     // Catch:{ BadParcelableException -> 0x00b8 }
                    android.support.v4.media.MediaDescriptionCompat r7 = r2.Wwwwwwwwwwwwwwwwwwwwwwwwwwwwww()     // Catch:{ BadParcelableException -> 0x00b8 }
                    r6.Wwwwwwwwwwwwwwwwww(r7)     // Catch:{ BadParcelableException -> 0x00b8 }
                    goto L_0x00bf
                L_0x00b2:
                    android.support.v4.media.session.MediaSessionCompat$Wwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwww r1 = android.support.p069v4.media.session.MediaSessionCompat.C3913Wwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwww.this     // Catch:{ BadParcelableException -> 0x00b8 }
                    r1.Wwwwwwwwwwwwwwwwwwwwwwwwwwwwwww(r6, r7, r8)     // Catch:{ BadParcelableException -> 0x00b8 }
                    goto L_0x00bf
                L_0x00b8:
                    java.lang.String r6 = "MediaSessionCompat"
                    java.lang.String r7 = "Could not unparcel the extra data."
                    android.util.Log.e(r6, r7)
                L_0x00bf:
                    r5.Wwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwww(r0)
                    return
                */
                throw new UnsupportedOperationException("Method not decompiled: android.support.p069v4.media.session.MediaSessionCompat.C3913Wwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwww.C3914Wwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwww.onCommand(java.lang.String, android.os.Bundle, android.os.ResultReceiver):void");
            }

            public void onCustomAction(String str, Bundle bundle) {
                C3906Wwwwwwwwwwwwwwwwwwwwwwwwwwwww Wwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwww2 = Wwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwww();
                if (Wwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwww2 != null) {
                    MediaSessionCompat.Wwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwww(bundle);
                    Wwwwwwwwwwwwwwwwwwwwwwwwwwwwwwww(Wwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwww2);
                    try {
                        if (str.equals("android.support.v4.media.session.action.PLAY_FROM_URI")) {
                            Bundle bundle2 = bundle.getBundle("android.support.v4.media.session.action.ARGUMENT_EXTRAS");
                            MediaSessionCompat.Wwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwww(bundle2);
                            C3913Wwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwww.this.Wwwwwwwwwwwwwwwwwwwwwww((Uri) bundle.getParcelable("android.support.v4.media.session.action.ARGUMENT_URI"), bundle2);
                        } else if (str.equals("android.support.v4.media.session.action.PREPARE")) {
                            C3913Wwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwww.this.Wwwwwwwwwwwwwwwwwwwwww();
                        } else if (str.equals("android.support.v4.media.session.action.PREPARE_FROM_MEDIA_ID")) {
                            String string = bundle.getString("android.support.v4.media.session.action.ARGUMENT_MEDIA_ID");
                            Bundle bundle3 = bundle.getBundle("android.support.v4.media.session.action.ARGUMENT_EXTRAS");
                            MediaSessionCompat.Wwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwww(bundle3);
                            C3913Wwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwww.this.Wwwwwwwwwwwwwwwwwwwww(string, bundle3);
                        } else if (str.equals("android.support.v4.media.session.action.PREPARE_FROM_SEARCH")) {
                            String string2 = bundle.getString("android.support.v4.media.session.action.ARGUMENT_QUERY");
                            Bundle bundle4 = bundle.getBundle("android.support.v4.media.session.action.ARGUMENT_EXTRAS");
                            MediaSessionCompat.Wwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwww(bundle4);
                            C3913Wwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwww.this.Wwwwwwwwwwwwwwwwwwww(string2, bundle4);
                        } else if (str.equals("android.support.v4.media.session.action.PREPARE_FROM_URI")) {
                            Bundle bundle5 = bundle.getBundle("android.support.v4.media.session.action.ARGUMENT_EXTRAS");
                            MediaSessionCompat.Wwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwww(bundle5);
                            C3913Wwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwww.this.Wwwwwwwwwwwwwwwwwww((Uri) bundle.getParcelable("android.support.v4.media.session.action.ARGUMENT_URI"), bundle5);
                        } else if (str.equals("android.support.v4.media.session.action.SET_CAPTIONING_ENABLED")) {
                            C3913Wwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwww.this.Wwwwwwwwwwwwwww(bundle.getBoolean("android.support.v4.media.session.action.ARGUMENT_CAPTIONING_ENABLED"));
                        } else if (str.equals("android.support.v4.media.session.action.SET_REPEAT_MODE")) {
                            C3913Wwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwww.this.Wwwwwwwwwww(bundle.getInt("android.support.v4.media.session.action.ARGUMENT_REPEAT_MODE"));
                        } else if (str.equals("android.support.v4.media.session.action.SET_SHUFFLE_MODE")) {
                            C3913Wwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwww.this.Wwwwwwwwww(bundle.getInt("android.support.v4.media.session.action.ARGUMENT_SHUFFLE_MODE"));
                        } else if (str.equals("android.support.v4.media.session.action.SET_RATING")) {
                            Bundle bundle6 = bundle.getBundle("android.support.v4.media.session.action.ARGUMENT_EXTRAS");
                            MediaSessionCompat.Wwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwww(bundle6);
                            C3913Wwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwww.this.Wwwwwwwwwwww((RatingCompat) bundle.getParcelable("android.support.v4.media.session.action.ARGUMENT_RATING"), bundle6);
                        } else if (str.equals("android.support.v4.media.session.action.SET_PLAYBACK_SPEED")) {
                            C3913Wwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwww.this.Wwwwwwwwwwwwww(bundle.getFloat("android.support.v4.media.session.action.ARGUMENT_PLAYBACK_SPEED", 1.0f));
                        } else {
                            C3913Wwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwww.this.Wwwwwwwwwwwwwwwwwwwwwwwwwwwwww(str, bundle);
                        }
                    } catch (BadParcelableException unused) {
                        Log.e("MediaSessionCompat", "Could not unparcel the data.");
                    }
                    Wwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwww(Wwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwww2);
                }
            }

            public void onFastForward() {
                C3906Wwwwwwwwwwwwwwwwwwwwwwwwwwwww Wwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwww2 = Wwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwww();
                if (Wwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwww2 != null) {
                    Wwwwwwwwwwwwwwwwwwwwwwwwwwwwwwww(Wwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwww2);
                    C3913Wwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwww.this.Wwwwwwwwwwwwwwwwwwwwwwwwwwwww();
                    Wwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwww(Wwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwww2);
                }
            }

            public boolean onMediaButtonEvent(Intent intent) {
                C3906Wwwwwwwwwwwwwwwwwwwwwwwwwwwww Wwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwww2 = Wwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwww();
                if (Wwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwww2 == null) {
                    return false;
                }
                Wwwwwwwwwwwwwwwwwwwwwwwwwwwwwwww(Wwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwww2);
                boolean Wwwwwwwwwwwwwwwwwwwwwwwwwwww2 = C3913Wwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwww.this.Wwwwwwwwwwwwwwwwwwwwwwwwwwww(intent);
                Wwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwww(Wwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwww2);
                if (Wwwwwwwwwwwwwwwwwwwwwwwwwwww2 || super.onMediaButtonEvent(intent)) {
                    return true;
                }
                return false;
            }

            public void onPause() {
                C3906Wwwwwwwwwwwwwwwwwwwwwwwwwwwww Wwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwww2 = Wwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwww();
                if (Wwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwww2 != null) {
                    Wwwwwwwwwwwwwwwwwwwwwwwwwwwwwwww(Wwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwww2);
                    C3913Wwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwww.this.Wwwwwwwwwwwwwwwwwwwwwwwwwww();
                    Wwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwww(Wwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwww2);
                }
            }

            public void onPlay() {
                C3906Wwwwwwwwwwwwwwwwwwwwwwwwwwwww Wwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwww2 = Wwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwww();
                if (Wwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwww2 != null) {
                    Wwwwwwwwwwwwwwwwwwwwwwwwwwwwwwww(Wwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwww2);
                    C3913Wwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwww.this.Wwwwwwwwwwwwwwwwwwwwwwwwww();
                    Wwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwww(Wwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwww2);
                }
            }

            public void onPlayFromMediaId(String str, Bundle bundle) {
                C3906Wwwwwwwwwwwwwwwwwwwwwwwwwwwww Wwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwww2 = Wwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwww();
                if (Wwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwww2 != null) {
                    MediaSessionCompat.Wwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwww(bundle);
                    Wwwwwwwwwwwwwwwwwwwwwwwwwwwwwwww(Wwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwww2);
                    C3913Wwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwww.this.Wwwwwwwwwwwwwwwwwwwwwwwww(str, bundle);
                    Wwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwww(Wwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwww2);
                }
            }

            public void onPlayFromSearch(String str, Bundle bundle) {
                C3906Wwwwwwwwwwwwwwwwwwwwwwwwwwwww Wwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwww2 = Wwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwww();
                if (Wwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwww2 != null) {
                    MediaSessionCompat.Wwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwww(bundle);
                    Wwwwwwwwwwwwwwwwwwwwwwwwwwwwwwww(Wwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwww2);
                    C3913Wwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwww.this.Wwwwwwwwwwwwwwwwwwwwwwww(str, bundle);
                    Wwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwww(Wwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwww2);
                }
            }

            public void onPlayFromUri(Uri uri, Bundle bundle) {
                C3906Wwwwwwwwwwwwwwwwwwwwwwwwwwwww Wwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwww2 = Wwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwww();
                if (Wwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwww2 != null) {
                    MediaSessionCompat.Wwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwww(bundle);
                    Wwwwwwwwwwwwwwwwwwwwwwwwwwwwwwww(Wwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwww2);
                    C3913Wwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwww.this.Wwwwwwwwwwwwwwwwwwwwwww(uri, bundle);
                    Wwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwww(Wwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwww2);
                }
            }

            public void onPrepare() {
                C3906Wwwwwwwwwwwwwwwwwwwwwwwwwwwww Wwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwww2 = Wwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwww();
                if (Wwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwww2 != null) {
                    Wwwwwwwwwwwwwwwwwwwwwwwwwwwwwwww(Wwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwww2);
                    C3913Wwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwww.this.Wwwwwwwwwwwwwwwwwwwwww();
                    Wwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwww(Wwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwww2);
                }
            }

            public void onPrepareFromMediaId(String str, Bundle bundle) {
                C3906Wwwwwwwwwwwwwwwwwwwwwwwwwwwww Wwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwww2 = Wwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwww();
                if (Wwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwww2 != null) {
                    MediaSessionCompat.Wwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwww(bundle);
                    Wwwwwwwwwwwwwwwwwwwwwwwwwwwwwwww(Wwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwww2);
                    C3913Wwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwww.this.Wwwwwwwwwwwwwwwwwwwww(str, bundle);
                    Wwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwww(Wwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwww2);
                }
            }

            public void onPrepareFromSearch(String str, Bundle bundle) {
                C3906Wwwwwwwwwwwwwwwwwwwwwwwwwwwww Wwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwww2 = Wwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwww();
                if (Wwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwww2 != null) {
                    MediaSessionCompat.Wwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwww(bundle);
                    Wwwwwwwwwwwwwwwwwwwwwwwwwwwwwwww(Wwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwww2);
                    C3913Wwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwww.this.Wwwwwwwwwwwwwwwwwwww(str, bundle);
                    Wwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwww(Wwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwww2);
                }
            }

            public void onPrepareFromUri(Uri uri, Bundle bundle) {
                C3906Wwwwwwwwwwwwwwwwwwwwwwwwwwwww Wwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwww2 = Wwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwww();
                if (Wwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwww2 != null) {
                    MediaSessionCompat.Wwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwww(bundle);
                    Wwwwwwwwwwwwwwwwwwwwwwwwwwwwwwww(Wwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwww2);
                    C3913Wwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwww.this.Wwwwwwwwwwwwwwwwwww(uri, bundle);
                    Wwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwww(Wwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwww2);
                }
            }

            public void onRewind() {
                C3906Wwwwwwwwwwwwwwwwwwwwwwwwwwwww Wwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwww2 = Wwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwww();
                if (Wwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwww2 != null) {
                    Wwwwwwwwwwwwwwwwwwwwwwwwwwwwwwww(Wwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwww2);
                    C3913Wwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwww.this.Wwwwwwwwwwwwwwwww();
                    Wwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwww(Wwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwww2);
                }
            }

            public void onSeekTo(long j) {
                C3906Wwwwwwwwwwwwwwwwwwwwwwwwwwwww Wwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwww2 = Wwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwww();
                if (Wwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwww2 != null) {
                    Wwwwwwwwwwwwwwwwwwwwwwwwwwwwwwww(Wwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwww2);
                    C3913Wwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwww.this.Wwwwwwwwwwwwwwww(j);
                    Wwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwww(Wwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwww2);
                }
            }

            public void onSetPlaybackSpeed(float f) {
                C3906Wwwwwwwwwwwwwwwwwwwwwwwwwwwww Wwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwww2 = Wwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwww();
                if (Wwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwww2 != null) {
                    Wwwwwwwwwwwwwwwwwwwwwwwwwwwwwwww(Wwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwww2);
                    C3913Wwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwww.this.Wwwwwwwwwwwwww(f);
                    Wwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwww(Wwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwww2);
                }
            }

            public void onSetRating(Rating rating) {
                C3906Wwwwwwwwwwwwwwwwwwwwwwwwwwwww Wwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwww2 = Wwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwww();
                if (Wwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwww2 != null) {
                    Wwwwwwwwwwwwwwwwwwwwwwwwwwwwwwww(Wwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwww2);
                    C3913Wwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwww.this.Wwwwwwwwwwwww(RatingCompat.Wwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwww(rating));
                    Wwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwww(Wwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwww2);
                }
            }

            public void onSkipToNext() {
                C3906Wwwwwwwwwwwwwwwwwwwwwwwwwwwww Wwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwww2 = Wwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwww();
                if (Wwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwww2 != null) {
                    Wwwwwwwwwwwwwwwwwwwwwwwwwwwwwwww(Wwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwww2);
                    C3913Wwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwww.this.Wwwwwwwww();
                    Wwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwww(Wwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwww2);
                }
            }

            public void onSkipToPrevious() {
                C3906Wwwwwwwwwwwwwwwwwwwwwwwwwwwww Wwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwww2 = Wwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwww();
                if (Wwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwww2 != null) {
                    Wwwwwwwwwwwwwwwwwwwwwwwwwwwwwwww(Wwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwww2);
                    C3913Wwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwww.this.Wwwwwwww();
                    Wwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwww(Wwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwww2);
                }
            }

            public void onSkipToQueueItem(long j) {
                C3906Wwwwwwwwwwwwwwwwwwwwwwwwwwwww Wwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwww2 = Wwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwww();
                if (Wwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwww2 != null) {
                    Wwwwwwwwwwwwwwwwwwwwwwwwwwwwwwww(Wwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwww2);
                    C3913Wwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwww.this.Wwwwwww(j);
                    Wwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwww(Wwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwww2);
                }
            }

            public void onStop() {
                C3906Wwwwwwwwwwwwwwwwwwwwwwwwwwwww Wwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwww2 = Wwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwww();
                if (Wwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwww2 != null) {
                    Wwwwwwwwwwwwwwwwwwwwwwwwwwwwwwww(Wwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwww2);
                    C3913Wwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwww.this.Wwwwww();
                    Wwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwww(Wwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwww2);
                }
            }
        }

        /* renamed from: android.support.v4.media.session.MediaSessionCompat$Wwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwww$Wwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwww */
        public class C3915Wwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwww extends Handler {
            public C3915Wwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwww(Looper looper) {
                super(looper);
            }

            public void handleMessage(Message message) {
                C3912Wwwwwwwwwwwwwwwwwwwwwwwwwwwwwwww wwwwwwwwwwwwwwwwwwwwwwwwwwwwwwww;
                C3913Wwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwww wwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwww;
                C3915Wwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwww wwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwww;
                if (message.what == 1) {
                    synchronized (C3913Wwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwww.this.f5310Wwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwww) {
                        wwwwwwwwwwwwwwwwwwwwwwwwwwwwwwww = (C3912Wwwwwwwwwwwwwwwwwwwwwwwwwwwwwwww) C3913Wwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwww.this.f5311Wwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwww.get();
                        wwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwww = C3913Wwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwww.this;
                        wwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwww = wwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwww.f5309Wwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwww;
                    }
                    if (wwwwwwwwwwwwwwwwwwwwwwwwwwwwwwww != null && wwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwww == wwwwwwwwwwwwwwwwwwwwwwwwwwwwwwww.Wwwwwwwwwwwwwwwww() && wwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwww != null) {
                        wwwwwwwwwwwwwwwwwwwwwwwwwwwwwwww.Wwwwwwwwwwwwwwwwwwwwwwwwwwwwwww((C1630Wwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwww) message.obj);
                        C3913Wwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwww.this.Wwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwww(wwwwwwwwwwwwwwwwwwwwwwwwwwwwwwww, wwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwww);
                        wwwwwwwwwwwwwwwwwwwwwwwwwwwwwwww.Wwwwwwwwwwwwwwwwwwwwwwwwwwwwwww((C1630Wwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwww) null);
                    }
                }
            }
        }

        public C3913Wwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwww() {
            if (Build.VERSION.SDK_INT >= 21) {
                this.f18092Wwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwww = new C3914Wwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwww();
            } else {
                this.f18092Wwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwww = null;
            }
            this.f5311Wwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwww = new WeakReference<>((Object) null);
        }

        public void Wwwww(C3912Wwwwwwwwwwwwwwwwwwwwwwwwwwwwwwww wwwwwwwwwwwwwwwwwwwwwwwwwwwwwwww, Handler handler) {
            synchronized (this.f5310Wwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwww) {
                this.f5311Wwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwww = new WeakReference<>(wwwwwwwwwwwwwwwwwwwwwwwwwwwwwwww);
                C3915Wwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwww wwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwww = this.f5309Wwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwww;
                C3915Wwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwww wwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwww2 = null;
                if (wwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwww != null) {
                    wwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwww.removeCallbacksAndMessages((Object) null);
                }
                if (wwwwwwwwwwwwwwwwwwwwwwwwwwwwwwww != null) {
                    if (handler != null) {
                        wwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwww2 = new C3915Wwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwww(handler.getLooper());
                    }
                }
                this.f5309Wwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwww = wwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwww2;
            }
        }

        public void Wwwwww() {
        }

        public void Wwwwwww(long j) {
        }

        public void Wwwwwwww() {
        }

        public void Wwwwwwwww() {
        }

        public void Wwwwwwwwww(int i) {
        }

        public void Wwwwwwwwwww(int i) {
        }

        public void Wwwwwwwwwwww(RatingCompat ratingCompat, Bundle bundle) {
        }

        public void Wwwwwwwwwwwww(RatingCompat ratingCompat) {
        }

        public void Wwwwwwwwwwwwww(float f) {
        }

        public void Wwwwwwwwwwwwwww(boolean z) {
        }

        public void Wwwwwwwwwwwwwwww(long j) {
        }

        public void Wwwwwwwwwwwwwwwww() {
        }

        public void Wwwwwwwwwwwwwwwwww(MediaDescriptionCompat mediaDescriptionCompat) {
        }

        public void Wwwwwwwwwwwwwwwwwww(Uri uri, Bundle bundle) {
        }

        public void Wwwwwwwwwwwwwwwwwwww(String str, Bundle bundle) {
        }

        public void Wwwwwwwwwwwwwwwwwwwww(String str, Bundle bundle) {
        }

        public void Wwwwwwwwwwwwwwwwwwwwww() {
        }

        public void Wwwwwwwwwwwwwwwwwwwwwww(Uri uri, Bundle bundle) {
        }

        public void Wwwwwwwwwwwwwwwwwwwwwwww(String str, Bundle bundle) {
        }

        public void Wwwwwwwwwwwwwwwwwwwwwwwww(String str, Bundle bundle) {
        }

        public void Wwwwwwwwwwwwwwwwwwwwwwwwww() {
        }

        public void Wwwwwwwwwwwwwwwwwwwwwwwwwww() {
        }

        public boolean Wwwwwwwwwwwwwwwwwwwwwwwwwwww(Intent intent) {
            C3912Wwwwwwwwwwwwwwwwwwwwwwwwwwwwwwww wwwwwwwwwwwwwwwwwwwwwwwwwwwwwwww;
            C3915Wwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwww wwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwww;
            KeyEvent keyEvent;
            long j;
            if (Build.VERSION.SDK_INT >= 27) {
                return false;
            }
            synchronized (this.f5310Wwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwww) {
                wwwwwwwwwwwwwwwwwwwwwwwwwwwwwwww = (C3912Wwwwwwwwwwwwwwwwwwwwwwwwwwwwwwww) this.f5311Wwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwww.get();
                wwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwww = this.f5309Wwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwww;
            }
            if (wwwwwwwwwwwwwwwwwwwwwwwwwwwwwwww == null || wwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwww == null || (keyEvent = (KeyEvent) intent.getParcelableExtra("android.intent.extra.KEY_EVENT")) == null || keyEvent.getAction() != 0) {
                return false;
            }
            C1630Wwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwww Wwwwwwwwwwwwwwwwwwww2 = wwwwwwwwwwwwwwwwwwwwwwwwwwwwwwww.Wwwwwwwwwwwwwwwwwwww();
            int keyCode = keyEvent.getKeyCode();
            if (keyCode == 79 || keyCode == 85) {
                if (keyEvent.getRepeatCount() != 0) {
                    Wwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwww(wwwwwwwwwwwwwwwwwwwwwwwwwwwwwwww, wwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwww);
                } else if (this.f5312Wwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwww) {
                    wwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwww.removeMessages(1);
                    this.f5312Wwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwww = false;
                    PlaybackStateCompat Wwwwwwwwwwwwwwwwwwwwwwwwwww2 = wwwwwwwwwwwwwwwwwwwwwwwwwwwwwwww.Wwwwwwwwwwwwwwwwwwwwwwwwwww();
                    if (Wwwwwwwwwwwwwwwwwwwwwwwwwww2 == null) {
                        j = 0;
                    } else {
                        j = Wwwwwwwwwwwwwwwwwwwwwwwwwww2.Wwwwwwwwwwwwwwwwwwwwwwwwwwwwwwww();
                    }
                    if ((j & 32) != 0) {
                        Wwwwwwwww();
                    }
                } else {
                    this.f5312Wwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwww = true;
                    wwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwww.sendMessageDelayed(wwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwww.obtainMessage(1, Wwwwwwwwwwwwwwwwwwww2), (long) ViewConfiguration.getDoubleTapTimeout());
                }
                return true;
            }
            Wwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwww(wwwwwwwwwwwwwwwwwwwwwwwwwwwwwwww, wwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwww);
            return false;
        }

        public void Wwwwwwwwwwwwwwwwwwwwwwwwwwwww() {
        }

        public void Wwwwwwwwwwwwwwwwwwwwwwwwwwwwww(String str, Bundle bundle) {
        }

        public void Wwwwwwwwwwwwwwwwwwwwwwwwwwwwwww(String str, Bundle bundle, ResultReceiver resultReceiver) {
        }

        public void Wwwwwwwwwwwwwwwwwwwwwwwwwwwwwwww(MediaDescriptionCompat mediaDescriptionCompat, int i) {
        }

        public void Wwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwww(MediaDescriptionCompat mediaDescriptionCompat) {
        }

        public void Wwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwww(C3912Wwwwwwwwwwwwwwwwwwwwwwwwwwwwwwww wwwwwwwwwwwwwwwwwwwwwwwwwwwwwwww, Handler handler) {
            long j;
            if (this.f5312Wwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwww) {
                boolean z = false;
                this.f5312Wwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwww = false;
                handler.removeMessages(1);
                PlaybackStateCompat Wwwwwwwwwwwwwwwwwwwwwwwwwww2 = wwwwwwwwwwwwwwwwwwwwwwwwwwwwwwww.Wwwwwwwwwwwwwwwwwwwwwwwwwww();
                if (Wwwwwwwwwwwwwwwwwwwwwwwwwww2 == null) {
                    j = 0;
                } else {
                    j = Wwwwwwwwwwwwwwwwwwwwwwwwwww2.Wwwwwwwwwwwwwwwwwwwwwwwwwwwwwwww();
                }
                boolean z2 = Wwwwwwwwwwwwwwwwwwwwwwwwwww2 != null && Wwwwwwwwwwwwwwwwwwwwwwwwwww2.Wwwwwwwwwwwwwwwwww() == 3;
                boolean z3 = (516 & j) != 0;
                if ((j & 514) != 0) {
                    z = true;
                }
                if (z2 && z) {
                    Wwwwwwwwwwwwwwwwwwwwwwwwwww();
                } else if (!z2 && z3) {
                    Wwwwwwwwwwwwwwwwwwwwwwwwww();
                }
            }
        }
    }

    /* renamed from: android.support.v4.media.session.MediaSessionCompat$Wwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwww */
    public class C3916Wwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwww extends C3913Wwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwww {
        public C3916Wwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwww(MediaSessionCompat mediaSessionCompat) {
        }
    }

    public MediaSessionCompat(Context context, String str, ComponentName componentName, PendingIntent pendingIntent) {
        this(context, str, componentName, pendingIntent, (Bundle) null);
    }

    public static Bundle Wwwwwwwwwwwwwwww(Bundle bundle) {
        if (bundle == null) {
            return null;
        }
        Wwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwww(bundle);
        try {
            bundle.isEmpty();
            return bundle;
        } catch (BadParcelableException unused) {
            Log.e("MediaSessionCompat", "Could not unparcel the data.");
            return null;
        }
    }

    public static PlaybackStateCompat Wwwwwwwwwwwwwwwwwwwwwwwwwwwww(PlaybackStateCompat playbackStateCompat, MediaMetadataCompat mediaMetadataCompat) {
        if (playbackStateCompat == null) {
            return playbackStateCompat;
        }
        long j = -1;
        if (playbackStateCompat.Wwwwwwwwwwwwwwwwwwwwwww() == -1) {
            return playbackStateCompat;
        }
        if (playbackStateCompat.Wwwwwwwwwwwwwwwwww() != 3 && playbackStateCompat.Wwwwwwwwwwwwwwwwww() != 4 && playbackStateCompat.Wwwwwwwwwwwwwwwwww() != 5) {
            return playbackStateCompat;
        }
        long Wwwwwwwwwwwwwwwwwwwwwwwwwwwwww2 = playbackStateCompat.Wwwwwwwwwwwwwwwwwwwwwwwwwwwwww();
        if (Wwwwwwwwwwwwwwwwwwwwwwwwwwwwww2 <= 0) {
            return playbackStateCompat;
        }
        long elapsedRealtime = SystemClock.elapsedRealtime();
        long Wwwwwwwwwwwwwwwwwwwwwwwwwww2 = ((long) (playbackStateCompat.Wwwwwwwwwwwwwwwwwwwwwwwwwww() * ((float) (elapsedRealtime - Wwwwwwwwwwwwwwwwwwwwwwwwwwwwww2)))) + playbackStateCompat.Wwwwwwwwwwwwwwwwwwwwwww();
        if (mediaMetadataCompat != null && mediaMetadataCompat.Wwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwww("android.media.metadata.DURATION")) {
            j = mediaMetadataCompat.Wwwwwwwwwwwwwwwwwwwwwww("android.media.metadata.DURATION");
        }
        return new PlaybackStateCompat.C3919Wwwwwwwwwwwwwwwwwwwwwwwwwwwwwww(playbackStateCompat).Wwwwwwwwwwwwwwwwwwwwwwwwwwwwwww(playbackStateCompat.Wwwwwwwwwwwwwwwwww(), (j < 0 || Wwwwwwwwwwwwwwwwwwwwwwwwwww2 <= j) ? Wwwwwwwwwwwwwwwwwwwwwwwwwww2 < 0 ? 0 : Wwwwwwwwwwwwwwwwwwwwwwwwwww2 : j, playbackStateCompat.Wwwwwwwwwwwwwwwwwwwwwwwwwww(), elapsedRealtime).Wwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwww();
    }

    public static void Wwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwww(Bundle bundle) {
        if (bundle != null) {
            bundle.setClassLoader(MediaSessionCompat.class.getClassLoader());
        }
    }

    public void Wwwwwwwwwwwwwwwww(PendingIntent pendingIntent) {
        this.f5264Wwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwww.Wwwwwwwwwwwwwwwwww(pendingIntent);
    }

    public void Wwwwwwwwwwwwwwwwww(C1622Wwwwwwwwwwwwwwwwwwwwwwwwwwwwww wwwwwwwwwwwwwwwwwwwwwwwwwwwwww) {
        if (wwwwwwwwwwwwwwwwwwwwwwwwwwwwww != null) {
            this.f5264Wwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwww.Wwwwwwwwwwwwwwwwwwwwwwwwwwwwww(wwwwwwwwwwwwwwwwwwwwwwwwwwwwww);
            return;
        }
        throw new IllegalArgumentException("volumeProvider may not be null!");
    }

    public void Wwwwwwwwwwwwwwwwwww(int i) {
        this.f5264Wwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwww.Wwwwwwwwwwwwwwwwwwwwwwwww(i);
    }

    public void Wwwwwwwwwwwwwwwwwwww(PlaybackStateCompat playbackStateCompat) {
        this.f5264Wwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwww.Wwwwwwwwwwwwwwwwwwwwwwwwww(playbackStateCompat);
    }

    public void Wwwwwwwwwwwwwwwwwwwww(MediaMetadataCompat mediaMetadataCompat) {
        this.f5264Wwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwww.Wwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwww(mediaMetadataCompat);
    }

    public void Wwwwwwwwwwwwwwwwwwwwww(int i) {
        this.f5264Wwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwww.Wwwwwwwwwwwwwwwwwwwww(i);
    }

    public void Wwwwwwwwwwwwwwwwwwwwwww(C3913Wwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwww wwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwww, Handler handler) {
        if (wwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwww == null) {
            this.f5264Wwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwww.Wwwwwwwwwwwwwwwwwwwwwwwwwwwww((C3913Wwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwww) null, (Handler) null);
            return;
        }
        C3912Wwwwwwwwwwwwwwwwwwwwwwwwwwwwwwww wwwwwwwwwwwwwwwwwwwwwwwwwwwwwwww = this.f5264Wwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwww;
        if (handler == null) {
            handler = new Handler();
        }
        wwwwwwwwwwwwwwwwwwwwwwwwwwwwwwww.Wwwwwwwwwwwwwwwwwwwwwwwwwwwww(wwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwww, handler);
    }

    public void Wwwwwwwwwwwwwwwwwwwwwwww(C3913Wwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwww wwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwww) {
        Wwwwwwwwwwwwwwwwwwwwwww(wwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwww, (Handler) null);
    }

    public void Wwwwwwwwwwwwwwwwwwwwwwwww(boolean z) {
        this.f5264Wwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwww.Wwwwwwwwwwwwwwwwwwwwwwww(z);
        Iterator<C3897Wwwwwwwwwwwwwwwwwwwwwwww> it = this.f5265Wwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwww.iterator();
        while (it.hasNext()) {
            it.next().Wwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwww();
        }
    }

    public void Wwwwwwwwwwwwwwwwwwwwwwwwww(C3897Wwwwwwwwwwwwwwwwwwwwwwww wwwwwwwwwwwwwwwwwwwwwwww) {
        if (wwwwwwwwwwwwwwwwwwwwwwww != null) {
            this.f5265Wwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwww.remove(wwwwwwwwwwwwwwwwwwwwwwww);
            return;
        }
        throw new IllegalArgumentException("Listener may not be null");
    }

    public void Wwwwwwwwwwwwwwwwwwwwwwwwwww() {
        this.f5264Wwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwww.Wwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwww();
    }

    public boolean Wwwwwwwwwwwwwwwwwwwwwwwwwwww() {
        return this.f5264Wwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwww.Wwwwwwwwwwwwwwwwwwwwwwwwwwwwwwww();
    }

    public Token Wwwwwwwwwwwwwwwwwwwwwwwwwwwwww() {
        return this.f5264Wwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwww.Wwwwwwwwwwwwwwwwwww();
    }

    public Object Wwwwwwwwwwwwwwwwwwwwwwwwwwwwwww() {
        return this.f5264Wwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwww.Wwwwwwwwwwwwwwwwwwwwwww();
    }

    public MediaControllerCompat Wwwwwwwwwwwwwwwwwwwwwwwwwwwwwwww() {
        return this.f5263Wwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwww;
    }

    public void Wwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwww(C3897Wwwwwwwwwwwwwwwwwwwwwwww wwwwwwwwwwwwwwwwwwwwwwww) {
        if (wwwwwwwwwwwwwwwwwwwwwwww != null) {
            this.f5265Wwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwww.add(wwwwwwwwwwwwwwwwwwwwwwww);
            return;
        }
        throw new IllegalArgumentException("Listener may not be null");
    }

    public MediaSessionCompat(Context context, String str, ComponentName componentName, PendingIntent pendingIntent, Bundle bundle) {
        this(context, str, componentName, pendingIntent, bundle, (C1306Wwwwwwwwwwwwwwwwwwwwwwwwwwwwwww) null);
    }

    @SuppressLint({"WrongConstant"})
    public MediaSessionCompat(Context context, String str, ComponentName componentName, PendingIntent pendingIntent, Bundle bundle, C1306Wwwwwwwwwwwwwwwwwwwwwwwwwwwwwww wwwwwwwwwwwwwwwwwwwwwwwwwwwwwww) {
        this.f5265Wwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwww = new ArrayList<>();
        if (context == null) {
            throw new IllegalArgumentException("context must not be null");
        } else if (!TextUtils.isEmpty(str)) {
            if (componentName == null && (componentName = C1621Wwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwww.Wwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwww(context)) == null) {
                Log.w("MediaSessionCompat", "Couldn't find a unique registered media button receiver in the given context.");
            }
            ComponentName componentName2 = componentName;
            if (componentName2 != null && pendingIntent == null) {
                Intent intent = new Intent("android.intent.action.MEDIA_BUTTON");
                intent.setComponent(componentName2);
                pendingIntent = PendingIntent.getBroadcast(context, 0, intent, f18070Wwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwww);
            }
            PendingIntent pendingIntent2 = pendingIntent;
            int i = Build.VERSION.SDK_INT;
            if (i >= 21) {
                if (i >= 29) {
                    this.f5264Wwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwww = new C3903Wwwwwwwwwwwwwwwwwwwwwwwwww(context, str, wwwwwwwwwwwwwwwwwwwwwwwwwwwwwww, bundle);
                } else if (i >= 28) {
                    this.f5264Wwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwww = new C3904Wwwwwwwwwwwwwwwwwwwwwwwwwww(context, str, wwwwwwwwwwwwwwwwwwwwwwwwwwwwwww, bundle);
                } else if (i >= 22) {
                    this.f5264Wwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwww = new C3905Wwwwwwwwwwwwwwwwwwwwwwwwwwww(context, str, wwwwwwwwwwwwwwwwwwwwwwwwwwwwwww, bundle);
                } else {
                    this.f5264Wwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwww = new C3906Wwwwwwwwwwwwwwwwwwwwwwwwwwwww(context, str, wwwwwwwwwwwwwwwwwwwwwwwwwwwwwww, bundle);
                }
                Wwwwwwwwwwwwwwwwwwwwwww(new C3916Wwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwww(this), new Handler(Looper.myLooper() != null ? Looper.myLooper() : Looper.getMainLooper()));
                this.f5264Wwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwww.Wwwwwwwwwwwwwwwwwwwwwwwwwwww(pendingIntent2);
            } else if (i >= 19) {
                this.f5264Wwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwww = new C3908Wwwwwwwwwwwwwwwwwwwwwwwwwwwwww(context, str, componentName2, pendingIntent2, wwwwwwwwwwwwwwwwwwwwwwwwwwwwwww, bundle);
            } else if (i >= 18) {
                this.f5264Wwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwww = new C3910Wwwwwwwwwwwwwwwwwwwwwwwwwwwwwww(context, str, componentName2, pendingIntent2, wwwwwwwwwwwwwwwwwwwwwwwwwwwwwww, bundle);
            } else {
                this.f5264Wwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwww = new C3898Wwwwwwwwwwwwwwwwwwwwwwwww(context, str, componentName2, pendingIntent2, wwwwwwwwwwwwwwwwwwwwwwwwwwwwwww, bundle);
            }
            this.f5263Wwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwww = new MediaControllerCompat(context, this);
            if (f18069Wwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwww == 0) {
                f18069Wwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwww = (int) (TypedValue.applyDimension(1, 320.0f, context.getResources().getDisplayMetrics()) + 0.5f);
            }
        } else {
            throw new IllegalArgumentException("tag must not be null or empty");
        }
    }

    @SuppressLint({"BanParcelableUsage"})
    /* renamed from: android.support.v4.media.session.MediaSessionCompat$QueueItem */
    public static final class QueueItem implements Parcelable {
        public static final Parcelable.Creator<QueueItem> CREATOR = new C3894Wwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwww();

        /* renamed from: Wwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwww  reason: collision with root package name */
        public final long f18071Wwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwww;

        /* renamed from: Wwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwww  reason: collision with other field name */
        public final MediaDescriptionCompat f5266Wwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwww;

        /* renamed from: android.support.v4.media.session.MediaSessionCompat$QueueItem$Wwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwww */
        public static class C3893Wwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwww {
            public static long Wwwwwwwwwwwwwwwwwwwwwwwwwwwwwwww(MediaSession.QueueItem queueItem) {
                return queueItem.getQueueId();
            }

            public static MediaDescription Wwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwww(MediaSession.QueueItem queueItem) {
                return queueItem.getDescription();
            }

            public static MediaSession.QueueItem Wwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwww(MediaDescription mediaDescription, long j) {
                return new MediaSession.QueueItem(mediaDescription, j);
            }
        }

        /* renamed from: android.support.v4.media.session.MediaSessionCompat$QueueItem$Wwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwww */
        public class C3894Wwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwww implements Parcelable.Creator<QueueItem> {
            /* renamed from: Wwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwww */
            public QueueItem[] newArray(int i) {
                return new QueueItem[i];
            }

            /* renamed from: Wwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwww */
            public QueueItem createFromParcel(Parcel parcel) {
                return new QueueItem(parcel);
            }
        }

        public QueueItem(MediaSession.QueueItem queueItem, MediaDescriptionCompat mediaDescriptionCompat, long j) {
            if (mediaDescriptionCompat == null) {
                throw new IllegalArgumentException("Description cannot be null");
            } else if (j != -1) {
                this.f5266Wwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwww = mediaDescriptionCompat;
                this.f18071Wwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwww = j;
            } else {
                throw new IllegalArgumentException("Id cannot be QueueItem.UNKNOWN_ID");
            }
        }

        public static List<QueueItem> Wwwwwwwwwwwwwwwwwwwwwwwwwwwwwwww(List<?> list) {
            if (list == null || Build.VERSION.SDK_INT < 21) {
                return null;
            }
            ArrayList arrayList = new ArrayList();
            for (Object Wwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwww2 : list) {
                arrayList.add(Wwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwww(Wwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwww2));
            }
            return arrayList;
        }

        public static QueueItem Wwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwww(Object obj) {
            if (obj == null || Build.VERSION.SDK_INT < 21) {
                return null;
            }
            MediaSession.QueueItem queueItem = (MediaSession.QueueItem) obj;
            return new QueueItem(queueItem, MediaDescriptionCompat.Wwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwww(C3893Wwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwww.Wwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwww(queueItem)), C3893Wwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwww.Wwwwwwwwwwwwwwwwwwwwwwwwwwwwwwww(queueItem));
        }

        public MediaDescriptionCompat Wwwwwwwwwwwwwwwwwwwwwwwwwwwwww() {
            return this.f5266Wwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwww;
        }

        public int describeContents() {
            return 0;
        }

        public String toString() {
            return "MediaSession.QueueItem {Description=" + this.f5266Wwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwww + ", Id=" + this.f18071Wwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwww + " }";
        }

        public void writeToParcel(Parcel parcel, int i) {
            this.f5266Wwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwww.writeToParcel(parcel, i);
            parcel.writeLong(this.f18071Wwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwww);
        }

        public QueueItem(Parcel parcel) {
            this.f5266Wwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwww = MediaDescriptionCompat.CREATOR.createFromParcel(parcel);
            this.f18071Wwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwww = parcel.readLong();
        }
    }
}
