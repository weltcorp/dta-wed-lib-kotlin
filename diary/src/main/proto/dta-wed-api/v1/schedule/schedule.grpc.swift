//
// DO NOT EDIT.
//
// Generated by the protocol buffer compiler.
// Source: dta-wed-api/v1/schedule/schedule.proto
//

//
// Copyright 2018, gRPC Authors All rights reserved.
//
// Licensed under the Apache License, Version 2.0 (the "License");
// you may not use this file except in compliance with the License.
// You may obtain a copy of the License at
//
//     http://www.apache.org/licenses/LICENSE-2.0
//
// Unless required by applicable law or agreed to in writing, software
// distributed under the License is distributed on an "AS IS" BASIS,
// WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
// See the License for the specific language governing permissions and
// limitations under the License.
//
import GRPC
import NIO
import NIOConcurrencyHelpers
import SwiftProtobuf


/// Usage: instantiate `Dta_Wed_Api_V1_Schedule_ScheduleDataClient`, then call methods of this protocol to make API calls.
internal protocol Dta_Wed_Api_V1_Schedule_ScheduleDataClientProtocol: GRPCClient {
  var serviceName: String { get }
  var interceptors: Dta_Wed_Api_V1_Schedule_ScheduleDataClientInterceptorFactoryProtocol? { get }

  func upsertUserDiarySchedule(
    _ request: Dta_Wed_Api_V1_Schedule_UpsertUserDiaryScheduleRequest,
    callOptions: CallOptions?
  ) -> UnaryCall<Dta_Wed_Api_V1_Schedule_UpsertUserDiaryScheduleRequest, SwiftProtobuf.Google_Protobuf_Empty>

  func getUserSchedule(
    _ request: Dta_Wed_Api_V1_Schedule_GetUserScheduleRequest,
    callOptions: CallOptions?
  ) -> UnaryCall<Dta_Wed_Api_V1_Schedule_GetUserScheduleRequest, Dta_Wed_Api_V1_Schedule_GetUserScheduleResponse>
}

extension Dta_Wed_Api_V1_Schedule_ScheduleDataClientProtocol {
  internal var serviceName: String {
    return "dta.wed.api.v1.schedule.ScheduleData"
  }

  /// Unary call to UpsertUserDiarySchedule
  ///
  /// - Parameters:
  ///   - request: Request to send to UpsertUserDiarySchedule.
  ///   - callOptions: Call options.
  /// - Returns: A `UnaryCall` with futures for the metadata, status and response.
  internal func upsertUserDiarySchedule(
    _ request: Dta_Wed_Api_V1_Schedule_UpsertUserDiaryScheduleRequest,
    callOptions: CallOptions? = nil
  ) -> UnaryCall<Dta_Wed_Api_V1_Schedule_UpsertUserDiaryScheduleRequest, SwiftProtobuf.Google_Protobuf_Empty> {
    return self.makeUnaryCall(
      path: Dta_Wed_Api_V1_Schedule_ScheduleDataClientMetadata.Methods.upsertUserDiarySchedule.path,
      request: request,
      callOptions: callOptions ?? self.defaultCallOptions,
      interceptors: self.interceptors?.makeUpsertUserDiaryScheduleInterceptors() ?? []
    )
  }

  /// Unary call to GetUserSchedule
  ///
  /// - Parameters:
  ///   - request: Request to send to GetUserSchedule.
  ///   - callOptions: Call options.
  /// - Returns: A `UnaryCall` with futures for the metadata, status and response.
  internal func getUserSchedule(
    _ request: Dta_Wed_Api_V1_Schedule_GetUserScheduleRequest,
    callOptions: CallOptions? = nil
  ) -> UnaryCall<Dta_Wed_Api_V1_Schedule_GetUserScheduleRequest, Dta_Wed_Api_V1_Schedule_GetUserScheduleResponse> {
    return self.makeUnaryCall(
      path: Dta_Wed_Api_V1_Schedule_ScheduleDataClientMetadata.Methods.getUserSchedule.path,
      request: request,
      callOptions: callOptions ?? self.defaultCallOptions,
      interceptors: self.interceptors?.makeGetUserScheduleInterceptors() ?? []
    )
  }
}

#if compiler(>=5.6)
@available(*, deprecated)
extension Dta_Wed_Api_V1_Schedule_ScheduleDataClient: @unchecked Sendable {}
#endif // compiler(>=5.6)

@available(*, deprecated, renamed: "Dta_Wed_Api_V1_Schedule_ScheduleDataNIOClient")
internal final class Dta_Wed_Api_V1_Schedule_ScheduleDataClient: Dta_Wed_Api_V1_Schedule_ScheduleDataClientProtocol {
  private let lock = Lock()
  private var _defaultCallOptions: CallOptions
  private var _interceptors: Dta_Wed_Api_V1_Schedule_ScheduleDataClientInterceptorFactoryProtocol?
  internal let channel: GRPCChannel
  internal var defaultCallOptions: CallOptions {
    get { self.lock.withLock { return self._defaultCallOptions } }
    set { self.lock.withLockVoid { self._defaultCallOptions = newValue } }
  }
  internal var interceptors: Dta_Wed_Api_V1_Schedule_ScheduleDataClientInterceptorFactoryProtocol? {
    get { self.lock.withLock { return self._interceptors } }
    set { self.lock.withLockVoid { self._interceptors = newValue } }
  }

