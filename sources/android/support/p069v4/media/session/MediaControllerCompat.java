package android.support.p069v4.media.session;

import Illlllllllllll.C1309Wwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwww;
import Wwwww.C3155Wwwwwwwwwwwwwwwwwwwwwwwwwwwww;
import android.annotation.SuppressLint;
import android.app.PendingIntent;
import android.content.Context;
import android.media.MediaMetadata;
import android.media.session.MediaController;
import android.media.session.MediaSession;
import android.media.session.PlaybackState;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.os.IBinder;
import android.os.Looper;
import android.os.Message;
import android.os.RemoteException;
import android.os.ResultReceiver;
import android.support.p069v4.media.MediaMetadataCompat;
import android.support.p069v4.media.session.C3923Wwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwww;
import android.support.p069v4.media.session.C3926Wwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwww;
import android.support.p069v4.media.session.MediaSessionCompat;
import android.util.Log;
import androidx.media.AudioAttributesCompat;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.concurrent.ConcurrentHashMap;

/* renamed from: android.support.v4.media.session.MediaControllerCompat */
public final class MediaControllerCompat {

    /* renamed from: Wwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwww  reason: collision with root package name */
    public final C3888Wwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwww f18059Wwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwww;

    /* renamed from: Wwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwww  reason: collision with other field name */
    public final MediaSessionCompat.Token f5253Wwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwww;
    @SuppressLint({"BanConcurrentHashMap"})

    /* renamed from: Wwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwww  reason: collision with other field name */
    public final ConcurrentHashMap<C3889Wwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwww, Boolean> f5254Wwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwww = new ConcurrentHashMap<>();

    /* renamed from: android.support.v4.media.session.MediaControllerCompat$MediaControllerImplApi21 */
    public static class MediaControllerImplApi21 implements C3888Wwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwww {

        /* renamed from: Wwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwww  reason: collision with root package name */
        public final MediaController f18060Wwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwww;

        /* renamed from: Wwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwww  reason: collision with other field name */
        public final MediaSessionCompat.Token f5255Wwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwww;

        /* renamed from: Wwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwww  reason: collision with other field name */
        public final Object f5256Wwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwww = new Object();

        /* renamed from: Wwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwww  reason: collision with other field name */
        public HashMap<C3889Wwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwww, C3878Wwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwww> f5257Wwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwww = new HashMap<>();

        /* renamed from: Wwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwww  reason: collision with other field name */
        public final List<C3889Wwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwww> f5258Wwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwww = new ArrayList();

        /* renamed from: android.support.v4.media.session.MediaControllerCompat$MediaControllerImplApi21$ExtraBinderRequestResultReceiver */
        public static class ExtraBinderRequestResultReceiver extends ResultReceiver {

            /* renamed from: Wwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwww  reason: collision with root package name */
            public WeakReference<MediaControllerImplApi21> f18061Wwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwww;

            public ExtraBinderRequestResultReceiver(MediaControllerImplApi21 mediaControllerImplApi21) {
                super((Handler) null);
                this.f18061Wwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwww = new WeakReference<>(mediaControllerImplApi21);
            }

            public void onReceiveResult(int i, Bundle bundle) {
                MediaControllerImplApi21 mediaControllerImplApi21 = (MediaControllerImplApi21) this.f18061Wwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwww.get();
                if (mediaControllerImplApi21 != null && bundle != null) {
                    synchronized (mediaControllerImplApi21.f5256Wwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwww) {
                        mediaControllerImplApi21.f5255Wwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwww.Wwwwwwwwwwwwwwwwwwwwwwwwwww(C3923Wwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwww.C3924Wwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwww.Wwwwwwwwwww(C3155Wwwwwwwwwwwwwwwwwwwwwwwwwwwww.Wwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwww(bundle, "android.support.v4.media.session.EXTRA_BINDER")));
                        mediaControllerImplApi21.f5255Wwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwww.Wwwwwwwwwwwwwwwwwwwwwwww(C1309Wwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwww.Wwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwww(bundle, "android.support.v4.media.session.SESSION_TOKEN2"));
                        mediaControllerImplApi21.Wwwwwwwwwwwwwwwwwwwwwwwwwwwwww();
                    }
                }
            }
        }

        /* renamed from: android.support.v4.media.session.MediaControllerCompat$MediaControllerImplApi21$Wwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwww */
        public static class C3878Wwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwww extends C3889Wwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwww.C3890Wwwwwwwwwwwwwwwwwwwwwwwwwwwwwwww {
            public C3878Wwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwww(C3889Wwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwww wwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwww) {
                super(wwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwww);
            }

            public void IIllllll(Bundle bundle) {
                throw new AssertionError();
            }

            public void Illllllllllllll(MediaMetadataCompat mediaMetadataCompat) {
                throw new AssertionError();
            }

            public void Kkkk() {
                throw new AssertionError();
            }

            public void Kkkkkkkkkkkkkk(CharSequence charSequence) {
                throw new AssertionError();
            }

