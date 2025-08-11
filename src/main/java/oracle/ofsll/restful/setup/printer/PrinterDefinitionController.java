package oracle.ofsll.restful.setup.printer;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import jakarta.validation.Valid;

@RestController
@RequestMapping("/api/printer-definitions")
public class PrinterDefinitionController {
    
    @Autowired
    private PrinterDefinitionService service;
    
    @PostMapping
    public ResponseEntity<PrinterDefinitionResponse> create(@Valid @RequestBody PrinterDefinitionDTO request) {
        PrinterDefinitionResponse response = service.createPrinterDefinition(request);
        return ResponseEntity.status(HttpStatus.CREATED).body(response);
    }
}
