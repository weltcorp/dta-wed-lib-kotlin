// DO NOT EDIT.
// swift-format-ignore-file
//
// Generated by the Swift generator plugin for the protocol buffer compiler.
// Source: dta-wed-api/v1/configs/configs.proto
//
// For information on using the generated types, please see the documentation:
//   https://github.com/apple/swift-protobuf/

import Foundation
import SwiftProtobuf

// If the compiler emits an error on this type, it is because this file
// was generated by a version of the `protoc` Swift plug-in that is
// incompatible with the version of SwiftProtobuf to which you are linking.
// Please ensure that you are building against the same version of the API
// that was used to generate this file.
fileprivate struct _GeneratedWithProtocGenSwiftVersion: SwiftProtobuf.ProtobufAPIVersionCheck {
  struct _2: SwiftProtobuf.ProtobufAPIVersion_2 {}
  typealias Version = _2
}

public struct Dta_Wed_Api_V1_Configs_CreateUserDbmPermissionLogRequest {
  // SwiftProtobuf.Message conformance is added in an extension below. See the
  // `Message` and `Message+*Additions` files in the SwiftProtobuf library for
  // methods supported on all messages.

  public var userID: Int32 = 0

  public var deviceName: String = String()

  public var platform: String = String()

  public var permissions: SwiftProtobuf.Google_Protobuf_Struct {
    get {return _permissions ?? SwiftProtobuf.Google_Protobuf_Struct()}
    set {_permissions = newValue}
  }
  /// Returns true if `permissions` has been explicitly set.
  public var hasPermissions: Bool {return self._permissions != nil}
  /// Clears the value of `permissions`. Subsequent reads from it will return its default value.
  public mutating func clearPermissions() {self._permissions = nil}

  public var unknownFields = SwiftProtobuf.UnknownStorage()

  public init() {}

  fileprivate var _permissions: SwiftProtobuf.Google_Protobuf_Struct? = nil
}

public struct Dta_Wed_Api_V1_Configs_UpsertUserConfigRequest {
  // SwiftProtobuf.Message conformance is added in an extension below. See the
  // `Message` and `Message+*Additions` files in the SwiftProtobuf library for
  // methods supported on all messages.

  public var userID: Int32 = 0

  public var inAppPushNotification: Bool {
    get {return _inAppPushNotification ?? false}
    set {_inAppPushNotification = newValue}
  }
  /// Returns true if `inAppPushNotification` has been explicitly set.
  public var hasInAppPushNotification: Bool {return self._inAppPushNotification != nil}
  /// Clears the value of `inAppPushNotification`. Subsequent reads from it will return its default value.
  public mutating func clearInAppPushNotification() {self._inAppPushNotification = nil}

  public var appPushNotification: Bool {
    get {return _appPushNotification ?? false}
    set {_appPushNotification = newValue}
  }
  /// Returns true if `appPushNotification` has been explicitly set.
  public var hasAppPushNotification: Bool {return self._appPushNotification != nil}
  /// Clears the value of `appPushNotification`. Subsequent reads from it will return its default value.
  public mutating func clearAppPushNotification() {self._appPushNotification = nil}

  public var platform: String {
    get {return _platform ?? String()}
    set {_platform = newValue}
  }
  /// Returns true if `platform` has been explicitly set.
  public var hasPlatform: Bool {return self._platform != nil}
  /// Clears the value of `platform`. Subsequent reads from it will return its default value.
  public mutating func clearPlatform() {self._platform = nil}

  public var deviceName: String {
    get {return _deviceName ?? String()}
    set {_deviceName = newValue}
  }
  /// Returns true if `deviceName` has been explicitly set.
  public var hasDeviceName: Bool {return self._deviceName != nil}
  /// Clears the value of `deviceName`. Subsequent reads from it will return its default value.
  public mutating func clearDeviceName() {self._deviceName = nil}

