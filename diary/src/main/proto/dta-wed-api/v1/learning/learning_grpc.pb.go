// Code generated by protoc-gen-go-grpc. DO NOT EDIT.
// versions:
// - protoc-gen-go-grpc v1.2.0
// - protoc             v3.21.12
// source: dta-wed-api/v1/learning/learning.proto

package learning

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

// LearningDataClient is the client API for LearningData service.
//
// For semantics around ctx use and closing/ending streaming RPCs, please refer to https://pkg.go.dev/google.golang.org/grpc/?tab=doc#ClientConn.NewStream.
type LearningDataClient interface {
	GetUserSessionItemsByCourseId(ctx context.Context, in *GetUserSessionItemsByCourseIdRequest, opts ...grpc.CallOption) (*GetUserSessionItemsByCourseIdResponse, error)
	GetDoneUserSessionItems(ctx context.Context, in *GetDoneUserSessionItemsRequest, opts ...grpc.CallOption) (*GetDoneUserSessionItemsResponse, error)
	CreateUserRecommendedSessionItems(ctx context.Context, in *CreateUserRecommendedSessionItemsRequest, opts ...grpc.CallOption) (*emptypb.Empty, error)
	GetUserRecommendedSessionItems(ctx context.Context, in *GetUserRecommendedSessionItemsRequest, opts ...grpc.CallOption) (*GetUserRecommendedSessionItemsResponse, error)
	DeleteUserRecommendedSessionItem(ctx context.Context, in *DeleteUserRecommendedSessionItemRequest, opts ...grpc.CallOption) (*emptypb.Empty, error)
	GetShuffledSessionItemsByUserId(ctx context.Context, in *GetShuffledSessionItemsByUserIdRequest, opts ...grpc.CallOption) (*GetShuffledSessionItemsByUserIdResponse, error)
	GetPageByPageId(ctx context.Context, in *GetPageByPageIdRequest, opts ...grpc.CallOption) (*GetPageByPageIdResponse, error)
}

type learningDataClient struct {
	cc grpc.ClientConnInterface
}

func NewLearningDataClient(cc grpc.ClientConnInterface) LearningDataClient {
	return &learningDataClient{cc}
}

func (c *learningDataClient) GetUserSessionItemsByCourseId(ctx context.Context, in *GetUserSessionItemsByCourseIdRequest, opts ...grpc.CallOption) (*GetUserSessionItemsByCourseIdResponse, error) {
	out := new(GetUserSessionItemsByCourseIdResponse)
	err := c.cc.Invoke(ctx, "/dta.wed.api.v1.learning.LearningData/GetUserSessionItemsByCourseId", in, out, opts...)
	if err != nil {
		return nil, err
	}
	return out, nil
}

func (c *learningDataClient) GetDoneUserSessionItems(ctx context.Context, in *GetDoneUserSessionItemsRequest, opts ...grpc.CallOption) (*GetDoneUserSessionItemsResponse, error) {
	out := new(GetDoneUserSessionItemsResponse)
	err := c.cc.Invoke(ctx, "/dta.wed.api.v1.learning.LearningData/GetDoneUserSessionItems", in, out, opts...)
	if err != nil {
		return nil, err
	}
	return out, nil
}

func (c *learningDataClient) CreateUserRecommendedSessionItems(ctx context.Context, in *CreateUserRecommendedSessionItemsRequest, opts ...grpc.CallOption) (*emptypb.Empty, error) {
	out := new(emptypb.Empty)
	err := c.cc.Invoke(ctx, "/dta.wed.api.v1.learning.LearningData/CreateUserRecommendedSessionItems", in, out, opts...)
	if err != nil {
		return nil, err
	}
	return out, nil
}

func (c *learningDataClient) GetUserRecommendedSessionItems(ctx context.Context, in *GetUserRecommendedSessionItemsRequest, opts ...grpc.CallOption) (*GetUserRecommendedSessionItemsResponse, error) {
	out := new(GetUserRecommendedSessionItemsResponse)
	err := c.cc.Invoke(ctx, "/dta.wed.api.v1.learning.LearningData/GetUserRecommendedSessionItems", in, out, opts...)
	if err != nil {
		return nil, err
	}
	return out, nil
}

func (c *learningDataClient) DeleteUserRecommendedSessionItem(ctx context.Context, in *DeleteUserRecommendedSessionItemRequest, opts ...grpc.CallOption) (*emptypb.Empty, error) {
	out := new(emptypb.Empty)
	err := c.cc.Invoke(ctx, "/dta.wed.api.v1.learning.LearningData/DeleteUserRecommendedSessionItem", in, out, opts...)
	if err != nil {
		return nil, err
	}
	return out, nil
}

