public class Processor {
    
    private int threads;
    private int cores;
    
    public int getThreads() {
        return threads;
    }
    public void setThreads(int threads) {
        this.threads = threads;
    }
    public int getCores() {
        return cores;
    }
    public void setCores(int cores) {
        this.cores = cores;
    }
    public Processor(int threads, int cores) {
        this.threads = threads;
        this.cores = cores;
    }

    public void turnOffCore(int x)
    {
        this.cores =- x;
    }

    public void turnOnCore(int x)
    {
        this.cores =+ x;
    }

    public boolean enoughCores(int x)
    {
        if(this.cores>x)
        {
            return true;
        }
        return false;
    }

    public String toString() {
        return "Processor [threads=" + threads + ", cores=" + cores + "]";
    }

    public static void main(String[] args) {
        
    }

}
