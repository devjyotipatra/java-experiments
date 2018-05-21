package com.qubole.tenali.parse;

import org.apache.calcite.jdbc.CalciteSchema;
import org.apache.calcite.schema.Schema;
import org.apache.calcite.schema.SchemaPlus;

/**
 * Created by devjyotip on 5/18/18.
 */
public class Calcites {

  public static SchemaPlus createRootSchema(final Schema defaultSchema)
  {
    final SchemaPlus rootSchema = CalciteSchema.createRootSchema(false, false).plus();
    rootSchema.add(DruidSchema.NAME, druidSchema);
    return rootSchema;
  }
}
