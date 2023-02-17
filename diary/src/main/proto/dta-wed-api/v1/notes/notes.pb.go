// Code generated by protoc-gen-go. DO NOT EDIT.
// versions:
// 	protoc-gen-go v1.28.1
// 	protoc        v3.21.12
// source: dta-wed-api/v1/notes/notes.proto

package notes

import (
	_ "github.com/envoyproxy/protoc-gen-validate/validate"
	_ "google.golang.org/genproto/googleapis/api/annotations"
	protoreflect "google.golang.org/protobuf/reflect/protoreflect"
	protoimpl "google.golang.org/protobuf/runtime/protoimpl"
	emptypb "google.golang.org/protobuf/types/known/emptypb"
	reflect "reflect"
	sync "sync"
)

const (
	// Verify that this generated code is sufficiently up-to-date.
	_ = protoimpl.EnforceVersion(20 - protoimpl.MinVersion)
	// Verify that runtime/protoimpl is sufficiently up-to-date.
	_ = protoimpl.EnforceVersion(protoimpl.MaxVersion - 20)
)

type UpsertNoteByUserVisitRequest struct {
	state         protoimpl.MessageState
	sizeCache     protoimpl.SizeCache
	unknownFields protoimpl.UnknownFields

	VisitId   int32  `protobuf:"varint,1,opt,name=visitId,proto3" json:"visitId,omitempty"`
	UserId    int32  `protobuf:"varint,2,opt,name=userId,proto3" json:"userId,omitempty"`
	AccountId int32  `protobuf:"varint,3,opt,name=accountId,proto3" json:"accountId,omitempty"`
	Note      string `protobuf:"bytes,4,opt,name=note,proto3" json:"note,omitempty"`
}

func (x *UpsertNoteByUserVisitRequest) Reset() {
	*x = UpsertNoteByUserVisitRequest{}
	if protoimpl.UnsafeEnabled {
		mi := &file_dta_wed_api_v1_notes_notes_proto_msgTypes[0]
		ms := protoimpl.X.MessageStateOf(protoimpl.Pointer(x))
		ms.StoreMessageInfo(mi)
	}
}

func (x *UpsertNoteByUserVisitRequest) String() string {
	return protoimpl.X.MessageStringOf(x)
}

func (*UpsertNoteByUserVisitRequest) ProtoMessage() {}

func (x *UpsertNoteByUserVisitRequest) ProtoReflect() protoreflect.Message {
	mi := &file_dta_wed_api_v1_notes_notes_proto_msgTypes[0]
	if protoimpl.UnsafeEnabled && x != nil {
		ms := protoimpl.X.MessageStateOf(protoimpl.Pointer(x))
		if ms.LoadMessageInfo() == nil {
			ms.StoreMessageInfo(mi)
		}
		return ms
	}
	return mi.MessageOf(x)
}

// Deprecated: Use UpsertNoteByUserVisitRequest.ProtoReflect.Descriptor instead.
func (*UpsertNoteByUserVisitRequest) Descriptor() ([]byte, []int) {
	return file_dta_wed_api_v1_notes_notes_proto_rawDescGZIP(), []int{0}
}

func (x *UpsertNoteByUserVisitRequest) GetVisitId() int32 {
	if x != nil {
		return x.VisitId
	}
	return 0
}

func (x *UpsertNoteByUserVisitRequest) GetUserId() int32 {
	if x != nil {
		return x.UserId
	}
	return 0
}

func (x *UpsertNoteByUserVisitRequest) GetAccountId() int32 {
	if x != nil {
		return x.AccountId
	}
	return 0
}

func (x *UpsertNoteByUserVisitRequest) GetNote() string {
	if x != nil {
		return x.Note
	}
	return ""
}

type CreateUserMedicalNoteRequest struct {
	state         protoimpl.MessageState
	sizeCache     protoimpl.SizeCache
	unknownFields protoimpl.UnknownFields

	UserId          int32  `protobuf:"varint,1,opt,name=userId,proto3" json:"userId,omitempty"`
	AuthorAccountId int32  `protobuf:"varint,2,opt,name=authorAccountId,proto3" json:"authorAccountId,omitempty"`
	Note            string `protobuf:"bytes,3,opt,name=note,proto3" json:"note,omitempty"`
}

func (x *CreateUserMedicalNoteRequest) Reset() {
	*x = CreateUserMedicalNoteRequest{}
	if protoimpl.UnsafeEnabled {
		mi := &file_dta_wed_api_v1_notes_notes_proto_msgTypes[1]
		ms := protoimpl.X.MessageStateOf(protoimpl.Pointer(x))
		ms.StoreMessageInfo(mi)
	}
}

func (x *CreateUserMedicalNoteRequest) String() string {
	return protoimpl.X.MessageStringOf(x)
}

func (*CreateUserMedicalNoteRequest) ProtoMessage() {}

func (x *CreateUserMedicalNoteRequest) ProtoReflect() protoreflect.Message {
	mi := &file_dta_wed_api_v1_notes_notes_proto_msgTypes[1]
	if protoimpl.UnsafeEnabled && x != nil {
		ms := protoimpl.X.MessageStateOf(protoimpl.Pointer(x))
		if ms.LoadMessageInfo() == nil {
			ms.StoreMessageInfo(mi)
		}
		return ms
	}
	return mi.MessageOf(x)
}

// Deprecated: Use CreateUserMedicalNoteRequest.ProtoReflect.Descriptor instead.
func (*CreateUserMedicalNoteRequest) Descriptor() ([]byte, []int) {
	return file_dta_wed_api_v1_notes_notes_proto_rawDescGZIP(), []int{1}
}

func (x *CreateUserMedicalNoteRequest) GetUserId() int32 {
	if x != nil {
		return x.UserId
	}
	return 0
}

func (x *CreateUserMedicalNoteRequest) GetAuthorAccountId() int32 {
	if x != nil {
		return x.AuthorAccountId
	}
	return 0
}

func (x *CreateUserMedicalNoteRequest) GetNote() string {
	if x != nil {
		return x.Note
	}
	return ""
}

type DeleteUserMedicalNoteRequest struct {
	state         protoimpl.MessageState
	sizeCache     protoimpl.SizeCache
	unknownFields protoimpl.UnknownFields

	NoteId int32 `protobuf:"varint,1,opt,name=noteId,proto3" json:"noteId,omitempty"`
}

func (x *DeleteUserMedicalNoteRequest) Reset() {
	*x = DeleteUserMedicalNoteRequest{}
	if protoimpl.UnsafeEnabled {
		mi := &file_dta_wed_api_v1_notes_notes_proto_msgTypes[2]
		ms := protoimpl.X.MessageStateOf(protoimpl.Pointer(x))
		ms.StoreMessageInfo(mi)
	}
}

