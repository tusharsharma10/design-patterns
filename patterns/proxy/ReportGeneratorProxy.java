package patterns.proxy;

public class ReportGeneratorProxy implements ReportGenerator{

    private String role;
    private ReportGeneratorImpl reportGen;

    public ReportGeneratorProxy(String role){

        this.role = role;
    }

    @Override
    public void displayReportTemplate(String reportFormat, int entries) {
       
        System.out.println("Displaying report template");
        
    }

    @Override
    public void displayComplexReport(String reportFormat, int entries) {
       
        if(reportGen == null){
            reportGen = new ReportGeneratorImpl();
            reportGen.displayComplexReport(reportFormat, entries);
        }
        
    }

    @Override
    public void displaySensitiveReport(String reportFormat, int entries) {
        
        if(role == "manager"){
            if(reportGen == null){
                reportGen = new ReportGeneratorImpl();
                reportGen.displaySensitiveReport(reportFormat, entries);
            }
        }
        
    }
    
}
