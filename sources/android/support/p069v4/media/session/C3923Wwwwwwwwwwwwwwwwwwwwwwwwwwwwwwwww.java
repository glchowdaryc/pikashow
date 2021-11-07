package android.support.p069v4.media.session;

import android.app.PendingIntent;
import android.net.Uri;
import android.os.Binder;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.support.p069v4.media.MediaDescriptionCompat;
import android.support.p069v4.media.MediaMetadataCompat;
import android.support.p069v4.media.RatingCompat;
import android.support.p069v4.media.session.MediaSessionCompat;
import android.view.KeyEvent;
import java.util.List;

/* renamed from: android.support.v4.media.session.Wwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwww */
public interface C3923Wwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwww extends IInterface {

    /* renamed from: android.support.v4.media.session.Wwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwww$Wwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwww */
    public static abstract class C3924Wwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwww extends Binder implements C3923Wwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwww {

        /* renamed from: android.support.v4.media.session.Wwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwww$Wwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwww$Wwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwww */
        public static class C3925Wwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwww implements C3923Wwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwww {

            /* renamed from: Wwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwww  reason: collision with root package name */
            public static C3923Wwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwww f18111Wwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwww;

            /* renamed from: Wwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwww  reason: collision with other field name */
            public IBinder f5330Wwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwww;

            public C3925Wwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwww(IBinder iBinder) {
                this.f5330Wwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwww = iBinder;
            }

