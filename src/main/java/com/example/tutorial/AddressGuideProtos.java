// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: sample.proto

package com.example.tutorial;

public final class AddressGuideProtos {
  private AddressGuideProtos() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_tutorial_Person_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_tutorial_Person_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_tutorial_Person_PhoneNumber_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_tutorial_Person_PhoneNumber_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_tutorial_AddressBook_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_tutorial_AddressBook_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\014sample.proto\022\010tutorial\032\037google/protobu" +
      "f/timestamp.proto\"\207\002\n\006Person\022\014\n\004name\030\001 \001" +
      "(\t\022\n\n\002id\030\002 \001(\005\022\r\n\005email\030\003 \001(\t\022,\n\006phones\030" +
      "\004 \003(\0132\034.tutorial.Person.PhoneNumber\0220\n\014l" +
      "ast_updated\030\005 \001(\0132\032.google.protobuf.Time" +
      "stamp\032G\n\013PhoneNumber\022\016\n\006number\030\001 \001(\t\022(\n\004" +
      "type\030\002 \001(\0162\032.tutorial.Person.PhoneType\"+" +
      "\n\tPhoneType\022\n\n\006MOBILE\020\000\022\010\n\004HOME\020\001\022\010\n\004WOR" +
      "K\020\002\"/\n\013AddressBook\022 \n\006people\030\001 \003(\0132\020.tut" +
      "orial.Person2K\n\014AddressGuide\022;\n\016GetAddre" +
      "ssBook\022\020.tutorial.Person\032\025.tutorial.Addr" +
      "essBook\"\000B,\n\024com.example.tutorialB\022Addre" +
      "ssGuideProtosP\001b\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
          com.google.protobuf.TimestampProto.getDescriptor(),
        });
    internal_static_tutorial_Person_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_tutorial_Person_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_tutorial_Person_descriptor,
        new java.lang.String[] { "Name", "Id", "Email", "Phones", "LastUpdated", });
    internal_static_tutorial_Person_PhoneNumber_descriptor =
      internal_static_tutorial_Person_descriptor.getNestedTypes().get(0);
    internal_static_tutorial_Person_PhoneNumber_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_tutorial_Person_PhoneNumber_descriptor,
        new java.lang.String[] { "Number", "Type", });
    internal_static_tutorial_AddressBook_descriptor =
      getDescriptor().getMessageTypes().get(1);
    internal_static_tutorial_AddressBook_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_tutorial_AddressBook_descriptor,
        new java.lang.String[] { "People", });
    com.google.protobuf.TimestampProto.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
