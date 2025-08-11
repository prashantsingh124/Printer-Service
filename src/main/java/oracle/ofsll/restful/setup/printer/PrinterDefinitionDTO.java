package oracle.ofsll.restful.setup.printer;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Size;
import jakarta.validation.constraints.Pattern;

public class PrinterDefinitionDTO {
    
    @NotBlank(message = "Printer description must not be empty")
    @Size(max = 100, message = "Printer description must not exceed 100 characters")
    @Pattern(regexp = "^[a-zA-Z0-9\\s.,-]+$", message = "Printer description must contain only alphanumeric characters, spaces, and common punctuation")
    private String printerDescription;
    
    @Size(max = 50, message = "Printer company must not exceed 50 characters")
    private String printerCompany = "ALL";
    
    @Size(max = 50, message = "Printer branch must not exceed 50 characters")
    private String printerBranch = "ALL";
    
    @Size(max = 50, message = "Printer department must not exceed 50 characters")
    private String printerDepartment = "ALL";
    
    @Pattern(regexp = "^[YN]$", message = "Printer default indicator must be either 'Y' or 'N'")
    private String printerDefaultIndicator = "N";
    
    @Pattern(regexp = "^[YN]$", message = "Printer enabled indicator must be either 'Y' or 'N'")
    private String printerEnabledIndicator = "Y";
    
    // Getters and Setters
    public String getPrinterDescription() {
        return printerDescription;
    }
    
    public void setPrinterDescription(String printerDescription) {
        this.printerDescription = printerDescription;
    }
    
    public String getPrinterCompany() {
        return printerCompany;
    }
    
    public void setPrinterCompany(String printerCompany) {
        this.printerCompany = printerCompany;
    }
    
    public String getPrinterBranch() {
        return printerBranch;
    }
    
    public void setPrinterBranch(String printerBranch) {
        this.printerBranch = printerBranch;
    }
    
    public String getPrinterDepartment() {
        return printerDepartment;
    }
    
    public void setPrinterDepartment(String printerDepartment) {
        this.printerDepartment = printerDepartment;
    }
    
    public String getPrinterDefaultIndicator() {
        return printerDefaultIndicator;
    }
    
    public void setPrinterDefaultIndicator(String printerDefaultIndicator) {
        this.printerDefaultIndicator = printerDefaultIndicator;
    }
    
    public String getPrinterEnabledIndicator() {
        return printerEnabledIndicator;
    }
    
    public void setPrinterEnabledIndicator(String printerEnabledIndicator) {
        this.printerEnabledIndicator = printerEnabledIndicator;
    }
}
