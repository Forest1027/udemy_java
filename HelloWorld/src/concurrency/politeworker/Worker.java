package concurrency.politeworker;

public class Worker {
    private String name;
    private boolean active;

    public Worker(String name, boolean active){
        this.name = name;
        this.active = active;
    }

    public String getName(){
        return name;
    }

    public boolean isActive(){
        return active;
    }

    public synchronized void work(SharedResource sharedResource, Worker otherWork){
        while (active){
            if (sharedResource.getOwner()!= this){
                try{
                    System.out.println("Wait");
                    wait(10);
                }catch (InterruptedException e){

                }
                continue;
            }
            if (otherWork.isActive()){
                System.out.println(getName()+" : give the resource to the worker "+otherWork.getName());
                sharedResource.setOwner(otherWork);
                continue;
            }

            System.out.println(getName()+" : working on the common resource");
            active = false;
            sharedResource.setOwner(otherWork);
        }
    }
}
