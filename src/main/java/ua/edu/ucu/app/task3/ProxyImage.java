package ua.edu.ucu.app.task3;

public abstract class ProxyImage implements MyImage {
    private String filename;
    @Override
    public void display(){
        RealImage img = new RealImage(this.filename);
        img.display();

    }
}
