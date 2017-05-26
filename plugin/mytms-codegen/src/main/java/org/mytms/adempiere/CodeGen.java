package org.mytms.adempiere;

import java.io.IOException;

import org.apache.openjpa.jdbc.meta.ReverseMappingTool;

public class CodeGen {

    public static void main(String[] args) throws IOException {
        genEntity();
        genDto();
    }

    static void genEntity() {
        try {
            String path = "d:/mytms_home/entity";
            String jpaArg = "-no true -fkn false -cc org.mytms.adempiere.MyTmsCustomizer -pkj false -d "
                    + path
                    + " -is PK -pkg org.mytms.customer.domain -ann true -md none -inn false -ir false -access field ";
            String[] jpaArgs = jpaArg.split(" ");
            ReverseMappingTool.main(jpaArgs);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    static void genDto() {
        try {
            String path = "d:/mytms_home/entity";
            String jpaArg = "-no true -fkn false -cc org.mytms.adempiere.MyDtoCustomizer -pkj false -d "
                    + path
                    + " -is PK -pkg org.mytms.customer.dto -ann true -md none -inn false -ir false -access property ";
            String[] jpaArgs = jpaArg.split(" ");
            ReverseMappingTool.main(jpaArgs);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    static void print(int... values) {
        for (int i : values) {
            System.out.println(i);
        }
    }

}
