/**
 * Autogenerated by Thrift Compiler (0.9.2)
 *
 * DO NOT EDIT UNLESS YOU ARE SURE THAT YOU KNOW WHAT YOU ARE DOING
 *  @generated
 */
package org.kaaproject.kaa.server.common.thrift.gen.operations;

import org.apache.thrift.scheme.IScheme;
import org.apache.thrift.scheme.SchemeFactory;
import org.apache.thrift.scheme.StandardScheme;

import org.apache.thrift.scheme.TupleScheme;
import org.apache.thrift.protocol.TTupleProtocol;
import org.apache.thrift.protocol.TProtocolException;
import org.apache.thrift.EncodingUtils;
import org.apache.thrift.TException;
import org.apache.thrift.async.AsyncMethodCallback;
import org.apache.thrift.server.AbstractNonblockingServer.*;
import java.util.List;
import java.util.ArrayList;
import java.util.Map;
import java.util.HashMap;
import java.util.EnumMap;
import java.util.Set;
import java.util.HashSet;
import java.util.EnumSet;
import java.util.Collections;
import java.util.BitSet;
import java.nio.ByteBuffer;
import java.util.Arrays;
import javax.annotation.Generated;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

@SuppressWarnings({"cast", "rawtypes", "serial", "unchecked"})
@Generated(value = "Autogenerated by Thrift Compiler (0.9.2)", date = "2016-1-18")
public class ThriftEntityRouteMessage implements org.apache.thrift.TBase<ThriftEntityRouteMessage, ThriftEntityRouteMessage._Fields>, java.io.Serializable, Cloneable, Comparable<ThriftEntityRouteMessage> {
  private static final org.apache.thrift.protocol.TStruct STRUCT_DESC = new org.apache.thrift.protocol.TStruct("ThriftEntityRouteMessage");

  private static final org.apache.thrift.protocol.TField ADDRESS_FIELD_DESC = new org.apache.thrift.protocol.TField("address", org.apache.thrift.protocol.TType.STRUCT, (short)1);
  private static final org.apache.thrift.protocol.TField OPERATION_FIELD_DESC = new org.apache.thrift.protocol.TField("operation", org.apache.thrift.protocol.TType.I32, (short)2);

  private static final Map<Class<? extends IScheme>, SchemeFactory> schemes = new HashMap<Class<? extends IScheme>, SchemeFactory>();
  static {
    schemes.put(StandardScheme.class, new ThriftEntityRouteMessageStandardSchemeFactory());
    schemes.put(TupleScheme.class, new ThriftEntityRouteMessageTupleSchemeFactory());
  }

  public ThriftEntityClusterAddress address; // required
  /**
   * 
   * @see ThriftRouteOperation
   */
  public ThriftRouteOperation operation; // required

  /** The set of fields this struct contains, along with convenience methods for finding and manipulating them. */
  public enum _Fields implements org.apache.thrift.TFieldIdEnum {
    ADDRESS((short)1, "address"),
    /**
     * 
     * @see ThriftRouteOperation
     */
    OPERATION((short)2, "operation");

    private static final Map<String, _Fields> byName = new HashMap<String, _Fields>();

    static {
      for (_Fields field : EnumSet.allOf(_Fields.class)) {
        byName.put(field.getFieldName(), field);
      }
    }

    /**
     * Find the _Fields constant that matches fieldId, or null if its not found.
     */
    public static _Fields findByThriftId(int fieldId) {
      switch(fieldId) {
        case 1: // ADDRESS
          return ADDRESS;
        case 2: // OPERATION
          return OPERATION;
        default:
          return null;
      }
    }

    /**
     * Find the _Fields constant that matches fieldId, throwing an exception
     * if it is not found.
     */
    public static _Fields findByThriftIdOrThrow(int fieldId) {
      _Fields fields = findByThriftId(fieldId);
      if (fields == null) throw new IllegalArgumentException("Field " + fieldId + " doesn't exist!");
      return fields;
    }

