
public class App {
    class Harddisk{
        private KomputerServer komputer;//hasil asosiasi

    }
    class Monitor{
        private KomputerServer komputer;//hasil asosiasi

    }
    class KomputerServer{
        private Harddisk harddisk;
        private Monitor[] monitors;
        public KomputerServer(){
            this.harddisk = new Harddisk();//hasil komposisi di constructor
        }
        public void removeHarddisk(){

        }
        
        public void hubungMonitor(Monitor[] monitors){
            this.monitors = monitors;//hasil agregasi
        }
    }
    public static void main(String[] args) throws Exception {
        System.out.println("Hello, World!");
    }

    
}