            public void QQOOOOOOO(List<MediaSessionCompat.QueueItem> list) {
                throw new AssertionError();
            }

            public void sometimesNaive(ParcelableVolumeInfo parcelableVolumeInfo) {
                throw new AssertionError();
            }
        }

        public MediaControllerImplApi21(Context context, MediaSessionCompat.Token token) {
            this.f5255Wwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwww = token;
            this.f18060Wwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwww = new MediaController(context, (MediaSession.Token) token.Wwwwwwwwwwwwwwwwwwwwwwwwwwwwww());
            if (token.Wwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwww() == null) {
                Wwwwwwwwwwwwwwwwwwwwwwwwwwwww();
            }
        }

        public MediaMetadataCompat Wwwwwww() {
            MediaMetadata metadata = this.f18060Wwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwww.getMetadata();
            if (metadata != null) {
                return MediaMetadataCompat.Wwwwwwwwwwwwwwwwwwwwwwwwwwwwwwww(metadata);
            }
            return null;
        }

        public PlaybackStateCompat Wwwwwwwwwwwwwwwwwwwwwwwwwww() {
            if (this.f5255Wwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwww.Wwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwww() != null) {
                try {
                    return this.f5255Wwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwww.Wwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwww().Wwwwwwwwwwwwwwwwwwwwwwwwwww();
                } catch (RemoteException e) {
                    Log.e("MediaControllerCompat", "Dead object in getPlaybackState.", e);
                }
            }
            PlaybackState playbackState = this.f18060Wwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwww.getPlaybackState();
            if (playbackState != null) {
                return PlaybackStateCompat.Wwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwww(playbackState);
            }
            return null;
        }

        public void Wwwwwwwwwwwwwwwwwwwwwwwwwwww(String str, Bundle bundle, ResultReceiver resultReceiver) {
            this.f18060Wwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwww.sendCommand(str, bundle, resultReceiver);
        }

        public final void Wwwwwwwwwwwwwwwwwwwwwwwwwwwww() {
            Wwwwwwwwwwwwwwwwwwwwwwwwwwww("android.support.v4.media.session.command.GET_EXTRA_BINDER", (Bundle) null, new ExtraBinderRequestResultReceiver(this));
        }

        public void Wwwwwwwwwwwwwwwwwwwwwwwwwwwwww() {
            if (this.f5255Wwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwww.Wwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwww() != null) {
                for (C3889Wwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwww next : this.f5258Wwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwww) {
                    C3878Wwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwww wwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwww = new C3878Wwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwww(next);
                    this.f5257Wwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwww.put(next, wwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwww);
                    next.f5261Wwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwww = wwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwww;
                    try {
                        this.f5255Wwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwww.Wwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwww().Cccccccc(wwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwww);
                        next.Wwwwwwwwwwwwwwwwwwwwww(13, (Object) null, (Bundle) null);
                    } catch (RemoteException e) {
                        Log.e("MediaControllerCompat", "Dead object in registerCallback.", e);
                    }
                }
                this.f5258Wwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwww.clear();
            }
        }

        public C3884Wwwwwwwwwwwwwwwwwwwwwwwwwwwww Wwwwwwwwwwwwwwwwwwwwwwwwwwwwwww() {
            MediaController.TransportControls transportControls = this.f18060Wwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwww.getTransportControls();
            int i = Build.VERSION.SDK_INT;
            if (i >= 29) {
                return new C3880Wwwwwwwwwwwwwwwwwwwwwwwww(transportControls);
            }
            if (i >= 24) {
                return new C3881Wwwwwwwwwwwwwwwwwwwwwwwwww(transportControls);
            }
            if (i >= 23) {
                return new C3882Wwwwwwwwwwwwwwwwwwwwwwwwwww(transportControls);
            }
            return new C3883Wwwwwwwwwwwwwwwwwwwwwwwwwwww(transportControls);
        }

        public PendingIntent Wwwwwwwwwwwwwwwwwwwwwwwwwwwwwwww() {
            return this.f18060Wwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwww.getSessionActivity();
        }

        public final void Wwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwww(C3889Wwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwww wwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwww, Handler handler) {
            this.f18060Wwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwww.registerCallback(wwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwww.f18065Wwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwww, handler);
            synchronized (this.f5256Wwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwww) {
                if (this.f5255Wwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwww.Wwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwww() != null) {
                    C3878Wwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwww wwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwww2 = new C3878Wwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwww(wwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwww);
                    this.f5257Wwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwww.put(wwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwww, wwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwww2);
                    wwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwww.f5261Wwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwww = wwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwww2;
                    try {
                        this.f5255Wwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwww.Wwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwww().Cccccccc(wwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwww2);
                        wwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwww.Wwwwwwwwwwwwwwwwwwwwww(13, (Object) null, (Bundle) null);
                    } catch (RemoteException e) {
                        Log.e("MediaControllerCompat", "Dead object in registerCallback.", e);
                    }
                } else {
                    wwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwww.f5261Wwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwww = null;
                    this.f5258Wwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwww.add(wwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwww);
                }
            }
        }