  public var osVersion: String {
    get {return _osVersion ?? String()}
    set {_osVersion = newValue}
  }
  /// Returns true if `osVersion` has been explicitly set.
  public var hasOsVersion: Bool {return self._osVersion != nil}
  /// Clears the value of `osVersion`. Subsequent reads from it will return its default value.
  public mutating func clearOsVersion() {self._osVersion = nil}

  public var appVersion: String {
    get {return _appVersion ?? String()}
    set {_appVersion = newValue}
  }
  /// Returns true if `appVersion` has been explicitly set.
  public var hasAppVersion: Bool {return self._appVersion != nil}
  /// Clears the value of `appVersion`. Subsequent reads from it will return its default value.
  public mutating func clearAppVersion() {self._appVersion = nil}

  public var webAppVersion: String {
    get {return _webAppVersion ?? String()}
    set {_webAppVersion = newValue}
  }
  /// Returns true if `webAppVersion` has been explicitly set.
  public var hasWebAppVersion: Bool {return self._webAppVersion != nil}
  /// Clears the value of `webAppVersion`. Subsequent reads from it will return its default value.
  public mutating func clearWebAppVersion() {self._webAppVersion = nil}

  public var unknownFields = SwiftProtobuf.UnknownStorage()

  public init() {}

  fileprivate var _inAppPushNotification: Bool? = nil
  fileprivate var _appPushNotification: Bool? = nil
  fileprivate var _platform: String? = nil
  fileprivate var _deviceName: String? = nil
  fileprivate var _osVersion: String? = nil
  fileprivate var _appVersion: String? = nil
  fileprivate var _webAppVersion: String? = nil
}

public struct Dta_Wed_Api_V1_Configs_GetUserConfigPushNotificationRequest {
  // SwiftProtobuf.Message conformance is added in an extension below. See the
  // `Message` and `Message+*Additions` files in the SwiftProtobuf library for
  // methods supported on all messages.

  public var userID: Int32 = 0

  public var unknownFields = SwiftProtobuf.UnknownStorage()

  public init() {}
}

public struct Dta_Wed_Api_V1_Configs_GetUserConfigPushNotificationResponse {
  // SwiftProtobuf.Message conformance is added in an extension below. See the
  // `Message` and `Message+*Additions` files in the SwiftProtobuf library for
  // methods supported on all messages.

  public var userID: Int32 = 0

  public var inAppPushNotification: Bool = false

  public var unknownFields = SwiftProtobuf.UnknownStorage()

  public init() {}
}

public struct Dta_Wed_Api_V1_Configs_UpsertUserFcmTokenRequest {
  // SwiftProtobuf.Message conformance is added in an extension below. See the
  // `Message` and `Message+*Additions` files in the SwiftProtobuf library for
  // methods supported on all messages.

  public var userID: Int32 = 0

  public var os: String = String()

  public var fcmToken: String = String()

  public var unknownFields = SwiftProtobuf.UnknownStorage()

  public init() {}
}

public struct Dta_Wed_Api_V1_Configs_CreateIssueAndEmailAssigneeRequest {
  // SwiftProtobuf.Message conformance is added in an extension below. See the
  // `Message` and `Message+*Additions` files in the SwiftProtobuf library for
  // methods supported on all messages.

  public var userID: Int32 = 0

  public var subject: String = String()

  public var content: String = String()

  public var unknownFields = SwiftProtobuf.UnknownStorage()

  public init() {}
}

public struct Dta_Wed_Api_V1_Configs_GetUserFcmTokenRequest {
  // SwiftProtobuf.Message conformance is added in an extension below. See the
  // `Message` and `Message+*Additions` files in the SwiftProtobuf library for
  // methods supported on all messages.

  public var userID: Int32 = 0

  public var unknownFields = SwiftProtobuf.UnknownStorage()

  public init() {}
}

public struct Dta_Wed_Api_V1_Configs_GetUserFcmTokenResponse {
  // SwiftProtobuf.Message conformance is added in an extension below. See the
  // `Message` and `Message+*Additions` files in the SwiftProtobuf library for
  // methods supported on all messages.

  public var userID: Int32 = 0

  public var os: String = String()

  public var fcmToken: String = String()

  public var unknownFields = SwiftProtobuf.UnknownStorage()