func (c *learningDataClient) GetShuffledSessionItemsByUserId(ctx context.Context, in *GetShuffledSessionItemsByUserIdRequest, opts ...grpc.CallOption) (*GetShuffledSessionItemsByUserIdResponse, error) {
	out := new(GetShuffledSessionItemsByUserIdResponse)
	err := c.cc.Invoke(ctx, "/dta.wed.api.v1.learning.LearningData/GetShuffledSessionItemsByUserId", in, out, opts...)
	if err != nil {
		return nil, err
	}
	return out, nil
}

func (c *learningDataClient) GetPageByPageId(ctx context.Context, in *GetPageByPageIdRequest, opts ...grpc.CallOption) (*GetPageByPageIdResponse, error) {
	out := new(GetPageByPageIdResponse)
	err := c.cc.Invoke(ctx, "/dta.wed.api.v1.learning.LearningData/GetPageByPageId", in, out, opts...)
	if err != nil {
		return nil, err
	}
	return out, nil
}

// LearningDataServer is the server API for LearningData service.
// All implementations must embed UnimplementedLearningDataServer
// for forward compatibility
type LearningDataServer interface {
	GetUserSessionItemsByCourseId(context.Context, *GetUserSessionItemsByCourseIdRequest) (*GetUserSessionItemsByCourseIdResponse, error)
	GetDoneUserSessionItems(context.Context, *GetDoneUserSessionItemsRequest) (*GetDoneUserSessionItemsResponse, error)
	CreateUserRecommendedSessionItems(context.Context, *CreateUserRecommendedSessionItemsRequest) (*emptypb.Empty, error)
	GetUserRecommendedSessionItems(context.Context, *GetUserRecommendedSessionItemsRequest) (*GetUserRecommendedSessionItemsResponse, error)
	DeleteUserRecommendedSessionItem(context.Context, *DeleteUserRecommendedSessionItemRequest) (*emptypb.Empty, error)
	GetShuffledSessionItemsByUserId(context.Context, *GetShuffledSessionItemsByUserIdRequest) (*GetShuffledSessionItemsByUserIdResponse, error)
	GetPageByPageId(context.Context, *GetPageByPageIdRequest) (*GetPageByPageIdResponse, error)
	mustEmbedUnimplementedLearningDataServer()
}

// UnimplementedLearningDataServer must be embedded to have forward compatible implementations.
type UnimplementedLearningDataServer struct {
}

func (UnimplementedLearningDataServer) GetUserSessionItemsByCourseId(context.Context, *GetUserSessionItemsByCourseIdRequest) (*GetUserSessionItemsByCourseIdResponse, error) {
	return nil, status.Errorf(codes.Unimplemented, "method GetUserSessionItemsByCourseId not implemented")
}
func (UnimplementedLearningDataServer) GetDoneUserSessionItems(context.Context, *GetDoneUserSessionItemsRequest) (*GetDoneUserSessionItemsResponse, error) {
	return nil, status.Errorf(codes.Unimplemented, "method GetDoneUserSessionItems not implemented")
}
func (UnimplementedLearningDataServer) CreateUserRecommendedSessionItems(context.Context, *CreateUserRecommendedSessionItemsRequest) (*emptypb.Empty, error) {
	return nil, status.Errorf(codes.Unimplemented, "method CreateUserRecommendedSessionItems not implemented")
}
func (UnimplementedLearningDataServer) GetUserRecommendedSessionItems(context.Context, *GetUserRecommendedSessionItemsRequest) (*GetUserRecommendedSessionItemsResponse, error) {
	return nil, status.Errorf(codes.Unimplemented, "method GetUserRecommendedSessionItems not implemented")
}
func (UnimplementedLearningDataServer) DeleteUserRecommendedSessionItem(context.Context, *DeleteUserRecommendedSessionItemRequest) (*emptypb.Empty, error) {
	return nil, status.Errorf(codes.Unimplemented, "method DeleteUserRecommendedSessionItem not implemented")
}
func (UnimplementedLearningDataServer) GetShuffledSessionItemsByUserId(context.Context, *GetShuffledSessionItemsByUserIdRequest) (*GetShuffledSessionItemsByUserIdResponse, error) {
	return nil, status.Errorf(codes.Unimplemented, "method GetShuffledSessionItemsByUserId not implemented")
}
func (UnimplementedLearningDataServer) GetPageByPageId(context.Context, *GetPageByPageIdRequest) (*GetPageByPageIdResponse, error) {
	return nil, status.Errorf(codes.Unimplemented, "method GetPageByPageId not implemented")
}
func (UnimplementedLearningDataServer) mustEmbedUnimplementedLearningDataServer() {}

