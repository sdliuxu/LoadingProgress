package com.jpeng.progress.glide;
/**
 * @author  "https://github.com/square/okhttp/blob/master/samples/guide/src/main/java/okhttp3/recipes/Progress.java"
 * @see <a href="https://github.com/square/okhttp/blob/master/samples/guide/src/main/java/okhttp3/recipes/Progress.java">OkHttp sample</a>
 */
interface GlideProgressListener {
    void update(long bytesRead, long contentLength, boolean done);
}
