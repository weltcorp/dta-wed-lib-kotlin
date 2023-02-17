// Code generated by protoc-gen-go-grpc. DO NOT EDIT.
// versions:
// - protoc-gen-go-grpc v1.2.0
// - protoc             v3.21.12
// source: dta-wed-api/v1/notes/notes.proto

package notes

import (
	context "context"
	grpc "google.golang.org/grpc"
	codes "google.golang.org/grpc/codes"
	status "google.golang.org/grpc/status"
	emptypb "google.golang.org/protobuf/types/known/emptypb"
)

// This is a compile-time assertion to ensure that this generated file
// is compatible with the grpc package it is being compiled against.
// Requires gRPC-Go v1.32.0 or later.
const _ = grpc.SupportPackageIsVersion7

// NotesDataClient is the client API for NotesData service.
//
// For semantics around ctx use and closing/ending streaming RPCs, please refer to https://pkg.go.dev/google.golang.org/grpc/?tab=doc#ClientConn.NewStream.
type NotesDataClient interface {
	UpsertNoteByUserVisit(ctx context.Context, in *UpsertNoteByUserVisitRequest, opts ...grpc.CallOption) (*emptypb.Empty, error)
	CreateUserMedicalNote(ctx context.Context, in *CreateUserMedicalNoteRequest, opts ...grpc.CallOption) (*emptypb.Empty, error)
	GetUserMedicalNotes(ctx context.Context, in *GetUserMedicalNotesRequest, opts ...grpc.CallOption) (*GetUserMedicalNotesResponse, error)
	DeleteUserMedicalNote(ctx context.Context, in *DeleteUserMedicalNoteRequest, opts ...grpc.CallOption) (*emptypb.Empty, error)
	UpsertClinicalNoteByUserId(ctx context.Context, in *UpsertClinicalNoteByUserIdRequest, opts ...grpc.CallOption) (*emptypb.Empty, error)
}

type notesDataClient struct {
	cc grpc.ClientConnInterface
}

func NewNotesDataClient(cc grpc.ClientConnInterface) NotesDataClient {
	return &notesDataClient{cc}
}

func (c *notesDataClient) UpsertNoteByUserVisit(ctx context.Context, in *UpsertNoteByUserVisitRequest, opts ...grpc.CallOption) (*emptypb.Empty, error) {
	out := new(emptypb.Empty)
	err := c.cc.Invoke(ctx, "/dta.wed.api.v1.notes.NotesData/UpsertNoteByUserVisit", in, out, opts...)
	if err != nil {
		return nil, err
	}
	return out, nil
}

func (c *notesDataClient) CreateUserMedicalNote(ctx context.Context, in *CreateUserMedicalNoteRequest, opts ...grpc.CallOption) (*emptypb.Empty, error) {
	out := new(emptypb.Empty)
	err := c.cc.Invoke(ctx, "/dta.wed.api.v1.notes.NotesData/CreateUserMedicalNote", in, out, opts...)
	if err != nil {
		return nil, err
	}
	return out, nil
}

func (c *notesDataClient) GetUserMedicalNotes(ctx context.Context, in *GetUserMedicalNotesRequest, opts ...grpc.CallOption) (*GetUserMedicalNotesResponse, error) {
	out := new(GetUserMedicalNotesResponse)
	err := c.cc.Invoke(ctx, "/dta.wed.api.v1.notes.NotesData/GetUserMedicalNotes", in, out, opts...)
	if err != nil {
		return nil, err
	}
	return out, nil
}

func (c *notesDataClient) DeleteUserMedicalNote(ctx context.Context, in *DeleteUserMedicalNoteRequest, opts ...grpc.CallOption) (*emptypb.Empty, error) {
	out := new(emptypb.Empty)
	err := c.cc.Invoke(ctx, "/dta.wed.api.v1.notes.NotesData/DeleteUserMedicalNote", in, out, opts...)
	if err != nil {
		return nil, err
	}
	return out, nil
}

func (c *notesDataClient) UpsertClinicalNoteByUserId(ctx context.Context, in *UpsertClinicalNoteByUserIdRequest, opts ...grpc.CallOption) (*emptypb.Empty, error) {
	out := new(emptypb.Empty)
	err := c.cc.Invoke(ctx, "/dta.wed.api.v1.notes.NotesData/UpsertClinicalNoteByUserId", in, out, opts...)
	if err != nil {
		return nil, err
	}
	return out, nil
}

