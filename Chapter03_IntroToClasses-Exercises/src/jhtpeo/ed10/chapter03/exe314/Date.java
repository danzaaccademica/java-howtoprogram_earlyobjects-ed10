package jhtpeo.ed10.chapter03.exe314;

public class Date
{

  private int
      day,
      month,
      year;

  public Date() {
    day = 0;
    month = 0;
    year = 0;
  } // [END_METHOD : Date]

  public int getDay() {
    return day;
  } // [END_METHOD : getDay]

  public int getMonth() {
    return month;
  } // [END_METHOD : getMonth]

  public int getYear() {
    return year;
  } // [END_METHOD : getYear]

  public void setDay(int newDay) {
    if (0 < newDay || newDay <= 31) {
      day = newDay;
    }
  } // [END_METHOD : setDay]


  public void setMonth(int newMonth) {
    if (0 < newMonth || newMonth <= 12) {
      day = newMonth;
    }
  } // [END_METHOD : setMonth]

  public void setYear(int newYear) {
    year = newYear;
  } // [END_METHOD : setYear]


  public void displayDate() {
    var formattedDate = "";
    formattedDate = String.format("%d/%d/%d", month,day,year);
    System.out.println(formattedDate);
  } // [END_METHOD : displayDate]


} // [END_CLASS : Date]
