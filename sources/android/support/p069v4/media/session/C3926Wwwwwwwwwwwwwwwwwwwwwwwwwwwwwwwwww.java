package android.support.p069v4.media.session;

import android.os.Binder;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.support.p069v4.media.MediaMetadataCompat;
import android.support.p069v4.media.session.MediaSessionCompat;
import java.util.List;

/* renamed from: android.support.v4.media.session.Wwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwww */
public interface C3926Wwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwww extends IInterface {

    /* renamed from: android.support.v4.media.session.Wwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwww$Wwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwww */
    public static abstract class C3927Wwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwww extends Binder implements C3926Wwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwww {

        /* renamed from: android.support.v4.media.session.Wwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwww$Wwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwww$Wwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwww */
        public static class C3928Wwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwww implements C3926Wwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwww {

            /* renamed from: Wwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwww  reason: collision with root package name */
            public static C3926Wwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwww f18112Wwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwww;

            /* renamed from: Wwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwww  reason: collision with other field name */
            public IBinder f5331Wwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwww;

            public C3928Wwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwww(IBinder iBinder) {
                this.f5331Wwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwww = iBinder;
            }

            public void Illllllllllllll(MediaMetadataCompat mediaMetadataCompat) {
                Parcel obtain = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("android.support.v4.media.session.IMediaControllerCallback");
                    if (mediaMetadataCompat != null) {
                        obtain.writeInt(1);
                        mediaMetadataCompat.writeToParcel(obtain, 0);
                    } else {
                        obtain.writeInt(0);
                    }
                    if (this.f5331Wwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwww.transact(4, obtain, (Parcel) null, 1) || C3927Wwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwww.m140w() == null) {
                        obtain.recycle();
                    } else {
                        C3927Wwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwww.m140w().Illllllllllllll(mediaMetadataCompat);
                    }
                } finally {
                    obtain.recycle();
                }
            }

            public void Kkkk() {
                Parcel obtain = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("android.support.v4.media.session.IMediaControllerCallback");
                    if (this.f5331Wwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwww.transact(2, obtain, (Parcel) null, 1) || C3927Wwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwww.m140w() == null) {
                        obtain.recycle();
                    } else {
                        C3927Wwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwww.m140w().Kkkk();
                    }
                } finally {
                    obtain.recycle();
                }
            }

