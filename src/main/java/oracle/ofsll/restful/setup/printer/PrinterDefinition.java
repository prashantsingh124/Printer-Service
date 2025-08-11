package oracle.ofsll.restful.setup.printer;

import java.time.LocalDateTime;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "PRINTER_DEFINITIONS")
public class PrinterDefinition {
    
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "printer_seq")
    @jakarta.persistence.SequenceGenerator(name = "printer_seq", sequenceName = "PRINTER_SEQ", allocationSize = 1)
    private Long id;
    
    @Column(name = "PRINTER_DESCRIPTION", nullable = false, length = 100)
    private String printerDescription;
    
    @Column(name = "PRINTER_COMPANY", length = 50)
    private String printerCompany = "ALL";
    
    @Column(name = "PRINTER_BRANCH", length = 50)
    private String printerBranch = "ALL";
    
    @Column(name = "PRINTER_DEPARTMENT", length = 50)
    private String printerDepartment = "ALL";
    
    @Column(name = "PRINTER_DEFAULT_INDICATOR", length = 1)
    private String printerDefaultIndicator = "N";
    
    @Column(name = "PRINTER_ENABLED_INDICATOR", length = 1)
    private String printerEnabledIndicator = "Y";
    
    @Column(name = "CREATION_DATE")
    private LocalDateTime creationDate = LocalDateTime.now();
    
    @Column(name = "CREATED_BY")
    private String createdBy;
    
    // Getters and Setters
    public Long getId() {
        return id;
    }
    
    public void setId(Long id) {
        this.id = id;
    }
    
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
    
    public LocalDateTime getCreationDate() {
        return creationDate;
    }
    
    public void setCreationDate(LocalDateTime creationDate) {
        this.creationDate = creationDate;
    }
    
    public String getCreatedBy() {
        return createdBy;
    }
    
    public void setCreatedBy(String createdBy) {
        this.createdBy = createdBy;
    }
}