func (x *DeleteUserMedicalNoteRequest) String() string {
	return protoimpl.X.MessageStringOf(x)
}

func (*DeleteUserMedicalNoteRequest) ProtoMessage() {}

func (x *DeleteUserMedicalNoteRequest) ProtoReflect() protoreflect.Message {
	mi := &file_dta_wed_api_v1_notes_notes_proto_msgTypes[2]
	if protoimpl.UnsafeEnabled && x != nil {
		ms := protoimpl.X.MessageStateOf(protoimpl.Pointer(x))
		if ms.LoadMessageInfo() == nil {
			ms.StoreMessageInfo(mi)
		}
		return ms
	}
	return mi.MessageOf(x)
}

// Deprecated: Use DeleteUserMedicalNoteRequest.ProtoReflect.Descriptor instead.
func (*DeleteUserMedicalNoteRequest) Descriptor() ([]byte, []int) {
	return file_dta_wed_api_v1_notes_notes_proto_rawDescGZIP(), []int{2}
}

func (x *DeleteUserMedicalNoteRequest) GetNoteId() int32 {
	if x != nil {
		return x.NoteId
	}
	return 0
}

type GetUserMedicalNotesRequest struct {
	state         protoimpl.MessageState
	sizeCache     protoimpl.SizeCache
	unknownFields protoimpl.UnknownFields

	UserId int32 `protobuf:"varint,1,opt,name=userId,proto3" json:"userId,omitempty"`
	Limit  int32 `protobuf:"varint,2,opt,name=limit,proto3" json:"limit,omitempty"`
	Page   int32 `protobuf:"varint,3,opt,name=page,proto3" json:"page,omitempty"`
}

func (x *GetUserMedicalNotesRequest) Reset() {
	*x = GetUserMedicalNotesRequest{}
	if protoimpl.UnsafeEnabled {
		mi := &file_dta_wed_api_v1_notes_notes_proto_msgTypes[3]
		ms := protoimpl.X.MessageStateOf(protoimpl.Pointer(x))
		ms.StoreMessageInfo(mi)
	}
}

func (x *GetUserMedicalNotesRequest) String() string {
	return protoimpl.X.MessageStringOf(x)
}

func (*GetUserMedicalNotesRequest) ProtoMessage() {}

func (x *GetUserMedicalNotesRequest) ProtoReflect() protoreflect.Message {
	mi := &file_dta_wed_api_v1_notes_notes_proto_msgTypes[3]
	if protoimpl.UnsafeEnabled && x != nil {
		ms := protoimpl.X.MessageStateOf(protoimpl.Pointer(x))
		if ms.LoadMessageInfo() == nil {
			ms.StoreMessageInfo(mi)
		}
		return ms
	}
	return mi.MessageOf(x)
}

// Deprecated: Use GetUserMedicalNotesRequest.ProtoReflect.Descriptor instead.
func (*GetUserMedicalNotesRequest) Descriptor() ([]byte, []int) {
	return file_dta_wed_api_v1_notes_notes_proto_rawDescGZIP(), []int{3}
}

func (x *GetUserMedicalNotesRequest) GetUserId() int32 {
	if x != nil {
		return x.UserId
	}
	return 0
}

func (x *GetUserMedicalNotesRequest) GetLimit() int32 {
	if x != nil {
		return x.Limit
	}
	return 0
}

func (x *GetUserMedicalNotesRequest) GetPage() int32 {
	if x != nil {
		return x.Page
	}
	return 0
}

type GetUserMedicalNotesResponse struct {
	state         protoimpl.MessageState
	sizeCache     protoimpl.SizeCache
	unknownFields protoimpl.UnknownFields

	TotalCount   int32                               `protobuf:"varint,1,opt,name=totalCount,proto3" json:"totalCount,omitempty"`
	Count        int32                               `protobuf:"varint,2,opt,name=count,proto3" json:"count,omitempty"`
	Page         int32                               `protobuf:"varint,3,opt,name=page,proto3" json:"page,omitempty"`
	MedicalNotes []*GetUserMedicalNotesResponse_Note `protobuf:"bytes,4,rep,name=medicalNotes,proto3" json:"medicalNotes,omitempty"`
}

func (x *GetUserMedicalNotesResponse) Reset() {
	*x = GetUserMedicalNotesResponse{}
	if protoimpl.UnsafeEnabled {
		mi := &file_dta_wed_api_v1_notes_notes_proto_msgTypes[4]
		ms := protoimpl.X.MessageStateOf(protoimpl.Pointer(x))
		ms.StoreMessageInfo(mi)
	}
}

func (x *GetUserMedicalNotesResponse) String() string {
	return protoimpl.X.MessageStringOf(x)
}

func (*GetUserMedicalNotesResponse) ProtoMessage() {}

func (x *GetUserMedicalNotesResponse) ProtoReflect() protoreflect.Message {
	mi := &file_dta_wed_api_v1_notes_notes_proto_msgTypes[4]
	if protoimpl.UnsafeEnabled && x != nil {
		ms := protoimpl.X.MessageStateOf(protoimpl.Pointer(x))
		if ms.LoadMessageInfo() == nil {
			ms.StoreMessageInfo(mi)
		}
		return ms
	}
	return mi.MessageOf(x)
}

// Deprecated: Use GetUserMedicalNotesResponse.ProtoReflect.Descriptor instead.
func (*GetUserMedicalNotesResponse) Descriptor() ([]byte, []int) {
	return file_dta_wed_api_v1_notes_notes_proto_rawDescGZIP(), []int{4}
}

func (x *GetUserMedicalNotesResponse) GetTotalCount() int32 {
	if x != nil {
		return x.TotalCount
	}
	return 0
}

func (x *GetUserMedicalNotesResponse) GetCount() int32 {
	if x != nil {
		return x.Count
	}
	return 0
}

func (x *GetUserMedicalNotesResponse) GetPage() int32 {
	if x != nil {
		return x.Page
	}
	return 0
}

func (x *GetUserMedicalNotesResponse) GetMedicalNotes() []*GetUserMedicalNotesResponse_Note {
	if x != nil {
		return x.MedicalNotes
	}
	return nil
}

type UpsertClinicalNoteByUserIdRequest struct {
	state         protoimpl.MessageState
	sizeCache     protoimpl.SizeCache
	unknownFields protoimpl.UnknownFields

	UserId int32  `protobuf:"varint,1,opt,name=userId,proto3" json:"userId,omitempty"`
	Date   string `protobuf:"bytes,2,opt,name=date,proto3" json:"date,omitempty"`
	Note   string `protobuf:"bytes,3,opt,name=note,proto3" json:"note,omitempty"`
}

