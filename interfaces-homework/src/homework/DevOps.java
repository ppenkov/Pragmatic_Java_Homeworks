package homework;

public class DevOps implements Developer, SystemAdmin {
    @Override
    public void buildSoftware() {
        System.out.println("The DevOps can build software.");
    }

    @Override
    public void performCodeReview() {
        System.out.println("The DevOps can perform a code review.");
    }

    @Override
    public void configureMachine() {
        System.out.println("The DevOps can configure machines.");
    }

    @Override
    public void supportSoftware() {
        System.out.println("The DevOps can support software.");
    }
}