    /**
     * Find the _Fields constant that matches name, or null if its not found.
     */
    public static _Fields findByName(String name) {
      return byName.get(name);
    }

    private final short _thriftId;
    private final String _fieldName;

    _Fields(short thriftId, String fieldName) {
      _thriftId = thriftId;
      _fieldName = fieldName;
    }

    public short getThriftFieldId() {
      return _thriftId;
    }

    public String getFieldName() {
      return _fieldName;
    }
  }

  // isset id assignments
  public static final Map<_Fields, org.apache.thrift.meta_data.FieldMetaData> metaDataMap;
  static {
    Map<_Fields, org.apache.thrift.meta_data.FieldMetaData> tmpMap = new EnumMap<_Fields, org.apache.thrift.meta_data.FieldMetaData>(_Fields.class);
    tmpMap.put(_Fields.ADDRESS, new org.apache.thrift.meta_data.FieldMetaData("address", org.apache.thrift.TFieldRequirementType.DEFAULT, 
        new org.apache.thrift.meta_data.StructMetaData(org.apache.thrift.protocol.TType.STRUCT, ThriftEntityClusterAddress.class)));
    tmpMap.put(_Fields.OPERATION, new org.apache.thrift.meta_data.FieldMetaData("operation", org.apache.thrift.TFieldRequirementType.DEFAULT, 
        new org.apache.thrift.meta_data.EnumMetaData(org.apache.thrift.protocol.TType.ENUM, ThriftRouteOperation.class)));
    metaDataMap = Collections.unmodifiableMap(tmpMap);
    org.apache.thrift.meta_data.FieldMetaData.addStructMetaDataMap(ThriftEntityRouteMessage.class, metaDataMap);
  }

  public ThriftEntityRouteMessage() {
  }

  public ThriftEntityRouteMessage(
    ThriftEntityClusterAddress address,
    ThriftRouteOperation operation)
  {
    this();
    this.address = address;
    this.operation = operation;
  }

  /**
   * Performs a deep copy on <i>other</i>.
   */
  public ThriftEntityRouteMessage(ThriftEntityRouteMessage other) {
    if (other.isSetAddress()) {
      this.address = new ThriftEntityClusterAddress(other.address);
    }
    if (other.isSetOperation()) {
      this.operation = other.operation;
    }
  }

  public ThriftEntityRouteMessage deepCopy() {
    return new ThriftEntityRouteMessage(this);
  }

  @Override
  public void clear() {
    this.address = null;
    this.operation = null;
  }

  public ThriftEntityClusterAddress getAddress() {
    return this.address;
  }

  public ThriftEntityRouteMessage setAddress(ThriftEntityClusterAddress address) {
    this.address = address;
    return this;
  }

  public void unsetAddress() {
    this.address = null;
  }

  /** Returns true if field address is set (has been assigned a value) and false otherwise */
  public boolean isSetAddress() {
    return this.address != null;
  }

  public void setAddressIsSet(boolean value) {
    if (!value) {
      this.address = null;
    }
  }

  /**
   * 
   * @see ThriftRouteOperation
   */
  public ThriftRouteOperation getOperation() {
    return this.operation;
  }

  /**
   * 
   * @see ThriftRouteOperation
   */
  public ThriftEntityRouteMessage setOperation(ThriftRouteOperation operation) {
    this.operation = operation;
    return this;
  }

  public void unsetOperation() {
    this.operation = null;
  }

  /** Returns true if field operation is set (has been assigned a value) and false otherwise */
  public boolean isSetOperation() {
    return this.operation != null;
  }

  public void setOperationIsSet(boolean value) {
    if (!value) {
      this.operation = null;
    }
  }

  public void setFieldValue(_Fields field, Object value) {
    switch (field) {
    case ADDRESS:
      if (value == null) {
        unsetAddress();
      } else {
        setAddress((ThriftEntityClusterAddress)value);
      }
      break;

    case OPERATION:
      if (value == null) {
        unsetOperation();
      } else {
        setOperation((ThriftRouteOperation)value);
      }
      break;

    }
  }

