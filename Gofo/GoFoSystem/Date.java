/**
 * @author Alaa Mahmoud Ebrahim
 * ID: 20190105
 * Group: 12
 * @author Rana Ihab Ahmed Fahmy
 * ID: 20190207
 * Group: 12
 * @author Habeba Rabie Hassan
 * ID: 20190167
 * Group: 11
 */

package GoFoSystem;

/**
 * This class is responsible for setting the date in hours, minutes, day, month and year.
 */
public class Date {
    int hours, minutes, day, month, year;

    /**
     * parametrized constructor.
     * @param hours of the date.
     * @param minutes of the date.
     * @param day of the date.
     * @param month of the date.
     * @param year of the date.
     */
    public Date(int hours, int minutes, int day, int month, int year) {
        this.hours = hours;
        this.minutes = minutes;
        this.day = day;
        this.month = month;
        this.year = year;
    }

    /**
     * get the hours in the date.
     * @return hours.
     */
    public int getHours() {
        return hours;
    }

    /**
     * set the hours in the date.
     * @param hours new hour of the date.
     */
    public void setHours(int hours) {
        this.hours = hours;
    }

    /**
     * get the minutes in the date.
     * @return minutes.
     */
    public int getMinutes() {
        return minutes;
    }

    /**
     * set the minutes in the date.
     * @param minutes new minute of the date.
     */
    public void setMinutes(int minutes) {
        this.minutes = minutes;
    }

    /**
     * get the day in the date.
     * @return day.
     */
    public int getDay() {
        return day;
    }

    /**
     * set the day in the date.
     * @param day new day of the date.
     */
    public void setDay(int day) {
        this.day = day;
    }

    /**
     * get the month in the date.
     * @return month.
     */
    public int getMonth() {
        return month;
    }

    /**
     * set the month in the date.
     * @param month new month of the date.
     */
    public void setMonth(int month) {
        this.month = month;
    }

    /**
     * get the year in the date.
     * @return year.
     */
    public int getYear() {
        return year;
    }

    /**
     * set the year in the date.
     * @param year of the date.
     */
    public void setYear(int year) {
        this.year = year;
    }

    /**
     * @return string contain the whole date.
     */
    @Override
    public String toString() {
        return "Date: " + day + "/ " + month + "/ " + year + " at " + hours + ": " + minutes + "\n";
    }
}
