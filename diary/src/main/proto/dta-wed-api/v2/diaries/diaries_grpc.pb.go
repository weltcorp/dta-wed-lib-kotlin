// Code generated by protoc-gen-go-grpc. DO NOT EDIT.
// versions:
// - protoc-gen-go-grpc v1.2.0
// - protoc             v3.21.12
// source: dta-wed-api/v2/diaries/diaries.proto

package diaries

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

// DiariesDataClient is the client API for DiariesData service.
//
// For semantics around ctx use and closing/ending streaming RPCs, please refer to https://pkg.go.dev/google.golang.org/grpc/?tab=doc#ClientConn.NewStream.
type DiariesDataClient interface {
	CreateDiary(ctx context.Context, in *CreateDiaryRequest, opts ...grpc.CallOption) (*emptypb.Empty, error)
	UpdateDiary(ctx context.Context, in *UpdateDiaryRequest, opts ...grpc.CallOption) (*emptypb.Empty, error)
	GetDiaries(ctx context.Context, in *GetDiariesRequest, opts ...grpc.CallOption) (*GetDiariesResponse, error)
}

type diariesDataClient struct {
	cc grpc.ClientConnInterface
}

func NewDiariesDataClient(cc grpc.ClientConnInterface) DiariesDataClient {
	return &diariesDataClient{cc}
}

func (c *diariesDataClient) CreateDiary(ctx context.Context, in *CreateDiaryRequest, opts ...grpc.CallOption) (*emptypb.Empty, error) {
	out := new(emptypb.Empty)
	err := c.cc.Invoke(ctx, "/dta.wed.api.v2.diaries.DiariesData/CreateDiary", in, out, opts...)
	if err != nil {
		return nil, err
	}
	return out, nil
}

func (c *diariesDataClient) UpdateDiary(ctx context.Context, in *UpdateDiaryRequest, opts ...grpc.CallOption) (*emptypb.Empty, error) {
	out := new(emptypb.Empty)
	err := c.cc.Invoke(ctx, "/dta.wed.api.v2.diaries.DiariesData/UpdateDiary", in, out, opts...)
	if err != nil {
		return nil, err
	}
	return out, nil
}

func (c *diariesDataClient) GetDiaries(ctx context.Context, in *GetDiariesRequest, opts ...grpc.CallOption) (*GetDiariesResponse, error) {
	out := new(GetDiariesResponse)
	err := c.cc.Invoke(ctx, "/dta.wed.api.v2.diaries.DiariesData/GetDiaries", in, out, opts...)
	if err != nil {
		return nil, err
	}
	return out, nil
}

// DiariesDataServer is the server API for DiariesData service.
// All implementations must embed UnimplementedDiariesDataServer
// for forward compatibility
type DiariesDataServer interface {
	CreateDiary(context.Context, *CreateDiaryRequest) (*emptypb.Empty, error)
	UpdateDiary(context.Context, *UpdateDiaryRequest) (*emptypb.Empty, error)
	GetDiaries(context.Context, *GetDiariesRequest) (*GetDiariesResponse, error)
	mustEmbedUnimplementedDiariesDataServer()
}

// UnimplementedDiariesDataServer must be embedded to have forward compatible implementations.
type UnimplementedDiariesDataServer struct {
}

func (UnimplementedDiariesDataServer) CreateDiary(context.Context, *CreateDiaryRequest) (*emptypb.Empty, error) {
	return nil, status.Errorf(codes.Unimplemented, "method CreateDiary not implemented")
}
func (UnimplementedDiariesDataServer) UpdateDiary(context.Context, *UpdateDiaryRequest) (*emptypb.Empty, error) {
	return nil, status.Errorf(codes.Unimplemented, "method UpdateDiary not implemented")
}
func (UnimplementedDiariesDataServer) GetDiaries(context.Context, *GetDiariesRequest) (*GetDiariesResponse, error) {
	return nil, status.Errorf(codes.Unimplemented, "method GetDiaries not implemented")
}
func (UnimplementedDiariesDataServer) mustEmbedUnimplementedDiariesDataServer() {}

