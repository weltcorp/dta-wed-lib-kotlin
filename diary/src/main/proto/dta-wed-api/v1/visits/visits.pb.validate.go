// Code generated by protoc-gen-validate. DO NOT EDIT.
// source: dta-wed-api/v1/visits/visits.proto

package visits

import (
	"bytes"
	"errors"
	"fmt"
	"net"
	"net/mail"
	"net/url"
	"regexp"
	"sort"
	"strings"
	"time"
	"unicode/utf8"

	"google.golang.org/protobuf/types/known/anypb"
)

// ensure the imports are used
var (
	_ = bytes.MinRead
	_ = errors.New("")
	_ = fmt.Print
	_ = utf8.UTFMax
	_ = (*regexp.Regexp)(nil)
	_ = (*strings.Reader)(nil)
	_ = net.IPv4len
	_ = time.Duration(0)
	_ = (*url.URL)(nil)
	_ = (*mail.Address)(nil)
	_ = anypb.Any{}
	_ = sort.Sort
)

// Validate checks the field values on GetUserVisitsRequest with the rules
// defined in the proto definition for this message. If any rules are
// violated, the first error encountered is returned, or nil if there are no violations.
func (m *GetUserVisitsRequest) Validate() error {
	return m.validate(false)
}

// ValidateAll checks the field values on GetUserVisitsRequest with the rules
// defined in the proto definition for this message. If any rules are
// violated, the result is a list of violation errors wrapped in
// GetUserVisitsRequestMultiError, or nil if none found.
func (m *GetUserVisitsRequest) ValidateAll() error {
	return m.validate(true)
}

func (m *GetUserVisitsRequest) validate(all bool) error {
	if m == nil {
		return nil
	}

	var errors []error

	if m.GetUserId() <= 0 {
		err := GetUserVisitsRequestValidationError{
			field:  "UserId",
			reason: "value must be greater than 0",
		}
		if !all {
			return err
		}
		errors = append(errors, err)
	}

	if len(errors) > 0 {
		return GetUserVisitsRequestMultiError(errors)
	}

	return nil
}

// GetUserVisitsRequestMultiError is an error wrapping multiple validation
// errors returned by GetUserVisitsRequest.ValidateAll() if the designated
// constraints aren't met.
type GetUserVisitsRequestMultiError []error

// Error returns a concatenation of all the error messages it wraps.
func (m GetUserVisitsRequestMultiError) Error() string {
	var msgs []string
	for _, err := range m {
		msgs = append(msgs, err.Error())
	}
	return strings.Join(msgs, "; ")
}

// AllErrors returns a list of validation violation errors.
func (m GetUserVisitsRequestMultiError) AllErrors() []error { return m }

// GetUserVisitsRequestValidationError is the validation error returned by
// GetUserVisitsRequest.Validate if the designated constraints aren't met.
type GetUserVisitsRequestValidationError struct {
	field  string
	reason string
	cause  error
	key    bool
}

// Field function returns field value.
func (e GetUserVisitsRequestValidationError) Field() string { return e.field }

// Reason function returns reason value.
func (e GetUserVisitsRequestValidationError) Reason() string { return e.reason }

// Cause function returns cause value.
func (e GetUserVisitsRequestValidationError) Cause() error { return e.cause }

// Key function returns key value.
func (e GetUserVisitsRequestValidationError) Key() bool { return e.key }

// ErrorName returns error name.
func (e GetUserVisitsRequestValidationError) ErrorName() string {
	return "GetUserVisitsRequestValidationError"
}

// Error satisfies the builtin error interface
func (e GetUserVisitsRequestValidationError) Error() string {
	cause := ""
	if e.cause != nil {
		cause = fmt.Sprintf(" | caused by: %v", e.cause)
	}

	key := ""
	if e.key {
		key = "key for "
	}

	return fmt.Sprintf(
		"invalid %sGetUserVisitsRequest.%s: %s%s",
		key,
		e.field,
		e.reason,
		cause)
}

