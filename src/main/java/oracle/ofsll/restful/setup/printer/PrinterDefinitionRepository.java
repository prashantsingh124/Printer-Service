package oracle.ofsll.restful.setup.printer;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PrinterDefinitionRepository extends JpaRepository<PrinterDefinition, Long> {
}
