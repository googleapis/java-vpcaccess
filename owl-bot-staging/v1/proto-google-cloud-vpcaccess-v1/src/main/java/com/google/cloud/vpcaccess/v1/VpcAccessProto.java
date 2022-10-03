// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/cloud/vpcaccess/v1/vpc_access.proto

package com.google.cloud.vpcaccess.v1;

public final class VpcAccessProto {
  private VpcAccessProto() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_cloud_vpcaccess_v1_Connector_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_vpcaccess_v1_Connector_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_cloud_vpcaccess_v1_Connector_Subnet_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_vpcaccess_v1_Connector_Subnet_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_cloud_vpcaccess_v1_CreateConnectorRequest_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_vpcaccess_v1_CreateConnectorRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_cloud_vpcaccess_v1_GetConnectorRequest_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_vpcaccess_v1_GetConnectorRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_cloud_vpcaccess_v1_ListConnectorsRequest_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_vpcaccess_v1_ListConnectorsRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_cloud_vpcaccess_v1_ListConnectorsResponse_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_vpcaccess_v1_ListConnectorsResponse_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_cloud_vpcaccess_v1_DeleteConnectorRequest_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_vpcaccess_v1_DeleteConnectorRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_cloud_vpcaccess_v1_OperationMetadata_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_vpcaccess_v1_OperationMetadata_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n*google/cloud/vpcaccess/v1/vpc_access.p" +
      "roto\022\031google.cloud.vpcaccess.v1\032\034google/" +
      "api/annotations.proto\032\027google/api/client" +
      ".proto\032\037google/api/field_behavior.proto\032" +
      "\031google/api/resource.proto\032#google/longr" +
      "unning/operations.proto\032\037google/protobuf" +
      "/timestamp.proto\"\310\004\n\tConnector\022\014\n\004name\030\001" +
      " \001(\t\022\017\n\007network\030\002 \001(\t\022\025\n\rip_cidr_range\030\003" +
      " \001(\t\022>\n\005state\030\004 \001(\0162*.google.cloud.vpcac" +
      "cess.v1.Connector.StateB\003\340A\003\022\026\n\016min_thro" +
      "ughput\030\005 \001(\005\022\026\n\016max_throughput\030\006 \001(\005\022\037\n\022" +
      "connected_projects\030\007 \003(\tB\003\340A\003\022;\n\006subnet\030" +
      "\010 \001(\0132+.google.cloud.vpcaccess.v1.Connec" +
      "tor.Subnet\022\024\n\014machine_type\030\n \001(\t\022\025\n\rmin_" +
      "instances\030\013 \001(\005\022\025\n\rmax_instances\030\014 \001(\005\032*" +
      "\n\006Subnet\022\014\n\004name\030\001 \001(\t\022\022\n\nproject_id\030\002 \001" +
      "(\t\"^\n\005State\022\025\n\021STATE_UNSPECIFIED\020\000\022\t\n\005RE" +
      "ADY\020\001\022\014\n\010CREATING\020\002\022\014\n\010DELETING\020\003\022\t\n\005ERR" +
      "OR\020\004\022\014\n\010UPDATING\020\005:g\352Ad\n\"vpcaccess.googl" +
      "eapis.com/Connector\022>projects/{project}/" +
      "locations/{location}/connectors/{connect" +
      "or}\"\254\001\n\026CreateConnectorRequest\0229\n\006parent" +
      "\030\001 \001(\tB)\340A\002\372A#\n!locations.googleapis.com" +
      "/Location\022\031\n\014connector_id\030\002 \001(\tB\003\340A\002\022<\n\t" +
      "connector\030\003 \001(\0132$.google.cloud.vpcaccess" +
      ".v1.ConnectorB\003\340A\002\"O\n\023GetConnectorReques" +
      "t\0228\n\004name\030\001 \001(\tB*\340A\002\372A$\n\"vpcaccess.googl" +
      "eapis.com/Connector\"y\n\025ListConnectorsReq" +
      "uest\0229\n\006parent\030\001 \001(\tB)\340A\002\372A#\n!locations." +
      "googleapis.com/Location\022\021\n\tpage_size\030\002 \001" +
      "(\005\022\022\n\npage_token\030\003 \001(\t\"k\n\026ListConnectors" +
      "Response\0228\n\nconnectors\030\001 \003(\0132$.google.cl" +
      "oud.vpcaccess.v1.Connector\022\027\n\017next_page_" +
      "token\030\002 \001(\t\"R\n\026DeleteConnectorRequest\0228\n" +
      "\004name\030\001 \001(\tB*\340A\002\372A$\n\"vpcaccess.googleapi" +
      "s.com/Connector\"\315\001\n\021OperationMetadata\022\023\n" +
      "\006method\030\001 \001(\tB\003\340A\003\0224\n\013create_time\030\002 \001(\0132" +
      "\032.google.protobuf.TimestampB\003\340A\003\0221\n\010end_" +
      "time\030\003 \001(\0132\032.google.protobuf.TimestampB\003" +
      "\340A\003\022:\n\006target\030\005 \001(\tB*\340A\003\372A$\n\"vpcaccess.g" +
      "oogleapis.com/Connector2\374\006\n\020VpcAccessSer" +
      "vice\022\350\001\n\017CreateConnector\0221.google.cloud." +
      "vpcaccess.v1.CreateConnectorRequest\032\035.go" +
      "ogle.longrunning.Operation\"\202\001\202\323\344\223\002;\"./v1" +
      "/{parent=projects/*/locations/*}/connect" +
      "ors:\tconnector\332A\035parent,connector_id,con" +
      "nector\312A\036\n\tConnector\022\021OperationMetadata\022" +
      "\243\001\n\014GetConnector\022..google.cloud.vpcacces" +
      "s.v1.GetConnectorRequest\032$.google.cloud." +
      "vpcaccess.v1.Connector\"=\202\323\344\223\0020\022./v1/{nam" +
      "e=projects/*/locations/*/connectors/*}\332A" +
      "\004name\022\266\001\n\016ListConnectors\0220.google.cloud." +
      "vpcaccess.v1.ListConnectorsRequest\0321.goo" +
      "gle.cloud.vpcaccess.v1.ListConnectorsRes" +
      "ponse\"?\202\323\344\223\0020\022./v1/{parent=projects/*/lo" +
      "cations/*}/connectors\332A\006parent\022\317\001\n\017Delet" +
      "eConnector\0221.google.cloud.vpcaccess.v1.D" +
      "eleteConnectorRequest\032\035.google.longrunni" +
      "ng.Operation\"j\202\323\344\223\0020*./v1/{name=projects" +
      "/*/locations/*/connectors/*}\332A\004name\312A*\n\025" +
      "google.protobuf.Empty\022\021OperationMetadata" +
      "\032L\312A\030vpcaccess.googleapis.com\322A.https://" +
      "www.googleapis.com/auth/cloud-platformB\314" +
      "\001\n\035com.google.cloud.vpcaccess.v1B\016VpcAcc" +
      "essProtoP\001ZBgoogle.golang.org/genproto/g" +
      "oogleapis/cloud/vpcaccess/v1;vpcaccess\252\002" +
      "\031Google.Cloud.VpcAccess.V1\312\002\031Google\\Clou" +
      "d\\VpcAccess\\V1\352\002\034Google::Cloud::VpcAcces" +
      "s::V1b\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
          com.google.api.AnnotationsProto.getDescriptor(),
          com.google.api.ClientProto.getDescriptor(),
          com.google.api.FieldBehaviorProto.getDescriptor(),
          com.google.api.ResourceProto.getDescriptor(),
          com.google.longrunning.OperationsProto.getDescriptor(),
          com.google.protobuf.TimestampProto.getDescriptor(),
        });
    internal_static_google_cloud_vpcaccess_v1_Connector_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_google_cloud_vpcaccess_v1_Connector_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_cloud_vpcaccess_v1_Connector_descriptor,
        new java.lang.String[] { "Name", "Network", "IpCidrRange", "State", "MinThroughput", "MaxThroughput", "ConnectedProjects", "Subnet", "MachineType", "MinInstances", "MaxInstances", });
    internal_static_google_cloud_vpcaccess_v1_Connector_Subnet_descriptor =
      internal_static_google_cloud_vpcaccess_v1_Connector_descriptor.getNestedTypes().get(0);
    internal_static_google_cloud_vpcaccess_v1_Connector_Subnet_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_cloud_vpcaccess_v1_Connector_Subnet_descriptor,
        new java.lang.String[] { "Name", "ProjectId", });
    internal_static_google_cloud_vpcaccess_v1_CreateConnectorRequest_descriptor =
      getDescriptor().getMessageTypes().get(1);
    internal_static_google_cloud_vpcaccess_v1_CreateConnectorRequest_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_cloud_vpcaccess_v1_CreateConnectorRequest_descriptor,
        new java.lang.String[] { "Parent", "ConnectorId", "Connector", });
    internal_static_google_cloud_vpcaccess_v1_GetConnectorRequest_descriptor =
      getDescriptor().getMessageTypes().get(2);
    internal_static_google_cloud_vpcaccess_v1_GetConnectorRequest_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_cloud_vpcaccess_v1_GetConnectorRequest_descriptor,
        new java.lang.String[] { "Name", });
    internal_static_google_cloud_vpcaccess_v1_ListConnectorsRequest_descriptor =
      getDescriptor().getMessageTypes().get(3);
    internal_static_google_cloud_vpcaccess_v1_ListConnectorsRequest_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_cloud_vpcaccess_v1_ListConnectorsRequest_descriptor,
        new java.lang.String[] { "Parent", "PageSize", "PageToken", });
    internal_static_google_cloud_vpcaccess_v1_ListConnectorsResponse_descriptor =
      getDescriptor().getMessageTypes().get(4);
    internal_static_google_cloud_vpcaccess_v1_ListConnectorsResponse_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_cloud_vpcaccess_v1_ListConnectorsResponse_descriptor,
        new java.lang.String[] { "Connectors", "NextPageToken", });
    internal_static_google_cloud_vpcaccess_v1_DeleteConnectorRequest_descriptor =
      getDescriptor().getMessageTypes().get(5);
    internal_static_google_cloud_vpcaccess_v1_DeleteConnectorRequest_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_cloud_vpcaccess_v1_DeleteConnectorRequest_descriptor,
        new java.lang.String[] { "Name", });
    internal_static_google_cloud_vpcaccess_v1_OperationMetadata_descriptor =
      getDescriptor().getMessageTypes().get(6);
    internal_static_google_cloud_vpcaccess_v1_OperationMetadata_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_cloud_vpcaccess_v1_OperationMetadata_descriptor,
        new java.lang.String[] { "Method", "CreateTime", "EndTime", "Target", });
    com.google.protobuf.ExtensionRegistry registry =
        com.google.protobuf.ExtensionRegistry.newInstance();
    registry.add(com.google.api.ClientProto.defaultHost);
    registry.add(com.google.api.FieldBehaviorProto.fieldBehavior);
    registry.add(com.google.api.AnnotationsProto.http);
    registry.add(com.google.api.ClientProto.methodSignature);
    registry.add(com.google.api.ClientProto.oauthScopes);
    registry.add(com.google.api.ResourceProto.resource);
    registry.add(com.google.api.ResourceProto.resourceReference);
    registry.add(com.google.longrunning.OperationsProto.operationInfo);
    com.google.protobuf.Descriptors.FileDescriptor
        .internalUpdateFileDescriptor(descriptor, registry);
    com.google.api.AnnotationsProto.getDescriptor();
    com.google.api.ClientProto.getDescriptor();
    com.google.api.FieldBehaviorProto.getDescriptor();
    com.google.api.ResourceProto.getDescriptor();
    com.google.longrunning.OperationsProto.getDescriptor();
    com.google.protobuf.TimestampProto.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