  public Object getFieldValue(_Fields field) {
    switch (field) {
    case ADDRESS:
      return getAddress();

    case OPERATION:
      return getOperation();

    }
    throw new IllegalStateException();
  }

  /** Returns true if field corresponding to fieldID is set (has been assigned a value) and false otherwise */
  public boolean isSet(_Fields field) {
    if (field == null) {
      throw new IllegalArgumentException();
    }

    switch (field) {
    case ADDRESS:
      return isSetAddress();
    case OPERATION:
      return isSetOperation();
    }
    throw new IllegalStateException();
  }

  @Override
  public boolean equals(Object that) {
    if (that == null)
      return false;
    if (that instanceof ThriftEntityRouteMessage)
      return this.equals((ThriftEntityRouteMessage)that);
    return false;
  }

  public boolean equals(ThriftEntityRouteMessage that) {
    if (that == null)
      return false;

    boolean this_present_address = true && this.isSetAddress();
    boolean that_present_address = true && that.isSetAddress();
    if (this_present_address || that_present_address) {
      if (!(this_present_address && that_present_address))
        return false;
      if (!this.address.equals(that.address))
        return false;
    }

    boolean this_present_operation = true && this.isSetOperation();
    boolean that_present_operation = true && that.isSetOperation();
    if (this_present_operation || that_present_operation) {
      if (!(this_present_operation && that_present_operation))
        return false;
      if (!this.operation.equals(that.operation))
        return false;
    }

    return true;
  }

  @Override
  public int hashCode() {
    List<Object> list = new ArrayList<Object>();

    boolean present_address = true && (isSetAddress());
    list.add(present_address);
    if (present_address)
      list.add(address);

    boolean present_operation = true && (isSetOperation());
    list.add(present_operation);
    if (present_operation)
      list.add(operation.getValue());

    return list.hashCode();
  }

