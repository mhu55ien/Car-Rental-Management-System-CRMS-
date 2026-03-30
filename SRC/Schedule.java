/**
 * Represents an agent's working schedule.
 */
public class Schedule {
    /** The standard working hours (e.g., "09:00-17:00"). */
    private String workingHours;
    /** Indicates whether the agent is currently available. */
    private boolean availability;
    /** The specific days off for the agent (e.g., "Saturday, Sunday"). */
    private String daysOff;

    /**
     * Constructs a new Schedule.
     *
     * @param workingHours the working hours
     * @param availability the current availability status
     * @param daysOff      the days off
     */
    public Schedule(String workingHours, boolean availability, String daysOff) {
        this.workingHours = workingHours;
        this.availability = availability;
        this.daysOff = daysOff;
    }

    /**
     * Gets the working hours.
     *
     * @return the working hours
     */
    public String getWorkingHours() {
        return workingHours;
    }

    /**
     * Sets the working hours.
     *
     * @param workingHours the working hours
     */
    public void setWorkingHours(String workingHours) {
        this.workingHours = workingHours;
    }

    /**
     * Checks availability.
     *
     * @return true if available, false otherwise
     */
    public boolean isAvailability() {
        return availability;
    }

    /**
     * Sets availability.
     *
     * @param availability the availability flag
     */
    public void setAvailability(boolean availability) {
        this.availability = availability;
    }

    /**
     * Gets the days off.
     *
     * @return the days off
     */
    public String getDaysOff() {
        return daysOff;
    }

    /**
     * Sets the days off.
     *
     * @param daysOff the days off
     */
    public void setDaysOff(String daysOff) {
        this.daysOff = daysOff;
    }

    /**
     * Returns a string representation of the schedule.
     *
     * @return the string representation
     */
    @Override
    public String toString() {
        return "Schedule{" +
                "workingHours='" + workingHours + '\'' +
                ", availability=" + availability +
                ", daysOff='" + daysOff + '\'' +
                '}';
    }
}
