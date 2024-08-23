package threading;

public class DownloadFileTask implements Runnable{
    private final DownloadStatus status;
    public DownloadFileTask(DownloadStatus status) {
        this.status = status;
    }

    @Override
    public void run() {
        System.out.println("Downloading File:" + Thread.currentThread().getName());

        for (int i = 0; i < 10000; i++) {
            if(Thread.currentThread().isInterrupted()) return;
            this.status.incrementTotolBytes();
        }
        System.out.println("Download Complete:" + Thread.currentThread().getName());

    }
}