func (x *UpsertClinicalNoteByUserIdRequest) Reset() {
	*x = UpsertClinicalNoteByUserIdRequest{}
	if protoimpl.UnsafeEnabled {
		mi := &file_dta_wed_api_v1_notes_notes_proto_msgTypes[5]
		ms := protoimpl.X.MessageStateOf(protoimpl.Pointer(x))
		ms.StoreMessageInfo(mi)
	}
}

func (x *UpsertClinicalNoteByUserIdRequest) String() string {
	return protoimpl.X.MessageStringOf(x)
}

func (*UpsertClinicalNoteByUserIdRequest) ProtoMessage() {}

func (x *UpsertClinicalNoteByUserIdRequest) ProtoReflect() protoreflect.Message {
	mi := &file_dta_wed_api_v1_notes_notes_proto_msgTypes[5]
	if protoimpl.UnsafeEnabled && x != nil {
		ms := protoimpl.X.MessageStateOf(protoimpl.Pointer(x))
		if ms.LoadMessageInfo() == nil {
			ms.StoreMessageInfo(mi)
		}
		return ms
	}
	return mi.MessageOf(x)
}

// Deprecated: Use UpsertClinicalNoteByUserIdRequest.ProtoReflect.Descriptor instead.
func (*UpsertClinicalNoteByUserIdRequest) Descriptor() ([]byte, []int) {
	return file_dta_wed_api_v1_notes_notes_proto_rawDescGZIP(), []int{5}
}

func (x *UpsertClinicalNoteByUserIdRequest) GetUserId() int32 {
	if x != nil {
		return x.UserId
	}
	return 0
}

func (x *UpsertClinicalNoteByUserIdRequest) GetDate() string {
	if x != nil {
		return x.Date
	}
	return ""
}

func (x *UpsertClinicalNoteByUserIdRequest) GetNote() string {
	if x != nil {
		return x.Note
	}
	return ""
}

type GetUserMedicalNotesResponse_Note struct {
	state         protoimpl.MessageState
	sizeCache     protoimpl.SizeCache
	unknownFields protoimpl.UnknownFields

	Id              int32  `protobuf:"varint,1,opt,name=id,proto3" json:"id,omitempty"`
	Date            int32  `protobuf:"varint,2,opt,name=date,proto3" json:"date,omitempty"`
	UserId          int32  `protobuf:"varint,3,opt,name=userId,proto3" json:"userId,omitempty"`
	AuthorAccountId int32  `protobuf:"varint,4,opt,name=authorAccountId,proto3" json:"authorAccountId,omitempty"`
	Note            string `protobuf:"bytes,5,opt,name=note,proto3" json:"note,omitempty"`
	CreatedAt       int32  `protobuf:"varint,6,opt,name=createdAt,proto3" json:"createdAt,omitempty"`
	UpdatedAt       int32  `protobuf:"varint,7,opt,name=updatedAt,proto3" json:"updatedAt,omitempty"`
}

func (x *GetUserMedicalNotesResponse_Note) Reset() {
	*x = GetUserMedicalNotesResponse_Note{}
	if protoimpl.UnsafeEnabled {
		mi := &file_dta_wed_api_v1_notes_notes_proto_msgTypes[6]
		ms := protoimpl.X.MessageStateOf(protoimpl.Pointer(x))
		ms.StoreMessageInfo(mi)
	}
}

func (x *GetUserMedicalNotesResponse_Note) String() string {
	return protoimpl.X.MessageStringOf(x)
}

func (*GetUserMedicalNotesResponse_Note) ProtoMessage() {}

func (x *GetUserMedicalNotesResponse_Note) ProtoReflect() protoreflect.Message {
	mi := &file_dta_wed_api_v1_notes_notes_proto_msgTypes[6]
	if protoimpl.UnsafeEnabled && x != nil {
		ms := protoimpl.X.MessageStateOf(protoimpl.Pointer(x))
		if ms.LoadMessageInfo() == nil {
			ms.StoreMessageInfo(mi)
		}
		return ms
	}
	return mi.MessageOf(x)
}

// Deprecated: Use GetUserMedicalNotesResponse_Note.ProtoReflect.Descriptor instead.
func (*GetUserMedicalNotesResponse_Note) Descriptor() ([]byte, []int) {
	return file_dta_wed_api_v1_notes_notes_proto_rawDescGZIP(), []int{4, 0}
}

func (x *GetUserMedicalNotesResponse_Note) GetId() int32 {
	if x != nil {
		return x.Id
	}
	return 0
}

func (x *GetUserMedicalNotesResponse_Note) GetDate() int32 {
	if x != nil {
		return x.Date
	}
	return 0
}

func (x *GetUserMedicalNotesResponse_Note) GetUserId() int32 {
	if x != nil {
		return x.UserId
	}
	return 0
}

func (x *GetUserMedicalNotesResponse_Note) GetAuthorAccountId() int32 {
	if x != nil {
		return x.AuthorAccountId
	}
	return 0
}

func (x *GetUserMedicalNotesResponse_Note) GetNote() string {
	if x != nil {
		return x.Note
	}
	return ""
}

func (x *GetUserMedicalNotesResponse_Note) GetCreatedAt() int32 {
	if x != nil {
		return x.CreatedAt
	}
	return 0
}

func (x *GetUserMedicalNotesResponse_Note) GetUpdatedAt() int32 {
	if x != nil {
		return x.UpdatedAt
	}
	return 0
}

var File_dta_wed_api_v1_notes_notes_proto protoreflect.FileDescriptor

