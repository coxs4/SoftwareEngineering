import java.util.ArrayList;

public class Timeslot extends DB_Object implements IFront {

    private int startTime, endTime;
    ArrayList<DB_Object> timeslotList = new ArrayList<>();

    //TODO create default constructor, setters and getters, add UID
    Timeslot(int startTime, int endTime){
        if(validateTime(startTime,endTime) != 0){
            System.out.println("ERR: backEnd.Timeslot object could not be created.");
            System.exit(-1);
        }
//        temp.startTime = startTime;
//        temp.endTime = endTime;
//        addToList(temp);
    }

    private int validateTime(int start, int end){
        if(start > 1259 || start < 100 || start < 0 || end < 0){
            return -1;
        }
        return 0;
    }

    @Override
    public void removeFromList(int index){
        timeslotList.remove(index);
//        back.pushDB_Object(timeslotList);
        //need to now return the new speakerList once it returns from backend
    }

    @Override
    public void addToList(DB_Object o){
        timeslotList.add(o);
//        back.pushDB_Object(timeslotList);
    }



    @Override
    public void ensureUID() {
    }

    @Override
    public String toString() {
        return null;
    }
}