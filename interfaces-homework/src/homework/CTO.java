package homework;

public class CTO extends AutomationQA implements Developer, QA, Manager, SystemAdmin  {
    @Override
    public void buildSoftware() {
        System.out.println("The CTO can build software.");
    }

    @Override
    public void performCodeReview() {
        System.out.println("The CTO can perform a code review.");
    }

    @Override
    public void managePeople() {
        System.out.println("The CTO can manage people.");
    }

    @Override
    public void drinkCoffeeAllDay() {
        System.out.println("The CTO is very strict and doesn't drink coffee the whole day.");
    }

    @Override
    public void verifySoftwareQuality() {
        System.out.println("The CTO can verify the software quality.");
    }

    @Override
    void writeAutomationTest() {
        System.out.println("The CTO can write automation tests.");
    }

    @Override
    public void configureMachine() {
        System.out.println("The CTO can configure machines.");
    }

    @Override
    public void supportSoftware() {
        System.out.println("The CTO can support software.");
    }
}