var file_dta_wed_api_v1_notes_notes_proto_rawDesc = []byte{
	0x0a, 0x20, 0x64, 0x74, 0x61, 0x2d, 0x77, 0x65, 0x64, 0x2d, 0x61, 0x70, 0x69, 0x2f, 0x76, 0x31,
	0x2f, 0x6e, 0x6f, 0x74, 0x65, 0x73, 0x2f, 0x6e, 0x6f, 0x74, 0x65, 0x73, 0x2e, 0x70, 0x72, 0x6f,
	0x74, 0x6f, 0x12, 0x14, 0x64, 0x74, 0x61, 0x2e, 0x77, 0x65, 0x64, 0x2e, 0x61, 0x70, 0x69, 0x2e,
	0x76, 0x31, 0x2e, 0x6e, 0x6f, 0x74, 0x65, 0x73, 0x1a, 0x17, 0x76, 0x61, 0x6c, 0x69, 0x64, 0x61,
	0x74, 0x65, 0x2f, 0x76, 0x61, 0x6c, 0x69, 0x64, 0x61, 0x74, 0x65, 0x2e, 0x70, 0x72, 0x6f, 0x74,
	0x6f, 0x1a, 0x1c, 0x67, 0x6f, 0x6f, 0x67, 0x6c, 0x65, 0x2f, 0x61, 0x70, 0x69, 0x2f, 0x61, 0x6e,
	0x6e, 0x6f, 0x74, 0x61, 0x74, 0x69, 0x6f, 0x6e, 0x73, 0x2e, 0x70, 0x72, 0x6f, 0x74, 0x6f, 0x1a,
	0x1b, 0x67, 0x6f, 0x6f, 0x67, 0x6c, 0x65, 0x2f, 0x70, 0x72, 0x6f, 0x74, 0x6f, 0x62, 0x75, 0x66,
	0x2f, 0x65, 0x6d, 0x70, 0x74, 0x79, 0x2e, 0x70, 0x72, 0x6f, 0x74, 0x6f, 0x22, 0x9d, 0x01, 0x0a,
	0x1c, 0x55, 0x70, 0x73, 0x65, 0x72, 0x74, 0x4e, 0x6f, 0x74, 0x65, 0x42, 0x79, 0x55, 0x73, 0x65,
	0x72, 0x56, 0x69, 0x73, 0x69, 0x74, 0x52, 0x65, 0x71, 0x75, 0x65, 0x73, 0x74, 0x12, 0x21, 0x0a,
	0x07, 0x76, 0x69, 0x73, 0x69, 0x74, 0x49, 0x64, 0x18, 0x01, 0x20, 0x01, 0x28, 0x05, 0x42, 0x07,
	0xfa, 0x42, 0x04, 0x1a, 0x02, 0x20, 0x00, 0x52, 0x07, 0x76, 0x69, 0x73, 0x69, 0x74, 0x49, 0x64,
	0x12, 0x1f, 0x0a, 0x06, 0x75, 0x73, 0x65, 0x72, 0x49, 0x64, 0x18, 0x02, 0x20, 0x01, 0x28, 0x05,
	0x42, 0x07, 0xfa, 0x42, 0x04, 0x1a, 0x02, 0x20, 0x00, 0x52, 0x06, 0x75, 0x73, 0x65, 0x72, 0x49,
	0x64, 0x12, 0x25, 0x0a, 0x09, 0x61, 0x63, 0x63, 0x6f, 0x75, 0x6e, 0x74, 0x49, 0x64, 0x18, 0x03,
	0x20, 0x01, 0x28, 0x05, 0x42, 0x07, 0xfa, 0x42, 0x04, 0x1a, 0x02, 0x20, 0x00, 0x52, 0x09, 0x61,
	0x63, 0x63, 0x6f, 0x75, 0x6e, 0x74, 0x49, 0x64, 0x12, 0x12, 0x0a, 0x04, 0x6e, 0x6f, 0x74, 0x65,
	0x18, 0x04, 0x20, 0x01, 0x28, 0x09, 0x52, 0x04, 0x6e, 0x6f, 0x74, 0x65, 0x22, 0x86, 0x01, 0x0a,
	0x1c, 0x43, 0x72, 0x65, 0x61, 0x74, 0x65, 0x55, 0x73, 0x65, 0x72, 0x4d, 0x65, 0x64, 0x69, 0x63,
	0x61, 0x6c, 0x4e, 0x6f, 0x74, 0x65, 0x52, 0x65, 0x71, 0x75, 0x65, 0x73, 0x74, 0x12, 0x1f, 0x0a,
	0x06, 0x75, 0x73, 0x65, 0x72, 0x49, 0x64, 0x18, 0x01, 0x20, 0x01, 0x28, 0x05, 0x42, 0x07, 0xfa,
	0x42, 0x04, 0x1a, 0x02, 0x20, 0x00, 0x52, 0x06, 0x75, 0x73, 0x65, 0x72, 0x49, 0x64, 0x12, 0x31,
	0x0a, 0x0f, 0x61, 0x75, 0x74, 0x68, 0x6f, 0x72, 0x41, 0x63, 0x63, 0x6f, 0x75, 0x6e, 0x74, 0x49,
	0x64, 0x18, 0x02, 0x20, 0x01, 0x28, 0x05, 0x42, 0x07, 0xfa, 0x42, 0x04, 0x1a, 0x02, 0x20, 0x00,
	0x52, 0x0f, 0x61, 0x75, 0x74, 0x68, 0x6f, 0x72, 0x41, 0x63, 0x63, 0x6f, 0x75, 0x6e, 0x74, 0x49,
	0x64, 0x12, 0x12, 0x0a, 0x04, 0x6e, 0x6f, 0x74, 0x65, 0x18, 0x03, 0x20, 0x01, 0x28, 0x09, 0x52,
	0x04, 0x6e, 0x6f, 0x74, 0x65, 0x22, 0x3f, 0x0a, 0x1c, 0x44, 0x65, 0x6c, 0x65, 0x74, 0x65, 0x55,
	0x73, 0x65, 0x72, 0x4d, 0x65, 0x64, 0x69, 0x63, 0x61, 0x6c, 0x4e, 0x6f, 0x74, 0x65, 0x52, 0x65,
	0x71, 0x75, 0x65, 0x73, 0x74, 0x12, 0x1f, 0x0a, 0x06, 0x6e, 0x6f, 0x74, 0x65, 0x49, 0x64, 0x18,
	0x01, 0x20, 0x01, 0x28, 0x05, 0x42, 0x07, 0xfa, 0x42, 0x04, 0x1a, 0x02, 0x20, 0x00, 0x52, 0x06,
	0x6e, 0x6f, 0x74, 0x65, 0x49, 0x64, 0x22, 0x67, 0x0a, 0x1a, 0x47, 0x65, 0x74, 0x55, 0x73, 0x65,
	0x72, 0x4d, 0x65, 0x64, 0x69, 0x63, 0x61, 0x6c, 0x4e, 0x6f, 0x74, 0x65, 0x73, 0x52, 0x65, 0x71,
	0x75, 0x65, 0x73, 0x74, 0x12, 0x1f, 0x0a, 0x06, 0x75, 0x73, 0x65, 0x72, 0x49, 0x64, 0x18, 0x01,
	0x20, 0x01, 0x28, 0x05, 0x42, 0x07, 0xfa, 0x42, 0x04, 0x1a, 0x02, 0x20, 0x00, 0x52, 0x06, 0x75,
	0x73, 0x65, 0x72, 0x49, 0x64, 0x12, 0x14, 0x0a, 0x05, 0x6c, 0x69, 0x6d, 0x69, 0x74, 0x18, 0x02,
	0x20, 0x01, 0x28, 0x05, 0x52, 0x05, 0x6c, 0x69, 0x6d, 0x69, 0x74, 0x12, 0x12, 0x0a, 0x04, 0x70,
	0x61, 0x67, 0x65, 0x18, 0x03, 0x20, 0x01, 0x28, 0x05, 0x52, 0x04, 0x70, 0x61, 0x67, 0x65, 0x22,
	0x82, 0x03, 0x0a, 0x1b, 0x47, 0x65, 0x74, 0x55, 0x73, 0x65, 0x72, 0x4d, 0x65, 0x64, 0x69, 0x63,
	0x61, 0x6c, 0x4e, 0x6f, 0x74, 0x65, 0x73, 0x52, 0x65, 0x73, 0x70, 0x6f, 0x6e, 0x73, 0x65, 0x12,
	0x1e, 0x0a, 0x0a, 0x74, 0x6f, 0x74, 0x61, 0x6c, 0x43, 0x6f, 0x75, 0x6e, 0x74, 0x18, 0x01, 0x20,
	0x01, 0x28, 0x05, 0x52, 0x0a, 0x74, 0x6f, 0x74, 0x61, 0x6c, 0x43, 0x6f, 0x75, 0x6e, 0x74, 0x12,
	0x14, 0x0a, 0x05, 0x63, 0x6f, 0x75, 0x6e, 0x74, 0x18, 0x02, 0x20, 0x01, 0x28, 0x05, 0x52, 0x05,
	0x63, 0x6f, 0x75, 0x6e, 0x74, 0x12, 0x12, 0x0a, 0x04, 0x70, 0x61, 0x67, 0x65, 0x18, 0x03, 0x20,
	0x01, 0x28, 0x05, 0x52, 0x04, 0x70, 0x61, 0x67, 0x65, 0x12, 0x5a, 0x0a, 0x0c, 0x6d, 0x65, 0x64,
	0x69, 0x63, 0x61, 0x6c, 0x4e, 0x6f, 0x74, 0x65, 0x73, 0x18, 0x04, 0x20, 0x03, 0x28, 0x0b, 0x32,
	0x36, 0x2e, 0x64, 0x74, 0x61, 0x2e, 0x77, 0x65, 0x64, 0x2e, 0x61, 0x70, 0x69, 0x2e, 0x76, 0x31,
	0x2e, 0x6e, 0x6f, 0x74, 0x65, 0x73, 0x2e, 0x47, 0x65, 0x74, 0x55, 0x73, 0x65, 0x72, 0x4d, 0x65,
	0x64, 0x69, 0x63, 0x61, 0x6c, 0x4e, 0x6f, 0x74, 0x65, 0x73, 0x52, 0x65, 0x73, 0x70, 0x6f, 0x6e,
	0x73, 0x65, 0x2e, 0x4e, 0x6f, 0x74, 0x65, 0x52, 0x0c, 0x6d, 0x65, 0x64, 0x69, 0x63, 0x61, 0x6c,
	0x4e, 0x6f, 0x74, 0x65, 0x73, 0x1a, 0xbc, 0x01, 0x0a, 0x04, 0x4e, 0x6f, 0x74, 0x65, 0x12, 0x0e,
	0x0a, 0x02, 0x69, 0x64, 0x18, 0x01, 0x20, 0x01, 0x28, 0x05, 0x52, 0x02, 0x69, 0x64, 0x12, 0x12,
	0x0a, 0x04, 0x64, 0x61, 0x74, 0x65, 0x18, 0x02, 0x20, 0x01, 0x28, 0x05, 0x52, 0x04, 0x64, 0x61,
	0x74, 0x65, 0x12, 0x16, 0x0a, 0x06, 0x75, 0x73, 0x65, 0x72, 0x49, 0x64, 0x18, 0x03, 0x20, 0x01,
	0x28, 0x05, 0x52, 0x06, 0x75, 0x73, 0x65, 0x72, 0x49, 0x64, 0x12, 0x28, 0x0a, 0x0f, 0x61, 0x75,
	0x74, 0x68, 0x6f, 0x72, 0x41, 0x63, 0x63, 0x6f, 0x75, 0x6e, 0x74, 0x49, 0x64, 0x18, 0x04, 0x20,
	0x01, 0x28, 0x05, 0x52, 0x0f, 0x61, 0x75, 0x74, 0x68, 0x6f, 0x72, 0x41, 0x63, 0x63, 0x6f, 0x75,
	0x6e, 0x74, 0x49, 0x64, 0x12, 0x12, 0x0a, 0x04, 0x6e, 0x6f, 0x74, 0x65, 0x18, 0x05, 0x20, 0x01,
	0x28, 0x09, 0x52, 0x04, 0x6e, 0x6f, 0x74, 0x65, 0x12, 0x1c, 0x0a, 0x09, 0x63, 0x72, 0x65, 0x61,
	0x74, 0x65, 0x64, 0x41, 0x74, 0x18, 0x06, 0x20, 0x01, 0x28, 0x05, 0x52, 0x09, 0x63, 0x72, 0x65,
	0x61, 0x74, 0x65, 0x64, 0x41, 0x74, 0x12, 0x1c, 0x0a, 0x09, 0x75, 0x70, 0x64, 0x61, 0x74, 0x65,
	0x64, 0x41, 0x74, 0x18, 0x07, 0x20, 0x01, 0x28, 0x05, 0x52, 0x09, 0x75, 0x70, 0x64, 0x61, 0x74,
	0x65, 0x64, 0x41, 0x74, 0x22, 0x88, 0x01, 0x0a, 0x21, 0x55, 0x70, 0x73, 0x65, 0x72, 0x74, 0x43,
	0x6c, 0x69, 0x6e, 0x69, 0x63, 0x61, 0x6c, 0x4e, 0x6f, 0x74, 0x65, 0x42, 0x79, 0x55, 0x73, 0x65,
	0x72, 0x49, 0x64, 0x52, 0x65, 0x71, 0x75, 0x65, 0x73, 0x74, 0x12, 0x1f, 0x0a, 0x06, 0x75, 0x73,
	0x65, 0x72, 0x49, 0x64, 0x18, 0x01, 0x20, 0x01, 0x28, 0x05, 0x42, 0x07, 0xfa, 0x42, 0x04, 0x1a,
	0x02, 0x20, 0x00, 0x52, 0x06, 0x75, 0x73, 0x65, 0x72, 0x49, 0x64, 0x12, 0x2e, 0x0a, 0x04, 0x64,
	0x61, 0x74, 0x65, 0x18, 0x02, 0x20, 0x01, 0x28, 0x09, 0x42, 0x1a, 0xfa, 0x42, 0x17, 0x72, 0x15,
	0x32, 0x13, 0x5e, 0x5c, 0x64, 0x7b, 0x34, 0x7d, 0x2d, 0x5c, 0x64, 0x7b, 0x32, 0x7d, 0x2d, 0x5c,
	0x64, 0x7b, 0x32, 0x7d, 0x24, 0x52, 0x04, 0x64, 0x61, 0x74, 0x65, 0x12, 0x12, 0x0a, 0x04, 0x6e,
	0x6f, 0x74, 0x65, 0x18, 0x03, 0x20, 0x01, 0x28, 0x09, 0x52, 0x04, 0x6e, 0x6f, 0x74, 0x65, 0x32,
	0x85, 0x06, 0x0a, 0x09, 0x4e, 0x6f, 0x74, 0x65, 0x73, 0x44, 0x61, 0x74, 0x61, 0x12, 0x99, 0x01,
	0x0a, 0x15, 0x55, 0x70, 0x73, 0x65, 0x72, 0x74, 0x4e, 0x6f, 0x74, 0x65, 0x42, 0x79, 0x55, 0x73,
	0x65, 0x72, 0x56, 0x69, 0x73, 0x69, 0x74, 0x12, 0x32, 0x2e, 0x64, 0x74, 0x61, 0x2e, 0x77, 0x65,
	0x64, 0x2e, 0x61, 0x70, 0x69, 0x2e, 0x76, 0x31, 0x2e, 0x6e, 0x6f, 0x74, 0x65, 0x73, 0x2e, 0x55,
	0x70, 0x73, 0x65, 0x72, 0x74, 0x4e, 0x6f, 0x74, 0x65, 0x42, 0x79, 0x55, 0x73, 0x65, 0x72, 0x56,
	0x69, 0x73, 0x69, 0x74, 0x52, 0x65, 0x71, 0x75, 0x65, 0x73, 0x74, 0x1a, 0x16, 0x2e, 0x67, 0x6f,
	0x6f, 0x67, 0x6c, 0x65, 0x2e, 0x70, 0x72, 0x6f, 0x74, 0x6f, 0x62, 0x75, 0x66, 0x2e, 0x45, 0x6d,
	0x70, 0x74, 0x79, 0x22, 0x34, 0x82, 0xd3, 0xe4, 0x93, 0x02, 0x2e, 0x1a, 0x29, 0x2f, 0x76, 0x31,
	0x2f, 0x6e, 0x6f, 0x74, 0x65, 0x73, 0x2f, 0x76, 0x69, 0x73, 0x69, 0x74, 0x73, 0x2f, 0x7b, 0x76,
	0x69, 0x73, 0x69, 0x74, 0x49, 0x64, 0x7d, 0x2f, 0x75, 0x73, 0x65, 0x72, 0x73, 0x2f, 0x7b, 0x75,
	0x73, 0x65, 0x72, 0x49, 0x64, 0x7d, 0x3a, 0x01, 0x2a, 0x12, 0x8f, 0x01, 0x0a, 0x15, 0x43, 0x72,
	0x65, 0x61, 0x74, 0x65, 0x55, 0x73, 0x65, 0x72, 0x4d, 0x65, 0x64, 0x69, 0x63, 0x61, 0x6c, 0x4e,
	0x6f, 0x74, 0x65, 0x12, 0x32, 0x2e, 0x64, 0x74, 0x61, 0x2e, 0x77, 0x65, 0x64, 0x2e, 0x61, 0x70,
	0x69, 0x2e, 0x76, 0x31, 0x2e, 0x6e, 0x6f, 0x74, 0x65, 0x73, 0x2e, 0x43, 0x72, 0x65, 0x61, 0x74,
	0x65, 0x55, 0x73, 0x65, 0x72, 0x4d, 0x65, 0x64, 0x69, 0x63, 0x61, 0x6c, 0x4e, 0x6f, 0x74, 0x65,
	0x52, 0x65, 0x71, 0x75, 0x65, 0x73, 0x74, 0x1a, 0x16, 0x2e, 0x67, 0x6f, 0x6f, 0x67, 0x6c, 0x65,
	0x2e, 0x70, 0x72, 0x6f, 0x74, 0x6f, 0x62, 0x75, 0x66, 0x2e, 0x45, 0x6d, 0x70, 0x74, 0x79, 0x22,
	0x2a, 0x82, 0xd3, 0xe4, 0x93, 0x02, 0x24, 0x22, 0x1f, 0x2f, 0x76, 0x31, 0x2f, 0x6d, 0x65, 0x64,
	0x69, 0x63, 0x61, 0x6c, 0x4e, 0x6f, 0x74, 0x65, 0x73, 0x2f, 0x75, 0x73, 0x65, 0x72, 0x73, 0x2f,
	0x7b, 0x75, 0x73, 0x65, 0x72, 0x49, 0x64, 0x7d, 0x3a, 0x01, 0x2a, 0x12, 0xa3, 0x01, 0x0a, 0x13,
	0x47, 0x65, 0x74, 0x55, 0x73, 0x65, 0x72, 0x4d, 0x65, 0x64, 0x69, 0x63, 0x61, 0x6c, 0x4e, 0x6f,
	0x74, 0x65, 0x73, 0x12, 0x30, 0x2e, 0x64, 0x74, 0x61, 0x2e, 0x77, 0x65, 0x64, 0x2e, 0x61, 0x70,
	0x69, 0x2e, 0x76, 0x31, 0x2e, 0x6e, 0x6f, 0x74, 0x65, 0x73, 0x2e, 0x47, 0x65, 0x74, 0x55, 0x73,
	0x65, 0x72, 0x4d, 0x65, 0x64, 0x69, 0x63, 0x61, 0x6c, 0x4e, 0x6f, 0x74, 0x65, 0x73, 0x52, 0x65,
	0x71, 0x75, 0x65, 0x73, 0x74, 0x1a, 0x31, 0x2e, 0x64, 0x74, 0x61, 0x2e, 0x77, 0x65, 0x64, 0x2e,
	0x61, 0x70, 0x69, 0x2e, 0x76, 0x31, 0x2e, 0x6e, 0x6f, 0x74, 0x65, 0x73, 0x2e, 0x47, 0x65, 0x74,
	0x55, 0x73, 0x65, 0x72, 0x4d, 0x65, 0x64, 0x69, 0x63, 0x61, 0x6c, 0x4e, 0x6f, 0x74, 0x65, 0x73,
	0x52, 0x65, 0x73, 0x70, 0x6f, 0x6e, 0x73, 0x65, 0x22, 0x27, 0x82, 0xd3, 0xe4, 0x93, 0x02, 0x21,
	0x12, 0x1f, 0x2f, 0x76, 0x31, 0x2f, 0x6d, 0x65, 0x64, 0x69, 0x63, 0x61, 0x6c, 0x4e, 0x6f, 0x74,
	0x65, 0x73, 0x2f, 0x75, 0x73, 0x65, 0x72, 0x73, 0x2f, 0x7b, 0x75, 0x73, 0x65, 0x72, 0x49, 0x64,
	0x7d, 0x12, 0x86, 0x01, 0x0a, 0x15, 0x44, 0x65, 0x6c, 0x65, 0x74, 0x65, 0x55, 0x73, 0x65, 0x72,
	0x4d, 0x65, 0x64, 0x69, 0x63, 0x61, 0x6c, 0x4e, 0x6f, 0x74, 0x65, 0x12, 0x32, 0x2e, 0x64, 0x74,
	0x61, 0x2e, 0x77, 0x65, 0x64, 0x2e, 0x61, 0x70, 0x69, 0x2e, 0x76, 0x31, 0x2e, 0x6e, 0x6f, 0x74,
	0x65, 0x73, 0x2e, 0x44, 0x65, 0x6c, 0x65, 0x74, 0x65, 0x55, 0x73, 0x65, 0x72, 0x4d, 0x65, 0x64,
	0x69, 0x63, 0x61, 0x6c, 0x4e, 0x6f, 0x74, 0x65, 0x52, 0x65, 0x71, 0x75, 0x65, 0x73, 0x74, 0x1a,
	0x16, 0x2e, 0x67, 0x6f, 0x6f, 0x67, 0x6c, 0x65, 0x2e, 0x70, 0x72, 0x6f, 0x74, 0x6f, 0x62, 0x75,
	0x66, 0x2e, 0x45, 0x6d, 0x70, 0x74, 0x79, 0x22, 0x21, 0x82, 0xd3, 0xe4, 0x93, 0x02, 0x1b, 0x2a,
	0x19, 0x2f, 0x76, 0x31, 0x2f, 0x6d, 0x65, 0x64, 0x69, 0x63, 0x61, 0x6c, 0x4e, 0x6f, 0x74, 0x65,
	0x73, 0x2f, 0x7b, 0x6e, 0x6f, 0x74, 0x65, 0x49, 0x64, 0x7d, 0x12, 0x9a, 0x01, 0x0a, 0x1a, 0x55,
	0x70, 0x73, 0x65, 0x72, 0x74, 0x43, 0x6c, 0x69, 0x6e, 0x69, 0x63, 0x61, 0x6c, 0x4e, 0x6f, 0x74,
	0x65, 0x42, 0x79, 0x55, 0x73, 0x65, 0x72, 0x49, 0x64, 0x12, 0x37, 0x2e, 0x64, 0x74, 0x61, 0x2e,
	0x77, 0x65, 0x64, 0x2e, 0x61, 0x70, 0x69, 0x2e, 0x76, 0x31, 0x2e, 0x6e, 0x6f, 0x74, 0x65, 0x73,
	0x2e, 0x55, 0x70, 0x73, 0x65, 0x72, 0x74, 0x43, 0x6c, 0x69, 0x6e, 0x69, 0x63, 0x61, 0x6c, 0x4e,
	0x6f, 0x74, 0x65, 0x42, 0x79, 0x55, 0x73, 0x65, 0x72, 0x49, 0x64, 0x52, 0x65, 0x71, 0x75, 0x65,
	0x73, 0x74, 0x1a, 0x16, 0x2e, 0x67, 0x6f, 0x6f, 0x67, 0x6c, 0x65, 0x2e, 0x70, 0x72, 0x6f, 0x74,
	0x6f, 0x62, 0x75, 0x66, 0x2e, 0x45, 0x6d, 0x70, 0x74, 0x79, 0x22, 0x2b, 0x82, 0xd3, 0xe4, 0x93,
	0x02, 0x25, 0x1a, 0x20, 0x2f, 0x76, 0x31, 0x2f, 0x63, 0x6c, 0x69, 0x6e, 0x69, 0x63, 0x61, 0x6c,
	0x4e, 0x6f, 0x74, 0x65, 0x73, 0x2f, 0x75, 0x73, 0x65, 0x72, 0x73, 0x2f, 0x7b, 0x75, 0x73, 0x65,
	0x72, 0x49, 0x64, 0x7d, 0x3a, 0x01, 0x2a, 0x42, 0x45, 0x5a, 0x43, 0x67, 0x69, 0x74, 0x68, 0x75,
	0x62, 0x2e, 0x63, 0x6f, 0x6d, 0x2f, 0x77, 0x65, 0x6c, 0x74, 0x63, 0x6f, 0x72, 0x70, 0x2f, 0x64,
	0x74, 0x61, 0x2d, 0x77, 0x65, 0x64, 0x2d, 0x61, 0x70, 0x69, 0x2f, 0x69, 0x6e, 0x74, 0x65, 0x72,
	0x6e, 0x61, 0x6c, 0x2f, 0x70, 0x72, 0x6f, 0x74, 0x6f, 0x2f, 0x64, 0x74, 0x61, 0x2d, 0x77, 0x65,
	0x64, 0x2d, 0x61, 0x70, 0x69, 0x2f, 0x76, 0x31, 0x2f, 0x6e, 0x6f, 0x74, 0x65, 0x73, 0x62, 0x06,
	0x70, 0x72, 0x6f, 0x74, 0x6f, 0x33,
}

