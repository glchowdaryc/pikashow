package Ccccc;

import Cccc.C0896Wwww;
import Cccc.C0920Wwwwwwwwwwwwwwwwwwwwwww;
import android.annotation.SuppressLint;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.os.SystemClock;
import com.google.android.exoplayer2.util.C4949Wwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwww;
import com.google.android.exoplayer2.util.C4950Wwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwww;
import java.io.IOException;
import java.util.concurrent.ExecutorService;

/* renamed from: Ccccc.Wwwwwwwwww */
public final class C0947Wwwwwwwwww implements C0945Wwwwwwwww {

    /* renamed from: Wwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwww  reason: collision with root package name */
    public static final C0953Wwwwwwwwwwwwwwwwwwwwwwwwwwwwwwww f13417Wwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwww = new C0953Wwwwwwwwwwwwwwwwwwwwwwwwwwwwwwww(3, -9223372036854775807L);

    /* renamed from: Wwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwww  reason: collision with root package name */
    public static final C0953Wwwwwwwwwwwwwwwwwwwwwwwwwwwwwwww f13418Wwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwww = new C0953Wwwwwwwwwwwwwwwwwwwwwwwwwwwwwwww(2, -9223372036854775807L);

    /* renamed from: Wwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwww  reason: collision with other field name */
    public C0952Wwwwwwwwwwwwwwwwwwwwwwwwwwwwwww<? extends C0951Wwwwwwwwwwwwwwwwwwwwwwwwwwwwww> f1015Wwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwww;

    /* renamed from: Wwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwww  reason: collision with other field name */
    public IOException f1016Wwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwww;

    /* renamed from: Wwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwww  reason: collision with other field name */
    public final ExecutorService f1017Wwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwww;

    /* renamed from: Ccccc.Wwwwwwwwww$Wwwwwwwwwwwwwwwwwwwwwwwwwww */
    public static final class C0948Wwwwwwwwwwwwwwwwwwwwwwwwwww extends IOException {
        public C0948Wwwwwwwwwwwwwwwwwwwwwwwwwww(Throwable th) {
            super("Unexpected " + th.getClass().getSimpleName() + ": " + th.getMessage(), th);
        }
    }

    /* renamed from: Ccccc.Wwwwwwwwww$Wwwwwwwwwwwwwwwwwwwwwwwwwwww */
    public static final class C0949Wwwwwwwwwwwwwwwwwwwwwwwwwwww implements Runnable {

        /* renamed from: Wwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwww  reason: collision with root package name */
        public final C0950Wwwwwwwwwwwwwwwwwwwwwwwwwwwww f13419Wwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwww;

        public C0949Wwwwwwwwwwwwwwwwwwwwwwwwwwww(C0950Wwwwwwwwwwwwwwwwwwwwwwwwwwwww wwwwwwwwwwwwwwwwwwwwwwwwwwwww) {
            this.f13419Wwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwww = wwwwwwwwwwwwwwwwwwwwwwwwwwwww;
        }

        public void run() {
            this.f13419Wwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwww.Wwwwwwwwwwwwwwwwwwwwww();
        }
    }

    /* renamed from: Ccccc.Wwwwwwwwww$Wwwwwwwwwwwwwwwwwwwwwwwwwwwww */
    public interface C0950Wwwwwwwwwwwwwwwwwwwwwwwwwwwww {
        void Wwwwwwwwwwwwwwwwwwwwww();
    }

    /* renamed from: Ccccc.Wwwwwwwwww$Wwwwwwwwwwwwwwwwwwwwwwwwwwwwww */
    public interface C0951Wwwwwwwwwwwwwwwwwwwwwwwwwwwwww {
        void Wwwwwwwwwwwwwwwwwwwwwwwwwwwwwwww();

        void Wwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwww();
    }

    @SuppressLint({"HandlerLeak"})
    /* renamed from: Ccccc.Wwwwwwwwww$Wwwwwwwwwwwwwwwwwwwwwwwwwwwwwww */
    public final class C0952Wwwwwwwwwwwwwwwwwwwwwwwwwwwwwww<T extends C0951Wwwwwwwwwwwwwwwwwwwwwwwwwwwwww> extends Handler implements Runnable {

