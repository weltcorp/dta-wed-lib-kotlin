//
// DO NOT EDIT.
//
// Generated by the protocol buffer compiler.
// Source: dta-wed-api/v1/messaging/messaging.proto
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


/// Usage: instantiate `Dta_Wed_Api_V1_Messaging_MessagingDataClient`, then call methods of this protocol to make API calls.
internal protocol Dta_Wed_Api_V1_Messaging_MessagingDataClientProtocol: GRPCClient {
  var serviceName: String { get }
  var interceptors: Dta_Wed_Api_V1_Messaging_MessagingDataClientInterceptorFactoryProtocol? { get }

  func updatePushMessageLog(
    _ request: Dta_Wed_Api_V1_Messaging_UpdatePushMessageLogRequest,
    callOptions: CallOptions?
  ) -> UnaryCall<Dta_Wed_Api_V1_Messaging_UpdatePushMessageLogRequest, SwiftProtobuf.Google_Protobuf_Empty>
}

extension Dta_Wed_Api_V1_Messaging_MessagingDataClientProtocol {
  internal var serviceName: String {
    return "dta.wed.api.v1.messaging.MessagingData"
  }

  /// Unary call to UpdatePushMessageLog
  ///
  /// - Parameters:
  ///   - request: Request to send to UpdatePushMessageLog.
  ///   - callOptions: Call options.
  /// - Returns: A `UnaryCall` with futures for the metadata, status and response.
  internal func updatePushMessageLog(
    _ request: Dta_Wed_Api_V1_Messaging_UpdatePushMessageLogRequest,
    callOptions: CallOptions? = nil
  ) -> UnaryCall<Dta_Wed_Api_V1_Messaging_UpdatePushMessageLogRequest, SwiftProtobuf.Google_Protobuf_Empty> {
    return self.makeUnaryCall(
      path: Dta_Wed_Api_V1_Messaging_MessagingDataClientMetadata.Methods.updatePushMessageLog.path,
      request: request,
      callOptions: callOptions ?? self.defaultCallOptions,
      interceptors: self.interceptors?.makeUpdatePushMessageLogInterceptors() ?? []
    )
  }
}

#if compiler(>=5.6)
@available(*, deprecated)
extension Dta_Wed_Api_V1_Messaging_MessagingDataClient: @unchecked Sendable {}
#endif // compiler(>=5.6)

@available(*, deprecated, renamed: "Dta_Wed_Api_V1_Messaging_MessagingDataNIOClient")
internal final class Dta_Wed_Api_V1_Messaging_MessagingDataClient: Dta_Wed_Api_V1_Messaging_MessagingDataClientProtocol {
  private let lock = Lock()
  private var _defaultCallOptions: CallOptions
  private var _interceptors: Dta_Wed_Api_V1_Messaging_MessagingDataClientInterceptorFactoryProtocol?
  internal let channel: GRPCChannel
  internal var defaultCallOptions: CallOptions {
    get { self.lock.withLock { return self._defaultCallOptions } }
    set { self.lock.withLockVoid { self._defaultCallOptions = newValue } }
  }
  internal var interceptors: Dta_Wed_Api_V1_Messaging_MessagingDataClientInterceptorFactoryProtocol? {
    get { self.lock.withLock { return self._interceptors } }
    set { self.lock.withLockVoid { self._interceptors = newValue } }
  }

  /// Creates a client for the dta.wed.api.v1.messaging.MessagingData service.
  ///
  /// - Parameters:
  ///   - channel: `GRPCChannel` to the service host.
  ///   - defaultCallOptions: Options to use for each service call if the user doesn't provide them.
  ///   - interceptors: A factory providing interceptors for each RPC.
  internal init(
    channel: GRPCChannel,
    defaultCallOptions: CallOptions = CallOptions(),
    interceptors: Dta_Wed_Api_V1_Messaging_MessagingDataClientInterceptorFactoryProtocol? = nil
  ) {
    self.channel = channel
    self._defaultCallOptions = defaultCallOptions
    self._interceptors = interceptors
  }
}

internal struct Dta_Wed_Api_V1_Messaging_MessagingDataNIOClient: Dta_Wed_Api_V1_Messaging_MessagingDataClientProtocol {
  internal var channel: GRPCChannel
  internal var defaultCallOptions: CallOptions
  internal var interceptors: Dta_Wed_Api_V1_Messaging_MessagingDataClientInterceptorFactoryProtocol?

  /// Creates a client for the dta.wed.api.v1.messaging.MessagingData service.
  ///
  /// - Parameters:
  ///   - channel: `GRPCChannel` to the service host.
  ///   - defaultCallOptions: Options to use for each service call if the user doesn't provide them.
  ///   - interceptors: A factory providing interceptors for each RPC.
  internal init(
    channel: GRPCChannel,
    defaultCallOptions: CallOptions = CallOptions(),
    interceptors: Dta_Wed_Api_V1_Messaging_MessagingDataClientInterceptorFactoryProtocol? = nil
  ) {
    self.channel = channel
    self.defaultCallOptions = defaultCallOptions
    self.interceptors = interceptors
  }
}