// NotesDataServer is the server API for NotesData service.
// All implementations must embed UnimplementedNotesDataServer
// for forward compatibility
type NotesDataServer interface {
	UpsertNoteByUserVisit(context.Context, *UpsertNoteByUserVisitRequest) (*emptypb.Empty, error)
	CreateUserMedicalNote(context.Context, *CreateUserMedicalNoteRequest) (*emptypb.Empty, error)
	GetUserMedicalNotes(context.Context, *GetUserMedicalNotesRequest) (*GetUserMedicalNotesResponse, error)
	DeleteUserMedicalNote(context.Context, *DeleteUserMedicalNoteRequest) (*emptypb.Empty, error)
	UpsertClinicalNoteByUserId(context.Context, *UpsertClinicalNoteByUserIdRequest) (*emptypb.Empty, error)
	mustEmbedUnimplementedNotesDataServer()
}

// UnimplementedNotesDataServer must be embedded to have forward compatible implementations.
type UnimplementedNotesDataServer struct {
}

func (UnimplementedNotesDataServer) UpsertNoteByUserVisit(context.Context, *UpsertNoteByUserVisitRequest) (*emptypb.Empty, error) {
	return nil, status.Errorf(codes.Unimplemented, "method UpsertNoteByUserVisit not implemented")
}
func (UnimplementedNotesDataServer) CreateUserMedicalNote(context.Context, *CreateUserMedicalNoteRequest) (*emptypb.Empty, error) {
	return nil, status.Errorf(codes.Unimplemented, "method CreateUserMedicalNote not implemented")
}
func (UnimplementedNotesDataServer) GetUserMedicalNotes(context.Context, *GetUserMedicalNotesRequest) (*GetUserMedicalNotesResponse, error) {
	return nil, status.Errorf(codes.Unimplemented, "method GetUserMedicalNotes not implemented")
}
func (UnimplementedNotesDataServer) DeleteUserMedicalNote(context.Context, *DeleteUserMedicalNoteRequest) (*emptypb.Empty, error) {
	return nil, status.Errorf(codes.Unimplemented, "method DeleteUserMedicalNote not implemented")
}
func (UnimplementedNotesDataServer) UpsertClinicalNoteByUserId(context.Context, *UpsertClinicalNoteByUserIdRequest) (*emptypb.Empty, error) {
	return nil, status.Errorf(codes.Unimplemented, "method UpsertClinicalNoteByUserId not implemented")
}
func (UnimplementedNotesDataServer) mustEmbedUnimplementedNotesDataServer() {}

// UnsafeNotesDataServer may be embedded to opt out of forward compatibility for this service.
// Use of this interface is not recommended, as added methods to NotesDataServer will
// result in compilation errors.
type UnsafeNotesDataServer interface {
	mustEmbedUnimplementedNotesDataServer()
}

func RegisterNotesDataServer(s grpc.ServiceRegistrar, srv NotesDataServer) {
	s.RegisterService(&NotesData_ServiceDesc, srv)
}

func _NotesData_UpsertNoteByUserVisit_Handler(srv interface{}, ctx context.Context, dec func(interface{}) error, interceptor grpc.UnaryServerInterceptor) (interface{}, error) {
	in := new(UpsertNoteByUserVisitRequest)
	if err := dec(in); err != nil {
		return nil, err
	}
	if interceptor == nil {
		return srv.(NotesDataServer).UpsertNoteByUserVisit(ctx, in)
	}
	info := &grpc.UnaryServerInfo{
		Server:     srv,
		FullMethod: "/dta.wed.api.v1.notes.NotesData/UpsertNoteByUserVisit",
	}
	handler := func(ctx context.Context, req interface{}) (interface{}, error) {
		return srv.(NotesDataServer).UpsertNoteByUserVisit(ctx, req.(*UpsertNoteByUserVisitRequest))
	}
	return interceptor(ctx, in, info, handler)
}

func _NotesData_CreateUserMedicalNote_Handler(srv interface{}, ctx context.Context, dec func(interface{}) error, interceptor grpc.UnaryServerInterceptor) (interface{}, error) {
	in := new(CreateUserMedicalNoteRequest)
	if err := dec(in); err != nil {
		return nil, err
	}
	if interceptor == nil {
		return srv.(NotesDataServer).CreateUserMedicalNote(ctx, in)
	}
	info := &grpc.UnaryServerInfo{
		Server:     srv,
		FullMethod: "/dta.wed.api.v1.notes.NotesData/CreateUserMedicalNote",
	}
	handler := func(ctx context.Context, req interface{}) (interface{}, error) {
		return srv.(NotesDataServer).CreateUserMedicalNote(ctx, req.(*CreateUserMedicalNoteRequest))
	}
	return interceptor(ctx, in, info, handler)
}