        /* renamed from: Wwwwwwwwwwwwwwwwwwwwwwwwwwwwwwww  reason: collision with root package name */
        public volatile boolean f13420Wwwwwwwwwwwwwwwwwwwwwwwwwwwwwwww;

        /* renamed from: Wwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwww  reason: collision with root package name */
        public int f13421Wwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwww;

        /* renamed from: Wwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwww  reason: collision with other field name */
        public volatile boolean f1018Wwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwww;

        /* renamed from: Wwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwww  reason: collision with root package name */
        public final int f13422Wwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwww;

        /* renamed from: Wwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwww  reason: collision with other field name */
        public final long f1019Wwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwww;

        /* renamed from: Wwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwww  reason: collision with other field name */
        public final T f1020Wwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwww;

        /* renamed from: Wwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwww  reason: collision with other field name */
        public C0954Wwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwww<T> f1021Wwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwww;

        /* renamed from: Wwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwww  reason: collision with other field name */
        public IOException f1023Wwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwww;

        /* renamed from: Wwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwww  reason: collision with other field name */
        public volatile Thread f1024Wwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwww;

        public C0952Wwwwwwwwwwwwwwwwwwwwwwwwwwwwwww(Looper looper, T t, C0954Wwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwww<T> wwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwww, int i, long j) {
            super(looper);
            this.f1020Wwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwww = t;
            this.f1021Wwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwww = wwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwww;
            this.f13422Wwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwww = i;
            this.f1019Wwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwww = j;
        }

        public void Wwwwwwwwwwwwwwwwwwwwwwwwwwwww(long j) {
            C4950Wwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwww.Wwwwwwwwwwwwwwwwwwwwwwwwwwww(C0947Wwwwwwwwww.this.f1015Wwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwww == null);
            C0952Wwwwwwwwwwwwwwwwwwwwwwwwwwwwwww unused = C0947Wwwwwwwwww.this.f1015Wwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwww = this;
            if (j > 0) {
                sendEmptyMessageDelayed(0, j);
            } else {
                Wwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwww();
            }
        }

        public void Wwwwwwwwwwwwwwwwwwwwwwwwwwwwww(int i) {
            IOException iOException = this.f1023Wwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwww;
            if (iOException != null && this.f13421Wwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwww > i) {
                throw iOException;
            }
        }

        public final long Wwwwwwwwwwwwwwwwwwwwwwwwwwwwwww() {
            return (long) Math.min((this.f13421Wwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwww - 1) * 1000, 5000);
        }

        public final void Wwwwwwwwwwwwwwwwwwwwwwwwwwwwwwww() {
            C0952Wwwwwwwwwwwwwwwwwwwwwwwwwwwwwww unused = C0947Wwwwwwwwww.this.f1015Wwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwww = null;
        }

        public final void Wwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwww() {
            this.f1023Wwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwww = null;
            C0947Wwwwwwwwww.this.f1017Wwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwww.execute(C0947Wwwwwwwwww.this.f1015Wwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwww);
        }

        public void Wwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwww(boolean z) {
            this.f13420Wwwwwwwwwwwwwwwwwwwwwwwwwwwwwwww = z;
            this.f1023Wwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwww = null;
            if (hasMessages(0)) {
                removeMessages(0);
                if (!z) {
                    sendEmptyMessage(1);
                }
            } else {
                this.f1018Wwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwww = true;
                this.f1020Wwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwww.Wwwwwwwwwwwwwwwwwwwwwwwwwwwwwwww();
                if (this.f1024Wwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwww != null) {
                    this.f1024Wwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwww.interrupt();
                }
            }
            if (z) {
                Wwwwwwwwwwwwwwwwwwwwwwwwwwwwwwww();
                long elapsedRealtime = SystemClock.elapsedRealtime();
                this.f1021Wwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwww.Wwwwwwwwwwwwwwwwwwwww(this.f1020Wwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwww, elapsedRealtime, elapsedRealtime - this.f1019Wwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwww, true);
                this.f1021Wwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwww = null;
            }
        }