// UnsafeLearningDataServer may be embedded to opt out of forward compatibility for this service.
// Use of this interface is not recommended, as added methods to LearningDataServer will
// result in compilation errors.
type UnsafeLearningDataServer interface {
	mustEmbedUnimplementedLearningDataServer()
}

func RegisterLearningDataServer(s grpc.ServiceRegistrar, srv LearningDataServer) {
	s.RegisterService(&LearningData_ServiceDesc, srv)
}

func _LearningData_GetUserSessionItemsByCourseId_Handler(srv interface{}, ctx context.Context, dec func(interface{}) error, interceptor grpc.UnaryServerInterceptor) (interface{}, error) {
	in := new(GetUserSessionItemsByCourseIdRequest)
	if err := dec(in); err != nil {
		return nil, err
	}
	if interceptor == nil {
		return srv.(LearningDataServer).GetUserSessionItemsByCourseId(ctx, in)
	}
	info := &grpc.UnaryServerInfo{
		Server:     srv,
		FullMethod: "/dta.wed.api.v1.learning.LearningData/GetUserSessionItemsByCourseId",
	}
	handler := func(ctx context.Context, req interface{}) (interface{}, error) {
		return srv.(LearningDataServer).GetUserSessionItemsByCourseId(ctx, req.(*GetUserSessionItemsByCourseIdRequest))
	}
	return interceptor(ctx, in, info, handler)
}

func _LearningData_GetDoneUserSessionItems_Handler(srv interface{}, ctx context.Context, dec func(interface{}) error, interceptor grpc.UnaryServerInterceptor) (interface{}, error) {
	in := new(GetDoneUserSessionItemsRequest)
	if err := dec(in); err != nil {
		return nil, err
	}
	if interceptor == nil {
		return srv.(LearningDataServer).GetDoneUserSessionItems(ctx, in)
	}
	info := &grpc.UnaryServerInfo{
		Server:     srv,
		FullMethod: "/dta.wed.api.v1.learning.LearningData/GetDoneUserSessionItems",
	}
	handler := func(ctx context.Context, req interface{}) (interface{}, error) {
		return srv.(LearningDataServer).GetDoneUserSessionItems(ctx, req.(*GetDoneUserSessionItemsRequest))
	}
	return interceptor(ctx, in, info, handler)
}

func _LearningData_CreateUserRecommendedSessionItems_Handler(srv interface{}, ctx context.Context, dec func(interface{}) error, interceptor grpc.UnaryServerInterceptor) (interface{}, error) {
	in := new(CreateUserRecommendedSessionItemsRequest)
	if err := dec(in); err != nil {
		return nil, err
	}
	if interceptor == nil {
		return srv.(LearningDataServer).CreateUserRecommendedSessionItems(ctx, in)
	}
	info := &grpc.UnaryServerInfo{
		Server:     srv,
		FullMethod: "/dta.wed.api.v1.learning.LearningData/CreateUserRecommendedSessionItems",
	}
	handler := func(ctx context.Context, req interface{}) (interface{}, error) {
		return srv.(LearningDataServer).CreateUserRecommendedSessionItems(ctx, req.(*CreateUserRecommendedSessionItemsRequest))
	}
	return interceptor(ctx, in, info, handler)
}

func _LearningData_GetUserRecommendedSessionItems_Handler(srv interface{}, ctx context.Context, dec func(interface{}) error, interceptor grpc.UnaryServerInterceptor) (interface{}, error) {
	in := new(GetUserRecommendedSessionItemsRequest)
	if err := dec(in); err != nil {
		return nil, err
	}
	if interceptor == nil {
		return srv.(LearningDataServer).GetUserRecommendedSessionItems(ctx, in)
	}
	info := &grpc.UnaryServerInfo{
		Server:     srv,
		FullMethod: "/dta.wed.api.v1.learning.LearningData/GetUserRecommendedSessionItems",
	}
	handler := func(ctx context.Context, req interface{}) (interface{}, error) {
		return srv.(LearningDataServer).GetUserRecommendedSessionItems(ctx, req.(*GetUserRecommendedSessionItemsRequest))
	}
	return interceptor(ctx, in, info, handler)
}