// UnsafeDiariesDataServer may be embedded to opt out of forward compatibility for this service.
// Use of this interface is not recommended, as added methods to DiariesDataServer will
// result in compilation errors.
type UnsafeDiariesDataServer interface {
	mustEmbedUnimplementedDiariesDataServer()
}

func RegisterDiariesDataServer(s grpc.ServiceRegistrar, srv DiariesDataServer) {
	s.RegisterService(&DiariesData_ServiceDesc, srv)
}

func _DiariesData_CreateDiary_Handler(srv interface{}, ctx context.Context, dec func(interface{}) error, interceptor grpc.UnaryServerInterceptor) (interface{}, error) {
	in := new(CreateDiaryRequest)
	if err := dec(in); err != nil {
		return nil, err
	}
	if interceptor == nil {
		return srv.(DiariesDataServer).CreateDiary(ctx, in)
	}
	info := &grpc.UnaryServerInfo{
		Server:     srv,
		FullMethod: "/dta.wed.api.v2.diaries.DiariesData/CreateDiary",
	}
	handler := func(ctx context.Context, req interface{}) (interface{}, error) {
		return srv.(DiariesDataServer).CreateDiary(ctx, req.(*CreateDiaryRequest))
	}
	return interceptor(ctx, in, info, handler)
}

func _DiariesData_UpdateDiary_Handler(srv interface{}, ctx context.Context, dec func(interface{}) error, interceptor grpc.UnaryServerInterceptor) (interface{}, error) {
	in := new(UpdateDiaryRequest)
	if err := dec(in); err != nil {
		return nil, err
	}
	if interceptor == nil {
		return srv.(DiariesDataServer).UpdateDiary(ctx, in)
	}
	info := &grpc.UnaryServerInfo{
		Server:     srv,
		FullMethod: "/dta.wed.api.v2.diaries.DiariesData/UpdateDiary",
	}
	handler := func(ctx context.Context, req interface{}) (interface{}, error) {
		return srv.(DiariesDataServer).UpdateDiary(ctx, req.(*UpdateDiaryRequest))
	}
	return interceptor(ctx, in, info, handler)
}

func _DiariesData_GetDiaries_Handler(srv interface{}, ctx context.Context, dec func(interface{}) error, interceptor grpc.UnaryServerInterceptor) (interface{}, error) {
	in := new(GetDiariesRequest)
	if err := dec(in); err != nil {
		return nil, err
	}
	if interceptor == nil {
		return srv.(DiariesDataServer).GetDiaries(ctx, in)
	}
	info := &grpc.UnaryServerInfo{
		Server:     srv,
		FullMethod: "/dta.wed.api.v2.diaries.DiariesData/GetDiaries",
	}
	handler := func(ctx context.Context, req interface{}) (interface{}, error) {
		return srv.(DiariesDataServer).GetDiaries(ctx, req.(*GetDiariesRequest))
	}
	return interceptor(ctx, in, info, handler)
}

// DiariesData_ServiceDesc is the grpc.ServiceDesc for DiariesData service.
// It's only intended for direct use with grpc.RegisterService,
// and not to be introspected or modified (even as a copy)
var DiariesData_ServiceDesc = grpc.ServiceDesc{
	ServiceName: "dta.wed.api.v2.diaries.DiariesData",
	HandlerType: (*DiariesDataServer)(nil),
	Methods: []grpc.MethodDesc{
		{
			MethodName: "CreateDiary",
			Handler:    _DiariesData_CreateDiary_Handler,
		},
		{
			MethodName: "UpdateDiary",
			Handler:    _DiariesData_UpdateDiary_Handler,
		},
		{
			MethodName: "GetDiaries",
			Handler:    _DiariesData_GetDiaries_Handler,
		},
	},
	Streams:  []grpc.StreamDesc{},
	Metadata: "dta-wed-api/v2/diaries/diaries.proto",
}