var _ error = GetUserVisitsRequestValidationError{}

var _ interface {
	Field() string
	Reason() string
	Key() bool
	Cause() error
	ErrorName() string
} = GetUserVisitsRequestValidationError{}

// Validate checks the field values on GetUserVisitsResponse with the rules
// defined in the proto definition for this message. If any rules are
// violated, the first error encountered is returned, or nil if there are no violations.
func (m *GetUserVisitsResponse) Validate() error {
	return m.validate(false)
}

// ValidateAll checks the field values on GetUserVisitsResponse with the rules
// defined in the proto definition for this message. If any rules are
// violated, the result is a list of violation errors wrapped in
// GetUserVisitsResponseMultiError, or nil if none found.
func (m *GetUserVisitsResponse) ValidateAll() error {
	return m.validate(true)
}

func (m *GetUserVisitsResponse) validate(all bool) error {
	if m == nil {
		return nil
	}

	var errors []error

	for idx, item := range m.GetData() {
		_, _ = idx, item

		if all {
			switch v := interface{}(item).(type) {
			case interface{ ValidateAll() error }:
				if err := v.ValidateAll(); err != nil {
					errors = append(errors, GetUserVisitsResponseValidationError{
						field:  fmt.Sprintf("Data[%v]", idx),
						reason: "embedded message failed validation",
						cause:  err,
					})
				}
			case interface{ Validate() error }:
				if err := v.Validate(); err != nil {
					errors = append(errors, GetUserVisitsResponseValidationError{
						field:  fmt.Sprintf("Data[%v]", idx),
						reason: "embedded message failed validation",
						cause:  err,
					})
				}
			}
		} else if v, ok := interface{}(item).(interface{ Validate() error }); ok {
			if err := v.Validate(); err != nil {
				return GetUserVisitsResponseValidationError{
					field:  fmt.Sprintf("Data[%v]", idx),
					reason: "embedded message failed validation",
					cause:  err,
				}
			}
		}

	}

	if len(errors) > 0 {
		return GetUserVisitsResponseMultiError(errors)
	}

	return nil
}

// GetUserVisitsResponseMultiError is an error wrapping multiple validation
// errors returned by GetUserVisitsResponse.ValidateAll() if the designated
// constraints aren't met.
type GetUserVisitsResponseMultiError []error

// Error returns a concatenation of all the error messages it wraps.
func (m GetUserVisitsResponseMultiError) Error() string {
	var msgs []string
	for _, err := range m {
		msgs = append(msgs, err.Error())
	}
	return strings.Join(msgs, "; ")
}

// AllErrors returns a list of validation violation errors.
func (m GetUserVisitsResponseMultiError) AllErrors() []error { return m }

// GetUserVisitsResponseValidationError is the validation error returned by
// GetUserVisitsResponse.Validate if the designated constraints aren't met.
type GetUserVisitsResponseValidationError struct {
	field  string
	reason string
	cause  error
	key    bool
}

// Field function returns field value.
func (e GetUserVisitsResponseValidationError) Field() string { return e.field }

// Reason function returns reason value.
func (e GetUserVisitsResponseValidationError) Reason() string { return e.reason }

// Cause function returns cause value.
func (e GetUserVisitsResponseValidationError) Cause() error { return e.cause }

// Key function returns key value.
func (e GetUserVisitsResponseValidationError) Key() bool { return e.key }

// ErrorName returns error name.
func (e GetUserVisitsResponseValidationError) ErrorName() string {
	return "GetUserVisitsResponseValidationError"
}

// Error satisfies the builtin error interface
func (e GetUserVisitsResponseValidationError) Error() string {
	cause := ""
	if e.cause != nil {
		cause = fmt.Sprintf(" | caused by: %v", e.cause)
	}

	key := ""
	if e.key {
		key = "key for "
	}

	return fmt.Sprintf(
		"invalid %sGetUserVisitsResponse.%s: %s%s",
		key,
		e.field,
		e.reason,
		cause)
}