func _LearningData_DeleteUserRecommendedSessionItem_Handler(srv interface{}, ctx context.Context, dec func(interface{}) error, interceptor grpc.UnaryServerInterceptor) (interface{}, error) {
	in := new(DeleteUserRecommendedSessionItemRequest)
	if err := dec(in); err != nil {
		return nil, err
	}
	if interceptor == nil {
		return srv.(LearningDataServer).DeleteUserRecommendedSessionItem(ctx, in)
	}
	info := &grpc.UnaryServerInfo{
		Server:     srv,
		FullMethod: "/dta.wed.api.v1.learning.LearningData/DeleteUserRecommendedSessionItem",
	}
	handler := func(ctx context.Context, req interface{}) (interface{}, error) {
		return srv.(LearningDataServer).DeleteUserRecommendedSessionItem(ctx, req.(*DeleteUserRecommendedSessionItemRequest))
	}
	return interceptor(ctx, in, info, handler)
}

func _LearningData_GetShuffledSessionItemsByUserId_Handler(srv interface{}, ctx context.Context, dec func(interface{}) error, interceptor grpc.UnaryServerInterceptor) (interface{}, error) {
	in := new(GetShuffledSessionItemsByUserIdRequest)
	if err := dec(in); err != nil {
		return nil, err
	}
	if interceptor == nil {
		return srv.(LearningDataServer).GetShuffledSessionItemsByUserId(ctx, in)
	}
	info := &grpc.UnaryServerInfo{
		Server:     srv,
		FullMethod: "/dta.wed.api.v1.learning.LearningData/GetShuffledSessionItemsByUserId",
	}
	handler := func(ctx context.Context, req interface{}) (interface{}, error) {
		return srv.(LearningDataServer).GetShuffledSessionItemsByUserId(ctx, req.(*GetShuffledSessionItemsByUserIdRequest))
	}
	return interceptor(ctx, in, info, handler)
}

func _LearningData_GetPageByPageId_Handler(srv interface{}, ctx context.Context, dec func(interface{}) error, interceptor grpc.UnaryServerInterceptor) (interface{}, error) {
	in := new(GetPageByPageIdRequest)
	if err := dec(in); err != nil {
		return nil, err
	}
	if interceptor == nil {
		return srv.(LearningDataServer).GetPageByPageId(ctx, in)
	}
	info := &grpc.UnaryServerInfo{
		Server:     srv,
		FullMethod: "/dta.wed.api.v1.learning.LearningData/GetPageByPageId",
	}
	handler := func(ctx context.Context, req interface{}) (interface{}, error) {
		return srv.(LearningDataServer).GetPageByPageId(ctx, req.(*GetPageByPageIdRequest))
	}
	return interceptor(ctx, in, info, handler)
}

// LearningData_ServiceDesc is the grpc.ServiceDesc for LearningData service.
// It's only intended for direct use with grpc.RegisterService,
// and not to be introspected or modified (even as a copy)
var LearningData_ServiceDesc = grpc.ServiceDesc{
	ServiceName: "dta.wed.api.v1.learning.LearningData",
	HandlerType: (*LearningDataServer)(nil),
	Methods: []grpc.MethodDesc{
		{
			MethodName: "GetUserSessionItemsByCourseId",
			Handler:    _LearningData_GetUserSessionItemsByCourseId_Handler,
		},
		{
			MethodName: "GetDoneUserSessionItems",
			Handler:    _LearningData_GetDoneUserSessionItems_Handler,
		},
		{
			MethodName: "CreateUserRecommendedSessionItems",
			Handler:    _LearningData_CreateUserRecommendedSessionItems_Handler,
		},
		{
			MethodName: "GetUserRecommendedSessionItems",
			Handler:    _LearningData_GetUserRecommendedSessionItems_Handler,
		},
		{
			MethodName: "DeleteUserRecommendedSessionItem",
			Handler:    _LearningData_DeleteUserRecommendedSessionItem_Handler,
		},
		{
			MethodName: "GetShuffledSessionItemsByUserId",
			Handler:    _LearningData_GetShuffledSessionItemsByUserId_Handler,
		},
		{
			MethodName: "GetPageByPageId",
			Handler:    _LearningData_GetPageByPageId_Handler,
		},
	},
	Streams:  []grpc.StreamDesc{},
	Metadata: "dta-wed-api/v1/learning/learning.proto",
}