  public init() {}
}

#if swift(>=5.5) && canImport(_Concurrency)
extension Dta_Wed_Api_V1_Configs_CreateUserDbmPermissionLogRequest: @unchecked Sendable {}
extension Dta_Wed_Api_V1_Configs_UpsertUserConfigRequest: @unchecked Sendable {}
extension Dta_Wed_Api_V1_Configs_GetUserConfigPushNotificationRequest: @unchecked Sendable {}
extension Dta_Wed_Api_V1_Configs_GetUserConfigPushNotificationResponse: @unchecked Sendable {}
extension Dta_Wed_Api_V1_Configs_UpsertUserFcmTokenRequest: @unchecked Sendable {}
extension Dta_Wed_Api_V1_Configs_CreateIssueAndEmailAssigneeRequest: @unchecked Sendable {}
extension Dta_Wed_Api_V1_Configs_GetUserFcmTokenRequest: @unchecked Sendable {}
extension Dta_Wed_Api_V1_Configs_GetUserFcmTokenResponse: @unchecked Sendable {}
#endif  // swift(>=5.5) && canImport(_Concurrency)

// MARK: - Code below here is support for the SwiftProtobuf runtime.

fileprivate let _protobuf_package = "dta.wed.api.v1.configs"

extension Dta_Wed_Api_V1_Configs_CreateUserDbmPermissionLogRequest: SwiftProtobuf.Message, SwiftProtobuf._MessageImplementationBase, SwiftProtobuf._ProtoNameProviding {
  public static let protoMessageName: String = _protobuf_package + ".CreateUserDbmPermissionLogRequest"
  public static let _protobuf_nameMap: SwiftProtobuf._NameMap = [
    1: .same(proto: "userId"),
    2: .same(proto: "deviceName"),
    3: .same(proto: "platform"),
    4: .same(proto: "permissions"),
  ]

  public mutating func decodeMessage<D: SwiftProtobuf.Decoder>(decoder: inout D) throws {
    while let fieldNumber = try decoder.nextFieldNumber() {
      // The use of inline closures is to circumvent an issue where the compiler
      // allocates stack space for every case branch when no optimizations are
      // enabled. https://github.com/apple/swift-protobuf/issues/1034
      switch fieldNumber {
      case 1: try { try decoder.decodeSingularInt32Field(value: &self.userID) }()
      case 2: try { try decoder.decodeSingularStringField(value: &self.deviceName) }()
      case 3: try { try decoder.decodeSingularStringField(value: &self.platform) }()
      case 4: try { try decoder.decodeSingularMessageField(value: &self._permissions) }()
      default: break
      }
    }
  }

  public func traverse<V: SwiftProtobuf.Visitor>(visitor: inout V) throws {
    // The use of inline closures is to circumvent an issue where the compiler
    // allocates stack space for every if/case branch local when no optimizations
    // are enabled. https://github.com/apple/swift-protobuf/issues/1034 and
    // https://github.com/apple/swift-protobuf/issues/1182
    if self.userID != 0 {
      try visitor.visitSingularInt32Field(value: self.userID, fieldNumber: 1)
    }
    if !self.deviceName.isEmpty {
      try visitor.visitSingularStringField(value: self.deviceName, fieldNumber: 2)
    }
    if !self.platform.isEmpty {
      try visitor.visitSingularStringField(value: self.platform, fieldNumber: 3)
    }
    try { if let v = self._permissions {
      try visitor.visitSingularMessageField(value: v, fieldNumber: 4)
    } }()
    try unknownFields.traverse(visitor: &visitor)
  }

  public static func ==(lhs: Dta_Wed_Api_V1_Configs_CreateUserDbmPermissionLogRequest, rhs: Dta_Wed_Api_V1_Configs_CreateUserDbmPermissionLogRequest) -> Bool {
    if lhs.userID != rhs.userID {return false}
    if lhs.deviceName != rhs.deviceName {return false}
    if lhs.platform != rhs.platform {return false}
    if lhs._permissions != rhs._permissions {return false}
    if lhs.unknownFields != rhs.unknownFields {return false}
    return true
  }
}