var _ error = GetUserVisitsResponseValidationError{}

var _ interface {
	Field() string
	Reason() string
	Key() bool
	Cause() error
	ErrorName() string
} = GetUserVisitsResponseValidationError{}

// Validate checks the field values on UpsertUserVisitRequest with the rules
// defined in the proto definition for this message. If any rules are
// violated, the first error encountered is returned, or nil if there are no violations.
func (m *UpsertUserVisitRequest) Validate() error {
	return m.validate(false)
}

// ValidateAll checks the field values on UpsertUserVisitRequest with the rules
// defined in the proto definition for this message. If any rules are
// violated, the result is a list of violation errors wrapped in
// UpsertUserVisitRequestMultiError, or nil if none found.
func (m *UpsertUserVisitRequest) ValidateAll() error {
	return m.validate(true)
}

func (m *UpsertUserVisitRequest) validate(all bool) error {
	if m == nil {
		return nil
	}

	var errors []error

	if m.GetUserId() <= 0 {
		err := UpsertUserVisitRequestValidationError{
			field:  "UserId",
			reason: "value must be greater than 0",
		}
		if !all {
			return err
		}
		errors = append(errors, err)
	}

	// no validation rules for AuthorAccountId

	if m.GetVisitId() <= 0 {
		err := UpsertUserVisitRequestValidationError{
			field:  "VisitId",
			reason: "value must be greater than 0",
		}
		if !all {
			return err
		}
		errors = append(errors, err)
	}

	// no validation rules for Note

	if m.Status != nil {
		// no validation rules for Status
	}

	if len(errors) > 0 {
		return UpsertUserVisitRequestMultiError(errors)
	}

	return nil
}

// UpsertUserVisitRequestMultiError is an error wrapping multiple validation
// errors returned by UpsertUserVisitRequest.ValidateAll() if the designated
// constraints aren't met.
type UpsertUserVisitRequestMultiError []error

// Error returns a concatenation of all the error messages it wraps.
func (m UpsertUserVisitRequestMultiError) Error() string {
	var msgs []string
	for _, err := range m {
		msgs = append(msgs, err.Error())
	}
	return strings.Join(msgs, "; ")
}

// AllErrors returns a list of validation violation errors.
func (m UpsertUserVisitRequestMultiError) AllErrors() []error { return m }

// UpsertUserVisitRequestValidationError is the validation error returned by
// UpsertUserVisitRequest.Validate if the designated constraints aren't met.
type UpsertUserVisitRequestValidationError struct {
	field  string
	reason string
	cause  error
	key    bool
}

// Field function returns field value.
func (e UpsertUserVisitRequestValidationError) Field() string { return e.field }

// Reason function returns reason value.
func (e UpsertUserVisitRequestValidationError) Reason() string { return e.reason }

// Cause function returns cause value.
func (e UpsertUserVisitRequestValidationError) Cause() error { return e.cause }

// Key function returns key value.
func (e UpsertUserVisitRequestValidationError) Key() bool { return e.key }

// ErrorName returns error name.
func (e UpsertUserVisitRequestValidationError) ErrorName() string {
	return "UpsertUserVisitRequestValidationError"
}

// Error satisfies the builtin error interface
func (e UpsertUserVisitRequestValidationError) Error() string {
	cause := ""
	if e.cause != nil {
		cause = fmt.Sprintf(" | caused by: %v", e.cause)
	}

	key := ""
	if e.key {
		key = "key for "
	}

	return fmt.Sprintf(
		"invalid %sUpsertUserVisitRequest.%s: %s%s",
		key,
		e.field,
		e.reason,
		cause)
}

var _ error = UpsertUserVisitRequestValidationError{}