var (
	file_dta_wed_api_v1_notes_notes_proto_rawDescOnce sync.Once
	file_dta_wed_api_v1_notes_notes_proto_rawDescData = file_dta_wed_api_v1_notes_notes_proto_rawDesc
)

func file_dta_wed_api_v1_notes_notes_proto_rawDescGZIP() []byte {
	file_dta_wed_api_v1_notes_notes_proto_rawDescOnce.Do(func() {
		file_dta_wed_api_v1_notes_notes_proto_rawDescData = protoimpl.X.CompressGZIP(file_dta_wed_api_v1_notes_notes_proto_rawDescData)
	})
	return file_dta_wed_api_v1_notes_notes_proto_rawDescData
}

var file_dta_wed_api_v1_notes_notes_proto_msgTypes = make([]protoimpl.MessageInfo, 7)
var file_dta_wed_api_v1_notes_notes_proto_goTypes = []interface{}{
	(*UpsertNoteByUserVisitRequest)(nil),      // 0: dta.wed.api.v1.notes.UpsertNoteByUserVisitRequest
	(*CreateUserMedicalNoteRequest)(nil),      // 1: dta.wed.api.v1.notes.CreateUserMedicalNoteRequest
	(*DeleteUserMedicalNoteRequest)(nil),      // 2: dta.wed.api.v1.notes.DeleteUserMedicalNoteRequest
	(*GetUserMedicalNotesRequest)(nil),        // 3: dta.wed.api.v1.notes.GetUserMedicalNotesRequest
	(*GetUserMedicalNotesResponse)(nil),       // 4: dta.wed.api.v1.notes.GetUserMedicalNotesResponse
	(*UpsertClinicalNoteByUserIdRequest)(nil), // 5: dta.wed.api.v1.notes.UpsertClinicalNoteByUserIdRequest
	(*GetUserMedicalNotesResponse_Note)(nil),  // 6: dta.wed.api.v1.notes.GetUserMedicalNotesResponse.Note
	(*emptypb.Empty)(nil),                     // 7: google.protobuf.Empty
}
var file_dta_wed_api_v1_notes_notes_proto_depIdxs = []int32{
	6, // 0: dta.wed.api.v1.notes.GetUserMedicalNotesResponse.medicalNotes:type_name -> dta.wed.api.v1.notes.GetUserMedicalNotesResponse.Note
	0, // 1: dta.wed.api.v1.notes.NotesData.UpsertNoteByUserVisit:input_type -> dta.wed.api.v1.notes.UpsertNoteByUserVisitRequest
	1, // 2: dta.wed.api.v1.notes.NotesData.CreateUserMedicalNote:input_type -> dta.wed.api.v1.notes.CreateUserMedicalNoteRequest
	3, // 3: dta.wed.api.v1.notes.NotesData.GetUserMedicalNotes:input_type -> dta.wed.api.v1.notes.GetUserMedicalNotesRequest
	2, // 4: dta.wed.api.v1.notes.NotesData.DeleteUserMedicalNote:input_type -> dta.wed.api.v1.notes.DeleteUserMedicalNoteRequest
	5, // 5: dta.wed.api.v1.notes.NotesData.UpsertClinicalNoteByUserId:input_type -> dta.wed.api.v1.notes.UpsertClinicalNoteByUserIdRequest
	7, // 6: dta.wed.api.v1.notes.NotesData.UpsertNoteByUserVisit:output_type -> google.protobuf.Empty
	7, // 7: dta.wed.api.v1.notes.NotesData.CreateUserMedicalNote:output_type -> google.protobuf.Empty
	4, // 8: dta.wed.api.v1.notes.NotesData.GetUserMedicalNotes:output_type -> dta.wed.api.v1.notes.GetUserMedicalNotesResponse
	7, // 9: dta.wed.api.v1.notes.NotesData.DeleteUserMedicalNote:output_type -> google.protobuf.Empty
	7, // 10: dta.wed.api.v1.notes.NotesData.UpsertClinicalNoteByUserId:output_type -> google.protobuf.Empty
	6, // [6:11] is the sub-list for method output_type
	1, // [1:6] is the sub-list for method input_type
	1, // [1:1] is the sub-list for extension type_name
	1, // [1:1] is the sub-list for extension extendee
	0, // [0:1] is the sub-list for field type_name
}