func _NotesData_GetUserMedicalNotes_Handler(srv interface{}, ctx context.Context, dec func(interface{}) error, interceptor grpc.UnaryServerInterceptor) (interface{}, error) {
	in := new(GetUserMedicalNotesRequest)
	if err := dec(in); err != nil {
		return nil, err
	}
	if interceptor == nil {
		return srv.(NotesDataServer).GetUserMedicalNotes(ctx, in)
	}
	info := &grpc.UnaryServerInfo{
		Server:     srv,
		FullMethod: "/dta.wed.api.v1.notes.NotesData/GetUserMedicalNotes",
	}
	handler := func(ctx context.Context, req interface{}) (interface{}, error) {
		return srv.(NotesDataServer).GetUserMedicalNotes(ctx, req.(*GetUserMedicalNotesRequest))
	}
	return interceptor(ctx, in, info, handler)
}

func _NotesData_DeleteUserMedicalNote_Handler(srv interface{}, ctx context.Context, dec func(interface{}) error, interceptor grpc.UnaryServerInterceptor) (interface{}, error) {
	in := new(DeleteUserMedicalNoteRequest)
	if err := dec(in); err != nil {
		return nil, err
	}
	if interceptor == nil {
		return srv.(NotesDataServer).DeleteUserMedicalNote(ctx, in)
	}
	info := &grpc.UnaryServerInfo{
		Server:     srv,
		FullMethod: "/dta.wed.api.v1.notes.NotesData/DeleteUserMedicalNote",
	}
	handler := func(ctx context.Context, req interface{}) (interface{}, error) {
		return srv.(NotesDataServer).DeleteUserMedicalNote(ctx, req.(*DeleteUserMedicalNoteRequest))
	}
	return interceptor(ctx, in, info, handler)
}

func _NotesData_UpsertClinicalNoteByUserId_Handler(srv interface{}, ctx context.Context, dec func(interface{}) error, interceptor grpc.UnaryServerInterceptor) (interface{}, error) {
	in := new(UpsertClinicalNoteByUserIdRequest)
	if err := dec(in); err != nil {
		return nil, err
	}
	if interceptor == nil {
		return srv.(NotesDataServer).UpsertClinicalNoteByUserId(ctx, in)
	}
	info := &grpc.UnaryServerInfo{
		Server:     srv,
		FullMethod: "/dta.wed.api.v1.notes.NotesData/UpsertClinicalNoteByUserId",
	}
	handler := func(ctx context.Context, req interface{}) (interface{}, error) {
		return srv.(NotesDataServer).UpsertClinicalNoteByUserId(ctx, req.(*UpsertClinicalNoteByUserIdRequest))
	}
	return interceptor(ctx, in, info, handler)
}

// NotesData_ServiceDesc is the grpc.ServiceDesc for NotesData service.
// It's only intended for direct use with grpc.RegisterService,
// and not to be introspected or modified (even as a copy)
var NotesData_ServiceDesc = grpc.ServiceDesc{
	ServiceName: "dta.wed.api.v1.notes.NotesData",
	HandlerType: (*NotesDataServer)(nil),
	Methods: []grpc.MethodDesc{
		{
			MethodName: "UpsertNoteByUserVisit",
			Handler:    _NotesData_UpsertNoteByUserVisit_Handler,
		},
		{
			MethodName: "CreateUserMedicalNote",
			Handler:    _NotesData_CreateUserMedicalNote_Handler,
		},
		{
			MethodName: "GetUserMedicalNotes",
			Handler:    _NotesData_GetUserMedicalNotes_Handler,
		},
		{
			MethodName: "DeleteUserMedicalNote",
			Handler:    _NotesData_DeleteUserMedicalNote_Handler,
		},
		{
			MethodName: "UpsertClinicalNoteByUserId",
			Handler:    _NotesData_UpsertClinicalNoteByUserId_Handler,
		},
	},
	Streams:  []grpc.StreamDesc{},
	Metadata: "dta-wed-api/v1/notes/notes.proto",
}
