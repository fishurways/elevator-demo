public class Request {

    int destination;
    int originFloor;
    int initialTime;
    int actualPickupTime;
    int droppedTime;

    public Request(int originFloor, int destination, int initialTime){
        // this is the timestamp, to keep track of time
        this.initialTime = initialTime;
        this.actualPickupTime = -1;
        this.droppedTime = -1;
        // this is the instruction for the elevator
        this.originFloor = originFloor;
        this.destination = destination;
    }

    public int calculateWaitTime(int initialTime, int droppedTime){
        int waitTime = droppedTime - initialTime;
        return waitTime;
    }
}