        public final void Wwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwww(C3889Wwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwww wwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwww) {
            this.f18060Wwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwww.unregisterCallback(wwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwww.f18065Wwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwww);
            synchronized (this.f5256Wwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwww) {
                if (this.f5255Wwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwww.Wwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwww() != null) {
                    try {
                        C3878Wwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwww remove = this.f5257Wwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwww.remove(wwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwww);
                        if (remove != null) {
                            wwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwww.f5261Wwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwww = null;
                            this.f5255Wwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwww.Wwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwww().mo11049m(remove);
                        }
                    } catch (RemoteException e) {
                        Log.e("MediaControllerCompat", "Dead object in unregisterCallback.", e);
                    }
                } else {
                    this.f5258Wwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwww.remove(wwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwww);
                }
            }
        }
    }

    /* renamed from: android.support.v4.media.session.MediaControllerCompat$Wwwwwwwwwwwwwwwwwwwwwwww */
    public static class C3879Wwwwwwwwwwwwwwwwwwwwwwww extends C3884Wwwwwwwwwwwwwwwwwwwwwwwwwwwww {

        /* renamed from: Wwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwww  reason: collision with root package name */
        public C3923Wwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwww f18062Wwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwww;

        public C3879Wwwwwwwwwwwwwwwwwwwwwwww(C3923Wwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwww wwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwww) {
            this.f18062Wwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwww = wwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwww;
        }

        public void Wwwwwwwwwwwwwwwwwwwwwwwwwwwwwwww() {
            try {
                this.f18062Wwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwww.stop();
            } catch (RemoteException e) {
                Log.e("MediaControllerCompat", "Dead object in stop.", e);
            }
        }

        public void Wwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwww() {
            try {
                this.f18062Wwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwww.Wwwwwwwwwwwwwwwwwww();
            } catch (RemoteException e) {
                Log.e("MediaControllerCompat", "Dead object in play.", e);
            }
        }

        public void Wwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwww() {
            try {
                this.f18062Wwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwww.pause();
            } catch (RemoteException e) {
                Log.e("MediaControllerCompat", "Dead object in pause.", e);
            }
        }
    }

    /* renamed from: android.support.v4.media.session.MediaControllerCompat$Wwwwwwwwwwwwwwwwwwwwwwwww */
    public static class C3880Wwwwwwwwwwwwwwwwwwwwwwwww extends C3881Wwwwwwwwwwwwwwwwwwwwwwwwww {
        public C3880Wwwwwwwwwwwwwwwwwwwwwwwww(MediaController.TransportControls transportControls) {
            super(transportControls);
        }
    }

    /* renamed from: android.support.v4.media.session.MediaControllerCompat$Wwwwwwwwwwwwwwwwwwwwwwwwww */
    public static class C3881Wwwwwwwwwwwwwwwwwwwwwwwwww extends C3882Wwwwwwwwwwwwwwwwwwwwwwwwwww {
        public C3881Wwwwwwwwwwwwwwwwwwwwwwwwww(MediaController.TransportControls transportControls) {
            super(transportControls);
        }
    }

    /* renamed from: android.support.v4.media.session.MediaControllerCompat$Wwwwwwwwwwwwwwwwwwwwwwwwwww */
    public static class C3882Wwwwwwwwwwwwwwwwwwwwwwwwwww extends C3883Wwwwwwwwwwwwwwwwwwwwwwwwwwww {
        public C3882Wwwwwwwwwwwwwwwwwwwwwwwwwww(MediaController.TransportControls transportControls) {
            super(transportControls);
        }
    }

    /* renamed from: android.support.v4.media.session.MediaControllerCompat$Wwwwwwwwwwwwwwwwwwwwwwwwwwww */
    public static class C3883Wwwwwwwwwwwwwwwwwwwwwwwwwwww extends C3884Wwwwwwwwwwwwwwwwwwwwwwwwwwwww {

        /* renamed from: Wwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwww  reason: collision with root package name */
        public final MediaController.TransportControls f18063Wwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwww;

        public C3883Wwwwwwwwwwwwwwwwwwwwwwwwwwww(MediaController.TransportControls transportControls) {
            this.f18063Wwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwww = transportControls;
        }

        public void Wwwwwwwwwwwwwwwwwwwwwwwwwwwwwwww() {
            this.f18063Wwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwww.stop();
        }

        public void Wwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwww() {
            this.f18063Wwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwww.play();
        }

        public void Wwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwww() {
            this.f18063Wwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwww.pause();
        }
    }

    /* renamed from: android.support.v4.media.session.MediaControllerCompat$Wwwwwwwwwwwwwwwwwwwwwwwwwwwww */
    public static abstract class C3884Wwwwwwwwwwwwwwwwwwwwwwwwwwwww {
        public abstract void Wwwwwwwwwwwwwwwwwwwwwwwwwwwwwwww();

        public abstract void Wwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwww();

        public abstract void Wwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwww();
    }

