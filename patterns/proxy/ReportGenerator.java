package patterns.proxy;

public interface ReportGenerator {
    
    public void displayReportTemplate(String reportFormat, int entries);
    public void displayComplexReport(String reportFormat, int entries);
    public void displaySensitiveReport(String reportFormat, int entries);

}