extension Dta_Wed_Api_V1_Configs_UpsertUserConfigRequest: SwiftProtobuf.Message, SwiftProtobuf._MessageImplementationBase, SwiftProtobuf._ProtoNameProviding {
  public static let protoMessageName: String = _protobuf_package + ".UpsertUserConfigRequest"
  public static let _protobuf_nameMap: SwiftProtobuf._NameMap = [
    1: .same(proto: "userId"),
    2: .same(proto: "inAppPushNotification"),
    3: .same(proto: "appPushNotification"),
    4: .same(proto: "platform"),
    5: .same(proto: "deviceName"),
    6: .same(proto: "osVersion"),
    7: .same(proto: "appVersion"),
    8: .same(proto: "webAppVersion"),
  ]

  public mutating func decodeMessage<D: SwiftProtobuf.Decoder>(decoder: inout D) throws {
    while let fieldNumber = try decoder.nextFieldNumber() {
      // The use of inline closures is to circumvent an issue where the compiler
      // allocates stack space for every case branch when no optimizations are
      // enabled. https://github.com/apple/swift-protobuf/issues/1034
      switch fieldNumber {
      case 1: try { try decoder.decodeSingularInt32Field(value: &self.userID) }()
      case 2: try { try decoder.decodeSingularBoolField(value: &self._inAppPushNotification) }()
      case 3: try { try decoder.decodeSingularBoolField(value: &self._appPushNotification) }()
      case 4: try { try decoder.decodeSingularStringField(value: &self._platform) }()
      case 5: try { try decoder.decodeSingularStringField(value: &self._deviceName) }()
      case 6: try { try decoder.decodeSingularStringField(value: &self._osVersion) }()
      case 7: try { try decoder.decodeSingularStringField(value: &self._appVersion) }()
      case 8: try { try decoder.decodeSingularStringField(value: &self._webAppVersion) }()
      default: break
      }
    }
  }

  public func traverse<V: SwiftProtobuf.Visitor>(visitor: inout V) throws {
    // The use of inline closures is to circumvent an issue where the compiler
    // allocates stack space for every if/case branch local when no optimizations
    // are enabled. https://github.com/apple/swift-protobuf/issues/1034 and
    // https://github.com/apple/swift-protobuf/issues/1182
    if self.userID != 0 {
      try visitor.visitSingularInt32Field(value: self.userID, fieldNumber: 1)
    }
    try { if let v = self._inAppPushNotification {
      try visitor.visitSingularBoolField(value: v, fieldNumber: 2)
    } }()
    try { if let v = self._appPushNotification {
      try visitor.visitSingularBoolField(value: v, fieldNumber: 3)
    } }()
    try { if let v = self._platform {
      try visitor.visitSingularStringField(value: v, fieldNumber: 4)
    } }()
    try { if let v = self._deviceName {
      try visitor.visitSingularStringField(value: v, fieldNumber: 5)
    } }()
    try { if let v = self._osVersion {
      try visitor.visitSingularStringField(value: v, fieldNumber: 6)
    } }()
    try { if let v = self._appVersion {
      try visitor.visitSingularStringField(value: v, fieldNumber: 7)
    } }()
    try { if let v = self._webAppVersion {
      try visitor.visitSingularStringField(value: v, fieldNumber: 8)
    } }()
    try unknownFields.traverse(visitor: &visitor)
  }

  public static func ==(lhs: Dta_Wed_Api_V1_Configs_UpsertUserConfigRequest, rhs: Dta_Wed_Api_V1_Configs_UpsertUserConfigRequest) -> Bool {
    if lhs.userID != rhs.userID {return false}
    if lhs._inAppPushNotification != rhs._inAppPushNotification {return false}
    if lhs._appPushNotification != rhs._appPushNotification {return false}
    if lhs._platform != rhs._platform {return false}
    if lhs._deviceName != rhs._deviceName {return false}
    if lhs._osVersion != rhs._osVersion {return false}
    if lhs._appVersion != rhs._appVersion {return false}
    if lhs._webAppVersion != rhs._webAppVersion {return false}
    if lhs.unknownFields != rhs.unknownFields {return false}
    return true
  }
}