    /* renamed from: android.support.v4.media.session.MediaControllerCompat$Wwwwwwwwwwwwwwwwwwwwwwwwwwwwww */
    public static final class C3885Wwwwwwwwwwwwwwwwwwwwwwwwwwwwww {
        public C3885Wwwwwwwwwwwwwwwwwwwwwwwwwwwwww(int i, int i2, int i3, int i4, int i5) {
            this(i, new AudioAttributesCompat.C4341Wwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwww().Wwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwww(i2).Wwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwww(), i3, i4, i5);
        }

        public C3885Wwwwwwwwwwwwwwwwwwwwwwwwwwwwww(int i, AudioAttributesCompat audioAttributesCompat, int i2, int i3, int i4) {
        }
    }

    /* renamed from: android.support.v4.media.session.MediaControllerCompat$Wwwwwwwwwwwwwwwwwwwwwwwwwwwwwww */
    public static class C3886Wwwwwwwwwwwwwwwwwwwwwwwwwwwwwww implements C3888Wwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwww {

        /* renamed from: Wwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwww  reason: collision with root package name */
        public C3884Wwwwwwwwwwwwwwwwwwwwwwwwwwwww f18064Wwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwww;

        /* renamed from: Wwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwww  reason: collision with other field name */
        public C3923Wwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwww f5259Wwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwww;

        public C3886Wwwwwwwwwwwwwwwwwwwwwwwwwwwwwww(MediaSessionCompat.Token token) {
            this.f5259Wwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwww = C3923Wwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwww.C3924Wwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwww.Wwwwwwwwwww((IBinder) token.Wwwwwwwwwwwwwwwwwwwwwwwwwwwwww());
        }

        public MediaMetadataCompat Wwwwwww() {
            try {
                return this.f5259Wwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwww.Wwwwwww();
            } catch (RemoteException e) {
                Log.e("MediaControllerCompat", "Dead object in getMetadata.", e);
                return null;
            }
        }

        public PlaybackStateCompat Wwwwwwwwwwwwwwwwwwwwwwwwwww() {
            try {
                return this.f5259Wwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwww.Wwwwwwwwwwwwwwwwwwwwwwwwwww();
            } catch (RemoteException e) {
                Log.e("MediaControllerCompat", "Dead object in getPlaybackState.", e);
                return null;
            }
        }

        public C3884Wwwwwwwwwwwwwwwwwwwwwwwwwwwww Wwwwwwwwwwwwwwwwwwwwwwwwwwwwwww() {
            if (this.f18064Wwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwww == null) {
                this.f18064Wwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwww = new C3879Wwwwwwwwwwwwwwwwwwwwwwww(this.f5259Wwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwww);
            }
            return this.f18064Wwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwww;
        }

        public PendingIntent Wwwwwwwwwwwwwwwwwwwwwwwwwwwwwwww() {
            try {
                return this.f5259Wwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwww.Zzzz();
            } catch (RemoteException e) {
                Log.e("MediaControllerCompat", "Dead object in getSessionActivity.", e);
                return null;
            }
        }

        public void Wwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwww(C3889Wwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwww wwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwww, Handler handler) {
            if (wwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwww != null) {
                try {
                    this.f5259Wwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwww.asBinder().linkToDeath(wwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwww, 0);
                    this.f5259Wwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwww.Cccccccc(wwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwww.f5261Wwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwww);
                    wwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwww.Wwwwwwwwwwwwwwwwwwwwww(13, (Object) null, (Bundle) null);
                } catch (RemoteException e) {
                    Log.e("MediaControllerCompat", "Dead object in registerCallback.", e);
                    wwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwww.Wwwwwwwwwwwwwwwwwwwwww(8, (Object) null, (Bundle) null);
                }
            } else {
                throw new IllegalArgumentException("callback may not be null.");
            }
        }

        public void Wwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwww(C3889Wwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwww wwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwww) {
            if (wwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwww != null) {
                try {
                    this.f5259Wwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwww.mo11049m(wwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwww.f5261Wwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwww);
                    this.f5259Wwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwww.asBinder().unlinkToDeath(wwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwww, 0);
                } catch (RemoteException e) {
                    Log.e("MediaControllerCompat", "Dead object in unregisterCallback.", e);
                }
            } else {
                throw new IllegalArgumentException("callback may not be null.");
            }
        }
    }

    /* renamed from: android.support.v4.media.session.MediaControllerCompat$Wwwwwwwwwwwwwwwwwwwwwwwwwwwwwwww */
    public static class C3887Wwwwwwwwwwwwwwwwwwwwwwwwwwwwwwww extends MediaControllerImplApi21 {
        public C3887Wwwwwwwwwwwwwwwwwwwwwwwwwwwwwwww(Context context, MediaSessionCompat.Token token) {
            super(context, token);
        }
    }

    /* renamed from: android.support.v4.media.session.MediaControllerCompat$Wwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwww */
    public interface C3888Wwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwww {
        MediaMetadataCompat Wwwwwww();