            public void Mmmmmmmmm(PlaybackStateCompat playbackStateCompat) {
                Parcel obtain = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("android.support.v4.media.session.IMediaControllerCallback");
                    if (playbackStateCompat != null) {
                        obtain.writeInt(1);
                        playbackStateCompat.writeToParcel(obtain, 0);
                    } else {
                        obtain.writeInt(0);
                    }
                    if (this.f5331Wwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwww.transact(3, obtain, (Parcel) null, 1) || C3927Wwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwww.m140w() == null) {
                        obtain.recycle();
                    } else {
                        C3927Wwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwww.m140w().Mmmmmmmmm(playbackStateCompat);
                    }
                } finally {
                    obtain.recycle();
                }
            }

            public IBinder asBinder() {
                return this.f5331Wwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwww;
            }

            public void sometimesNaive(ParcelableVolumeInfo parcelableVolumeInfo) {
                Parcel obtain = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("android.support.v4.media.session.IMediaControllerCallback");
                    if (parcelableVolumeInfo != null) {
                        obtain.writeInt(1);
                        parcelableVolumeInfo.writeToParcel(obtain, 0);
                    } else {
                        obtain.writeInt(0);
                    }
                    if (this.f5331Wwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwww.transact(8, obtain, (Parcel) null, 1) || C3927Wwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwww.m140w() == null) {
                        obtain.recycle();
                    } else {
                        C3927Wwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwww.m140w().sometimesNaive(parcelableVolumeInfo);
                    }
                } finally {
                    obtain.recycle();
                }
            }
        }

        public C3927Wwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwww() {
            attachInterface(this, "android.support.v4.media.session.IMediaControllerCallback");
        }

        public static C3926Wwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwww Wwwwwwwwwww(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface queryLocalInterface = iBinder.queryLocalInterface("android.support.v4.media.session.IMediaControllerCallback");
            if (queryLocalInterface == null || !(queryLocalInterface instanceof C3926Wwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwww)) {
                return new C3928Wwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwww(iBinder);
            }
            return (C3926Wwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwww) queryLocalInterface;
        }

        /* renamed from: w */
        public static C3926Wwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwww m140w() {
            return C3928Wwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwww.f18112Wwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwww;
        }

        public IBinder asBinder() {
            return this;
        }

        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v1, resolved type: android.os.Bundle} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v4, resolved type: android.support.v4.media.session.PlaybackStateCompat} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v7, resolved type: android.support.v4.media.MediaMetadataCompat} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v13, resolved type: android.os.Bundle} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v16, resolved type: android.support.v4.media.session.ParcelableVolumeInfo} */
        /* JADX WARNING: type inference failed for: r3v0 */
        /* JADX WARNING: type inference failed for: r3v10, types: [java.lang.CharSequence] */
        /* JADX WARNING: type inference failed for: r3v19 */
        /* JADX WARNING: type inference failed for: r3v20 */
        /* JADX WARNING: type inference failed for: r3v21 */
        /* JADX WARNING: type inference failed for: r3v22 */
        /* JADX WARNING: type inference failed for: r3v23 */
        /* JADX WARNING: type inference failed for: r3v24 */
        /* JADX WARNING: Multi-variable type inference failed */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public boolean onTransact(int r5, android.os.Parcel r6, android.os.Parcel r7, int r8) {
            /*
                r4 = this;
                r0 = 1598968902(0x5f4e5446, float:1.4867585E19)
                r1 = 1
                java.lang.String r2 = "android.support.v4.media.session.IMediaControllerCallback"
                if (r5 == r0) goto L_0x00e7
                r0 = 0
                r3 = 0
                switch(r5) {
                    case 1: goto L_0x00cd;
                    case 2: goto L_0x00c6;
                    case 3: goto L_0x00b0;
                    case 4: goto L_0x009a;
                    case 5: goto L_0x008d;
                    case 6: goto L_0x0077;
                    case 7: goto L_0x0061;
                    case 8: goto L_0x004b;
                    case 9: goto L_0x0040;
                    case 10: goto L_0x0032;
                    case 11: goto L_0x0024;
                    case 12: goto L_0x0019;
                    case 13: goto L_0x0012;
                    default: goto L_0x000d;
                }
            L_0x000d:
                boolean r5 = super.onTransact(r5, r6, r7, r8)
                return r5
            L_0x0012:
                r6.enforceInterface(r2)
                r4.O000000000()
                return r1
            L_0x0019:
                r6.enforceInterface(r2)
                int r5 = r6.readInt()
                r4.Uuuuuuu(r5)
                return r1
            L_0x0024:
                r6.enforceInterface(r2)
                int r5 = r6.readInt()
                if (r5 == 0) goto L_0x002e
                r0 = 1
            L_0x002e:
                r4.QQOO(r0)
                return r1
            L_0x0032:
                r6.enforceInterface(r2)
                int r5 = r6.readInt()
                if (r5 == 0) goto L_0x003c
                r0 = 1
            L_0x003c:
                r4.Ooo(r0)
                return r1
            L_0x0040:
                r6.enforceInterface(r2)
                int r5 = r6.readInt()
                r4.Wwwwwwwwwwww(r5)
                return r1
            L_0x004b:
                r6.enforceInterface(r2)
                int r5 = r6.readInt()
                if (r5 == 0) goto L_0x005d
                android.os.Parcelable$Creator<android.support.v4.media.session.ParcelableVolumeInfo> r5 = android.support.p069v4.media.session.ParcelableVolumeInfo.CREATOR
                java.lang.Object r5 = r5.createFromParcel(r6)
                r3 = r5
                android.support.v4.media.session.ParcelableVolumeInfo r3 = (android.support.p069v4.media.session.ParcelableVolumeInfo) r3
            L_0x005d:
                r4.sometimesNaive(r3)
                return r1
            L_0x0061:
                r6.enforceInterface(r2)
                int r5 = r6.readInt()
                if (r5 == 0) goto L_0x0073
                android.os.Parcelable$Creator r5 = android.os.Bundle.CREATOR
                java.lang.Object r5 = r5.createFromParcel(r6)
                r3 = r5
                android.os.Bundle r3 = (android.os.Bundle) r3
            L_0x0073:
                r4.IIllllll(r3)
                return r1
            L_0x0077:
                r6.enforceInterface(r2)
                int r5 = r6.readInt()
                if (r5 == 0) goto L_0x0089
                android.os.Parcelable$Creator r5 = android.text.TextUtils.CHAR_SEQUENCE_CREATOR
                java.lang.Object r5 = r5.createFromParcel(r6)
                r3 = r5
                java.lang.CharSequence r3 = (java.lang.CharSequence) r3
            L_0x0089:
                r4.Kkkkkkkkkkkkkk(r3)
                return r1
            L_0x008d:
                r6.enforceInterface(r2)
                android.os.Parcelable$Creator<android.support.v4.media.session.MediaSessionCompat$QueueItem> r5 = android.support.p069v4.media.session.MediaSessionCompat.QueueItem.CREATOR
                java.util.ArrayList r5 = r6.createTypedArrayList(r5)
                r4.QQOOOOOOO(r5)
                return r1
            L_0x009a:
                r6.enforceInterface(r2)
                int r5 = r6.readInt()
                if (r5 == 0) goto L_0x00ac
                android.os.Parcelable$Creator<android.support.v4.media.MediaMetadataCompat> r5 = android.support.p069v4.media.MediaMetadataCompat.CREATOR
                java.lang.Object r5 = r5.createFromParcel(r6)
                r3 = r5
                android.support.v4.media.MediaMetadataCompat r3 = (android.support.p069v4.media.MediaMetadataCompat) r3
            L_0x00ac:
                r4.Illllllllllllll(r3)
                return r1
            L_0x00b0:
                r6.enforceInterface(r2)
                int r5 = r6.readInt()
                if (r5 == 0) goto L_0x00c2
                android.os.Parcelable$Creator<android.support.v4.media.session.PlaybackStateCompat> r5 = android.support.p069v4.media.session.PlaybackStateCompat.CREATOR
                java.lang.Object r5 = r5.createFromParcel(r6)
                r3 = r5
                android.support.v4.media.session.PlaybackStateCompat r3 = (android.support.p069v4.media.session.PlaybackStateCompat) r3
            L_0x00c2:
                r4.Mmmmmmmmm(r3)
                return r1
            L_0x00c6:
                r6.enforceInterface(r2)
                r4.Kkkk()
                return r1
            L_0x00cd:
                r6.enforceInterface(r2)
                java.lang.String r5 = r6.readString()
                int r7 = r6.readInt()
                if (r7 == 0) goto L_0x00e3
                android.os.Parcelable$Creator r7 = android.os.Bundle.CREATOR
                java.lang.Object r6 = r7.createFromParcel(r6)
                r3 = r6
                android.os.Bundle r3 = (android.os.Bundle) r3
            L_0x00e3:
                r4.Wwwwwwwwwwwwww(r5, r3)
                return r1
            L_0x00e7:
                r7.writeString(r2)
                return r1
            */
            throw new UnsupportedOperationException("Method not decompiled: android.support.p069v4.media.session.C3926Wwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwww.C3927Wwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwww.onTransact(int, android.os.Parcel, android.os.Parcel, int):boolean");
        }
    }

    void IIllllll(Bundle bundle);

    void Illllllllllllll(MediaMetadataCompat mediaMetadataCompat);

    void Kkkk();

    void Kkkkkkkkkkkkkk(CharSequence charSequence);

    void Mmmmmmmmm(PlaybackStateCompat playbackStateCompat);

    void O000000000();

    void Ooo(boolean z);

    void QQOO(boolean z);

    void QQOOOOOOO(List<MediaSessionCompat.QueueItem> list);

    void Uuuuuuu(int i);

    void Wwwwwwwwwwww(int i);

    void Wwwwwwwwwwwwww(String str, Bundle bundle);

    void sometimesNaive(ParcelableVolumeInfo parcelableVolumeInfo);
}