extension Dta_Wed_Api_V1_Configs_GetUserConfigPushNotificationRequest: SwiftProtobuf.Message, SwiftProtobuf._MessageImplementationBase, SwiftProtobuf._ProtoNameProviding {
  public static let protoMessageName: String = _protobuf_package + ".GetUserConfigPushNotificationRequest"
  public static let _protobuf_nameMap: SwiftProtobuf._NameMap = [
    1: .same(proto: "userId"),
  ]

  public mutating func decodeMessage<D: SwiftProtobuf.Decoder>(decoder: inout D) throws {
    while let fieldNumber = try decoder.nextFieldNumber() {
      // The use of inline closures is to circumvent an issue where the compiler
      // allocates stack space for every case branch when no optimizations are
      // enabled. https://github.com/apple/swift-protobuf/issues/1034
      switch fieldNumber {
      case 1: try { try decoder.decodeSingularInt32Field(value: &self.userID) }()
      default: break
      }
    }
  }

  public func traverse<V: SwiftProtobuf.Visitor>(visitor: inout V) throws {
    if self.userID != 0 {
      try visitor.visitSingularInt32Field(value: self.userID, fieldNumber: 1)
    }
    try unknownFields.traverse(visitor: &visitor)
  }

  public static func ==(lhs: Dta_Wed_Api_V1_Configs_GetUserConfigPushNotificationRequest, rhs: Dta_Wed_Api_V1_Configs_GetUserConfigPushNotificationRequest) -> Bool {
    if lhs.userID != rhs.userID {return false}
    if lhs.unknownFields != rhs.unknownFields {return false}
    return true
  }
}

extension Dta_Wed_Api_V1_Configs_GetUserConfigPushNotificationResponse: SwiftProtobuf.Message, SwiftProtobuf._MessageImplementationBase, SwiftProtobuf._ProtoNameProviding {
  public static let protoMessageName: String = _protobuf_package + ".GetUserConfigPushNotificationResponse"
  public static let _protobuf_nameMap: SwiftProtobuf._NameMap = [
    1: .same(proto: "userId"),
    2: .same(proto: "inAppPushNotification"),
  ]

  public mutating func decodeMessage<D: SwiftProtobuf.Decoder>(decoder: inout D) throws {
    while let fieldNumber = try decoder.nextFieldNumber() {
      // The use of inline closures is to circumvent an issue where the compiler
      // allocates stack space for every case branch when no optimizations are
      // enabled. https://github.com/apple/swift-protobuf/issues/1034
      switch fieldNumber {
      case 1: try { try decoder.decodeSingularInt32Field(value: &self.userID) }()
      case 2: try { try decoder.decodeSingularBoolField(value: &self.inAppPushNotification) }()
      default: break
      }
    }
  }

  public func traverse<V: SwiftProtobuf.Visitor>(visitor: inout V) throws {
    if self.userID != 0 {
      try visitor.visitSingularInt32Field(value: self.userID, fieldNumber: 1)
    }
    if self.inAppPushNotification != false {
      try visitor.visitSingularBoolField(value: self.inAppPushNotification, fieldNumber: 2)
    }
    try unknownFields.traverse(visitor: &visitor)
  }

  public static func ==(lhs: Dta_Wed_Api_V1_Configs_GetUserConfigPushNotificationResponse, rhs: Dta_Wed_Api_V1_Configs_GetUserConfigPushNotificationResponse) -> Bool {
    if lhs.userID != rhs.userID {return false}
    if lhs.inAppPushNotification != rhs.inAppPushNotification {return false}
    if lhs.unknownFields != rhs.unknownFields {return false}
    return true
  }
}

