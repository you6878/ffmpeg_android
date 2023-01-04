package com.syllogismobile.ffmpeg_sample;

public class NDKAdapter {

    static {
        if (BuildConfig.LIB_X264_ENABLED) {
            System.loadLibrary("x264");
            System.loadLibrary("postproc");
        }
        System.loadLibrary("avutil");
        System.loadLibrary("swresample");
        System.loadLibrary("avcodec");
        System.loadLibrary("avformat");
        System.loadLibrary("swscale");
        System.loadLibrary("avfilter");
        System.loadLibrary("avdevice");
        System.loadLibrary("native-lib");
    }

    public static native void setDataSource(String uri);
    public static native int play(Object surface);

    public NDKAdapter() {
        play("d");
    }
}