var _ interface {
	Field() string
	Reason() string
	Key() bool
	Cause() error
	ErrorName() string
} = UpsertUserVisitRequestValidationError{}

// Validate checks the field values on GetUserVisitByUserIdAndVisitIdRequest
// with the rules defined in the proto definition for this message. If any
// rules are violated, the first error encountered is returned, or nil if
// there are no violations.
func (m *GetUserVisitByUserIdAndVisitIdRequest) Validate() error {
	return m.validate(false)
}

// ValidateAll checks the field values on GetUserVisitByUserIdAndVisitIdRequest
// with the rules defined in the proto definition for this message. If any
// rules are violated, the result is a list of violation errors wrapped in
// GetUserVisitByUserIdAndVisitIdRequestMultiError, or nil if none found.
func (m *GetUserVisitByUserIdAndVisitIdRequest) ValidateAll() error {
	return m.validate(true)
}

func (m *GetUserVisitByUserIdAndVisitIdRequest) validate(all bool) error {
	if m == nil {
		return nil
	}

	var errors []error

	if m.GetUserId() <= 0 {
		err := GetUserVisitByUserIdAndVisitIdRequestValidationError{
			field:  "UserId",
			reason: "value must be greater than 0",
		}
		if !all {
			return err
		}
		errors = append(errors, err)
	}

	if m.GetVisitId() <= 0 {
		err := GetUserVisitByUserIdAndVisitIdRequestValidationError{
			field:  "VisitId",
			reason: "value must be greater than 0",
		}
		if !all {
			return err
		}
		errors = append(errors, err)
	}

	if len(errors) > 0 {
		return GetUserVisitByUserIdAndVisitIdRequestMultiError(errors)
	}

	return nil
}

// GetUserVisitByUserIdAndVisitIdRequestMultiError is an error wrapping
// multiple validation errors returned by
// GetUserVisitByUserIdAndVisitIdRequest.ValidateAll() if the designated
// constraints aren't met.
type GetUserVisitByUserIdAndVisitIdRequestMultiError []error

// Error returns a concatenation of all the error messages it wraps.
func (m GetUserVisitByUserIdAndVisitIdRequestMultiError) Error() string {
	var msgs []string
	for _, err := range m {
		msgs = append(msgs, err.Error())
	}
	return strings.Join(msgs, "; ")
}

// AllErrors returns a list of validation violation errors.
func (m GetUserVisitByUserIdAndVisitIdRequestMultiError) AllErrors() []error { return m }

// GetUserVisitByUserIdAndVisitIdRequestValidationError is the validation error
// returned by GetUserVisitByUserIdAndVisitIdRequest.Validate if the
// designated constraints aren't met.
type GetUserVisitByUserIdAndVisitIdRequestValidationError struct {
	field  string
	reason string
	cause  error
	key    bool
}

// Field function returns field value.
func (e GetUserVisitByUserIdAndVisitIdRequestValidationError) Field() string { return e.field }

// Reason function returns reason value.
func (e GetUserVisitByUserIdAndVisitIdRequestValidationError) Reason() string { return e.reason }

// Cause function returns cause value.
func (e GetUserVisitByUserIdAndVisitIdRequestValidationError) Cause() error { return e.cause }

// Key function returns key value.
func (e GetUserVisitByUserIdAndVisitIdRequestValidationError) Key() bool { return e.key }

// ErrorName returns error name.
func (e GetUserVisitByUserIdAndVisitIdRequestValidationError) ErrorName() string {
	return "GetUserVisitByUserIdAndVisitIdRequestValidationError"
}

// Error satisfies the builtin error interface
func (e GetUserVisitByUserIdAndVisitIdRequestValidationError) Error() string {
	cause := ""
	if e.cause != nil {
		cause = fmt.Sprintf(" | caused by: %v", e.cause)
	}

	key := ""
	if e.key {
		key = "key for "
	}

	return fmt.Sprintf(
		"invalid %sGetUserVisitByUserIdAndVisitIdRequest.%s: %s%s",
		key,
		e.field,
		e.reason,
		cause)
}

