package Ex_Feitos.execoes1.entitites;
/*package execoes1.entitites;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.concurrent.TimeUnit;


public class Reservation {

    private Integer roomNumber;
    private Date checkIn, checkOut;

    SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");


    public Reservation(Integer roomNumber, Date checkIn, Date checkOut) {
        this.roomNumber = roomNumber;
        this.checkIn = checkIn;
        this.checkOut = checkOut;
    }

    public Integer getRoomNumber() {
        return this.roomNumber;
    }
    public void setRoomNumber(Integer roomNumber) {
        this.roomNumber = roomNumber;
    }
    public Date getCheckIn() {
        return this.checkIn;
    }
    public void setCheckIn(Date checkIn) {
        this.checkIn = checkIn;
    }
    public Date getCheckOut() {
        return this.checkOut;
    }
    public void setCheckOut(Date checkOut) {
        this.checkOut = checkOut;
    }
    

    public Long duration(){
        Long dias = checkOut.getTime() - checkIn.getTime();
        return TimeUnit.DAYS.convert(dias, TimeUnit.MILLISECONDS);
        
    }

    public void updateDates (Date checkIn, Date checkOut){
        Date now = new Date();
        if (!checkIn.before(now) || !checkOut.before(now)) {
            throw new IllegalArgumentException("reservation dates must be update for the future");
        }
        if(!checkOut.after(checkIn)){
            throw new IllegalArgumentException("Check-out date must be after the check in");
        }
        setCheckIn(checkIn);
        setCheckOut(checkOut);
    }

    @Override
    public String toString() {
        return 
            " roomNumber='" + getRoomNumber() + "'" +
            ", checkIn='" + sdf.format(getCheckIn()) + "'" +
            ", checkOut='" + sdf.format(getCheckOut()) + "'" +
            "nights='" +  duration();
  
    }


}
    
*/