        public void handleMessage(Message message) {
            long j;
            if (!this.f13420Wwwwwwwwwwwwwwwwwwwwwwwwwwwwwwww) {
                int i = message.what;
                if (i == 0) {
                    Wwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwww();
                } else if (i != 4) {
                    Wwwwwwwwwwwwwwwwwwwwwwwwwwwwwwww();
                    long elapsedRealtime = SystemClock.elapsedRealtime();
                    long j2 = elapsedRealtime - this.f1019Wwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwww;
                    if (this.f1018Wwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwww) {
                        this.f1021Wwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwww.Wwwwwwwwwwwwwwwwwwwww(this.f1020Wwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwww, elapsedRealtime, j2, false);
                        return;
                    }
                    int i2 = message.what;
                    if (i2 == 1) {
                        this.f1021Wwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwww.Wwwwwwwwwwwwwwwwwwwww(this.f1020Wwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwww, elapsedRealtime, j2, false);
                    } else if (i2 == 2) {
                        try {
                            this.f1021Wwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwww.Wwwwwwwwwwwwwwwwwwwwwwww(this.f1020Wwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwww, elapsedRealtime, j2);
                        } catch (RuntimeException e) {
                            C0920Wwwwwwwwwwwwwwwwwwwwwww.Wwwwwwwwwwwwwwwwwwwwwwwwwwwwwww("LoadTask", "Unexpected exception handling load completed", e);
                            IOException unused = C0947Wwwwwwwwww.this.f1016Wwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwww = new C0948Wwwwwwwwwwwwwwwwwwwwwwwwwww(e);
                        }
                    } else if (i2 == 3) {
                        IOException iOException = (IOException) message.obj;
                        this.f1023Wwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwww = iOException;
                        int i3 = this.f13421Wwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwww + 1;
                        this.f13421Wwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwww = i3;
                        C0953Wwwwwwwwwwwwwwwwwwwwwwwwwwwwwwww Wwwwwwwwwwwwwwwwwwwwwww2 = this.f1021Wwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwww.Wwwwwwwwwwwwwwwwwwwwwww(this.f1020Wwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwww, elapsedRealtime, j2, iOException, i3);
                        if (Wwwwwwwwwwwwwwwwwwwwwww2.f13423Wwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwww == 3) {
                            IOException unused2 = C0947Wwwwwwwwww.this.f1016Wwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwww = this.f1023Wwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwww;
                        } else if (Wwwwwwwwwwwwwwwwwwwwwww2.f13423Wwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwww != 2) {
                            if (Wwwwwwwwwwwwwwwwwwwwwww2.f13423Wwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwww == 1) {
                                this.f13421Wwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwww = 1;
                            }
                            if (Wwwwwwwwwwwwwwwwwwwwwww2.f1025Wwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwww != -9223372036854775807L) {
                                j = Wwwwwwwwwwwwwwwwwwwwwww2.f1025Wwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwww;
                            } else {
                                j = Wwwwwwwwwwwwwwwwwwwwwwwwwwwwwww();
                            }
                            Wwwwwwwwwwwwwwwwwwwwwwwwwwwww(j);
                        }
                    }
                } else {
                    throw ((Error) message.obj);
                }
            }
        }