extension Dta_Wed_Api_V1_Configs_UpsertUserFcmTokenRequest: SwiftProtobuf.Message, SwiftProtobuf._MessageImplementationBase, SwiftProtobuf._ProtoNameProviding {
  public static let protoMessageName: String = _protobuf_package + ".UpsertUserFcmTokenRequest"
  public static let _protobuf_nameMap: SwiftProtobuf._NameMap = [
    1: .same(proto: "userId"),
    2: .same(proto: "os"),
    3: .same(proto: "fcmToken"),
  ]

  public mutating func decodeMessage<D: SwiftProtobuf.Decoder>(decoder: inout D) throws {
    while let fieldNumber = try decoder.nextFieldNumber() {
      // The use of inline closures is to circumvent an issue where the compiler
      // allocates stack space for every case branch when no optimizations are
      // enabled. https://github.com/apple/swift-protobuf/issues/1034
      switch fieldNumber {
      case 1: try { try decoder.decodeSingularInt32Field(value: &self.userID) }()
      case 2: try { try decoder.decodeSingularStringField(value: &self.os) }()
      case 3: try { try decoder.decodeSingularStringField(value: &self.fcmToken) }()
      default: break
      }
    }
  }

  public func traverse<V: SwiftProtobuf.Visitor>(visitor: inout V) throws {
    if self.userID != 0 {
      try visitor.visitSingularInt32Field(value: self.userID, fieldNumber: 1)
    }
    if !self.os.isEmpty {
      try visitor.visitSingularStringField(value: self.os, fieldNumber: 2)
    }
    if !self.fcmToken.isEmpty {
      try visitor.visitSingularStringField(value: self.fcmToken, fieldNumber: 3)
    }
    try unknownFields.traverse(visitor: &visitor)
  }

  public static func ==(lhs: Dta_Wed_Api_V1_Configs_UpsertUserFcmTokenRequest, rhs: Dta_Wed_Api_V1_Configs_UpsertUserFcmTokenRequest) -> Bool {
    if lhs.userID != rhs.userID {return false}
    if lhs.os != rhs.os {return false}
    if lhs.fcmToken != rhs.fcmToken {return false}
    if lhs.unknownFields != rhs.unknownFields {return false}
    return true
  }
}

extension Dta_Wed_Api_V1_Configs_CreateIssueAndEmailAssigneeRequest: SwiftProtobuf.Message, SwiftProtobuf._MessageImplementationBase, SwiftProtobuf._ProtoNameProviding {
  public static let protoMessageName: String = _protobuf_package + ".CreateIssueAndEmailAssigneeRequest"
  public static let _protobuf_nameMap: SwiftProtobuf._NameMap = [
    1: .same(proto: "userId"),
    2: .same(proto: "subject"),
    3: .same(proto: "content"),
  ]

  public mutating func decodeMessage<D: SwiftProtobuf.Decoder>(decoder: inout D) throws {
    while let fieldNumber = try decoder.nextFieldNumber() {
      // The use of inline closures is to circumvent an issue where the compiler
      // allocates stack space for every case branch when no optimizations are
      // enabled. https://github.com/apple/swift-protobuf/issues/1034
      switch fieldNumber {
      case 1: try { try decoder.decodeSingularInt32Field(value: &self.userID) }()
      case 2: try { try decoder.decodeSingularStringField(value: &self.subject) }()
      case 3: try { try decoder.decodeSingularStringField(value: &self.content) }()
      default: break
      }
    }
  }

  public func traverse<V: SwiftProtobuf.Visitor>(visitor: inout V) throws {
    if self.userID != 0 {
      try visitor.visitSingularInt32Field(value: self.userID, fieldNumber: 1)
    }
    if !self.subject.isEmpty {
      try visitor.visitSingularStringField(value: self.subject, fieldNumber: 2)
    }
    if !self.content.isEmpty {
      try visitor.visitSingularStringField(value: self.content, fieldNumber: 3)
    }
    try unknownFields.traverse(visitor: &visitor)
  }

  public static func ==(lhs: Dta_Wed_Api_V1_Configs_CreateIssueAndEmailAssigneeRequest, rhs: Dta_Wed_Api_V1_Configs_CreateIssueAndEmailAssigneeRequest) -> Bool {
    if lhs.userID != rhs.userID {return false}
    if lhs.subject != rhs.subject {return false}
    if lhs.content != rhs.content {return false}
    if lhs.unknownFields != rhs.unknownFields {return false}
    return true
  }
}