            public void Cccccccc(C3926Wwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwww wwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwww) {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("android.support.v4.media.session.IMediaSession");
                    obtain.writeStrongBinder(wwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwww != null ? wwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwww.asBinder() : null);
                    if (this.f5330Wwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwww.transact(3, obtain, obtain2, 0) || C3924Wwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwww.m138w() == null) {
                        obtain2.readException();
                        obtain2.recycle();
                        obtain.recycle();
                        return;
                    }
                    C3924Wwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwww.m138w().Cccccccc(wwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwww);
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            public MediaMetadataCompat Wwwwwww() {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("android.support.v4.media.session.IMediaSession");
                    if (!this.f5330Wwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwww.transact(27, obtain, obtain2, 0) && C3924Wwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwww.m138w() != null) {
                        return C3924Wwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwww.m138w().Wwwwwww();
                    }
                    obtain2.readException();
                    MediaMetadataCompat createFromParcel = obtain2.readInt() != 0 ? MediaMetadataCompat.CREATOR.createFromParcel(obtain2) : null;
                    obtain2.recycle();
                    obtain.recycle();
                    return createFromParcel;
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            public void Wwwwwwwwwwwwwwwwwww() {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("android.support.v4.media.session.IMediaSession");
                    if (this.f5330Wwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwww.transact(13, obtain, obtain2, 0) || C3924Wwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwww.m138w() == null) {
                        obtain2.readException();
                        obtain2.recycle();
                        obtain.recycle();
                        return;
                    }
                    C3924Wwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwww.m138w().Wwwwwwwwwwwwwwwwwww();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            public PlaybackStateCompat Wwwwwwwwwwwwwwwwwwwwwwwwwww() {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("android.support.v4.media.session.IMediaSession");
                    if (!this.f5330Wwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwww.transact(28, obtain, obtain2, 0) && C3924Wwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwww.m138w() != null) {
                        return C3924Wwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwww.m138w().Wwwwwwwwwwwwwwwwwwwwwwwwwww();
                    }
                    obtain2.readException();
                    PlaybackStateCompat createFromParcel = obtain2.readInt() != 0 ? PlaybackStateCompat.CREATOR.createFromParcel(obtain2) : null;
                    obtain2.recycle();
                    obtain.recycle();
                    return createFromParcel;
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            public PendingIntent Zzzz() {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("android.support.v4.media.session.IMediaSession");
                    if (!this.f5330Wwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwww.transact(8, obtain, obtain2, 0) && C3924Wwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwww.m138w() != null) {
                        return C3924Wwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwww.m138w().Zzzz();
                    }
                    obtain2.readException();
                    PendingIntent pendingIntent = obtain2.readInt() != 0 ? (PendingIntent) PendingIntent.CREATOR.createFromParcel(obtain2) : null;
                    obtain2.recycle();
                    obtain.recycle();
                    return pendingIntent;
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            public IBinder asBinder() {
                return this.f5330Wwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwww;
            }

            /* renamed from: m */
            public void mo11049m(C3926Wwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwww wwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwww) {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("android.support.v4.media.session.IMediaSession");
                    obtain.writeStrongBinder(wwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwww != null ? wwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwww.asBinder() : null);
                    if (this.f5330Wwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwww.transact(4, obtain, obtain2, 0) || C3924Wwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwww.m138w() == null) {
                        obtain2.readException();
                        obtain2.recycle();
                        obtain.recycle();
                        return;
                    }
                    C3924Wwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwww.m138w().mo11049m(wwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwww);
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            public void pause() {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("android.support.v4.media.session.IMediaSession");
                    if (this.f5330Wwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwww.transact(18, obtain, obtain2, 0) || C3924Wwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwww.m138w() == null) {
                        obtain2.readException();
                        obtain2.recycle();
                        obtain.recycle();
                        return;
                    }
                    C3924Wwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwww.m138w().pause();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            public void stop() {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("android.support.v4.media.session.IMediaSession");
                    if (this.f5330Wwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwww.transact(19, obtain, obtain2, 0) || C3924Wwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwww.m138w() == null) {
                        obtain2.readException();
                        obtain2.recycle();
                        obtain.recycle();
                        return;
                    }
                    C3924Wwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwww.m138w().stop();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }
        }

        public C3924Wwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwww() {
            attachInterface(this, "android.support.v4.media.session.IMediaSession");
        }

        public static C3923Wwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwww Wwwwwwwwwww(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface queryLocalInterface = iBinder.queryLocalInterface("android.support.v4.media.session.IMediaSession");
            if (queryLocalInterface == null || !(queryLocalInterface instanceof C3923Wwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwww)) {
                return new C3925Wwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwww(iBinder);
            }
            return (C3923Wwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwww) queryLocalInterface;
        }

        /* renamed from: w */
        public static C3923Wwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwww m138w() {
            return C3925Wwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwww.f18111Wwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwww;
        }

        public IBinder asBinder() {
            return this;
        }

        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v1, resolved type: android.support.v4.media.session.MediaSessionCompat$ResultReceiverWrapper} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v4, resolved type: android.view.KeyEvent} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v7, resolved type: android.os.Bundle} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v10, resolved type: android.os.Bundle} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v13, resolved type: android.os.Bundle} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v16, resolved type: android.support.v4.media.RatingCompat} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v19, resolved type: android.os.Bundle} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v22, resolved type: android.os.Bundle} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v25, resolved type: android.os.Bundle} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v28, resolved type: android.os.Bundle} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v31, resolved type: android.support.v4.media.MediaDescriptionCompat} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v34, resolved type: android.support.v4.media.MediaDescriptionCompat} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v37, resolved type: android.support.v4.media.MediaDescriptionCompat} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v40, resolved type: android.os.Bundle} */
        /* JADX WARNING: type inference failed for: r3v0 */
        /* JADX WARNING: type inference failed for: r3v43 */
        /* JADX WARNING: type inference failed for: r3v44 */
        /* JADX WARNING: type inference failed for: r3v45 */
        /* JADX WARNING: type inference failed for: r3v46 */
        /* JADX WARNING: type inference failed for: r3v47 */
        /* JADX WARNING: type inference failed for: r3v48 */
        /* JADX WARNING: type inference failed for: r3v49 */
        /* JADX WARNING: type inference failed for: r3v50 */
        /* JADX WARNING: type inference failed for: r3v51 */
        /* JADX WARNING: type inference failed for: r3v52 */
        /* JADX WARNING: type inference failed for: r3v53 */
        /* JADX WARNING: type inference failed for: r3v54 */
        /* JADX WARNING: type inference failed for: r3v55 */
        /* JADX WARNING: type inference failed for: r3v56 */
        /* JADX WARNING: Multi-variable type inference failed */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public boolean onTransact(int r5, android.os.Parcel r6, android.os.Parcel r7, int r8) {
            /*
                r4 = this;
                r0 = 1598968902(0x5f4e5446, float:1.4867585E19)
                r1 = 1
                java.lang.String r2 = "android.support.v4.media.session.IMediaSession"
                if (r5 == r0) goto L_0x0413
                r0 = 0
                r3 = 0
                switch(r5) {
                    case 1: goto L_0x03e6;
                    case 2: goto L_0x03c9;
                    case 3: goto L_0x03b7;
                    case 4: goto L_0x03a5;
                    case 5: goto L_0x0397;
                    case 6: goto L_0x0389;
                    case 7: goto L_0x037b;
                    case 8: goto L_0x0364;
                    case 9: goto L_0x0356;
                    case 10: goto L_0x033f;
                    case 11: goto L_0x0329;
                    case 12: goto L_0x0313;
                    case 13: goto L_0x0309;
                    case 14: goto L_0x02ec;
                    case 15: goto L_0x02cf;
                    case 16: goto L_0x02a6;
                    case 17: goto L_0x0298;
                    case 18: goto L_0x028e;
                    case 19: goto L_0x0284;
                    case 20: goto L_0x027a;
                    case 21: goto L_0x0270;
                    case 22: goto L_0x0266;
                    case 23: goto L_0x025c;
                    case 24: goto L_0x024e;
                    case 25: goto L_0x0235;
                    case 26: goto L_0x0218;
                    case 27: goto L_0x0201;
                    case 28: goto L_0x01ea;
                    case 29: goto L_0x01dc;
                    case 30: goto L_0x01c5;
                    case 31: goto L_0x01ae;
                    case 32: goto L_0x01a0;
                    case 33: goto L_0x0196;
                    case 34: goto L_0x0179;
                    case 35: goto L_0x015c;
                    case 36: goto L_0x0133;
                    case 37: goto L_0x0125;
                    case 38: goto L_0x0117;
                    case 39: goto L_0x0109;
                    case 40: goto L_0x00f8;
                    case 41: goto L_0x00df;
                    case 42: goto L_0x00c2;
                    case 43: goto L_0x00a9;
                    case 44: goto L_0x009b;
                    case 45: goto L_0x008d;
                    case 46: goto L_0x007c;
                    case 47: goto L_0x006e;
                    case 48: goto L_0x0060;
                    case 49: goto L_0x0052;
                    case 50: goto L_0x003b;
                    case 51: goto L_0x0012;
                    default: goto L_0x000d;
                }
            L_0x000d:
                boolean r5 = super.onTransact(r5, r6, r7, r8)
                return r5
            L_0x0012:
                r6.enforceInterface(r2)
                int r5 = r6.readInt()
                if (r5 == 0) goto L_0x0024
                android.os.Parcelable$Creator<android.support.v4.media.RatingCompat> r5 = android.support.p069v4.media.RatingCompat.CREATOR
                java.lang.Object r5 = r5.createFromParcel(r6)
                android.support.v4.media.RatingCompat r5 = (android.support.p069v4.media.RatingCompat) r5
                goto L_0x0025
            L_0x0024:
                r5 = r3
            L_0x0025:
                int r8 = r6.readInt()
                if (r8 == 0) goto L_0x0034
                android.os.Parcelable$Creator r8 = android.os.Bundle.CREATOR
                java.lang.Object r6 = r8.createFromParcel(r6)
                r3 = r6
                android.os.Bundle r3 = (android.os.Bundle) r3
            L_0x0034:
                r4.Ooooooooooo(r5, r3)
                r7.writeNoException()
                return r1
            L_0x003b:
                r6.enforceInterface(r2)
                android.os.Bundle r5 = r4.Kkkkkkkkkkkkkkkk()
                r7.writeNoException()
                if (r5 == 0) goto L_0x004e
                r7.writeInt(r1)
                r5.writeToParcel(r7, r1)
                goto L_0x0051
            L_0x004e:
                r7.writeInt(r0)
            L_0x0051:
                return r1
            L_0x0052:
                r6.enforceInterface(r2)
                float r5 = r6.readFloat()
                r4.Illllllllllllllllllllllllll(r5)
                r7.writeNoException()
                return r1
            L_0x0060:
                r6.enforceInterface(r2)
                int r5 = r6.readInt()
                r4.Cccc(r5)
                r7.writeNoException()
                return r1
            L_0x006e:
                r6.enforceInterface(r2)
                int r5 = r4.mo11054v()
                r7.writeNoException()
                r7.writeInt(r5)
                return r1
            L_0x007c:
                r6.enforceInterface(r2)
                int r5 = r6.readInt()
                if (r5 == 0) goto L_0x0086
                r0 = 1
            L_0x0086:
                r4.Xxxxxxx(r0)
                r7.writeNoException()
                return r1
            L_0x008d:
                r6.enforceInterface(r2)
                boolean r5 = r4.Sssss()
                r7.writeNoException()
                r7.writeInt(r5)
                return r1
            L_0x009b:
                r6.enforceInterface(r2)
                int r5 = r6.readInt()
                r4.Zzzzzzzzz(r5)
                r7.writeNoException()
                return r1
            L_0x00a9:
                r6.enforceInterface(r2)
                int r5 = r6.readInt()
                if (r5 == 0) goto L_0x00bb
                android.os.Parcelable$Creator<android.support.v4.media.MediaDescriptionCompat> r5 = android.support.p069v4.media.MediaDescriptionCompat.CREATOR
                java.lang.Object r5 = r5.createFromParcel(r6)
                r3 = r5
                android.support.v4.media.MediaDescriptionCompat r3 = (android.support.p069v4.media.MediaDescriptionCompat) r3
            L_0x00bb:
                r4.mo11047g(r3)
                r7.writeNoException()
                return r1
            L_0x00c2:
                r6.enforceInterface(r2)
                int r5 = r6.readInt()
                if (r5 == 0) goto L_0x00d4
                android.os.Parcelable$Creator<android.support.v4.media.MediaDescriptionCompat> r5 = android.support.p069v4.media.MediaDescriptionCompat.CREATOR
                java.lang.Object r5 = r5.createFromParcel(r6)
                r3 = r5
                android.support.v4.media.MediaDescriptionCompat r3 = (android.support.p069v4.media.MediaDescriptionCompat) r3
            L_0x00d4:
                int r5 = r6.readInt()
                r4.Kkk(r3, r5)
                r7.writeNoException()
                return r1
            L_0x00df:
                r6.enforceInterface(r2)
                int r5 = r6.readInt()
                if (r5 == 0) goto L_0x00f1
                android.os.Parcelable$Creator<android.support.v4.media.MediaDescriptionCompat> r5 = android.support.p069v4.media.MediaDescriptionCompat.CREATOR
                java.lang.Object r5 = r5.createFromParcel(r6)
                r3 = r5
                android.support.v4.media.MediaDescriptionCompat r3 = (android.support.p069v4.media.MediaDescriptionCompat) r3
            L_0x00f1:
                r4.Lllll(r3)
                r7.writeNoException()
                return r1
            L_0x00f8:
                r6.enforceInterface(r2)
                int r5 = r6.readInt()
                if (r5 == 0) goto L_0x0102
                r0 = 1
            L_0x0102:
                r4.Xxxxxxxxxxx(r0)
                r7.writeNoException()
                return r1
            L_0x0109:
                r6.enforceInterface(r2)
                int r5 = r6.readInt()
                r4.Wwwww(r5)
                r7.writeNoException()
                return r1
            L_0x0117:
                r6.enforceInterface(r2)
                boolean r5 = r4.OO00000()
                r7.writeNoException()
                r7.writeInt(r5)
                return r1
            L_0x0125:
                r6.enforceInterface(r2)
                int r5 = r4.Wwww()
                r7.writeNoException()
                r7.writeInt(r5)
                return r1
            L_0x0133:
                r6.enforceInterface(r2)
                int r5 = r6.readInt()
                if (r5 == 0) goto L_0x0145
                android.os.Parcelable$Creator r5 = android.net.Uri.CREATOR
                java.lang.Object r5 = r5.createFromParcel(r6)
                android.net.Uri r5 = (android.net.Uri) r5
                goto L_0x0146
            L_0x0145:
                r5 = r3
            L_0x0146:
                int r8 = r6.readInt()
                if (r8 == 0) goto L_0x0155
                android.os.Parcelable$Creator r8 = android.os.Bundle.CREATOR
                java.lang.Object r6 = r8.createFromParcel(r6)
                r3 = r6
                android.os.Bundle r3 = (android.os.Bundle) r3
            L_0x0155:
                r4.Illl(r5, r3)
                r7.writeNoException()
                return r1
            L_0x015c:
                r6.enforceInterface(r2)
                java.lang.String r5 = r6.readString()
                int r8 = r6.readInt()
                if (r8 == 0) goto L_0x0172
                android.os.Parcelable$Creator r8 = android.os.Bundle.CREATOR
                java.lang.Object r6 = r8.createFromParcel(r6)
                r3 = r6
                android.os.Bundle r3 = (android.os.Bundle) r3
            L_0x0172:
                r4.Kkkkkkkkkkkkkkkkkkk(r5, r3)
                r7.writeNoException()
                return r1
            L_0x0179:
                r6.enforceInterface(r2)
                java.lang.String r5 = r6.readString()
                int r8 = r6.readInt()
                if (r8 == 0) goto L_0x018f
                android.os.Parcelable$Creator r8 = android.os.Bundle.CREATOR
                java.lang.Object r6 = r8.createFromParcel(r6)
                r3 = r6
                android.os.Bundle r3 = (android.os.Bundle) r3
            L_0x018f:
                r4.mo11046d(r5, r3)
                r7.writeNoException()
                return r1
            L_0x0196:
                r6.enforceInterface(r2)
                r4.IIlllllll()
                r7.writeNoException()
                return r1
            L_0x01a0:
                r6.enforceInterface(r2)
                int r5 = r4.Www()
                r7.writeNoException()
                r7.writeInt(r5)
                return r1
            L_0x01ae:
                r6.enforceInterface(r2)
                android.os.Bundle r5 = r4.getExtras()
                r7.writeNoException()
                if (r5 == 0) goto L_0x01c1
                r7.writeInt(r1)
                r5.writeToParcel(r7, r1)
                goto L_0x01c4
            L_0x01c1:
                r7.writeInt(r0)
            L_0x01c4:
                return r1
            L_0x01c5:
                r6.enforceInterface(r2)
                java.lang.CharSequence r5 = r4.Kkkkkkkkkkkkkkkkkkkkk()
                r7.writeNoException()
                if (r5 == 0) goto L_0x01d8
                r7.writeInt(r1)
                android.text.TextUtils.writeToParcel(r5, r7, r1)
                goto L_0x01db
            L_0x01d8:
                r7.writeInt(r0)
            L_0x01db:
                return r1
            L_0x01dc:
                r6.enforceInterface(r2)
                java.util.List r5 = r4.Kkkkkkkk()
                r7.writeNoException()
                r7.writeTypedList(r5)
                return r1
            L_0x01ea:
                r6.enforceInterface(r2)
                android.support.v4.media.session.PlaybackStateCompat r5 = r4.Wwwwwwwwwwwwwwwwwwwwwwwwwww()
                r7.writeNoException()
                if (r5 == 0) goto L_0x01fd
                r7.writeInt(r1)
                r5.writeToParcel(r7, r1)
                goto L_0x0200
            L_0x01fd:
                r7.writeInt(r0)
            L_0x0200:
                return r1
            L_0x0201:
                r6.enforceInterface(r2)
                android.support.v4.media.MediaMetadataCompat r5 = r4.Wwwwwww()
                r7.writeNoException()
                if (r5 == 0) goto L_0x0214
                r7.writeInt(r1)
                r5.writeToParcel(r7, r1)
                goto L_0x0217
            L_0x0214:
                r7.writeInt(r0)
            L_0x0217:
                return r1
            L_0x0218:
                r6.enforceInterface(r2)
                java.lang.String r5 = r6.readString()
                int r8 = r6.readInt()
                if (r8 == 0) goto L_0x022e
                android.os.Parcelable$Creator r8 = android.os.Bundle.CREATOR
                java.lang.Object r6 = r8.createFromParcel(r6)
                r3 = r6
                android.os.Bundle r3 = (android.os.Bundle) r3
            L_0x022e:
                r4.QQOOOOO(r5, r3)
                r7.writeNoException()
                return r1
            L_0x0235:
                r6.enforceInterface(r2)
                int r5 = r6.readInt()
                if (r5 == 0) goto L_0x0247
                android.os.Parcelable$Creator<android.support.v4.media.RatingCompat> r5 = android.support.p069v4.media.RatingCompat.CREATOR
                java.lang.Object r5 = r5.createFromParcel(r6)
                r3 = r5
                android.support.v4.media.RatingCompat r3 = (android.support.p069v4.media.RatingCompat) r3
            L_0x0247:
                r4.QQOOOOOOOOO(r3)
                r7.writeNoException()
                return r1
            L_0x024e:
                r6.enforceInterface(r2)
                long r5 = r6.readLong()
                r4.Illll(r5)
                r7.writeNoException()
                return r1
            L_0x025c:
                r6.enforceInterface(r2)
                r4.O000000()
                r7.writeNoException()
                return r1
            L_0x0266:
                r6.enforceInterface(r2)
                r4.Xxxxxxxx()
                r7.writeNoException()
                return r1
            L_0x0270:
                r6.enforceInterface(r2)
                r4.Xxxx()
                r7.writeNoException()
                return r1
            L_0x027a:
                r6.enforceInterface(r2)
                r4.tooYoung()
                r7.writeNoException()
                return r1
            L_0x0284:
                r6.enforceInterface(r2)
                r4.stop()
                r7.writeNoException()
                return r1
            L_0x028e:
                r6.enforceInterface(r2)
                r4.pause()
                r7.writeNoException()
                return r1
            L_0x0298:
                r6.enforceInterface(r2)
                long r5 = r6.readLong()
                r4.mo11045b(r5)
                r7.writeNoException()
                return r1
            L_0x02a6:
                r6.enforceInterface(r2)
                int r5 = r6.readInt()
                if (r5 == 0) goto L_0x02b8
                android.os.Parcelable$Creator r5 = android.net.Uri.CREATOR
                java.lang.Object r5 = r5.createFromParcel(r6)
                android.net.Uri r5 = (android.net.Uri) r5
                goto L_0x02b9
            L_0x02b8:
                r5 = r3
            L_0x02b9:
                int r8 = r6.readInt()
                if (r8 == 0) goto L_0x02c8
                android.os.Parcelable$Creator r8 = android.os.Bundle.CREATOR
                java.lang.Object r6 = r8.createFromParcel(r6)
                r3 = r6
                android.os.Bundle r3 = (android.os.Bundle) r3
            L_0x02c8:
                r4.QQO(r5, r3)
                r7.writeNoException()
                return r1
            L_0x02cf:
                r6.enforceInterface(r2)
                java.lang.String r5 = r6.readString()
                int r8 = r6.readInt()
                if (r8 == 0) goto L_0x02e5
                android.os.Parcelable$Creator r8 = android.os.Bundle.CREATOR
                java.lang.Object r6 = r8.createFromParcel(r6)
                r3 = r6
                android.os.Bundle r3 = (android.os.Bundle) r3
            L_0x02e5:
                r4.mo11053u(r5, r3)
                r7.writeNoException()
                return r1
            L_0x02ec:
                r6.enforceInterface(r2)
                java.lang.String r5 = r6.readString()
                int r8 = r6.readInt()
                if (r8 == 0) goto L_0x0302
                android.os.Parcelable$Creator r8 = android.os.Bundle.CREATOR
                java.lang.Object r6 = r8.createFromParcel(r6)
                r3 = r6
                android.os.Bundle r3 = (android.os.Bundle) r3
            L_0x0302:
                r4.Uuuuu(r5, r3)
                r7.writeNoException()
                return r1
            L_0x0309:
                r6.enforceInterface(r2)
                r4.Wwwwwwwwwwwwwwwwwww()
                r7.writeNoException()
                return r1
            L_0x0313:
                r6.enforceInterface(r2)
                int r5 = r6.readInt()
                int r8 = r6.readInt()
                java.lang.String r6 = r6.readString()
                r4.mo11021O0(r5, r8, r6)
                r7.writeNoException()
                return r1
            L_0x0329:
                r6.enforceInterface(r2)
                int r5 = r6.readInt()
                int r8 = r6.readInt()
                java.lang.String r6 = r6.readString()
                r4.OO000(r5, r8, r6)
                r7.writeNoException()
                return r1
            L_0x033f:
                r6.enforceInterface(r2)
                android.support.v4.media.session.ParcelableVolumeInfo r5 = r4.Kkkkkkkkkkkkkkkkk()
                r7.writeNoException()
                if (r5 == 0) goto L_0x0352
                r7.writeInt(r1)
                r5.writeToParcel(r7, r1)
                goto L_0x0355
            L_0x0352:
                r7.writeInt(r0)
            L_0x0355:
                return r1
            L_0x0356:
                r6.enforceInterface(r2)
                long r5 = r4.Kkkkkkkkkkkkkkkkkkkkkkk()
                r7.writeNoException()
                r7.writeLong(r5)
                return r1
            L_0x0364:
                r6.enforceInterface(r2)
                android.app.PendingIntent r5 = r4.Zzzz()
                r7.writeNoException()
                if (r5 == 0) goto L_0x0377
                r7.writeInt(r1)
                r5.writeToParcel(r7, r1)
                goto L_0x037a
            L_0x0377:
                r7.writeInt(r0)
            L_0x037a:
                return r1
            L_0x037b:
                r6.enforceInterface(r2)
                java.lang.String r5 = r4.Wwwwwwwwwwwwwwwwwwwwwwwwwwww()
                r7.writeNoException()
                r7.writeString(r5)
                return r1
            L_0x0389:
                r6.enforceInterface(r2)
                java.lang.String r5 = r4.IIllll()
                r7.writeNoException()
                r7.writeString(r5)
                return r1
            L_0x0397:
                r6.enforceInterface(r2)
                boolean r5 = r4.O00()
                r7.writeNoException()
                r7.writeInt(r5)
                return r1
            L_0x03a5:
                r6.enforceInterface(r2)
                android.os.IBinder r5 = r6.readStrongBinder()
                android.support.v4.media.session.Wwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwww r5 = android.support.p069v4.media.session.C3926Wwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwww.C3927Wwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwww.Wwwwwwwwwww(r5)
                r4.mo11049m(r5)
                r7.writeNoException()
                return r1
            L_0x03b7:
                r6.enforceInterface(r2)
                android.os.IBinder r5 = r6.readStrongBinder()
                android.support.v4.media.session.Wwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwww r5 = android.support.p069v4.media.session.C3926Wwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwww.C3927Wwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwww.Wwwwwwwwwww(r5)
                r4.Cccccccc(r5)
                r7.writeNoException()
                return r1
            L_0x03c9:
                r6.enforceInterface(r2)
                int r5 = r6.readInt()
                if (r5 == 0) goto L_0x03db
                android.os.Parcelable$Creator r5 = android.view.KeyEvent.CREATOR
                java.lang.Object r5 = r5.createFromParcel(r6)
                r3 = r5
                android.view.KeyEvent r3 = (android.view.KeyEvent) r3
            L_0x03db:
                boolean r5 = r4.Llllllllllll(r3)
                r7.writeNoException()
                r7.writeInt(r5)
                return r1
            L_0x03e6:
                r6.enforceInterface(r2)
                java.lang.String r5 = r6.readString()
                int r8 = r6.readInt()
                if (r8 == 0) goto L_0x03fc
                android.os.Parcelable$Creator r8 = android.os.Bundle.CREATOR
                java.lang.Object r8 = r8.createFromParcel(r6)
                android.os.Bundle r8 = (android.os.Bundle) r8
                goto L_0x03fd
            L_0x03fc:
                r8 = r3
            L_0x03fd:
                int r0 = r6.readInt()
                if (r0 == 0) goto L_0x040c
                android.os.Parcelable$Creator<android.support.v4.media.session.MediaSessionCompat$ResultReceiverWrapper> r0 = android.support.p069v4.media.session.MediaSessionCompat.ResultReceiverWrapper.CREATOR
                java.lang.Object r6 = r0.createFromParcel(r6)
                r3 = r6
                android.support.v4.media.session.MediaSessionCompat$ResultReceiverWrapper r3 = (android.support.p069v4.media.session.MediaSessionCompat.ResultReceiverWrapper) r3
            L_0x040c:
                r4.Ccccc(r5, r8, r3)
                r7.writeNoException()
                return r1
            L_0x0413:
                r7.writeString(r2)
                return r1
            */
            throw new UnsupportedOperationException("Method not decompiled: android.support.p069v4.media.session.C3923Wwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwww.C3924Wwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwww.onTransact(int, android.os.Parcel, android.os.Parcel, int):boolean");
        }
    }

    void Cccc(int i);

    void Ccccc(String str, Bundle bundle, MediaSessionCompat.ResultReceiverWrapper resultReceiverWrapper);

    void Cccccccc(C3926Wwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwww wwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwww);

    String IIllll();

    void IIlllllll();

    void Illl(Uri uri, Bundle bundle);

    void Illll(long j);

    void Illllllllllllllllllllllllll(float f);

    void Kkk(MediaDescriptionCompat mediaDescriptionCompat, int i);

    List<MediaSessionCompat.QueueItem> Kkkkkkkk();

    Bundle Kkkkkkkkkkkkkkkk();

    ParcelableVolumeInfo Kkkkkkkkkkkkkkkkk();

    void Kkkkkkkkkkkkkkkkkkk(String str, Bundle bundle);

    CharSequence Kkkkkkkkkkkkkkkkkkkkk();

    long Kkkkkkkkkkkkkkkkkkkkkkk();

    void Lllll(MediaDescriptionCompat mediaDescriptionCompat);

    boolean Llllllllllll(KeyEvent keyEvent);

    /* renamed from: O0 */
    void mo11021O0(int i, int i2, String str);

    boolean O00();

    void O000000();

    void OO000(int i, int i2, String str);

    boolean OO00000();

    void Ooooooooooo(RatingCompat ratingCompat, Bundle bundle);

    void QQO(Uri uri, Bundle bundle);

    void QQOOOOO(String str, Bundle bundle);

    void QQOOOOOOOOO(RatingCompat ratingCompat);

    boolean Sssss();

    void Uuuuu(String str, Bundle bundle);

    int Www();

    int Wwww();

    void Wwwww(int i);

    MediaMetadataCompat Wwwwwww();

    void Wwwwwwwwwwwwwwwwwww();

    PlaybackStateCompat Wwwwwwwwwwwwwwwwwwwwwwwwwww();

    String Wwwwwwwwwwwwwwwwwwwwwwwwwwww();

    void Xxxx();

    void Xxxxxxx(boolean z);

    void Xxxxxxxx();

    void Xxxxxxxxxxx(boolean z);

    PendingIntent Zzzz();

    void Zzzzzzzzz(int i);

    /* renamed from: b */
    void mo11045b(long j);

    /* renamed from: d */
    void mo11046d(String str, Bundle bundle);

    /* renamed from: g */
    void mo11047g(MediaDescriptionCompat mediaDescriptionCompat);

    Bundle getExtras();

    /* renamed from: m */
    void mo11049m(C3926Wwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwww wwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwww);

    void pause();

    void stop();

    void tooYoung();

    /* renamed from: u */
    void mo11053u(String str, Bundle bundle);

    /* renamed from: v */
    int mo11054v();
}