var _ error = GetUserVisitByUserIdAndVisitIdRequestValidationError{}

var _ interface {
	Field() string
	Reason() string
	Key() bool
	Cause() error
	ErrorName() string
} = GetUserVisitByUserIdAndVisitIdRequestValidationError{}

// Validate checks the field values on GetUserVisitByUserIdAndVisitIdResponse
// with the rules defined in the proto definition for this message. If any
// rules are violated, the first error encountered is returned, or nil if
// there are no violations.
func (m *GetUserVisitByUserIdAndVisitIdResponse) Validate() error {
	return m.validate(false)
}

// ValidateAll checks the field values on
// GetUserVisitByUserIdAndVisitIdResponse with the rules defined in the proto
// definition for this message. If any rules are violated, the result is a
// list of violation errors wrapped in
// GetUserVisitByUserIdAndVisitIdResponseMultiError, or nil if none found.
func (m *GetUserVisitByUserIdAndVisitIdResponse) ValidateAll() error {
	return m.validate(true)
}

func (m *GetUserVisitByUserIdAndVisitIdResponse) validate(all bool) error {
	if m == nil {
		return nil
	}

	var errors []error

	// no validation rules for UserId

	// no validation rules for VisitId

	// no validation rules for VisitAt

	// no validation rules for RemainingDays

	// no validation rules for Note

	// no validation rules for NoteCreatedAt

	// no validation rules for NoteUpdatedAt

	if len(errors) > 0 {
		return GetUserVisitByUserIdAndVisitIdResponseMultiError(errors)
	}

	return nil
}

// GetUserVisitByUserIdAndVisitIdResponseMultiError is an error wrapping
// multiple validation errors returned by
// GetUserVisitByUserIdAndVisitIdResponse.ValidateAll() if the designated
// constraints aren't met.
type GetUserVisitByUserIdAndVisitIdResponseMultiError []error

// Error returns a concatenation of all the error messages it wraps.
func (m GetUserVisitByUserIdAndVisitIdResponseMultiError) Error() string {
	var msgs []string
	for _, err := range m {
		msgs = append(msgs, err.Error())
	}
	return strings.Join(msgs, "; ")
}

// AllErrors returns a list of validation violation errors.
func (m GetUserVisitByUserIdAndVisitIdResponseMultiError) AllErrors() []error { return m }

// GetUserVisitByUserIdAndVisitIdResponseValidationError is the validation
// error returned by GetUserVisitByUserIdAndVisitIdResponse.Validate if the
// designated constraints aren't met.
type GetUserVisitByUserIdAndVisitIdResponseValidationError struct {
	field  string
	reason string
	cause  error
	key    bool
}

// Field function returns field value.
func (e GetUserVisitByUserIdAndVisitIdResponseValidationError) Field() string { return e.field }

// Reason function returns reason value.
func (e GetUserVisitByUserIdAndVisitIdResponseValidationError) Reason() string { return e.reason }

// Cause function returns cause value.
func (e GetUserVisitByUserIdAndVisitIdResponseValidationError) Cause() error { return e.cause }

// Key function returns key value.
func (e GetUserVisitByUserIdAndVisitIdResponseValidationError) Key() bool { return e.key }

// ErrorName returns error name.
func (e GetUserVisitByUserIdAndVisitIdResponseValidationError) ErrorName() string {
	return "GetUserVisitByUserIdAndVisitIdResponseValidationError"
}

// Error satisfies the builtin error interface
func (e GetUserVisitByUserIdAndVisitIdResponseValidationError) Error() string {
	cause := ""
	if e.cause != nil {
		cause = fmt.Sprintf(" | caused by: %v", e.cause)
	}

	key := ""
	if e.key {
		key = "key for "
	}

	return fmt.Sprintf(
		"invalid %sGetUserVisitByUserIdAndVisitIdResponse.%s: %s%s",
		key,
		e.field,
		e.reason,
		cause)
}

