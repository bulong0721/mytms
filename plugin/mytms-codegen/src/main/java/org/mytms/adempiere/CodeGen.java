package org.mytms.adempiere;

import java.io.IOException;

import org.apache.openjpa.jdbc.meta.ReverseMappingTool;

public class CodeGen {

    public static void main(String[] args) throws IOException {
        try {
            //-pkg org.mytms.youtu.domain
            String path = "d:/mytms_home/entity";
            String jpaArg = "-no true -fkn false -cc org.mytms.adempiere.MyTmsCustomizer -pkj false -d "
                            + path
                            + " -is PK -pkg org.mytms.customer.domain -ann true -md none -inn false -ir false -access field ";
//             jpaArg += " -s " + "ad_field";
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