#if compiler(>=5.6)
@available(macOS 10.15, iOS 13, tvOS 13, watchOS 6, *)
internal protocol Dta_Wed_Api_V1_Messaging_MessagingDataAsyncClientProtocol: GRPCClient {
  static var serviceDescriptor: GRPCServiceDescriptor { get }
  var interceptors: Dta_Wed_Api_V1_Messaging_MessagingDataClientInterceptorFactoryProtocol? { get }

  func makeUpdatePushMessageLogCall(
    _ request: Dta_Wed_Api_V1_Messaging_UpdatePushMessageLogRequest,
    callOptions: CallOptions?
  ) -> GRPCAsyncUnaryCall<Dta_Wed_Api_V1_Messaging_UpdatePushMessageLogRequest, SwiftProtobuf.Google_Protobuf_Empty>
}

@available(macOS 10.15, iOS 13, tvOS 13, watchOS 6, *)
extension Dta_Wed_Api_V1_Messaging_MessagingDataAsyncClientProtocol {
  internal static var serviceDescriptor: GRPCServiceDescriptor {
    return Dta_Wed_Api_V1_Messaging_MessagingDataClientMetadata.serviceDescriptor
  }

  internal var interceptors: Dta_Wed_Api_V1_Messaging_MessagingDataClientInterceptorFactoryProtocol? {
    return nil
  }

  internal func makeUpdatePushMessageLogCall(
    _ request: Dta_Wed_Api_V1_Messaging_UpdatePushMessageLogRequest,
    callOptions: CallOptions? = nil
  ) -> GRPCAsyncUnaryCall<Dta_Wed_Api_V1_Messaging_UpdatePushMessageLogRequest, SwiftProtobuf.Google_Protobuf_Empty> {
    return self.makeAsyncUnaryCall(
      path: Dta_Wed_Api_V1_Messaging_MessagingDataClientMetadata.Methods.updatePushMessageLog.path,
      request: request,
      callOptions: callOptions ?? self.defaultCallOptions,
      interceptors: self.interceptors?.makeUpdatePushMessageLogInterceptors() ?? []
    )
  }
}

@available(macOS 10.15, iOS 13, tvOS 13, watchOS 6, *)
extension Dta_Wed_Api_V1_Messaging_MessagingDataAsyncClientProtocol {
  internal func updatePushMessageLog(
    _ request: Dta_Wed_Api_V1_Messaging_UpdatePushMessageLogRequest,
    callOptions: CallOptions? = nil
  ) async throws -> SwiftProtobuf.Google_Protobuf_Empty {
    return try await self.performAsyncUnaryCall(
      path: Dta_Wed_Api_V1_Messaging_MessagingDataClientMetadata.Methods.updatePushMessageLog.path,
      request: request,
      callOptions: callOptions ?? self.defaultCallOptions,
      interceptors: self.interceptors?.makeUpdatePushMessageLogInterceptors() ?? []
    )
  }
}

@available(macOS 10.15, iOS 13, tvOS 13, watchOS 6, *)
internal struct Dta_Wed_Api_V1_Messaging_MessagingDataAsyncClient: Dta_Wed_Api_V1_Messaging_MessagingDataAsyncClientProtocol {
  internal var channel: GRPCChannel
  internal var defaultCallOptions: CallOptions
  internal var interceptors: Dta_Wed_Api_V1_Messaging_MessagingDataClientInterceptorFactoryProtocol?

  internal init(
    channel: GRPCChannel,
    defaultCallOptions: CallOptions = CallOptions(),
    interceptors: Dta_Wed_Api_V1_Messaging_MessagingDataClientInterceptorFactoryProtocol? = nil
  ) {
    self.channel = channel
    self.defaultCallOptions = defaultCallOptions
    self.interceptors = interceptors
  }
}

#endif // compiler(>=5.6)

internal protocol Dta_Wed_Api_V1_Messaging_MessagingDataClientInterceptorFactoryProtocol: GRPCSendable {

  /// - Returns: Interceptors to use when invoking 'updatePushMessageLog'.
  func makeUpdatePushMessageLogInterceptors() -> [ClientInterceptor<Dta_Wed_Api_V1_Messaging_UpdatePushMessageLogRequest, SwiftProtobuf.Google_Protobuf_Empty>]
}

internal enum Dta_Wed_Api_V1_Messaging_MessagingDataClientMetadata {
  internal static let serviceDescriptor = GRPCServiceDescriptor(
    name: "MessagingData",
    fullName: "dta.wed.api.v1.messaging.MessagingData",
    methods: [
      Dta_Wed_Api_V1_Messaging_MessagingDataClientMetadata.Methods.updatePushMessageLog,
    ]
  )

  internal enum Methods {
    internal static let updatePushMessageLog = GRPCMethodDescriptor(
      name: "UpdatePushMessageLog",
      path: "/dta.wed.api.v1.messaging.MessagingData/UpdatePushMessageLog",
      type: GRPCCallType.unary
    )
  }
}

