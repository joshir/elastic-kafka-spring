/**
 * Autogenerated by Avro
 *
 * DO NOT EDIT DIRECTLY
 */
package com.joshi.elastic.kafka.spring.kafka.avro.model;
@org.apache.avro.specific.AvroGenerated
public enum orderStatus implements org.apache.avro.generic.GenericEnumSymbol<orderStatus> {
  PENDING, CANCELLED, APPROVED  ;
  public static final org.apache.avro.Schema SCHEMA$ = new org.apache.avro.Schema.Parser().parse("{\"type\":\"enum\",\"name\":\"orderStatus\",\"namespace\":\"com.joshi.elastic.kafka.spring.kafka.avro.model\",\"symbols\":[\"PENDING\",\"CANCELLED\",\"APPROVED\"]}");
  public static org.apache.avro.Schema getClassSchema() { return SCHEMA$; }
  public org.apache.avro.Schema getSchema() { return SCHEMA$; }
}
