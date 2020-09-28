package org.launchcode.techjobs_oo.Tests;
import org.junit.Assert;
import org.junit.Before;
import org.launchcode.techjobs_oo.*;
//import org.testng.annotations.Test;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.*;


public class JobTest {

    Job test_jobId, test_jobId2, test_jobIdObject, test_jobIdObject2, test_jobIdObjectEmpty, test_jobBonus;

    @Before
    public void createJobObject() {
        test_jobId = new Job();
        test_jobId2 = new Job();
        test_jobIdObject = new Job(("Product tester"), new Employer("ACME"), new Location("Desert"), new PositionType("Quality control"), new CoreCompetency("Persistence"));
        test_jobIdObject2 = new Job(("Product tester"), new Employer("ACME"), new Location("Desert"), new PositionType("Quality control"), new CoreCompetency("Persistence"));
        test_jobIdObjectEmpty = new Job("", new Employer(""), new Location(""), new PositionType(""), new CoreCompetency(""));
        test_jobBonus = new Job(null, new Employer("ACME"), new Location("Desert"), new PositionType("Quality control"), new CoreCompetency());
    }

    //  Test set id
    @Test
    public void testSettingJobId() {
        assertTrue(test_jobId.getId() != test_jobId2.getId());
    }


//  Test constructor sets all fields// //

    @Test
    public void testJobConstructorSetsAllFields() {
        assertEquals("Product tester", test_jobIdObject2.getName());
        assertEquals("ACME", test_jobIdObject2.getEmployer().getValue());
        assertEquals("Desert", test_jobIdObject2.getLocation().getValue());
        assertEquals("Quality control", test_jobIdObject2.getPositionType().getValue());
        assertEquals("Persistence", test_jobIdObject2.getCoreCompetency().getValue());
    }

    //  Test for equality, each field has identical field values except id.
    @Test
    public void testJobsForEquality() {
        assertNotEquals(test_jobIdObject.getId(), test_jobIdObject2.getId());
    }


    //      String should start and end with new line.
    @Test
    public void testStringStart_EndNewLine() {
        assertTrue(test_jobIdObject.toString().startsWith("\n"));
        assertTrue(test_jobIdObject.toString().endsWith("\n"));

    }

//    Fields labeled and data populated
    @Test
    public void testFieldsLabeled_DataPopulates() {
        assertEquals("\nID: " + test_jobIdObject2.getId() +
                "\nName: Product tester" +
                "\nEmployer: ACME"  +
                "\nLocation: Desert" +
                "\nPosition Type: Quality control" +
                "\nCore Competency: Persistence" + "\n", test_jobIdObject2.toString());

    }


    //    If field is empty return "Data not available." after label.
    @Test
    public void testFieldsWithoutData() {
        assertEquals("\nID: " + test_jobIdObjectEmpty.getId() +
                "\nName: Data not available." + test_jobIdObjectEmpty.getName() +
                "\nEmployer: Data not available." + test_jobIdObjectEmpty.getEmployer() +
                "\nLocation: Data not available." + test_jobIdObjectEmpty.getLocation() +
                "\nPosition Type: Data not available." + test_jobIdObjectEmpty.getPositionType() +
                "\nCore Competency: Data not available." + test_jobIdObjectEmpty.getCoreCompetency() +
                "\n", test_jobIdObjectEmpty.toString());
    }


//  If Job object contains data for id field, method should return "OOPS! This job does not seem to exist."
    @Test
    public void testJobBonus(){
        assertNotNull("OOPS! This job does not seem to exist.", test_jobBonus);

        }
    }

