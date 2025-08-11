package oracle.ofsll.restful.setup.printer;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.time.LocalDateTime;

@Service
public class PrinterDefinitionService {
    
    @Autowired
    private PrinterDefinitionRepository repository;
    
    public PrinterDefinitionResponse createPrinterDefinition(PrinterDefinitionDTO request) {
        // Create a new PrinterDefinition entity from the DTO
        PrinterDefinition printerDefinition = new PrinterDefinition();
        printerDefinition.setPrinterDescription(request.getPrinterDescription());
        printerDefinition.setPrinterCompany(request.getPrinterCompany());
        printerDefinition.setPrinterBranch(request.getPrinterBranch());
        printerDefinition.setPrinterDepartment(request.getPrinterDepartment());
        printerDefinition.setPrinterDefaultIndicator(request.getPrinterDefaultIndicator());
        printerDefinition.setPrinterEnabledIndicator(request.getPrinterEnabledIndicator());
        printerDefinition.setCreationDate(LocalDateTime.now());
        printerDefinition.setCreatedBy("SYSTEM"); // This should be replaced with actual user info from security context
        
        // Save the entity to the database
        PrinterDefinition savedDefinition = repository.save(printerDefinition);
        
        // Prepare the response
        PrinterDefinitionResponse response = new PrinterDefinitionResponse();
        response.setStatus("Success");
        response.setMessage("Printer Definition created successfully.");
        response.setPrinterId("PR" + savedDefinition.getId());
        response.setData(request);
        
        return response;
    }
}
