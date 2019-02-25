package homework;

public class ITDemo {
    public static void main(String[] args) {
        SoftwareDeveloper developer = new SoftwareDeveloper();
        DevOps devOps = new DevOps();
        AutomationQA automationQA = new AutomationQA();
        CTO cto = new CTO();

        developer.buildSoftware();
        developer.performCodeReview();
        System.out.println();
        devOps.buildSoftware();
        devOps.performCodeReview();
        devOps.configureMachine();
        devOps.supportSoftware();
        System.out.println();
        automationQA.verifySoftwareQuality();
        automationQA.writeAutomationTest();
        System.out.println();
        cto.buildSoftware();
        cto.configureMachine();
        cto.drinkCoffeeAllDay();
        cto.managePeople();
        cto.performCodeReview();
        cto.supportSoftware();
        cto.verifySoftwareQuality();
        cto.writeAutomationTest();
    }
}