        PlaybackStateCompat Wwwwwwwwwwwwwwwwwwwwwwwwwww();

        C3884Wwwwwwwwwwwwwwwwwwwwwwwwwwwww Wwwwwwwwwwwwwwwwwwwwwwwwwwwwwww();

        PendingIntent Wwwwwwwwwwwwwwwwwwwwwwwwwwwwwwww();

        void Wwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwww(C3889Wwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwww wwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwww, Handler handler);

        void Wwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwww(C3889Wwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwww wwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwww);
    }

    /* renamed from: android.support.v4.media.session.MediaControllerCompat$Wwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwww */
    public static abstract class C3889Wwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwww implements IBinder.DeathRecipient {

        /* renamed from: Wwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwww  reason: collision with root package name */
        public final MediaController.Callback f18065Wwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwww;

        /* renamed from: Wwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwww  reason: collision with other field name */
        public C3891Wwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwww f5260Wwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwww;

        /* renamed from: Wwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwww  reason: collision with other field name */
        public C3926Wwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwww f5261Wwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwww;

        /* renamed from: android.support.v4.media.session.MediaControllerCompat$Wwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwww$Wwwwwwwwwwwwwwwwwwwwwwwwwwwwwwww */
        public static class C3890Wwwwwwwwwwwwwwwwwwwwwwwwwwwwwwww extends C3926Wwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwww.C3927Wwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwww {

            /* renamed from: Wwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwww  reason: collision with root package name */
            public final WeakReference<C3889Wwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwww> f18066Wwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwww;

            public C3890Wwwwwwwwwwwwwwwwwwwwwwwwwwwwwwww(C3889Wwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwww wwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwww) {
                this.f18066Wwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwww = new WeakReference<>(wwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwww);
            }

            public void IIllllll(Bundle bundle) {
                C3889Wwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwww wwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwww = (C3889Wwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwww) this.f18066Wwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwww.get();
                if (wwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwww != null) {
                    wwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwww.Wwwwwwwwwwwwwwwwwwwwww(7, bundle, (Bundle) null);
                }
            }

            public void Illllllllllllll(MediaMetadataCompat mediaMetadataCompat) {
                C3889Wwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwww wwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwww = (C3889Wwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwww) this.f18066Wwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwww.get();
                if (wwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwww != null) {
                    wwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwww.Wwwwwwwwwwwwwwwwwwwwww(3, mediaMetadataCompat, (Bundle) null);
                }
            }

            public void Kkkk() {
                C3889Wwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwww wwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwww = (C3889Wwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwww) this.f18066Wwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwww.get();
                if (wwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwww != null) {
                    wwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwww.Wwwwwwwwwwwwwwwwwwwwww(8, (Object) null, (Bundle) null);
                }
            }

            public void Kkkkkkkkkkkkkk(CharSequence charSequence) {
                C3889Wwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwww wwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwww = (C3889Wwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwww) this.f18066Wwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwww.get();
                if (wwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwww != null) {
                    wwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwww.Wwwwwwwwwwwwwwwwwwwwww(6, charSequence, (Bundle) null);
                }
            }

            public void Mmmmmmmmm(PlaybackStateCompat playbackStateCompat) {
                C3889Wwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwww wwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwww = (C3889Wwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwww) this.f18066Wwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwww.get();
                if (wwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwww != null) {
                    wwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwww.Wwwwwwwwwwwwwwwwwwwwww(2, playbackStateCompat, (Bundle) null);
                }
            }

            public void O000000000() {
                C3889Wwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwww wwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwww = (C3889Wwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwww) this.f18066Wwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwww.get();
                if (wwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwww != null) {
                    wwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwww.Wwwwwwwwwwwwwwwwwwwwww(13, (Object) null, (Bundle) null);
                }
            }

            public void Ooo(boolean z) {
            }

            public void QQOO(boolean z) {
                C3889Wwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwww wwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwww = (C3889Wwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwww) this.f18066Wwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwww.get();
                if (wwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwww != null) {
                    wwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwww.Wwwwwwwwwwwwwwwwwwwwww(11, Boolean.valueOf(z), (Bundle) null);
                }
            }

            public void QQOOOOOOO(List<MediaSessionCompat.QueueItem> list) {
                C3889Wwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwww wwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwww = (C3889Wwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwww) this.f18066Wwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwww.get();
                if (wwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwww != null) {
                    wwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwww.Wwwwwwwwwwwwwwwwwwwwww(5, list, (Bundle) null);
                }
            }

            public void Uuuuuuu(int i) {
                C3889Wwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwww wwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwww = (C3889Wwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwww) this.f18066Wwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwww.get();
                if (wwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwww != null) {
                    wwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwww.Wwwwwwwwwwwwwwwwwwwwww(12, Integer.valueOf(i), (Bundle) null);
                }
            }

            public void Wwwwwwwwwwww(int i) {
                C3889Wwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwww wwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwww = (C3889Wwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwww) this.f18066Wwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwww.get();
                if (wwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwww != null) {
                    wwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwww.Wwwwwwwwwwwwwwwwwwwwww(9, Integer.valueOf(i), (Bundle) null);
                }
            }

