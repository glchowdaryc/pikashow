package android.support.p069v4.media;

import Wwwwwwwwwwwwwwwwwwwwwwwwwwwwwwww.C3412Wwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwww;
import android.os.Bundle;
import android.os.Parcelable;
import android.support.p069v4.media.session.MediaSessionCompat;
import java.util.ArrayList;
import java.util.Objects;

/* renamed from: android.support.v4.media.MediaBrowserCompat$SearchResultReceiver */
class MediaBrowserCompat$SearchResultReceiver extends C3412Wwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwww {
    public void Wwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwww(int i, Bundle bundle) {
        if (bundle != null) {
            bundle = MediaSessionCompat.Wwwwwwwwwwwwwwww(bundle);
        }
        if (i != 0 || bundle == null || !bundle.containsKey("search_results")) {
            throw null;
        }
        Parcelable[] parcelableArray = bundle.getParcelableArray("search_results");
        Objects.requireNonNull(parcelableArray);
        ArrayList arrayList = new ArrayList();
        for (Parcelable parcelable : parcelableArray) {
            arrayList.add((MediaBrowserCompat$MediaItem) parcelable);
        }
        throw null;
    }
}
