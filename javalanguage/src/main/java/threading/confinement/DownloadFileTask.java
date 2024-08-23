package threading.confinement;

public class DownloadFileTask implements Runnable{
    private DownloadStatus status;

    @Override
    public void run() {
        System.out.println("Downloading File:" + Thread.currentThread().getName());
        status = new DownloadStatus();

        for (int i = 0; i < 10000; i++) {
            if(Thread.currentThread().isInterrupted()) return;
            status.incrementTotolBytes();
        }
        System.out.println("Download Complete:" + Thread.currentThread().getName());

    }

    public DownloadStatus getStatus(){
        return status;
    }
}
