package C11_solidLab.p05_DependencyInversion.p02_Worker;

public class Manager {
    public Manager() {
        Worker worker = new Worker();
        worker.work();
    }
}
