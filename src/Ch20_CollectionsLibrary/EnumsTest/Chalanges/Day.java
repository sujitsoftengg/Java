package Ch20_CollectionsLibrary.EnumsTest.Chalanges;

public enum Day {

    // Enum
    Sunday(false),
    Monday(true),
    Tuesday(true),
    Wednesday(true),
    Thursday(true),
    Friday(true),
    Saturday(false);

    // Variable
    private final boolean isWeekday;

    // Constructor
    Day (boolean isWeekday){
        this.isWeekday = isWeekday;
    }

    // getter method
    public String getType(){
        return isWeekday ? "Weekday" : "Weekend";
    }


}
