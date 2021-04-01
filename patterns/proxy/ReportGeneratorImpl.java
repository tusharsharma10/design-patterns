package patterns.proxy;

public class ReportGeneratorImpl implements ReportGenerator {

    public ReportGeneratorImpl(){
        System.out.println("ReportGeneratorImpl instance created");
    }

    @Override
    public void displayReportTemplate(String reportFormat, int entries) {
       
        //handled by proxy class
    }

    @Override
    public void displayComplexReport(String reportFormat, int entries) {
       System.out.println("Generating complex report...");
        
    }

    @Override
    public void displaySensitiveReport(String reportFormat, int entries) {
        System.out.println("Generating sensititve report...");
        
    }
    
}
