
package nextmonth;

import java.util.Calendar;
import java.util.GregorianCalendar;

public class NextMonth {
    private int d;
    private Calendar date = new GregorianCalendar();
    public int getDiaMes() {
        switch(date.get(Calendar.MONTH) ){
            case 0: case 2: case 4: case 6: case 7: case 9: case 11:
                d = 31;
                break;
            case 3: case 5: case 8: case 10:
                d = 30;
                break;
            case 1:
                if((date.get(Calendar.YEAR)%4)==0){
                    d = 29;
                }
                else{
                    d=28;
                }
                break;
            default:
                break;
        }
        return  (d-date.get(Calendar.DAY_OF_MONTH));
    }
}
