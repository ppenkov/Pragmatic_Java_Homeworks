package homework;

public class SoftwareDeveloper implements Developer {
    @Override
    public void buildSoftware() {
        System.out.println("The developer can build software.");
    }

    @Override
    public void performCodeReview() {
        System.out.println("The developer can perform a code review.");
    }
}
