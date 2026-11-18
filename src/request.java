public class request {

    int destination;
    int waitTime;
    int currFloor;
    int initialTime;
    int actualPickupTime;
    int droppedTime;


    public request(int currFloor, int destination){
        // this is the timestamp, to keep track of time
        this.initialTime = 0;
        this.actualPickupTime = 0;
        this.droppedTime = 0;
        // this is the instruction for the elevator
        this.currFloor = currFloor;
        this.destination = destination;
        // what we want to measure
        this.waitTime = 0;
    }
}