        public void run() {
            try {
                this.f1024Wwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwww = Thread.currentThread();
                if (!this.f1018Wwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwww) {
                    C0896Wwww.Wwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwww("load:" + this.f1020Wwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwww.getClass().getSimpleName());
                    this.f1020Wwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwww.Wwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwww();
                    C0896Wwww.Wwwwwwwwwwwwwwwwwwwwwwwwwwwwwwww();
                }
                if (!this.f13420Wwwwwwwwwwwwwwwwwwwwwwwwwwwwwwww) {
                    sendEmptyMessage(2);
                }
            } catch (IOException e) {
                if (!this.f13420Wwwwwwwwwwwwwwwwwwwwwwwwwwwwwwww) {
                    obtainMessage(3, e).sendToTarget();
                }
            } catch (InterruptedException unused) {
                C4950Wwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwww.Wwwwwwwwwwwwwwwwwwwwwwwwwwww(this.f1018Wwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwww);
                if (!this.f13420Wwwwwwwwwwwwwwwwwwwwwwwwwwwwwwww) {
                    sendEmptyMessage(2);
                }
            } catch (Exception e2) {
                C0920Wwwwwwwwwwwwwwwwwwwwwww.Wwwwwwwwwwwwwwwwwwwwwwwwwwwwwww("LoadTask", "Unexpected exception loading stream", e2);
                if (!this.f13420Wwwwwwwwwwwwwwwwwwwwwwwwwwwwwwww) {
                    obtainMessage(3, new C0948Wwwwwwwwwwwwwwwwwwwwwwwwwww(e2)).sendToTarget();
                }
            } catch (OutOfMemoryError e3) {
                C0920Wwwwwwwwwwwwwwwwwwwwwww.Wwwwwwwwwwwwwwwwwwwwwwwwwwwwwww("LoadTask", "OutOfMemory error loading stream", e3);
                if (!this.f13420Wwwwwwwwwwwwwwwwwwwwwwwwwwwwwwww) {
                    obtainMessage(3, new C0948Wwwwwwwwwwwwwwwwwwwwwwwwwww(e3)).sendToTarget();
                }
            } catch (Error e4) {
                C0920Wwwwwwwwwwwwwwwwwwwwwww.Wwwwwwwwwwwwwwwwwwwwwwwwwwwwwww("LoadTask", "Unexpected error loading stream", e4);
                if (!this.f13420Wwwwwwwwwwwwwwwwwwwwwwwwwwwwwwww) {
                    obtainMessage(4, e4).sendToTarget();
                }
                throw e4;
            } catch (Throwable th) {
                C0896Wwww.Wwwwwwwwwwwwwwwwwwwwwwwwwwwwwwww();
                throw th;
            }
        }
    }

    /* renamed from: Ccccc.Wwwwwwwwww$Wwwwwwwwwwwwwwwwwwwwwwwwwwwwwwww */
    public static final class C0953Wwwwwwwwwwwwwwwwwwwwwwwwwwwwwwww {

        /* renamed from: Wwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwww  reason: collision with root package name */
        public final int f13423Wwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwww;

        /* renamed from: Wwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwww  reason: collision with other field name */
        public final long f1025Wwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwww;

        public boolean Wwwwwwwwwwwwwwwwwwwwwwwwwwwwwwww() {
            int i = this.f13423Wwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwww;
            return i == 0 || i == 1;
        }

        public C0953Wwwwwwwwwwwwwwwwwwwwwwwwwwwwwwww(int i, long j) {
            this.f13423Wwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwww = i;
            this.f1025Wwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwww = j;
        }
    }

    /* renamed from: Ccccc.Wwwwwwwwww$Wwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwww */
    public interface C0954Wwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwww<T extends C0951Wwwwwwwwwwwwwwwwwwwwwwwwwwwwww> {
        void Wwwwwwwwwwwwwwwwwwwww(T t, long j, long j2, boolean z);

        C0953Wwwwwwwwwwwwwwwwwwwwwwwwwwwwwwww Wwwwwwwwwwwwwwwwwwwwwww(T t, long j, long j2, IOException iOException, int i);

        void Wwwwwwwwwwwwwwwwwwwwwwww(T t, long j, long j2);
    }

    static {
        Wwwwwwwwwwwwwwwwwwwwwwwwwww(false, -9223372036854775807L);
        Wwwwwwwwwwwwwwwwwwwwwwwwwww(true, -9223372036854775807L);
    }

    public C0947Wwwwwwwwww(String str) {
        this.f1017Wwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwww = C4949Wwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwww.Kkkkk(str);
    }