func init() { file_dta_wed_api_v1_notes_notes_proto_init() }
func file_dta_wed_api_v1_notes_notes_proto_init() {
	if File_dta_wed_api_v1_notes_notes_proto != nil {
		return
	}
	if !protoimpl.UnsafeEnabled {
		file_dta_wed_api_v1_notes_notes_proto_msgTypes[0].Exporter = func(v interface{}, i int) interface{} {
			switch v := v.(*UpsertNoteByUserVisitRequest); i {
			case 0:
				return &v.state
			case 1:
				return &v.sizeCache
			case 2:
				return &v.unknownFields
			default:
				return nil
			}
		}
		file_dta_wed_api_v1_notes_notes_proto_msgTypes[1].Exporter = func(v interface{}, i int) interface{} {
			switch v := v.(*CreateUserMedicalNoteRequest); i {
			case 0:
				return &v.state
			case 1:
				return &v.sizeCache
			case 2:
				return &v.unknownFields
			default:
				return nil
			}
		}
		file_dta_wed_api_v1_notes_notes_proto_msgTypes[2].Exporter = func(v interface{}, i int) interface{} {
			switch v := v.(*DeleteUserMedicalNoteRequest); i {
			case 0:
				return &v.state
			case 1:
				return &v.sizeCache
			case 2:
				return &v.unknownFields
			default:
				return nil
			}
		}
		file_dta_wed_api_v1_notes_notes_proto_msgTypes[3].Exporter = func(v interface{}, i int) interface{} {
			switch v := v.(*GetUserMedicalNotesRequest); i {
			case 0:
				return &v.state
			case 1:
				return &v.sizeCache
			case 2:
				return &v.unknownFields
			default:
				return nil
			}
		}
		file_dta_wed_api_v1_notes_notes_proto_msgTypes[4].Exporter = func(v interface{}, i int) interface{} {
			switch v := v.(*GetUserMedicalNotesResponse); i {
			case 0:
				return &v.state
			case 1:
				return &v.sizeCache
			case 2:
				return &v.unknownFields
			default:
				return nil
			}
		}
		file_dta_wed_api_v1_notes_notes_proto_msgTypes[5].Exporter = func(v interface{}, i int) interface{} {
			switch v := v.(*UpsertClinicalNoteByUserIdRequest); i {
			case 0:
				return &v.state
			case 1:
				return &v.sizeCache
			case 2:
				return &v.unknownFields
			default:
				return nil
			}
		}
		file_dta_wed_api_v1_notes_notes_proto_msgTypes[6].Exporter = func(v interface{}, i int) interface{} {
			switch v := v.(*GetUserMedicalNotesResponse_Note); i {
			case 0:
				return &v.state
			case 1:
				return &v.sizeCache
			case 2:
				return &v.unknownFields
			default:
				return nil
			}
		}
	}
	type x struct{}
	out := protoimpl.TypeBuilder{
		File: protoimpl.DescBuilder{
			GoPackagePath: reflect.TypeOf(x{}).PkgPath(),
			RawDescriptor: file_dta_wed_api_v1_notes_notes_proto_rawDesc,
			NumEnums:      0,
			NumMessages:   7,
			NumExtensions: 0,
			NumServices:   1,
		},
		GoTypes:           file_dta_wed_api_v1_notes_notes_proto_goTypes,
		DependencyIndexes: file_dta_wed_api_v1_notes_notes_proto_depIdxs,
		MessageInfos:      file_dta_wed_api_v1_notes_notes_proto_msgTypes,
	}.Build()
	File_dta_wed_api_v1_notes_notes_proto = out.File
	file_dta_wed_api_v1_notes_notes_proto_rawDesc = nil
	file_dta_wed_api_v1_notes_notes_proto_goTypes = nil
	file_dta_wed_api_v1_notes_notes_proto_depIdxs = nil
}
