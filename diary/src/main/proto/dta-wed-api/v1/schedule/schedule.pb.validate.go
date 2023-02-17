// Code generated by protoc-gen-validate. DO NOT EDIT.
// source: dta-wed-api/v1/schedule/schedule.proto

package schedule

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

// Validate checks the field values on UpsertUserDiaryScheduleRequest with the
// rules defined in the proto definition for this message. If any rules are
// violated, the first error encountered is returned, or nil if there are no violations.
func (m *UpsertUserDiaryScheduleRequest) Validate() error {
	return m.validate(false)
}

// ValidateAll checks the field values on UpsertUserDiaryScheduleRequest with
// the rules defined in the proto definition for this message. If any rules
// are violated, the result is a list of violation errors wrapped in
// UpsertUserDiaryScheduleRequestMultiError, or nil if none found.
func (m *UpsertUserDiaryScheduleRequest) ValidateAll() error {
	return m.validate(true)
}

func (m *UpsertUserDiaryScheduleRequest) validate(all bool) error {
	if m == nil {
		return nil
	}

	var errors []error

	if m.GetDiaryId() <= 0 {
		err := UpsertUserDiaryScheduleRequestValidationError{
			field:  "DiaryId",
			reason: "value must be greater than 0",
		}
		if !all {
			return err
		}
		errors = append(errors, err)
	}

	if m.GetUserId() <= 0 {
		err := UpsertUserDiaryScheduleRequestValidationError{
			field:  "UserId",
			reason: "value must be greater than 0",
		}
		if !all {
			return err
		}
		errors = append(errors, err)
	}

	if m.When != nil {
		// no validation rules for When
	}

	if m.Enabled != nil {
		// no validation rules for Enabled
	}

	if len(errors) > 0 {
		return UpsertUserDiaryScheduleRequestMultiError(errors)
	}

	return nil
}

// UpsertUserDiaryScheduleRequestMultiError is an error wrapping multiple
// validation errors returned by UpsertUserDiaryScheduleRequest.ValidateAll()
// if the designated constraints aren't met.
type UpsertUserDiaryScheduleRequestMultiError []error

// Error returns a concatenation of all the error messages it wraps.
func (m UpsertUserDiaryScheduleRequestMultiError) Error() string {
	var msgs []string
	for _, err := range m {
		msgs = append(msgs, err.Error())
	}
	return strings.Join(msgs, "; ")
}

// AllErrors returns a list of validation violation errors.
func (m UpsertUserDiaryScheduleRequestMultiError) AllErrors() []error { return m }

// UpsertUserDiaryScheduleRequestValidationError is the validation error
// returned by UpsertUserDiaryScheduleRequest.Validate if the designated
// constraints aren't met.
type UpsertUserDiaryScheduleRequestValidationError struct {
	field  string
	reason string
	cause  error
	key    bool
}

// Field function returns field value.
func (e UpsertUserDiaryScheduleRequestValidationError) Field() string { return e.field }

// Reason function returns reason value.
func (e UpsertUserDiaryScheduleRequestValidationError) Reason() string { return e.reason }

// Cause function returns cause value.
func (e UpsertUserDiaryScheduleRequestValidationError) Cause() error { return e.cause }

// Key function returns key value.
func (e UpsertUserDiaryScheduleRequestValidationError) Key() bool { return e.key }

// ErrorName returns error name.
func (e UpsertUserDiaryScheduleRequestValidationError) ErrorName() string {
	return "UpsertUserDiaryScheduleRequestValidationError"
}

// Error satisfies the builtin error interface
func (e UpsertUserDiaryScheduleRequestValidationError) Error() string {
	cause := ""
	if e.cause != nil {
		cause = fmt.Sprintf(" | caused by: %v", e.cause)
	}

	key := ""
	if e.key {
		key = "key for "
	}

	return fmt.Sprintf(
		"invalid %sUpsertUserDiaryScheduleRequest.%s: %s%s",
		key,
		e.field,
		e.reason,
		cause)
}

var _ error = UpsertUserDiaryScheduleRequestValidationError{}

var _ interface {
	Field() string
	Reason() string
	Key() bool
	Cause() error
	ErrorName() string
} = UpsertUserDiaryScheduleRequestValidationError{}

// Validate checks the field values on GetUserScheduleRequest with the rules
// defined in the proto definition for this message. If any rules are
// violated, the first error encountered is returned, or nil if there are no violations.
func (m *GetUserScheduleRequest) Validate() error {
	return m.validate(false)
}

// ValidateAll checks the field values on GetUserScheduleRequest with the rules
// defined in the proto definition for this message. If any rules are
// violated, the result is a list of violation errors wrapped in
// GetUserScheduleRequestMultiError, or nil if none found.
func (m *GetUserScheduleRequest) ValidateAll() error {
	return m.validate(true)
}

func (m *GetUserScheduleRequest) validate(all bool) error {
	if m == nil {
		return nil
	}

	var errors []error

	if m.GetUserId() <= 0 {
		err := GetUserScheduleRequestValidationError{
			field:  "UserId",
			reason: "value must be greater than 0",
		}
		if !all {
			return err
		}
		errors = append(errors, err)
	}

	if len(errors) > 0 {
		return GetUserScheduleRequestMultiError(errors)
	}

	return nil
}