var _ error = GetUserVisitByUserIdAndVisitIdResponseValidationError{}

var _ interface {
	Field() string
	Reason() string
	Key() bool
	Cause() error
	ErrorName() string
} = GetUserVisitByUserIdAndVisitIdResponseValidationError{}

// Validate checks the field values on GetUserVisitsResponse_Data with the
// rules defined in the proto definition for this message. If any rules are
// violated, the first error encountered is returned, or nil if there are no violations.
func (m *GetUserVisitsResponse_Data) Validate() error {
	return m.validate(false)
}

// ValidateAll checks the field values on GetUserVisitsResponse_Data with the
// rules defined in the proto definition for this message. If any rules are
// violated, the result is a list of violation errors wrapped in
// GetUserVisitsResponse_DataMultiError, or nil if none found.
func (m *GetUserVisitsResponse_Data) ValidateAll() error {
	return m.validate(true)
}

func (m *GetUserVisitsResponse_Data) validate(all bool) error {
	if m == nil {
		return nil
	}

	var errors []error

	// no validation rules for UserId

	// no validation rules for VisitId

	// no validation rules for VisitAt

	// no validation rules for RemainingDays

	// no validation rules for Note

	// no validation rules for NoteCreatedAt

	// no validation rules for NoteUpdatedAt

	// no validation rules for Status

	if len(errors) > 0 {
		return GetUserVisitsResponse_DataMultiError(errors)
	}

	return nil
}

// GetUserVisitsResponse_DataMultiError is an error wrapping multiple
// validation errors returned by GetUserVisitsResponse_Data.ValidateAll() if
// the designated constraints aren't met.
type GetUserVisitsResponse_DataMultiError []error

// Error returns a concatenation of all the error messages it wraps.
func (m GetUserVisitsResponse_DataMultiError) Error() string {
	var msgs []string
	for _, err := range m {
		msgs = append(msgs, err.Error())
	}
	return strings.Join(msgs, "; ")
}

// AllErrors returns a list of validation violation errors.
func (m GetUserVisitsResponse_DataMultiError) AllErrors() []error { return m }

// GetUserVisitsResponse_DataValidationError is the validation error returned
// by GetUserVisitsResponse_Data.Validate if the designated constraints aren't met.
type GetUserVisitsResponse_DataValidationError struct {
	field  string
	reason string
	cause  error
	key    bool
}

// Field function returns field value.
func (e GetUserVisitsResponse_DataValidationError) Field() string { return e.field }

// Reason function returns reason value.
func (e GetUserVisitsResponse_DataValidationError) Reason() string { return e.reason }

// Cause function returns cause value.
func (e GetUserVisitsResponse_DataValidationError) Cause() error { return e.cause }

// Key function returns key value.
func (e GetUserVisitsResponse_DataValidationError) Key() bool { return e.key }

// ErrorName returns error name.
func (e GetUserVisitsResponse_DataValidationError) ErrorName() string {
	return "GetUserVisitsResponse_DataValidationError"
}

// Error satisfies the builtin error interface
func (e GetUserVisitsResponse_DataValidationError) Error() string {
	cause := ""
	if e.cause != nil {
		cause = fmt.Sprintf(" | caused by: %v", e.cause)
	}

	key := ""
	if e.key {
		key = "key for "
	}

	return fmt.Sprintf(
		"invalid %sGetUserVisitsResponse_Data.%s: %s%s",
		key,
		e.field,
		e.reason,
		cause)
}

var _ error = GetUserVisitsResponse_DataValidationError{}

var _ interface {
	Field() string
	Reason() string
	Key() bool
	Cause() error
	ErrorName() string
} = GetUserVisitsResponse_DataValidationError{}
