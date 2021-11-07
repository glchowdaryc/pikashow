package Ccccc;

import android.net.Uri;
import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;
import java.net.InetSocketAddress;
import java.net.MulticastSocket;
import java.net.SocketException;

/* renamed from: Ccccc.Wwww */
public final class C0937Wwww extends C0987Wwwwwwwwwwwwwwwwwwwwwwwwwwwwww {

    /* renamed from: Wwwwwwwwwwwwwwwwwwwwwwwwwwwwwwww  reason: collision with root package name */
    public int f13410Wwwwwwwwwwwwwwwwwwwwwwwwwwwwwwww;

    /* renamed from: Wwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwww  reason: collision with root package name */
    public final int f13411Wwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwww;

    /* renamed from: Wwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwww  reason: collision with other field name */
    public boolean f997Wwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwww;

    /* renamed from: Wwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwww  reason: collision with root package name */
    public Uri f13412Wwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwww;

    /* renamed from: Wwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwww  reason: collision with other field name */
    public final DatagramPacket f998Wwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwww;

    /* renamed from: Wwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwww  reason: collision with other field name */
    public DatagramSocket f999Wwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwww;

    /* renamed from: Wwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwww  reason: collision with other field name */
    public InetAddress f1000Wwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwww;

    /* renamed from: Wwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwww  reason: collision with other field name */
    public InetSocketAddress f1001Wwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwww;

    /* renamed from: Wwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwww  reason: collision with other field name */
    public MulticastSocket f1002Wwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwww;

    /* renamed from: Wwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwww  reason: collision with other field name */
    public final byte[] f1003Wwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwww;

    /* renamed from: Ccccc.Wwww$Wwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwww */
    public static final class C0938Wwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwww extends IOException {
        public C0938Wwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwww(IOException iOException) {
            super(iOException);
        }
    }

    public C0937Wwww() {
        this(2000);
    }

    public long Wwwwwwwwwwwwwwwwwwwwwwwwwwwwww(C0978Wwwwwwwwwwwwwwwwwwwwwww wwwwwwwwwwwwwwwwwwwwwww) {
        Uri uri = wwwwwwwwwwwwwwwwwwwwwww.f1078Wwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwww;
        this.f13412Wwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwww = uri;
        String host = uri.getHost();
        int port = this.f13412Wwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwww.getPort();
        Wwwwwwwwwwwwwwwwwwwwwwwwww(wwwwwwwwwwwwwwwwwwwwwww);
        try {
            this.f1000Wwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwww = InetAddress.getByName(host);
            this.f1001Wwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwww = new InetSocketAddress(this.f1000Wwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwww, port);
            if (this.f1000Wwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwww.isMulticastAddress()) {
                MulticastSocket multicastSocket = new MulticastSocket(this.f1001Wwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwww);
                this.f1002Wwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwww = multicastSocket;
                multicastSocket.joinGroup(this.f1000Wwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwww);
                this.f999Wwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwww = this.f1002Wwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwww;
            } else {
                this.f999Wwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwww = new DatagramSocket(this.f1001Wwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwww);
            }
            try {
                this.f999Wwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwww.setSoTimeout(this.f13411Wwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwww);
                this.f997Wwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwww = true;
                Wwwwwwwwwwwwwwwwwwwwwwwww(wwwwwwwwwwwwwwwwwwwwwww);
                return -1;
            } catch (SocketException e) {
                throw new C0938Wwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwww(e);
            }
        } catch (IOException e2) {
            throw new C0938Wwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwww(e2);
        }
    }

    public Uri Wwwwwwwwwwwwwwwwwwwwwwwwwwwwwww() {
        return this.f13412Wwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwww;
    }

    public int Wwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwww(byte[] bArr, int i, int i2) {
        if (i2 == 0) {
            return 0;
        }
        if (this.f13410Wwwwwwwwwwwwwwwwwwwwwwwwwwwwwwww == 0) {
            try {
                this.f999Wwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwww.receive(this.f998Wwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwww);
                int length = this.f998Wwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwww.getLength();
                this.f13410Wwwwwwwwwwwwwwwwwwwwwwwwwwwwwwww = length;
                Wwwwwwwwwwwwwwwwwwwwwwwwwwww(length);
            } catch (IOException e) {
                throw new C0938Wwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwww(e);
            }
        }
        int length2 = this.f998Wwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwww.getLength();
        int i3 = this.f13410Wwwwwwwwwwwwwwwwwwwwwwwwwwwwwwww;
        int min = Math.min(i3, i2);
        System.arraycopy(this.f1003Wwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwww, length2 - i3, bArr, i, min);
        this.f13410Wwwwwwwwwwwwwwwwwwwwwwwwwwwwwwww -= min;
        return min;
    }

    public void close() {
        this.f13412Wwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwww = null;
        MulticastSocket multicastSocket = this.f1002Wwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwww;
        if (multicastSocket != null) {
            try {
                multicastSocket.leaveGroup(this.f1000Wwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwww);
            } catch (IOException unused) {
            }
            this.f1002Wwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwww = null;
        }
        DatagramSocket datagramSocket = this.f999Wwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwww;
        if (datagramSocket != null) {
            datagramSocket.close();
            this.f999Wwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwww = null;
        }
        this.f1000Wwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwww = null;
        this.f1001Wwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwww = null;
        this.f13410Wwwwwwwwwwwwwwwwwwwwwwwwwwwwwwww = 0;
        if (this.f997Wwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwww) {
            this.f997Wwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwww = false;
            Wwwwwwwwwwwwwwwwwwwwwwwwwww();
        }
    }

    public C0937Wwww(int i) {
        this(i, 8000);
    }

    public C0937Wwww(int i, int i2) {
        super(true);
        this.f13411Wwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwww = i2;
        byte[] bArr = new byte[i];
        this.f1003Wwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwww = bArr;
        this.f998Wwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwww = new DatagramPacket(bArr, 0, i);
    }
}