            public void Wwwwwwwwwwwwww(String str, Bundle bundle) {
                C3889Wwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwww wwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwww = (C3889Wwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwww) this.f18066Wwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwww.get();
                if (wwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwww != null) {
                    wwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwww.Wwwwwwwwwwwwwwwwwwwwww(1, str, bundle);
                }
            }

            public void sometimesNaive(ParcelableVolumeInfo parcelableVolumeInfo) {
                C3889Wwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwww wwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwww = (C3889Wwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwww) this.f18066Wwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwww.get();
                if (wwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwww != null) {
                    wwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwww.Wwwwwwwwwwwwwwwwwwwwww(4, parcelableVolumeInfo != null ? new C3885Wwwwwwwwwwwwwwwwwwwwwwwwwwwwww(parcelableVolumeInfo.f18099Wwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwww, parcelableVolumeInfo.f18098Wwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwww, parcelableVolumeInfo.f18097Wwwwwwwwwwwwwwwwwwwwwwwwwwwwwwww, parcelableVolumeInfo.f18096Wwwwwwwwwwwwwwwwwwwwwwwwwwwwwww, parcelableVolumeInfo.f18095Wwwwwwwwwwwwwwwwwwwwwwwwwwwwww) : null, (Bundle) null);
                }
            }
        }

        /* renamed from: android.support.v4.media.session.MediaControllerCompat$Wwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwww$Wwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwww */
        public class C3891Wwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwww extends Handler {

            /* renamed from: Wwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwww  reason: collision with other field name */
            public boolean f5262Wwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwww = false;

            public C3891Wwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwww(Looper looper) {
                super(looper);
            }

            public void handleMessage(Message message) {
                if (this.f5262Wwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwww) {
                    switch (message.what) {
                        case 1:
                            Bundle data = message.getData();
                            MediaSessionCompat.Wwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwww(data);
                            C3889Wwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwww.this.Wwwwwwwwwwwwwwwwwwwwwwwww((String) message.obj, data);
                            return;
                        case 2:
                            C3889Wwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwww.this.Wwwwwwwwwwwwwwwwwwwwwwwwwwwwww((PlaybackStateCompat) message.obj);
                            return;
                        case 3:
                            C3889Wwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwww.this.Wwwwwwwwwwwwwwwwwwwwwwwwwwwwwww((MediaMetadataCompat) message.obj);
                            return;
                        case 4:
                            C3889Wwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwww.this.Wwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwww((C3885Wwwwwwwwwwwwwwwwwwwwwwwwwwwwww) message.obj);
                            return;
                        case 5:
                            C3889Wwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwww.this.Wwwwwwwwwwwwwwwwwwwwwwwwwwwww((List) message.obj);
                            return;
                        case 6:
                            C3889Wwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwww.this.Wwwwwwwwwwwwwwwwwwwwwwwwwwww((CharSequence) message.obj);
                            return;
                        case 7:
                            Bundle bundle = (Bundle) message.obj;
                            MediaSessionCompat.Wwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwww(bundle);
                            C3889Wwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwww.this.Wwwwwwwwwwwwwwwwwwwwwwwwwwwwwwww(bundle);
                            return;
                        case 8:
                            C3889Wwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwww.this.Wwwwwwwwwwwwwwwwwwwwwwwwww();
                            return;
                        case 9:
                            C3889Wwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwww.this.Wwwwwwwwwwwwwwwwwwwwwwwwwww(((Integer) message.obj).intValue());
                            return;
                        case 11:
                            C3889Wwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwww.this.Wwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwww(((Boolean) message.obj).booleanValue());
                            return;
                        case 12:
                            C3889Wwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwww.this.Wwwwwwwwwwwwwwwwwwwwwww(((Integer) message.obj).intValue());
                            return;
                        case 13:
                            C3889Wwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwww.this.Wwwwwwwwwwwwwwwwwwwwwwww();
                            return;
                        default:
                            return;
                    }
                }
            }
        }

        /* renamed from: android.support.v4.media.session.MediaControllerCompat$Wwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwww$Wwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwww */
        public static class C3892Wwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwww extends MediaController.Callback {

            /* renamed from: Wwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwww  reason: collision with root package name */
            public final WeakReference<C3889Wwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwww> f18068Wwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwww;

            public C3892Wwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwww(C3889Wwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwww wwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwww) {
                this.f18068Wwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwww = new WeakReference<>(wwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwww);
            }

            public void onAudioInfoChanged(MediaController.PlaybackInfo playbackInfo) {
                C3889Wwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwww wwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwww = (C3889Wwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwww) this.f18068Wwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwww.get();
                if (wwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwww != null) {
                    wwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwww.Wwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwww(new C3885Wwwwwwwwwwwwwwwwwwwwwwwwwwwwww(playbackInfo.getPlaybackType(), AudioAttributesCompat.Wwwwwwwwwwwwwwwwwwwwwwwwwwwwwwww(playbackInfo.getAudioAttributes()), playbackInfo.getVolumeControl(), playbackInfo.getMaxVolume(), playbackInfo.getCurrentVolume()));
                }
            }