// GetUserScheduleRequestMultiError is an error wrapping multiple validation
// errors returned by GetUserScheduleRequest.ValidateAll() if the designated
// constraints aren't met.
type GetUserScheduleRequestMultiError []error

// Error returns a concatenation of all the error messages it wraps.
func (m GetUserScheduleRequestMultiError) Error() string {
	var msgs []string
	for _, err := range m {
		msgs = append(msgs, err.Error())
	}
	return strings.Join(msgs, "; ")
}

// AllErrors returns a list of validation violation errors.
func (m GetUserScheduleRequestMultiError) AllErrors() []error { return m }

// GetUserScheduleRequestValidationError is the validation error returned by
// GetUserScheduleRequest.Validate if the designated constraints aren't met.
type GetUserScheduleRequestValidationError struct {
	field  string
	reason string
	cause  error
	key    bool
}

// Field function returns field value.
func (e GetUserScheduleRequestValidationError) Field() string { return e.field }

// Reason function returns reason value.
func (e GetUserScheduleRequestValidationError) Reason() string { return e.reason }

// Cause function returns cause value.
func (e GetUserScheduleRequestValidationError) Cause() error { return e.cause }

// Key function returns key value.
func (e GetUserScheduleRequestValidationError) Key() bool { return e.key }

// ErrorName returns error name.
func (e GetUserScheduleRequestValidationError) ErrorName() string {
	return "GetUserScheduleRequestValidationError"
}

// Error satisfies the builtin error interface
func (e GetUserScheduleRequestValidationError) Error() string {
	cause := ""
	if e.cause != nil {
		cause = fmt.Sprintf(" | caused by: %v", e.cause)
	}

	key := ""
	if e.key {
		key = "key for "
	}

	return fmt.Sprintf(
		"invalid %sGetUserScheduleRequest.%s: %s%s",
		key,
		e.field,
		e.reason,
		cause)
}

var _ error = GetUserScheduleRequestValidationError{}

var _ interface {
	Field() string
	Reason() string
	Key() bool
	Cause() error
	ErrorName() string
} = GetUserScheduleRequestValidationError{}

// Validate checks the field values on GetUserScheduleResponse with the rules
// defined in the proto definition for this message. If any rules are
// violated, the first error encountered is returned, or nil if there are no violations.
func (m *GetUserScheduleResponse) Validate() error {
	return m.validate(false)
}

// ValidateAll checks the field values on GetUserScheduleResponse with the
// rules defined in the proto definition for this message. If any rules are
// violated, the result is a list of violation errors wrapped in
// GetUserScheduleResponseMultiError, or nil if none found.
func (m *GetUserScheduleResponse) ValidateAll() error {
	return m.validate(true)
}

func (m *GetUserScheduleResponse) validate(all bool) error {
	if m == nil {
		return nil
	}

	var errors []error

	// no validation rules for Status

	// no validation rules for Date

	// no validation rules for Nth

	// no validation rules for StartDate

	// no validation rules for EndDate

	if len(errors) > 0 {
		return GetUserScheduleResponseMultiError(errors)
	}

	return nil
}

// GetUserScheduleResponseMultiError is an error wrapping multiple validation
// errors returned by GetUserScheduleResponse.ValidateAll() if the designated
// constraints aren't met.
type GetUserScheduleResponseMultiError []error

// Error returns a concatenation of all the error messages it wraps.
func (m GetUserScheduleResponseMultiError) Error() string {
	var msgs []string
	for _, err := range m {
		msgs = append(msgs, err.Error())
	}
	return strings.Join(msgs, "; ")
}

// AllErrors returns a list of validation violation errors.
func (m GetUserScheduleResponseMultiError) AllErrors() []error { return m }

// GetUserScheduleResponseValidationError is the validation error returned by
// GetUserScheduleResponse.Validate if the designated constraints aren't met.
type GetUserScheduleResponseValidationError struct {
	field  string
	reason string
	cause  error
	key    bool
}

// Field function returns field value.
func (e GetUserScheduleResponseValidationError) Field() string { return e.field }

// Reason function returns reason value.
func (e GetUserScheduleResponseValidationError) Reason() string { return e.reason }

// Cause function returns cause value.
func (e GetUserScheduleResponseValidationError) Cause() error { return e.cause }

// Key function returns key value.
func (e GetUserScheduleResponseValidationError) Key() bool { return e.key }

// ErrorName returns error name.
func (e GetUserScheduleResponseValidationError) ErrorName() string {
	return "GetUserScheduleResponseValidationError"
}

// Error satisfies the builtin error interface
func (e GetUserScheduleResponseValidationError) Error() string {
	cause := ""
	if e.cause != nil {
		cause = fmt.Sprintf(" | caused by: %v", e.cause)
	}

	key := ""
	if e.key {
		key = "key for "
	}

	return fmt.Sprintf(
		"invalid %sGetUserScheduleResponse.%s: %s%s",
		key,
		e.field,
		e.reason,
		cause)
}

var _ error = GetUserScheduleResponseValidationError{}

var _ interface {
	Field() string
	Reason() string
	Key() bool
	Cause() error
	ErrorName() string
} = GetUserScheduleResponseValidationError{}
