package org.mytms.adempiere;

import org.apache.openjpa.jdbc.meta.ClassMapping;
import org.apache.openjpa.lib.util.CodeFormat;

/**
 * Created by Martin on 2017/5/25.
 */
public class MyDtoCustomizer extends MyTmsCustomizer {

    @Override
    public String getClassCode(ClassMapping mapping) {
        return writeEntity(mapping);
    }

    String writeDto(ClassMapping mapping) {
        CodeFormat code = new CodeFormat();
        code.append("package org.mytms.customer.dto;").afterSection();

        code.append("import java.util.List;").endl();
        code.append("import lombok.*;").afterSection();

        code.append("/**").endl().append(" * Auto-generated by: ").append("OpenJPA ReverseMappingTool").endl().append(" */").endl();

        code.append("@Getter").endl();
        code.append("@Setter").endl();
        code.append("@NoArgsConstructor").endl();
        code.append("public class ").append("${className}Dto");
//        code.extendsDec(1).append(" ").append("OrgAssignedEntity<Long, ").append("${className}>");
        code.openBrace(1).endl();
//        code.tab().append("private static final long serialVersionUID = 1L;").afterSection();
        code.append("${fieldDecs}").endl().endl();

        closeClassBrace(code, null);

        return code.toString();
    }
}
