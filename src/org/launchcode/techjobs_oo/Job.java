package org.launchcode.techjobs_oo;
import java.util.Objects;

public class Job {
    private int id;
    private static int nextId = 1;

    private String name;
    private Employer employer;
    private Location location;
    private PositionType positionType;
    private CoreCompetency coreCompetency;

    public Job() {
        id = nextId;
        nextId++;
    }
    // TODO: Add two constructors - one to initialize a unique ID and a second to initialize the
    //  other five fields. The second constructor should also call the first in order to initialize
    //  the 'id' field.

    public Job(String name, Employer employer, Location location, PositionType positionType, CoreCompetency coreCompetency) {
        this();
        this.name = name;
        this.employer = employer;
        this.location = location;
        this.positionType = positionType;
        this.coreCompetency = coreCompetency;
    }
    // TODO: Add getters for each field EXCEPT nextId. Add setters for each field EXCEPT nextID
    //  and id.


    public String getName() {
        return name; }

    public void setName(String name) {
        this.name = name;
    }


    public Employer getEmployer() { return employer; }

    public void setEmployer(Employer aEmployer) { this.employer = aEmployer; }


    public Location getLocation() { return location; }

    public void setLocation(Location aLocation) {
        this.location = aLocation;
    }


    public PositionType getPositionType() {
        return positionType;
    }

    public void setPositionType(PositionType aPositionType) {
        this.positionType = aPositionType;
    }


    public CoreCompetency getCoreCompetency() {
        return coreCompetency;
    }

    public void setCoreCompetency(CoreCompetency aCoreCompetency) {
        this.coreCompetency = aCoreCompetency;
    }

    public int getId() {
        return id;
    }


    // TODO: Add custom equals and hashCode methods. Consider two Job objects "equal" when their id fields
    //  match.
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Job job = (Job) o;
        return id == job.id;
    }

    @Override
    public int hashCode() {
        return id;
    }

    //   toString method
    @Override
    public String toString() {
        String name;
        String employer;
        String location;
        String positionType;
        String coreCompetency;


        if (getName() == null ||
                getEmployer() == null ||
                getLocation() == null ||
                getPositionType() == null ||
                getCoreCompetency() == null)
        {
            return "OOPS! This job does not seem to exist."; }

            if (getName() == "" || getName() == null) {
                name = "Data not available.";

            } else {
                name = getName();
            }

            if (getEmployer().getValue() == "" || getEmployer() == null) {
                employer = "Data not available.";

            } else {
                employer = getEmployer().getValue();
            }

            if (getLocation().getValue() == "" || getLocation() == null) {
                location = "Data not available.";

            } else {
                location = getLocation().getValue();
            }

            if (getPositionType().getValue() == "" || getPositionType() == null) {
                positionType = "Data not available.";

            } else {
                positionType = getPositionType().getValue();
            }

            if (getCoreCompetency().getValue() == "" || getCoreCompetency() == null) {
                coreCompetency = "Data not available.";

            } else {
                coreCompetency = getCoreCompetency().getValue();
            }

            return "\nID: " + getId() +
                    "\nName: " + name +
                    "\nEmployer: " + employer +
                    "\nLocation: " + location +
                    "\nPosition Type: " + positionType +
                    "\nCore Competency: " + coreCompetency +
                    "\n";
        }
}