            public void onExtrasChanged(Bundle bundle) {
                MediaSessionCompat.Wwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwww(bundle);
                C3889Wwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwww wwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwww = (C3889Wwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwww) this.f18068Wwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwww.get();
                if (wwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwww != null) {
                    wwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwww.Wwwwwwwwwwwwwwwwwwwwwwwwwwwwwwww(bundle);
                }
            }

            public void onMetadataChanged(MediaMetadata mediaMetadata) {
                C3889Wwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwww wwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwww = (C3889Wwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwww) this.f18068Wwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwww.get();
                if (wwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwww != null) {
                    wwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwww.Wwwwwwwwwwwwwwwwwwwwwwwwwwwwwww(MediaMetadataCompat.Wwwwwwwwwwwwwwwwwwwwwwwwwwwwwwww(mediaMetadata));
                }
            }

            public void onPlaybackStateChanged(PlaybackState playbackState) {
                C3889Wwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwww wwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwww = (C3889Wwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwww) this.f18068Wwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwww.get();
                if (wwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwww != null && wwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwww.f5261Wwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwww == null) {
                    wwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwww.Wwwwwwwwwwwwwwwwwwwwwwwwwwwwww(PlaybackStateCompat.Wwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwww(playbackState));
                }
            }

            public void onQueueChanged(List<MediaSession.QueueItem> list) {
                C3889Wwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwww wwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwww = (C3889Wwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwww) this.f18068Wwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwww.get();
                if (wwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwww != null) {
                    wwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwww.Wwwwwwwwwwwwwwwwwwwwwwwwwwwww(MediaSessionCompat.QueueItem.Wwwwwwwwwwwwwwwwwwwwwwwwwwwwwwww(list));
                }
            }

            public void onQueueTitleChanged(CharSequence charSequence) {
                C3889Wwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwww wwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwww = (C3889Wwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwww) this.f18068Wwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwww.get();
                if (wwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwww != null) {
                    wwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwww.Wwwwwwwwwwwwwwwwwwwwwwwwwwww(charSequence);
                }
            }

            public void onSessionDestroyed() {
                C3889Wwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwww wwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwww = (C3889Wwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwww) this.f18068Wwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwww.get();
                if (wwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwww != null) {
                    wwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwww.Wwwwwwwwwwwwwwwwwwwwwwwwww();
                }
            }

            public void onSessionEvent(String str, Bundle bundle) {
                MediaSessionCompat.Wwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwww(bundle);
                C3889Wwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwww wwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwww = (C3889Wwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwww) this.f18068Wwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwww.get();
                if (wwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwww == null) {
                    return;
                }
                if (wwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwww.f5261Wwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwww == null || Build.VERSION.SDK_INT >= 23) {
                    wwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwww.Wwwwwwwwwwwwwwwwwwwwwwwww(str, bundle);
                }
            }
        }

        public C3889Wwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwww() {
            if (Build.VERSION.SDK_INT >= 21) {
                this.f18065Wwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwww = new C3892Wwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwww(this);
                return;
            }
            this.f18065Wwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwww = null;
            this.f5261Wwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwww = new C3890Wwwwwwwwwwwwwwwwwwwwwwwwwwwwwwww(this);
        }

        public void Wwwwwwwwwwwwwwwwwwwww(Handler handler) {
            if (handler == null) {
                C3891Wwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwww wwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwww = this.f5260Wwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwww;
                if (wwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwww != null) {
                    wwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwww.f5262Wwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwww = false;
                    wwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwww.removeCallbacksAndMessages((Object) null);
                    this.f5260Wwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwww = null;
                    return;
                }
                return;
            }
            C3891Wwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwww wwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwww2 = new C3891Wwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwww(handler.getLooper());
            this.f5260Wwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwww = wwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwww2;
            wwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwww2.f5262Wwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwww = true;
        }

        public void Wwwwwwwwwwwwwwwwwwwwww(int i, Object obj, Bundle bundle) {
            C3891Wwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwww wwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwww = this.f5260Wwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwww;
            if (wwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwww != null) {
                Message obtainMessage = wwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwww.obtainMessage(i, obj);
                obtainMessage.setData(bundle);
                obtainMessage.sendToTarget();
            }
        }

        public void Wwwwwwwwwwwwwwwwwwwwwww(int i) {
        }

        public void Wwwwwwwwwwwwwwwwwwwwwwww() {
        }

        public void Wwwwwwwwwwwwwwwwwwwwwwwww(String str, Bundle bundle) {
        }

        public void Wwwwwwwwwwwwwwwwwwwwwwwwww() {
        }

        public void Wwwwwwwwwwwwwwwwwwwwwwwwwww(int i) {
        }

        public void Wwwwwwwwwwwwwwwwwwwwwwwwwwww(CharSequence charSequence) {
        }

        public void Wwwwwwwwwwwwwwwwwwwwwwwwwwwww(List<MediaSessionCompat.QueueItem> list) {
        }

