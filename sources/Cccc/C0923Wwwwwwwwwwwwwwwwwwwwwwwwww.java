package Cccc;

import android.opengl.GLES20;
import android.opengl.GLU;
import android.text.TextUtils;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.FloatBuffer;
import java.nio.IntBuffer;

/* renamed from: Cccc.Wwwwwwwwwwwwwwwwwwwwwwwwww */
public final class C0923Wwwwwwwwwwwwwwwwwwwwwwwwww {
    public static void Wwwwwwwwwwwwwwwwwwwwwwwwwww(String str) {
        C0920Wwwwwwwwwwwwwwwwwwwwwww.Wwwwwwwwwwwwwwwwwwwwwwwwwwwwwwww("GlUtil", str);
    }

    public static int Wwwwwwwwwwwwwwwwwwwwwwwwwwww() {
        int[] iArr = new int[1];
        GLES20.glGenTextures(1, IntBuffer.wrap(iArr));
        GLES20.glBindTexture(36197, iArr[0]);
        GLES20.glTexParameteri(36197, 10241, 9729);
        GLES20.glTexParameteri(36197, 10240, 9729);
        GLES20.glTexParameteri(36197, 10242, 33071);
        GLES20.glTexParameteri(36197, 10243, 33071);
        Wwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwww();
        return iArr[0];
    }

    public static FloatBuffer Wwwwwwwwwwwwwwwwwwwwwwwwwwwww(float[] fArr) {
        return (FloatBuffer) Wwwwwwwwwwwwwwwwwwwwwwwwwwwwww(fArr.length).put(fArr).flip();
    }

    public static FloatBuffer Wwwwwwwwwwwwwwwwwwwwwwwwwwwwww(int i) {
        return ByteBuffer.allocateDirect(i * 4).order(ByteOrder.nativeOrder()).asFloatBuffer();
    }

    public static int Wwwwwwwwwwwwwwwwwwwwwwwwwwwwwww(String[] strArr, String[] strArr2) {
        return Wwwwwwwwwwwwwwwwwwwwwwwwwwwwwwww(TextUtils.join("\n", strArr), TextUtils.join("\n", strArr2));
    }

    public static int Wwwwwwwwwwwwwwwwwwwwwwwwwwwwwwww(String str, String str2) {
        int glCreateProgram = GLES20.glCreateProgram();
        Wwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwww();
        Wwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwww(35633, str, glCreateProgram);
        Wwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwww(35632, str2, glCreateProgram);
        GLES20.glLinkProgram(glCreateProgram);
        int[] iArr = {0};
        GLES20.glGetProgramiv(glCreateProgram, 35714, iArr, 0);
        if (iArr[0] != 1) {
            Wwwwwwwwwwwwwwwwwwwwwwwwwww("Unable to link shader program: \n" + GLES20.glGetProgramInfoLog(glCreateProgram));
        }
        Wwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwww();
        return glCreateProgram;
    }

    public static void Wwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwww() {
        while (true) {
            int glGetError = GLES20.glGetError();
            if (glGetError != 0) {
                C0920Wwwwwwwwwwwwwwwwwwwwwww.Wwwwwwwwwwwwwwwwwwwwwwwwwwwwwwww("GlUtil", "glError " + GLU.gluErrorString(glGetError));
            } else {
                return;
            }
        }
    }

    public static void Wwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwww(int i, String str, int i2) {
        int glCreateShader = GLES20.glCreateShader(i);
        GLES20.glShaderSource(glCreateShader, str);
        GLES20.glCompileShader(glCreateShader);
        int[] iArr = {0};
        GLES20.glGetShaderiv(glCreateShader, 35713, iArr, 0);
        if (iArr[0] != 1) {
            Wwwwwwwwwwwwwwwwwwwwwwwwwww(GLES20.glGetShaderInfoLog(glCreateShader) + ", source: " + str);
        }
        GLES20.glAttachShader(i2, glCreateShader);
        GLES20.glDeleteShader(glCreateShader);
        Wwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwww();
    }
}
