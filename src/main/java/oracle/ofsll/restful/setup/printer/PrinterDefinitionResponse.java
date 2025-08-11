package oracle.ofsll.restful.setup.printer;

public class PrinterDefinitionResponse {
    private String status;
    private String message;
    private String printerId;
    private PrinterDefinitionDTO data;
    
    // Getters and Setters
    public String getStatus() {
        return status;
    }
    
    public void setStatus(String status) {
        this.status = status;
    }
    
    public String getMessage() {
        return message;
    }
    
    public void setMessage(String message) {
        this.message = message;
    }
    
    public String getPrinterId() {
        return printerId;
    }
    
    public void setPrinterId(String printerId) {
        this.printerId = printerId;
    }
    
    public PrinterDefinitionDTO getData() {
        return data;
    }
    
    public void setData(PrinterDefinitionDTO data) {
        this.data = data;
    }
}