        public void Wwwwwwwwwwwwwwwwwwwwwwwwwwwwww(PlaybackStateCompat playbackStateCompat) {
        }

        public void Wwwwwwwwwwwwwwwwwwwwwwwwwwwwwww(MediaMetadataCompat mediaMetadataCompat) {
        }

        public void Wwwwwwwwwwwwwwwwwwwwwwwwwwwwwwww(Bundle bundle) {
        }

        public void Wwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwww(boolean z) {
        }

        public void Wwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwww(C3885Wwwwwwwwwwwwwwwwwwwwwwwwwwwwww wwwwwwwwwwwwwwwwwwwwwwwwwwwwww) {
        }

        public void binderDied() {
            Wwwwwwwwwwwwwwwwwwwwww(8, (Object) null, (Bundle) null);
        }
    }

    public MediaControllerCompat(Context context, MediaSessionCompat mediaSessionCompat) {
        if (mediaSessionCompat != null) {
            MediaSessionCompat.Token Wwwwwwwwwwwwwwwwwwwwwwwwwwwwww2 = mediaSessionCompat.Wwwwwwwwwwwwwwwwwwwwwwwwwwwwww();
            this.f5253Wwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwww = Wwwwwwwwwwwwwwwwwwwwwwwwwwwwww2;
            int i = Build.VERSION.SDK_INT;
            if (i >= 29) {
                this.f18059Wwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwww = new C3887Wwwwwwwwwwwwwwwwwwwwwwwwwwwwwwww(context, Wwwwwwwwwwwwwwwwwwwwwwwwwwwwww2);
            } else if (i >= 21) {
                this.f18059Wwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwww = new MediaControllerImplApi21(context, Wwwwwwwwwwwwwwwwwwwwwwwwwwwwww2);
            } else {
                this.f18059Wwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwww = new C3886Wwwwwwwwwwwwwwwwwwwwwwwwwwwwwww(Wwwwwwwwwwwwwwwwwwwwwwwwwwwwww2);
            }
        } else {
            throw new IllegalArgumentException("session must not be null");
        }
    }

    public void Wwwwwwwwwwwwwwwwwwwwwwwwwwww(C3889Wwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwww wwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwww) {
        if (wwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwww == null) {
            throw new IllegalArgumentException("callback must not be null");
        } else if (this.f5254Wwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwww.remove(wwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwww) == null) {
            Log.w("MediaControllerCompat", "the callback has never been registered");
        } else {
            try {
                this.f18059Wwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwww.Wwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwww(wwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwww);
            } finally {
                wwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwww.Wwwwwwwwwwwwwwwwwwwww((Handler) null);
            }
        }
    }

    public void Wwwwwwwwwwwwwwwwwwwwwwwwwwwww(C3889Wwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwww wwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwww, Handler handler) {
        if (wwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwww == null) {
            throw new IllegalArgumentException("callback must not be null");
        } else if (this.f5254Wwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwww.putIfAbsent(wwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwww, Boolean.TRUE) != null) {
            Log.w("MediaControllerCompat", "the callback has already been registered");
        } else {
            if (handler == null) {
                handler = new Handler();
            }
            wwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwww.Wwwwwwwwwwwwwwwwwwwww(handler);
            this.f18059Wwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwww.Wwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwww(wwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwww, handler);
        }
    }

    public void Wwwwwwwwwwwwwwwwwwwwwwwwwwwwww(C3889Wwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwww wwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwww) {
        Wwwwwwwwwwwwwwwwwwwwwwwwwwwww(wwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwww, (Handler) null);
    }

    public C3884Wwwwwwwwwwwwwwwwwwwwwwwwwwwww Wwwwwwwwwwwwwwwwwwwwwwwwwwwwwww() {
        return this.f18059Wwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwww.Wwwwwwwwwwwwwwwwwwwwwwwwwwwwwww();
    }

    public PendingIntent Wwwwwwwwwwwwwwwwwwwwwwwwwwwwwwww() {
        return this.f18059Wwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwww.Wwwwwwwwwwwwwwwwwwwwwwwwwwwwwwww();
    }

    public PlaybackStateCompat Wwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwww() {
        return this.f18059Wwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwww.Wwwwwwwwwwwwwwwwwwwwwwwwwww();
    }

    public MediaMetadataCompat Wwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwww() {
        return this.f18059Wwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwww.Wwwwwww();
    }

    public MediaControllerCompat(Context context, MediaSessionCompat.Token token) {
        if (token != null) {
            this.f5253Wwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwww = token;
            if (Build.VERSION.SDK_INT >= 21) {
                this.f18059Wwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwww = new MediaControllerImplApi21(context, token);
            } else {
                this.f18059Wwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwww = new C3886Wwwwwwwwwwwwwwwwwwwwwwwwwwwwwww(token);
            }
        } else {
            throw new IllegalArgumentException("sessionToken must not be null");
        }
    }
}