  @Override
  public int compareTo(ThriftEntityRouteMessage other) {
    if (!getClass().equals(other.getClass())) {
      return getClass().getName().compareTo(other.getClass().getName());
    }

    int lastComparison = 0;

    lastComparison = Boolean.valueOf(isSetAddress()).compareTo(other.isSetAddress());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetAddress()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.address, other.address);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = Boolean.valueOf(isSetOperation()).compareTo(other.isSetOperation());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetOperation()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.operation, other.operation);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    return 0;
  }

  public _Fields fieldForId(int fieldId) {
    return _Fields.findByThriftId(fieldId);
  }

  public void read(org.apache.thrift.protocol.TProtocol iprot) throws org.apache.thrift.TException {
    schemes.get(iprot.getScheme()).getScheme().read(iprot, this);
  }

  public void write(org.apache.thrift.protocol.TProtocol oprot) throws org.apache.thrift.TException {
    schemes.get(oprot.getScheme()).getScheme().write(oprot, this);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder("ThriftEntityRouteMessage(");
    boolean first = true;

    sb.append("address:");
    if (this.address == null) {
      sb.append("null");
    } else {
      sb.append(this.address);
    }
    first = false;
    if (!first) sb.append(", ");
    sb.append("operation:");
    if (this.operation == null) {
      sb.append("null");
    } else {
      sb.append(this.operation);
    }
    first = false;
    sb.append(")");
    return sb.toString();
  }

  public void validate() throws org.apache.thrift.TException {
    // check for required fields
    // check for sub-struct validity
    if (address != null) {
      address.validate();
    }
  }

  private void writeObject(java.io.ObjectOutputStream out) throws java.io.IOException {
    try {
      write(new org.apache.thrift.protocol.TCompactProtocol(new org.apache.thrift.transport.TIOStreamTransport(out)));
    } catch (org.apache.thrift.TException te) {
      throw new java.io.IOException(te);
    }
  }

  private void readObject(java.io.ObjectInputStream in) throws java.io.IOException, ClassNotFoundException {
    try {
      read(new org.apache.thrift.protocol.TCompactProtocol(new org.apache.thrift.transport.TIOStreamTransport(in)));
    } catch (org.apache.thrift.TException te) {
      throw new java.io.IOException(te);
    }
  }

  private static class ThriftEntityRouteMessageStandardSchemeFactory implements SchemeFactory {
    public ThriftEntityRouteMessageStandardScheme getScheme() {
      return new ThriftEntityRouteMessageStandardScheme();
    }
  }

  private static class ThriftEntityRouteMessageStandardScheme extends StandardScheme<ThriftEntityRouteMessage> {

    public void read(org.apache.thrift.protocol.TProtocol iprot, ThriftEntityRouteMessage struct) throws org.apache.thrift.TException {
      org.apache.thrift.protocol.TField schemeField;
      iprot.readStructBegin();
      while (true)
      {
        schemeField = iprot.readFieldBegin();
        if (schemeField.type == org.apache.thrift.protocol.TType.STOP) { 
          break;
        }
        switch (schemeField.id) {
          case 1: // ADDRESS
            if (schemeField.type == org.apache.thrift.protocol.TType.STRUCT) {
              struct.address = new ThriftEntityClusterAddress();
              struct.address.read(iprot);
              struct.setAddressIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 2: // OPERATION
            if (schemeField.type == org.apache.thrift.protocol.TType.I32) {
              struct.operation = org.kaaproject.kaa.server.common.thrift.gen.operations.ThriftRouteOperation.findByValue(iprot.readI32());
              struct.setOperationIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          default:
            org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
        }
        iprot.readFieldEnd();
      }
      iprot.readStructEnd();

      // check for required fields of primitive type, which can't be checked in the validate method
      struct.validate();
    }

    public void write(org.apache.thrift.protocol.TProtocol oprot, ThriftEntityRouteMessage struct) throws org.apache.thrift.TException {
      struct.validate();

      oprot.writeStructBegin(STRUCT_DESC);
      if (struct.address != null) {
        oprot.writeFieldBegin(ADDRESS_FIELD_DESC);
        struct.address.write(oprot);
        oprot.writeFieldEnd();
      }
      if (struct.operation != null) {
        oprot.writeFieldBegin(OPERATION_FIELD_DESC);
        oprot.writeI32(struct.operation.getValue());
        oprot.writeFieldEnd();
      }
      oprot.writeFieldStop();
      oprot.writeStructEnd();
    }

  }

  private static class ThriftEntityRouteMessageTupleSchemeFactory implements SchemeFactory {
    public ThriftEntityRouteMessageTupleScheme getScheme() {
      return new ThriftEntityRouteMessageTupleScheme();
    }
  }

  private static class ThriftEntityRouteMessageTupleScheme extends TupleScheme<ThriftEntityRouteMessage> {

    @Override
    public void write(org.apache.thrift.protocol.TProtocol prot, ThriftEntityRouteMessage struct) throws org.apache.thrift.TException {
      TTupleProtocol oprot = (TTupleProtocol) prot;
      BitSet optionals = new BitSet();
      if (struct.isSetAddress()) {
        optionals.set(0);
      }
      if (struct.isSetOperation()) {
        optionals.set(1);
      }
      oprot.writeBitSet(optionals, 2);
      if (struct.isSetAddress()) {
        struct.address.write(oprot);
      }
      if (struct.isSetOperation()) {
        oprot.writeI32(struct.operation.getValue());
      }
    }

    @Override
    public void read(org.apache.thrift.protocol.TProtocol prot, ThriftEntityRouteMessage struct) throws org.apache.thrift.TException {
      TTupleProtocol iprot = (TTupleProtocol) prot;
      BitSet incoming = iprot.readBitSet(2);
      if (incoming.get(0)) {
        struct.address = new ThriftEntityClusterAddress();
        struct.address.read(iprot);
        struct.setAddressIsSet(true);
      }
      if (incoming.get(1)) {
        struct.operation = org.kaaproject.kaa.server.common.thrift.gen.operations.ThriftRouteOperation.findByValue(iprot.readI32());
        struct.setOperationIsSet(true);
      }
    }
  }

}