  /// Creates a client for the dta.wed.api.v1.schedule.ScheduleData service.
  ///
  /// - Parameters:
  ///   - channel: `GRPCChannel` to the service host.
  ///   - defaultCallOptions: Options to use for each service call if the user doesn't provide them.
  ///   - interceptors: A factory providing interceptors for each RPC.
  internal init(
    channel: GRPCChannel,
    defaultCallOptions: CallOptions = CallOptions(),
    interceptors: Dta_Wed_Api_V1_Schedule_ScheduleDataClientInterceptorFactoryProtocol? = nil
  ) {
    self.channel = channel
    self._defaultCallOptions = defaultCallOptions
    self._interceptors = interceptors
  }
}

internal struct Dta_Wed_Api_V1_Schedule_ScheduleDataNIOClient: Dta_Wed_Api_V1_Schedule_ScheduleDataClientProtocol {
  internal var channel: GRPCChannel
  internal var defaultCallOptions: CallOptions
  internal var interceptors: Dta_Wed_Api_V1_Schedule_ScheduleDataClientInterceptorFactoryProtocol?

  /// Creates a client for the dta.wed.api.v1.schedule.ScheduleData service.
  ///
  /// - Parameters:
  ///   - channel: `GRPCChannel` to the service host.
  ///   - defaultCallOptions: Options to use for each service call if the user doesn't provide them.
  ///   - interceptors: A factory providing interceptors for each RPC.
  internal init(
    channel: GRPCChannel,
    defaultCallOptions: CallOptions = CallOptions(),
    interceptors: Dta_Wed_Api_V1_Schedule_ScheduleDataClientInterceptorFactoryProtocol? = nil
  ) {
    self.channel = channel
    self.defaultCallOptions = defaultCallOptions
    self.interceptors = interceptors
  }
}

#if compiler(>=5.6)
@available(macOS 10.15, iOS 13, tvOS 13, watchOS 6, *)
internal protocol Dta_Wed_Api_V1_Schedule_ScheduleDataAsyncClientProtocol: GRPCClient {
  static var serviceDescriptor: GRPCServiceDescriptor { get }
  var interceptors: Dta_Wed_Api_V1_Schedule_ScheduleDataClientInterceptorFactoryProtocol? { get }

  func makeUpsertUserDiaryScheduleCall(
    _ request: Dta_Wed_Api_V1_Schedule_UpsertUserDiaryScheduleRequest,
    callOptions: CallOptions?
  ) -> GRPCAsyncUnaryCall<Dta_Wed_Api_V1_Schedule_UpsertUserDiaryScheduleRequest, SwiftProtobuf.Google_Protobuf_Empty>

  func makeGetUserScheduleCall(
    _ request: Dta_Wed_Api_V1_Schedule_GetUserScheduleRequest,
    callOptions: CallOptions?
  ) -> GRPCAsyncUnaryCall<Dta_Wed_Api_V1_Schedule_GetUserScheduleRequest, Dta_Wed_Api_V1_Schedule_GetUserScheduleResponse>
}

@available(macOS 10.15, iOS 13, tvOS 13, watchOS 6, *)
extension Dta_Wed_Api_V1_Schedule_ScheduleDataAsyncClientProtocol {
  internal static var serviceDescriptor: GRPCServiceDescriptor {
    return Dta_Wed_Api_V1_Schedule_ScheduleDataClientMetadata.serviceDescriptor
  }

  internal var interceptors: Dta_Wed_Api_V1_Schedule_ScheduleDataClientInterceptorFactoryProtocol? {
    return nil
  }

  internal func makeUpsertUserDiaryScheduleCall(
    _ request: Dta_Wed_Api_V1_Schedule_UpsertUserDiaryScheduleRequest,
    callOptions: CallOptions? = nil
  ) -> GRPCAsyncUnaryCall<Dta_Wed_Api_V1_Schedule_UpsertUserDiaryScheduleRequest, SwiftProtobuf.Google_Protobuf_Empty> {
    return self.makeAsyncUnaryCall(
      path: Dta_Wed_Api_V1_Schedule_ScheduleDataClientMetadata.Methods.upsertUserDiarySchedule.path,
      request: request,
      callOptions: callOptions ?? self.defaultCallOptions,
      interceptors: self.interceptors?.makeUpsertUserDiaryScheduleInterceptors() ?? []
    )
  }