extension Dta_Wed_Api_V1_Configs_GetUserFcmTokenRequest: SwiftProtobuf.Message, SwiftProtobuf._MessageImplementationBase, SwiftProtobuf._ProtoNameProviding {
  public static let protoMessageName: String = _protobuf_package + ".GetUserFcmTokenRequest"
  public static let _protobuf_nameMap: SwiftProtobuf._NameMap = [
    1: .same(proto: "userId"),
  ]

  public mutating func decodeMessage<D: SwiftProtobuf.Decoder>(decoder: inout D) throws {
    while let fieldNumber = try decoder.nextFieldNumber() {
      // The use of inline closures is to circumvent an issue where the compiler
      // allocates stack space for every case branch when no optimizations are
      // enabled. https://github.com/apple/swift-protobuf/issues/1034
      switch fieldNumber {
      case 1: try { try decoder.decodeSingularInt32Field(value: &self.userID) }()
      default: break
      }
    }
  }

  public func traverse<V: SwiftProtobuf.Visitor>(visitor: inout V) throws {
    if self.userID != 0 {
      try visitor.visitSingularInt32Field(value: self.userID, fieldNumber: 1)
    }
    try unknownFields.traverse(visitor: &visitor)
  }

  public static func ==(lhs: Dta_Wed_Api_V1_Configs_GetUserFcmTokenRequest, rhs: Dta_Wed_Api_V1_Configs_GetUserFcmTokenRequest) -> Bool {
    if lhs.userID != rhs.userID {return false}
    if lhs.unknownFields != rhs.unknownFields {return false}
    return true
  }
}

extension Dta_Wed_Api_V1_Configs_GetUserFcmTokenResponse: SwiftProtobuf.Message, SwiftProtobuf._MessageImplementationBase, SwiftProtobuf._ProtoNameProviding {
  public static let protoMessageName: String = _protobuf_package + ".GetUserFcmTokenResponse"
  public static let _protobuf_nameMap: SwiftProtobuf._NameMap = [
    1: .same(proto: "userId"),
    2: .same(proto: "os"),
    3: .same(proto: "fcmToken"),
  ]

  public mutating func decodeMessage<D: SwiftProtobuf.Decoder>(decoder: inout D) throws {
    while let fieldNumber = try decoder.nextFieldNumber() {
      // The use of inline closures is to circumvent an issue where the compiler
      // allocates stack space for every case branch when no optimizations are
      // enabled. https://github.com/apple/swift-protobuf/issues/1034
      switch fieldNumber {
      case 1: try { try decoder.decodeSingularInt32Field(value: &self.userID) }()
      case 2: try { try decoder.decodeSingularStringField(value: &self.os) }()
      case 3: try { try decoder.decodeSingularStringField(value: &self.fcmToken) }()
      default: break
      }
    }
  }

  public func traverse<V: SwiftProtobuf.Visitor>(visitor: inout V) throws {
    if self.userID != 0 {
      try visitor.visitSingularInt32Field(value: self.userID, fieldNumber: 1)
    }
    if !self.os.isEmpty {
      try visitor.visitSingularStringField(value: self.os, fieldNumber: 2)
    }
    if !self.fcmToken.isEmpty {
      try visitor.visitSingularStringField(value: self.fcmToken, fieldNumber: 3)
    }
    try unknownFields.traverse(visitor: &visitor)
  }

  public static func ==(lhs: Dta_Wed_Api_V1_Configs_GetUserFcmTokenResponse, rhs: Dta_Wed_Api_V1_Configs_GetUserFcmTokenResponse) -> Bool {
    if lhs.userID != rhs.userID {return false}
    if lhs.os != rhs.os {return false}
    if lhs.fcmToken != rhs.fcmToken {return false}
    if lhs.unknownFields != rhs.unknownFields {return false}
    return true
  }
}
