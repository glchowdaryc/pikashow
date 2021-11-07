package android.support.p069v4.media;

import Wwwwwwwwwwwwwwwwwwwwwwwwwwwwwwww.C3412Wwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwww;
import android.os.Bundle;
import android.os.Parcelable;
import android.support.p069v4.media.session.MediaSessionCompat;

/* renamed from: android.support.v4.media.MediaBrowserCompat$ItemReceiver */
class MediaBrowserCompat$ItemReceiver extends C3412Wwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwww {
    public void Wwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwww(int i, Bundle bundle) {
        if (bundle != null) {
            bundle = MediaSessionCompat.Wwwwwwwwwwwwwwww(bundle);
        }
        if (i != 0 || bundle == null || !bundle.containsKey("media_item")) {
            throw null;
        }
        Parcelable parcelable = bundle.getParcelable("media_item");
        if (parcelable == null || (parcelable instanceof MediaBrowserCompat$MediaItem)) {
            MediaBrowserCompat$MediaItem mediaBrowserCompat$MediaItem = (MediaBrowserCompat$MediaItem) parcelable;
            throw null;
        }
        throw null;
    }
}