  internal func makeGetUserScheduleCall(
    _ request: Dta_Wed_Api_V1_Schedule_GetUserScheduleRequest,
    callOptions: CallOptions? = nil
  ) -> GRPCAsyncUnaryCall<Dta_Wed_Api_V1_Schedule_GetUserScheduleRequest, Dta_Wed_Api_V1_Schedule_GetUserScheduleResponse> {
    return self.makeAsyncUnaryCall(
      path: Dta_Wed_Api_V1_Schedule_ScheduleDataClientMetadata.Methods.getUserSchedule.path,
      request: request,
      callOptions: callOptions ?? self.defaultCallOptions,
      interceptors: self.interceptors?.makeGetUserScheduleInterceptors() ?? []
    )
  }
}

@available(macOS 10.15, iOS 13, tvOS 13, watchOS 6, *)
extension Dta_Wed_Api_V1_Schedule_ScheduleDataAsyncClientProtocol {
  internal func upsertUserDiarySchedule(
    _ request: Dta_Wed_Api_V1_Schedule_UpsertUserDiaryScheduleRequest,
    callOptions: CallOptions? = nil
  ) async throws -> SwiftProtobuf.Google_Protobuf_Empty {
    return try await self.performAsyncUnaryCall(
      path: Dta_Wed_Api_V1_Schedule_ScheduleDataClientMetadata.Methods.upsertUserDiarySchedule.path,
      request: request,
      callOptions: callOptions ?? self.defaultCallOptions,
      interceptors: self.interceptors?.makeUpsertUserDiaryScheduleInterceptors() ?? []
    )
  }

  internal func getUserSchedule(
    _ request: Dta_Wed_Api_V1_Schedule_GetUserScheduleRequest,
    callOptions: CallOptions? = nil
  ) async throws -> Dta_Wed_Api_V1_Schedule_GetUserScheduleResponse {
    return try await self.performAsyncUnaryCall(
      path: Dta_Wed_Api_V1_Schedule_ScheduleDataClientMetadata.Methods.getUserSchedule.path,
      request: request,
      callOptions: callOptions ?? self.defaultCallOptions,
      interceptors: self.interceptors?.makeGetUserScheduleInterceptors() ?? []
    )
  }
}

@available(macOS 10.15, iOS 13, tvOS 13, watchOS 6, *)
internal struct Dta_Wed_Api_V1_Schedule_ScheduleDataAsyncClient: Dta_Wed_Api_V1_Schedule_ScheduleDataAsyncClientProtocol {
  internal var channel: GRPCChannel
  internal var defaultCallOptions: CallOptions
  internal var interceptors: Dta_Wed_Api_V1_Schedule_ScheduleDataClientInterceptorFactoryProtocol?

  internal init(
    channel: GRPCChannel,
    defaultCallOptions: CallOptions = CallOptions(),
    interceptors: Dta_Wed_Api_V1_Schedule_ScheduleDataClientInterceptorFactoryProtocol? = nil
  ) {
    self.channel = channel
    self.defaultCallOptions = defaultCallOptions
    self.interceptors = interceptors
  }
}

#endif // compiler(>=5.6)

internal protocol Dta_Wed_Api_V1_Schedule_ScheduleDataClientInterceptorFactoryProtocol: GRPCSendable {

  /// - Returns: Interceptors to use when invoking 'upsertUserDiarySchedule'.
  func makeUpsertUserDiaryScheduleInterceptors() -> [ClientInterceptor<Dta_Wed_Api_V1_Schedule_UpsertUserDiaryScheduleRequest, SwiftProtobuf.Google_Protobuf_Empty>]

  /// - Returns: Interceptors to use when invoking 'getUserSchedule'.
  func makeGetUserScheduleInterceptors() -> [ClientInterceptor<Dta_Wed_Api_V1_Schedule_GetUserScheduleRequest, Dta_Wed_Api_V1_Schedule_GetUserScheduleResponse>]
}

internal enum Dta_Wed_Api_V1_Schedule_ScheduleDataClientMetadata {
  internal static let serviceDescriptor = GRPCServiceDescriptor(
    name: "ScheduleData",
    fullName: "dta.wed.api.v1.schedule.ScheduleData",
    methods: [
      Dta_Wed_Api_V1_Schedule_ScheduleDataClientMetadata.Methods.upsertUserDiarySchedule,
      Dta_Wed_Api_V1_Schedule_ScheduleDataClientMetadata.Methods.getUserSchedule,
    ]
  )

  internal enum Methods {
    internal static let upsertUserDiarySchedule = GRPCMethodDescriptor(
      name: "UpsertUserDiarySchedule",
      path: "/dta.wed.api.v1.schedule.ScheduleData/UpsertUserDiarySchedule",
      type: GRPCCallType.unary
    )

    internal static let getUserSchedule = GRPCMethodDescriptor(
      name: "GetUserSchedule",
      path: "/dta.wed.api.v1.schedule.ScheduleData/GetUserSchedule",
      type: GRPCCallType.unary
    )
  }
}

