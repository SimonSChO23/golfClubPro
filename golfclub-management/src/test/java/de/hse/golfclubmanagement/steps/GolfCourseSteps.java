package de.hse.golfclubmanagement.steps;

import static org.junit.Assert.assertEquals;

import java.util.List;
import java.util.stream.Collectors;

import de.hse.golfclubmanagement.models.GolfCourse;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class GolfCourseSteps {
    private GolfCourse golfCourse;
    private List<GolfCourse> golfCourses;
    private List<GolfCourse> result;

    @Given("I have the golfClubPro application")
    public void i_have() {
        golfCourse = new GolfCourse();
        golfCourse.setName("firstClub");
        golfCourse.setLocation("Stuttgart");
        golfCourses.add(golfCourse);
    }

    @When("I enter {Stuttgart} as a location")
    public void i_enter(String location) {
        result = golfCourses.stream()
                .filter(course -> "Stuttgart".equals(course.getLocation()))
                .collect(Collectors.toList());
    }

    @Then("the result should be that I can see all golf courses in {Stuttgart}")
    public void the_result(List<GolfCourse> expected) {
        assertEquals(expected, result);
    }
}
