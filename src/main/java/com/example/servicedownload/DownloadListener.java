package com.example.servicedownload;

/**
 * Created by DD on 2018/3/5.
 */

public interface DownloadListener {
    void onProgress(int progress);

    void onSuccess();

    void onFailed();

    void onPause();

    void onCanceled();
}