    public static C0953Wwwwwwwwwwwwwwwwwwwwwwwwwwwwwwww Wwwwwwwwwwwwwwwwwwwwwwwwwww(boolean z, long j) {
        return new C0953Wwwwwwwwwwwwwwwwwwwwwwwwwwwwwwww(z ? 1 : 0, j);
    }

    public <T extends C0951Wwwwwwwwwwwwwwwwwwwwwwwwwwwwww> long Wwwwwwwwwwwwwwwwwwwww(T t, C0954Wwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwww<T> wwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwww, int i) {
        Looper myLooper = Looper.myLooper();
        C4950Wwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwww.Wwwwwwwwwwwwwwwwwwwwwwwwwwww(myLooper != null);
        this.f1016Wwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwww = null;
        long elapsedRealtime = SystemClock.elapsedRealtime();
        new C0952Wwwwwwwwwwwwwwwwwwwwwwwwwwwwwww(myLooper, t, wwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwww, i, elapsedRealtime).Wwwwwwwwwwwwwwwwwwwwwwwwwwwww(0);
        return elapsedRealtime;
    }

    public void Wwwwwwwwwwwwwwwwwwwwww(C0950Wwwwwwwwwwwwwwwwwwwwwwwwwwwww wwwwwwwwwwwwwwwwwwwwwwwwwwwww) {
        C0952Wwwwwwwwwwwwwwwwwwwwwwwwwwwwwww<? extends C0951Wwwwwwwwwwwwwwwwwwwwwwwwwwwwww> wwwwwwwwwwwwwwwwwwwwwwwwwwwwwww = this.f1015Wwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwww;
        if (wwwwwwwwwwwwwwwwwwwwwwwwwwwwwww != null) {
            wwwwwwwwwwwwwwwwwwwwwwwwwwwwwww.Wwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwww(true);
        }
        if (wwwwwwwwwwwwwwwwwwwwwwwwwwwww != null) {
            this.f1017Wwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwww.execute(new C0949Wwwwwwwwwwwwwwwwwwwwwwwwwwww(wwwwwwwwwwwwwwwwwwwwwwwwwwwww));
        }
        this.f1017Wwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwww.shutdown();
    }

    public void Wwwwwwwwwwwwwwwwwwwwwww() {
        Wwwwwwwwwwwwwwwwwwwwww((C0950Wwwwwwwwwwwwwwwwwwwwwwwwwwwww) null);
    }

    public void Wwwwwwwwwwwwwwwwwwwwwwww(int i) {
        IOException iOException = this.f1016Wwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwww;
        if (iOException == null) {
            C0952Wwwwwwwwwwwwwwwwwwwwwwwwwwwwwww<? extends C0951Wwwwwwwwwwwwwwwwwwwwwwwwwwwwww> wwwwwwwwwwwwwwwwwwwwwwwwwwwwwww = this.f1015Wwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwww;
            if (wwwwwwwwwwwwwwwwwwwwwwwwwwwwwww != null) {
                if (i == Integer.MIN_VALUE) {
                    i = wwwwwwwwwwwwwwwwwwwwwwwwwwwwwww.f13422Wwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwww;
                }
                wwwwwwwwwwwwwwwwwwwwwwwwwwwwwww.Wwwwwwwwwwwwwwwwwwwwwwwwwwwwww(i);
                return;
            }
            return;
        }
        throw iOException;
    }

    public boolean Wwwwwwwwwwwwwwwwwwwwwwwww() {
        return this.f1015Wwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwww != null;
    }

    public boolean Wwwwwwwwwwwwwwwwwwwwwwwwww() {
        return this.f1016Wwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwww != null;
    }

    public void Wwwwwwwwwwwwwwwwwwwwwwwwwwww() {
        this.f1016Wwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwww = null;
    }

    public void Wwwwwwwwwwwwwwwwwwwwwwwwwwwww() {
        this.f1015Wwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwww.Wwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwww(false);
    }

    public void Wwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwww() {
        Wwwwwwwwwwwwwwwwwwwwwwww(Integer.MIN_VALUE);
    }
}
