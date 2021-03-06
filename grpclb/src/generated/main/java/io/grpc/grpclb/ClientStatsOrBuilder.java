// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: load_balancer.proto

package io.grpc.grpclb;

public interface ClientStatsOrBuilder extends
    // @@protoc_insertion_point(interface_extends:grpc.lb.v1.ClientStats)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * The timestamp of generating the report.
   * </pre>
   *
   * <code>.google.protobuf.Timestamp timestamp = 1;</code>
   */
  boolean hasTimestamp();
  /**
   * <pre>
   * The timestamp of generating the report.
   * </pre>
   *
   * <code>.google.protobuf.Timestamp timestamp = 1;</code>
   */
  com.google.protobuf.Timestamp getTimestamp();
  /**
   * <pre>
   * The timestamp of generating the report.
   * </pre>
   *
   * <code>.google.protobuf.Timestamp timestamp = 1;</code>
   */
  com.google.protobuf.TimestampOrBuilder getTimestampOrBuilder();

  /**
   * <pre>
   * The total number of RPCs that started.
   * </pre>
   *
   * <code>int64 num_calls_started = 2;</code>
   */
  long getNumCallsStarted();

  /**
   * <pre>
   * The total number of RPCs that finished.
   * </pre>
   *
   * <code>int64 num_calls_finished = 3;</code>
   */
  long getNumCallsFinished();

  /**
   * <pre>
   * The total number of RPCs that were dropped by the client because of rate
   * limiting.
   * </pre>
   *
   * <code>int64 num_calls_finished_with_drop_for_rate_limiting = 4;</code>
   */
  long getNumCallsFinishedWithDropForRateLimiting();

  /**
   * <pre>
   * The total number of RPCs that were dropped by the client because of load
   * balancing.
   * </pre>
   *
   * <code>int64 num_calls_finished_with_drop_for_load_balancing = 5;</code>
   */
  long getNumCallsFinishedWithDropForLoadBalancing();

  /**
   * <pre>
   * The total number of RPCs that failed to reach a server except dropped RPCs.
   * </pre>
   *
   * <code>int64 num_calls_finished_with_client_failed_to_send = 6;</code>
   */
  long getNumCallsFinishedWithClientFailedToSend();

  /**
   * <pre>
   * The total number of RPCs that finished and are known to have been received
   * by a server.
   * </pre>
   *
   * <code>int64 num_calls_finished_known_received = 7;</code>
   */
  long getNumCallsFinishedKnownReceived();
}
